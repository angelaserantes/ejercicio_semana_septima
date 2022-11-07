package com.ejercicios.SemanaSeptima;

import java.util.Scanner;

public class Cajero1 {
    int billete5 = 0;
    int billete10 = 0;
    int billete20 = 0;
    int billete50 = 0;
    int billete100 = 0;
    int billete200 = 0;
    int billete500 = 0;

    public static void CalculoRetirada(int retirada){
        Cajero1 banco = new Cajero1();
        if (retirada%5==0){
            while (retirada>=5){
                if (retirada>=500){
                     banco.billete500++;
                    retirada = retirada-500;
                }if (retirada >=200 && retirada<500){
                    banco.billete200++;
                    retirada = retirada-200;
                }if (retirada >=100 && retirada<200){
                    banco.billete100++;
                    retirada = retirada-100;
                }if (retirada >=50 && retirada<100){
                    banco.billete50++;
                    retirada = retirada-50;
                }if (retirada >=20 && retirada<50){
                    banco.billete20++;
                    retirada = retirada-20;
                }if (retirada >=10 && retirada<20){
                    banco.billete10++;
                    retirada = retirada-10;
                }if (retirada>=5 && retirada<10){
                    banco.billete5++;
                    retirada = retirada-5;
                }
            }
        }else{
            System.out.println("La cantidad introducida no se puede retirar");
        }if (banco.billete500>=1){
            System.out.println("Tienes " + banco.billete500 + " billetes de 500€");
        }if (banco.billete200>=1){
            System.out.println("Tienes " + banco.billete200 + " billetes de 200€");
        }if (banco.billete100>=1){
            System.out.println("Tienes " + banco.billete100 + " billetes de 100€");
        }if (banco.billete50>=1){
            System.out.println("Tienes " + banco.billete50 + " billetes de 50€");
        }if (banco.billete20>=1){
            System.out.println("Tienes " + banco.billete20 + " billetes de 20€");
        }if (banco.billete10>=1){
            System.out.println("Tienes " + banco.billete10 + " billetes de 10€");
        }if (banco.billete5>=1) System.out.println("Tienes " + banco.billete5 + " billetes de 5€");
    }

    public static void main(String[] args) {
        System.out.println("Bienvenido/a al cajero");
        System.out.println("¿Qué cantidad desea retirar?");
        Scanner entrada = new Scanner(System.in);
        int retirada = entrada.nextInt();
        CalculoRetirada(retirada);
    }
}

