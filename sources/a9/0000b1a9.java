package s2;

import ch.qos.logback.core.CoreConstants;

/* loaded from: classes.dex */
public final class c implements d {

    /* renamed from: a  reason: collision with root package name */
    private final int f50066a;

    /* renamed from: b  reason: collision with root package name */
    private final int f50067b;

    public c(int i11, int i12) {
        this.f50066a = i11;
        this.f50067b = i12;
    }

    @Override // s2.d
    public void a(g buffer) {
        boolean b11;
        boolean b12;
        kotlin.jvm.internal.s.g(buffer, "buffer");
        int i11 = this.f50066a;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        while (i13 < i11) {
            i13++;
            i14++;
            if (buffer.i() > i14) {
                b12 = e.b(buffer.c((buffer.i() - i14) - 1), buffer.c(buffer.i() - i14));
                if (b12) {
                    i14++;
                }
            }
            if (i14 == buffer.i()) {
                break;
            }
        }
        int i15 = this.f50067b;
        int i16 = 0;
        while (i12 < i15) {
            i12++;
            i16++;
            if (buffer.h() + i16 < buffer.g()) {
                b11 = e.b(buffer.c((buffer.h() + i16) - 1), buffer.c(buffer.h() + i16));
                if (b11) {
                    i16++;
                }
            }
            if (buffer.h() + i16 == buffer.g()) {
                break;
            }
        }
        buffer.b(buffer.h(), buffer.h() + i16);
        buffer.b(buffer.i() - i14, buffer.i());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            return this.f50066a == cVar.f50066a && this.f50067b == cVar.f50067b;
        }
        return false;
    }

    public int hashCode() {
        return (this.f50066a * 31) + this.f50067b;
    }

    public String toString() {
        return "DeleteSurroundingTextInCodePointsCommand(lengthBeforeCursor=" + this.f50066a + ", lengthAfterCursor=" + this.f50067b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}