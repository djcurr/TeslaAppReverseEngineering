package wc;

import java.util.ArrayList;

/* loaded from: classes.dex */
public class c extends b {

    /* renamed from: d  reason: collision with root package name */
    String f55750d;

    /* renamed from: e  reason: collision with root package name */
    long f55751e;

    /* renamed from: f  reason: collision with root package name */
    ArrayList<String> f55752f;

    public c(bc.m mVar, b bVar) {
        super(bVar);
        this.f55750d = mVar.m(4);
        this.f55751e = mVar.q();
        this.f55752f = new ArrayList<>();
        for (int i11 = 16; i11 < this.f55747a; i11 += 4) {
            this.f55752f.add(mVar.m(4));
        }
    }

    public void a(vc.d dVar) {
        dVar.R(1, this.f55750d);
        dVar.L(2, this.f55751e);
        ArrayList<String> arrayList = this.f55752f;
        dVar.S(3, (String[]) arrayList.toArray(new String[arrayList.size()]));
    }
}