package edu.hw2.task4;

public record CallingInfoRecord(String className, String methodName) {
    @Override
    public String toString() {
        return "className = " + className + "\n" + "methodName = " + methodName;
    }
}
