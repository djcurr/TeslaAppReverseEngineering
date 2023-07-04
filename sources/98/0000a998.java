package p10;

import kotlin.reflect.jvm.internal.impl.protobuf.i;

/* loaded from: classes5.dex */
public enum x implements i.a {
    INTERNAL(0, 0),
    PRIVATE(1, 1),
    PROTECTED(2, 2),
    PUBLIC(3, 3),
    PRIVATE_TO_THIS(4, 4),
    LOCAL(5, 5);
    
    private static i.b<x> internalValueMap = new i.b<x>() { // from class: p10.x.a
        @Override // kotlin.reflect.jvm.internal.impl.protobuf.i.b
        /* renamed from: a */
        public x findValueByNumber(int i11) {
            return x.valueOf(i11);
        }
    };
    private final int value;

    x(int i11, int i12) {
        this.value = i12;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.i.a
    public final int getNumber() {
        return this.value;
    }

    public static x valueOf(int i11) {
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        if (i11 != 4) {
                            if (i11 != 5) {
                                return null;
                            }
                            return LOCAL;
                        }
                        return PRIVATE_TO_THIS;
                    }
                    return PUBLIC;
                }
                return PROTECTED;
            }
            return PRIVATE;
        }
        return INTERNAL;
    }
}