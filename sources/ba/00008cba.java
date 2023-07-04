package nr;

/* loaded from: classes2.dex */
public final class j {
    public static final okio.i a(okio.h hVar) {
        kotlin.jvm.internal.s.g(hVar, "<this>");
        return hVar.z0(hVar.readInt());
    }

    public static final String b(okio.h hVar) {
        kotlin.jvm.internal.s.g(hVar, "<this>");
        return a(hVar).F();
    }

    public static final okio.g c(okio.g gVar, okio.i bytes) {
        kotlin.jvm.internal.s.g(gVar, "<this>");
        kotlin.jvm.internal.s.g(bytes, "bytes");
        gVar.x(bytes.z()).w1(bytes);
        return gVar;
    }

    public static final okio.g d(okio.g gVar, String str) {
        kotlin.jvm.internal.s.g(gVar, "<this>");
        kotlin.jvm.internal.s.g(str, "str");
        return c(gVar, okio.i.f42657e.e(str));
    }
}