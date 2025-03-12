package br.com.anm.produtos.crud_produtos.controle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.anm.produtos.crud_produtos.modelo.ProdutoModelo;
import br.com.anm.produtos.crud_produtos.servico.ProdutoServico;

@RestController
public class ProdutoControle {
    //Injeção de dependências
    @Autowired
    private ProdutoServico ps;

    @PostMapping("/cadastrar")
    public ResponseEntity<?> cadastrar(@RequestBody ProdutoModelo pm){
        return ps.cadastrar(pm);
    }


    @GetMapping("/listar")
    public Iterable<ProdutoModelo> listar(){
        return ps.listar();
    }

    @GetMapping("/")
    public String rota(){
        return "A API está funcionando!";
    }
}
