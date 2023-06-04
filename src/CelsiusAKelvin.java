
public class CelsiusAKelvin {
	
	double gradosCelsius;
	
	public CelsiusAKelvin(double gradosCelsius) {
		
		this.gradosCelsius = gradosCelsius;
		
		
	}
	
	public double celsiusAKelvin() {
		
		double CelsiusAKelvin = Math.round(gradosCelsius + 273.15);
		
		return CelsiusAKelvin;
		
		
		
	}

}
