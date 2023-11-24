public class usoLista {
    public static void main(String[] args) {
        ListaEnlazada listaEnlazada = new ListaEnlazada();

        // Agregar algunos nodos para probar
        listaEnlazada.cabeza = new Nodo(1);
        listaEnlazada.cabeza.siguiente = new Nodo(2);
        listaEnlazada.cabeza.siguiente.siguiente = new Nodo(3);
        listaEnlazada.cabeza.siguiente.siguiente.siguiente = new Nodo(4);

        // Buscar un nodo por el valor de su campo clave y devolver una referencia
        int claveBuscar = 3;
        Nodo nodoBuscado = listaEnlazada.buscarPorClave(claveBuscar);
        if (nodoBuscado != null) {
            System.out.println("Nodo con clave " + claveBuscar + " encontrado.");
        } else {
            System.out.println("Nodo con clave " + claveBuscar + " no encontrado.");
        }

        // Buscar un nodo por su campo clave e insertar un nuevo nodo después de él
        int claveInsertarDespues = 2;
        int nuevaClave = 5;
        listaEnlazada.insertarDespuesDeClave(claveInsertarDespues, nuevaClave);

        // Imprimir la lista enlazada después de la inserción
        System.out.println("Lista enlazada después de la inserción:");
        imprimirListaEnlazada(listaEnlazada);

        // Intercambiar un nodo por otro buscado
        int claveIntercambiar1 = 2;
        int claveIntercambiar2 = 4;
        listaEnlazada.intercambiarNodos(claveIntercambiar1, claveIntercambiar2);

        // Imprimir la lista enlazada después del intercambio
        System.out.println("Lista enlazada después del intercambio:");
        imprimirListaEnlazada(listaEnlazada);
    }

    // Método auxiliar para imprimir la lista enlazada
    private static void imprimirListaEnlazada(ListaEnlazada lista) {
        Nodo actual = lista.cabeza;
        while (actual != null) {
            System.out.print(actual.clave + " ");
            actual = actual.siguiente;
        }
        System.out.println();
    }
}
