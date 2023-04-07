
public class Elemento{
    
    private Object Dato;
    private Elemento elementoSiguiente;
    private Elemento elementoAnterior;

    public Elemento (Object dato){
        this.Dato = dato;
    }

    public void enlazarSiguiente(Elemento elemento){
        this.elementoSiguiente = elemento;
    }

    public void enlazarAnterior(Elemento elemento){
        this.elementoAnterior = elemento;
    }

    public Elemento obtenerElemSiguiente(){
        return this.elementoSiguiente;
    }

    public Elemento obtenerElemAnterior(){
        return this.elementoAnterior;
    }

    public Object obtenerDato(){
        return Dato;
    }

    
}