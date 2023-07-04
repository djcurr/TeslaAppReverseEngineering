package b8;

import android.graphics.PointF;
import java.util.List;

/* loaded from: classes.dex */
public class e implements m<PointF, PointF> {

    /* renamed from: a  reason: collision with root package name */
    private final List<i8.a<PointF>> f7542a;

    public e(List<i8.a<PointF>> list) {
        this.f7542a = list;
    }

    @Override // b8.m
    public boolean k() {
        return this.f7542a.size() == 1 && this.f7542a.get(0).h();
    }

    @Override // b8.m
    public y7.a<PointF, PointF> l() {
        if (this.f7542a.get(0).h()) {
            return new y7.k(this.f7542a);
        }
        return new y7.j(this.f7542a);
    }

    @Override // b8.m
    public List<i8.a<PointF>> m() {
        return this.f7542a;
    }
}