package terning.jayson.rewind.exception;

import lombok.Getter;
import terning.jayson.rewind.exception.enums.ErrorMessage;

@Getter
public class CustomException extends RuntimeException {

    private ErrorMessage errorMessage;

    public CustomException(ErrorMessage errorMessage) {
        super(errorMessage.getMessage());
        this.errorMessage = errorMessage;
    }
}
