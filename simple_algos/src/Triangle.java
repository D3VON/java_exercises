/**
 * 
 */

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
/**
 * @author devonmcb
 *
 */

public class Triangle {
	
    public static void main(String[] args) {
    	
    	BufferedReader buf = null;
        String line = null;
        int numlines = 0;
        String[] lineArray;
        ArrayList<String[]> linesArray = new ArrayList<String[]>();       

//        // Add an element to the first dimension
//        aObject.add(new ArrayList<String>());
//
//        // Place a string in position [0,0]
//        aObject.get(0).add(new String("Quarks"));
//
//        // Display the string in position [0,0]
//        println(aObject.get(0).get(0).toString());
        
        
        // annoyingly set up path to the input file. 
        String filePath = new File("").getAbsolutePath(); // path to this program, sort of
        filePath = filePath + "/src/triangle.txt";
        
        try{
            buf = new BufferedReader(new FileReader(filePath));

            while(true){
            	line = buf.readLine();
            	numlines+=1;
                if(line == null){  
                    break; 
                }else{
                	lineArray = line.split(" ");                  
                	linesArray.add(lineArray);
                }
            }
            for(String[] each : linesArray){  
            	for(String s : each){
            		if(!"".equals(s)){
            			System.out.print(s + " ");
	                }
	            }
            	System.out.println(" ");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (buf != null) {
                	buf.close();
                }
            } catch (IOException e) {
            }
        }
        System.out.println(numlines + " lines");
        
    }
} 
