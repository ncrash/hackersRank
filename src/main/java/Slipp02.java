import java.util.*;

/**
 * Created by Developer on 2016. 2. 17..
 */
public class Slipp02 {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();

        Map<Integer, Integer> value2Count = new HashMap<Integer, Integer>();
        Set<Integer> uniqueValueSet = new HashSet<Integer>();


        int max = 0;

        Deque<Integer> deque = new LinkedList<Integer>();
        for (int iCount = 0; iCount < n; iCount++) {


            int newValue = in.nextInt();

            Integer count = 0;

            if (deque.size() == m) {
                int removedValue = deque.removeFirst();
                count = value2Count.get(removedValue);
                if(count!=null) {
                    count--;
                    if (count == 0) {
                        uniqueValueSet.remove(removedValue);
                    }
                }
            }


            deque.addLast(newValue);




            count = value2Count.get(newValue);
            if (count == null) {
                count = 0;
            }
            count++;

            uniqueValueSet.add(newValue);
            value2Count.put(newValue, count);



            int uniqueCount = uniqueValueSet.size();
            if (uniqueCount > max) {
                max = uniqueCount;
            }


        }

        System.out.println(max);

    }

}
