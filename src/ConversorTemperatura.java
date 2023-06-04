public class ConversorTemperatura {

	private double valorConversion;

	private String nombreUnidadMedidaEquivalente;

	private String nombreUnidadMedidaConvertida;

	private String temperaturaElegida;

	private double valorIngresado;

	public void conversores(String tipo, double valorIngresado) {

		switch (tipo) {

		case "Celsius a Farenheit":

			CelsiusAFarenheit caf = new CelsiusAFarenheit(valorIngresado);

			valorConversion = caf.celsiusAFarenheit();

			nombreUnidadMedidaConvertida = "Celsius";

			nombreUnidadMedidaEquivalente = "Farenheit";

			break;

		case "Celsius a Kelvin":

			CelsiusAKelvin cak = new CelsiusAKelvin(valorIngresado);

			valorConversion = cak.celsiusAKelvin();

			nombreUnidadMedidaConvertida = "Celsius";

			nombreUnidadMedidaEquivalente = "Kelvin";

			break;

		case "Farenheit a Celsius":

			FarenheitACelsius fac = new FarenheitACelsius(valorIngresado);

			valorConversion = fac.farenheitACelsius();

			nombreUnidadMedidaConvertida = "Farenheit";

			nombreUnidadMedidaEquivalente = "Celsius";

			break;

		case "Kelvin a Celsius":

			KelvinACelsius kac = new KelvinACelsius(valorIngresado);

			valorConversion = kac.kelvinACelsius();

			nombreUnidadMedidaConvertida = "Kelvin";

			nombreUnidadMedidaEquivalente = "Celsius";

			break;

		}
	}

	public void convierteTemperatura() {

		VentanaMenuConversionTemperatura vmct = new VentanaMenuConversionTemperatura();

		OpcionesConversionTemperaturas ot = new OpcionesConversionTemperaturas();

		vmct.setTemperaturaElegida(ot);

		temperaturaElegida = vmct.getTemperaturaElegida();

	}

	public double getValorConversion() {
		return valorConversion;
	}

	public String getNombreUnidadMedidaEquivalente() {
		return nombreUnidadMedidaEquivalente;
	}

	public String getNombreUnidadMedidaConvertida() {
		return nombreUnidadMedidaConvertida;
	}

	public String getTemperaturaElegida() {
		return temperaturaElegida;
	}

	public double getValorIngresado() {
		return valorIngresado;
	}
}
