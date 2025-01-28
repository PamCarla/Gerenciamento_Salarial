public class ContraCheque {
     private Funcionario funcionario;
     private String data_geracao;
     private Beneficio calcular_Beneficios;



public ContraCheque(Funcionario fucionario,String data_geracao,Beneficio calcular_Beneficios){

     this.Funcionario=Funcionario;
     this.data_geracao=data_geracao;
     this.Beneficio=calcular_Beneficios;

}


public void setFuncionario(Funcionario){
     this.Funcionario=Funcionario;
}
public Funcionario getFuncionario(){
return Funcionario;
}

     public void setdata_geracao(String data_geracao){
          this.data_geracao=data_geracao;
     }
     public String get data_geracao(){
          return  data_geracao;

     }
public void setcalcular_Beneficios(String calcular_Beneficios){
     this.calcular_Beneficios=calcular_Beneficios;
}

public Beneficio getcalcular_Beneficio(){
     return calcular_Beneficios;
}

     public void gerarContracheque(){
          double imposto = calcular_Beneficios.calcular_Benecifios(funcionario.getSalario_Base());


          
          

     }

}
