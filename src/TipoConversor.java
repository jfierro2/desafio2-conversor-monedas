
public abstract class TipoConversor {

	private double monedaConvertida;

	private int valorMoneda;

	private double cantidadAConvertir;

	public TipoConversor(int valorMoneda) {

		this.valorMoneda = valorMoneda;

	}

	public int getValorMoneda() {
		return valorMoneda;
	}

	public void setValor(int valorMoneda) {
		this.valorMoneda = valorMoneda;
	}

	public double getCantidadAConvertir() {
		return cantidadAConvertir;
	}

	public double getMonedaConvertida() {
		return monedaConvertida;
	}

	public double conversionMoneda(double cantidadAConvertir) {

		monedaConvertida = cantidadAConvertir / valorMoneda;

		monedaConvertida = Math.round(monedaConvertida);

		return monedaConvertida;

	}

}
