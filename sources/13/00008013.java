package kotlinx.coroutines.internal;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import v20.r0;

/* loaded from: classes5.dex */
public final class n<E> {
    public static <E> Object a(Object obj) {
        return obj;
    }

    public static /* synthetic */ Object b(Object obj, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i11 & 1) != 0) {
            obj = null;
        }
        return a(obj);
    }

    public static final Object c(Object obj, E e11) {
        if (!r0.a() || (!(e11 instanceof List))) {
            if (obj == null) {
                return a(e11);
            }
            if (obj instanceof ArrayList) {
                ((ArrayList) obj).add(e11);
                return a(obj);
            }
            ArrayList arrayList = new ArrayList(4);
            arrayList.add(obj);
            arrayList.add(e11);
            return a(arrayList);
        }
        throw new AssertionError();
    }
}