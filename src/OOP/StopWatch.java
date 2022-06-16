package OOP;

import java.time.LocalTime;
import java.util.Random;


public class StopWatch {
    private long startTime;
    private long endTime;

    public long SetStartTime() {
        return startTime;
    }

    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public void setEndTime(long endTime) {
        this.endTime = endTime;
    }

    public long getElapsedTime() {
        return endTime - startTime;
    }

    public int[] randomArray() {
        int[] array = new int[100000];
        for (int i = 0; i < 100000; i++) {
            array[i] = (new Random()).nextInt(100000) + 1;
        }
        return array;
    }

    public void Start() {
        startTime = System.currentTimeMillis();
    }

    public void Stop() {
        endTime = System.currentTimeMillis();
    }

    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[index]) {
                    index = j;//searching for lowest index
                }
            }
            int smallerNumber = arr[index];
            arr[index] = arr[i];
            arr[i] = smallerNumber;
        }

    }

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        long total = 0;
        for (int i = 0; i < 1000000; i++) {
            total += i;
        }

        long stopTime = System.currentTimeMillis();
        long elapsedTime = stopTime - startTime;
        System.out.println(elapsedTime);
    }
}


