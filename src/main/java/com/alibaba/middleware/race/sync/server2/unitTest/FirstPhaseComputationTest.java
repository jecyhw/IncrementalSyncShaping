package com.alibaba.middleware.race.sync.server2.unitTest;

import com.alibaba.middleware.race.sync.server2.PipelinedComputation;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import static com.alibaba.middleware.race.sync.Constants.MIDDLE_FILE_NAME;

/**
 * Created by yche on 6/18/17.
 */
public class FirstPhaseComputationTest {
    public static void main(String[] args) throws IOException, InterruptedException {
        Thread.sleep(5000);
        long startTime = System.currentTimeMillis();
        String srcFolder = "/tmp";
        ArrayList<String> filePathList = new ArrayList<>();
        for (int i = 1; i < 11; i++) {
            filePathList.add(srcFolder + File.separator + i + ".txt");
        }
        PipelinedComputation.firstPhaseComputation(filePathList, "/home/yche/OutPut" + File.separator + MIDDLE_FILE_NAME);
        long endTime = System.currentTimeMillis();
        System.out.println("first phase computation cost:" + (endTime - startTime) + " ms");
    }
}