import javax.swing.JOptionPane;

public class SegundoMenu {

	private String tipoConversor;

	public SegundoMenu(String tipoConversor) {

		this.tipoConversor = tipoConversor;
	}

	public void menuSecundario() {

		MensajeValorConversion mvc = new MensajeValorConversion();

		if (tipoConversor == "Conversor de Moneda") {

			ConversorMoneda cm = new ConversorMoneda();

			cm.convierteMoneda();

			String opcionMoneda = cm.getMonedaElegida();

			if (opcionMoneda != null) {

				VentanaIngresoMoneda vim = new VentanaIngresoMoneda();

				if (vim.verificaValor()) {

					cm.conversores(opcionMoneda, vim.getSumaConvertida());

					mvc.muestraResultadoMonedas(cm.getValorConversion(), cm.getNombreUnidadMedidaEquivalente());

				} else {
					JOptionPane.showMessageDialog(null, "Usted ha ingresado un valor inválido");
				}

			}
		} else {
			ConversorTemperatura ct = new ConversorTemperatura();

			ct.convierteTemperatura();

			String opcionTemperatura = ct.getTemperaturaElegida();

			if (opcionTemperatura != null) {

				VentanaIngresoTemperatura vit = new VentanaIngresoTemperatura();

				if (vit.verificaValor()) {

					ct.conversores(opcionTemperatura, vit.getTemperaturaConvertida());

					mvc.muestraResultadoTemperaturas(ct.getValorConversion(), vit.getTemperaturaConvertida(),
							ct.getNombreUnidadMedidaConvertida(), ct.getNombreUnidadMedidaEquivalente());

				} else {
					JOptionPane.showMessageDialog(null, "Usted ha ingresado un valor inválido");
				}
			}
		}

	}
}
