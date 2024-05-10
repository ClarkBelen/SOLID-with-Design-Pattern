public class Journal implements Resource{
    private String journalName;
    private String issn;

    public Journal(String journalName, String issn) {
        this.journalName = journalName;
        this.issn = issn;
    }


    @Override
    public String getTitle() {
        return journalName + " (Journal)";
    }

    @Override
    public String getResourceId() {
        return issn;
    }
}
