package gf;

import android.graphics.Bitmap;
import com.facebook.common.memory.PooledByteBuffer;

/* loaded from: classes3.dex */
public class e extends f {

    /* renamed from: e  reason: collision with root package name */
    private static final String f27968e = "e";

    /* renamed from: a  reason: collision with root package name */
    private final b f27969a;

    /* renamed from: b  reason: collision with root package name */
    private final com.facebook.imagepipeline.platform.d f27970b;

    /* renamed from: c  reason: collision with root package name */
    private final jf.a f27971c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f27972d;

    public e(b bVar, com.facebook.imagepipeline.platform.d dVar, jf.a aVar) {
        this.f27969a = bVar;
        this.f27970b = dVar;
        this.f27971c = aVar;
    }

    private qd.a<Bitmap> e(int i11, int i12, Bitmap.Config config) {
        return this.f27971c.c(Bitmap.createBitmap(i11, i12, config), h.b());
    }

    @Override // gf.f
    public qd.a<Bitmap> d(int i11, int i12, Bitmap.Config config) {
        if (this.f27972d) {
            return e(i11, i12, config);
        }
        qd.a<PooledByteBuffer> a11 = this.f27969a.a((short) i11, (short) i12);
        try {
            nf.e eVar = new nf.e(a11);
            eVar.Z0(af.b.f395a);
            qd.a<Bitmap> b11 = this.f27970b.b(eVar, config, null, a11.J().size());
            if (!b11.J().isMutable()) {
                qd.a.C(b11);
                this.f27972d = true;
                nd.a.L(f27968e, "Immutable bitmap returned by decoder");
                qd.a<Bitmap> e11 = e(i11, i12, config);
                nf.e.j(eVar);
                return e11;
            }
            b11.J().setHasAlpha(true);
            b11.J().eraseColor(0);
            nf.e.j(eVar);
            return b11;
        } finally {
            a11.close();
        }
    }
}