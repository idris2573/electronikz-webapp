package com.electronikz.web.controller;

import com.electronikz.model.Product;
import com.electronikz.model.ProductRelated;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.net.URL;
import java.util.Set;

@Controller
public class ProductController {

    private static final Logger logger = Logger.getLogger(ProductController.class);


    @RequestMapping(value = "/{filename}")
    public String product(@PathVariable String filename, Model model, HttpServletRequest request) throws Exception{
        String url = "http://159.89.145.24:9000";
        if(request.getRequestURL().toString().contains("localhost")){
            url = "http://localhost:9000";
        }
        ObjectMapper mapper = new ObjectMapper();
        ProductRelated productRelated;
        try {
            productRelated  = mapper.readValue(new URL(url + "/product/product-related/" + filename), ProductRelated.class);
        }catch (Exception e){
            return "redirect:/error";
//            return "redirect:/search/p?s=" + filename.replace("-", "+");
        }
        Product product = productRelated.getProduct();
        Set<Product> relatedProducts = productRelated.getRelated();

        model.addAttribute("product", product);
        model.addAttribute("relatedProducts", relatedProducts);

        logger.info("page requested: /" + filename);

        return "product";
    }

}
