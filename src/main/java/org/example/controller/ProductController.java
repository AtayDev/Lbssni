package org.example.controller;

import org.example.beans.Cart;
import org.example.beans.Product;
import org.example.services.ServiceProduct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/products")
public class ProductController {
    @Autowired
    ServiceProduct serviceProduct;
    @RequestMapping("/{id}")
    public String getProduct(@PathVariable Integer id, Model model){
        Product p=serviceProduct.getProductById(id);
        model.addAttribute("product",p);
        model.addAttribute("cart",new Cart());
        return "common/product";


    }
}
