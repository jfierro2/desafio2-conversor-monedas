import javax.swing.JOptionPane;

public class VentanaIngresoMoneda implements VentanaIngresoCantidad {

	double sumaAConvertir;

	double sumaConvertida;

	public boolean verificaValor() {
		String sumaAConvertir = JOptionPane
				.showInputDialog("Ingresa la cantidad de " + "dinero que deseas convertir: ");

		try {
			sumaConvertida = Integer.parseInt(sumaAConvertir);

			return true;

		} catch (NumberFormatException ex) {
			ex.printStackTrace();
			return false;
		}
	}

	public double getSumaConvertida() {
		return sumaConvertida;
	}

}
