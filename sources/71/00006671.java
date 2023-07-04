package dw;

import kotlin.jvm.internal.s;

/* loaded from: classes6.dex */
public final class q {
    public static final p a(fw.a aVar, String sessionToken, String verificationToken, String confirmationCode) {
        s.g(aVar, "<this>");
        s.g(sessionToken, "sessionToken");
        s.g(verificationToken, "verificationToken");
        s.g(confirmationCode, "confirmationCode");
        return new p(sessionToken, verificationToken, confirmationCode, aVar);
    }
}