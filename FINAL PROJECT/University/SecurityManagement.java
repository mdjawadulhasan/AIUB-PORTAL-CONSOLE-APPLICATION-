package University;

public class SecurityManagement {

    private final String ADID = "ADMIN808";
    private final String FID = "2020-2-18";
    private final String SDID = "20-41958-1";

    private String Upass;
    private String Fpass;
    private String Spass;

    public SecurityManagement() {
    }

    public SecurityManagement(String Upass, String Fpass, String Spass) {
        this.Upass = Upass;
        this.Fpass = Fpass;
        this.Spass = Spass;
    }

    public void setUpass(String Upass) {
        this.Upass = Upass;
    }

    public void setFpass(String Fpass) {
        this.Fpass = Fpass;
    }

    public void setSpass(String Spass) {
        this.Spass = Spass;
    }

    public String getADID() {
        return ADID;
    }

    public String getFID() {
        return FID;
    }

    public String getSDID() {
        return SDID;
    }

    public String getUpass() {
        return Upass;
    }

    public String getFpass() {
        return Fpass;
    }

    public String getSpass() {
        return Spass;
    }

}
