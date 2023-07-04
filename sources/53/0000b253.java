package sc;

/* loaded from: classes.dex */
public class o extends c {

    /* renamed from: c  reason: collision with root package name */
    int f50369c;

    /* renamed from: d  reason: collision with root package name */
    int f50370d;

    /* renamed from: e  reason: collision with root package name */
    int f50371e;

    /* renamed from: f  reason: collision with root package name */
    int[] f50372f;

    /* renamed from: g  reason: collision with root package name */
    int[] f50373g;

    /* renamed from: h  reason: collision with root package name */
    String f50374h;

    public o(bc.m mVar, a aVar) {
        super(mVar, aVar);
        this.f50369c = mVar.e();
        this.f50370d = mVar.e();
        this.f50371e = mVar.e();
        mVar.t(2L);
        this.f50372f = new int[]{mVar.p(), mVar.p(), mVar.p()};
        this.f50373g = new int[]{mVar.p(), mVar.p(), mVar.p()};
        this.f50374h = mVar.m(mVar.r());
    }

    public void a(tc.o oVar) {
        oVar.J(5, this.f50369c);
        int i11 = this.f50370d;
        if (i11 == 1) {
            oVar.R(6, "Bold");
        } else if (i11 == 2) {
            oVar.R(6, "Italic");
        } else if (i11 == 4) {
            oVar.R(6, "Underline");
        } else if (i11 == 8) {
            oVar.R(6, "Outline");
        } else if (i11 == 16) {
            oVar.R(6, "Shadow");
        } else if (i11 == 32) {
            oVar.R(6, "Condense");
        } else if (i11 == 64) {
            oVar.R(6, "Extend");
        }
        oVar.J(7, this.f50371e);
        oVar.K(8, this.f50372f);
        oVar.K(9, this.f50373g);
        oVar.R(10, this.f50374h);
    }
}