package c1;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class e0 {

    /* renamed from: a  reason: collision with root package name */
    private int[] f8450a = new int[10];

    /* renamed from: b  reason: collision with root package name */
    private int f8451b;

    public final void a() {
        this.f8451b = 0;
    }

    public final int b() {
        return this.f8451b;
    }

    public final boolean c() {
        return this.f8451b == 0;
    }

    public final int d() {
        return this.f8450a[this.f8451b - 1];
    }

    public final int e(int i11) {
        return this.f8451b > 0 ? d() : i11;
    }

    public final int f() {
        int[] iArr = this.f8450a;
        int i11 = this.f8451b - 1;
        this.f8451b = i11;
        return iArr[i11];
    }

    public final void g(int i11) {
        int i12 = this.f8451b;
        int[] iArr = this.f8450a;
        if (i12 >= iArr.length) {
            int[] copyOf = Arrays.copyOf(iArr, iArr.length * 2);
            kotlin.jvm.internal.s.f(copyOf, "copyOf(this, newSize)");
            this.f8450a = copyOf;
        }
        int[] iArr2 = this.f8450a;
        int i13 = this.f8451b;
        this.f8451b = i13 + 1;
        iArr2[i13] = i11;
    }
}