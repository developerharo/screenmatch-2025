public class Principal {
    public static void main(String[] args) {
        Pelicula miPelicula = new Pelicula();
        miPelicula.nombre = "Titanic";
        miPelicula.fechaDeLanzamiento = 1997;
        miPelicula.duracionEnMinutos = 120;

        System.out.println("Película: " + miPelicula.nombre);
        System.out.println("Año estreno: " + miPelicula.fechaDeLanzamiento);

        Pelicula otraPelicula = new Pelicula();
        otraPelicula.nombre = "Matrix";
        otraPelicula.fechaDeLanzamiento = 1998;
        otraPelicula.duracionEnMinutos = 110;

        System.out.println("Otra Película: " + otraPelicula.nombre);
        System.out.println("Año estreno:  " + otraPelicula.fechaDeLanzamiento);


    }
}

