public class Pagamento implements Beneficio {

    @Override
    public double calcula_Beneficios(double salario_Base) {
        double horas_trabalhadas = 160; // Exemplo de horas trabalhadas
        double valor_hora_normal = salario_Base / horas_trabalhadas;

        double hora_extras = 10; // Exemplo de horas extras trabalhadas
        double valor_hora_extra = valor_hora_normal * 1.5 * hora_extras;

        // Cálculo do salário bruto
        double salario_bruto = salario_Base + valor_hora_extra;

        // Descontos
        double inss = 0.11;
        double irrf = 0.15;
        //double vale_refeicao = 20;
        // Cálculo do salário líquido
        
        double salario_liquido = salario_bruto - (salario_bruto * inss) - (salario_bruto * irrf); // + vale_refeicao;
        
        return salario_liquido;
    }
}
