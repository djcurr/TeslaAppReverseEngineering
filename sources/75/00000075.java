package a8;

/* loaded from: classes.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    public final String f322a;

    /* renamed from: b  reason: collision with root package name */
    public final String f323b;

    /* renamed from: c  reason: collision with root package name */
    public final float f324c;

    /* renamed from: d  reason: collision with root package name */
    public final a f325d;

    /* renamed from: e  reason: collision with root package name */
    public final int f326e;

    /* renamed from: f  reason: collision with root package name */
    public final float f327f;

    /* renamed from: g  reason: collision with root package name */
    public final float f328g;

    /* renamed from: h  reason: collision with root package name */
    public final int f329h;

    /* renamed from: i  reason: collision with root package name */
    public final int f330i;

    /* renamed from: j  reason: collision with root package name */
    public final float f331j;

    /* renamed from: k  reason: collision with root package name */
    public final boolean f332k;

    /* loaded from: classes.dex */
    public enum a {
        LEFT_ALIGN,
        RIGHT_ALIGN,
        CENTER
    }

    public b(String str, String str2, float f11, a aVar, int i11, float f12, float f13, int i12, int i13, float f14, boolean z11) {
        this.f322a = str;
        this.f323b = str2;
        this.f324c = f11;
        this.f325d = aVar;
        this.f326e = i11;
        this.f327f = f12;
        this.f328g = f13;
        this.f329h = i12;
        this.f330i = i13;
        this.f331j = f14;
        this.f332k = z11;
    }

    public int hashCode() {
        int hashCode = (((((int) ((((this.f322a.hashCode() * 31) + this.f323b.hashCode()) * 31) + this.f324c)) * 31) + this.f325d.ordinal()) * 31) + this.f326e;
        long floatToRawIntBits = Float.floatToRawIntBits(this.f327f);
        return (((hashCode * 31) + ((int) (floatToRawIntBits ^ (floatToRawIntBits >>> 32)))) * 31) + this.f329h;
    }
}