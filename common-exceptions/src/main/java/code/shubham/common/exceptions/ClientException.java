package code.shubham.common.exceptions;

public class ClientException extends RuntimeException {

    public ClientException() {}

    public ClientException(final String message) {
        super(message);
    }

}
