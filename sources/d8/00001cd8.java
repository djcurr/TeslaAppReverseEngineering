package com.google.android.exoplayer2;

import com.google.android.exoplayer2.t0;

/* loaded from: classes3.dex */
public interface v0 extends t0.b {

    /* loaded from: classes3.dex */
    public interface a {
        void a();

        void b(long j11);
    }

    boolean c();

    int d();

    void disable();

    fj.r f();

    boolean g();

    String getName();

    int getState();

    void h();

    boolean isReady();

    void j(ci.i[] iVarArr, fj.r rVar, long j11, long j12);

    void n();

    boolean o();

    void p(ci.o oVar, ci.i[] iVarArr, fj.r rVar, long j11, boolean z11, boolean z12, long j12, long j13);

    ci.n q();

    void reset();

    void setIndex(int i11);

    void start();

    void stop();

    default void t(float f11, float f12) {
    }

    void v(long j11, long j12);

    long w();

    void x(long j11);

    ak.q y();
}