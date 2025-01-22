public class Pessoa {


     private int id_pessoa;
     private String nome;
     private String cpf;
     private String data_nascimento;
     private String endereco;
     
     public Pessoa(String nome, String cpf, String data_nascimento, String endereco){
          this.nome = nome;
          this.cpf = cpf;
          this.data_nascimento = data_nascimento;
          this.endereco = endereco;
     }
     public void setNome(String nome){
          this.nome = nome;
     }
     public String getNome(){
          return this.nome;
     }
     public void setCpf (String cpf){
          this.cpf = cpf;
     }
     public String getCpf(){
          return this.cpf;
     }
     public void setData_nascimento(String data_nascimento){
          this.data_nascimento = data_nascimento;
     }
     public String getData_nascimento(){
          return this.data_nascimento;
     }
     public void setEndereco(String endereco){
          this.endereco = endereco;
     }
     public String getEndereco(){
          return this.endereco;
     }
}
