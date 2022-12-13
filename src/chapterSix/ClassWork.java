package chapterSix;

public class ClassWork {
    public static void main(String[] args) {
       // numberOfPrimeNumberBetween1And10_000(10000);
        showPrimeNumber(7);
    }

    private static void primeNumber(int number){
        int count=2;
        if (number%count!=0){
            System.out.println(number + " is a prime number...");
        }else {
            System.out.println(number + " is not a prime number....");
        }
    }

    private static void numberOfPrimeNumberBetween1And10_000(int number){
        if (number<= 10000) {
            int value = number;
            for (int j = 2; j <= value; j++) {
                int count = 0;
                for (int i = 1; i <= j; i++) {
                    if (j % i == 0) {
                        count++;
                    }
                }
                if (count == 2)
                    System.out.print("\n" + j + " is a prime number ");
            }
        }
        else {
            System.out.println("Gettat.....");
        }
  }
  private static void showPrimeNumber(int number){
      for (int i = 1; i < number; i++) {
          primeNumber(i);
      }
  }
}


