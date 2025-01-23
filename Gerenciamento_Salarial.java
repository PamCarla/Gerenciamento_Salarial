public class Gerenciamento_Salarial {

    //para conexão com o banco de dados
    private static final String URL = "jdbc:mysql://localhost:3306/seu_banco_de_dados";
    private static final String USER = "root";
    private static final String PASSWORD = "sua_senha";
    private Connection connection;

    // Método para conectar ao banco de dados assim espero
    public void conectar() {
        try {
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Conexão bem-sucedida!");
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Erro ao conectar ao banco de dados.");
        }
    }

    // Método para fechar a conexão
    public void fecharConexao() {
        try {
            if (connection != null) {
                connection.close();
                System.out.println("Conexão fechada.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Exemplo de método CRUD: Cadastrar um funcionário
    public void cadastrarFuncionario(Funcionario funcionario) {
        String sql = "INSERT INTO funcionarios (nome, cpf, data_nascimento, endereco, cargo, salario_base, conta_bancaria, matricula) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, funcionario.getNome());
            stmt.setString(2, funcionario.getCpf());
            stmt.setString(3, funcionario.getDataNascimento());
            stmt.setString(4, funcionario.getEndereco());
            stmt.setString(5, funcionario.getCargo());
            stmt.setDouble(6, funcionario.getSalario_Base());
            stmt.setString(7, funcionario.getConta_Bancaria());
            stmt.setString(8, funcionario.getMatricula());
            stmt.executeUpdate();
            System.out.println("Funcionário cadastrado com sucesso!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Exemplo de método CRUD: Consultar um funcionário
    public Funcionario consultarFuncionario(int idFuncionario) {
        String sql = "SELECT * FROM funcionarios WHERE id_funcionario = ?";
        Funcionario funcionario = null;
        
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, idFuncionario);
            ResultSet rs = stmt.executeQuery();
            
            if (rs.next()) {
                funcionario = new Funcionario(
                    rs.getString("cargo"),
                    rs.getString("Lista_Registro"),
                    rs.getDouble("salario_base"),
                    rs.getString("conta_bancaria"),
                    rs.getString("matricula")
                );
                funcionario.setId_Funcionario(rs.getInt("id_funcionario"));
                funcionario.setNome(rs.getString("nome"));
                funcionario.setCpf(rs.getString("cpf"));
                funcionario.setDataNascimento(rs.getString("data_nascimento"));
                funcionario.setEndereco(rs.getString("endereco"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return funcionario;
    }

    // Exemplo de como gerar um pagamento
    public void gerarPagamento(Pagamento pagamento) {
        // A lógica de geração de pagamento pode envolver cálculos de rendimentos e descontos
        // Aqui você pode integrar os cálculos de Pagamento ou outros benefícios
        // Para este exemplo, vamos assumir que o salário bruto já foi calculado
        System.out.println("Gerando pagamento...");
        double salarioLiquido = pagamento.calcula_Beneficios(calculaSalarioBase());
        System.out.println("Salário líquido: " + salarioLiquido);
    }
    
    // Exemplo de cálculo do salário base (apenas para ilustrar)
    public double calculaSalarioBase() {
        // Simulando um cálculo de salário base
        return 3000.00; // Exemplo
    }

    public static void main(String[] args) {
        Gerenciamento_Salarial gs = new Gerenciamento_Salarial();
        gs.conectar();
        
        // Exemplo de criação e cadastro de um funcionário
        Funcionario novoFuncionario = new Funcionario("João Silva", "12345678901", "1990-05-10", "Rua A, 123", "Analista", 5000.00, "12345", "M123");
        gs.cadastrarFuncionario(novoFuncionario);

        // Consultar o funcionário cadastrado
        Funcionario funcionario = gs.consultarFuncionario(1); // ID 1 como exemplo
        if (funcionario != null) {
            System.out.println("Funcionário encontrado: " + funcionario.getNome());
        }
        
        gs.fecharConexao();
    }
}
