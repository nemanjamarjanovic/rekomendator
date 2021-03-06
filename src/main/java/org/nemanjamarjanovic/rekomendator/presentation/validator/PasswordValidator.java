package org.nemanjamarjanovic.rekomendator.presentation.validator;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

/**
 *
 * @author nemanja
 */
@FacesValidator
public class PasswordValidator implements Validator {

    @Override
    public void validate(FacesContext context,
            UIComponent component, Object value) throws ValidatorException {

        String password = (String) value;

        if (password.length() < 15) {
            throw new ValidatorException(
                    new FacesMessage("Value must be over 15 characters!"));
        }
        if (password.matches("[.]*[A-Z]+[.]*")) {
            throw new ValidatorException(
                    new FacesMessage("Value must contain uppercase letter!"));
        }
        if (password.matches("[.]*[a-z]+[.]*")) {
            throw new ValidatorException(
                    new FacesMessage("Value must contain lowercase letter!"));
        }
        if (password.matches("[.]*[0-9]+[.]*")) {
            throw new ValidatorException(
                    new FacesMessage("Value must contain number!"));
        }

    }

}
