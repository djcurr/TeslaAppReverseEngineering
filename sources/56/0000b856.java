package v0;

import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.jvm.internal.s;
import s1.h;
import s1.k;
import s1.m;
import t1.m0;
import x2.q;

/* loaded from: classes.dex */
public final class f extends a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(b topStart, b topEnd, b bottomEnd, b bottomStart) {
        super(topStart, topEnd, bottomEnd, bottomStart);
        s.g(topStart, "topStart");
        s.g(topEnd, "topEnd");
        s.g(bottomEnd, "bottomEnd");
        s.g(bottomStart, "bottomStart");
    }

    @Override // v0.a
    public m0 d(long j11, float f11, float f12, float f13, float f14, q layoutDirection) {
        s.g(layoutDirection, "layoutDirection");
        if (((f11 + f12) + f13) + f14 == BitmapDescriptorFactory.HUE_RED) {
            return new m0.b(m.c(j11));
        }
        h c11 = m.c(j11);
        q qVar = q.Ltr;
        return new m0.c(k.b(c11, s1.b.b(layoutDirection == qVar ? f11 : f12, BitmapDescriptorFactory.HUE_RED, 2, null), s1.b.b(layoutDirection == qVar ? f12 : f11, BitmapDescriptorFactory.HUE_RED, 2, null), s1.b.b(layoutDirection == qVar ? f13 : f14, BitmapDescriptorFactory.HUE_RED, 2, null), s1.b.b(layoutDirection == qVar ? f14 : f13, BitmapDescriptorFactory.HUE_RED, 2, null)));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            return s.c(h(), fVar.h()) && s.c(g(), fVar.g()) && s.c(e(), fVar.e()) && s.c(f(), fVar.f());
        }
        return false;
    }

    public int hashCode() {
        return (((((h().hashCode() * 31) + g().hashCode()) * 31) + e().hashCode()) * 31) + f().hashCode();
    }

    @Override // v0.a
    /* renamed from: i */
    public f b(b topStart, b topEnd, b bottomEnd, b bottomStart) {
        s.g(topStart, "topStart");
        s.g(topEnd, "topEnd");
        s.g(bottomEnd, "bottomEnd");
        s.g(bottomStart, "bottomStart");
        return new f(topStart, topEnd, bottomEnd, bottomStart);
    }

    public String toString() {
        return "RoundedCornerShape(topStart = " + h() + ", topEnd = " + g() + ", bottomEnd = " + e() + ", bottomStart = " + f() + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}