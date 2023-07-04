package l30;

/* loaded from: classes5.dex */
public enum b {
    PROLEPTIC_JULIAN,
    PROLEPTIC_GREGORIAN,
    SWEDEN,
    INTRODUCTION_ON_1582_10_15,
    SINGLE_CUTOVER_DATE,
    PROLEPTIC_BYZANTINE;

    /* loaded from: classes5.dex */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f36570a;

        static {
            int[] iArr = new int[b.values().length];
            f36570a = iArr;
            try {
                iArr[b.PROLEPTIC_JULIAN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f36570a[b.PROLEPTIC_GREGORIAN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f36570a[b.SWEDEN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f36570a[b.INTRODUCTION_ON_1582_10_15.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f36570a[b.PROLEPTIC_BYZANTINE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public int getSerialValue() {
        int i11 = a.f36570a[ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 4) {
                        return i11 != 5 ? 0 : 3;
                    }
                    return 7;
                }
                return 4;
            }
            return 1;
        }
        return 2;
    }
}