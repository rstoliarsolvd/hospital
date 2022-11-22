public class Analises {
    private int bloodPreasure;
    private boolean isBloodGood;
    private  boolean isPeeGood;
    private boolean isSkinGood;

//    public Analises(int bloodPreasure, boolean isBloodGood, boolean isPeeGood, boolean isSkinGood) {
//        this.bloodPreasure = bloodPreasure;
//        this.isBloodGood = isBloodGood;
//        this.isPeeGood = isPeeGood;
//        this.isSkinGood = isSkinGood;
//    }

    public int getBloodPreasure() {
        return bloodPreasure;
    }

    public void setBloodPreasure(int bloodPreasure) {
        this.bloodPreasure = bloodPreasure;
    }

    public boolean isBloodGood() {
        return isBloodGood;
    }

    public void setBloodGood(boolean bloodGood) {
        isBloodGood = bloodGood;
    }

    public boolean isPeeGood() {
        return isPeeGood;
    }

    public void setPeeGood(boolean peeGood) {
        isPeeGood = peeGood;
    }

    public boolean isSkinGood() {
        return isSkinGood;
    }

    public void setSkinGood(boolean skinGood) {
        isSkinGood = skinGood;
    }
}
