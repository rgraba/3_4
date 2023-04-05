class Main {
  public static void main(String[] args){
    int h = 10;
      for ( int i = 1; i <= h; i++)
      {
        for ( int j = 1; j <= h; j++)
          {
            int wynik = i * j;
            System.out.print(wynik + "\t");
          }
        System.out.println();
      }
  }
}