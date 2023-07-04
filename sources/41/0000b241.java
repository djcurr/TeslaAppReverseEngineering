package sc;

import java.util.ArrayList;

/* loaded from: classes.dex */
public class b extends a {

    /* renamed from: c  reason: collision with root package name */
    String f50325c;

    /* renamed from: d  reason: collision with root package name */
    long f50326d;

    /* renamed from: e  reason: collision with root package name */
    ArrayList<String> f50327e;

    public b(bc.m mVar, a aVar) {
        super(aVar);
        this.f50325c = mVar.m(4);
        this.f50326d = mVar.q();
        this.f50327e = new ArrayList<>((int) ((this.f50323a / 16) >> 2));
        for (int i11 = 16; i11 < this.f50323a; i11 += 4) {
            this.f50327e.add(mVar.m(4));
        }
    }

    public void a(rc.d dVar) {
        dVar.R(4096, this.f50325c);
        dVar.L(4097, this.f50326d);
        ArrayList<String> arrayList = this.f50327e;
        dVar.S(4098, (String[]) arrayList.toArray(new String[arrayList.size()]));
    }
}