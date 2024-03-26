import java.util.Arrays;

class Solution {
        static class TestEntity implements Comparable<TestEntity> {
            int og = 0;
            int ogIndx = 0;
            int minus = 0;

            TestEntity(int og, int ogIndx, int minus) {
                this.og = og;
                this.ogIndx = ogIndx;
                this.minus = minus;
            }
            @Override
            public int compareTo(TestEntity other) {
                if (this.minus == other.minus) {
                    return Integer.compare(other.og, this.og);
                }
                return Integer.compare(this.minus, other.minus);
            }
        }
        public static TestEntity[] makeEntity(int[] nums, int n) {
            TestEntity[] test = new TestEntity[nums.length];
            for (int i = 0; i < nums.length; i++) {
                test[i] = new TestEntity(nums[i], i, Math.abs(nums[i] - n));
            }
            return test;
        }
        public int[] solution(int[] numlist, int n) {
            int[] answer = new int[numlist.length];
            TestEntity[] testAry = makeEntity(numlist,n);
            Arrays.sort(testAry);

            for(int i = 0; i<testAry.length;i++) {
                answer[i] = testAry[i].og;
            }
            return answer;
        }
}