package wc;

import xc.o;

/* loaded from: classes.dex */
public class l extends d {

    /* renamed from: e  reason: collision with root package name */
    int f55776e;

    /* renamed from: f  reason: collision with root package name */
    int[] f55777f;

    public l(bc.m mVar, b bVar) {
        super(mVar, bVar);
        this.f55776e = mVar.p();
        this.f55777f = new int[]{mVar.p(), mVar.p(), mVar.p()};
    }

    public void a(o oVar) {
        oVar.K(112, this.f55777f);
        oVar.J(111, this.f55776e);
    }
}