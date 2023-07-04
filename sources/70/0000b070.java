package rc;

import bc.l;
import bc.m;
import java.util.Calendar;
import java.util.Date;
import rc.d;

/* loaded from: classes.dex */
public abstract class f<T extends d> extends vb.a<T> {
    public f(cc.e eVar) {
        super(eVar);
        if (e.f49342c == null || e.f49343d == null) {
            return;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.set(1904, 0, 1, 0, 0, 0);
        long time = calendar.getTime().getTime();
        String date = new Date((e.f49342c.longValue() * 1000) + time).toString();
        String date2 = new Date((e.f49343d.longValue() * 1000) + time).toString();
        this.f54462b.R(20481, date);
        this.f54462b.R(20482, date2);
    }

    @Override // vb.a
    public boolean e(sc.a aVar) {
        return aVar.f50324b.equals(g()) || aVar.f50324b.equals("stsd") || aVar.f50324b.equals("stts");
    }

    @Override // vb.a
    public boolean f(sc.a aVar) {
        return aVar.f50324b.equals("stbl") || aVar.f50324b.equals("minf") || aVar.f50324b.equals("gmhd") || aVar.f50324b.equals("tmcd");
    }

    protected abstract String g();

    @Override // vb.a
    /* renamed from: h */
    public f c(sc.a aVar, byte[] bArr) {
        if (bArr != null) {
            l lVar = new l(bArr);
            if (aVar.f50324b.equals(g())) {
                i(lVar, aVar);
            } else if (aVar.f50324b.equals("stsd")) {
                j(lVar, aVar);
            } else if (aVar.f50324b.equals("stts")) {
                k(lVar, aVar);
            }
        }
        return this;
    }

    protected abstract void i(m mVar, sc.a aVar);

    protected abstract void j(m mVar, sc.a aVar);

    protected abstract void k(m mVar, sc.a aVar);
}