package androidx.camera.core.impl;

import android.view.Surface;

/* loaded from: classes.dex */
public final class s0 extends DeferrableSurface {

    /* renamed from: i  reason: collision with root package name */
    private final Surface f2360i;

    public s0(Surface surface) {
        this.f2360i = surface;
    }

    @Override // androidx.camera.core.impl.DeferrableSurface
    public com.google.common.util.concurrent.c<Surface> k() {
        return c0.f.h(this.f2360i);
    }
}