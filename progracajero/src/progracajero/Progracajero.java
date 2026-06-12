/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package progracajero;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Progracajero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
     Scanner sc = new Scanner(System.in);
        //algoritmo para simular cajero automatico
        int clave = 1234;
        int intentos =3;
        int opc;
        int intentos_opc = 3;
        System.out.println("------------------");
        System.out.println("cajero automatico");
        System.out.println("-----------------");
        System.out.println("ingrese su tarjeta: ");
        System.out.println("tarjeta detectada");
        System.out.println("ingresa tu clave");
        while(intentos>0 && intentos <= 3){ 
            int clave_ingresada = sc.nextInt();
            if (clave_ingresada == clave) {
                System.out.println("bienvenido al cajero");
                System.out.println("selecciona una opción: ");
                do {
                    System.out.println("1. consultar saldo");
                    System.out.println("2. retirar dinero");
                    System.out.println("3. depositar dinero");
                    System.out.println("4. salir");
                    System.out.println("----------------");
                    System.out.println("Ingrese una Opcion");
                    System.out.println("-------------------");
                    opc= sc.nextInt();
                    switch(opc){
                        case 1:
                            System.out.println("Consultar Saldo");
                            consultar_saldo();
                            
                        case 2: 
                            System.out.println("Retirar Dinero");
                            
                        case 3: 
                            System.out.println("Depositar dinero");
                            
                        case 4:
                            System.out.println("Sistema Cerrado");
                            break;
                        default:
                            intentos_opc --;
                            System.out.println(intentos_opc);
                            System.out.println("Ingrese una opcion");
                    }
                } while (opc != 4 && intentos_opc >0);
                break;

            }else{
                System.out.println("Clave Incorrecta");
                intentos = intentos -1;
                System.out.println("Te quedan: "+intentos+" intentos.");
            }
        }
        if (intentos==0){
            System.out.println("Tarjeta Bloqueada, has superado los 3 intentos");
        }
    }
    // consultar saldo actual
   public static void consultar_saldo(){
    double saldo = 1000;
         System.out.println("Saldo disponible: $" + saldo);
    }
       
   }
    
    

