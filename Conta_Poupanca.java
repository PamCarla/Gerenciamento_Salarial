public class Conta_Poupanca extends Conta_Bancaria {
     private double taxaRendimento;
 
     public Conta_Poupanca(String numeroConta, String agencia, double saldo, double taxaRendimento) {
         super(numeroConta, agencia, saldo);
         this.taxaRendimento = taxaRendimento;
     }
 
     @Override
     public void sacar(double valor) {
         if (valor > 0 && getSaldo() >= valor) {
             setSaldo(getSaldo() - valor);
             System.out.println("Saque de R$" + valor + " realizado com sucesso.");
         } else {
             System.out.println("Saldo insuficiente.");
         }
     }
 
     public void aplicarRendimento() {
         double rendimento = getSaldo() * taxaRendimento;
         setSaldo(getSaldo() + rendimento);
         System.out.println("Rendimento de R$" + rendimento + " aplicado.");
     }
 
     public double getTaxaRendimento() {
         return taxaRendimento;
     }
 
     public void setTaxaRendimento(double taxaRendimento) {
         this.taxaRendimento = taxaRendimento;
     }
 }