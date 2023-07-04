package w2;

import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: c  reason: collision with root package name */
    public static final a f55420c = new a(null);

    /* renamed from: d  reason: collision with root package name */
    private static final g f55421d = new g(1.0f, BitmapDescriptorFactory.HUE_RED);

    /* renamed from: a  reason: collision with root package name */
    private final float f55422a;

    /* renamed from: b  reason: collision with root package name */
    private final float f55423b;

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final g a() {
            return g.f55421d;
        }
    }

    public g() {
        this(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 3, null);
    }

    public g(float f11, float f12) {
        this.f55422a = f11;
        this.f55423b = f12;
    }

    public final float b() {
        return this.f55422a;
    }

    public final float c() {
        return this.f55423b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof g) {
            g gVar = (g) obj;
            if (this.f55422a == gVar.f55422a) {
                return (this.f55423b > gVar.f55423b ? 1 : (this.f55423b == gVar.f55423b ? 0 : -1)) == 0;
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        return (Float.hashCode(this.f55422a) * 31) + Float.hashCode(this.f55423b);
    }

    public String toString() {
        return "TextGeometricTransform(scaleX=" + this.f55422a + ", skewX=" + this.f55423b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public /* synthetic */ g(float f11, float f12, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 1.0f : f11, (i11 & 2) != 0 ? BitmapDescriptorFactory.HUE_RED : f12);
    }
}