import java.util.Scanner;
import java.io.*;
//import java.io.FileOutputStream;
//import java.io.ObjectOutputStream;

public class Principal

{

    public static void main(String[] args){
        Principal.monstrarMenu();
    }

    public static void monstrarMenu(){
        Scanner input = new Scanner(System.in);
        int infinito = 0;

        while(infinito == 0){
            System.out.print("Ingrese el número correspondiente para ejecutar la acción deseada:\n ");
            System.out.println("\n" + "");
            System.out.println("Menú:\n0: Finalizar ejecución del programa.\n1: Crear vehiculo nuevo.\n2: Mostrar información de los vehiculos creados al momento.\n3: Mostrar la cantidad de vehiculos creados hasta el momento.\n4: Mostrar información de todos los vehiculos de color verde.\n5: Mostrar la información de un vehiculo por ID.\n6: Crear un nuevo sensor a un vehiculo ya existente.\n7: Mostrar la información de los sensores de un vehiculo por ID.\n8: Mostrar todos los sensores de tipo Temperatura.\n9: Mostrar la información del vehiculo con más sensores.\n10: Crear 5 vehiculos nuevos con información guardada en un archivo TxT.\n666: Mostrar los sensores de tipo temperatura ordenados por valor.");
            int numUsuario = input.nextInt();
            if(numUsuario == 0){
                break;
            } else if(numUsuario==1){
                System.out.println("Ingrese el modelo del nuevo vehiculo:");
                int modeloV = input.nextInt();
                System.out.println("Ingrese la marca del nuevo vehiculo:");
                String marcaV = input.next();
                System.out.println("Ingrese el valor comercial del nuevo vehiculo:");
                double valorComercialV = input.nextDouble();
                System.out.println("Ingrese el color del nuevo vehiculo:");
                String colorV = input.next();
                Vehiculo vehiculo = new Vehiculo(modeloV, marcaV, valorComercialV, colorV);

            }else if(numUsuario == 2){
                System.out.println("\n" + "Información de todos los vehiculos almacenados hasta el momento:");
                System.out.println("\n" + Vehiculo.toStringVehiculos() + "\n");

            }else if(numUsuario == 3){
                System.out.print("\n" + "Cantidad de los vehiculos creados hasta el momento: ");
                System.out.println("\n" + Vehiculo.cantidadVehiculos() + "\n");

            }else if(numUsuario == 4){
                System.out.println("\n" + "Información de todos los vehiculos color verde almacenados hasta el momento:");
                System.out.println("\n"+ Vehiculo.toStringVehiculosVerdes() +"\n");

            }else if(numUsuario == 5){
                System.out.println("\n" + "Ingrese el ID del vehiculo que desee ver:");
                int idd=input.nextInt();

                if(Vehiculo.senal(idd)==1){
                    System.out.println(Vehiculo.obtenerVehiculoPorId(idd));
                }
                else{
                    System.out.println("Lo sentimos, pero el ID que solicito no existe.");
                    System.out.println("\n" + "");
                }
                
            }else if(numUsuario == 6){

                System.out.println("\n" + "Ingrese el ID del vehiculo que desee ver:");
                int idd=input.nextInt();

                if(Vehiculo.senal(idd)==1){
                    System.out.println("\n" + "Ingrese el tipo de sensor que desea crear:");
                    String valor1=input.next();
                    System.out.println("\n" + "Ingrese el  valor del sensor que desea crear:");
                    double valor2=input.nextDouble();
                    Sensor sensor = new Sensor(valor1,valor2);
                    Vehiculo.obtenerVehiculoPorId2(idd).anadirSensor(sensor);
                
                }
                else{
                    System.out.println("Lo sentimos, pero el ID que solicito no existe.");
                    System.out.println("\n" + "");
                }

            }
            else if(numUsuario == 7){
                System.out.println("\n" + "Ingrese el ID del vehiculo del cual desee ver los sensores:");
                int idd=input.nextInt();

                if(Vehiculo.senal(idd)==1){
                    System.out.println(Vehiculo.caso7(idd));
                }
                else{
                    System.out.println("Lo sentimos, pero el ID que solicito no existe.");
                    System.out.println("\n" + "");
                }
            }

            else if(numUsuario == 8){
                    
             System.out.println(Vehiculo.caso8(0)); 
          
            }  
            else if(numUsuario == 9){

                System.out.println("\nVehículo con más sensores:");
                
                Vehiculo.caso9();
            }
            else if(numUsuario == 10){

                Vehiculo.mostrararchivos(0,41);
                Vehiculo.mostrararchivos(41,80);
                Vehiculo.mostrararchivos(80,117);
                Vehiculo.mostrararchivos(117,158);
                Vehiculo.mostrararchivos(158,198);                    

            }
            else if(numUsuario == 666){
                
                System.out.println(Vehiculo.caso666());
                
            }

        }      
    }
}