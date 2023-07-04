package p10;

import kotlin.reflect.jvm.internal.impl.protobuf.i;

/* loaded from: classes5.dex */
public enum k implements i.a {
    FINAL(0, 0),
    OPEN(1, 1),
    ABSTRACT(2, 2),
    SEALED(3, 3);
    
    private static i.b<k> internalValueMap = new i.b<k>() { // from class: p10.k.a
        @Override // kotlin.reflect.jvm.internal.impl.protobuf.i.b
        /* renamed from: a */
        public k findValueByNumber(int i11) {
            return k.valueOf(i11);
        }
    };
    private final int value;

    k(int i11, int i12) {
        this.value = i12;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.i.a
    public final int getNumber() {
        return this.value;
    }

    public static k valueOf(int i11) {
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        return null;
                    }
                    return SEALED;
                }
                return ABSTRACT;
            }
            return OPEN;
        }
        return FINAL;
    }
}