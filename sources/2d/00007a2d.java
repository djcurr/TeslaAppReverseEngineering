package ir;

import com.squareup.moshi.r;
import java.lang.reflect.Type;
import kotlin.jvm.internal.s;

/* loaded from: classes2.dex */
public final class e {
    public static final Class<?> a(Type rawType) {
        s.g(rawType, "$this$rawType");
        Class<?> h11 = r.h(rawType);
        s.f(h11, "Types.getRawType(this)");
        return h11;
    }
}