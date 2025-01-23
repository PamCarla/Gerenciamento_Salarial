public abstract class Conta_Bancaria {
	
	private String numero_conta;
	private String agencia;
	private double sacar;
	public abstract void sacar();
		
		Conta_Bancaria(String numero_conta,String agencia,double sacar){

			this.numero_conta=numero_conta;
			this.agencia=agencia;
			this.sacar=sacar;
}

		public String getNumero_conta() {
			return numero_conta;
		}

		public void setNumero_conta(String numero_conta) {
			this.numero_conta = numero_conta;
		}

		public String getAgencia() {
			return agencia;
		}

		public void setAgencia(String agencia) {
			this.agencia = agencia;
		}

		public double getSacar() {
			return sacar;
		}

		public void setSacar(double sacar) {
			this.sacar = sacar;
		}
		
	}
	
