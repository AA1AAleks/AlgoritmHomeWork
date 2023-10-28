package AlgoritmHomeWork;

import java.util.Arrays;
import java.util.Random;
import static AlgoritmHomeWork.BubbleSortHome.bubbleSortHome;
import static AlgoritmHomeWork.InsertSortHome.insertionSortHome;

public class ClassicSort {
    public static void main(String[] args) {

        int arraySize = 15;
        int[] array = new int[arraySize];
        generate(array, arraySize);
        long startTime, endTime ;

        startTime = System.currentTimeMillis();
        Arrays.sort(array);
        endTime = System.currentTimeMillis();


        System.out.println("Время сортировки : " + (endTime - startTime));

        generate(array, arraySize);
        startTime = System.currentTimeMillis();
        Arrays.parallelSort(array);
        endTime = System.currentTimeMillis();

        System.out.println("Время параллельной сотртировки : " + (endTime - startTime));

        generate(array, arraySize);
        startTime = System.currentTimeMillis();
        bubbleSortHome(array);
        endTime = System.currentTimeMillis();

        System.out.println("Время пузырьковой сортировки : " + (endTime - startTime));

        generate(array, arraySize);
        startTime = System.currentTimeMillis();
        insertionSortHome(array);
        endTime = System.currentTimeMillis();

        System.out.println("Время сортировки вставками : " + (endTime - startTime));




    }
    public static void generate (int[] array, int arraySize){
        for (int i = 0; i<arraySize; i++){
            array[i] = new Random().nextInt(100000)+ 400000;
        }

    }
}
