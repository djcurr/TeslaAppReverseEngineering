package ue;

import android.graphics.Bitmap;
import android.graphics.Rect;
import bf.e;
import df.b;
import gd.d;
import gf.f;
import hf.i;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import md.k;
import md.n;
import nf.c;

/* loaded from: classes3.dex */
public class a implements mf.a {

    /* renamed from: a  reason: collision with root package name */
    private final b f53413a;

    /* renamed from: b  reason: collision with root package name */
    private final ScheduledExecutorService f53414b;

    /* renamed from: c  reason: collision with root package name */
    private final ExecutorService f53415c;

    /* renamed from: d  reason: collision with root package name */
    private final td.b f53416d;

    /* renamed from: e  reason: collision with root package name */
    private final f f53417e;

    /* renamed from: f  reason: collision with root package name */
    private final i<d, c> f53418f;

    /* renamed from: g  reason: collision with root package name */
    private final n<Integer> f53419g;

    /* renamed from: h  reason: collision with root package name */
    private final n<Integer> f53420h;

    /* renamed from: i  reason: collision with root package name */
    private final n<Boolean> f53421i;

    public a(b bVar, ScheduledExecutorService scheduledExecutorService, ExecutorService executorService, td.b bVar2, f fVar, i<d, c> iVar, n<Integer> nVar, n<Integer> nVar2, n<Boolean> nVar3) {
        this.f53413a = bVar;
        this.f53414b = scheduledExecutorService;
        this.f53415c = executorService;
        this.f53416d = bVar2;
        this.f53417e = fVar;
        this.f53418f = iVar;
        this.f53419g = nVar;
        this.f53420h = nVar2;
        this.f53421i = nVar3;
    }

    private bf.a c(e eVar) {
        bf.c d11 = eVar.d();
        return this.f53413a.a(eVar, new Rect(0, 0, d11.getWidth(), d11.getHeight()));
    }

    private df.c d(e eVar) {
        return new df.c(new qe.a(eVar.hashCode(), this.f53421i.get().booleanValue()), this.f53418f);
    }

    private oe.a e(e eVar, Bitmap.Config config) {
        re.d dVar;
        re.b bVar;
        bf.a c11 = c(eVar);
        pe.b f11 = f(eVar);
        se.b bVar2 = new se.b(f11, c11);
        int intValue = this.f53420h.get().intValue();
        if (intValue > 0) {
            re.d dVar2 = new re.d(intValue);
            bVar = g(bVar2, config);
            dVar = dVar2;
        } else {
            dVar = null;
            bVar = null;
        }
        return oe.c.o(new pe.a(this.f53417e, f11, new se.a(c11), bVar2, dVar, bVar), this.f53416d, this.f53414b);
    }

    private pe.b f(e eVar) {
        int intValue = this.f53419g.get().intValue();
        if (intValue != 1) {
            if (intValue != 2) {
                if (intValue != 3) {
                    return new qe.d();
                }
                return new qe.c();
            }
            return new qe.b(d(eVar), false);
        }
        return new qe.b(d(eVar), true);
    }

    private re.b g(pe.c cVar, Bitmap.Config config) {
        f fVar = this.f53417e;
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        return new re.c(fVar, cVar, config, this.f53415c);
    }

    @Override // mf.a
    public boolean a(c cVar) {
        return cVar instanceof nf.a;
    }

    @Override // mf.a
    /* renamed from: h */
    public te.a b(c cVar) {
        nf.a aVar = (nf.a) cVar;
        bf.c p11 = aVar.p();
        return new te.a(e((e) k.g(aVar.C()), p11 != null ? p11.h() : null));
    }
}