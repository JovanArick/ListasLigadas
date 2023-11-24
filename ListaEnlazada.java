class ListaEnlazada {
    Nodo cabeza;

    public ListaEnlazada() {
        this.cabeza = null;
    }

    // Método para buscar un nodo por el valor de su campo clave y devolver una referencia
    public Nodo buscarPorClave(int clave) {
        Nodo actual = cabeza;
        while (actual != null) {
            if (actual.clave == clave) {
                return actual;
            }
            actual = actual.siguiente;
        }
        return null; // No se encontró el nodo con la clave especificada
    }

    // Método para buscar un nodo por su campo clave e insertar un nuevo nodo después de él
    public void insertarDespuesDeClave(int claveBuscar, int nuevaClave) {
        Nodo actual = cabeza;
        while (actual != null) {
            if (actual.clave == claveBuscar) {
                Nodo nuevoNodo = new Nodo(nuevaClave);
                nuevoNodo.siguiente = actual.siguiente;
                actual.siguiente = nuevoNodo;
                return;
            }
            actual = actual.siguiente;
        }
        // Si no se encuentra el nodo con la clave especificada, se podría lanzar una excepción o manejar de otra manera.
    }

    // Método para intercambiar un nodo por otro buscado
    public void intercambiarNodos(int clave1, int clave2) {
        // Si los nodos a intercambiar son iguales, no hay necesidad de hacer nada
        if (clave1 == clave2) {
            return;
        }

        // Buscar los nodos con las claves especificadas
        Nodo anterior1 = null, actual1 = cabeza;
        while (actual1 != null && actual1.clave != clave1) {
            anterior1 = actual1;
            actual1 = actual1.siguiente;
        }

        Nodo anterior2 = null, actual2 = cabeza;
        while (actual2 != null && actual2.clave != clave2) {
            anterior2 = actual2;
            actual2 = actual2.siguiente;
        }

        // Verificar si se encontraron ambos nodos
        if (actual1 == null || actual2 == null) {
            // Al menos uno de los nodos no fue encontrado
            return;
        }

        // Actualizar los punteros para intercambiar los nodos
        if (anterior1 != null) {
            anterior1.siguiente = actual2;
        } else {
            cabeza = actual2;
        }

        if (anterior2 != null) {
            anterior2.siguiente = actual1;
        } else {
            cabeza = actual1;
        }

        Nodo temp = actual1.siguiente;
        actual1.siguiente = actual2.siguiente;
        actual2.siguiente = temp;
    }
}