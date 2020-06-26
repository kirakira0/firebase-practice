/* 
 * Description: File for building a POJO from a row of CSV data
 * Author: Kira Toal
 * Date: June 24, 2020
 */ 

// new reportReader = reportReader 
// while reportReader.hasNextRow() {
//  make POJO
//  send POJO to adapter 
//  send adapter to firestore
//}
import java.util.Arrays;
import java.util.List;

public class RowProcessor {
  
  private static final String CSV_FILE_PATH = "./data/output4.csv";

  public static void main(String[] args) {

    List<String[]> allAds = ReportReader.readCSV(CSV_FILE_PATH); // read in the CSV

    for (int i = 0; i < allAds.size(); i++) {

    }
    // for array in list 

    // make POJO from the 

    // allAds.forEach(array -> System.out.println(Arrays.toString(array)));
  }

}