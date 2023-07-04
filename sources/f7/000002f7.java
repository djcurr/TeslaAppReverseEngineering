package androidx.camera.core;

import android.graphics.Rect;
import android.util.Size;

/* loaded from: classes.dex */
final class b1 extends m {

    /* renamed from: c  reason: collision with root package name */
    private final z.j0 f2099c;

    /* renamed from: d  reason: collision with root package name */
    private Rect f2100d;

    /* renamed from: e  reason: collision with root package name */
    private final int f2101e;

    /* renamed from: f  reason: collision with root package name */
    private final int f2102f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b1(g0 g0Var, z.j0 j0Var) {
        this(g0Var, null, j0Var);
    }

    @Override // androidx.camera.core.m, androidx.camera.core.g0
    public synchronized Rect M0() {
        if (this.f2100d == null) {
            return new Rect(0, 0, getWidth(), getHeight());
        }
        return new Rect(this.f2100d);
    }

    @Override // androidx.camera.core.m, androidx.camera.core.g0
    public synchronized void c0(Rect rect) {
        if (rect != null) {
            Rect rect2 = new Rect(rect);
            if (!rect2.intersect(0, 0, getWidth(), getHeight())) {
                rect2.setEmpty();
            }
            rect = rect2;
        }
        this.f2100d = rect;
    }

    @Override // androidx.camera.core.m, androidx.camera.core.g0
    public synchronized int getHeight() {
        return this.f2102f;
    }

    @Override // androidx.camera.core.m, androidx.camera.core.g0
    public synchronized int getWidth() {
        return this.f2101e;
    }

    @Override // androidx.camera.core.m, androidx.camera.core.g0
    public z.j0 l1() {
        return this.f2099c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public b1(g0 g0Var, Size size, z.j0 j0Var) {
        super(g0Var);
        if (size == null) {
            this.f2101e = super.getWidth();
            this.f2102f = super.getHeight();
        } else {
            this.f2101e = size.getWidth();
            this.f2102f = size.getHeight();
        }
        this.f2099c = j0Var;
    }
}