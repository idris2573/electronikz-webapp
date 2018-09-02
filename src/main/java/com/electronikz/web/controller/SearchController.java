package com.electronikz.web.controller;

import com.electronikz.model.Category;
import com.electronikz.model.PageData;
import com.electronikz.model.Product;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.net.URL;
import java.util.Set;

@Controller
@RequestMapping(value = "/search")
public class SearchController {

    private static final Logger logger = Logger.getLogger(SearchController.class);

    @RequestMapping(value = "/p")
    public String product(Model model, HttpServletRequest request) throws Exception{

        String url = "http://159.89.145.24:9000";
        if(request.getRequestURL().toString().contains("localhost")){
            url = "http://localhost:9000";
        }

        String terms = request.getParameter("s");
        terms = terms.replace(" ","+");

        ObjectMapper mapper = new ObjectMapper();

        int page = 0;
        if(request.getParameter("page") != null){
            page = Integer.parseInt(request.getParameter("page"));
        }
        PageData pageData = mapper.readValue(new URL(url + "/product/search/" + terms + "?page=" + page), PageData.class);
        Set<Product> products = pageData.getContent();

        PageData pageDataCat = mapper.readValue(new URL(url + "/category/categories"), PageData.class);
        Set<Category> categories = pageDataCat.getContent();

        model.addAttribute("products", products);
        model.addAttribute("categories", categories);
        model.addAttribute("terms", terms.replace("+", " "));

        pageData.setCurrentPage(pageData.getCurrentPage() + 1);
        model.addAttribute("page", pageData);

        logger.info("page requested: /search/" + terms);
        return "search";
    }

}
