import java.util.*;
import java.util.concurrent.ForkJoinPool;
import java.util.stream.Stream;

public class Solution {

    public static void main(String[] args){

        // int [] array = new int [];


        // Array of Integers,
        // remove duplicates,
        // filter items greater than 100,
        // then sort the remaining items in desc order


        List<Integer> arrayList = new ArrayList<>();
        Set<Integer> duplicatesSet = new HashSet<>();

        List<Integer> solutionList = new ArrayList<>();

        arrayList.add(101);
        arrayList.add(200);
        arrayList.add(2000);
        arrayList.add(500);
        arrayList.add(400);
        arrayList.add(2);
        arrayList.add(7);
        arrayList.add(50);
        arrayList.add(10000);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(101);

        for (int i =0; i < arrayList.size(); i++){

           Integer currentNum = arrayList.get(i);
           duplicatesSet.add(currentNum);
        }


        for (int i = 0; i < arrayList.size(); i++){
            Integer currentNum = arrayList.get(i);
            if (!duplicatesSet.contains(currentNum)){
                if (currentNum > 100){
                    solutionList.add(currentNum);
                }
            }

        }

        Collections.sort(solutionList);
        Collections.sort(solutionList, Collections.reverseOrder());

        //

        // List<Integer> streamsList = new ArrayList<>(arrayList);

        // Array of Integers,
        // remove duplicates,
        // filter items greater than 100,
        // then sort the remaining items in desc order



        // Stream.of(arrayList).filter((list) -> list.stream().filter(list))




    }



}
