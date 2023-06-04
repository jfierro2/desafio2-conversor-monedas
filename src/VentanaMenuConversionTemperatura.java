import javax.swing.JOptionPane;

public class VentanaMenuConversionTemperatura {

	private String temperaturaElegida;

	public String getTemperaturaElegida() {
		return temperaturaElegida;
	}

	public void setTemperaturaElegida(OpcionesConversionTemperaturas opcionesTemperaturas) {

		temperaturaElegida = (String) JOptionPane.showInputDialog(null, "Seleccione una opcion de conversión", "Menu",
				JOptionPane.QUESTION_MESSAGE, null, opcionesTemperaturas.getOpcionesConversionTemperaturas(),
				opcionesTemperaturas.getOpcionesConversionTemperaturas()[0]);

	}

}
