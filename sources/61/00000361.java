package androidx.camera.core.impl;

import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class h1 implements q0 {

    /* renamed from: a  reason: collision with root package name */
    private final int f2311a;

    /* renamed from: b  reason: collision with root package name */
    private final androidx.camera.core.g0 f2312b;

    public h1(androidx.camera.core.g0 g0Var, String str) {
        z.j0 l12 = g0Var.l1();
        if (l12 != null) {
            Integer c11 = l12.a().c(str);
            if (c11 != null) {
                this.f2311a = c11.intValue();
                this.f2312b = g0Var;
                return;
            }
            throw new IllegalArgumentException("ImageProxy has no associated tag");
        }
        throw new IllegalArgumentException("ImageProxy has no associated ImageInfo");
    }

    @Override // androidx.camera.core.impl.q0
    public List<Integer> a() {
        return Collections.singletonList(Integer.valueOf(this.f2311a));
    }

    @Override // androidx.camera.core.impl.q0
    public com.google.common.util.concurrent.c<androidx.camera.core.g0> b(int i11) {
        if (i11 != this.f2311a) {
            return c0.f.f(new IllegalArgumentException("Capture id does not exist in the bundle"));
        }
        return c0.f.h(this.f2312b);
    }

    public void c() {
        this.f2312b.close();
    }
}