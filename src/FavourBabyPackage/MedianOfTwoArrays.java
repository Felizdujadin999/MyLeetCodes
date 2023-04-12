package FavourBabyPackage;

public class MedianOfTwoArrays {
    public static void main(String[] args) {
        System.out.println(findMean(new int[]{23, 34, 18, 92, 72, 12}, new int[]{45, 98, 67, 23, 6, 2}));
    }
    public static int findMean(int[] number1, int[] number2) {
        int firstArray = number1.length;
        int SecondArray = number2.length;
        int[] combinedArray = new int[firstArray + SecondArray];
        int index1 = 0;
        int index2 = 0;
        int combinedArrayIndex = 0;

        while (index1 < firstArray && index2 < SecondArray) {
            if (number1[index1] < number2[index2]) {combinedArray[combinedArrayIndex++] = number1[index1++];} else {combinedArray[combinedArrayIndex++] = number2[index2++];}
        }

        while (index1 < firstArray) {combinedArray[combinedArrayIndex++] = number1[index1++];}

        while (index2 < SecondArray) {combinedArray[combinedArrayIndex++] = number2[index2++];}

        int sum = 0;
        for (int number : combinedArray) {
            sum += number;
        }
        return sum / combinedArray.length;
    }
}
