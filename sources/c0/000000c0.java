package ak;

import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
public final class k {

    /* renamed from: a  reason: collision with root package name */
    private int f472a = 0;

    /* renamed from: b  reason: collision with root package name */
    private int f473b = -1;

    /* renamed from: c  reason: collision with root package name */
    private int f474c = 0;

    /* renamed from: d  reason: collision with root package name */
    private int[] f475d;

    /* renamed from: e  reason: collision with root package name */
    private int f476e;

    public k() {
        int[] iArr = new int[16];
        this.f475d = iArr;
        this.f476e = iArr.length - 1;
    }

    private void c() {
        int[] iArr = this.f475d;
        int length = iArr.length << 1;
        if (length >= 0) {
            int[] iArr2 = new int[length];
            int length2 = iArr.length;
            int i11 = this.f472a;
            int i12 = length2 - i11;
            System.arraycopy(iArr, i11, iArr2, 0, i12);
            System.arraycopy(this.f475d, 0, iArr2, i12, i11);
            this.f472a = 0;
            this.f473b = this.f474c - 1;
            this.f475d = iArr2;
            this.f476e = iArr2.length - 1;
            return;
        }
        throw new IllegalStateException();
    }

    public void a(int i11) {
        if (this.f474c == this.f475d.length) {
            c();
        }
        int i12 = (this.f473b + 1) & this.f476e;
        this.f473b = i12;
        this.f475d[i12] = i11;
        this.f474c++;
    }

    public void b() {
        this.f472a = 0;
        this.f473b = -1;
        this.f474c = 0;
    }

    public boolean d() {
        return this.f474c == 0;
    }

    public int e() {
        int i11 = this.f474c;
        if (i11 != 0) {
            int[] iArr = this.f475d;
            int i12 = this.f472a;
            int i13 = iArr[i12];
            this.f472a = (i12 + 1) & this.f476e;
            this.f474c = i11 - 1;
            return i13;
        }
        throw new NoSuchElementException();
    }
}