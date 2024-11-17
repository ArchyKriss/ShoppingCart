package ru.skypro.Shopping.cart.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.skypro.Shopping.cart.servise.StoreService;

import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/store/order")

public class StoreController {

    private final StoreService storeService;


    public StoreController(StoreService storeService) {
        this.storeService = storeService;
    }
    @GetMapping("add")
    public Set<Integer> add(@RequestParam List<Integer> goods){
        return storeService.add(goods);
    }

    @GetMapping("get")
    public Set<Integer> get(){
        return storeService.get();
    }

}
