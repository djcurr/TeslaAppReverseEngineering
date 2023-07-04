package nf;

import android.graphics.Bitmap;
import md.k;
import org.spongycastle.crypto.tls.CipherSuite;

/* loaded from: classes3.dex */
public class d extends b implements qd.d {

    /* renamed from: c  reason: collision with root package name */
    private qd.a<Bitmap> f41637c;

    /* renamed from: d  reason: collision with root package name */
    private volatile Bitmap f41638d;

    /* renamed from: e  reason: collision with root package name */
    private final j f41639e;

    /* renamed from: f  reason: collision with root package name */
    private final int f41640f;

    /* renamed from: g  reason: collision with root package name */
    private final int f41641g;

    public d(Bitmap bitmap, qd.h<Bitmap> hVar, j jVar, int i11) {
        this(bitmap, hVar, jVar, i11, 0);
    }

    private synchronized qd.a<Bitmap> D() {
        qd.a<Bitmap> aVar;
        aVar = this.f41637c;
        this.f41637c = null;
        this.f41638d = null;
        return aVar;
    }

    private static int J(Bitmap bitmap) {
        if (bitmap == null) {
            return 0;
        }
        return bitmap.getHeight();
    }

    private static int L(Bitmap bitmap) {
        if (bitmap == null) {
            return 0;
        }
        return bitmap.getWidth();
    }

    public synchronized qd.a<Bitmap> C() {
        return qd.a.m(this.f41637c);
    }

    public int R() {
        return this.f41641g;
    }

    @Override // nf.c
    public j a() {
        return this.f41639e;
    }

    public int a0() {
        return this.f41640f;
    }

    @Override // nf.c, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        qd.a<Bitmap> D = D();
        if (D != null) {
            D.close();
        }
    }

    @Override // nf.c
    public int g() {
        return com.facebook.imageutils.a.e(this.f41638d);
    }

    @Override // nf.h
    public int getHeight() {
        int i11;
        if (this.f41640f % CipherSuite.TLS_DHE_PSK_WITH_NULL_SHA256 == 0 && (i11 = this.f41641g) != 5 && i11 != 7) {
            return J(this.f41638d);
        }
        return L(this.f41638d);
    }

    @Override // nf.h
    public int getWidth() {
        int i11;
        if (this.f41640f % CipherSuite.TLS_DHE_PSK_WITH_NULL_SHA256 == 0 && (i11 = this.f41641g) != 5 && i11 != 7) {
            return L(this.f41638d);
        }
        return J(this.f41638d);
    }

    @Override // nf.c
    public synchronized boolean isClosed() {
        return this.f41637c == null;
    }

    @Override // nf.b
    public Bitmap p() {
        return this.f41638d;
    }

    public d(Bitmap bitmap, qd.h<Bitmap> hVar, j jVar, int i11, int i12) {
        this.f41638d = (Bitmap) k.g(bitmap);
        this.f41637c = qd.a.u0(this.f41638d, (qd.h) k.g(hVar));
        this.f41639e = jVar;
        this.f41640f = i11;
        this.f41641g = i12;
    }

    public d(qd.a<Bitmap> aVar, j jVar, int i11) {
        this(aVar, jVar, i11, 0);
    }

    public d(qd.a<Bitmap> aVar, j jVar, int i11, int i12) {
        qd.a<Bitmap> aVar2 = (qd.a) k.g(aVar.l());
        this.f41637c = aVar2;
        this.f41638d = aVar2.J();
        this.f41639e = jVar;
        this.f41640f = i11;
        this.f41641g = i12;
    }
}