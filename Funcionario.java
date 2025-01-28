public class Funcionario  extends Usuario {
	private String cargo;
	private double salario_base;
	private String matricula;
	private double valor_hora_normal;
	private double valor_hora_extra;
	private int horas_trabalhadas;
	private double salario_bruto;
	
			
			
	Funcionario( String nome, String cpf,String data_nascimento,String endereco, String login,String senha,String email, String contato, String cargo,  String matricula, String cargo1, String lista_Registro, double salario_Base, String Conta_Bancaria1, String matricula1, double valor_hora_normal, double valor_hora_extra, int horas_trabalhadas, double salario_bruto){
		super(null, null, null, null);
		this.cargo = cargo;
		this.salario_base = salario_Base;
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
		
		public void setSalario_Base(double salario_Base) {
			this.salario_base = salario_Base;
		}
		public double getSalario_Base() {
			return salario_base;
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

		public double getSalario_bruto() {
			return salario_bruto;
		}
}
