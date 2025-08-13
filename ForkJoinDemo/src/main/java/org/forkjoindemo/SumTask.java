package org.forkjoindemo;

import java.util.concurrent.RecursiveTask;

/**
 * SumTask 枚举/类/接口说明
 *
 * @author: tanfuzeng
 * @date: 2025/8/13 13:21
 * @version: v1.0.0
 * @since: 2025/8/13 13:21
 **/
public class SumTask extends RecursiveTask<Integer> {
    private int[] arr;
    private int start;
    private int end;

    public SumTask(int[] arr, int start, int end) {
        this.arr = arr;
        this.start = start;
        this.end = end;
    }

    @Override
    protected Integer compute() {
        if(end-start <= 10){
            int sum = 0;
            for(int i=start;i<end;i++){
                sum += arr[i];
            }
            return sum;
        }else{
            int middle = (start+end)/2;
            SumTask left = new SumTask(arr, start, middle);
            SumTask right = new SumTask(arr, middle, end);

            left.fork();
            right.fork();

            //等待并拿到计算结果
            int leftResult = left.join();
            int rightResult = right.join();

            return leftResult + rightResult;
        }
    }
}
