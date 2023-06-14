/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.ifsertaope.cs.av;

/**
 *
 * @author Aluno
 */
public class fatura {
    String num, desc;
    int qnt_ite;
    double preco;
    
    public fatura(){
        
    }
    
    public double getTotalFatura(double result){
        result = this.preco*this.qnt_ite;
        return result;
    }
}
