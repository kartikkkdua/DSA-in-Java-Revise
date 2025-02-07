import java.util.ArrayList;
public class maximumArrayList{
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(2);
        list.add(5);
        list.add(9);
        list.add(6);
        list.add(8);

        int max = Integer.MIN_VALUE;
        for(int i=0;i<list.size();i++){
           if(max<list.get(i)){
               max = list.get(i); //this is the way to find the maximum element in the arraylist.
           }
        //or
        //     max = Math.max(max, list.get(i));  //this is the inbuilt function to find the maximum element in the arraylist.
        }
        // }
        System.out.println("The maximum element in the arraylist is "+max);

    }
}