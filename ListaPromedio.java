import java.util.ArrayList;
import java.util.List;

public class ListaPromedio {

    // Método para calcular los promedio por carrera
    public static List<PromedioCarrera> calcularpromedios(ListaEstudiante listaEstudiante, ListaCarrera listaCarrera) {
        List<PromedioCarrera> calcularpromedio = new ArrayList<>();

        for (Carrera carrera : listaCarrera.getCarreras()) {
            double sumaNotas = 0;
            double sumaEdades = 0;
            int cantidadEstudiantes = 0;

            for (Estudiante estudiante : listaEstudiante.getEstudiantes()) {
                if (estudiante.getCarrera() == carrera.getCodigo()) {
                    sumaNotas += estudiante.getPromedio();
                    sumaEdades += estudiante.getEdad();
                    cantidadEstudiantes++;
                }
            }

            double promedioNotas = sumaNotas / Math.max(cantidadEstudiantes, 1);
            double promedioEdades = sumaEdades / Math.max(cantidadEstudiantes, 1);


            calcularpromedio.add(new PromedioCarrera(carrera, promedioNotas, promedioEdades));
        }

        return calcularpromedio;
    }

    public static void imprimirPromedio(List<PromedioCarrera> reportesCarrera) {

        for (PromedioCarrera reporte : reportesCarrera) {
            System.out.println("Carrera: " + reporte.getCarrera().getNombre());
            System.out.println("Promedio de notas: " + reporte.getPromedioNotas());
            System.out.println("Promedio de edades: " + reporte.getPromedioEdadEstudiantes());
            System.out.println();
        }
    }
}
