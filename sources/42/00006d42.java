package f30;

import c30.h;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public interface f {

    /* loaded from: classes5.dex */
    public static final class a {
        public static d a(f fVar, e30.f descriptor, int i11) {
            s.g(descriptor, "descriptor");
            return fVar.b(descriptor);
        }

        public static void b(f fVar) {
        }

        public static <T> void c(f fVar, h<? super T> serializer, T t11) {
            s.g(serializer, "serializer");
            if (serializer.getDescriptor().b()) {
                fVar.F(serializer, t11);
            } else if (t11 == null) {
                fVar.o();
            } else {
                fVar.v();
                fVar.F(serializer, t11);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static <T> void d(f fVar, h<? super T> serializer, T t11) {
            s.g(serializer, "serializer");
            serializer.serialize(fVar, t11);
        }
    }

    void A(int i11);

    d B(e30.f fVar, int i11);

    void E(String str);

    <T> void F(h<? super T> hVar, T t11);

    i30.c a();

    d b(e30.f fVar);

    void e(double d11);

    void g(byte b11);

    f i(e30.f fVar);

    void m(long j11);

    void o();

    void r(short s11);

    void s(boolean z11);

    void t(float f11);

    void u(char c11);

    void v();

    void x(e30.f fVar, int i11);
}