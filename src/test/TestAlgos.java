package test;


import org.junit.Test;
import rangag.practise.lc.CheckIfNAndDoubleExist;
import rangag.practise.lc.HeightChecker;

public class TestAlgos {
    @Test
    public void testDoubleExists()
    {
        //new CheckIfNAndDoubleExist().checkIfExist(new int[]{10,2,5,3});
        new HeightChecker().heightChecker(new int[]{1,1,4,2,1,3});
    }
}
