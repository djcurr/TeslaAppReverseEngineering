package oh;

import android.util.SparseArray;

/* loaded from: classes3.dex */
public enum p {
    DEFAULT(0),
    UNMETERED_ONLY(1),
    UNMETERED_OR_DAILY(2),
    FAST_IF_RADIO_AWAKE(3),
    NEVER(4),
    UNRECOGNIZED(-1);
    
    private static final SparseArray<p> valueMap;
    private final int value;

    static {
        p pVar = DEFAULT;
        p pVar2 = UNMETERED_ONLY;
        p pVar3 = UNMETERED_OR_DAILY;
        p pVar4 = FAST_IF_RADIO_AWAKE;
        p pVar5 = NEVER;
        p pVar6 = UNRECOGNIZED;
        SparseArray<p> sparseArray = new SparseArray<>();
        valueMap = sparseArray;
        sparseArray.put(0, pVar);
        sparseArray.put(1, pVar2);
        sparseArray.put(2, pVar3);
        sparseArray.put(3, pVar4);
        sparseArray.put(4, pVar5);
        sparseArray.put(-1, pVar6);
    }

    p(int i11) {
        this.value = i11;
    }

    public static p forNumber(int i11) {
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        if (i11 != 4) {
                            return null;
                        }
                        return NEVER;
                    }
                    return FAST_IF_RADIO_AWAKE;
                }
                return UNMETERED_OR_DAILY;
            }
            return UNMETERED_ONLY;
        }
        return DEFAULT;
    }

    public final int getNumber() {
        return this.value;
    }
}