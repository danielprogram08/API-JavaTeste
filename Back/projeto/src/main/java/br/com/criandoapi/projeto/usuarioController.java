package br.com.criandoapi.projeto;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class usuarioController {
    
    @Autowired
    private IUsuario dao;

    @GetMapping("/usuarios")
    public List<usuario> listaUsuario() {
        return (List<usuario>) dao.findAll();
    }
}
