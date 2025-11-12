package _08ThreadpoolExecutors;

import java.util.concurrent.RecursiveTask;

public class ComputeTask extends RecursiveTask<Integer> {
    int start;
    int end;

    ComputeTask(int start, int end){
        this.start = start;
        this.end = end;
    }

    @Override
    protected Integer compute() {

        if (end - start <= 4){
            int sum = 0;
            for(int i = start; i <= end; i++){
                sum+= i;
            }
            return sum;
        } else{
            // split task
            int mid = (start + end)/2;
            ComputeTask leftTask = new ComputeTask(start, mid);
            ComputeTask rightTask = new ComputeTask(mid+1, end);

            leftTask.fork();
            rightTask.fork();

            int leftRes = leftTask.join();
            int rightRes = rightTask.join();

            return leftRes + rightRes;
        }
    }
}
