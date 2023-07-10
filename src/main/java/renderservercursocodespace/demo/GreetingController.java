package renderservercursocodespace.demo;


import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @GetMapping(path = "/")
    public String alumno(){
        return "A1520852  - Christian Pancich ";
    }
    @GetMapping(path = "/idat/codigo")
    public String codigo(){
        return "A1520852";
    }

    @GetMapping(path = "/idat/nombre-completo")
    public String nombre(){
        return "CHRISTIAN PANCICH SALAZAR";
    }

}
