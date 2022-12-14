public class Groupware{
    int Id;
    String CompanyType;
    String CompanyName;
    String CompanyId;
    String CompanyPassword;
    String APIType;
    boolean Bool;



    public Groupware(int Id, String CompanyType, String CompanyName, String CompanyId, String CompanyPassword, String APIType, boolean Bool) {
        this.Id = Id;
        this.CompanyType = CompanyType;
        this.CompanyName = CompanyName;
        this.CompanyId = CompanyId;
        this.CompanyPassword = CompanyPassword;
        this.APIType = APIType;
        this.Bool = Bool;
    }

    public String getCompanyId(){
        return this.CompanyId;
    }

    public String getCompanyName(){
        return this.CompanyName;
    }
}
