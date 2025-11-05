public class App {
    public static void main(String[] args) throws Exception {
        int numeroIntroducido = Integer.parseInt(System.console().readLine("Por favor, introduzca un número entero positivo: "));

        int factorial = 1;

        for (int i = 1; i <= numeroIntroducido; i++) {
            factorial = 1;
            for (int j = 1; j <= i; j++) {
                factorial *= j;
            }
            System.out.printf("%d! = %d%n", i, factorial);
        }
    }
}
