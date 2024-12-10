public class Tareas {

    public static void imprimirLista() {
        System.out.println("Lista de tareas:");
        System.out.println("1. Ir al gimnasio");
        System.out.println("2. Estudiar");
        System.out.println("3. Ver One Piece");
    }

    public static void agregarTarea(String tarea) {
        System.out.println("Tarea agregada: " + tarea);
    }

    public static void main(String[] args) {
        imprimirLista();
        agregarTarea("Dormir");
    }
}
