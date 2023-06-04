import javax.swing.JOptionPane;

public class VentanaMenuConversionMoneda {

	private String monedaElegida;

	public String getMonedaElegida() {
		return monedaElegida;
	}

	public void setMonedaElegida(OpcionesConversionMonedas opcionesConversionMonedas) {

		monedaElegida = (String) JOptionPane.showInputDialog(null, "Seleccione una opcion de conversión", "Menu",
				JOptionPane.QUESTION_MESSAGE, null, opcionesConversionMonedas.getOpcionesConversionMonedas(),
				opcionesConversionMonedas.getOpcionesConversionMonedas()[0]);

	}
}
