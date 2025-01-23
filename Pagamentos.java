public class Pagamentos implements Beneficio {
     @Override
     public double calcula_Beneficios(double salario_Base){
          
          
          valor_hora_normal = salario_Base / horas_trabalhadas;
          valor_hora_extra = valor_hora_normal * 1,5 * hora_extras;

          //comissao
          //valor_comissao = vendas_realizada * 0.5 //5% percentual da comissao

          salario_bruto = salario_Base + valor_hora_extra;

          double inss = 0.11;
          double irrf = 0.15;
          //double vale_refeicao = 20;

          salario_liquido = salario_bruto - inss - irrf; // + vale_refeicao;



     }

}
