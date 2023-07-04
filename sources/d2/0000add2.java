package qe;

import android.graphics.Bitmap;
import pe.b;

/* loaded from: classes3.dex */
public class c implements pe.b {

    /* renamed from: a  reason: collision with root package name */
    private int f48070a = -1;

    /* renamed from: b  reason: collision with root package name */
    private b.a f48071b;

    /* renamed from: c  reason: collision with root package name */
    private qd.a<Bitmap> f48072c;

    private synchronized void g() {
        int i11;
        b.a aVar = this.f48071b;
        if (aVar != null && (i11 = this.f48070a) != -1) {
            aVar.a(this, i11);
        }
        qd.a.C(this.f48072c);
        this.f48072c = null;
        this.f48070a = -1;
    }

    @Override // pe.b
    public synchronized qd.a<Bitmap> a(int i11) {
        return qd.a.m(this.f48072c);
    }

    @Override // pe.b
    public synchronized qd.a<Bitmap> b(int i11, int i12, int i13) {
        qd.a<Bitmap> m11;
        m11 = qd.a.m(this.f48072c);
        g();
        return m11;
    }

    @Override // pe.b
    public synchronized boolean c(int i11) {
        boolean z11;
        if (i11 == this.f48070a) {
            z11 = qd.a.n0(this.f48072c);
        }
        return z11;
    }

    @Override // pe.b
    public synchronized void clear() {
        g();
    }

    @Override // pe.b
    public synchronized qd.a<Bitmap> d(int i11) {
        if (this.f48070a == i11) {
            return qd.a.m(this.f48072c);
        }
        return null;
    }

    @Override // pe.b
    public synchronized void e(int i11, qd.a<Bitmap> aVar, int i12) {
        int i13;
        if (aVar != null) {
            if (this.f48072c != null && aVar.J().equals(this.f48072c.J())) {
                return;
            }
        }
        qd.a.C(this.f48072c);
        b.a aVar2 = this.f48071b;
        if (aVar2 != null && (i13 = this.f48070a) != -1) {
            aVar2.a(this, i13);
        }
        this.f48072c = qd.a.m(aVar);
        b.a aVar3 = this.f48071b;
        if (aVar3 != null) {
            aVar3.b(this, i11);
        }
        this.f48070a = i11;
    }

    @Override // pe.b
    public void f(int i11, qd.a<Bitmap> aVar, int i12) {
    }
}