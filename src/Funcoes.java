public class Funcoes {

    private void helloWorld() {
        System.out.println("Olá, Mundo!");
    }

    private Integer soma (Integer a, Integer b){
        return a + b;
    }

    private void funcoesString (){
        String str = "Curso de Java!";

        System.out.println(str.charAt(2));
        System.out.println(str.equals("Curso de Java!"));
        System.out.println(str.startsWith("Java"));
        System.out.println(str.endsWith("etc"));
        System.out.println(str.substring(3));
        System.out.println(str.substring(3, 5));
        System.out.println(str.replace("Java", "Javaaaaaaa"));
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
        System.out.println(str.trim());
        System.out.println(str.length());
    }

    public static void main(String[] args) {
        Funcoes funcoes = new Funcoes();
        funcoes.helloWorld();
        System.out.println(funcoes.soma(2, 6));
    }
}
