public class Cliente {


    private String nome;
    private String email;
    private String fone;
    private double salarioBruto;

    public Cliente(){

    }
    public Cliente(String nome,
                   String email,
                   String fone,
                   double salarioBruto) {
        this.nome = nome;
        this.email = email;
        this.fone = fone;
        this.salarioBruto = salarioBruto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public double getSalarioBruto() {
        return salarioBruto;
    }

    public void setSalarioBruto(double salarioBruto) {
        this.salarioBruto = salarioBruto;
    }
    @Override
    public String toString() {
        return """
=================================
  DADOS DO FUNCIONÁRIO
=================================
 Nome:      %s
 E-mail:    %s
 Telefone:  %s
 Salário:   R$ %,.2f
=================================
""".formatted(
                this.getNome(),
                this.getEmail(),
                this.getFone(),
                this.getSalarioBruto()
        );
    }
}
