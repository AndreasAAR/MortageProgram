public interface Entry {

    /**
     * Flag to see what entry a row belongs to
     */
    boolean flagMatch();
    /**
     * Parsing a field when checked to be correct
     */
    boolean parseField(Field field);
    /**
     * Checks if fields correspond to this entry correctly
     */
    static boolean fieldsCorrect(String line, Field[] fields){
        for(Field field : fields){
            if(!field.structureCorrect(line)){
                return false;
            }
        }
        return true;
    }
    /**
     * Process field, returns value
     */
    boolean processFields(Field field);
    /**
     * Returns entry type, important for DataFormatManager
     */
    EntryType getEntryType();
    /**
     * Returns stored fields, used for passing correct field types for the entry
     */
    Field[] getFields();
}
enum EntryType {
    START,DATA,STOP
}
