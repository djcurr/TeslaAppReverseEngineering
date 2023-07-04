package wc;

import java.util.ArrayList;
import xc.o;

/* loaded from: classes.dex */
public class k extends d {

    /* renamed from: e  reason: collision with root package name */
    long f55773e;

    /* renamed from: f  reason: collision with root package name */
    ArrayList<a> f55774f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a {

        /* renamed from: a  reason: collision with root package name */
        long f55775a;

        public a(k kVar, long j11, long j12) {
            this.f55775a = j12;
        }
    }

    public k(bc.m mVar, b bVar) {
        super(mVar, bVar);
        this.f55773e = mVar.q();
        this.f55774f = new ArrayList<>();
        for (int i11 = 0; i11 < this.f55773e; i11++) {
            this.f55774f.add(new a(this, mVar.q(), mVar.q()));
        }
    }

    public void a(xc.i iVar) {
        iVar.F(104, vc.e.f54470b.longValue());
    }

    public void b(o oVar) {
        oVar.H(114, ((float) vc.e.f54470b.longValue()) / ((float) this.f55774f.get(0).f55775a));
    }
}