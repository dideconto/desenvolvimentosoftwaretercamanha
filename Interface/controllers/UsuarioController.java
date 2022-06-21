package controllers;

import java.util.ArrayList;

import controllers.contracts.IUsuarioController;
import models.Usuario;

public class UsuarioController implements IUsuarioController{

    private static ArrayList<Usuario> usuarios = new ArrayList<Usuario>();

    @Override
    public void cadastrar(Usuario usuario) {
        usuarios.add(usuario);
    }

    @Override
    public Usuario buscarPorNome(String nome) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void atualizar(Usuario usuario) {
        // TODO Auto-generated method stub
        
    }
    
}
