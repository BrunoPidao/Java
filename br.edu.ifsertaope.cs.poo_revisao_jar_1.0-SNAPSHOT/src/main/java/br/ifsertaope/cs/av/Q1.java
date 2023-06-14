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
public class Q1 {
    public static void main(String[] args) {
        int num, impar = 0, par = 0;
        Scanner junior = new Scanner(System.in);{
       
        for(int i = 0; i < 5; i++){
        System.out.println("Insira um número: ");
        num = junior.nextInt();
        if(num %2 == 0){
            par++;
        }
        else
            impar++;
        }
    }
        System.out.println("Existem "+par+" números e "+impar+" impares.");
    }
}
