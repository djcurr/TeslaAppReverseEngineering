package t1;

import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class e1 extends s {

    /* renamed from: a  reason: collision with root package name */
    private final long f51413a;

    private e1(long j11) {
        super(null);
        this.f51413a = j11;
    }

    public /* synthetic */ e1(long j11, DefaultConstructorMarker defaultConstructorMarker) {
        this(j11);
    }

    @Override // t1.s
    public void a(long j11, o0 p11, float f11) {
        long b11;
        kotlin.jvm.internal.s.g(p11, "p");
        p11.b(1.0f);
        if (!(f11 == 1.0f)) {
            b11 = a0.l(b(), a0.o(b()) * f11, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null);
        } else {
            b11 = b();
        }
        p11.l(b11);
        if (p11.s() != null) {
            p11.r(null);
        }
    }

    public final long b() {
        return this.f51413a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e1) && a0.n(b(), ((e1) obj).b());
    }

    public int hashCode() {
        return a0.t(b());
    }

    public String toString() {
        return "SolidColor(value=" + ((Object) a0.u(b())) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}