package primero;

public class Fecha {


	public enum enumMes
	{
		ENERO, FEBRERO,MARZO,ABRIL,MAYO,JUNIO,JULIO,AGOSTO
	}

	public int dia;
	public enumMes meses;
	public int anyo;

	public Fecha(enumMes mes) {

		this.dia = 0;
		this.meses = mes;
		this.anyo = 0;
	}

	Fecha (int dia, enumMes mes, int anio){

		this.dia = dia;
		this.meses = mes;
		this.anyo = anio;

	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public enumMes getMeses() {
		return meses;
	}

	public void setMeses(enumMes meses) {
		this.meses = meses;
	}

	public int getAnyo() {
		return anyo;
	}

	public void setAnyo(int anyo) {
		this.anyo = anyo;
	}

	public boolean isSummer(){  

		boolean esVerano = false;

		
		esVerano = (this.meses.toString().equals("JUNIO")
				|| this.meses.toString().equals("JULIO")
				||this.meses.toString().equals("AGOSTO"))?true:false;

		return esVerano;
	}


	public String devolverFecha (){
		//15 de julio de 2020
		String fecha = this.dia + " de "+ this.meses.toString()+ " de "+ this.anyo;

		return fecha;

	}


}
