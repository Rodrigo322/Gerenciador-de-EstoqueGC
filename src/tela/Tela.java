/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tela;

import QueryesPesonalizadas.Querys;
import javax.persistence.EntityManager;
import javax.swing.JOptionPane;
import medelos.Usuario;
import static tela.Login.userStatic;
import static tela.Login.usuario;

/**
 *
 * @author Pedro Henrique Gomes
 */
public class Tela {

    
    
    public static Usuario userStatic ;
    public static String usuario;
    
        public void logar(String nome, String senha, EntityManager jpa) {
        Querys loginUser = new Querys();
        userStatic = loginUser.LoginUser(nome, senha, jpa);
        if (userStatic != null) {
            JOptionPane.showMessageDialog(null, "Bem vindo: " + userStatic.getNome());
            Principal principal = new Principal();
            principal.setVisible(true);
            
            usuario = userStatic.getNome();
        } else {
            JOptionPane.showMessageDialog(null, "User:   não encontrado");
            userStatic = null;
        }
    }
    
}
