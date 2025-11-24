public class Filho extends Cliente{
    public int coisaDoFilhinho;
    public Filho(String nome, String email, String fone,int coisaDoFilhinho) {
        super(nome, email, fone);
        this.coisaDoFilhinho = coisaDoFilhinho;
    }

    @Override
    public boolean obterIdentificacaoPrincipal() {
        return false;
    }
}
