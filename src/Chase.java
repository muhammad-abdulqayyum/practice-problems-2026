import java.util.*;

public class Chase {

    public static void main (String[] args){
        // List of log lines. Structure of log lines is Array of Strings.
        // String format is: user array of strings, string has user:1 action:login

        // ["user:1 action:login","user:1 action:view","user:1 action:login","user:1 action:login"]

        String [] logs = new String[4];

        logs[0] = "user:1 action:login";
        logs[1] = "user:1 action:view";
        logs[2] = "user:1 action:login";
        logs[3] = "user:1 action:login";

        List<String> logsArrayList = new ArrayList<>();

        logsArrayList.add("user:1 action:login");
        logsArrayList.add("user:1 action:view");
        logsArrayList.add("user:2 action:login");
        logsArrayList.add("user:2 action:view");

        // write function that takes logs input, and returns a map of the unique user ids, and how many unique actions the user had.

        // HashMap - k,v - key: userid, value - count(int) or (set)
        // set

        //HashMap -

        System.out.println(getCountOfUniqueActionsPerUser(logsArrayList));


    }

    public static Map<Integer, Set<String>> getUniqueActionsPerUniqueUserId(List<String> logs){

        Map<Integer,Set<String>> solution = new HashMap<>();

        for (int i = 0; i < logs.size(); i++){

            String item = logs.get(i);

            String[] itemArray = item.split(" ");


            String user = itemArray[0];
            String action = itemArray[1];

            // get userid num

            String [] userArray = user.split(":");
            Integer userId = Integer.valueOf(userArray[1]);

            // get action type
            String [] actionArray = action.split(":");
            String actionType = actionArray[1];

            if(solution.containsKey(userId)){
                // if userId already exists in map
               Set<String> actionSet = solution.get(userId);
               actionSet.add(actionType);
               solution.put(userId, actionSet);


            } else {
                // if userId does not exist in map - yet
                Set<String> actionSet = new HashSet<>();
                actionSet.add(actionType);

                solution.put(userId, actionSet);
            }

        }

        return solution;
    }

    // Remember to iterate through Solution set and get Set Size for each userId
    public static Map<Integer, Integer> getUniqueActionCountPerUniqueUser(Map<Integer, Set<String>> actionMap){

        Map<Integer,Integer> solution = new HashMap<>();

        for (Map.Entry<Integer, Set<String>> entry : actionMap.entrySet()){

            solution.put(entry.getKey(), entry.getValue().size());
        }

        return solution;
    }

    public static Map<Integer,Integer> getCountOfUniqueActionsPerUser(List<String> logs){
        try{
            return getUniqueActionCountPerUniqueUser(getUniqueActionsPerUniqueUserId(logs));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }



}
