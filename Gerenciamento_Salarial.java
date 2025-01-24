import javax.swing.*;

public class Gerenciamento_Salarial {
    public static void main(String[] args) {
        JTextField loginField = new JTextField();
        JTextField senhaField = new JTextField();
        JTextField emailField = new JTextField();
        JTextField contatoField = new JTextField();
        JTextField cargoField = new JTextField();
        JTextField registroField = new JTextField();
        JTextField salarioBaseField = new JTextField();
        JTextField contaBancariaField = new JTextField();
        JTextField matriculaField = new JTextField();
        JTextField valorHoraNormalField = new JTextField();
        JTextField valorHoraExtraField = new JTextField();
        JTextField horasTrabalhadasField = new JTextField();

        Object[] message = {
            "Login:", loginField,
            "Senha:", senhaField,
            "E-mail:", emailField,
            "Contato:", contatoField,
            "Cargo:", cargoField,
            "Registro:", registroField,
            "Salário Base:", salarioBaseField,
            "Conta Bancária:", contaBancariaField,
            "Matrícula:", matriculaField,
            "Valor Hora Normal:", valorHoraNormalField,
            "Valor Hora Extra:", valorHoraExtraField,
            "Horas Trabalhadas:", horasTrabalhadasField
        };

        int option = JOptionPane.showConfirmDialog(null, message, "Cadastro de Funcionário", JOptionPane.OK_CANCEL_OPTION);
        if (option == JOptionPane.OK_OPTION) {
            try {
                String login = loginField.getText();
                String senha = senhaField.getText();
                String email = emailField.getText();
                String contato = contatoField.getText();
                String cargo = cargoField.getText();
                String registro = registroField.getText();
                double salarioBase = Double.parseDouble(salarioBaseField.getText());
                String contaBancaria = contaBancariaField.getText();
                String matricula = matriculaField.getText();
                double valorHoraNormal = Double.parseDouble(valorHoraNormalField.getText());
                double valorHoraExtra = Double.parseDouble(valorHoraExtraField.getText());
                int horasTrabalhadas = Integer.parseInt(horasTrabalhadasField.getText());
                
                double salarioBruto = salarioBase + (valorHoraExtra * horasTrabalhadas);
                
                Funcionario funcionario = new Funcionario(login, senha, email, contato, cargo, registro, salarioBase,
                                                          contaBancaria, matricula, valorHoraNormal, valorHoraExtra,
                                                          horasTrabalhadas, salarioBruto);

                JOptionPane.showMessageDialog(null, "Funcionário cadastrado com sucesso!\n\n"
                                              + "Cargo: " + funcionario.getCargo() + "\n"
                                              + "Salário Base: " + funcionario.getSalario_Base() + "\n"
                                              + "Horas Trabalhadas: " + funcionario.getHoras_trabalhadas() + "\n"
                                              + "Salário Bruto: " + funcionario.getSalario_bruto());
                
                main(null);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Por favor, insira valores numéricos válidos.", "Erro", JOptionPane.ERROR_MESSAGE);
                main(null);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Programa encerrado.");
            System.exit(0);
        }
    }
}
