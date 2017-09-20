/**
 * Bracket match: String method
 * A string of brackets is correctly matched if you can pair every opening bracket up with a later closing bracket.
 * implement a function which takes a string of brackets and returns the minimum number of brackets you'd have to add
 * to the string to make it correctly matched. If the string is correctly matched, return zero.
 */
public class StacksAndQueues {

    public static int unmatchedBrackets(String brackets){
        // just remove matching brackets, until they can't
        while(brackets.contains("()")) {
            brackets = brackets.replace("()", "");
        }
        return brackets.length();
    }

    public static void main(String args[]){

        String brackets = "(((())()()))"; // should be 0 unmatched
        String brackets1 = "(((())()())))"; // should be 1 unmatched
        String brackets2 = "(((()))()())))"; // should be 2 unmatched
        String brackets3 = "((("; // should be 3 unmatched
        String brackets4 = ")((("; // should be 4 unmatched
        String brackets5 = ")()))(("; // should be 5 unmatched

        System.out.println(unmatchedBrackets(brackets));
        System.out.println(unmatchedBrackets(brackets1));
        System.out.println(unmatchedBrackets(brackets2));
        System.out.println(unmatchedBrackets(brackets3));
        System.out.println(unmatchedBrackets(brackets4));
        System.out.println(unmatchedBrackets(brackets5));
    }
}