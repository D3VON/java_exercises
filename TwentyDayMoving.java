import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class TwentyDayMoving {


        /* Now, need:
            tdma : 20 day moving average
            speed : speed of move
            distance : distance from price to 20 day moving average
            speed / distance
         */

    /* each day needs a Twenty day moving average calculated for itself
        So, make a basic function that takes a clump of 20 days and calculates the average
        Some other function will create that clump of days.
     */
    public static Double twentyDayMovingAverage(ArrayList<Double> prices){
        Double sum = 0.0;
        for (Double price:prices)
        {
            sum += price;
        }
        return sum/prices.size();
    }

    public static void main(String args[]){

        //query last 21 days, or 55 days or whaterver
        // would rather use float, it's smaller, but declaration and assignment are ugly
        double days[] = {55,55.5,56,54.3,57.6,58.6,55.4,54.2,53.2,52.1,50.8,48.3,45.5,43,40,38,39,40,41,42};
        double otherdays[] = new double[] {55,55.5,56,54.1,57.6,58.6,55.4,54.2,53.2,52.1,50.8,48.3,45.5,43.9,40.9,38,39,40.9,41.9,42.9};

        double sum = 0;

        for (double day:days)
        {
            sum += day;
        }
        double average = sum/days.length;
        System.out.println(average);

        average += 0.002;
        System.out.println(average);
        average = Math.floor(average * 100) / 100; // appears to truncate
        System.out.println(average);



//
//        Stack<String> stack = new Stack<String>();
//        Queue<String> queue = new LinkedList<String>();

//=============================================file input


        BufferedReader bufDate = null;
        BufferedReader bufHigh = null;
        BufferedReader bufLow = null;
        String lined = null;
        String lineh = null;
        String linel = null;
        int numlines = 0;
        String[] lineArray;
        ArrayList<String> dates = new ArrayList<String>();
        ArrayList<Double> highs = new ArrayList<Double>();
        ArrayList<Double> lows = new ArrayList<Double>();

        String filePath = new File("").getAbsolutePath();
        String filePathDate = filePath + "/aapl_date.txt";
        String filePathHigh = filePath + "/aapl_high.txt";
        String filePathLow = filePath + "/aapl_low.txt";

        try{
            bufDate = new BufferedReader(new FileReader(filePathDate));
            bufHigh = new BufferedReader(new FileReader(filePathHigh));
            bufLow = new BufferedReader(new FileReader(filePathLow));

            while(true){
                lined = bufDate.readLine();
                lineh= bufHigh.readLine();
                linel = bufLow.readLine();

                if(lined == null || lineh == null || linel == null){
                    break;
                }else{ // DEAL WITH INPUT HERE
                    dates.add(lined);
                    highs.add(Double.parseDouble(lineh));
                    lows.add(Double.parseDouble(linel));
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (bufDate != null) {
                    bufDate.close();
                }
                if (bufHigh != null) {
                    bufHigh.close();
                }
                if (bufLow != null) {
                    bufLow.close();
                }
            } catch (IOException e) {
            }
        }


//        for(String d : dates){
//            System.out.println(d);
//        }
//
//        for(Double l : lows){
//            System.out.println(l);
//        }

        /***********************************************************************************************************
         *  Naive algorithm for 20 day moving average.
         ***********************************************************************************************************/
        LinkedList<Double> naiveAveragesList = new LinkedList<>();
        // start on 20th element; go to end of data in given ArrayList.
        int k = 20;// to iterate to end of data
        for(int i = 19;  i<highs.size(); i++) {
            ArrayList<Double> temp = new ArrayList<Double>();
            for(int j = i-19; j<k; j++){
                temp.add(highs.get(j));
            }
            k++; // advance until reaching size of arraylist, then outer loop ends.
            naiveAveragesList.add(twentyDayMovingAverage(temp));
        }

        System.out.println("=============================");
        int z = 1;
        for(Double x : naiveAveragesList){
            System.out.println(z++ + " " + x + ", ");
        }

        System.out.println("=============================");

        /***********************************************************************************************************
         *  Slightly more clever algorithm for 20 day moving average.
         *  --keeping the sum, and modifying it each day.
         *  -->there is a hazard of error-creep, but only very minimal
         ***********************************************************************************************************/
        LinkedList<Double> cleverAveragesList = new LinkedList<>();
        Double cleversum = 0.0;// to iterate to end of data
        for(int i = 0;  i<20; i++) { // initialize the sum
            cleversum += highs.get(i);
        }
        cleverAveragesList.add(cleversum);

        for (  ) {

        }

        }

        System.out.println("=============================");
        int z = 1;
        for(Double x : cleverAveragesList){
            System.out.println(z++ + " " + x + ", ");
        }

        System.out.println("=============================");








    }



}
