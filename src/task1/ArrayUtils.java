package task1;

import java.util.Arrays;

public class ArrayUtils {

    public static<T> T[] replaceTwoElements(Object[] array, int index1, int index2){
        if(index1>= array.length||index2>= array.length||index1<0||index2<0){
            throw new IndexOutOfBoundsException();
        }
        T[] newArray= (T[]) array.clone();
        T obj=newArray[index1];

        System.out.println("i1 - "+newArray[index1]);
        newArray[index1]= (T) array[index2];

        System.out.println("i2 - "+array[index2]);

        System.out.println("array2"+Arrays.toString(array));

        System.out.println(Arrays.toString(newArray));
        array[index2]=obj;
        return newArray;
    }
}
