package sistema;

public class Funcionario  extends Pessoa {
	
                         private String cargo;
			 private String lista_Registro;
			 private double salario_Base;
			 private String Conta_Bancaria;
			 private String matricula;
			
			
			 Funcionario(String cargo, String lista_Registro, double salario_Base, String Conta_Bancaria, String matricula ){
				super(nome, cpf, data_nascimento, endereco);
				this.cargo = cargo;
				this.lista_Registro = lista_Registro
				this.salario_Base = salario_Base;
				this.Conta_Bancaria = Conta_Bancaria;
				this.matricula = matricula;
			 }
			 
			//MÉTODOS
	
			 
			 //MÉTODOS GET E SET
			 
			 public void setCargo (String cargo) {
				 this.cargo = cargo;
			 }
			 public String getCargo() {
				 return this.cargo;
			 }
			 public void setLista_Registro(String lista_Registro) {
				this.lista_Registro = lista_Registro;
			}
			 public double  getLista_Registro() {
				return this.lista_Registro;
			}
			 public void setSalario_Base(double salario_Base) {
				 this.salario_Base = salario_Base;
			 }
			 public String getConta_Bancaria() {
				 return this.Conta_Bancaria;
			 }
			 public void setMatricula (String matricula) {
				 this.matricula = matricula;
			 }
			public String getMatricula(){
				return this.matricula;
			}
	
				 

 
}
}


}
