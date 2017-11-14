
/**
 * Created by Alicia Flores on 08/11/2017.
 */
public class Nodo { //Se crea la clase Nodo
    private int valor; //Definimos una  variable de tipo entero



    private Nodo prox; //Dentro de esto lo definimos un prox(Valor proximo)

    public Nodo (){ //Se inicializa
        this.valor = 0; //se inicialoza el valor con 0
        this.prox  = null;// se inicializa proximo como null
    }
    public Nodo (int v){ //Declaración de objetos
        this.valor = v; //Define el valor para la declaración de objetos
        this.prox= null;//Feni el valor proximo como null
    }

    public void setValor(int v) //Manda a traer el valor
    {
        valor = v; //Muestra el valor obtenido
    }
    public void setProx(Nodo prox) //Manda a traer el valor proximo
    {
        this.prox = prox; //Muestra el valor proximo
    }

    public int getvalor() //Mamnda a traer el valor
    {
        return valor;//Retorna el valor
    }
    public Nodo getProx() //Manda a traer el valor proximo
    {
        return prox;//Retorna el valor proximo
    }
}
