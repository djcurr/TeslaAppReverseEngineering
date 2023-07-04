package zx;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* loaded from: classes5.dex */
public class b {

    /* renamed from: d  reason: collision with root package name */
    public static final b f61259d;

    /* renamed from: a  reason: collision with root package name */
    private long f61260a;

    /* renamed from: b  reason: collision with root package name */
    private float f61261b;

    /* renamed from: c  reason: collision with root package name */
    private zx.a f61262c;

    /* loaded from: classes5.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private zx.a f61263a;

        /* renamed from: b  reason: collision with root package name */
        private long f61264b;

        /* renamed from: c  reason: collision with root package name */
        private float f61265c;

        public b a() {
            return new b(this.f61263a, this.f61264b, this.f61265c);
        }

        public a b(zx.a aVar) {
            this.f61263a = aVar;
            return this;
        }

        public a c(float f11) {
            this.f61265c = f11;
            return this;
        }

        public a d(long j11) {
            this.f61264b = j11;
            return this;
        }
    }

    static {
        new a().b(zx.a.HIGH).c(BitmapDescriptorFactory.HUE_RED).d(500L).a();
        f61259d = new a().b(zx.a.MEDIUM).c(150.0f).d(2500L).a();
        new a().b(zx.a.LOW).c(500.0f).d(5000L).a();
    }

    b(zx.a aVar, long j11, float f11) {
        this.f61260a = j11;
        this.f61261b = f11;
        this.f61262c = aVar;
    }

    public zx.a a() {
        return this.f61262c;
    }

    public float b() {
        return this.f61261b;
    }

    public long c() {
        return this.f61260a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            return Float.compare(bVar.f61261b, this.f61261b) == 0 && this.f61260a == bVar.f61260a && this.f61262c == bVar.f61262c;
        }
        return false;
    }

    public int hashCode() {
        long j11 = this.f61260a;
        int i11 = ((int) (j11 ^ (j11 >>> 32))) * 31;
        float f11 = this.f61261b;
        return ((i11 + (f11 != BitmapDescriptorFactory.HUE_RED ? Float.floatToIntBits(f11) : 0)) * 31) + this.f61262c.hashCode();
    }
}