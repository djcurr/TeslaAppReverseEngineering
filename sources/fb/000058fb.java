package com.stripe.android.stripe3ds2.utils;

import java.util.Arrays;
import java.util.Objects;
import kotlin.jvm.internal.s;

/* loaded from: classes6.dex */
public final class ObjectUtils {
    public static final ObjectUtils INSTANCE = new ObjectUtils();

    private ObjectUtils() {
    }

    public static final boolean equals(Object obj, Object obj2) {
        return s.c(obj, obj2);
    }

    public static final int hash(Object... values) {
        s.g(values, "values");
        return Objects.hash(Arrays.copyOf(values, values.length));
    }
}