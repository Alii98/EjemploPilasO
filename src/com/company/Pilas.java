package com.company;

import com.company.Nodo;

public class Pilas {
    private Nodo top; //Se declara variable tipo NODO
    public int tamanio; //Se declara variable de tipo entero
    public boolean esVacia; //Se declara variable de tipo boolean

    public Pilas() {
        top = null;
    } //Método Pilas que contiene la variable Top que es igual a null

    public void push(int valor) { //Insertar
        com.company.Nodo nuevoNodo; //Variable de tipo NODO
        if (vacia ()) { //Condición para verificar si estpa vacia
            top = new com.company.Nodo( valor ); //se crea una instancia
        } else {
            nuevoNodo = new com.company.Nodo(valor); //Se crea una instancia
            nuevoNodo.setProx ( top ); //NuevoNodo se enlazara al top (ultimo valor)
            top = nuevoNodo; //Variable top es igual a lo que se encontro en el nuevoNodo
        }
        tamanio++; //Incrementa el tamaño
    }

    public void peek() {//Mostrar
        com.company.Nodo temp = top; //Variable temp de tipo NODO es igual a lo que contiene top.
        if (temp != null) { //Si temp es diferente de null
            System.out.println ( "La pila es: " ); //Imprime mensaje
            while (temp != null) { //Mientras temp es diferente de null
                System.out.println ( temp.getvalor () );//Imprime lo que contiene temp llamando el valor que contiene.
                temp = temp.getProx (); //la variable temp almacena el ultimo valor enlzandolo al anterior.
            }
        } else
            System.out.println ( "Pila vacia" );//Mensaje donde dice que la pila está vacia

    }

    public void cima() { //Bauscar
        if (!vacia ()) //Condición
            System.out.println ( "Cima: " + top.getvalor () ); //Mensaje concatenado de la
            // variable top que mandara a llamar el valor almacenado
        else
            System.out.println ( "La pila está vacia" ); //Manda mensaje de que la pila esta vacia.


    }

    public void pop(Object num) {//Extraer
        if (!vacia ()) { //condición
            System.out.println ( "Dato extraido: " + top.getvalor () ); //Manda mensaje concatenado  top
            // mandando a llamar el valor .
            top = top.getProx (); //la variable top  almacena el ultimo valor enlzandolo al anterior.
        } else
            System.out.println ( "La pila está vacia" ); //Muestra mensaje que la pila se encuentra vacia
    }

    private boolean vacia() { //Metodo vacia de tipo boolean

        return (top == null); //Retorna que top es igual a null
    }

    public boolean buscar(Object val) { //Método boolean llamado buscar con un atributo llamado val de tipo Object
        int pos = 1; //Se declara variable de tipo int para que inicie a paratir de 1 (posición)
        com.company.Nodo recorrer = top; //Variable recorrer de tipo Nodo la cual se le asigna lo que contiene top.
        while (recorrer != null) { //mientras recorrer  sea diferente de null
            if (val.equals ( recorrer.getvalor () )) { //Condición
                System.out.println ( "El elemento: " + val + " está en la posición " + pos + " de la lista" );//mensaje concatenado
                // con las variables
                break;
            }
            recorrer = recorrer.getProx (); //El valor almacenado en recorrer está siendo enlazado con el ultimo
            tamanio++;//incrementa el tamaño
        }
        return true; //retorna un valor verdadero
    }
    int aux; //se declara variable de tipo int llamada "aux"
    public  int Max() { //Método de tipo int llamado "Max"
        Nodo temp=top; //Variable temp de tipo Nodo a la cual se le asigna lo que contiene top.
        int max = temp.getvalor (); //Se declara variable "max" de tipo int a la cual se le asigna el valor temporal.
        while(temp!=null) //mientras variable "temp" se diferente de null
        {

            aux = temp.getvalor (); //auxiliar "temporal" manda a traer el valor.
            if (max<= aux){ //Si max es menor igual que aux
                max= aux; //A max se le asigna lo que contiene aux
            }
            temp=temp.getProx (); //enlaza el valor temporal al siguiente
        }
        return max; //retorna el valor máximo.
    }
    public  int Min() { //Metodo de tipo int llamado Min
        Nodo temp=top; //Variable temp de tipo Nodo a la cual se le asigna lo que contiene top.
        int min = temp.getvalor (); //Se declara variable "min" de tipo int a la cual se le asigna el valor temporal.
        while(temp!=null) //mientras variable "temp" se diferente de null
        {

            aux = temp.getvalor ();//auxiliar "temporal" manda a traer el valor.
            if (min>= aux){ //Si min es mayor igual que aux
                min= aux;//A min se le asigna lo que contiene la variable aux
            }
            temp=temp.getProx (); //enlaza el valor temporal al siguiente
        }
        return min; //Retorna el valor mínimo
    }


}
