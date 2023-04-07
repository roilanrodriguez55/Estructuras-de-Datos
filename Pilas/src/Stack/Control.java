package Stack;

import java.util.LinkedList;

/**
 *
 * @author roilanrodriguez55
 */
public class Control {

    public Control() {
    }

    public LinkedList<Integer> invertir(LinkedList<Integer> l) {
        LinkedStack<Integer> pila = new LinkedStack<>();
        LinkedList<Integer> lista = pila.invertir(l);
        return lista;
    }

}
