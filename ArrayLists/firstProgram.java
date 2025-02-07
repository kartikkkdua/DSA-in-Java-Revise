import java.util.ArrayList;

public class firstProgram{
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        ArrayList<Boolean> list3 = new ArrayList<>();

        //a. adding element - O(1)
        list.add(1);// adding elements to arraylist
        list.add(2);
        list.add(3); 
        list.add(4);
        list.add(5);

        list.add(10,56);// adding element at index 10. //O(n)

        System.out.println(list);

        //b. get element - O(1)
        int element=list.get(2);// finding the element in arraylist.
        System.out.println("the element is found at index "+element);

        //c. remove element - O(n)
        list.remove(2);// removing the element from arraylist using indexing.
        System.out.println(list);

        //d. set element - O(n)
        list.set(2, 10);// setting the element at index 2.
        System.out.println(list);

        //e. contains element - O(n)
        System.out.println(list.contains(1));// checking if the element is present in arraylist or not.
        System.out.println(list.contains(6));
    }
}