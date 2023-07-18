package rangag.practise.lc;

public class StepsToZero1342 {
    public int numberOfSteps(int num) {
        int numSteps = 0;
        while (num != 0) {
            if (num % 2 == 1)
                num--;
            else
                num = num / 2;
            numSteps++;
        }
        return numSteps;
    }
}
