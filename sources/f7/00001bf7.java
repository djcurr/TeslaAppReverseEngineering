package com.google.android.exoplayer2;

import android.os.Looper;
import com.google.android.exoplayer2.z0;
import java.util.List;

/* loaded from: classes3.dex */
public interface s0 {

    /* loaded from: classes3.dex */
    public interface a {
        default void B(int i11) {
        }

        default void C(ExoPlaybackException exoPlaybackException) {
        }

        default void D(boolean z11) {
            h(z11);
        }

        @Deprecated
        default void E() {
        }

        default void G(s0 s0Var, b bVar) {
        }

        default void J(boolean z11) {
        }

        @Deprecated
        default void L(boolean z11, int i11) {
        }

        @Deprecated
        default void O(z0 z0Var, Object obj, int i11) {
        }

        default void P(i0 i0Var, int i11) {
        }

        default void T(boolean z11, int i11) {
        }

        default void V(boolean z11) {
        }

        default void b0(boolean z11) {
        }

        default void e(ci.l lVar) {
        }

        default void f(int i11) {
        }

        default void g(int i11) {
        }

        @Deprecated
        default void h(boolean z11) {
        }

        default void j(List<wi.a> list) {
        }

        default void l(z0 z0Var, int i11) {
            O(z0Var, z0Var.p() == 1 ? z0Var.n(0, new z0.c()).f14790d : null, i11);
        }

        default void n(int i11) {
        }

        default void q(fj.v vVar, xj.k kVar) {
        }

        default void u(boolean z11) {
        }
    }

    /* loaded from: classes3.dex */
    public static final class b extends ak.s {
        @Override // ak.s
        public boolean b(int i11) {
            return super.b(i11);
        }

        @Override // ak.s
        public boolean c(int... iArr) {
            return super.c(iArr);
        }
    }

    boolean A();

    long B();

    long C();

    void a();

    ci.l b();

    boolean c();

    long d();

    boolean e();

    void f(a aVar);

    int g();

    void h(boolean z11);

    boolean hasNext();

    boolean hasPrevious();

    int i();

    boolean isPlaying();

    int j();

    long k();

    z0 l();

    Looper m();

    void n(int i11, long j11);

    boolean o();

    void p(boolean z11);

    int q();

    void r(a aVar);

    int s();

    long t();

    int u();

    long v();

    int w();

    void x(int i11);

    int y();

    int z();
}