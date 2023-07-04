package s2;

import ch.qos.logback.core.CoreConstants;

/* loaded from: classes.dex */
public final class a implements d {

    /* renamed from: a  reason: collision with root package name */
    private final n2.a f50056a;

    /* renamed from: b  reason: collision with root package name */
    private final int f50057b;

    public a(n2.a annotatedString, int i11) {
        kotlin.jvm.internal.s.g(annotatedString, "annotatedString");
        this.f50056a = annotatedString;
        this.f50057b = i11;
    }

    @Override // s2.d
    public void a(g buffer) {
        int m11;
        kotlin.jvm.internal.s.g(buffer, "buffer");
        if (buffer.j()) {
            buffer.k(buffer.e(), buffer.d(), b());
        } else {
            buffer.k(buffer.i(), buffer.h(), b());
        }
        int f11 = buffer.f();
        int i11 = this.f50057b;
        m11 = m00.l.m(i11 > 0 ? (f11 + i11) - 1 : (f11 + i11) - b().length(), 0, buffer.g());
        buffer.m(m11);
    }

    public final String b() {
        return this.f50056a.g();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            return kotlin.jvm.internal.s.c(b(), aVar.b()) && this.f50057b == aVar.f50057b;
        }
        return false;
    }

    public int hashCode() {
        return (b().hashCode() * 31) + this.f50057b;
    }

    public String toString() {
        return "CommitTextCommand(text='" + b() + "', newCursorPosition=" + this.f50057b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(String text, int i11) {
        this(new n2.a(text, null, null, 6, null), i11);
        kotlin.jvm.internal.s.g(text, "text");
    }
}