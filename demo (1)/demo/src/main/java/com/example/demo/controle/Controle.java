package com.example.demo.controle;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.modelo.Pessoa;

@RestController
public class Controle {
    
    @PostMapping("/pessoa")
    public Pessoa pessoa(@RequestBody Pessoa p) {
        return p;
    }

    @GetMapping("/")
    public String messagem() {
        return "Olá, mundo!";
    }
    
    
    @GetMapping("/boasvindas")
    public String boasVindas() {
        return "Seja bem Vindo(a)";
    }

    @GetMapping("/boasvindas/{nome}")
    public String boasVindas(@PathVariable String nome) {
        return "Seja bem Vindo(a), " + nome + "!";
    }
}

