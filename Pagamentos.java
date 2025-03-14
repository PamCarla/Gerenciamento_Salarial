public class Pagamentos implements Beneficio {

    private double horasTrabalhadas;
    private double valorHoraExtra;
    private double inss;
    private double irrf;

    public Pagamentos(double horasTrabalhadas, double valorHoraExtra, double inss, double irrf) {
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorHoraExtra = valorHoraExtra;
        this.inss = inss;
        this.irrf = irrf;
    }

    @Override
    public double calcula_Beneficios(double salarioBase) {
        double valorHoraNormal = salarioBase / horasTrabalhadas;
        double valorHorasExtras = valorHoraNormal * 1.5 * valorHoraExtra;
        double salarioBruto = salarioBase + valorHorasExtras;
        double salarioLiquido = salarioBruto - (salarioBruto * inss) - (salarioBruto * irrf);
        return salarioLiquido;
    }

    public void setHorasTrabalhadas(double horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public double getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setValorHoraExtra(double valorHoraExtra) {
        this.valorHoraExtra = valorHoraExtra;
    }

    public double getValorHoraExtra() {
        return valorHoraExtra;
    }

    public void setInss(double inss) {
        this.inss = inss;
    }

    public double getInss() {
        return inss;
    }

    public void setIrrf(double irrf) {
        this.irrf = irrf;
    }

    public double getIrrf() {
        return irrf;
    }
}