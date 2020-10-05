import java.math.BigDecimal;
import java.util.Date;

public class PaymentService  implements PaymentReceiver, DataFormatManager {

    Entry startEntry;
    Entry endEntry;


    @Override
    public Encoding getEncoding() {
        return Encoding.ISO_8859_1;
    }

    @Override
    public boolean processEntry(String fileRow) {
        return false;
    }

    @Override
    public boolean terminatedCorrectly() {

        return false;
    }

    @Override
    public String getSuffix() {
        return null;
    }

    @Override
    public String getLineBreak() {
        return null;
    }


    @Override
    public void startPaymentBundle(String accountNumber, Date paymentDate, String currency) {

    }

    @Override
    public void payment(BigDecimal amount, String reference) {

    }

    @Override
    public void endPaymentBundle() {

    }
}

