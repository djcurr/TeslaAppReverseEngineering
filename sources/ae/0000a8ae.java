package p0;

import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class a0 {

    /* renamed from: a  reason: collision with root package name */
    private float f45241a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f45242b;

    /* renamed from: c  reason: collision with root package name */
    private k f45243c;

    public a0() {
        this(BitmapDescriptorFactory.HUE_RED, false, null, 7, null);
    }

    public a0(float f11, boolean z11, k kVar) {
        this.f45241a = f11;
        this.f45242b = z11;
        this.f45243c = kVar;
    }

    public final k a() {
        return this.f45243c;
    }

    public final boolean b() {
        return this.f45242b;
    }

    public final float c() {
        return this.f45241a;
    }

    public final void d(k kVar) {
        this.f45243c = kVar;
    }

    public final void e(boolean z11) {
        this.f45242b = z11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a0) {
            a0 a0Var = (a0) obj;
            return kotlin.jvm.internal.s.c(Float.valueOf(this.f45241a), Float.valueOf(a0Var.f45241a)) && this.f45242b == a0Var.f45242b && kotlin.jvm.internal.s.c(this.f45243c, a0Var.f45243c);
        }
        return false;
    }

    public final void f(float f11) {
        this.f45241a = f11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = Float.hashCode(this.f45241a) * 31;
        boolean z11 = this.f45242b;
        int i11 = z11;
        if (z11 != 0) {
            i11 = 1;
        }
        int i12 = (hashCode + i11) * 31;
        k kVar = this.f45243c;
        return i12 + (kVar == null ? 0 : kVar.hashCode());
    }

    public String toString() {
        return "RowColumnParentData(weight=" + this.f45241a + ", fill=" + this.f45242b + ", crossAxisAlignment=" + this.f45243c + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public /* synthetic */ a0(float f11, boolean z11, k kVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? BitmapDescriptorFactory.HUE_RED : f11, (i11 & 2) != 0 ? true : z11, (i11 & 4) != 0 ? null : kVar);
    }
}