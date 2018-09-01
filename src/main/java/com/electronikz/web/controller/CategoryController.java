package com.electronikz.web.controller;

import com.electronikz.model.Category;
import com.electronikz.model.PageData;
import com.electronikz.model.Product;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.log4j.Logger;
import org.springframework.beans.support.PagedListHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.net.URL;
import java.util.List;
import java.util.Set;

@Controller
@RequestMapping(value = "/cat")
public class CategoryController {

    private final static Logger logger = Logger.getLogger(CategoryController.class);

    @RequestMapping(value = "/{name}")
    public String product(@PathVariable String name, Model model, HttpServletRequest request) throws Exception{
        String url = "http://159.89.145.24:8080";
        if(request.getRequestURL().toString().contains("localhost")){
            url = "http://localhost:9000";
        }

        ObjectMapper mapper = new ObjectMapper();

        int page = 0;
        if(request.getParameter("page") != null){
            page = Integer.parseInt(request.getParameter("page"));
        }
        PageData pageData = mapper.readValue(new URL(url + "/product/category/" + name + "?page=" + page), PageData.class);
        Set<Product> products = pageData.getContent();

        PageData pageDataCat = mapper.readValue(new URL(url + "/category/first20"), PageData.class);
        Set<Category> categories = pageDataCat.getContent();

        model.addAttribute("products", products);
        model.addAttribute("categories", categories);
        model.addAttribute("activeNav", name);
        model.addAttribute("categoryName", name.replace("+", " "));

        pageData.setCurrentPage(pageData.getCurrentPage() + 1);
        model.addAttribute("page", pageData);

        logger.info("page requested: /cat/" + name);

        return "category";
    }

}
