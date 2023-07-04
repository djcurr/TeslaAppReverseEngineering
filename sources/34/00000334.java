package androidx.camera.core.impl;

import android.graphics.Rect;
import androidx.camera.core.CameraControl;
import androidx.camera.core.impl.m;
import java.util.List;

/* loaded from: classes.dex */
public interface CameraControlInternal extends CameraControl {

    /* renamed from: a  reason: collision with root package name */
    public static final CameraControlInternal f2243a = new a();

    /* loaded from: classes.dex */
    public static final class CameraControlException extends Exception {
        public CameraControlException(g gVar) {
        }
    }

    /* loaded from: classes.dex */
    class a implements CameraControlInternal {
        a() {
        }

        @Override // androidx.camera.core.impl.CameraControlInternal
        public com.google.common.util.concurrent.c<m> a() {
            return c0.f.h(m.a.h());
        }

        @Override // androidx.camera.core.impl.CameraControlInternal
        public Rect b() {
            return new Rect();
        }

        @Override // androidx.camera.core.impl.CameraControlInternal
        public void c(int i11) {
        }

        @Override // androidx.camera.core.CameraControl
        public com.google.common.util.concurrent.c<Void> d(boolean z11) {
            return c0.f.h(null);
        }

        @Override // androidx.camera.core.impl.CameraControlInternal
        public d0 e() {
            return null;
        }

        @Override // androidx.camera.core.impl.CameraControlInternal
        public void f(d0 d0Var) {
        }

        @Override // androidx.camera.core.impl.CameraControlInternal
        public com.google.common.util.concurrent.c<m> g() {
            return c0.f.h(m.a.h());
        }

        @Override // androidx.camera.core.impl.CameraControlInternal
        public void h(boolean z11, boolean z12) {
        }

        @Override // androidx.camera.core.CameraControl
        public com.google.common.util.concurrent.c<z.s> i(z.r rVar) {
            return c0.f.h(z.s.b());
        }

        @Override // androidx.camera.core.impl.CameraControlInternal
        public void j() {
        }

        @Override // androidx.camera.core.impl.CameraControlInternal
        public void k(List<a0> list) {
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        void a(List<a0> list);

        void b(g1 g1Var);
    }

    com.google.common.util.concurrent.c<m> a();

    Rect b();

    void c(int i11);

    d0 e();

    void f(d0 d0Var);

    com.google.common.util.concurrent.c<m> g();

    void h(boolean z11, boolean z12);

    void j();

    void k(List<a0> list);
}