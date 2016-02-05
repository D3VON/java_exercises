/* Isitpalindrome.java

  usage: java Isitpalindrome abba
         or
         java Isitpalindrome < palindromes.txt

  given a list of words, is the entire thing a palindrome. 
  Or
  given a file, is each line a palindrome

  NOTE: (from stackoverflow)
  The input is captured by the System.in and not as data passed through 
  the main(String[] args) method when the program starts.

  To read that data from the input, read it from System.in as an 
  InputStream or wrap it in a Reader:

  BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
  ...br.readLine(); 
	
  And make sure to not close the System.in or the Reader, or else you 
  will close keyboard input to your program too!
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
         while ((line = br.readLine()) != null) {
            System.out.println(line);
         }   

      }catch(Exception e){
         e.printStackTrace();
      }


   }
}
