package sistema;

public class Funcionario  extends Pessoa {
	
                         private int id_Funcionario;
                         private String cargo;
			 private String  Lista_Registro;
			 private double Salario_Base;
			 private String Conta_Bancaria;
			 private String matricula;
			
			
			 Funcionario(String cargo ,StringLista_Registro ,double Salario_Base,String Conta_Bancaria,String matricula ){
				 
				this.cargo=cargo;
				this.Lista_Registro=Lista_Registro
				this.Salario_Base=Salario_Base;
				this.Conta_Bancaria=Conta_Bancaria;
				this.matricula =matricula;
			 }
			 
			//MÉTODOS
	
			 
			 //MÉTODOS GET E SET
			 
			 public void setcargo(String cargo) {
				 this.cargo=cargo;
			 }
			 public String getcargo() {
				 return cargo;
			 }
			 public void setLista_Registro(String Lista_Registro) {
					this.Lista_Registro=Lista_Registro;
			}
			 public double  getLista_Registro() {
					 return Lista_Registro;
			}
			 public void setSalario_Base(double Salario_Base) {
				 this.Salario_Base=Salario_Base;
			 }
			 public String getConta_Bancaria() {
				 return Conta_Bancaria;
			 }
			 public void setmatricula (String matricula) {
				 this.matricula=matricula;
			 }
	
				 

 
}
}


}
