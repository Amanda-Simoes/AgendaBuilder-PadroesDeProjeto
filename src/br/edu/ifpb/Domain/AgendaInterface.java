/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.Domain;

/**
 *
 * @author mandy
 */
public interface AgendaInterface {
    
    public void addContato(Contato contato);
    
    public void listContato();
    
    public void deleteContato(int ddd, int telefone);
    
    public void updateContato(String nome, int telefone, Contato contato);
    
    public void searchNome(String nome);
    
    public void searchTelefone(int ddd, int telefone);
    
}
