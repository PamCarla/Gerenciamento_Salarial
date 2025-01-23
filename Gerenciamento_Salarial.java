package sistema;

import javax.swing.JOptionPane;

public class Gerenciamento_Salarial {

    public static void main(String[] args) {
        // Coleta de dados com JOptionPane
        String login = JOptionPane.showInputDialog("Digite o login do funcionário:");
        String senha = JOptionPane.showInputDialog("Digite a senha do funcionário:");
        String email = JOptionPane.showInputDialog("Digite o e-mail do funcionário:");
        String contato = JOptionPane.showInputDialog("Digite o número de contato do funcionário:");

        String cargo = JOptionPane.showInputDialog("Digite o cargo do funcionário:");
        String lista_Registro = JOptionPane.showInputDialog("Digite o número de registro do funcionário:");
        double salario_Base = 0;
        try {
            salario_Base = Double.parseDouble(JOptionPane.showInputDialog("Digite o salário base do funcionário:"));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Por favor, insira um valor numérico válido para o salário base.");
            return;
        }

        String Conta_Bancaria = JOptionPane.showInputDialog("Digite o número da conta bancária:");
        String matricula = JOptionPane.showInputDialog("Digite a matrícula do funcionário:");
        
        double valor_hora_normal = 0;
        try {
            valor_hora_normal = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da hora normal:"));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Por favor, insira um valor numérico válido para o valor da hora normal.");
            return;
        }

        double valor_hora_extra = 0;
        try {
            valor_hora_extra = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da hora extra:"));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Por favor, insira um valor numérico válido para o valor da hora extra.");
            return;
        }

        int horas_trabalhadas = 0;
        try {
            horas_trabalhadas = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de horas trabalhadas no mês:"));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Por favor, insira um valor numérico válido para as horas trabalhadas.");
            return;
        }

        double salario_bruto = salario_Base + (valor_hora_extra * horas_trabalhadas); // Exemplo de cálculo

        // Criando um objeto Funcionario com os dados preenchidos
        Funcionario funcionario = new Funcionario(login, senha, email, contato, cargo, lista_Registro, salario_Base, 
                                                  Conta_Bancaria, matricula, valor_hora_normal, valor_hora_extra, 
                                                  horas_trabalhadas, salario_bruto);

        // Exibindo as informações do Funcionario
        JOptionPane.showMessageDialog(null, "Funcionário cadastrado com sucesso!\n\n"
                                          + "Cargo: " + funcionario.getCargo() + "\n"
                                          + "Salário Base: " + funcionario.getSalario_Base() + "\n"
                                          + "Horas Trabalhadas: " + funcionario.getHoras_trabalhadas() + "\n"
                                          + "Salário Bruto: " + funcionario.getSalario_bruto());

        // Oferecendo opções para o usuário
        String[] options = {"Cadastrar outro funcionário", "Sair"};
        int choice = JOptionPane.showOptionDialog(null, "Escolha uma opção:", "Opções",
                                                  JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, 
                                                  null, options, options[0]);

        if (choice == 0) {
            // Chama o método para cadastrar outro funcionário
            main(null);  // Reinicia o programa
        } else {
            JOptionPane.showMessageDialog(null, "Programa encerrado.");
            System.exit(0); // Encerra o programa
        }
    }
}
