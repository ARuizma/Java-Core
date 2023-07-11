package exceptionhandling;

import java.io.UncheckedIOException;

public class TestCustom{

    public static void main(String[] args) throws CheckedCustomException {
       // throw new CustomExceptions("Business Exception Ocurred");
        throw new CheckedCustomException("Business Exception that needs to be handled");
    }
}
