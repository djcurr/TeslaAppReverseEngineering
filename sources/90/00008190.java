package l0;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* loaded from: classes.dex */
public final class o extends p {

    /* renamed from: a  reason: collision with root package name */
    private float f36226a;

    /* renamed from: b  reason: collision with root package name */
    private float f36227b;

    /* renamed from: c  reason: collision with root package name */
    private float f36228c;

    /* renamed from: d  reason: collision with root package name */
    private float f36229d;

    /* renamed from: e  reason: collision with root package name */
    private final int f36230e;

    public o(float f11, float f12, float f13, float f14) {
        super(null);
        this.f36226a = f11;
        this.f36227b = f12;
        this.f36228c = f13;
        this.f36229d = f14;
        this.f36230e = 4;
    }

    @Override // l0.p
    public float a(int i11) {
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    return i11 != 3 ? BitmapDescriptorFactory.HUE_RED : this.f36229d;
                }
                return this.f36228c;
            }
            return this.f36227b;
        }
        return this.f36226a;
    }

    @Override // l0.p
    public int b() {
        return this.f36230e;
    }

    @Override // l0.p
    public void d() {
        this.f36226a = BitmapDescriptorFactory.HUE_RED;
        this.f36227b = BitmapDescriptorFactory.HUE_RED;
        this.f36228c = BitmapDescriptorFactory.HUE_RED;
        this.f36229d = BitmapDescriptorFactory.HUE_RED;
    }

    @Override // l0.p
    public void e(int i11, float f11) {
        if (i11 == 0) {
            this.f36226a = f11;
        } else if (i11 == 1) {
            this.f36227b = f11;
        } else if (i11 == 2) {
            this.f36228c = f11;
        } else if (i11 != 3) {
        } else {
            this.f36229d = f11;
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof o) {
            o oVar = (o) obj;
            if (oVar.f36226a == this.f36226a) {
                if (oVar.f36227b == this.f36227b) {
                    if (oVar.f36228c == this.f36228c) {
                        if (oVar.f36229d == this.f36229d) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final float f() {
        return this.f36226a;
    }

    public final float g() {
        return this.f36227b;
    }

    public final float h() {
        return this.f36228c;
    }

    public int hashCode() {
        return (((((Float.hashCode(this.f36226a) * 31) + Float.hashCode(this.f36227b)) * 31) + Float.hashCode(this.f36228c)) * 31) + Float.hashCode(this.f36229d);
    }

    public final float i() {
        return this.f36229d;
    }

    @Override // l0.p
    /* renamed from: j */
    public o c() {
        return new o(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
    }

    public String toString() {
        return "AnimationVector4D: v1 = " + this.f36226a + ", v2 = " + this.f36227b + ", v3 = " + this.f36228c + ", v4 = " + this.f36229d;
    }
}