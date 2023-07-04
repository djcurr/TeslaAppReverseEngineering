package ji;

/* loaded from: classes3.dex */
public final class y {

    /* renamed from: a  reason: collision with root package name */
    private final byte[] f33782a;

    /* renamed from: b  reason: collision with root package name */
    private final int f33783b;

    /* renamed from: c  reason: collision with root package name */
    private int f33784c;

    /* renamed from: d  reason: collision with root package name */
    private int f33785d;

    public y(byte[] bArr) {
        this.f33782a = bArr;
        this.f33783b = bArr.length;
    }

    private void a() {
        int i11;
        int i12 = this.f33784c;
        ak.a.f(i12 >= 0 && (i12 < (i11 = this.f33783b) || (i12 == i11 && this.f33785d == 0)));
    }

    public int b() {
        return (this.f33784c * 8) + this.f33785d;
    }

    public boolean c() {
        boolean z11 = (((this.f33782a[this.f33784c] & 255) >> this.f33785d) & 1) == 1;
        e(1);
        return z11;
    }

    public int d(int i11) {
        int i12 = this.f33784c;
        int min = Math.min(i11, 8 - this.f33785d);
        int i13 = i12 + 1;
        int i14 = ((this.f33782a[i12] & 255) >> this.f33785d) & (255 >> (8 - min));
        while (min < i11) {
            i14 |= (this.f33782a[i13] & 255) << min;
            min += 8;
            i13++;
        }
        int i15 = i14 & ((-1) >>> (32 - i11));
        e(i11);
        return i15;
    }

    public void e(int i11) {
        int i12 = i11 / 8;
        int i13 = this.f33784c + i12;
        this.f33784c = i13;
        int i14 = this.f33785d + (i11 - (i12 * 8));
        this.f33785d = i14;
        if (i14 > 7) {
            this.f33784c = i13 + 1;
            this.f33785d = i14 - 8;
        }
        a();
    }
}