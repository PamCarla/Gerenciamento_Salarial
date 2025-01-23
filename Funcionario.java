package sistema;

public class Funcionario  extends Usuario {
	private String cargo;
	private String lista_Registro;
	private double salario_Base;
	private String Conta_Bancaria;
	private String matricula;
	private double valor_hora_normal;
	private double valor_hora_extra;
	private int horas_trabalhadas;
	private double salario_bruto;
	
			
			
	Funcionario(String cargo, String lista_Registro, double salario_Base, String Conta_Bancaria, String matricula, double valor_hora_normal,double valor_hora_extra, int horas_trabalhadas, double salario_bruto){
		super(login, senha, email, contato);
		this.cargo = cargo;
		this.lista_Registro = lista_Registro
		this.salario_Base = salario_Base;
		this.Conta_Bancaria = Conta_Bancaria;
		this.matricula = matricula;
		this.valor_hora_normal = valor_hora_normal;
		this.valor_hora_extra = valor_hora_extra;
		this.horas_trabalhadas = horas_trabalhadas;
		this.salario_bruto = salario_bruto;
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
		public void setValor_hora_normal (double valor_hora_normal){
			this.valor_hora_normal = valor_hora_normal;
		}
		public double getValor_hora_normal(){
			return this.valor_hora_normal;
		}
		public void setValor_hora_extra (double valor_hora_extra){
			this.valor_hora_extra = valor_hora_extra;
		}
		public double getValor_hora_extra(){
			return this.valor_hora_extra;
		}
		public void setHoras_trabalhadas( int horas_trabalhadas){
			this.horas_trabalhadas = horas_trabalhadas;
		}
		public int getHoras_trabalhadas(){
			return this.horas_trabalhadas;
		}
		public void setSalario_bruto(double salario_bruto){
			this.salario_bruto = salario_bruto;
		}
				 

 
}
}


}
