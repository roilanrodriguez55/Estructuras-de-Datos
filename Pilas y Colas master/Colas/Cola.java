
public class Cola{
    private Elemento head;
    private int size;

    public static void main(String[] args) {
        Cola ls = new Cola(5);
        for(int i = 0;i<5;i++){
            ls.insertarElemento(i);
        }
        ls.imprimirCola();

    }

    public Cola(){

        this.head = null;
        this.size = -1;
    }

    public void insertarElemento(Object dato){
        if (this.colaVacia() == true) {
            this.head = new Elemento(dato);
            size++;
        } else {
            Elemento temp = head;
            head = new Elemento(dato);
            head.enlazarSiguiente(temp);
            temp.enlazarAnterior(head);
            size++;
        }
    
    }
    
    public void eliminarElemento(){
        if (this.colaVacia() == true) {
            System.out.println("La cola esta vacia");
        } else {
            
            Elemento temp = head;

            while (temp.obtenerElemSiguiente()!= null) {
                temp = temp.obtenerElemSiguiente();
            }
            temp.obtenerElemSiguiente().enlazarSiguiente(null);
            size--;
        }
    }

    public void imprimirCola(){
        Elemento temp = head;
        int indice = size;
        System.out.println("-----Head----");
        while (temp.obtenerElemSiguiente()!=null) {
            temp = temp.obtenerElemSiguiente();
            System.out.println(indice + ".- "+temp.obtenerDato());
            indice--;
        }
    }

    public boolean colaVacia() {
        if (this.size == -1) {
            return true;
        } else {
            return false;
        }
    }
    
}