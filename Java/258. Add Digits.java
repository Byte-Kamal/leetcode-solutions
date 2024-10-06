package Java;
class Solution {
    public int addDigits(int num) {
        if (num < 10) {
            return num;
        } else{
            return addDigits((num / 10) + (num % 10));
        }
    }
}

class AddDigits{

    public static void main(String args[]){
        Solution solution = new Solution();
        int answer = solution.addDigits(38);
        System.out.println(answer);
    }
}