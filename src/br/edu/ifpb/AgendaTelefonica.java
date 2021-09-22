/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb;

import br.edu.ifpb.Domain.Agenda;
import br.edu.ifpb.Domain.Contato;

/**
 *
 * @author mandy
 */
public class AgendaTelefonica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Agenda agenda = new Agenda();
//        agenda.addContato(new Contato("Amanda","Mandy",83,999792415,"amanda@gmail.com","Contato pessoal"));
        
        agenda.addContato(new Contato.ContatoBuilder()
                .nomeContato("Amanda")
                .apelido("Mandy")
                .anotacao("Contato pessoal")
                .DDD(83)
                .numeroTelefone(999792415)
                .email("amanda@gmail.com")
                .criarContato());
        
        agenda.addContato(new Contato.ContatoBuilder()
                .nomeContato("Aline")
                .apelido("")
                .anotacao("Contato empresarial")
                .DDD(83)
                .numeroTelefone(995210415)
                .email("aline@gmail.com")
                .criarContato());
        
        agenda.listContato();
    }
    
}
