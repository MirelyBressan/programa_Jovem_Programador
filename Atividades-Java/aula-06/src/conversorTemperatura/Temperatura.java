/**Classe Temperatura:
Atributo: celsius.
Métodos: paraFahrenheit(), paraKelvin(). */

package conversorTemperatura;

public class Temperatura {

    double celsius;

    public double paraFahrenheit() {
        return (celsius * 9/5) + 32;
    }
    public double paraKelvin() {
        return celsius + 273.15;
    }
}
