package br.com.anm.produtos.crud_produtos.servico;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import br.com.anm.produtos.crud_produtos.modelo.ProdutoModelo;
import br.com.anm.produtos.crud_produtos.modelo.RespostaModelo;
import br.com.anm.produtos.crud_produtos.repositorio.ProdutoRepositorio;

@Service
public class ProdutoServico {
   
    @Autowired
    private ProdutoRepositorio pr;

    @Autowired
    private RespostaModelo rm;

    //Listar produtos
    public Iterable<ProdutoModelo> listar(){
        return pr.findAll();
    }

    //Cadastrar produtos
    public ResponseEntity<?> cadastrar(ProdutoModelo pm){
        if(pm.getNome().equals("")){
            rm.setResposta("O nome do produto é obrigatório!");
            return new ResponseEntity<RespostaModelo>(rm,HttpStatus.BAD_REQUEST);
        }else if(pm.getMarca().equals("")){
            rm.setResposta("O nome da marca do produto é obrigratório!");
            return new ResponseEntity<RespostaModelo>(rm,HttpStatus.BAD_REQUEST);
        }else{
            return new ResponseEntity<ProdutoModelo>(pr.save(pm),HttpStatus.CREATED);
        }


    }


}
