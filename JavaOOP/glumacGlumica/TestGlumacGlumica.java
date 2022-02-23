package JavaOOP.glumacGlumica;

public class TestGlumacGlumica {
    public static void main(String[] args) {
        GlumacGlumica glumac = new GlumacGlumica("Nikola", "Kojo", 'm', 54, 10.0, true);
        GlumacGlumica glumica = new GlumacGlumica("Meryl", "Streep", 'z', 72, 10.0, false);

        System.out.println(glumac);
        System.out.println(glumica);
    }
}
