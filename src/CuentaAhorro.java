import com.aluracursos.screenmatch.herencia.Cuenta;

public class CuentaAhorro extends Cuenta{

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