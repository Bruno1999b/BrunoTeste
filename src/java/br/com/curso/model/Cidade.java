/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.curso.model;

/**
 *
 * @author brunomomoi
 */
public class Cidade {
    
        private int idCidade;
        private String nomeCidade;
        private Estado estado;
        private String situacao;
        
        
    public Cidade(int idCidade, String nomeCidade, Estado estado, String situacao){
        this.idCidade = idCidade;
        this.nomeCidade = nomeCidade;
        this.estado = estado;
        this.situacao = situacao;
        }
    
    public Cidade(){
        this.idCidade = 0;
        this.nomeCidade ="";
        this.situacao="A";
        this.estado = new Estado();
        }
}

