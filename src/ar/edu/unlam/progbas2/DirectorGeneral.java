package ar.edu.unlam.progbas2;

public class DirectorGeneral extends Gerente {
	private Integer plusSalario;
	
public DirectorGeneral(String nombre,Integer salario,Integer fechaDeCumplea�os,String sector, Integer numeroDeCochera, Integer plusSalario){
	super(nombre, salario, fechaDeCumplea�os, sector, numeroDeCochera);
	this.plusSalario = plusSalario;
}

public Integer getPlusSalario() {
	return plusSalario;
}

public void setPlusSalario(Integer plusSalario) {
	this.plusSalario = plusSalario;
}

}
