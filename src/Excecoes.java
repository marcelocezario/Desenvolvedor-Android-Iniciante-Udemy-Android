public class Excecoes {

    public static void main(String[] args) {

        try {
            String str = "Curso de Java!";
            str.charAt(200);

            String s = null;
            System.out.println(s.length());
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Out of bounds!");
        } catch (NullPointerException e) {
            System.out.println("Valor nulo!");
        } catch (Exception e) {
            System.out.println("Erro desconhecido");
        } finally {
            System.out.println("Executei");
        }


    }
}
