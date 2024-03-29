package code.shubham.commons.exceptions;

import code.shubham.common.exceptions.InvalidRequestException;

import java.util.Collection;
import java.util.Map;

public class InvalidParametersException extends InvalidRequestException {

    public InvalidParametersException(final Map<String, Collection<String>> messages) {
        super(messages);
    }

    @Override
    public String getMessage() {
        StringBuilder errorMessageBuilder = new StringBuilder();
        if (this.errorMessages != null)
            for (Map.Entry<String, Collection<String>> entry : this.errorMessages.entrySet()) {
                String errorMessage = entry.getKey();
                Collection<String> params = entry.getValue();
                errorMessageBuilder
                        .append(String.format(String.join(", ", params), errorMessage));
            }
        return errorMessageBuilder.toString();
    }

}
