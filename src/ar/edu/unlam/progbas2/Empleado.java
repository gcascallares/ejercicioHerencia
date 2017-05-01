package ar.edu.unlam.progbas2;

public class Empleado {
	private String nombre;
	private Integer salario;
	private Integer fechaDeCumpleaņos;
	private String sector;


public Empleado(String nombre,Integer salario,Integer fechaDeCumpleaņos,String sector){
	this.nombre = nombre;
	this.salario = salario;
	this.fechaDeCumpleaņos = fechaDeCumpleaņos;
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


public Integer getFechaDeCumpleaņos() {
	return fechaDeCumpleaņos;
}


public void setFechaDeCumpleaņos(Integer fechaDeCumpleaņos) {
	this.fechaDeCumpleaņos = fechaDeCumpleaņos;
}


public String getSector() {
	return sector;
}


public void setSector(String sector) {
	this.sector = sector;
}

}