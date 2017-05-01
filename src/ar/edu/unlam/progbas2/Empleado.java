package ar.edu.unlam.progbas2;

public class Empleado {
	private String nombre;
	private Integer salario;
	private Integer fechaDeCumpleaños;
	private String sector;


public Empleado(String nombre,Integer salario,Integer fechaDeCumpleaños,String sector){
	this.nombre = nombre;
	this.salario = salario;
	this.fechaDeCumpleaños = fechaDeCumpleaños;
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


public Integer getFechaDeCumpleaños() {
	return fechaDeCumpleaños;
}


public void setFechaDeCumpleaños(Integer fechaDeCumpleaños) {
	this.fechaDeCumpleaños = fechaDeCumpleaños;
}


public String getSector() {
	return sector;
}


public void setSector(String sector) {
	this.sector = sector;
}

}