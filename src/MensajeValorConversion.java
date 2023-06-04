import javax.swing.JOptionPane;

public class MensajeValorConversion {

	public void muestraResultadoMonedas(double valorConversion, String nombreMonedaEquivalente) {

		JOptionPane.showMessageDialog(null, "Tienes $ " + valorConversion + " " + nombreMonedaEquivalente);

	}

	public void muestraResultadoTemperaturas(double temperaturaEquivalente, double temperaturaConvertida,
			String nombreTemperaturaConvertida, String nombreTemperaturaEquivalente) {

		JOptionPane.showMessageDialog(null, temperaturaConvertida + " Grados " + nombreTemperaturaConvertida + " son "
				+ temperaturaEquivalente + " Grados " + nombreTemperaturaEquivalente);

	}

}
