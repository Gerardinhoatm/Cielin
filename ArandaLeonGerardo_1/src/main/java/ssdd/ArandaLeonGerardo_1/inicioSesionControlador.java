package ssdd.ArandaLeonGerardo_1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class inicioSesionControlador {
    @GetMapping("/Inicio")
    public String InterfazInicio(){
        return "inicioSesion";
    }
    @PostMapping("/Inicio")
    public String irPortada() {
        return "redirect:/Portada";
    }
    @GetMapping("/Portada")
    public String InterfazPortada() {
        return "Portada";
    }

}
