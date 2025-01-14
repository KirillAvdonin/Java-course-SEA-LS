package edu.hw2;
import edu.hw2.task4.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Task4Test {

    @Test
    @DisplayName("Testing tryExecute method with  indefinite ending")

    public void callingInfoTest() {
        Record record = CallingInfo.callingInfo();
        Assertions.assertEquals("className = edu.hw2.task4.CallingInfo\n" + "methodName = callingInfo",record.toString());
    }
    }


