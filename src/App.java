public class App {
    public static void main(String[] args) throws Exception {
        Cliente c1 = new Cliente("Jose");
        Cliente c2= new Cliente("Jorge");
        Corrente cc= new Corrente(0, 0, 0, c1);
        Poupanca cp= new Poupanca(0, 0, 0, c2);
        cc.transferencia(100, cp);
        System.out.println(cp.getSaldo());
    }
}
