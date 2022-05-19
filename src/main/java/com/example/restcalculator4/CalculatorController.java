package com.example.restcalculator4;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {

    @RequestMapping("/sum")
    public int sum (@RequestParam int a, @RequestParam int b) { //suche a über Request-Parameter
        return a + b;
    }
    //localhost:8080/sum?a=12354&b=3452 damit es funktioniert
}
