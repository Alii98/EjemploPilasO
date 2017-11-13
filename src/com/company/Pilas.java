package com.company;

import com.company.Nodo;

public class Pilas {
   private Nodo top;
    public int tamanio;
    public boolean esVacia;

    public Pilas() {
        top = null;
    }

    public void push(int valor) { //Insertar
        com.company.Nodo nuevoNodo;
        if (vacia ()) {
            top = new com.company.Nodo( valor );
        } else {
            nuevoNodo = new com.company.Nodo(valor);
            nuevoNodo.setProx ( top );
            top = nuevoNodo;
        }
        tamanio++;
    }

    public void peek() {//Mostrar
        com.company.Nodo temp = top;
        if (temp != null) {
            System.out.println ( "La pila es: " );
            while (temp != null) {
                System.out.println ( temp.getvalor () );
                temp = temp.getProx ();
            }
        } else
            System.out.println ( "Pila vacia" );

    }

    public void cima() { //Bauscar
        if (!vacia ())
            System.out.println ( "Cima: " + top.getvalor () );
        else
            System.out.println ( "La pila está vacia" );


    }

    public void pop(Object num) {//Extraer
        if (!vacia ()) {
            System.out.println ( "Dato extraido: " + top.getvalor () );
            top = top.getProx ();
        } else
            System.out.println ( "La pila está vacia" );
    }

    private boolean vacia() {
        return (top == null);
    }

    public boolean buscar(Object val) {
        int pos = 1;
        com.company.Nodo recorrer = top;
        while (recorrer != null) {
            if (val.equals ( recorrer.getvalor () )) {
                System.out.println ( "El elemento: " + val + " está en la posición " + pos + " de la lista" );
                break;
            }
            recorrer = recorrer.getProx ();
            tamanio++;
        }
        return true;
    }

}
