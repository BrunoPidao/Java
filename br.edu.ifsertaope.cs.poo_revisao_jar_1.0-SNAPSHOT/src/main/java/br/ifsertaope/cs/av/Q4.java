/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.ifsertaope.cs.av;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Q4 {
    public static void main(String[] args) {
        int num, ant, suc ;
        Scanner ajilson = new Scanner(System.in);{
        
        System.out.println("Escreva um número: ");
        num = ajilson.nextInt();
        
        ant = num - 1;
        suc = num + 1;
        
        System.out.println("O número "+num+" tem como sucessor "+suc+" e como antecessor "+ant);
    }
    }
}
