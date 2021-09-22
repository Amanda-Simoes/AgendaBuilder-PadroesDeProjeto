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
public class Contato{
    
    private String nomeContato;
    private String apelido;
    private int DDD;
    private int numeroTelefone;
    private String email;
    private String anotacao;

//    public Contato() {}

    private Contato(String nomeContato, String apelido, int DDD, int numeroTelefone, String email, String anotacao) {
        this.nomeContato = nomeContato;
        this.apelido = apelido;
        this.DDD = DDD;
        this.numeroTelefone = numeroTelefone;
        this.email = email;
        this.anotacao = anotacao;
    }
    
    public static class ContatoBuilder{
        private String nomeContato;
        private String apelido;
        private int DDD;
        private int numeroTelefone;
        private String email;
        private String anotacao;
        
        public ContatoBuilder(){}
        
        public ContatoBuilder nomeContato(String nomeContato){
            this.nomeContato = nomeContato;
            return this;
        }
        public ContatoBuilder apelido(String apelido){
            this.apelido = apelido;
            return this;
        }
        public ContatoBuilder DDD(int DDD){
            this.DDD = DDD;
            return this;
        }
        public ContatoBuilder numeroTelefone(int numeroTelefone){
            this.numeroTelefone = numeroTelefone;
            return this;
        }
        public ContatoBuilder email(String email){
            this.email = email;
            return this;
        }
        public ContatoBuilder anotacao(String anotacao){
            this.anotacao = anotacao;
            return this;
        }
        
        public Contato criarContato(){
            return new Contato(nomeContato, apelido, DDD, numeroTelefone, email, anotacao);
        }
        
    }
    
    public int getDDD() {
        return DDD;
    }

    public void setDDD(int DDD) {
        this.DDD = DDD;
    }

    public String getNomeContato() {
        return nomeContato;
    }

    public void setNomeContato(String nomeContato) {
        this.nomeContato = nomeContato;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public int getNumeroTelefone() {
        return numeroTelefone;
    }

    public void setNumeroTelefone(int numeroTelefone) {
        this.numeroTelefone = numeroTelefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAnotacao() {
        return anotacao;
    }

    public void setAnotacao(String anotacao) {
        this.anotacao = anotacao;
    }
    
}
