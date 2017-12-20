import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Meeting {

    private int startTime;
    private int endTime;

    public Meeting(int startTime, int endTime) {
        // number of 30 min blocks past 9:00 am
        this.startTime = startTime;
        this.endTime   = endTime;


    }

    public int getStartTime() {
        return startTime;
    }

    public void setStartTime(int startTime) {
        this.startTime = startTime;
    }

    public int getEndTime() {
        return endTime;
    }

    public void setEndTime(int endTime) {
        this.endTime = endTime;
    }


}


//    private static List<Meeting> mergeRanges(List<Meeting> meetings) {
//
//        List<Meeting> sorted = new ArrayList<>();
//        for(Meeting meeting: meetings) {
//            Meeting meetingCopy = new Meeting(meeting.getStartTime(), meeting.getEndTime());
//            sorted.add(meetingCopy);
//        }
//
//        //sort by start time
//        Collections.sort(sorted, new Comparator<Meeting>() {
//            @Override
//            public int compare(Meeting m1, Meeting m2) {
//                return m1.getStartTime() - m2.getStartTime();
//            }
//        });
//
//        //initialize merged with earliest meeting
//        List<Meeting> mergedMeetings = new ArrayList<>();
//        mergedMeetings.add(sorted.get(0));
//
//        for(Meeting currMeeting : sorted) {
//            Meeting lastMerged = mergedMeetings.get(mergedMeetings.size() - 1);
//
//            if(currMeeting.getStartTime() <= lastMerged.getEndTime()) {
//                lastMerged.setEndTime(Math.max(lastMerged.getEndTime(), currMeeting.getEndTime()));
//            } else {
//                mergedMeetings.add(currMeeting);
//            }
//        }
//
//        return mergedMeetings;
//    }
//
//    public static void main(String[] args) {
//        List<Meeting> meetings =  new ArrayList<>();
//        meetings.add(new Meeting(0, 1));
//        meetings.add(new Meeting(3, 5));
//        meetings.add(new Meeting(4, 8));
//        meetings.add(new Meeting(10, 12));
//        meetings.add(new Meeting(9, 10));
//
//
//
//        //should return [Meeting(0, 1), Meeting(3, 5), Meeting(9, 12)]
//
//        //if EndTime[1] > StartTime[2] if the end time of 1 is after the start time of 2
//        //      need to check all cases though
//        // has to be outside of range of either
//        //** earlier start time is always considered first
//
//        mergeRanges(meetings);
//
//
//    }
