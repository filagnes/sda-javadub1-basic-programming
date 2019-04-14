package pl.sda.dublin.oop;

public class Program {

  public static void wypiszDaneFigury(Figura figura) {
    double obwod = figura.obliczObwod();
    double v = figura.podajIloscLiterWNazwie();
    System.out.println(obwod);
  }

  public void test(Object o) {}

  public static void main(String[] args) {
    // 1
    String imie = "Piotr";
    Object obj = imie;

    if (obj instanceof String) {
      String s = (String) obj;
      System.out.println(s);
    } else {
      System.out.println("Nie kompatybilny typ - #1");
    }

    // 2

    Object kwadrat = new Kwadrat(2);
    if (kwadrat instanceof String) {
      String napis = (String) kwadrat;
    } else {
      System.out.println("Nie kompatybilny typ - #2");
      System.out.println();
    }

    //
    //
    //
    //
    //    double bok = 5;
    //
    //    double a = 10;
    //    double b = 20;
    //
    //    Kwadrat malyKwadrat = new Kwadrat(bok);
    //    Prostokat p = new Prostokat(a, b);
    //
    //    Figura mojaFigura = malyKwadrat;
    //
    //    Figura drugaFigura = new Prostokat(2,2);
    //
    //    drugaFigura.obliczObwod();
    //
    //
    //    wypiszDaneFigury(malyKwadrat);
    //    wypiszDaneFigury(mojaFigura);
    //    wypiszDaneFigury(new Prostokat(2,3));
    //    wypiszDaneFigury(new Prostokat(8,10));
    //    wypiszDaneFigury(new Kwadrat(2));

  }
}
