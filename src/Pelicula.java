public class Pelicula {
    String nombre;
    int fechaDeLanzamiento;
    int duracionEnMinutos;
    boolean incluidoEnElPlan;
    double sumaDeLasEvaluaciones;
    int totalDeLasEvaluaciones;

    void muestraFichaTecnica() {
        System.out.println("Película: " + nombre);
        System.out.println("Año de estreno: " + fechaDeLanzamiento);
        System.out.println("Duración en minutos: " +duracionEnMinutos);
    }

    void evalua(double nota) {
        sumaDeLasEvaluaciones += nota;
        totalDeLasEvaluaciones++;
    }

    double calculaMedia() {
        return sumaDeLasEvaluaciones / totalDeLasEvaluaciones;
    }
}
