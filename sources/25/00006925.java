package expo.modules.core.errors;

/* loaded from: classes5.dex */
public class InvalidArgumentException extends CodedRuntimeException {
    public InvalidArgumentException(String str) {
        super(str);
    }

    @Override // expo.modules.core.errors.CodedRuntimeException, expo.modules.core.interfaces.CodedThrowable
    public String getCode() {
        return "ERR_INVALID_ARGUMENT";
    }

    public InvalidArgumentException(Throwable th2) {
        super(th2);
    }

    public InvalidArgumentException(String str, Throwable th2) {
        super(str, th2);
    }
}