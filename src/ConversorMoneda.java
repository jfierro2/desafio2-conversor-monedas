public class ConversorMoneda {

	private double valorConversion;

	private String nombreUnidadMedidaEquivalente;

	private String monedaElegida;

	public void conversores(String tipo, double valorIngresado) {

		switch (tipo) {

		case "De Pesos a Dólares":

			TipoConversor pad = new PesosADolares(490);

			valorConversion = pad.conversionMoneda(valorIngresado);

			nombreUnidadMedidaEquivalente = "Dolares";

			break;

		case "De Pesos a Euros":

			TipoConversor pae = new PesosAEuros(215);

			valorConversion = pae.conversionMoneda(valorIngresado);

			nombreUnidadMedidaEquivalente = "Euros";

			break;

		case "De Pesos a Libras":

			TipoConversor pal = new PesosALibras(416);

			valorConversion = pal.conversionMoneda(valorIngresado);

			nombreUnidadMedidaEquivalente = "Libras";

			break;
		}

	}

	public void convierteMoneda() {

		VentanaMenuConversionMoneda vmcm = new VentanaMenuConversionMoneda();

		OpcionesConversionMonedas om = new OpcionesConversionMonedas();

		vmcm.setMonedaElegida(om);

		monedaElegida = vmcm.getMonedaElegida();

	}

	public double getValorConversion() {
		return valorConversion;
	}

	public String getNombreUnidadMedidaEquivalente() {
		return nombreUnidadMedidaEquivalente;
	}

	public String getMonedaElegida() {
		return monedaElegida;
	}

}