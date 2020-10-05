import java.io.File;

public class Main {
    /**
     * This is were the
     * @param args
     */
    public static void main(String[] args){
        //File inFile = new
        File inFile = new File(args[0]);
        new FileManager(inFile);
        assert inFile != null;
    }

}
