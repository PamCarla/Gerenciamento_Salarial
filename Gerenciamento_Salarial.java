import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class Gerenciamento_Salarial {
    public static void main(String[] args) {
        int escolha = JOptionPane.showOptionDialog(null, "Escolha uma opção:", "Gerenciamento Salarial",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null,
                new String[]{"Cadastrar Funcionário", "Exibir Funcionários"}, "Cadastrar Funcionário");

        if (escolha == 0) {
            cadastrarFuncionario();
        } else if (escolha == 1) {
            exibirFuncionarios();
        } else {
            JOptionPane.showMessageDialog(null, "Programa encerrado.");
            System.exit(0);
        }
    }

    private static void cadastrarFuncionario() {
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

                inserirNoBancoDeDados(login, senha, email, contato, cargo, registro, salarioBase, contaBancaria,
                        matricula, valorHoraNormal, valorHoraExtra, horasTrabalhadas, salarioBruto);

                JOptionPane.showMessageDialog(null, "Funcionário cadastrado com sucesso!");
                main(null);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Por favor, insira valores numéricos válidos.", "Erro", JOptionPane.ERROR_MESSAGE);
                main(null);
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Erro ao salvar no banco de dados: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
                e.printStackTrace();
                System.exit(1);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Cadastro cancelado.");
            main(null);
        }
    }

    private static void exibirFuncionarios() {
        String[] colunas = {"Login", "E-mail", "Contato", "Cargo", "Registro", "Salário Base", "Salário Bruto"};
        DefaultTableModel model = new DefaultTableModel(colunas, 0);

        try {
            // Configurações do banco de dados
            String url = "jdbc:mysql://localhost:3306/bancodedados";
            String user = "root";
            String password = null;

            Connection conn = DriverManager.getConnection(url, user, password);
            String sql = "SELECT login, email, contato, cargo, registro, salario_base, salario_bruto FROM funcionarios";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                String login = rs.getString("login");
                String email = rs.getString("email");
                String contato = rs.getString("contato");
                String cargo = rs.getString("cargo");
                String registro = rs.getString("registro");
                double salarioBase = rs.getDouble("salario_base");
                double salarioBruto = rs.getDouble("salario_bruto");

                Object[] linha = {login, email, contato, cargo, registro, salarioBase, salarioBruto};
                model.addRow(linha);
            }

            rs.close();
            stmt.close();
            conn.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao recuperar dados: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
            return;
        }

        // Exibe a tabela
        JTable tabela = new JTable(model);
        JScrollPane scrollPane = new JScrollPane(tabela);
        JOptionPane.showMessageDialog(null, scrollPane, "Lista de Funcionários", JOptionPane.INFORMATION_MESSAGE);

        main(null);
    }

    private static void inserirNoBancoDeDados(String login, String senha, String email, String contato, String cargo,
                                              String registro, double salarioBase, String contaBancaria, String matricula,
                                              double valorHoraNormal, double valorHoraExtra, int horasTrabalhadas, double salarioBruto)
                                              throws SQLException {

        String url = "jdbc:mysql://localhost:3306/bandodedados";
        String user = "root";
        String password = null;

        Connection conn = DriverManager.getConnection(url, user, password);
        String sql = "INSERT INTO funcionarios (login, senha, email, contato, cargo, registro, salario_base, conta_bancaria, matricula, valor_hora_normal, valor_hora_extra, horas_trabalhadas, salario_bruto) "
                + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement stmt = conn.prepareStatement(sql);

        stmt.setString(1, login);
        stmt.setString(2, senha);
        stmt.setString(3, email);
        stmt.setString(4, contato);
        stmt.setString(5, cargo);
        stmt.setString(6, registro);
        stmt.setDouble(7, salarioBase);
        stmt.setString(8, contaBancaria);
        stmt.setString(9, matricula);
        stmt.setDouble(10, valorHoraNormal);
        stmt.setDouble(11, valorHoraExtra);
        stmt.setInt(12, horasTrabalhadas);
        stmt.setDouble(13, salarioBruto);

        stmt.executeUpdate();
        stmt.close();
        conn.close();
    }
}
