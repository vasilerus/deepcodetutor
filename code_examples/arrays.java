public class AverageOfNumbers {
    public static void main(String[] args) {

        double[] numArray = {8,6,11,7};
        double sum = 0.0;
        double average;

        for (int i = 0; i < numArray.length; i++) {
            sum += numArray[i];
        }

        average = sum / numArray.length;
        System.out.format("The average is: %.2f", average);

    }
}