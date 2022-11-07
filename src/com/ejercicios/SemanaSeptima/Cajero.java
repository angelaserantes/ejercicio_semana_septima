package com.ejercicios.SemanaSeptima;

import java.util.Scanner;

public class Cajero {
    public static void main(String[] args) {
        System.out.println("Bienvenido/a al cajero");
        System.out.println("¿Qué cantidad desea retirar?");
        int retirada;
        int billete5 = 0;
        int billete10 = 0;
        int billete20 = 0;
        int billete50 = 0;
        int billete100 = 0;
        int billete200 = 0;
        int billete500 = 0;
        Scanner entrada = new Scanner(System.in);
        retirada = entrada.nextInt();
        if (retirada%5==0){
            while (retirada>=5){
                if (retirada>=500){
                    billete500++;
                    retirada = retirada-500;
                }if (retirada >=200 && retirada<500){
                    billete200++;
                    retirada = retirada-200;
                }if (retirada >=100 && retirada<200){
                    billete100++;
                    retirada = retirada-100;
                }if (retirada >=50 && retirada<100){
                    billete50++;
                    retirada = retirada-50;
                }if (retirada >=20 && retirada<50){
                    billete20++;
                    retirada = retirada-20;
                }if (retirada >=10 && retirada<20){
                    billete10++;
                    retirada = retirada-10;
                }if (retirada>=5 && retirada<10){
                    billete5++;
                    retirada = retirada-5;
                }
            }
        }else{
            System.out.println("La cantidad introducida no se puede retirar");
        }if (billete500>=1){
            System.out.println("Tienes " + billete500 + " billetes de 500€");
        }if (billete200>=1){
            System.out.println("Tienes " + billete200 + " billetes de 200€");
        }if (billete100>=1){
            System.out.println("Tienes " + billete100 + " billetes de 100€");
        }if (billete50>=1){
            System.out.println("Tienes " + billete50 + " billetes de 50€");
        }if (billete20>=1){
            System.out.println("Tienes " + billete20 + " billetes de 20€");
        }if (billete10>=1){
            System.out.println("Tienes " + billete10 + " billetes de 10€");
        }if (billete5>=1) System.out.println("Tienes " + billete5 + " billetes de 5€");
    }
}
