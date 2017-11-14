package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        String opcion;
        Object numero = null, eliminar, buscarnumero;
        Pilas pila = new Pilas();



        do {

            System.out.println("\t\t~~~~~Menú~~~~ \n"); //Implementación del menú
            System.out.print("1. Insertar\n2. Mostrar\n3. Buscar\n4. Eliminar"); //Opciones
            System.out.print("5. Tamaño\n6. Máximo\n7. Mínimo\n8. Terminar");
            System.out.println("Elige una opción");//Pregunta al usuario la opocion que desea hacer
            opcion = sc.nextLine();

            switch (opcion) {
                //Insertar valores dentro de la lista
                case "1": {
                    try {
                        System.out.println ( "\t <**Intertar**>" ); //Inicio de la insersción
                        System.out.println ( "¿Cuantos números desea insertar?" ); //El usuario escojera cuantos digitos quiere insertar
                        String n = sc.nextLine (); //Dependiendo la cantidad manda el orden

                        for (int i = 1; i <= Integer.parseInt ( n ); i++) { //Se inicializa un ciclo "for", para el mando de la cantidad
                            System.out.println ( "Inserte un número: " + i + "   " ); //Se mandan las catidades que fueron digitadas
                            pila.push ( Integer.parseInt ( sc.nextLine () ) );//Acepta el mando de los digitos guardados
                        }
                        System.out.println ( "\t\n LOS NÚMEROS HAN SIDO AGREGADOS" );//Manda mensaje que los números se han guardado
                    } catch (Exception e) { // En otro caso o en excepcion de ingresar una letra o simbolo
                        System.out.println ( "¡Solo permite que ingrese numeros!" ); // Manda mensaje de wue solo permite números
                    }
                    break;
                }

                //Mostar los valores que fueron insertados dentro de la lista
                case "2":{
                    System.out.println ( "\t <**Mostrar**>" ); //Opcion Mostrar
                    pila.peek (); // Manda a traer a los números insertadoanteriormente
                    System.out.println ("\n\t <--|Datos mostrados|-->"); //Mesnaje de datos mostrados

                }
                break;

                case "3": {
                    //Buscar los valires que fueron insertados en la lista
                    System.out.println ( "\t<** ¿Que número quiere buscar? **>" ); //Pregunta al usuario que número desea buscar
                    Object num = sc.next (); //Declaramos una instancia
                    if(pila.buscar( num )) {//Ciclo para recorrer y poder encontar el número seleccionado
                        pila.buscar ( num ); //Encuentra el número
                        System.out.println ("El número [" + num + "] Si se encuentra en la lista"); //Corrobora si se ha encontrado
                    }else { //En canso contrario de que no halla sido encontrado
                        System.out.println ( num + " No se encuentra en la lista"); //Manda un mensaje de que no se ha encontrado en la lista
                    }
                }
                break;

                //Eliminación números que fueron insertados y se encuentran dentro de la lista
                case "4": {
                    System.out.println ( "\t <** ¿Que desea eliminar? **>" ); //Pregunta al usuario que número desea eliminar
                    Object num = sc.next (); //Observa la misma instancia
                    if(!pila.buscar ( num )){ //Ciclo para recorrer y poder encontar el número seleccionado
                        pila.pop (num);//Encontro el número
                        System.out.println ("El número [ " + num +  " ]ah sido eliminado"); //Manda mensaje al usuario de que el número ha sido eliminado
                    }else{ //En otro caso
                        System.out.println (num + "No se encuentra en la lista"); //Manda mensaje de que no se envuentra en la lista
                    }
                }
                break;

                //Mostrar el tamaño de números que se encuentran en la pila
                case "5": {
                    System.out.println ( "\t Tamaño" ); //Tamaño de la pila
                    System.out.println (pila.tamanio); //Muestra el tamaño de la pila
                }
                break;

                //Mostrar el número máximo de la pila
                case "6": {
                    System.out.println ("\t Número Máximo"); //Manda mensaje con el texto "Número máximo"

                    break; //Descanso
                }

                //Mostrar el número minimo de la pila
                case "7": {
                    System.out.println ( "\t Número Minimo" ); //Manda mensaje con el texto "Número minimo"

                    break; //Descanso
                }

                //Terminacíon del proceso
                case "8": {
                    System.out.println ( "\t Terminar" );//Manda mensaje con el texto "Terminar"
                    System.exit ( 0 );//Termina el proceso

                    break; //Descanso
                }
                default: //Por defecto
                    System.out.println("Opción incorrecta"); //Manda mensaje con el texto "Opción incorrecta"
                    break;//Descanso
            }

        } while (!opcion.equals("8"));

    }
}
