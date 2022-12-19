public class Groupware {
    int Id;
    String CompanyType;
    String CompanyName;
    String CompanyId;
    String CompanyPassword;
    String APIType;
    boolean ServerStatus;


    public Groupware(int Id, String CompanyType, String CompanyName, String CompanyId, String CompanyPassword, String APIType, boolean ServerStatus) {
        this.Id = Id;
        this.CompanyType = CompanyType;
        this.CompanyName = CompanyName;
        this.CompanyId = CompanyId;
        this.CompanyPassword = CompanyPassword;
        this.APIType = APIType;
        this.ServerStatus = ServerStatus;
    }

    public String getCompanyId() {
        return this.CompanyId;
    }

    public String getCompanyName() {
        return this.CompanyName;
    }

    public void setServerStatus(boolean ServerStatus) {
        this.ServerStatus = ServerStatus;
    }

    public Object getServerStatus() {
        return this.ServerStatus;
    }
}


//    public void getCompanyId() {
//        System.out.println(this.CompanyId);
//    }
//    public void getCompanyName() {
//        System.out.println(this.CompanyName);
//    }
//
//}

