public class Main_forma {

    public static void main(String[] args) {

        circulo circulo = new circulo(5);
        retangulo retangulo = new retangulo(4, 6);

        System.out.println("Área do círculo: " + circulo.calcularArea());
        System.out.println("Área do retângulo: " + retangulo.calcularArea());
    }
}