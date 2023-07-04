package n0;

import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Objects;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: a  reason: collision with root package name */
    private final long f40123a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f40124b;

    /* renamed from: c  reason: collision with root package name */
    private final p0.w f40125c;

    private t(long j11, boolean z11, p0.w wVar) {
        this.f40123a = j11;
        this.f40124b = z11;
        this.f40125c = wVar;
    }

    public /* synthetic */ t(long j11, boolean z11, p0.w wVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(j11, z11, wVar);
    }

    public final p0.w a() {
        return this.f40125c;
    }

    public final boolean b() {
        return this.f40124b;
    }

    public final long c() {
        return this.f40123a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (kotlin.jvm.internal.s.c(t.class, obj == null ? null : obj.getClass())) {
            Objects.requireNonNull(obj, "null cannot be cast to non-null type androidx.compose.foundation.gestures.OverScrollConfiguration");
            t tVar = (t) obj;
            return t1.a0.n(c(), tVar.c()) && this.f40124b == tVar.f40124b && kotlin.jvm.internal.s.c(this.f40125c, tVar.f40125c);
        }
        return false;
    }

    public int hashCode() {
        return (((t1.a0.t(c()) * 31) + Boolean.hashCode(this.f40124b)) * 31) + this.f40125c.hashCode();
    }

    public String toString() {
        return "OverScrollConfiguration(glowColor=" + ((Object) t1.a0.u(c())) + ", forceShowAlways=" + this.f40124b + ", drawPadding=" + this.f40125c + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public /* synthetic */ t(long j11, boolean z11, p0.w wVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? t1.c0.c(4284900966L) : j11, (i11 & 2) != 0 ? false : z11, (i11 & 4) != 0 ? p0.u.c(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 3, null) : wVar, null);
    }
}