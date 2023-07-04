package androidx.room;

import androidx.room.t0;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class p0 implements v4.k {

    /* renamed from: a */
    private final v4.k f5823a;

    /* renamed from: b */
    private final t0.f f5824b;

    /* renamed from: c */
    private final String f5825c;

    /* renamed from: d */
    private final List<Object> f5826d = new ArrayList();

    /* renamed from: e */
    private final Executor f5827e;

    public p0(v4.k kVar, t0.f fVar, String str, Executor executor) {
        this.f5823a = kVar;
        this.f5824b = fVar;
        this.f5825c = str;
        this.f5827e = executor;
    }

    public static /* synthetic */ void a(p0 p0Var) {
        p0Var.j();
    }

    public static /* synthetic */ void g(p0 p0Var) {
        p0Var.l();
    }

    public /* synthetic */ void j() {
        this.f5824b.a(this.f5825c, this.f5826d);
    }

    public /* synthetic */ void l() {
        this.f5824b.a(this.f5825c, this.f5826d);
    }

    private void m(int i11, Object obj) {
        int i12 = i11 - 1;
        if (i12 >= this.f5826d.size()) {
            for (int size = this.f5826d.size(); size <= i12; size++) {
                this.f5826d.add(null);
            }
        }
        this.f5826d.set(i12, obj);
    }

    @Override // v4.i
    public void A(int i11, double d11) {
        m(i11, Double.valueOf(d11));
        this.f5823a.A(i11, d11);
    }

    @Override // v4.i
    public void A0(int i11, String str) {
        m(i11, str);
        this.f5823a.A0(i11, str);
    }

    @Override // v4.i
    public void U0(int i11, long j11) {
        m(i11, Long.valueOf(j11));
        this.f5823a.U0(i11, j11);
    }

    @Override // v4.i
    public void V0(int i11, byte[] bArr) {
        m(i11, bArr);
        this.f5823a.V0(i11, bArr);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f5823a.close();
    }

    @Override // v4.i
    public void o1(int i11) {
        m(i11, this.f5826d.toArray());
        this.f5823a.o1(i11);
    }

    @Override // v4.k
    public long s0() {
        this.f5827e.execute(new Runnable() { // from class: androidx.room.n0
            {
                p0.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                p0.a(p0.this);
            }
        });
        return this.f5823a.s0();
    }

    @Override // v4.k
    public int w() {
        this.f5827e.execute(new Runnable() { // from class: androidx.room.o0
            {
                p0.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                p0.g(p0.this);
            }
        });
        return this.f5823a.w();
    }
}