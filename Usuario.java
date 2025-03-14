public class Usuario extends Pessoa {
     private String login;
     private String senha;
     private String email;
     private String contato;
 
     public Usuario(String nome, String cpf, String dataNascimento, String endereco, String login, String senha, String email, String contato) {
         super(nome, cpf, dataNascimento, endereco);
         this.login = login;
         this.senha = senha;
         this.email = email;
         this.contato = contato;
     }
 
     public String getLogin() {
         return login;
     }
 
     public void setLogin(String login) {
         this.login = login;
     }
 
     public String getSenha() {
         return senha;
     }
 
     public void setSenha(String senha) {
         this.senha = senha;
     }
 
     public String getEmail() {
         return email;
     }
 
     public void setEmail(String email) {
         this.email = email;
     }
 
     public String getContato() {
         return contato;
     }
 
     public void setContato(String contato) {
         this.contato = contato;
     }
 }