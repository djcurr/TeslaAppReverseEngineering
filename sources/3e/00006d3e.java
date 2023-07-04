package f30;

import c30.h;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public interface d {

    /* loaded from: classes5.dex */
    public static final class a {
        public static boolean a(d dVar, e30.f descriptor, int i11) {
            s.g(descriptor, "descriptor");
            return true;
        }
    }

    void C(e30.f fVar, int i11, boolean z11);

    <T> void D(e30.f fVar, int i11, h<? super T> hVar, T t11);

    void d(e30.f fVar);

    void f(e30.f fVar, int i11, long j11);

    void h(e30.f fVar, int i11, double d11);

    void j(e30.f fVar, int i11, float f11);

    boolean k(e30.f fVar, int i11);

    void l(e30.f fVar, int i11, byte b11);

    void n(e30.f fVar, int i11, int i12);

    void p(e30.f fVar, int i11, String str);

    <T> void q(e30.f fVar, int i11, h<? super T> hVar, T t11);

    void w(e30.f fVar, int i11, short s11);

    void y(e30.f fVar, int i11, char c11);
}