package y7;

import android.graphics.Path;
import android.graphics.PointF;

/* loaded from: classes.dex */
public class i extends i8.a<PointF> {

    /* renamed from: q  reason: collision with root package name */
    private Path f59284q;

    /* renamed from: r  reason: collision with root package name */
    private final i8.a<PointF> f59285r;

    public i(v7.d dVar, i8.a<PointF> aVar) {
        super(dVar, aVar.f30188b, aVar.f30189c, aVar.f30190d, aVar.f30191e, aVar.f30192f, aVar.f30193g, aVar.f30194h);
        this.f59285r = aVar;
        i();
    }

    public void i() {
        T t11;
        T t12;
        T t13 = this.f30189c;
        boolean z11 = (t13 == 0 || (t12 = this.f30188b) == 0 || !((PointF) t12).equals(((PointF) t13).x, ((PointF) t13).y)) ? false : true;
        T t14 = this.f30188b;
        if (t14 == 0 || (t11 = this.f30189c) == 0 || z11) {
            return;
        }
        i8.a<PointF> aVar = this.f59285r;
        this.f59284q = h8.h.d((PointF) t14, (PointF) t11, aVar.f30201o, aVar.f30202p);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Path j() {
        return this.f59284q;
    }
}