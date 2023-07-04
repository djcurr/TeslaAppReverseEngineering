package androidx.compose.ui.platform;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;

/* loaded from: classes.dex */
public interface o0 {
    void A(Matrix matrix);

    void B(int i11);

    int C();

    void D(float f11);

    void E(float f11);

    void F(Outline outline);

    int G();

    void H(boolean z11);

    void I(t1.v vVar, t1.q0 q0Var, h00.l<? super t1.u, vz.b0> lVar);

    float J();

    void b(float f11);

    void d(float f11);

    void f(float f11);

    void g(t1.x0 x0Var);

    int getHeight();

    int getWidth();

    float h();

    void i(float f11);

    void j(float f11);

    void k(float f11);

    void l(float f11);

    void m(float f11);

    void n(float f11);

    void o(Canvas canvas);

    int p();

    void q(boolean z11);

    boolean r(int i11, int i12, int i13, int i14);

    void s();

    void t(float f11);

    void u(int i11);

    boolean v();

    boolean w();

    int x();

    boolean y();

    boolean z(boolean z11);
}