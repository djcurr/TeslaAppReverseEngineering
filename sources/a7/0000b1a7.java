package s2;

import ch.qos.logback.core.CoreConstants;

/* loaded from: classes.dex */
public final class b implements d {

    /* renamed from: a  reason: collision with root package name */
    private final int f50064a;

    /* renamed from: b  reason: collision with root package name */
    private final int f50065b;

    public b(int i11, int i12) {
        this.f50064a = i11;
        this.f50065b = i12;
    }

    @Override // s2.d
    public void a(g buffer) {
        kotlin.jvm.internal.s.g(buffer, "buffer");
        buffer.b(buffer.h(), Math.min(buffer.h() + this.f50065b, buffer.g()));
        buffer.b(Math.max(0, buffer.i() - this.f50064a), buffer.i());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            return this.f50064a == bVar.f50064a && this.f50065b == bVar.f50065b;
        }
        return false;
    }

    public int hashCode() {
        return (this.f50064a * 31) + this.f50065b;
    }

    public String toString() {
        return "DeleteSurroundingTextCommand(lengthBeforeCursor=" + this.f50064a + ", lengthAfterCursor=" + this.f50065b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}