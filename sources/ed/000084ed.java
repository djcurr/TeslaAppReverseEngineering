package lx;

/* loaded from: classes5.dex */
public abstract class c implements a {

    /* renamed from: a  reason: collision with root package name */
    boolean f37765a;

    /* renamed from: b  reason: collision with root package name */
    long f37766b = 0;

    /* renamed from: c  reason: collision with root package name */
    long f37767c = 0;

    /* renamed from: d  reason: collision with root package name */
    int f37768d = 100;

    @Override // lx.a
    public final void a(long j11, long j12, float f11) {
        if (!this.f37765a) {
            d(j12);
            this.f37765a = true;
        }
        if (j11 == -1 && j12 == -1 && f11 == -1.0f) {
            b(-1L, -1L, -1.0f, -1.0f);
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        long j13 = this.f37766b;
        if (currentTimeMillis - j13 >= this.f37768d || j11 == j12 || f11 >= 1.0f) {
            long j14 = currentTimeMillis - j13;
            if (j14 == 0) {
                j14++;
            }
            b(j11, j12, f11, (float) ((j11 - this.f37767c) / j14));
            this.f37766b = System.currentTimeMillis();
            this.f37767c = j11;
        }
        if (j11 == j12 || f11 >= 1.0f) {
            c();
        }
    }

    public abstract void b(long j11, long j12, float f11, float f12);

    public abstract void c();

    public abstract void d(long j11);
}