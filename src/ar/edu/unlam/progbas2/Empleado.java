package ar.edu.unlam.progbas2;

public class Empleado {
	private String nombre;
	private Integer salario;
	private Integer fechaDeCumplea�os;
	private String sector;


public Empleado(String nombre,Integer salario,Integer fechaDeCumplea�os,String sector){
	this.nombre = nombre;
	this.salario = salario;
	this.fechaDeCumplea�os = fechaDeCumplea�os;
	this.sector = sector;
}


public String getNombre() {
	return nombre;
}


public void setNombre(String nombre) {
	this.nombre = nombre;
}


public Integer getSalario() {
	return salario;
}


public void setSalario(Integer salario) {
	this.salario = salario;
}


public Integer getFechaDeCumplea�os() {
	return fechaDeCumplea�os;
}


public void setFechaDeCumplea�os(Integer fechaDeCumplea�os) {
	this.fechaDeCumplea�os = fechaDeCumplea�os;
}


public String getSector() {
	return sector;
}


public void setSector(String sector) {
	this.sector = sector;
}

}