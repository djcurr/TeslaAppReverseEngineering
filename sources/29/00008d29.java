package nx;

/* loaded from: classes5.dex */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    private int f41986a;

    /* renamed from: b  reason: collision with root package name */
    private int f41987b;

    /* renamed from: c  reason: collision with root package name */
    private int f41988c;

    /* renamed from: d  reason: collision with root package name */
    private final int[] f41989d = new int[10];

    public int a(int i11) {
        return this.f41989d[i11];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int b() {
        if ((this.f41986a & 2) != 0) {
            return this.f41989d[1];
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int c(int i11) {
        return (this.f41986a & 32) != 0 ? this.f41989d[5] : i11;
    }

    public boolean d(int i11) {
        return ((1 << i11) & this.f41986a) != 0;
    }

    public i e(int i11, int i12, int i13) {
        int[] iArr = this.f41989d;
        if (i11 >= iArr.length) {
            return this;
        }
        int i14 = 1 << i11;
        this.f41986a |= i14;
        if ((i12 & 1) != 0) {
            this.f41987b |= i14;
        } else {
            this.f41987b &= ~i14;
        }
        if ((i12 & 2) != 0) {
            this.f41988c |= i14;
        } else {
            this.f41988c &= ~i14;
        }
        iArr[i11] = i13;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int f() {
        return Integer.bitCount(this.f41986a);
    }
}