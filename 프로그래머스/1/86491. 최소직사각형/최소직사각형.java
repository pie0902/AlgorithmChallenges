class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int maxLongSide = 0;
        int maxShortSide = 0;

    for (int[] size : sizes) {
        int longSide = Math.max(size[0], size[1]);
        int shortSide = Math.min(size[0], size[1]);
        System.out.println(longSide + " " + shortSide);
        maxLongSide = Math.max(maxLongSide, longSide);
        maxShortSide = Math.max(maxShortSide, shortSide);
    }

    return maxLongSide * maxShortSide;
    }
}