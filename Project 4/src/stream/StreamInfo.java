package stream;

public class StreamInfo {
    public String uName;
    public int uAccountNo;
    private double ubalance;
    private int numberOfMovie;


    public void setUbalance(double ubalance){
        this.ubalance=ubalance;
    }
    public void setNumberOfMovie(int numberOfMovie){
        this.numberOfMovie=numberOfMovie;
    }
    public double getUbalance(){
        return this.ubalance;
    }
    public int getNumberOfMovie(){
        return this.numberOfMovie;
    }

    StreamInfo(){}

    StreamInfo(String uName,int uAccountNo, double ubalance, int numberOfMovie){
        this.uName=uName;
        this.uAccountNo=uAccountNo;
        this.setUbalance(ubalance);
        this.setNumberOfMovie(numberOfMovie);
    }

    public void updateUAccountNo(int uAccountNo){
        this.uAccountNo=uAccountNo;
    }

    public void updateName(String uName){
        this.uName=uName;
    }

    public void watchMovie(){
        updateBalance(50);
        updateMovieNumber(1);
    }

    //extra:
    public void updateBalance(int x){
        this.ubalance=this.ubalance-x;
    }

    public void updateMovieNumber(int y){
        this.numberOfMovie=this.numberOfMovie+y;
    }

}
