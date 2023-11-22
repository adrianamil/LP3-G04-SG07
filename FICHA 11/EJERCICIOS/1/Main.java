public class Main {
    public static void main(String[] args) {
        int n=3;
        CandyBag<Goodie> candyBag = new CandyBag<>();

        Goodie chocolate = new Goodie("Chocolate", 6);
        Goodie gomitas = new Goodie("Gomitas", 4);
        Goodie chupetin = new Goodie("Chupetin", 2);
        Goodie sublime = new Goodie("Sublime", 10);
        Goodie galletas = new Goodie("Galletas", 8);
        candyBag.add(chocolate);
        candyBag.add(gomitas);
        candyBag.add(chupetin);
        candyBag.add(galletas);
        candyBag.add(sublime);
        //
        candyBag.add(gomitas);

        System.out.println("Golosina mas barata: " + candyBag.barato().getNombre());

        CandyBag<Goodie> masCaraBag = candyBag.masCara(n);
        System.out.println("Golosina mas cara:");
        for (Goodie goodie : masCaraBag.getItems()) {
            System.out.println("- " + goodie.getNombre() + ": " + goodie.getPrecio());
        }
    }
}
