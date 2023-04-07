public class Elemento{

    private Elemento elementoSiguiente;
    private Object dato;

    public Elemento(Object dato){
        this.dato = dato;
    }

    public Elemento obtenerElemSiguiente() {
        return this.elementoSiguiente;
    }

    public void enlazarElemSiguiente(Elemento xNodo) {
        this.elementoSiguiente = xNodo;
    }

    public Object obtenerDato() {
        return this.dato;
    }
}