package controllers.contracts;

import models.Usuario;

public interface IUsuarioController {
    
    void cadastrar(Usuario usuario);
    Usuario buscarPorNome(String nome);
    void atualizar(Usuario usuario);
    int teste(int n1);

}
