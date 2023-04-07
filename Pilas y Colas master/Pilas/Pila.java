public class Pila{

    private Elemento head;
    private int size;

    public static void main(String[] args) {
        Pila pl = new Pila();
        
        pl.insertarElemento(0);
        pl.insertarElemento(1);
        pl.insertarElemento(2);
        pl.insertarElemento(3);
        pl.insertarElemento(4);
        pl.insertarElemento(5);
        pl.imprimirPila();
        pl.eliminarElemento();
        pl.imprimirPila();
    }

    public Pila(){
        this.head = null;
        this.size = -1;
    }

    public boolean pilaVacia(){
        if(this.size == -1){
            return true;
        }else{
            return false;
        }
    }

    public void insertarElemento(Object dato){
        if(this.pilaVacia() == true){
            this.head = new Elemento(dato);
            size++;
        }else{
            Elemento temp = head;
            head = new Elemento(dato);
            head.enlazarElemSiguiente(temp);
            size++;
        }
    }

    public void eliminarElemento() {
        if(this.pilaVacia() == true){
            System.out.println("La pila esta vacia");
        }else{
            Elemento temp = head;
            head = temp.obtenerElemSiguiente();
            size--;
        }
    }

    public void topeDePila() {
        if(this.pilaVacia() == true){
            System.out.println("La pila esta vacia");
        }else{
            System.out.println("El tope de la pila es el elemento: "+this.head.obtenerDato());
        }
    }

    public void imprimirPila() {
        if(this.pilaVacia()== true){
            System.out.println("La pila esta vacia");
        }else{
            Elemento temp = head;
            System.out.println("--------PILA------");
            for(int i = size;i>=0;i--){
                System.out.println(i+".- "+temp.obtenerDato());
                temp = temp.obtenerElemSiguiente();
            }
        }
    }
}