package p001if;

import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import md.j;
import vf.a;

/* renamed from: if.b  reason: invalid package */
/* loaded from: classes3.dex */
public class b {

    /* renamed from: m  reason: collision with root package name */
    private static final b f30360m = b().a();

    /* renamed from: a  reason: collision with root package name */
    public final int f30361a;

    /* renamed from: b  reason: collision with root package name */
    public final int f30362b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f30363c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f30364d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f30365e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f30366f;

    /* renamed from: g  reason: collision with root package name */
    public final Bitmap.Config f30367g;

    /* renamed from: h  reason: collision with root package name */
    public final Bitmap.Config f30368h;

    /* renamed from: i  reason: collision with root package name */
    public final lf.b f30369i;

    /* renamed from: j  reason: collision with root package name */
    public final a f30370j;

    /* renamed from: k  reason: collision with root package name */
    public final ColorSpace f30371k;

    /* renamed from: l  reason: collision with root package name */
    private final boolean f30372l;

    public b(c cVar) {
        this.f30361a = cVar.l();
        this.f30362b = cVar.k();
        this.f30363c = cVar.h();
        this.f30364d = cVar.m();
        this.f30365e = cVar.g();
        this.f30366f = cVar.j();
        this.f30367g = cVar.c();
        this.f30368h = cVar.b();
        this.f30369i = cVar.f();
        this.f30370j = cVar.d();
        this.f30371k = cVar.e();
        this.f30372l = cVar.i();
    }

    public static b a() {
        return f30360m;
    }

    public static c b() {
        return new c();
    }

    protected j.b c() {
        return j.c(this).a("minDecodeIntervalMs", this.f30361a).a("maxDimensionPx", this.f30362b).c("decodePreviewFrame", this.f30363c).c("useLastFrameForPreview", this.f30364d).c("decodeAllFrames", this.f30365e).c("forceStaticImage", this.f30366f).b("bitmapConfigName", this.f30367g.name()).b("animatedBitmapConfigName", this.f30368h.name()).b("customImageDecoder", this.f30369i).b("bitmapTransformation", this.f30370j).b("colorSpace", this.f30371k);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f30361a == bVar.f30361a && this.f30362b == bVar.f30362b && this.f30363c == bVar.f30363c && this.f30364d == bVar.f30364d && this.f30365e == bVar.f30365e && this.f30366f == bVar.f30366f) {
            boolean z11 = this.f30372l;
            if (z11 || this.f30367g == bVar.f30367g) {
                return (z11 || this.f30368h == bVar.f30368h) && this.f30369i == bVar.f30369i && this.f30370j == bVar.f30370j && this.f30371k == bVar.f30371k;
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        int i11 = (((((((((this.f30361a * 31) + this.f30362b) * 31) + (this.f30363c ? 1 : 0)) * 31) + (this.f30364d ? 1 : 0)) * 31) + (this.f30365e ? 1 : 0)) * 31) + (this.f30366f ? 1 : 0);
        if (!this.f30372l) {
            i11 = (i11 * 31) + this.f30367g.ordinal();
        }
        if (!this.f30372l) {
            int i12 = i11 * 31;
            Bitmap.Config config = this.f30368h;
            i11 = i12 + (config != null ? config.ordinal() : 0);
        }
        int i13 = i11 * 31;
        lf.b bVar = this.f30369i;
        int hashCode = (i13 + (bVar != null ? bVar.hashCode() : 0)) * 31;
        a aVar = this.f30370j;
        int hashCode2 = (hashCode + (aVar != null ? aVar.hashCode() : 0)) * 31;
        ColorSpace colorSpace = this.f30371k;
        return hashCode2 + (colorSpace != null ? colorSpace.hashCode() : 0);
    }

    public String toString() {
        return "ImageDecodeOptions{" + c().toString() + "}";
    }
}