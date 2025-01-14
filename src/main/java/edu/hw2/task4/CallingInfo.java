package edu.hw2.task4;

public class CallingInfo {

    private CallingInfo() {

    }

    public static Record callingInfo() {
        StackTraceElement[] info = Thread.currentThread().getStackTrace();
        StackTraceElement caller = info[1];
        new CallingInfoRecord(caller.getClassName(), caller.getMethodName());
        return new CallingInfoRecord(caller.getClassName(), caller.getMethodName());
    }
}
