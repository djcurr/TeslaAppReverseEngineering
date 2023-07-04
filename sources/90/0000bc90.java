package wc;

/* loaded from: classes.dex */
public class g extends d {

    /* renamed from: e  reason: collision with root package name */
    long f55759e;

    /* renamed from: f  reason: collision with root package name */
    long f55760f;

    /* renamed from: g  reason: collision with root package name */
    long f55761g;

    /* renamed from: h  reason: collision with root package name */
    long f55762h;

    /* renamed from: i  reason: collision with root package name */
    String f55763i;

    public g(bc.m mVar, b bVar) {
        super(mVar, bVar);
        if (this.f55753d == 1) {
            this.f55759e = mVar.g();
            this.f55760f = mVar.g();
            this.f55761g = mVar.f();
            this.f55762h = mVar.g();
        } else {
            this.f55759e = mVar.q();
            this.f55760f = mVar.q();
            this.f55761g = mVar.q();
            this.f55762h = mVar.q();
        }
        short e11 = mVar.e();
        this.f55763i = new String(new char[]{(char) (((e11 & 31744) >> 10) + 96), (char) (((e11 & 992) >> 5) + 96), (char) ((e11 & 31) + 96)});
        vc.e.f54471c = Long.valueOf(this.f55759e);
        vc.e.f54472d = Long.valueOf(this.f55760f);
        vc.e.f54470b = Long.valueOf(this.f55761g);
        vc.e.f54473e = Long.valueOf(this.f55762h);
        vc.e.f54474f = this.f55763i;
    }
}