package Java;

class LengthSolution {
    public int lengthOfLastWord(String s) {
        String[] word = s.split(" ");
        return word[word.length - 1].length();
    }
}


class LastWordLength {
    public static void main(String[] args){
        LengthSolution solution = new LengthSolution();
        System.out.println(solution.lengthOfLastWord("Hello World"));
        System.out.println(solution.lengthOfLastWord("   fly me   to   the moon  "));
        System.out.println(solution.lengthOfLastWord("luffy is still joyboy"));
    }
}
