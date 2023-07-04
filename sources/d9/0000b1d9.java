package s2;

import ch.qos.logback.core.CoreConstants;

/* loaded from: classes.dex */
public final class x implements d {

    /* renamed from: a  reason: collision with root package name */
    private final int f50164a;

    /* renamed from: b  reason: collision with root package name */
    private final int f50165b;

    public x(int i11, int i12) {
        this.f50164a = i11;
        this.f50165b = i12;
    }

    @Override // s2.d
    public void a(g buffer) {
        int m11;
        int m12;
        kotlin.jvm.internal.s.g(buffer, "buffer");
        if (buffer.j()) {
            buffer.a();
        }
        m11 = m00.l.m(this.f50164a, 0, buffer.g());
        m12 = m00.l.m(this.f50165b, 0, buffer.g());
        if (m11 == m12) {
            return;
        }
        if (m11 < m12) {
            buffer.l(m11, m12);
        } else {
            buffer.l(m12, m11);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof x) {
            x xVar = (x) obj;
            return this.f50164a == xVar.f50164a && this.f50165b == xVar.f50165b;
        }
        return false;
    }

    public int hashCode() {
        return (this.f50164a * 31) + this.f50165b;
    }

    public String toString() {
        return "SetComposingRegionCommand(start=" + this.f50164a + ", end=" + this.f50165b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}