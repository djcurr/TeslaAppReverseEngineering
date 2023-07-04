package ve;

import oe.d;

/* loaded from: classes3.dex */
public class a implements b {

    /* renamed from: a  reason: collision with root package name */
    private final d f54484a;

    /* renamed from: b  reason: collision with root package name */
    private long f54485b = -1;

    public a(d dVar) {
        this.f54484a = dVar;
    }

    @Override // ve.b
    public long a(long j11) {
        long d11 = d();
        long j12 = 0;
        if (d11 == 0) {
            return -1L;
        }
        if (e() || j11 / d() < this.f54484a.b()) {
            long j13 = j11 % d11;
            int a11 = this.f54484a.a();
            for (int i11 = 0; i11 < a11 && j12 <= j13; i11++) {
                j12 += this.f54484a.i(i11);
            }
            return j11 + (j12 - j13);
        }
        return -1L;
    }

    @Override // ve.b
    public int b(long j11, long j12) {
        long d11 = d();
        if (d11 == 0) {
            return c(0L);
        }
        if (e() || j11 / d11 < this.f54484a.b()) {
            return c(j11 % d11);
        }
        return -1;
    }

    int c(long j11) {
        int i11 = 0;
        long j12 = 0;
        do {
            j12 += this.f54484a.i(i11);
            i11++;
        } while (j11 >= j12);
        return i11 - 1;
    }

    public long d() {
        long j11 = this.f54485b;
        if (j11 != -1) {
            return j11;
        }
        this.f54485b = 0L;
        int a11 = this.f54484a.a();
        for (int i11 = 0; i11 < a11; i11++) {
            this.f54485b += this.f54484a.i(i11);
        }
        return this.f54485b;
    }

    public boolean e() {
        return this.f54484a.b() == 0;
    }
}