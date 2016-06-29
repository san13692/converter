package converter;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Convertor cn = new Convertor();
		cn.setCelsius(23.0);
		cn.setDoller(2.5);
		
		double rupees = cn.convert_it('R');
		System.out.println("Dollar 2.5 to rupee is "+ rupees);
		
		double fahr = cn.convert_it('F');
		System.out.println("Celsius to fahrenht is "+ fahr);
		
		
	}

}
