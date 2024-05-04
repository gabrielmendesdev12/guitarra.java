public class Guitarra {
    private String marca;
    private String modelo;
    private int numeroCordas;

    public Guitarra(String marca, String modelo, int numeroCordas) {
        this.marca = marca;
        this.modelo = modelo;
        this.numeroCordas = numeroCordas;
    }

    public void tocar() {
        System.out.println("Tocando a guitarra " + marca + " " + modelo);
    }
}
