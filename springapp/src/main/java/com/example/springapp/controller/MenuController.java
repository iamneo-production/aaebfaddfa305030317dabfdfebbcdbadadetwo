package com.example.springapp.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.springapp.model.MenuItem;
import com.example.springapp.service.MenuService;


@RestController
public class MenuController {

    @Autowired
    private MenuService menuService;

    @PostMapping("/")
    public ResponseEntity<Boolean> addMenuItem(@RequestBody MenuItem menuItem) {
        boolean success = menuService.addMenuItem(menuItem);
        return ResponseEntity.status(HttpStatus.OK).body(success);
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<Boolean> deleteMenuItem(@PathVariable int id) {
        boolean success = menuService.deleteMenuItem(id);
        return ResponseEntity.status(HttpStatus.OK).body(success);
    }
}
