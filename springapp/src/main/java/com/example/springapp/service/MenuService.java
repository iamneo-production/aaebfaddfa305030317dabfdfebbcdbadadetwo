package com.example.springapp.service;


import java.util.HashMap;

import java.util.Map;

import org.springframework.stereotype.Service;

import com.example.springapp.model.MenuItem;

@Service
public class MenuService {

    private final Map<Integer, MenuItem> menuItems = new HashMap<>();
    private int nextId = 1;

    
    public boolean addMenuItem(MenuItem menuItem) {
        menuItem.setId(nextId++);
        menuItems.put(menuItem.getId(), menuItem);
        return true;
    }


    public boolean deleteMenuItem(int id) {
        return menuItems.remove(id) != null;
    }
}