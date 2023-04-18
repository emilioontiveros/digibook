package com.digitalbooking.Back.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HolaController {
    @RequestMapping("hola")
    public String holaMundo(@RequestParam(value = "nombre",
                            defaultValue = "Mundo") String nombre) {
        return "Hola "+nombre+"!!";
    }
}
