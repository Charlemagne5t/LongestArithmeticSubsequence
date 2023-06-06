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
}
