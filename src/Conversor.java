import javax.swing.JOptionPane;

class Conversor {

	static class Variables {

		static int continuar;

		static String opcionElegida;

	}

	public static void main(String[] args) {

		while (Variables.continuar != 1) {

			VentanaMenuPrincipal vmp = new VentanaMenuPrincipal();

			OpcionesMenuPrincipal omp = new OpcionesMenuPrincipal();

			vmp.menuPrincipal(omp);

			SegundoMenu sm = new SegundoMenu(vmp.getOpcionElegida());

			Variables.opcionElegida = vmp.getOpcionElegida();

			if (Variables.opcionElegida != null) {

				sm.menuSecundario();
				


			}

			Variables.continuar = JOptionPane.showConfirmDialog(null, "¿deseas continuar?");

		}

		JOptionPane.showMessageDialog(null, "Programa finalizado");

	}
}
