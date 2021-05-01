package com.iasminwinx;
import java.util.Scanner;

public class Menu {
    Calculadora c1 = new Calculadora();
    Scanner input = new Scanner(System.in);
    public void Menu(){
        System.out.println("Calculadora\n" +
                "================\n"+
                "1. Somar\n"+
                "2. Subtrair\n"+
                "3. Multiplicar\n"+
                "4. Dividir\n"+
                "5. Sair\n"+
                "Digite uma opção _");
        int opção=input.nextInt();
        while(opção!=5){
            if (opção == 1){
                double v[] = capturarNúmeros();
                System.out.println(c1.somar(v[0],v[1]));
                break;
            }
            if(opção==2){
                double v[] = capturarNúmeros();
                System.out.println(c1.subtrair(v[0],v[1]));
                break;
            }
            if(opção==3){
                double v[] = capturarNúmeros();
                System.out.println(c1.multiplicar(v[0],v[1]));
                break;
            }
            if(opção==4){
                double v[] = capturarNúmeros();
                System.out.println(c1.dividir(v[0],v[1]));
                break;
            }
        }

    }

    double[] capturarNúmeros(){
        double número1=input.nextDouble();
        double número2=input.nextDouble();
        double vetor[] = new double[2];
        vetor[0]=número1;
        vetor[1]=número2;

        return vetor;


    }
}
