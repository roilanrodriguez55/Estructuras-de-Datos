
package Stack;

/**
 *
 * @author roilanrodriguez55
 */
public interface StackInterface<E> {
    void Push(E info);//Poner un elemento en la cima de la pila
    E Top();//Retorna el elemento de la cima de la pila
    E Pop();//Retorna y elimina el elemento de la cima de la pila
    boolean isEmpty();//Verifica si la pila está vacia
    
    
}
