package r50;

/* loaded from: classes5.dex */
public class a implements b {

    /* renamed from: a  reason: collision with root package name */
    private long[] f49251a;

    @Override // r50.b
    public void exponentiateX(long j11, byte[] bArr) {
        long[] l11 = d.l();
        if (j11 <= 0) {
            d.b(l11, bArr);
        }
        long[] jArr = new long[2];
        d.f(this.f49251a, jArr);
        do {
            if ((1 & j11) != 0) {
                d.j(l11, jArr);
            }
            d.m(jArr, jArr);
            j11 >>>= 1;
        } while (j11 > 0);
        d.b(l11, bArr);
    }

    @Override // r50.b
    public void init(byte[] bArr) {
        this.f49251a = d.d(bArr);
    }
}