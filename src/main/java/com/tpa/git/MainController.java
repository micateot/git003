package com.tpa.git;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @RequestMapping(path = "/metodo1") //cdo yo escriba en el browser la palabra metodo1 se va a ejecutar este metodo y se va aostrar en la pantalla lo del return.
    public String reqMap01(){
        return "metodo1";
    }

    @RequestMapping(path = "/metodo2/{parametro1}")
    public String reqMap02(@PathVariable String parametro1){
        return parametro1;
    }

}
