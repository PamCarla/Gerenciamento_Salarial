public class ContraCheque {
     private Funcionario funcionario;
     private String dataGeracao;
     private Beneficio calcularBeneficios;
 
     public ContraCheque(Funcionario funcionario, String dataGeracao, Beneficio calcularBeneficios) {
         this.funcionario = funcionario;
         this.dataGeracao = dataGeracao;
         this.calcularBeneficios = calcularBeneficios;
     }
 
     public void setFuncionario(Funcionario funcionario) {
         this.funcionario = funcionario;
     }
 
     public Funcionario getFuncionario() {
         return funcionario;
     }
 
     public void setDataGeracao(String dataGeracao) {
         this.dataGeracao = dataGeracao;
     }
 
     public String getDataGeracao() {
         return dataGeracao;
     }
 
     public void setCalcularBeneficios(Beneficio calcularBeneficios) {
         this.calcularBeneficios = calcularBeneficios;
     }
 
     public Beneficio getCalcularBeneficios() {
         return calcularBeneficios;
     }
 
     public void gerarContracheque() {
         if (calcularBeneficios != null && funcionario != null) {
             double beneficios = calcularBeneficios.calcula_Beneficios(funcionario.getSalarioBase());
             // Aqui você adicionaria a lógica para calcular impostos, descontos, etc.
             // E também a lógica para exibir o contracheque.
             System.out.println("Contracheque para: " + funcionario.getNome());
             System.out.println("Benefícios: " + beneficios);
             // ... mais detalhes do contracheque ...
         } else {
             System.out.println("Erro: Funcionário ou cálculo de benefícios não inicializados.");
         }
     }
 }