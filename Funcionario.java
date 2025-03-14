public class Funcionario extends Usuario {
    private String cargo;
    private double salarioBase;
    private String matricula;
    private double valorHoraNormal;
    private double valorHoraExtra;
    private int horasTrabalhadas;
    private double salarioBruto;

    public Funcionario(String nome, String cpf, String dataNascimento, String endereco, String login, String senha, String email, String contato, String cargo, String matricula, double salarioBase, double valorHoraNormal, double valorHoraExtra, int horasTrabalhadas, double salarioBruto) {
        super(nome, cpf, dataNascimento, endereco, login, senha, email, contato);
        this.cargo = cargo;
        this.salarioBase = salarioBase;
        this.matricula = matricula;
        this.valorHoraNormal = valorHoraNormal;
        this.valorHoraExtra = valorHoraExtra;
        this.horasTrabalhadas = horasTrabalhadas;
        this.salarioBruto = salarioBruto;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getValorHoraNormal() {
        return valorHoraNormal;
    }

    public void setValorHoraNormal(double valorHoraNormal) {
        this.valorHoraNormal = valorHoraNormal;
    }

    public double getValorHoraExtra() {
        return valorHoraExtra;
    }

    public void setValorHoraExtra(double valorHoraExtra) {
        this.valorHoraExtra = valorHoraExtra;
    }

    public int getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(int horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public double getSalarioBruto() {
        return salarioBruto;
    }

    public void setSalarioBruto(double salarioBruto) {
        this.salarioBruto = salarioBruto;
    }
}