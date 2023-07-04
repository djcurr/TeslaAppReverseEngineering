package pv;

import ch.qos.logback.core.CoreConstants;

/* loaded from: classes2.dex */
public final class k {

    /* renamed from: a  reason: collision with root package name */
    private final int f46963a;

    /* renamed from: b  reason: collision with root package name */
    private final int f46964b;

    /* renamed from: c  reason: collision with root package name */
    private final int f46965c;

    public k(int i11, int i12, int i13) {
        this.f46963a = i11;
        this.f46964b = i12;
        this.f46965c = i13;
    }

    public final int a() {
        return this.f46964b;
    }

    public final int b() {
        return this.f46965c;
    }

    public final int c() {
        return this.f46963a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof k) {
            k kVar = (k) obj;
            return this.f46963a == kVar.f46963a && this.f46964b == kVar.f46964b && this.f46965c == kVar.f46965c;
        }
        return false;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.f46963a) * 31) + Integer.hashCode(this.f46964b)) * 31) + Integer.hashCode(this.f46965c);
    }

    public String toString() {
        return "FrameMetadata(width=" + this.f46963a + ", height=" + this.f46964b + ", rotation=" + this.f46965c + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}