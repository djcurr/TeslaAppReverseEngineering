package t1;

import android.graphics.Path;
import android.graphics.PathMeasure;

/* loaded from: classes.dex */
public final class l implements t0 {

    /* renamed from: a  reason: collision with root package name */
    private final PathMeasure f51464a;

    public l(PathMeasure internalPathMeasure) {
        kotlin.jvm.internal.s.g(internalPathMeasure, "internalPathMeasure");
        this.f51464a = internalPathMeasure;
    }

    @Override // t1.t0
    public void a(q0 q0Var, boolean z11) {
        Path q11;
        PathMeasure pathMeasure = this.f51464a;
        if (q0Var == null) {
            q11 = null;
        } else if (q0Var instanceof j) {
            q11 = ((j) q0Var).q();
        } else {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        pathMeasure.setPath(q11, z11);
    }

    @Override // t1.t0
    public boolean b(float f11, float f12, q0 destination, boolean z11) {
        kotlin.jvm.internal.s.g(destination, "destination");
        PathMeasure pathMeasure = this.f51464a;
        if (destination instanceof j) {
            return pathMeasure.getSegment(f11, f12, ((j) destination).q(), z11);
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    @Override // t1.t0
    public float getLength() {
        return this.f51464a.getLength();
    }
}