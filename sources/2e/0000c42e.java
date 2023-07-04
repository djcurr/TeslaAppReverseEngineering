package z2;

import java.util.Arrays;

/* loaded from: classes.dex */
public enum v {
    NONE,
    BOUNDS;

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static v[] valuesCustom() {
        v[] valuesCustom = values();
        return (v[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
    }
}