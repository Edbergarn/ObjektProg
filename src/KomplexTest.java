public class KomplexTest {
    public static void main(String[] args) {
        Komplex k = new Komplex(3,5);
        Komplex b = new Komplex(4,6 );
        Komplex n = k.add(b);
        Komplex m = Komplex.multiply(k,b);
        double v = k.arg();
        boolean e = k.equals(b);
        k.toString();

        System.out.println("z=(" + m.r + "," + m.i + "i)");
        System.out.println("Vinkeln är " + v + " rad");
        System.out.println(e);
    }
}
