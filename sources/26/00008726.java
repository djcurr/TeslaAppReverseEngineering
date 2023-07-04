package mr;

import com.squareup.wire.p;
import java.util.Objects;
import kotlin.jvm.internal.s;

/* loaded from: classes2.dex */
final /* synthetic */ class e {
    public static final <E extends p> E a(Class<E> identityOrNull) {
        E e11;
        s.g(identityOrNull, "$this$identityOrNull");
        E[] enumConstants = identityOrNull.getEnumConstants();
        s.f(enumConstants, "enumConstants");
        int length = enumConstants.length;
        int i11 = 0;
        while (true) {
            if (i11 >= length) {
                e11 = null;
                break;
            }
            e11 = enumConstants[i11];
            E e12 = e11;
            Objects.requireNonNull(e12, "null cannot be cast to non-null type com.squareup.wire.WireEnum");
            if (e12.getValue() == 0) {
                break;
            }
            i11++;
        }
        return e11;
    }
}