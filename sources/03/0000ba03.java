package vc;

import bc.l;
import bc.m;
import java.util.Calendar;
import java.util.Date;
import xc.d;

/* loaded from: classes.dex */
public abstract class f<T extends xc.d> extends rb.a<T> {
    public f(cc.e eVar) {
        super(eVar);
        if (e.f54471c == null || e.f54472d == null) {
            return;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.set(1904, 0, 1, 0, 0, 0);
        long time = calendar.getTime().getTime();
        String date = new Date((e.f54471c.longValue() * 1000) + time).toString();
        String date2 = new Date((e.f54472d.longValue() * 1000) + time).toString();
        String str = e.f54474f;
        ((xc.d) this.f49333b).R(101, date);
        ((xc.d) this.f49333b).R(102, date2);
        ((xc.d) this.f49333b).R(104, str);
    }

    @Override // rb.a
    public rb.a c(wc.b bVar, byte[] bArr) {
        if (bArr != null) {
            l lVar = new l(bArr);
            if (bVar.f55748b.equals(g())) {
                h(lVar, bVar);
            } else if (bVar.f55748b.equals("stsd")) {
                i(lVar, bVar);
            } else if (bVar.f55748b.equals("stts")) {
                j(lVar, bVar);
            }
        }
        return this;
    }

    @Override // rb.a
    public boolean e(wc.b bVar) {
        return bVar.f55748b.equals(g()) || bVar.f55748b.equals("stsd") || bVar.f55748b.equals("stts");
    }

    @Override // rb.a
    public boolean f(wc.b bVar) {
        return bVar.f55748b.equals("stbl") || bVar.f55748b.equals("minf");
    }

    protected abstract String g();

    protected abstract void h(m mVar, wc.b bVar);

    protected abstract void i(m mVar, wc.b bVar);

    protected abstract void j(m mVar, wc.b bVar);
}