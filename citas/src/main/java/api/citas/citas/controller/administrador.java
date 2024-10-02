package api.citas.citas.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class administrador {

    @GetMapping("holamundo")
    public String holamundo(){
        System.out.println("Llegamos mi hermano todo bien");
    return "HOla men llegamos todo bin";
    }
}
