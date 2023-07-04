package s2;

import ch.qos.logback.core.CoreConstants;

/* loaded from: classes.dex */
public final class y implements d {

    /* renamed from: a  reason: collision with root package name */
    private final n2.a f50166a;

    /* renamed from: b  reason: collision with root package name */
    private final int f50167b;

    public y(n2.a annotatedString, int i11) {
        kotlin.jvm.internal.s.g(annotatedString, "annotatedString");
        this.f50166a = annotatedString;
        this.f50167b = i11;
    }

    @Override // s2.d
    public void a(g buffer) {
        int m11;
        kotlin.jvm.internal.s.g(buffer, "buffer");
        if (buffer.j()) {
            int e11 = buffer.e();
            buffer.k(buffer.e(), buffer.d(), b());
            if (b().length() > 0) {
                buffer.l(e11, b().length() + e11);
            }
        } else {
            int i11 = buffer.i();
            buffer.k(buffer.i(), buffer.h(), b());
            if (b().length() > 0) {
                buffer.l(i11, b().length() + i11);
            }
        }
        int f11 = buffer.f();
        int i12 = this.f50167b;
        m11 = m00.l.m(i12 > 0 ? (f11 + i12) - 1 : (f11 + i12) - b().length(), 0, buffer.g());
        buffer.m(m11);
    }

    public final String b() {
        return this.f50166a.g();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof y) {
            y yVar = (y) obj;
            return kotlin.jvm.internal.s.c(b(), yVar.b()) && this.f50167b == yVar.f50167b;
        }
        return false;
    }

    public int hashCode() {
        return (b().hashCode() * 31) + this.f50167b;
    }

    public String toString() {
        return "SetComposingTextCommand(text='" + b() + "', newCursorPosition=" + this.f50167b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public y(String text, int i11) {
        this(new n2.a(text, null, null, 6, null), i11);
        kotlin.jvm.internal.s.g(text, "text");
    }
}