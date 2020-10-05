public class PaymentReceiveService implements DataFormatManager {

    Encoding encoding = Encoding.ISO_8859_1;

    @Override
    public Encoding getEncoding() {
        return encoding;
    }

    @Override
    public boolean processEntry(Entry entry) {
        return false;
    }

    @Override
    public Entry[] getEntryTypes() {
        return new Entry[0];
    }

    @Override
    public String getSuffix() {
        return null;
    }

    @Override
    public String getLineBreak() {
        return null;
    }

}

class paymentStartEntry implements  Entry{

    @Override
    public boolean flagMatch() {
        return false;
    }

    @Override
    public boolean parseField(Field field) {
        return false;
    }

    @Override
    public boolean processFields(Field field) {
        return false;
    }


    @Override
    public EntryType getEntryType() {
        return null;
    }

    @Override
    public Field[] getFields() {
        return new Field[0];
    }

}

class paymentDataEntry implements  Entry{

    @Override
    public boolean flagMatch() {
        return false;
    }

    @Override
    public boolean parseField(Field field) {
        return false;
    }

    @Override
    public boolean processFields(Field field) {
        return false;
    }

    @Override
    public EntryType getEntryType() {
        return null;
    }

    @Override
    public Field[] getFields() {
        return new Field[0];
    }

}

class paymentStopEntry implements  Entry{

    @Override
    public boolean flagMatch() {
        return false;
    }

    @Override
    public boolean parseField(Field field) {
        return false;
    }

    @Override
    public boolean processFields(Field field) {
        return false;
    }


    @Override
    public EntryType getEntryType() {
        return null;
    }

    @Override
    public Field[] getFields() {
        return new Field[0];
    }

}