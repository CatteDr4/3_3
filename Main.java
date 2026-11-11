public class Main {

  public static void main(String[] args) {
    int wynik;

    System.out.println("Tabliczka mnozenia: ");
    for(int i = 1; i<=10; i++) {
      for(int j = 1; j<=10; j++) {
        wynik = i*j;
        System.out.print(wynik + "\t");
      }
      System.out.print("\n");
    }
  }
}