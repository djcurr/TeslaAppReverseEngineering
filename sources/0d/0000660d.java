package dp;

import com.google.zxing.l;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    private final int f24220a;

    /* renamed from: b  reason: collision with root package name */
    private final int[] f24221b;

    /* renamed from: c  reason: collision with root package name */
    private final l[] f24222c;

    public c(int i11, int[] iArr, int i12, int i13, int i14) {
        this.f24220a = i11;
        this.f24221b = iArr;
        float f11 = i14;
        this.f24222c = new l[]{new l(i12, f11), new l(i13, f11)};
    }

    public l[] a() {
        return this.f24222c;
    }

    public int[] b() {
        return this.f24221b;
    }

    public int c() {
        return this.f24220a;
    }

    public boolean equals(Object obj) {
        return (obj instanceof c) && this.f24220a == ((c) obj).f24220a;
    }

    public int hashCode() {
        return this.f24220a;
    }
}