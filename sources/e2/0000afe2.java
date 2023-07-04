package r10;

import java.util.List;
import kotlin.jvm.internal.s;
import kotlin.reflect.jvm.internal.impl.protobuf.h;

/* loaded from: classes5.dex */
public final class e {
    /* JADX WARN: Multi-variable type inference failed */
    public static final <M extends h.d<M>, T> T a(h.d<M> dVar, h.f<M, T> extension) {
        s.g(dVar, "<this>");
        s.g(extension, "extension");
        if (dVar.r(extension)) {
            return (T) dVar.o(extension);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <M extends h.d<M>, T> T b(h.d<M> dVar, h.f<M, List<T>> extension, int i11) {
        s.g(dVar, "<this>");
        s.g(extension, "extension");
        if (i11 < dVar.q(extension)) {
            return (T) dVar.p(extension, i11);
        }
        return null;
    }
}