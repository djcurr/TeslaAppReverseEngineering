package d0;

/* loaded from: classes.dex */
final class a extends c {

    /* renamed from: a  reason: collision with root package name */
    private final float f23246a;

    /* renamed from: b  reason: collision with root package name */
    private final float f23247b;

    /* renamed from: c  reason: collision with root package name */
    private final float f23248c;

    /* renamed from: d  reason: collision with root package name */
    private final float f23249d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(float f11, float f12, float f13, float f14) {
        this.f23246a = f11;
        this.f23247b = f12;
        this.f23248c = f13;
        this.f23249d = f14;
    }

    @Override // d0.c, z.a1
    public float a() {
        return this.f23247b;
    }

    @Override // d0.c, z.a1
    public float b() {
        return this.f23249d;
    }

    @Override // d0.c, z.a1
    public float c() {
        return this.f23248c;
    }

    @Override // d0.c, z.a1
    public float d() {
        return this.f23246a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            return Float.floatToIntBits(this.f23246a) == Float.floatToIntBits(cVar.d()) && Float.floatToIntBits(this.f23247b) == Float.floatToIntBits(cVar.a()) && Float.floatToIntBits(this.f23248c) == Float.floatToIntBits(cVar.c()) && Float.floatToIntBits(this.f23249d) == Float.floatToIntBits(cVar.b());
        }
        return false;
    }

    public int hashCode() {
        return ((((((Float.floatToIntBits(this.f23246a) ^ 1000003) * 1000003) ^ Float.floatToIntBits(this.f23247b)) * 1000003) ^ Float.floatToIntBits(this.f23248c)) * 1000003) ^ Float.floatToIntBits(this.f23249d);
    }

    public String toString() {
        return "ImmutableZoomState{zoomRatio=" + this.f23246a + ", maxZoomRatio=" + this.f23247b + ", minZoomRatio=" + this.f23248c + ", linearZoom=" + this.f23249d + "}";
    }
}