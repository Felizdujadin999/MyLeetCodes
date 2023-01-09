package ClassWork;

public class OddArray {

    public static int[] findOdd(int[] numbers) {
        int count = 0;
        for (int number:numbers) {
            if (number%2!=0) count++;
        }

        int [] oddElements = new int[count];
        int oddElementCounter = 0;
        for (int counter = 0; counter < numbers.length; counter++) {
            if (numbers[counter]%2!=0){
                oddElements[oddElementCounter] = numbers[counter];
                oddElementCounter++;
            }
        }
        return oddElements;
    }
}
