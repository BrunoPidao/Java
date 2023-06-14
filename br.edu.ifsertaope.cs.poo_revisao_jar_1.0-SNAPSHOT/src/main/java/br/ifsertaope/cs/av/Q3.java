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
public class Q3 {
    public static void main(String[] args) {
        int not1, not2;
        float med;
        
        Scanner cleber = new Scanner(System.in);{
        
        System.out.println("escreva sua nota");
        not1 = cleber.nextInt();
        
        System.out.println("escreva sua segunda nota");
        not2 = cleber.nextInt();
        med = (not1 + not2)/2;
    }
        System.out.println("A média é "+med);        
    }
}
