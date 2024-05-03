import java.util.List;

public class Main {
    public static void main(String[] args) {
        ListaEstudiante listaEstudiante = new ListaEstudiante();
        // Mostrar la información de todos los estudiantes
        System.out.println("Información de los estudiantes:");
        for (Estudiante estudiante : listaEstudiante.estudiantes) {
            System.out.println(estudiante);
//Completar
    }
        ListaCarrera listaCarrera= new ListaCarrera();
        // Mostrar información de las carreras
        System.out.println('\n'+"Información de las carreras: ");
        for (Carrera carrera : listaCarrera.carreras){
            System.out.println(carrera);
        }
        // Calcular reportes por carrera
        List<PromedioCarrera> reportesCarrera =
                ListaPromedio.calcularpromedios(listaEstudiante, listaCarrera);
        System.out.println('\n'+"Información de sus promedios por carrera: ");
        // Imprimir reportes
        ListaPromedio.imprimirPromedio(reportesCarrera);
}
}
