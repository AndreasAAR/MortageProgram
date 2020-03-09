import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CalculationBackend {

    public static void main(String[] args) throws FileNotFoundException {
        FileReader fr = new FileReader("Resources/prospects.txt");

        int i;
        try {
            while (true) {
                    if (!((i=fr.read()) != -1))
                        break;
                     System.out.print((char) i);
                }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}


class Customer{

    private double monthPay;
    private double monthInterest;
    private double totalLoan;
    private int numPayments;
    String name;


}
