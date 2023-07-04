package be;

import android.content.res.Resources;
import hf.s;
import java.util.concurrent.Executor;
import md.n;

/* loaded from: classes.dex */
public class g {

    /* renamed from: a  reason: collision with root package name */
    private Resources f7643a;

    /* renamed from: b  reason: collision with root package name */
    private fe.a f7644b;

    /* renamed from: c  reason: collision with root package name */
    private mf.a f7645c;

    /* renamed from: d  reason: collision with root package name */
    private Executor f7646d;

    /* renamed from: e  reason: collision with root package name */
    private s<gd.d, nf.c> f7647e;

    /* renamed from: f  reason: collision with root package name */
    private md.f<mf.a> f7648f;

    /* renamed from: g  reason: collision with root package name */
    private n<Boolean> f7649g;

    public void a(Resources resources, fe.a aVar, mf.a aVar2, Executor executor, s<gd.d, nf.c> sVar, md.f<mf.a> fVar, n<Boolean> nVar) {
        this.f7643a = resources;
        this.f7644b = aVar;
        this.f7645c = aVar2;
        this.f7646d = executor;
        this.f7647e = sVar;
        this.f7648f = fVar;
        this.f7649g = nVar;
    }

    protected d b(Resources resources, fe.a aVar, mf.a aVar2, Executor executor, s<gd.d, nf.c> sVar, md.f<mf.a> fVar) {
        return new d(resources, aVar, aVar2, executor, sVar, fVar);
    }

    public d c() {
        d b11 = b(this.f7643a, this.f7644b, this.f7645c, this.f7646d, this.f7647e, this.f7648f);
        n<Boolean> nVar = this.f7649g;
        if (nVar != null) {
            b11.B0(nVar.get().booleanValue());
        }
        return b11;
    }
}