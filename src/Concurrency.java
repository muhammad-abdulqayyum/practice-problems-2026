import java.util.concurrent.CompletableFuture;

public class Concurrency {


    public static void main(){

    }


    public Integer concurrency(){

        Integer gpa = 0;

        // code retrieves gpa from extneral service


        return gpa;
    }

    public CompletableFuture<Integer> getGPA(){

        try {
            Integer gpa = 0;

            CompletableFuture<Integer> futureGPA = CompletableFuture.completedFuture(this.concurrency());

            // return futureGPA.get();
        } catch (Exception w){}

        return null;
    }

}
