public class PromedioCarrera {
    private Carrera carrera;
    private double promedioNotas;
    private double promedioEdadEstudiantes;

    public PromedioCarrera() {
    }

    public PromedioCarrera(Carrera carrera, double promedioNotas, double promedioEdadEstudiantes) {
        this.carrera = carrera;
        this.promedioNotas = promedioNotas;
        this.promedioEdadEstudiantes = promedioEdadEstudiantes;
    }

    public Carrera getCarrera() {
        return carrera;
    }

    public void setCarrera(Carrera carrera) {
        this.carrera = carrera;
    }

    public double getPromedioNotas() {
        return promedioNotas;
    }

    public void setPromedioNotas(double promedioNotas) {
        this.promedioNotas = promedioNotas;
    }

    public double getPromedioEdadEstudiantes() {
        return promedioEdadEstudiantes;
    }

    public void setPromedioEdadEstudiantes(double promedioEdadEstudiantes) {
        this.promedioEdadEstudiantes = promedioEdadEstudiantes;
    }
}
