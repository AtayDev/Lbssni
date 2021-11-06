package org.example.controller;

import org.example.beans.Cart;
import org.example.beans.Product;
import org.example.services.ServiceCart;
import org.example.services.ServiceClient;
import org.example.services.ServiceProduct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.security.Principal;
import java.util.List;

@Controller
@RequestMapping("/client")
public class ClientController {
    @Autowired
    ServiceProduct serviceProduct;

    @Autowired
    ServiceClient serviceClient;

    @Autowired
    ServiceCart serviceCart;

    @RequestMapping("/shirts")
    public String getShirts(Model model){
        List<Product> products=serviceProduct.getProductByCategory("shirts");
        model.addAttribute("products",products);
        return "client/shirts";
    }

    @RequestMapping("/checkout")
    public String getCart(HttpServletRequest request, @ModelAttribute Cart cart){
        Principal principal=request.getUserPrincipal();
        String username=principal.getName();
        int client_id=serviceClient.getIdByUsername(username);

        //Set the cart fields then save it to the DB
        cart.setIdClient(client_id);
        serviceCart.addToCart(cart);
        return "client/checkout";
    }
}
