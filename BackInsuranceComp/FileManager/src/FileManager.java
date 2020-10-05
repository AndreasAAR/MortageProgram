import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Figures out what FileFormat corresponds to infile,
 * checks encoding and suffix
 * creates corresponding DataFormatManager,
 * Reads lines and gives to dataFormatManager,
 * DataFormatsmanager uses given interface to send data to receiver.
 */
public class FileManager{
     DataFormatManager fm;
     File inFile;
     HashMap<String,DataFormatManager> dataFormats; //Suffix, DataFormatManager

     public FileManager(File inFile) {
          PaymentService ps = new PaymentService();
          dataFormats.put(ps.getSuffix(), ps);
          PaymentReceiveService prs = new PaymentReceiveService();
          dataFormats.put(prs.getSuffix(), prs);

          this.inFile = inFile;
          String[] suffixSplit = inFile.getName().split("_");
          String suffix = suffixSplit[suffixSplit.length]; //Suffix should be in end post
          assert !suffix.isEmpty();
           fm = dataFormats.get(suffix);
          assert fm != null;

          processFile();

     }

     public void processFile()  {
         /**
          * Works through a file line by line as the DataFormatManager processes them
          */
          try{
          Scanner fileScanner = new Scanner(inFile);
        while(fileScanner.hasNext()){
             Entry parsedEntry =  DataFormatManager.parseEntry(fileScanner.nextLine(),fm.getEntryTypes());
             if(!fm.processEntry(parsedEntry)){ //We break if somethings wrong
                 break;
             }
        }
        }catch (FileNotFoundException fe){
               fe.printStackTrace();
          }
     }


}
