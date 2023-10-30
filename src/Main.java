import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int type;
        int length;
        int method;

        ArrayList<Integer> intList = null;
        ArrayList<Double> doubleList = null;
        ArrayList<Float> floatList = null;
        ArrayList<Long> longList = null;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello! Welcome to the SortWithGenerics program.");
        System.out.println("Please enter in the type of list you would like.))");

        while (true) {
            try {
                System.out.println("1.Integer\n2.Double\n3.Float\n4.Long");
                type = Integer.parseInt(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid option.");
            }
        }
        System.out.println("Next, enter the length of the list.");
        while (true) {
            try {
                length = Integer.parseInt(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid option.");
            }
        }

        if (type == 1) {

            intList = Sorting.createRandomIntArrayList(length);

        } else if (type == 2) {

            doubleList = Sorting.createRandomDoubbleArrayList(length);

        } else if (type == 3) {

            floatList = Sorting.createRandomFloatArrayList(length);

        } else {

            longList = Sorting.createRandomLongArrayList(length);
        }

        System.out.println("Finally, choose your sorting method.");

        while (true) {
            try {
                System.out.println("1.BubbleSort\n2.MergeSort");
                method = Integer.parseInt(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid option.");
            }
        }

        if (method == 1) {
            switch (type) {
                case 1 -> {
                    Sorting.bubbleSort(intList);
                    for (Integer integer : intList) {
                        System.out.println(integer);
                    }
                }
                case 2 -> {
                    Sorting.bubbleSort(doubleList);
                    for (Double doub : doubleList) {
                        System.out.println(doub);
                    }
                }
                case 3 -> {
                    Sorting.bubbleSort(floatList);
                    for (Float flo : floatList) {
                        System.out.println(flo);
                    }
                }
                case 4 -> {
                    Sorting.bubbleSort(longList);
                    for (Long lon : longList) {
                        System.out.println(lon);
                    }
                }
            }
        } else {
            switch (type) {
                case 1 -> {
                    Sorting.mergeSort(intList);
                    for (Integer integer : intList) {
                        System.out.println(integer);
                    }
                }
                case 2 -> {
                    Sorting.mergeSort(doubleList);
                    for (Double doub : doubleList) {
                        System.out.println(doub);
                    }
                }
                case 3 -> {
                    Sorting.mergeSort(floatList);
                    for (Float flo : floatList) {
                        System.out.println(flo);
                    }
                }
                case 4 -> {
                    Sorting.mergeSort(longList);
                    for (Long lon : longList) {
                        System.out.println(lon);
                    }
                }
            }

        }
    }
}