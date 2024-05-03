public class Estudiante {

        String nombre;
        int edad;
    int carrera;
        double promedio;
//Constructores, getters, setters, etc


    public Estudiante() {
    }

    public Estudiante(String nombre, int edad, int carrera, double promedio) {
        this.nombre = nombre;
        this.edad = edad;
        this.carrera = carrera;
        this.promedio = promedio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getCarrera() {
        return carrera;
    }

    public void setCarrera(int carrera) {
        this.carrera = carrera;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    public String toString() {
        return "{"+ '\n' +
                " nombre=" + nombre + '\n' +
                " edad=" + edad +'\n' +
                " carrera=" + carrera +'\n' +
                " promedio=" + promedio +'\n' +
                '}';
    }
}


