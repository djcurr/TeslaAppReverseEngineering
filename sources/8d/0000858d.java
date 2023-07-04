package m00;

import ch.qos.logback.classic.pattern.CallerDataConverter;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes5.dex */
public final class i extends g implements f<Integer> {

    /* renamed from: e  reason: collision with root package name */
    public static final a f38155e = new a(null);

    /* renamed from: f  reason: collision with root package name */
    private static final i f38156f = new i(1, 0);

    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final i a() {
            return i.f38156f;
        }
    }

    public i(int i11, int i12) {
        super(i11, i12, 1);
    }

    @Override // m00.g
    public boolean equals(Object obj) {
        if (obj instanceof i) {
            if (!isEmpty() || !((i) obj).isEmpty()) {
                i iVar = (i) obj;
                if (c() != iVar.c() || e() != iVar.e()) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // m00.g
    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (c() * 31) + e();
    }

    @Override // m00.g
    public boolean isEmpty() {
        return c() > e();
    }

    public boolean j(int i11) {
        return c() <= i11 && i11 <= e();
    }

    public Integer k() {
        return Integer.valueOf(e());
    }

    public Integer m() {
        return Integer.valueOf(c());
    }

    @Override // m00.g
    public String toString() {
        return c() + CallerDataConverter.DEFAULT_RANGE_DELIMITER + e();
    }
}