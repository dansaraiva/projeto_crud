package br.com.anm.produtos.crud_produtos.controle;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProdutoControle {
    @GetMapping("/")
    public String rota(){
        return "A API está funcionando!";
    }
}
