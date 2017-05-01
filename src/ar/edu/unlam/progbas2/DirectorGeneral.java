package ar.edu.unlam.progbas2;

public class DirectorGeneral extends Gerente {
	private Integer plusSalario;
	
public DirectorGeneral(String nombre,Integer salario,Integer fechaDeCumpleaños,String sector, Integer numeroDeCochera, Integer plusSalario){
	super(nombre, salario, fechaDeCumpleaños, sector, numeroDeCochera);
	this.plusSalario = plusSalario;
}

public Integer getPlusSalario() {
	return plusSalario;
}

public void setPlusSalario(Integer plusSalario) {
	this.plusSalario = plusSalario;
}

}
