package bf;

import android.graphics.Bitmap;
import java.util.List;
import md.k;

/* loaded from: classes3.dex */
public class e {

    /* renamed from: a */
    private final c f7656a;

    /* renamed from: b */
    private qd.a<Bitmap> f7657b;

    /* renamed from: c */
    private List<qd.a<Bitmap>> f7658c;

    /* renamed from: d */
    private vf.a f7659d;

    public e(f fVar) {
        this.f7656a = (c) k.g(fVar.e());
        fVar.d();
        this.f7657b = fVar.f();
        this.f7658c = fVar.c();
        this.f7659d = fVar.b();
    }

    public static e b(c cVar) {
        return new e(cVar);
    }

    public static f e(c cVar) {
        return new f(cVar);
    }

    public synchronized void a() {
        qd.a.C(this.f7657b);
        this.f7657b = null;
        qd.a.p(this.f7658c);
        this.f7658c = null;
    }

    public vf.a c() {
        return this.f7659d;
    }

    public c d() {
        return this.f7656a;
    }

    private e(c cVar) {
        this.f7656a = (c) k.g(cVar);
    }
}