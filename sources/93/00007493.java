package i30;

import c30.h;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import wz.w;

/* loaded from: classes5.dex */
public abstract class c {
    private c() {
    }

    public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ c30.b c(c cVar, n00.d dVar, List list, int i11, Object obj) {
        if (obj == null) {
            if ((i11 & 2) != 0) {
                list = w.i();
            }
            return cVar.b(dVar, list);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getContextual");
    }

    public abstract void a(d dVar);

    public abstract <T> c30.b<T> b(n00.d<T> dVar, List<? extends c30.b<?>> list);

    public abstract <T> c30.a<? extends T> d(n00.d<? super T> dVar, String str);

    public abstract <T> h<T> e(n00.d<? super T> dVar, T t11);
}