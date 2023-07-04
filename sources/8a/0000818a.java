package l0;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* loaded from: classes.dex */
public final class m extends p {

    /* renamed from: a  reason: collision with root package name */
    private float f36208a;

    /* renamed from: b  reason: collision with root package name */
    private final int f36209b;

    public m(float f11) {
        super(null);
        this.f36208a = f11;
        this.f36209b = 1;
    }

    @Override // l0.p
    public float a(int i11) {
        return i11 == 0 ? this.f36208a : BitmapDescriptorFactory.HUE_RED;
    }

    @Override // l0.p
    public int b() {
        return this.f36209b;
    }

    @Override // l0.p
    public void d() {
        this.f36208a = BitmapDescriptorFactory.HUE_RED;
    }

    @Override // l0.p
    public void e(int i11, float f11) {
        if (i11 == 0) {
            this.f36208a = f11;
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof m) {
            if (((m) obj).f36208a == this.f36208a) {
                return true;
            }
        }
        return false;
    }

    public final float f() {
        return this.f36208a;
    }

    @Override // l0.p
    /* renamed from: g */
    public m c() {
        return new m(BitmapDescriptorFactory.HUE_RED);
    }

    public int hashCode() {
        return Float.hashCode(this.f36208a);
    }

    public String toString() {
        return kotlin.jvm.internal.s.p("AnimationVector1D: value = ", Float.valueOf(this.f36208a));
    }
}