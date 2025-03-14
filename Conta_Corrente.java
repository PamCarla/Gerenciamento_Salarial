public class Conta_Corrente extends Conta_Bancaria {
     private double limiteChequeEspecial;
 
     public Conta_Corrente(String numeroConta, String agencia, double saldo, double limiteChequeEspecial) {
         super(numeroConta, agencia, saldo);
         this.limiteChequeEspecial = limiteChequeEspecial;
     }
 
     @Override
     public void sacar(double valor) {
         if (valor > 0 && (getSaldo() + limiteChequeEspecial) >= valor) {
             setSaldo(getSaldo() - valor);
             System.out.println("Saque de R$" + valor + " realizado com sucesso.");
         } else {
             System.out.println("Saldo insuficiente.");
         }
     }
 
     public double getLimiteChequeEspecial() {
         return limiteChequeEspecial;
     }
 
     public void setLimiteChequeEspecial(double limiteChequeEspecial) {
         this.limiteChequeEspecial = limiteChequeEspecial;
     }
 }