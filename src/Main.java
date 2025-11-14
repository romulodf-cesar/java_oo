//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
          Cliente c1 = new Cliente();
          c1.setNome("Paulo");
          c1.setEmail("paulo@gmail.com");
          c1.setFone("61985858596");
          c1.setSalarioBruto(7800);
          System.out.println("nome"+c1.getNome());

          Cliente c2 = new Cliente("Luca",
                  "luca@gmail.com",
                  "619859669",
                  8052.52);
           System.out.println(c2);
    }
}