package exceptions.exercise8;

public class InvalidEmail extends Exception {
    public InvalidEmail(String massage) {
        super(massage);
    }
}
