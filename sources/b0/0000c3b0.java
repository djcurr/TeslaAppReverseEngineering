package yy;

/* loaded from: classes5.dex */
public final class l {
    public static <T> ny.h<T> a(int i11) {
        if (i11 < 0) {
            return new uy.c(-i11);
        }
        return new uy.b(i11);
    }

    public static void b(b80.c cVar, int i11) {
        cVar.request(i11 < 0 ? Long.MAX_VALUE : i11);
    }
}