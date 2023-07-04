package expo.modules.core.errors;

/* loaded from: classes5.dex */
public class CurrentActivityNotFoundException extends CodedException {
    public CurrentActivityNotFoundException() {
        super("Current activity not found. Make sure to call this method while your application is in foreground.");
    }

    @Override // expo.modules.core.errors.CodedException, expo.modules.core.interfaces.CodedThrowable
    public String getCode() {
        return "E_CURRENT_ACTIVITY_NOT_FOUND";
    }
}