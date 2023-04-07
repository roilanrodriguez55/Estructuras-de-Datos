package Stack;

import java.util.LinkedList;

/**
 *
 * @author roilanrodriguez55
 */
public class main {

    public static void main(String[] args) {

        /**
         * *******EJERCICIO 1 DE PILAS*******
         */
//        Control c = new Control();
//        LinkedList<Integer> lista = new LinkedList<>();
//        int a = 1;
//        for (int i = 0; i < 5; i++) {
//            lista.add(a);
//            a++;
//        }
//        System.out.println("Lista:");
//        for (int i = 0; i < lista.size(); i++) {
//            System.out.print(lista.get(i));
//        }
//
//        LinkedList l = c.invertir(lista);
//
//        System.out.println("");
//
//        System.out.println("Lista Invertida:");
//        for (int i = 0; i < l.size(); i++) {
//            System.out.print(l.get(i));
//        }
//        System.out.println("");
        /**
         * *********EJERCICIO 2 DE PILAS***********
         */
//        LinkedList<String> list1 = new LinkedList<>();
//
//        //((()) (()))()
//        list1.add("(");
//        list1.add("(");
//        list1.add("(");
//        list1.add(")");
//        list1.add(")");
//        list1.add("(");
//        list1.add("(");
//        list1.add(")");
//        list1.add(")");
//        list1.add("(");
//        list1.add(")");
//        list1.add(")");
//
//        LinkedStack<String> pila = new LinkedStack<>();//pila que va a contener todos
//
//        boolean bool = pila.VParentesis(list1);
//
//        System.out.println("Resultado: " + bool);
        /**
         * ****************EJERCICIO 3 DE PILAS*****************
         */
//       LinkedStack<String> pila=new LinkedStack<>();
//       
//        System.out.println("Isaac no ronca así "+pila.palindrome("Isaac no ronca así"));
//        System.out.println("reinier "+pila.palindrome("reinier"));
//        System.out.println("Dabale arroz a la zorra el abad "+pila.palindrome("Dabale arroz a la zorra el abad"));
//        System.out.println("Somos o no somos "+pila.palindrome("Somos o no somos"));
        /**
         * **************EJERCICIO 4 DE PILAAS**************
         */
        LinkedStack<Integer> pila = new LinkedStack<>();
        LinkedStack<Integer> pila1;

        int[] arr = {1, 4, 3, 4, 5};
        for (int i = 0; i < arr.length; i++) {
            pila.Push(arr[i]);
        }
        //Entrada 5,4,3,4,1

        int nuevo = 8, viejo = 4;

        //Salida 5,8,3,8,1  nuevo=8 viejo=4
        pila1 = pila.reemplazar(pila, nuevo, viejo);

        while (!(pila1.isEmpty())) {
            System.out.print(pila1.Pop() + " ");
        }
        System.out.println("");

    }

}
