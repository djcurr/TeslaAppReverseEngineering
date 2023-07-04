package rr;

import java.util.List;
import kotlin.jvm.internal.s;
import wz.u;

/* loaded from: classes2.dex */
public final class c {
    public static final <T> b<T> a(List<? extends T> list) {
        s.g(list, "<this>");
        if (!list.isEmpty()) {
            return new b<>(u.b0(list), list.subList(1, list.size()));
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }
}