/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.Models;

/**
 *
 * @author Guilherme Sbizero
 */
public interface Interatividade_Interface {
    
    void mudarIcone(String enderecoImg, int botao);
    
    void chamarView(int view); 
    
    void inicializarComponentes();
    
}
