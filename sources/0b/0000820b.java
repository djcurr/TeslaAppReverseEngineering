package l2;

import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: d  reason: collision with root package name */
    public static final a f36403d = new a(null);

    /* renamed from: e  reason: collision with root package name */
    private static final g f36404e;

    /* renamed from: a  reason: collision with root package name */
    private final float f36405a;

    /* renamed from: b  reason: collision with root package name */
    private final m00.e<Float> f36406b;

    /* renamed from: c  reason: collision with root package name */
    private final int f36407c;

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final g a() {
            return g.f36404e;
        }
    }

    static {
        m00.e<Float> b11;
        b11 = m00.k.b(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
        f36404e = new g(BitmapDescriptorFactory.HUE_RED, b11, 0, 4, null);
    }

    public g(float f11, m00.e<Float> range, int i11) {
        kotlin.jvm.internal.s.g(range, "range");
        this.f36405a = f11;
        this.f36406b = range;
        this.f36407c = i11;
    }

    public final float b() {
        return this.f36405a;
    }

    public final m00.e<Float> c() {
        return this.f36406b;
    }

    public final int d() {
        return this.f36407c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof g) {
            g gVar = (g) obj;
            return ((this.f36405a > gVar.f36405a ? 1 : (this.f36405a == gVar.f36405a ? 0 : -1)) == 0) && kotlin.jvm.internal.s.c(this.f36406b, gVar.f36406b) && this.f36407c == gVar.f36407c;
        }
        return false;
    }

    public int hashCode() {
        return (((Float.hashCode(this.f36405a) * 31) + this.f36406b.hashCode()) * 31) + this.f36407c;
    }

    public String toString() {
        return "ProgressBarRangeInfo(current=" + this.f36405a + ", range=" + this.f36406b + ", steps=" + this.f36407c + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public /* synthetic */ g(float f11, m00.e eVar, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(f11, eVar, (i12 & 4) != 0 ? 0 : i11);
    }
}