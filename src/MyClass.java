import java.util.*;


public class MyClass {
    public static void main(String args[]) {

        //8,7,3,1,7,4,4,9,0,3
        // elimate duplicate numbers and sort. Return new collection

        List<Integer> test = new ArrayList<>();

        test.add(8);
        test.add(7);
        test.add(3);
        test.add(1);
        test.add(7);
        test.add(4);
        test.add(4);
        test.add(9);
        test.add(0);
        test.add(3);


        System.out.println(getUniqueNumbersFromList(test));

    }

    public static List<Integer> getUniqueNumbersFromList (List<Integer> numberList){

        List<Integer> solution = new ArrayList<>();
        Set<Integer> duplicateSet = new HashSet<>();

        for(int i = 0; i < numberList.size(); i++){

            Integer item = numberList.get(i);
            if(!solution.contains(item)){
                solution.add(item);
            } else {
                // don't add to list, list already has this number
            }
        }

        Collections.sort(solution);
        return solution;
    }

    public static List<Integer> sortNumberList (List<Integer> numberList){



        return null;
    }


    //   int x=10;
    // int y=25;
    // int z=x+y;

    // System.out.println("Sum of x+y = " + z);
}