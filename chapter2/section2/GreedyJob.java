package chapter2.section2;

import java.util.Arrays;

public class GreedyJob {

    public static void main(String[] args) {
        int n = 5;
        int[] s = {1, 2, 4, 6, 8};
        int[] t = {3, 5, 7, 9, 10};

        // put job schedule info into array
        Job[] jobs = new Job[n];
        for (int i = 0; i < n; i++) {
            jobs[i] = new Job(s[i], t[i]);
        }

        // sort by end time
        Arrays.sort(jobs);

        // greedy search
        int currentTime = 0;
        for (Job job : jobs) {
            if (job.start >= currentTime) {
                System.out.println("start time: " + job.start + ", end time: " + job.end);
                currentTime = job.end;
            }
        }
    }

     static class Job implements Comparable<Job> {
        int start;
        int end;

        Job(int start, int end) {
            this.start = start;
            this.end = end;
        }

        @Override
        public int compareTo(Job other) {
            return Integer.compare(this.end, other.end);
        }
    }
}
