package one.digitalinovation.personapi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import one.digitalinovation.personapi.model.Carro;

@Controller
public class HomeController {

    @GetMapping("/lista")
    public ModelAndView viewLista(){
        Carro fiatUno = new Carro();
        fiatUno.setMarca("Fiat");
        fiatUno.setModelo("Uno");
        fiatUno.setCor("verde e branco");

        Carro chevette = new Carro();
        chevette.setMarca("Chevrolet");
        chevette.setModelo("Chevette");
        chevette.setCor("Preto");

        ModelAndView carros = new ModelAndView();
        carros.addObject("carro1", fiatUno);
        carros.addObject("carro2", chevette);
        carros.setViewName("carros");

        return carros;
    }
}
