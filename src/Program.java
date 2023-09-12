import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<Integer> arrayList1=new ArrayList<>();

        arrayList1.add(new Employee("hhh", 24).getAge());

        arrayList1.add(2);
        arrayList1.add(15);
        arrayList1.add(-1);

//        MyArrayList myArrayList=new MyArrayList(new Object[10]);
//        myArrayList.add(2);
//        myArrayList.add(new Employee("AAAAA",24));
//        myArrayList.add("juju");
//        System.out.println("количество элементов коллекции: "+myArrayList.size());


//        for(Object e:myArrayList){
//            if(e !=null && e instanceof Employee){
//                Employee employee=(Employee) e;
//                System.out.println(((Employee) e).getName());
//            }
//
//
//        }


        Integer[] array1=new Integer[]{5,3,7,-1,-12};
        System.out.println(Arrays.toString(array1));

        String[] array2=new String[]{"AA","BB","CC","DD"};

       // Object[]res=ArrayUtils.replaceTwoElements(array1,1,2);


//        int a=((int)res[0]);
//
//
//        System.out.println(Arrays.toString(res));




    }
}