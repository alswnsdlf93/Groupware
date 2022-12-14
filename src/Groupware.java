public class Groupware{
    int Id;
    String CompanyType;
    String CompanyName;
    String CompanyId;
    String CompanyPassword;
    String APIType;
    boolean bool;



    public Groupware(int Id, String CompanyType, String CompanyName, String CompanyId, String CompanyPassword, String APIType, boolean bool) {
        this.Id = Id;
        this.CompanyType = CompanyType;
        this.CompanyName = CompanyName;
        this.CompanyId = CompanyId;
        this.CompanyPassword = CompanyPassword;
        this.APIType = APIType;
        this.bool = bool;
    }

    public String getCompanyId(){
        return this.CompanyId;
    }

    public String getCompanyName(){
        return this.CompanyName;
    }
}
