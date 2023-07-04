package sc;

import java.util.ArrayList;

/* loaded from: classes.dex */
public class n extends c {

    /* renamed from: c  reason: collision with root package name */
    long f50366c;

    /* renamed from: d  reason: collision with root package name */
    ArrayList<a> f50367d;

    /* renamed from: e  reason: collision with root package name */
    long f50368e;

    /* loaded from: classes.dex */
    class a {
        public a(n nVar, bc.m mVar) {
            mVar.q();
            mVar.q();
        }
    }

    public n(bc.m mVar, sc.a aVar) {
        super(mVar, aVar);
        this.f50366c = mVar.q();
        this.f50367d = new ArrayList<>();
        for (int i11 = 0; i11 < this.f50366c; i11++) {
            this.f50367d.add(new a(this, mVar));
        }
        mVar.q();
        this.f50368e = mVar.q();
    }

    public void a(tc.r rVar) {
        rVar.H(14, ((float) rc.e.f49341b.longValue()) / ((float) this.f50368e));
    }
}