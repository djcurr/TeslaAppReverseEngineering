package sc;

/* loaded from: classes.dex */
public class q extends c {

    /* renamed from: c  reason: collision with root package name */
    int f50376c;

    /* renamed from: d  reason: collision with root package name */
    int[] f50377d;

    public q(bc.m mVar, a aVar) {
        super(mVar, aVar);
        this.f50376c = mVar.p();
        this.f50377d = new int[]{mVar.p(), mVar.p(), mVar.p()};
    }

    public void a(tc.r rVar) {
        rVar.K(12, this.f50377d);
        rVar.J(11, this.f50376c);
    }
}