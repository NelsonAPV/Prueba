package primero;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Fecha.enumMes enumMes = Fecha.enumMes.ENERO; 
		
		Fecha objFecha1 = new Fecha(enumMes);
		
		objFecha1.setDia(15);
		objFecha1.setAnyo(2020);
		
		System.out.println("Primera fecha, inicializada con el primer constructor");
		
		System.out.println("La fecha en formato largo es: "+objFecha1.devolverFecha());

		String f1 = (objFecha1.isSummer())?"Es verano":"No es verano";
		System.out.println(f1 + "\n");
		
		//segunda instancia del objeto Fecha
		System.out.println("Segunda fecha, inicializada con el segundo constructor");
		Fecha objFecha2 = new Fecha(17,enumMes.JULIO,2021);
		
		System.out.println("El año es: "+ objFecha2.getAnyo());
		
		System.out.println("La fecha en formato largo es: "+objFecha2.devolverFecha());

		String f2 = (objFecha1.isSummer())?"No es verano":"Es verano";
		System.out.println(f2);
	}

}
