public class Som {

    private int getal1;
    private int getal2;

    final int Overloop = 100 ;
    final int Onderloop = 0;


    public Som(int getal1, int getal2) {
        this.getal1 = getal1;
        this.getal2 = getal2;
    }

    public int  berekenSom() throws BovenloopException, OnderloopException{
        int uitkomst = this.getal1 + this.getal2;
        if (uitkomst > Overloop){
            throw new BovenloopException();
        }else if (uitkomst < Onderloop){
            throw new OnderloopException(uitkomst);
        }
        return uitkomst;
    }
}
