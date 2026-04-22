package polimorfismo;

public class Estudiante extends Persona {

    String carnet, carrera;

    public Estudiante(String nombre, String carnet, String carrera) {
        super(nombre);
        this.carnet = carnet;
        this.carrera = carrera;
    }

    @Override
    public void presentarse() {
        System.out.println("Soy " + nombre + ", carnet: " + carnet + ", carrera: " + carrera);
    }
}