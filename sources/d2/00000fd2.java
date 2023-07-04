package c8;

import android.graphics.PointF;
import ch.qos.logback.core.CoreConstants;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class m {

    /* renamed from: a */
    private final List<a8.a> f8975a;

    /* renamed from: b */
    private PointF f8976b;

    /* renamed from: c */
    private boolean f8977c;

    public m(PointF pointF, boolean z11, List<a8.a> list) {
        this.f8976b = pointF;
        this.f8977c = z11;
        this.f8975a = new ArrayList(list);
    }

    private void e(float f11, float f12) {
        if (this.f8976b == null) {
            this.f8976b = new PointF();
        }
        this.f8976b.set(f11, f12);
    }

    public List<a8.a> a() {
        return this.f8975a;
    }

    public PointF b() {
        return this.f8976b;
    }

    public void c(m mVar, m mVar2, float f11) {
        if (this.f8976b == null) {
            this.f8976b = new PointF();
        }
        this.f8977c = mVar.d() || mVar2.d();
        if (mVar.a().size() != mVar2.a().size()) {
            h8.d.c("Curves must have the same number of control points. Shape 1: " + mVar.a().size() + "\tShape 2: " + mVar2.a().size());
        }
        int min = Math.min(mVar.a().size(), mVar2.a().size());
        if (this.f8975a.size() < min) {
            for (int size = this.f8975a.size(); size < min; size++) {
                this.f8975a.add(new a8.a());
            }
        } else if (this.f8975a.size() > min) {
            for (int size2 = this.f8975a.size() - 1; size2 >= min; size2--) {
                List<a8.a> list = this.f8975a;
                list.remove(list.size() - 1);
            }
        }
        PointF b11 = mVar.b();
        PointF b12 = mVar2.b();
        e(h8.g.k(b11.x, b12.x, f11), h8.g.k(b11.y, b12.y, f11));
        for (int size3 = this.f8975a.size() - 1; size3 >= 0; size3--) {
            a8.a aVar = mVar.a().get(size3);
            a8.a aVar2 = mVar2.a().get(size3);
            PointF a11 = aVar.a();
            PointF b13 = aVar.b();
            PointF c11 = aVar.c();
            PointF a12 = aVar2.a();
            PointF b14 = aVar2.b();
            PointF c12 = aVar2.c();
            this.f8975a.get(size3).d(h8.g.k(a11.x, a12.x, f11), h8.g.k(a11.y, a12.y, f11));
            this.f8975a.get(size3).e(h8.g.k(b13.x, b14.x, f11), h8.g.k(b13.y, b14.y, f11));
            this.f8975a.get(size3).f(h8.g.k(c11.x, c12.x, f11), h8.g.k(c11.y, c12.y, f11));
        }
    }

    public boolean d() {
        return this.f8977c;
    }

    public String toString() {
        return "ShapeData{numCurves=" + this.f8975a.size() + "closed=" + this.f8977c + CoreConstants.CURLY_RIGHT;
    }

    public m() {
        this.f8975a = new ArrayList();
    }
}