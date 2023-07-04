package ezvcard;

import java.text.MessageFormat;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

/* loaded from: classes5.dex */
public enum a {
    INSTANCE;
    
    private final ResourceBundle messages = ResourceBundle.getBundle("ezvcard/messages");

    a() {
    }

    public String getExceptionMessage(int i11, Object... objArr) {
        String message = getMessage("exception." + i11, objArr);
        if (message == null) {
            return null;
        }
        return getMessage("exception.0", Integer.valueOf(i11), message);
    }

    public IllegalArgumentException getIllegalArgumentException(int i11, Object... objArr) {
        String exceptionMessage = getExceptionMessage(i11, objArr);
        if (exceptionMessage == null) {
            return null;
        }
        return new IllegalArgumentException(exceptionMessage);
    }

    public String getMessage(String str, Object... objArr) {
        try {
            return MessageFormat.format(this.messages.getString(str), objArr);
        } catch (MissingResourceException unused) {
            return null;
        }
    }

    public String getParseMessage(int i11, Object... objArr) {
        return getMessage("parse." + i11, objArr);
    }

    public String getValidationWarning(int i11, Object... objArr) {
        return getMessage("validate." + i11, objArr);
    }
}