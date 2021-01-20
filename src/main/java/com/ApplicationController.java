package com;

import com.service.CategoryService;
import com.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ApplicationController {

    public static final String MAIN = "first";
    public static final String ABOUT = "about";
    public static final String DELIVERY = "delivery";
    public static final String CONTACTS = "contacts";
    public static final String PAYMENT = "payment";
    public static final String BASKET = "basket";

    @Autowired
    private ProductService productService;
    @Autowired
    private CategoryService categoryService;

    @GetMapping("/")
    public String main(Model model) {
        model.addAttribute("categories", categoryService.getCategories());
        return MAIN;
    }

    @GetMapping("/about")
    public String about() {
        return ABOUT;
    }

    @GetMapping("/delivery")
    public String delivery() {
        return DELIVERY;
    }

    @GetMapping("/contacts")
    public String getContacts() {
        return CONTACTS;
    }

    @GetMapping("/payment")
    public String getPayment() {
        return PAYMENT;
    }

    @GetMapping("/basket")
    public String getBasket() {
        return BASKET;
    }
}
