import java.util.ArrayList;
import java.util.Random;

public class Sorting <T> {

    public static <T extends Comparable<T>> void bubbleSort (ArrayList<T> sArray) {
        bubbleSort(sArray, 0, sArray.size());
    }

    public static <T extends Comparable<T>> void bubbleSort(ArrayList<T> sArrayList, int start, int end) {
        if (end - start <= 1)
            return;
        for(int i = start; i < end - 1; i++) {
            if(sArrayList.get(i).compareTo(sArrayList.get(i + 1)) > 0) {
                int j = i + 1;
                T hold = sArrayList.get(i);
                sArrayList.set(i, sArrayList.get(j));
                sArrayList.set(j, hold);
            }
            bubbleSort(sArrayList, start, end - 1);
        }
    }

    public static <T extends Comparable<T>>void mergeSort(ArrayList<T> inputList) {
        if (inputList.size() <= 1) {
            return;
        }

        int middle = inputList.size() / 2;

        ArrayList<T> firstHalf = new ArrayList<>(inputList.subList(0, middle));
        ArrayList<T> secondHalf = new ArrayList<>(inputList.subList(middle, inputList.size()));

        mergeSort(firstHalf);
        mergeSort(secondHalf);

        mergeSort(inputList, firstHalf, secondHalf);
    }

    public static <T extends Comparable<T>> void mergeSort(ArrayList<T> list, ArrayList<T> first, ArrayList<T> second) {
        int leftIndex = 0;
        int rightIndex = 0;
        int listIndex = 0;

        while (leftIndex < first.size() && rightIndex < second.size()) {
            if (first.get(leftIndex).compareTo(second.get(rightIndex)) < 0) {
                list.set(listIndex, first.get(leftIndex));
                leftIndex++;
            } else {
                list.set(listIndex, second.get(rightIndex));
                rightIndex++;
            }
            listIndex++;
        }

        while (leftIndex < first.size()) {
            list.set(listIndex, first.get(leftIndex));
            leftIndex++;
            listIndex++;
        }

        while (rightIndex < second.size()) {
            list.set(listIndex, second.get(rightIndex));
            rightIndex++;
            listIndex++;
        }
    }

    public static ArrayList<Integer> createRandomIntArrayList(int arrayLength) {
        ArrayList<Integer> newArrayList = new ArrayList<>();
        Random rng = new Random(arrayLength);
        for (int i = 0; i < arrayLength; i++) {

            int rngInt = rng.nextInt(0, 100);
            newArrayList.add(rngInt);
        }
        return newArrayList;
    }

    public static  ArrayList<Double> createRandomDoubbleArrayList(int arrayLength) {
        ArrayList<Double> newArrayList = new ArrayList<>();
        Random rng = new Random(arrayLength);
        for (int i = 0; i < arrayLength; i++) {

            double rngDouble = rng.nextDouble(0.0, 100.0);
            newArrayList.add(rngDouble);
        }
        return newArrayList;
    }

    public static  ArrayList<Long> createRandomLongArrayList(int arrayLength) {
        ArrayList<Long> newArrayList = new ArrayList<>();
        Random rng = new Random(arrayLength);
        for (int i = 0; i < arrayLength; i++) {

            Long rngLong = rng.nextLong(0, 100);
            newArrayList.add(rngLong);
        }
        return newArrayList;
    }

    public static  ArrayList<Float> createRandomFloatArrayList(int arrayLength) {
        ArrayList<Float> newArrayList = new ArrayList<>();
        Random rng = new Random(arrayLength);
        for (int i = 0; i < arrayLength; i++) {

            float rngInt = rng.nextFloat(0, 100);
            newArrayList.add(rngInt);
        }
        return newArrayList;
    }
}

