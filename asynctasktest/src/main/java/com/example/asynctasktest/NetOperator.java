package com.example.asynctasktest;

/**
 * Created by Ray on 2015/5/26.
 */
public class NetOperator {

    public void operator(){
        try {
            //休眠1秒
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}