package ar.edu.unlam.progbas2;

public class Gerente extends Empleado {
	private Integer numeroDeCochera;
	
public Gerente(String nombre,Integer salario,Integer fechaDeCumpleaños,String sector, Integer cochera){
	super(nombre, salario, fechaDeCumpleaños, sector);
	this.numeroDeCochera = cochera;
}

public Integer getNumeroDeCochera() {
	return numeroDeCochera;
}

public void setNumeroDeCochera(Integer cochera) {
	this.numeroDeCochera = cochera;
}

}
