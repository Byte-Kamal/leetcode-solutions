package Java;

class DigitSolution {
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
        DigitSolution solution = new DigitSolution();
        int answer = solution.addDigits(38);
        System.out.println(answer);
    }
}