//Andreas Ährlund-Richter Andreas.ahrlund@gmail.com
/**
 *   Holds the encoding, termination logic, and if an entry makes sense in context.
 *   All dataformats have some sort of start-stop system, encoding and entry logic.
 *   If data is passed is not specified but possible.
 */
public interface DataFormatManager {
    /**
     *   All DataManagers has some sort of Encoding
     */
     Encoding getEncoding();
    /**
     *   Entries are checked if existing(two starts cant supercede eachother)
     * @param fileRow
     */
    static Entry parseEntry(String fileRow, Entry[] entries) {
        for (Entry entry : entries) {
            if (Entry.fieldsCorrect(fileRow,entry.getFields())) {
                return entry;
            }
        }
        return null;
    }
    /**
     * Returns if the process follows context correctly
     */
    boolean processEntry(Entry entry);
    /**
     * Passes entries from the defined class to FileManager for use in parseEntry
     */
    Entry[] getEntryTypes();

    /**
     * Returns suffix for filemanager to figure if matches file
     */
    String  getSuffix();
    /**
     * Returns Linebreak for filetype to make sure lines cut correctly
     */
    String  getLineBreak();
}
enum Encoding {
    /**
     *    Defines encoding shared by different DataFormats
     */
    ISO_8859_1("ISO-8859-1");
    public final String label;
    Encoding(String label){
        this.label=label;
    }

}
