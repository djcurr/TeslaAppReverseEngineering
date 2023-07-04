package r0;

import vz.b0;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a  reason: collision with root package name */
    private a f48892a;

    /* renamed from: b  reason: collision with root package name */
    private long f48893b = x2.c.b(0, 0, 0, 0, 15, null);

    /* loaded from: classes.dex */
    public interface a {
        void c(int i11);

        void f(int i11);
    }

    public final long a() {
        return this.f48893b;
    }

    public final b0 b(int i11) {
        a aVar = this.f48892a;
        if (aVar == null) {
            return null;
        }
        aVar.c(i11);
        return b0.f54756a;
    }

    public final b0 c(int i11) {
        a aVar = this.f48892a;
        if (aVar == null) {
            return null;
        }
        aVar.f(i11);
        return b0.f54756a;
    }

    public final void d(long j11) {
        this.f48893b = j11;
    }

    public final void e(a aVar) {
        this.f48892a = aVar;
    }
}