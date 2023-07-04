package bf;

import android.graphics.Bitmap;
import java.util.List;

/* loaded from: classes3.dex */
public class f {

    /* renamed from: a  reason: collision with root package name */
    private final c f7660a;

    /* renamed from: b  reason: collision with root package name */
    private qd.a<Bitmap> f7661b;

    /* renamed from: c  reason: collision with root package name */
    private List<qd.a<Bitmap>> f7662c;

    /* renamed from: d  reason: collision with root package name */
    private int f7663d;

    /* renamed from: e  reason: collision with root package name */
    private vf.a f7664e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public f(c cVar) {
        this.f7660a = cVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List<qd.a<android.graphics.Bitmap>>, qd.a<android.graphics.Bitmap>] */
    public e a() {
        try {
            return new e(this);
        } finally {
            qd.a.C(this.f7661b);
            this.f7661b = null;
            qd.a.p(this.f7662c);
            this.f7662c = null;
        }
    }

    public vf.a b() {
        return this.f7664e;
    }

    public List<qd.a<Bitmap>> c() {
        return qd.a.j(this.f7662c);
    }

    public int d() {
        return this.f7663d;
    }

    public c e() {
        return this.f7660a;
    }

    public qd.a<Bitmap> f() {
        return qd.a.m(this.f7661b);
    }

    public f g(vf.a aVar) {
        this.f7664e = aVar;
        return this;
    }

    public f h(List<qd.a<Bitmap>> list) {
        this.f7662c = qd.a.j(list);
        return this;
    }

    public f i(int i11) {
        this.f7663d = i11;
        return this;
    }

    public f j(qd.a<Bitmap> aVar) {
        this.f7661b = qd.a.m(aVar);
        return this;
    }
}