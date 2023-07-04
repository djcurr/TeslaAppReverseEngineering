package l0;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class v0<T> implements c0<T> {

    /* renamed from: a  reason: collision with root package name */
    private final float f36296a;

    /* renamed from: b  reason: collision with root package name */
    private final float f36297b;

    /* renamed from: c  reason: collision with root package name */
    private final T f36298c;

    public v0() {
        this(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, null, 7, null);
    }

    public v0(float f11, float f12, T t11) {
        this.f36296a = f11;
        this.f36297b = f12;
        this.f36298c = t11;
    }

    public boolean equals(Object obj) {
        if (obj instanceof v0) {
            v0 v0Var = (v0) obj;
            if (v0Var.f36296a == this.f36296a) {
                if ((v0Var.f36297b == this.f36297b) && kotlin.jvm.internal.s.c(v0Var.f36298c, this.f36298c)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // l0.i
    /* renamed from: f */
    public <V extends p> q1<V> a(d1<T, V> converter) {
        p b11;
        kotlin.jvm.internal.s.g(converter, "converter");
        float f11 = this.f36296a;
        float f12 = this.f36297b;
        b11 = j.b(converter, this.f36298c);
        return new q1<>(f11, f12, b11);
    }

    public int hashCode() {
        T t11 = this.f36298c;
        return ((((t11 == null ? 0 : t11.hashCode()) * 31) + Float.hashCode(this.f36296a)) * 31) + Float.hashCode(this.f36297b);
    }

    public /* synthetic */ v0(float f11, float f12, Object obj, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 1.0f : f11, (i11 & 2) != 0 ? 1500.0f : f12, (i11 & 4) != 0 ? null : obj);
    }
}