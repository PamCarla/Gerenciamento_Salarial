public class ContraCheque {
     private Funcionario funcionario;
     private String data_geracao;
     private Beneficio calcular_Beneficios;

     public void gerarContracheque(){
          double imposto = calcular_Beneficios.calcular_Benecifios(funcionario.getSalario_Base());

     }

}
