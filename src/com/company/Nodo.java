package com.company;

/**
 * Created by Alicia Flores on 08/11/2017.
 */
public class Nodo {
    private int valor;



    private Nodo prox;

    public Nodo (){
        this.valor = 0;
        this.prox  = null;
    }
    public Nodo (int v){
        this.valor = v;
        this.prox= null;
    }

    public void setValor(int v) {
        valor = v;
    }
    public void setProx(Nodo prox) {
        this.prox = prox;
    }

    public int getvalor(){
        return valor;
    }
    public Nodo getProx(){
        return prox;
    }
}
