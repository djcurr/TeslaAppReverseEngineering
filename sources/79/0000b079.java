package retrofit2;

import java.util.Objects;

/* loaded from: classes4.dex */
public class HttpException extends RuntimeException {
    public HttpException(s<?> sVar) {
        super(a(sVar));
        sVar.b();
        sVar.g();
    }

    private static String a(s<?> sVar) {
        Objects.requireNonNull(sVar, "response == null");
        return "HTTP " + sVar.b() + " " + sVar.g();
    }
}