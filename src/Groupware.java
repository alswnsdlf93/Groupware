public class Groupware {
    int CompanyId;
    String CompanyType;
    String CompanyName;
    String Id;
    String CompanyPassword;
    String APIType;
    boolean ServerStatus;


    public Groupware(int CompanyId, String CompanyType, String CompanyName, String Id, String CompanyPassword, String APIType, boolean ServerStatus) {
        this.CompanyId = CompanyId;
        this.CompanyType = CompanyType;
        this.CompanyName = CompanyName;
        this.Id = Id;
        this.CompanyPassword = CompanyPassword;
        this.APIType = APIType;
        this.ServerStatus = ServerStatus;
    }

    public int getCompanyId() {
        return this.CompanyId;
    }

    public String getCompanyName() {
        return this.CompanyName;
    }

    public void setServerStatus(boolean ServerStatus) {
        this.ServerStatus = ServerStatus;
    }

    public boolean getServerStatus() {
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

