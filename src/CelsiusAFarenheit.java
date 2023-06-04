
public class CelsiusAFarenheit{
	
	double gradosCelsius;
	
	public CelsiusAFarenheit(double gradosCelsius) {
		
		this.gradosCelsius = gradosCelsius;
		
		
	}
	
	public double celsiusAFarenheit() {
		
		double CelsiusAFarenheit = Math.round(gradosCelsius*1.8 + 32);
		
		return CelsiusAFarenheit;
		
		
		
	}

}
