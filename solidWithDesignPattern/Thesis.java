public class Thesis implements Resource{
    private String thesisTitle;
    private String orcid;

    public Thesis(String thesisTitle, String orcid) {
        this.thesisTitle = thesisTitle;
        this.orcid = orcid;
    }


    @Override
    public String getTitle() {
        return thesisTitle + " (Thesis)";
    }

    @Override
    public String getResourceId() {
        return orcid;
    }
}
