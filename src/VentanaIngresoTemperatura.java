import javax.swing.JOptionPane;

public class VentanaIngresoTemperatura implements VentanaIngresoCantidad {

	double temperaturaAConvertir;

	double temperaturaConvertida;

	public double getTemperaturaConvertida() {
		return temperaturaConvertida;
	}

	public boolean verificaValor() {
		String temperaturaAConvertir = JOptionPane
				.showInputDialog("Ingresa la temperatura" + " que deseas comvertir: ");

		try {
			temperaturaConvertida = Integer.parseInt(temperaturaAConvertir);

			return true;

		} catch (NumberFormatException ex) {
			ex.printStackTrace();
			return false;
		}

	}
}
