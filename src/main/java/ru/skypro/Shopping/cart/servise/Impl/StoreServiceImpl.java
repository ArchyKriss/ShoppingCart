package ru.skypro.Shopping.cart.servise.Impl;

import org.springframework.stereotype.Service;
import ru.skypro.Shopping.cart.servise.StoreService;


import java.util.List;
import java.util.Set;

@Service
public class StoreServiceImpl implements StoreService {

    private final ShoppingCart shoppingCart;

    public StoreServiceImpl(ShoppingCart shoppingCart){
        this.shoppingCart = shoppingCart;
    }

    @Override
    public Set<Integer> add(List<Integer> goods) {
        return shoppingCart.add(goods);
    }

    @Override
    public Set<Integer> get() {
        return shoppingCart.get();
    }
}
