package c00;

import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public class a extends b00.a {
    @Override // b00.a
    public void a(Throwable cause, Throwable exception) {
        s.g(cause, "cause");
        s.g(exception, "exception");
        cause.addSuppressed(exception);
    }
}