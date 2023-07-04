package j$.time.chrono;

/* loaded from: classes7.dex */
abstract /* synthetic */ class d {

    /* renamed from: a  reason: collision with root package name */
    static final /* synthetic */ int[] f32873a;

    static {
        int[] iArr = new int[j$.time.temporal.a.values().length];
        f32873a = iArr;
        try {
            iArr[j$.time.temporal.a.INSTANT_SECONDS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f32873a[j$.time.temporal.a.OFFSET_SECONDS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
    }
}