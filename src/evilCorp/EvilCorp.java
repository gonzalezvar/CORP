/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evilCorp;

import java.util.Scanner;
import empleado.Empleado;
/**
 *
 * @author 505
 */
public class EvilCorp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner entrada = new Scanner(System.in);
        int opcion;
        int cont = 0;
        Empleado[] empleados = new Empleado[10];
        do{
            System.out.println("Bienvenido");
            System.out.println("***********");
            
            System.out.println("1. Agregar Empleado");
            System.out.println("2. Buscar Empleado");
            System.out.println("3. Mostrar Empleado");
            System.out.println("4. Calcular Salario");
            System.out.println("5. Salir");
            System.out.print("Digite una opcion: ");
            opcion = entrada.nextInt();
            
            switch(opcion){
                case 1:
                    System.out.println("Registro de empleado: ");
                    System.out.println("");
                    empleados[cont] = new Empleado();
                    System.out.println("Digite el nombre: ");
                    empleados[cont].setId(cont);
                    empleados[cont].setNombre(entrada.next());
                    System.out.println("Digite el cargo: ");
                    empleados[cont].setCargo(entrada.next());
                    System.out.println("Digite el número de horas semanales: ");
                    empleados[cont].setHrSemanales(entrada.nextDouble());
              
                    break;
                case 2:
                    System.out.println("Introduce el nombre del empleado");
                    String nombre = entrada.next();
                    for(int i=0;i<empleados.length;i++){
                        if(empleados[i].getNombre().equalsIgnoreCase(nombre)){
                            System.out.println(empleados[i].getNombre());
                            System.out.println(empleados[i].getCargo());
                            System.out.println(empleados[i].getHrSemanales());
                            break;
                        }else{
                            System.out.println("empleado no encontrado");
                        }
                    }
                    break;
                case 3:
                    System.out.println("Mostrar Empleado");
                    for(int i=0;i<empleados.length;i++){
                        System.out.println(empleados[i].getNombre());
                        System.out.println(empleados[i].getCargo());
                        System.out.println(empleados[i].getHrSemanales());
                        System.out.println("");
                    }
                    break;
                case 4:
                    System.out.println("Entraste a opcion 4");
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
            cont++;
        }while(opcion!=5 && cont<10);
  
    }
    
}
