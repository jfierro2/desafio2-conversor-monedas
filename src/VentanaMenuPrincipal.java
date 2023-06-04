import javax.swing.JOptionPane;

public class VentanaMenuPrincipal {

	private String opcionElegida;

	public String getOpcionElegida() {
		return opcionElegida;
	}

	public void menuPrincipal(OpcionesMenuPrincipal opciones) {

		opcionElegida = (String) JOptionPane.showInputDialog(null, "Seleccione una opcion de conversión", "Menu",
				JOptionPane.QUESTION_MESSAGE, null, opciones.getOpcionesMenuPrincipal(),
				opciones.getOpcionesMenuPrincipal()[0]);

	}
}
