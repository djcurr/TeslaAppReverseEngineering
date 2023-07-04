package lf;

import android.graphics.Bitmap;
import com.facebook.imagepipeline.decoder.DecodeException;
import java.io.InputStream;
import java.util.Map;
import nf.i;
import nf.j;

/* loaded from: classes3.dex */
public class a implements b {

    /* renamed from: a  reason: collision with root package name */
    private final b f37165a;

    /* renamed from: b  reason: collision with root package name */
    private final b f37166b;

    /* renamed from: c  reason: collision with root package name */
    private final com.facebook.imagepipeline.platform.d f37167c;

    /* renamed from: d  reason: collision with root package name */
    private final b f37168d;

    /* renamed from: e  reason: collision with root package name */
    private final Map<af.c, b> f37169e;

    /* renamed from: lf.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    class C0702a implements b {
        C0702a() {
        }

        @Override // lf.b
        public nf.c a(nf.e eVar, int i11, j jVar, p001if.b bVar) {
            af.c L = eVar.L();
            if (L == af.b.f395a) {
                return a.this.d(eVar, i11, jVar, bVar);
            }
            if (L == af.b.f397c) {
                return a.this.c(eVar, i11, jVar, bVar);
            }
            if (L == af.b.f404j) {
                return a.this.b(eVar, i11, jVar, bVar);
            }
            if (L != af.c.f407b) {
                return a.this.e(eVar, bVar);
            }
            throw new DecodeException("unknown image format", eVar);
        }
    }

    public a(b bVar, b bVar2, com.facebook.imagepipeline.platform.d dVar) {
        this(bVar, bVar2, dVar, null);
    }

    @Override // lf.b
    public nf.c a(nf.e eVar, int i11, j jVar, p001if.b bVar) {
        InputStream R;
        b bVar2;
        b bVar3 = bVar.f30369i;
        if (bVar3 != null) {
            return bVar3.a(eVar, i11, jVar, bVar);
        }
        af.c L = eVar.L();
        if ((L == null || L == af.c.f407b) && (R = eVar.R()) != null) {
            L = af.d.c(R);
            eVar.Z0(L);
        }
        Map<af.c, b> map = this.f37169e;
        if (map != null && (bVar2 = map.get(L)) != null) {
            return bVar2.a(eVar, i11, jVar, bVar);
        }
        return this.f37168d.a(eVar, i11, jVar, bVar);
    }

    public nf.c b(nf.e eVar, int i11, j jVar, p001if.b bVar) {
        b bVar2 = this.f37166b;
        if (bVar2 != null) {
            return bVar2.a(eVar, i11, jVar, bVar);
        }
        throw new DecodeException("Animated WebP support not set up!", eVar);
    }

    public nf.c c(nf.e eVar, int i11, j jVar, p001if.b bVar) {
        b bVar2;
        if (eVar.getWidth() != -1 && eVar.getHeight() != -1) {
            if (!bVar.f30366f && (bVar2 = this.f37165a) != null) {
                return bVar2.a(eVar, i11, jVar, bVar);
            }
            return e(eVar, bVar);
        }
        throw new DecodeException("image width or height is incorrect", eVar);
    }

    public nf.d d(nf.e eVar, int i11, j jVar, p001if.b bVar) {
        qd.a<Bitmap> a11 = this.f37167c.a(eVar, bVar.f30367g, null, i11, bVar.f30371k);
        try {
            vf.b.a(bVar.f30370j, a11);
            nf.d dVar = new nf.d(a11, jVar, eVar.e0(), eVar.D());
            dVar.l("is_rounded", false);
            return dVar;
        } finally {
            a11.close();
        }
    }

    public nf.d e(nf.e eVar, p001if.b bVar) {
        qd.a<Bitmap> c11 = this.f37167c.c(eVar, bVar.f30367g, null, bVar.f30371k);
        try {
            vf.b.a(bVar.f30370j, c11);
            nf.d dVar = new nf.d(c11, i.f41655d, eVar.e0(), eVar.D());
            dVar.l("is_rounded", false);
            return dVar;
        } finally {
            c11.close();
        }
    }

    public a(b bVar, b bVar2, com.facebook.imagepipeline.platform.d dVar, Map<af.c, b> map) {
        this.f37168d = new C0702a();
        this.f37165a = bVar;
        this.f37166b = bVar2;
        this.f37167c = dVar;
        this.f37169e = map;
    }
}