package ke;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Arrays;
import md.k;

/* loaded from: classes3.dex */
public class d {

    /* renamed from: a  reason: collision with root package name */
    private a f34600a = a.BITMAP_ONLY;

    /* renamed from: b  reason: collision with root package name */
    private boolean f34601b = false;

    /* renamed from: c  reason: collision with root package name */
    private float[] f34602c = null;

    /* renamed from: d  reason: collision with root package name */
    private int f34603d = 0;

    /* renamed from: e  reason: collision with root package name */
    private float f34604e = BitmapDescriptorFactory.HUE_RED;

    /* renamed from: f  reason: collision with root package name */
    private int f34605f = 0;

    /* renamed from: g  reason: collision with root package name */
    private float f34606g = BitmapDescriptorFactory.HUE_RED;

    /* renamed from: h  reason: collision with root package name */
    private boolean f34607h = false;

    /* renamed from: i  reason: collision with root package name */
    private boolean f34608i = false;

    /* loaded from: classes3.dex */
    public enum a {
        OVERLAY_COLOR,
        BITMAP_ONLY
    }

    public static d a(float f11) {
        return new d().p(f11);
    }

    private float[] e() {
        if (this.f34602c == null) {
            this.f34602c = new float[8];
        }
        return this.f34602c;
    }

    public int b() {
        return this.f34605f;
    }

    public float c() {
        return this.f34604e;
    }

    public float[] d() {
        return this.f34602c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        if (this.f34601b == dVar.f34601b && this.f34603d == dVar.f34603d && Float.compare(dVar.f34604e, this.f34604e) == 0 && this.f34605f == dVar.f34605f && Float.compare(dVar.f34606g, this.f34606g) == 0 && this.f34600a == dVar.f34600a && this.f34607h == dVar.f34607h && this.f34608i == dVar.f34608i) {
            return Arrays.equals(this.f34602c, dVar.f34602c);
        }
        return false;
    }

    public int f() {
        return this.f34603d;
    }

    public float g() {
        return this.f34606g;
    }

    public boolean h() {
        return this.f34608i;
    }

    public int hashCode() {
        a aVar = this.f34600a;
        int hashCode = (((aVar != null ? aVar.hashCode() : 0) * 31) + (this.f34601b ? 1 : 0)) * 31;
        float[] fArr = this.f34602c;
        int hashCode2 = (((hashCode + (fArr != null ? Arrays.hashCode(fArr) : 0)) * 31) + this.f34603d) * 31;
        float f11 = this.f34604e;
        int floatToIntBits = (((hashCode2 + (f11 != BitmapDescriptorFactory.HUE_RED ? Float.floatToIntBits(f11) : 0)) * 31) + this.f34605f) * 31;
        float f12 = this.f34606g;
        return ((((floatToIntBits + (f12 != BitmapDescriptorFactory.HUE_RED ? Float.floatToIntBits(f12) : 0)) * 31) + (this.f34607h ? 1 : 0)) * 31) + (this.f34608i ? 1 : 0);
    }

    public boolean i() {
        return this.f34601b;
    }

    public a j() {
        return this.f34600a;
    }

    public boolean k() {
        return this.f34607h;
    }

    public d l(int i11, float f11) {
        k.c(f11 >= BitmapDescriptorFactory.HUE_RED, "the border width cannot be < 0");
        this.f34604e = f11;
        this.f34605f = i11;
        return this;
    }

    public d m(int i11) {
        this.f34605f = i11;
        return this;
    }

    public d n(float f11) {
        k.c(f11 >= BitmapDescriptorFactory.HUE_RED, "the border width cannot be < 0");
        this.f34604e = f11;
        return this;
    }

    public d o(float f11, float f12, float f13, float f14) {
        float[] e11 = e();
        e11[1] = f11;
        e11[0] = f11;
        e11[3] = f12;
        e11[2] = f12;
        e11[5] = f13;
        e11[4] = f13;
        e11[7] = f14;
        e11[6] = f14;
        return this;
    }

    public d p(float f11) {
        Arrays.fill(e(), f11);
        return this;
    }

    public d q(int i11) {
        this.f34603d = i11;
        this.f34600a = a.OVERLAY_COLOR;
        return this;
    }

    public d r(a aVar) {
        this.f34600a = aVar;
        return this;
    }
}