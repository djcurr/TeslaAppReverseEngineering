package atd.h;

/* loaded from: classes.dex */
final class f {

    /* loaded from: classes.dex */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f6872a;

        static {
            int[] iArr = new int[atd.h.a.values().length];
            f6872a = iArr;
            try {
                iArr[atd.h.a.V1_1.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f6872a[atd.h.a.V1_4.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static c a(atd.h.a aVar) {
        int i11 = a.f6872a[aVar.ordinal()];
        if (i11 != 1) {
            if (i11 == 2) {
                return new e();
            }
            throw atd.y.c.DEVICE_DATA_FAILURE.a();
        }
        return new d();
    }
}