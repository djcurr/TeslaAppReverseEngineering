package dp;

import ch.qos.logback.core.CoreConstants;

/* loaded from: classes2.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    private final int f24218a;

    /* renamed from: b  reason: collision with root package name */
    private final int f24219b;

    public b(int i11, int i12) {
        this.f24218a = i11;
        this.f24219b = i12;
    }

    public final int a() {
        return this.f24219b;
    }

    public final int b() {
        return this.f24218a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof b) {
            b bVar = (b) obj;
            return this.f24218a == bVar.f24218a && this.f24219b == bVar.f24219b;
        }
        return false;
    }

    public final int hashCode() {
        return this.f24218a ^ this.f24219b;
    }

    public final String toString() {
        return this.f24218a + "(" + this.f24219b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}