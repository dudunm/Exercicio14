package com.mycompany.exercicio14;

import java.util.Scanner;

public class Exercicio14 {

    public static void main(String[] args) {
        
        Scanner n1 = new Scanner(System.in);
        System.out.print("Ano que você nasceu: ");
        String num1 = n1.nextLine();
        
        Scanner n2 = new Scanner(System.in);
        System.out.print("Ano atual: ");
        String num2 = n2.nextLine();
        
        int anoNasc = Integer.parseInt(num1);
        int anoAtual = Integer.parseInt(num2);
        
        if(anoNasc < anoAtual){
            int idade = anoAtual - anoNasc;
            System.out.println("Você tem " + idade + " anos!");
        } else{
            System.out.println("Ano de nascimento inválido");
        }
        
        
    }
}
