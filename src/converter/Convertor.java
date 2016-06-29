package converter;

public class Convertor {
	private double doller;
	private double celsius;
	

	public void setDoller(double doller) {
		this.doller = doller;
	}


	public void setCelsius(double celsius) {
		this.celsius = celsius;
	}


	public double convert_it(char ch ){
		if(ch=='R'){
		double rupees = doller*64.0;
		return rupees;
		}
		else if(ch=='F'){
			double fahr = (1.8*celsius) + 32.0;
			return fahr;
		}
		else {
			return 0.0;
		}
			
	}
	
}