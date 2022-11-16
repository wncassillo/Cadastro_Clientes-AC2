
package classe;

/**
 *
 * @author cassi
 */
public class Cliente {
    private String cpf = "" ;
    private String nome = "";
    private String cidade = "";
    private String uf = "";
    private String email = "";
    private String telefone = "";
 
 public String getCpf() {
        return cpf;
    }
    
 public String getNome() {
        return nome;
    }
 
  public String getCidade() {
        return cidade;
    }
    
 public String getUf() {
        return uf;
    }
 
 public String getEmail() {
        return email;
    }
 
 public String getTelefone() {
        return telefone;
    }
 
 public void setCpf(String cpf) {
        this.cpf = cpf;
    }
 
 public void setNome(String nome) {
        this.nome = nome;
    }
 
 public void setCidade(String cidade) {
        this.cidade = cidade;
    }
 
 public void setUf(String uf) {
        this.uf = uf;
    }
 
 public void setEmail(String email) {
        this.email = email;
    }
 
 public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
 
 public void deleteCliente(){
       cpf = "";
       nome = "";
       cidade = "";
       uf = "";
       email = "";
       telefone = "";
    }  
    
}
