package p10;

import kotlin.reflect.jvm.internal.impl.protobuf.i;

/* loaded from: classes5.dex */
public enum j implements i.a {
    DECLARATION(0, 0),
    FAKE_OVERRIDE(1, 1),
    DELEGATION(2, 2),
    SYNTHESIZED(3, 3);
    
    private static i.b<j> internalValueMap = new i.b<j>() { // from class: p10.j.a
        @Override // kotlin.reflect.jvm.internal.impl.protobuf.i.b
        /* renamed from: a */
        public j findValueByNumber(int i11) {
            return j.valueOf(i11);
        }
    };
    private final int value;

    j(int i11, int i12) {
        this.value = i12;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.i.a
    public final int getNumber() {
        return this.value;
    }

    public static j valueOf(int i11) {
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        return null;
                    }
                    return SYNTHESIZED;
                }
                return DELEGATION;
            }
            return FAKE_OVERRIDE;
        }
        return DECLARATION;
    }
}