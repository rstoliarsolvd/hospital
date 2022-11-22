public class Treatment {
    private String pill;
    private String tablets;
    private String injection;

    public Treatment(String pill, String tablets, String injection){
        this.pill = pill;
        this.tablets = tablets;
        this.injection = injection;
    }

    public Treatment() {
    }

    public String getPill() {
        return pill;
    }

    public void setPill(String pill) {
        this.pill = pill;
    }

    public String getTablets() {
        return tablets;
    }

    public void setTablets(String tablets) {
        this.tablets = tablets;
    }

    public String getInjection() {
        return injection;
    }

    public void setInjection(String injection) {
        this.injection = injection;
    }
}
