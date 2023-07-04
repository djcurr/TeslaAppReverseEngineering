package hf;

import hf.i;
import hf.s;

/* loaded from: classes3.dex */
public class g implements hf.a {

    /* loaded from: classes3.dex */
    class a implements y<nf.c> {
        a(g gVar) {
        }

        @Override // hf.y
        /* renamed from: b */
        public int a(nf.c cVar) {
            return cVar.g();
        }
    }

    @Override // hf.a
    public i<gd.d, nf.c> a(md.n<t> nVar, pd.c cVar, s.a aVar, i.b<gd.d> bVar) {
        r rVar = new r(new a(this), aVar, nVar, bVar);
        cVar.a(rVar);
        return rVar;
    }
}