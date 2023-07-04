package b8;

import android.graphics.PointF;
import java.util.List;

/* loaded from: classes.dex */
public class i implements m<PointF, PointF> {

    /* renamed from: a  reason: collision with root package name */
    private final b f7543a;

    /* renamed from: b  reason: collision with root package name */
    private final b f7544b;

    public i(b bVar, b bVar2) {
        this.f7543a = bVar;
        this.f7544b = bVar2;
    }

    @Override // b8.m
    public boolean k() {
        return this.f7543a.k() && this.f7544b.k();
    }

    @Override // b8.m
    public y7.a<PointF, PointF> l() {
        return new y7.n(this.f7543a.l(), this.f7544b.l());
    }

    @Override // b8.m
    public List<i8.a<PointF>> m() {
        throw new UnsupportedOperationException("Cannot call getKeyframes on AnimatableSplitDimensionPathValue.");
    }
}