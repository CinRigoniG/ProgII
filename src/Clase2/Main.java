public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Estudiante estudiante1 = new Estudiante("Cinthia", "Rigoni", "Programacion", 7.5);

        estudiante1.mostrarInfo();

        estudiante1.subirCalificacion(5.0);
        System.out.println("Calificacion: "+estudiante1.getCalificacion());

        estudiante1.bajarCalificacion(4.5);
        System.out.println("Calificacion: "+estudiante1.getCalificacion());

    }
}   