/* Isitpalindrome.java

  Given a word, is it a palindrome. 
  Or, given a file, is each line a palindrome

  usage: java Isitpalindrome 

         (then type words)
         type exit to exit 

         or

         java Isitpalindrome < palindromes.txt

         (last word should be 'exit' in the file so the program exits gracefully) 

  NOTE: You cannot enter a word as an argument; enter words after starting the program.
  For file redirection input, the input is captured by System.in. 
  Nothing will be done with anything passed to main(String[] args) when the program starts.
*/


import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;

class Isitpalindrome{

   public static void main(String args[]){

      String  line = null;

      try{
         BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
line = br.readLine();
System.out.println(line);
         while ((line = br.readLine()) != null) {
            if(line.equals("exit")){
              System.exit(0); 
            }
            System.out.println(line);
         }   

      }catch(Exception e){
         e.printStackTrace();
      }


   }
}
