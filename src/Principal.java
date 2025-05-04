import com.aluracursos.screenmatch.herencia.Cuenta;
import com.aluracursos.screenmatch.modelos.Pelicula;

public class Principal {
    public static void main(String[] args) {
        Pelicula miPelicula = new Pelicula();
        miPelicula.setNombre("Encanto");
        miPelicula.setFechaDeLanzamiento(2021);
        miPelicula.setDuracionEnMinutos(120);
        miPelicula.setIncluidoEnElPlan(true);

        miPelicula.muestraFichaTecnica();
        miPelicula.evalua(10);
        miPelicula.evalua(10);
        miPelicula.evalua(7.8);
        System.out.println(miPelicula.getTotalDelasEvaluaciones());
        System.out.println(miPelicula.calculaMedia());
    }

    public static class CuentaAhorro extends Cuenta {

        private double tasaDeIntereses;

        /*public void calcularIntereses() {
            double intereses= this.getSaldo() * tasaDeIntereses;
            System.out.println("Intereses actuales : " + intereses);
        }*/

        public void retirar(double valor) {
            double tasaDeRetiro= 0.01;
            super.retirar(valor + tasaDeRetiro);
        }

        //getters y setters
    }
}