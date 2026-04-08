public class circulo extends formaGeometrica {

    private double raio;

    public circulo(double raio) {
        this.raio = raio;
    }

    public double calcularArea() {
        return Math.PI * raio * raio;
    }
}