package com.company;

import java.util.Scanner;

public class Main {

    private static int min = 10000;
    private static int max = 0;
    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        String opcion;
        Object numero = null, eliminar, buscarnumero;
        Pilas pila = new Pilas();



        do {

            System.out.println("\t\t~~~~~Menú~~~~ \n");
            System.out.print("1. Insertar\n2. Mostrar\n3. Buscar\n4. Eliminar");
            System.out.print("5. Tamaño\n6. Máximo\n7. Mínimo\n8. Terminar");
            System.out.println("Elige una opción");
            opcion = sc.nextLine();

            switch (opcion) {
                //Insertar valores dentro de la lista
                case "1": {
                    try {
                        System.out.println ( "\t Intertar" );
                        System.out.println ("¿Cuantos números desea insertar?");
                        String n = sc.nextLine ();

                        for(int i = 1; i <=Integer.parseInt ( n ); i ++){
                            System.out.println ("Inserte un número: " + i + "   ");
                            pila.push (Integer.parseInt ( sc.nextLine () ));
                        }
                        System.out.println ("\t LOS NÚMEROS HAN SIDO AGREGADOS");
                    }catch (Exception e){
                        System.out.println ("¡Solo permite que ingrese numeros!");
                    }
                    break;
                }

                //Mostar los valores que fueron insertados dentro de la lista
                case "2":{
                    System.out.println ( "\t Mostrar" );
                    pila.peek ();
                    System.out.println ("\n Datos mostrados");

                }
                break;

                case "3": {
                    //Buscar los valires que fueron insertados en la lista
                    System.out.println ( "¿Que número quiere buscar?" );
                    Object num = sc.next ();
                    if(pila.buscar( num )) {
                        pila.buscar ( num );
                        System.out.println ("El número [" + num + "] Si se encuentra en la lista");
                    }else {
                        System.out.println ( num + " No se encuentra en la lista");
                    }
                }
                break;

                //Eliminación números que fueron insertados y se encuentran dentro de la lista
                case "4": {
                    System.out.println ( "¿Que desea eliminar?" );
                    Object num = sc.next ();
                    if(!pila.buscar ( num )){
                        pila.pop (num);
                        System.out.println ("El número [ " + num +  " ]ah sido eliminado");
                    }else{
                        System.out.println (num + "No se encuentra en la lista");
                    }
                }
                break;

                //Mostrar el tamaño de números que se encuentran en la pila
                case "5": {
                    System.out.println ( "\t Tamaño" );
                    System.out.println (pila.tamanio);
                }
                break;

                //Mostrar el número máximo de la pila
                case "6": {
                    System.out.println ("\t Número Maximo");

                    break;
                }

                //Mostrar el número minimo de la pila
                case "7": {
                    System.out.println ( "\t Número Minimo" );

                    break;
                }

                //Terminacíon del proceso
                case "8": {
                    System.out.println ( "\t Terminar" );
                    System.exit ( 0 );

                    break;
                }
                default:
                    System.out.println("Opción incorrecta");
                    break;
            }

        } while (!opcion.equals("6"));

    }
}
