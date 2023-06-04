
public class KelvinACelsius {
	
	double gradosKelvin;
	
	public KelvinACelsius(double gradosKelvin) {
		
		this.gradosKelvin = gradosKelvin;
		
		
	}
	
	public double kelvinACelsius() {
		
		double KelvinACelsius = Math.round(gradosKelvin - 273.15);
		
		return KelvinACelsius;	
		
	}
	

}
