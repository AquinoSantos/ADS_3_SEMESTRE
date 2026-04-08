public class retangulo extends formaGeometrica {

    private double comprimento;
    private double largura;

    public retangulo(double comprimento, double largura) {
        this.comprimento = comprimento;
        this.largura = largura;
    }

    public double calcularArea() {
        return comprimento * largura;
    }
}