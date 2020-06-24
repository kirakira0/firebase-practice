/*
 * Description: File for reading in rows of CSV data
 * Author: Kira Toal
 * Date: June 24, 2020
 */
import java.io.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReportReader {

  private static final String CSV_FILE_PATH = "./data/test.csv";

  public static void readLine(String csvFile) {
    try {
      FileReader fileReader = new FileReader(new File(csvFile));
      BufferedReader bufferedReader = new BufferedReader(fileReader); // wraps file reader
      String row = "";
      String[] tempArr;
      int counter = 0; 
      while((row = bufferedReader.readLine()) != null && counter < 7) {
        
        // tempArr = row.split(DELIMITER);
        tempArr = row.split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)", -1);

        for (String str: tempArr) {
          System.out.println(str); 
        }

        System.out.println("\n\n\n"); 
        counter++; 
      }
      bufferedReader.close();
    } catch(IOException ioe) {
      ioe.printStackTrace();
    }
  }

  public static void main(String[] args) {
    String csvFile = CSV_FILE_PATH;
    readLine(csvFile);
  }

}
