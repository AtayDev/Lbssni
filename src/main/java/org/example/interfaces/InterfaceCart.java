package org.example.interfaces;

import org.example.beans.Cart;

import java.util.List;

public interface InterfaceCart {
    public void addToCart(Cart cart);
    public List<Cart> getItemsInCart(int id);
}
