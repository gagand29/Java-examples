public class Weather {
    public static void main(String[] args) {
        double noon = 77;
        double evening = 61;
        double midnight = 55;

        pT(noon);

    }

    public static double fToC(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static void pT(double fahrenheit) {
        System.out.println("Fahrenheit: " + fahrenheit);
        System.out.println("c:" + fToC(fahrenheit));
    }

}