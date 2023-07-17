import java.util.ArrayList;
import java.util.Collections;

public class JobsSelectionProblem {

    public static class Job {
        int id;
        int deadline;
        int profit;

        public Job(int i, int d, int p) {
            id = i;
            deadline = d;
            profit = p;
        }
    }

    public static void jobsSelection (int[][] jobsInfo){
        ArrayList<Job> jobs = new ArrayList<>();
        for (int i = 0; i < jobsInfo.length; i++) {
            jobs.add(new Job(i, jobsInfo[i][0], jobsInfo[i][1]));
        }
        Collections.sort(jobs, (a,b) -> b.profit-a.profit);
        
        ArrayList<Integer> seq = new ArrayList<>();
        int time = 0;
        for (Job curr : jobs) {
            if (curr.deadline > time) {
                seq.add(curr.id);
                time++;
            }
        }

        System.out.println("max jobs = " + seq.size());
        for (Integer integer : seq) {
            System.out.print(integer + " ");
        }
    }

    public static void main(String[] args) {

        int[][] jobsInfo = {{4, 20}, {1, 10}, {1, 30}, {1, 40}};
        jobsSelection(jobsInfo);
    }
}
