package Calculatrice;

import java.util.Scanner;

public class test {
	public static void main (String [] args){
		Scanner scanner = new Scanner(System.in);
		System.out.print("Entrez le premier nombre : ");
        double nb1 = scanner.nextDouble();

        System.out.print("Entrez le deuxième nombre : ");
        double nb2 = scanner.nextDouble();

        System.out.print("Entrez l'opération (+, -, *, /) : ");
        char operation = scanner.next().charAt(0);
        double res=0;
        try{
        	switch(operation){
        	case '+':
        		res=calculatrice.addition(nb1,nb2);
        		break;
        	case '-':
        		res=calculatrice.soustraction(nb1,nb2);
        		break;
        	case '*':
        		res=calculatrice.multiplication(nb1,nb2);
        		break;
        	case '/':
        		res=calculatrice.division(nb1,nb2);
        		break;
        	default:
        		System.out.println("operation non valide!");
        	}
        	System.out.println("Le résultat de l'opération est : " + res);
        }catch(IllegalArgumentException e){
        	System.out.println("division par 0 impossible");
        }
	}
}
