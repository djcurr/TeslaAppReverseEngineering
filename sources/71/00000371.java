package androidx.camera.core.impl;

import a0.e;

/* loaded from: classes.dex */
public interface m {

    /* loaded from: classes.dex */
    public static final class a implements m {
        public static m h() {
            return new a();
        }

        @Override // androidx.camera.core.impl.m
        public l1 a() {
            return l1.a();
        }

        @Override // androidx.camera.core.impl.m
        public l c() {
            return l.UNKNOWN;
        }

        @Override // androidx.camera.core.impl.m
        public j d() {
            return j.UNKNOWN;
        }

        @Override // androidx.camera.core.impl.m
        public k e() {
            return k.UNKNOWN;
        }

        @Override // androidx.camera.core.impl.m
        public i f() {
            return i.UNKNOWN;
        }

        @Override // androidx.camera.core.impl.m
        public h g() {
            return h.UNKNOWN;
        }

        @Override // androidx.camera.core.impl.m
        public long getTimestamp() {
            return -1L;
        }
    }

    l1 a();

    default void b(e.b bVar) {
        bVar.g(c());
    }

    l c();

    j d();

    k e();

    i f();

    h g();

    long getTimestamp();
}