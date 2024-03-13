// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class ProstokatTest {
    public static void main(String[] args) {

        Prostokat pr[] = {
                new Prostokat(2, 3),
                new Prostokat(0, 3),
                new ZProstokat(4, 'a', 'e'),
                new ZProstokat(5, 3, '*', '+'),
                new ZProstokat(1, 2, 'a', 'a'),
                new ZProstokat(3, 3, '+', 'x'),
                new ZProstokat(1, 2, 'x', 'y'),
                new ZProstokat(3, 4, '^', '$')
        };

        for (Prostokat p : pr)
          //  try {
                p.rysuj();
          //  } catch(ProstokatException e) {
          //      System.out.println(e.getMessage());
        //    }
    }
}