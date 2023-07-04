package s2;

import ch.qos.logback.core.CoreConstants;

/* loaded from: classes.dex */
public final class z implements d {

    /* renamed from: a  reason: collision with root package name */
    private final int f50168a;

    /* renamed from: b  reason: collision with root package name */
    private final int f50169b;

    public z(int i11, int i12) {
        this.f50168a = i11;
        this.f50169b = i12;
    }

    @Override // s2.d
    public void a(g buffer) {
        int m11;
        int m12;
        kotlin.jvm.internal.s.g(buffer, "buffer");
        m11 = m00.l.m(this.f50168a, 0, buffer.g());
        m12 = m00.l.m(this.f50169b, 0, buffer.g());
        if (m11 < m12) {
            buffer.n(m11, m12);
        } else {
            buffer.n(m12, m11);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof z) {
            z zVar = (z) obj;
            return this.f50168a == zVar.f50168a && this.f50169b == zVar.f50169b;
        }
        return false;
    }

    public int hashCode() {
        return (this.f50168a * 31) + this.f50169b;
    }

    public String toString() {
        return "SetSelectionCommand(start=" + this.f50168a + ", end=" + this.f50169b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}