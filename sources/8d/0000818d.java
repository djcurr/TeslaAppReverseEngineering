package l0;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* loaded from: classes.dex */
public final class n extends p {

    /* renamed from: a  reason: collision with root package name */
    private float f36215a;

    /* renamed from: b  reason: collision with root package name */
    private float f36216b;

    /* renamed from: c  reason: collision with root package name */
    private final int f36217c;

    public n(float f11, float f12) {
        super(null);
        this.f36215a = f11;
        this.f36216b = f12;
        this.f36217c = 2;
    }

    @Override // l0.p
    public float a(int i11) {
        if (i11 != 0) {
            return i11 != 1 ? BitmapDescriptorFactory.HUE_RED : this.f36216b;
        }
        return this.f36215a;
    }

    @Override // l0.p
    public int b() {
        return this.f36217c;
    }

    @Override // l0.p
    public void d() {
        this.f36215a = BitmapDescriptorFactory.HUE_RED;
        this.f36216b = BitmapDescriptorFactory.HUE_RED;
    }

    @Override // l0.p
    public void e(int i11, float f11) {
        if (i11 == 0) {
            this.f36215a = f11;
        } else if (i11 != 1) {
        } else {
            this.f36216b = f11;
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof n) {
            n nVar = (n) obj;
            if (nVar.f36215a == this.f36215a) {
                if (nVar.f36216b == this.f36216b) {
                    return true;
                }
            }
        }
        return false;
    }

    public final float f() {
        return this.f36215a;
    }

    public final float g() {
        return this.f36216b;
    }

    @Override // l0.p
    /* renamed from: h */
    public n c() {
        return new n(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
    }

    public int hashCode() {
        return (Float.hashCode(this.f36215a) * 31) + Float.hashCode(this.f36216b);
    }

    public String toString() {
        return "AnimationVector2D: v1 = " + this.f36215a + ", v2 = " + this.f36216b;
    }
}