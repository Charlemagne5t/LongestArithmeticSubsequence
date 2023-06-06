import org.example.Solution;
import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void longestArithSeqLengthTest1() {
        int[] nums = {3, 6, 9, 12};
        int output = 4;
        Assert.assertEquals(output, new Solution().longestArithSeqLength(nums));
    }

    @Test
    public void longestArithSeqLengthTest2() {
        int[] nums = {9, 4, 7, 2, 10};
        int output = 3;
        Assert.assertEquals(output, new Solution().longestArithSeqLength(nums));
    }

    @Test
    public void longestArithSeqLengthTest3() {
        int[] nums = {20, 1, 15, 3, 10, 5, 8};
        int output = 4;
        Assert.assertEquals(output, new Solution().longestArithSeqLength(nums));
    }

    @Test
    public void longestArithSeqLengthTest4() {
        int[] nums = {48,37,51,45,48,48,22,7,30,55,3,54,57,53,13,39,27,8,49,19,47,1,6,42,20,13,13,42,49,46,12,30,41,30,59,51,11,54,35,17,7,28,43,29,22,37,48,11,5,2,49,55,10,3,47,56,4,32,24,59,46,12,17,43,11,56,33,27,25,49,41,13,31,41,28,22,48,45,36,48,28,33,10,26,42,58,56,21,58,54,7,22,4,54,45,56,58,47,13,27};
        int output = 6;
        Assert.assertEquals(output, new Solution().longestArithSeqLength(nums));
    }
}
