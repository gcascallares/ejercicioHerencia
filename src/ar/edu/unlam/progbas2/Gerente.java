package ar.edu.unlam.progbas2;

public class Gerente extends Empleado {
	private Integer numeroDeCochera;
	
public Gerente(String nombre,Integer salario,Integer fechaDeCumpleaņos,String sector, Integer cochera){
	super(nombre, salario, fechaDeCumpleaņos, sector);
	this.numeroDeCochera = cochera;
}

public Integer getNumeroDeCochera() {
	return numeroDeCochera;
}

public void setNumeroDeCochera(Integer cochera) {
	this.numeroDeCochera = cochera;
}

}
