/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.ifsertaope.cs.av;

/**
 *
 * @author Aluno
 */
public class conta {

    public double money;
    
 public double sacar (int saida){
     return this.money - saida;
    }
 public double depositar (int entrada ){
     return this.money + entrada;
 } 
 public double saldo(){
    return this.money;
 }
}
