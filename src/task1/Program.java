package task1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        ArrayList arrayList1=new ArrayList();
        arrayList1.add(new Employee("Ulia", 30));


        //List<Integer> arrayList=new ArrayList<>();
//        arrayList.add(2);
//        arrayList.add(16);
//        arrayList.add(-1);

        arrayList1.add(true);
        arrayList1.add("utka");
        arrayList1.add(5.7890);

        MyArrayList<Employee> myArrayList=new MyArrayList(new Employee[10]);

       // myArrayList.add(6.890);
        myArrayList.add(new Employee("Anna", 35));
        //myArrayList.add("train");

        System.out.println("Количество элементов коллекции: "+myArrayList.size());

        for(Employee e:myArrayList){
            if(e!=null /* e instanceof Employee*/){
              //  Employee employee=(Employee)e;
                System.out.println(e.getName());
            }
        }

        Integer[] array1=new Integer[]{5,6,-1,12,1};
        System.out.println("ar1");

        System.out.println(Arrays.toString(array1));


        String[] array2=new String[]{"ff","gg","tt","kk"};


        Integer[] res =ArrayUtils.replaceTwoElements(array1,1,2);
        //System.out.println("res");
        System.out.println(Arrays.toString(res));




    }
}
