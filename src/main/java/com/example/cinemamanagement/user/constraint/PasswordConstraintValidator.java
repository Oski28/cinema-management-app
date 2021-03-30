package com.example.cinemamanagement.user.constraint;

import org.passay.*;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PasswordConstraintValidator implements ConstraintValidator<ValidPassword, String> {
    @Override
    public void initialize(ValidPassword constraintAnnotation) {

    }

    @Override
    public boolean isValid(String password, ConstraintValidatorContext constraintValidatorContext) {
        PasswordValidator passwordValidator = new PasswordValidator(Arrays.asList(
                new LengthRule(8, 100),
                new CharacterRule(EnglishCharacterData.UpperCase, 1),
                new CharacterRule(EnglishCharacterData.LowerCase, 1),
                new CharacterRule(EnglishCharacterData.Digit, 1),
                new CharacterRule(EnglishCharacterData.Special, 1),
                new WhitespaceRule()
        ));
        RuleResult result = passwordValidator.validate(new PasswordData(password));
        if (result.isValid()) {
            return true;
        }
        List<String> messages = passwordValidator.getMessages(result);

        String messageTemplate = messages.stream()
                .collect(Collectors.joining(","));
        constraintValidatorContext.buildConstraintViolationWithTemplate(messageTemplate)
                .addConstraintViolation()
                .disableDefaultConstraintViolation();
        return false;
    }
}
