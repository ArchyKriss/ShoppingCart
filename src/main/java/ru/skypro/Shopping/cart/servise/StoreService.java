package ru.skypro.Shopping.cart.servise;

import java.util.List;
import java.util.Set;

public interface StoreService {

    Set<Integer> add(List<Integer> goods);

    Set<Integer> get();
}
