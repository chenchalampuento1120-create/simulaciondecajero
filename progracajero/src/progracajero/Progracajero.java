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
    
    static Scanner sc = new Scanner(System.in);
    static double saldo = 1000;
    
    public static void main(String[] args) {
        // TODO code application logic here
        
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
                System.out.println("BIENVENIDO AL CAJERO AUTOMATICO");
                System.out.println("Selecciona una opci0n: ");
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
                            break;
                            
                        case 2: 
                            System.out.println("Retirar Dinero");
                            retirar_dinero();
                            break;
                            
                        case 3: 
                            System.out.println("Depositar dinero");
                            depositar_dinero();
                            break;
                            
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
        System.out.println("Saldo disponible: $" + saldo);
    }
   // retirar el dinero de la cuenta
   public static void retirar_dinero(){
       System.out.println("ingrese la cantidad a retirar:");
       double retiro = sc.nextDouble();
       
       if (retiro > 0 && retiro <= saldo) {
           saldo -= retiro;
           System.out.println("retiro realizado :");
           System.out.println("Saldo actual:$"+saldo);
       }else{
           System.out.println("Saldo insuficiente");
      
           
       }  
   }
   
   // deposito del dinero
   public static void depositar_dinero(){
       
       while(true){
        System.out.println("Ingrese el monto a depositar:");
        
        if(!sc.hasNextDouble()){
            System.out.println("Error: debe ingresar un numero.");
            sc.next(); //Limpia la entrada incorrecta
        continue;
        }
       
   }
    
    

