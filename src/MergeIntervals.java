import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MergeIntervals {

    public static ArrayList<Interval> mergeIntervals(ArrayList<Interval> intervalsList) {
        //list is null or size is 1 (or less) so only one interval in the list
        if(intervalsList == null || intervalsList.size() < 2) return intervalsList;

        //Create new comparator to sort the list of intervals by their start time
        ArrayList<Interval> list = new ArrayList<>();
        Collections.sort(intervalsList, new Comparator<Interval>() {
            @Override
            public int compare(Interval o1, Interval o2) {
                return Integer.compare(o1.start, o2.start);
            }
        });

        //get the prev interval and start loop at 1. Compare the intervals start time
        Interval prev = intervalsList.get(0);
        for(int i = 1; i < intervalsList.size(); i++) {
            Interval curr = intervalsList.get(i);

            //if [2, 4]         [3, 5]
            //       ^           ^
            //       prev.end    curr.start
            //    curr.start <= prev.end we can combine to be [2, 5]
            if(curr.start <= prev.end) {
                prev = new Interval(prev.start, Math.max(curr.end, prev.end));
            }
            else {
                list.add(prev);
                prev = curr;
            }
        }
        list.add(prev);
        return list;
    }
}
