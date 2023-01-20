public class OnderloopException extends Exception {
    public OnderloopException(int uitkomst){
        super("Onderloop exception waarde was: " + uitkomst);
    }
}
