
public class FarenheitACelsius {
	
	double gradosFarenheit;
	
	public FarenheitACelsius(double gradosFarenheit) {
		
		this.gradosFarenheit = gradosFarenheit;
		
		
	}
	
	public double farenheitACelsius() {
		
		double FarenheitACelsius = Math.round((gradosFarenheit - 32)/1.8);
		
		return FarenheitACelsius;
		
		
		
	}


}
