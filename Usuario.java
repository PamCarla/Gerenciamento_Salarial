public class Usuario extends Pessoa  {
     private String login;
     private String senha;
     private String email;
     private String contato;

     public Usuario( String nome,String cpf,String data_nascimento ,String endereco,String login, String senha, String email, String contato){
          super(nome, cpf, data_nascimento, endereco);
          this.login = login;
          this.senha = senha;
          this.email = email;
          this.contato = contato;
     }
     

     public void setLogin(String login){
          this.login = login;
     }
     public String getLogin(){
          return this.login;
     }
     public void setSenha(String senha){
          this.senha = senha;
     }
     public String getSenha(){
          return this.senha;
     }
     public void setEmail (String email){
          this.email = email;
     }
     public String getEmail(){
          return this.email;
     }
     public void setContato(String contato){
          this.contato = contato;
     }
     public String getContato(){
          return this.contato;
     }

     


}
