public class StringOperationsUnmatchedParentheses {

/**
 * Bracket match: String method
 * A string of brackets is correctly matched if you can pair every opening bracket up with a later closing bracket.
 * implement a function which takes a string of brackets and returns the minimum number of brackets you'd have to add
 * to the string to make it correctly matched. If the string is correctly matched, return zero.
 *
 * Also, removeAllButParentheses() removes all but parentheses, if other characters are included.
 *
 */

    public static String removeAllButParentheses(String brackets){
        brackets = brackets.replaceAll("[^)(]", "");
        return brackets;
    }

    public static int unmatchedBrackets(String brackets){

        // locally remove everything but brackets
        brackets = removeAllButParentheses(brackets);

        // locally, iteratively (as the string shrinks) remove matching brackets
        while(brackets.contains("()")) {
            brackets = brackets.replace("()", "");
        }
        return brackets.length();
    }

    public static void main(String args[]){

        String bracketsWithText = "((((woof))()(meow)))"; // should be 0 unmatched
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

        // does removing all text but parentheses work?
        System.out.println(removeAllButParentheses(bracketsWithText));
        // verify originals not mutated
        System.out.println(bracketsWithText);
        System.out.println(brackets);
        System.out.println(brackets1);
        System.out.println(brackets2);
        System.out.println(brackets3);
        System.out.println(brackets4);
        System.out.println(brackets5);

    }
}