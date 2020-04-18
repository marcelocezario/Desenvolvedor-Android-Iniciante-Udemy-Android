public class Exercicios1 {

    private void helloWorld() {
        System.out.println("Olá, Mundo!");
    }

    private Integer nrCaracteres(String str) {
        return str.length();
    }

    private String informacao(String palavra) {
        return "A palavra " + palavra + " possui " + palavra.length() + " caracteres.";
    }

    private Integer soma(Integer a, Integer b) {
        return a + b;
    }

    private Double calculo(Double x, Double y, Double z) {
        return ((x + y) * x) / z;
    }

    public static void main(String[] args) {
        Exercicios1 ex = new Exercicios1();

        ex.helloWorld();

        System.out.println(ex.nrCaracteres("teste"));
        System.out.println(ex.informacao("teste"));
        System.out.println(ex.soma(1, 5));
        System.out.println(ex.calculo(2.0,3.3,4.0));
    }
}
