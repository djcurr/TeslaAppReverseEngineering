package com.google.android.exoplayer2.source;

import android.os.Handler;
import com.google.android.exoplayer2.i0;
import com.google.android.exoplayer2.z0;

/* loaded from: classes3.dex */
public interface j {

    /* loaded from: classes3.dex */
    public static final class a extends fj.i {
        public a(Object obj) {
            super(obj);
        }

        public a c(Object obj) {
            return new a(super.a(obj));
        }

        public a(Object obj, long j11, int i11) {
            super(obj, j11, i11);
        }

        public a(Object obj, int i11, int i12, long j11) {
            super(obj, i11, i12, j11);
        }

        public a(fj.i iVar) {
            super(iVar);
        }
    }

    /* loaded from: classes3.dex */
    public interface b {
        void a(j jVar, z0 z0Var);
    }

    void a(b bVar, zj.n nVar);

    void b(b bVar);

    void d(Handler handler, k kVar);

    void e(k kVar);

    i0 f();

    void g(i iVar);

    void h(b bVar);

    i k(a aVar, zj.b bVar, long j11);

    void l(b bVar);

    void o(Handler handler, com.google.android.exoplayer2.drm.f fVar);

    void p();

    default boolean q() {
        return true;
    }

    default z0 r() {
        return null;
    }
}