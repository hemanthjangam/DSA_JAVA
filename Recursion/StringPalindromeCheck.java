package Recursion;

public class StringPalindromeCheck {
    static boolean check(int i, String s){
        if(i >= s.length()-1) return true;
        if(s.charAt(i) != s.charAt(s.length()-i-1)) return false;
        return check(i+1, s);
    }
    public static void main(String[] args) {
        String s = "racecar";
        boolean result = check(0, s);
        System.out.println(result);
    }
}
