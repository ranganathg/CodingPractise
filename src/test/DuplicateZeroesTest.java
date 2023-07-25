package test;

import org.junit.Test;
import rangag.practise.lc.DuplicateZeroes;

import static org.junit.Assert.*;

public class DuplicateZeroesTest {

    @Test
    public void duplicateZeros() {
        DuplicateZeroes dz = new DuplicateZeroes();
        dz.duplicateZeros(new int[]{1,0,2,3,0,4,5,0});
        dz.duplicateZeros(new int[]{8,4,5,0,0,0,0,7});
    }
}