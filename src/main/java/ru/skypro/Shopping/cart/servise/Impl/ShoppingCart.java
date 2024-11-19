package ru.skypro.Shopping.cart.servise.Impl;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.*;

@Component
@SessionScope
public class ShoppingCart {

    private final Set<Integer> goods = new HashSet<>();

    public Set<Integer> add(List<Integer> goods){
        this.goods.addAll(goods);
        return get();
    }

    public Set<Integer> get(){
        return Collections.unmodifiableSet(goods);
    }
}
