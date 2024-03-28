import java.util.Arrays;

class Solution {
    public int[] test(int[] ary) {
        if (ary == null || ary.length <= 1) {
            return ary;
        }

        int len = ary.length;
        int[] result = new int[len];
        int index = 0;

        for (int i = 0; i < len; i++) {
            boolean check = false;
            for (int j = 0; j < index; j++) {
                if (ary[i] == result[j]) {
                    check = true;
                    break;
                }
            }
            if (!check) {
                result[index] = ary[i];
                index++;
            }
        }

        return Arrays.copyOf(result, index);
    }

    public static class Model {
        int og = 0;
        int max = 0;

        public Model(int a, int b) {
            this.og = a;
            this.max = b;
        }
    }

    public int solution(int[] array) {
        int answer = 0;
        int[] result = test(array);
        if(result.length<=1){
            answer = array[0];   
            return answer;
        }
        Model[] copy = new Model[result.length];

        for (int i = 0; i < result.length; i++) {
            int cnt = 0;
            for (int j = 0; j < array.length; j++) {
                if (result[i] == array[j]) {
                    cnt++;
                }
            }
            copy[i] = new Model(result[i], cnt);
        }
        int max = 0;
        for (int i = 0; i < copy.length - 1; i++) {
            for (int j = 0; j < copy.length - 1 - i; j++) {
                if (copy[j].max < copy[j + 1].max) {
                    Model temp = copy[j];
                    copy[j] = copy[j + 1];
                    copy[j + 1] = temp;
                }
            }
        }
         if (copy.length > 1 && copy[0].max == copy[1].max) {
            answer = -1;
        } else {
            answer = copy[0].og;
        }

        for (Model model : copy) {
            System.out.println("og: " + model.og + ", max: " + model.max);
        }
        return answer;
    }
}