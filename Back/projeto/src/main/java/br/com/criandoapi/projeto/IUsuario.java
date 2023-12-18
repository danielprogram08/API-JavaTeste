package br.com.criandoapi.projeto;

import org.springframework.data.repository.CrudRepository;
import br.com.criandoapi.projeto.usuario;

public interface IUsuario extends CrudRepository <usuario, Integer> {}