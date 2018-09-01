package com.electronikz.web.controller;

import com.electronikz.model.PageData;
import com.electronikz.model.Product;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.net.URL;
import java.util.List;
import java.util.Set;

@Controller
public class IndexController {

    private static final Logger logger = Logger.getLogger(IndexController.class);

    @RequestMapping(value = "/")
    public String product(Model model, HttpServletRequest request) throws Exception{
        String url = "http://159.89.145.24:8080";
        if(request.getRequestURL().toString().contains("localhost")){
            url = "http://localhost:9000";
        }
        ObjectMapper mapper = new ObjectMapper();
        PageData pageData = mapper.readValue(new URL(url + "/product/top18"), PageData.class);
        Set<Product> products = pageData.getContent();

        model.addAttribute("products", products);
        model.addAttribute("activeNav", "home");

        logger.info("page requested: /");

        return "index";
    }

}
