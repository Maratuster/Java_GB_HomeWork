package Java_GB_HomeWork.Lesson_2;

import java.io.FileWriter;
import java.util.Arrays;
import java.io.IOException;

public class hw1 {
    public static void main(String[] args) {
        int[] numArray = {6, 3, 4, 8, 1, 7, 2, 5};
        int arraySize = numArray.length;
        for (int i = 0; i < arraySize-1; i++) {
            try(FileWriter writer = new FileWriter("log.txt", true)){
            String itter = Arrays.toString(numArray);
            StringBuilder buildArray = new StringBuilder();
            buildArray.append("Иттерация ").append(i).append(":\n").append(itter).append("\n");
            writer.write(buildArray.toString());
            writer.flush();
            }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
            for (int j = i+1; j < arraySize; j++) {
                if (numArray[j]<numArray[i]){
                    int temp = numArray[i];
                    numArray[i] = numArray[j];
                    numArray[j] = temp;
                }
            }
        }
    }
}
