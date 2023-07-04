package v5;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import ch.qos.logback.core.CoreConstants;
import kotlin.jvm.internal.s;
import okhttp3.Headers;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a  reason: collision with root package name */
    private final Context f54072a;

    /* renamed from: b  reason: collision with root package name */
    private final Bitmap.Config f54073b;

    /* renamed from: c  reason: collision with root package name */
    private final ColorSpace f54074c;

    /* renamed from: d  reason: collision with root package name */
    private final c6.f f54075d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f54076e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f54077f;

    /* renamed from: g  reason: collision with root package name */
    private final Headers f54078g;

    /* renamed from: h  reason: collision with root package name */
    private final b6.j f54079h;

    /* renamed from: i  reason: collision with root package name */
    private final coil.request.a f54080i;

    /* renamed from: j  reason: collision with root package name */
    private final coil.request.a f54081j;

    /* renamed from: k  reason: collision with root package name */
    private final coil.request.a f54082k;

    public j(Context context, Bitmap.Config config, ColorSpace colorSpace, c6.f scale, boolean z11, boolean z12, Headers headers, b6.j parameters, coil.request.a memoryCachePolicy, coil.request.a diskCachePolicy, coil.request.a networkCachePolicy) {
        s.g(context, "context");
        s.g(config, "config");
        s.g(scale, "scale");
        s.g(headers, "headers");
        s.g(parameters, "parameters");
        s.g(memoryCachePolicy, "memoryCachePolicy");
        s.g(diskCachePolicy, "diskCachePolicy");
        s.g(networkCachePolicy, "networkCachePolicy");
        this.f54072a = context;
        this.f54073b = config;
        this.f54074c = colorSpace;
        this.f54075d = scale;
        this.f54076e = z11;
        this.f54077f = z12;
        this.f54078g = headers;
        this.f54079h = parameters;
        this.f54080i = memoryCachePolicy;
        this.f54081j = diskCachePolicy;
        this.f54082k = networkCachePolicy;
    }

    public final boolean a() {
        return this.f54076e;
    }

    public final boolean b() {
        return this.f54077f;
    }

    public final ColorSpace c() {
        return this.f54074c;
    }

    public final Bitmap.Config d() {
        return this.f54073b;
    }

    public final Context e() {
        return this.f54072a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof j) {
            j jVar = (j) obj;
            if (s.c(this.f54072a, jVar.f54072a) && this.f54073b == jVar.f54073b && s.c(this.f54074c, jVar.f54074c) && this.f54075d == jVar.f54075d && this.f54076e == jVar.f54076e && this.f54077f == jVar.f54077f && s.c(this.f54078g, jVar.f54078g) && s.c(this.f54079h, jVar.f54079h) && this.f54080i == jVar.f54080i && this.f54081j == jVar.f54081j && this.f54082k == jVar.f54082k) {
                return true;
            }
        }
        return false;
    }

    public final coil.request.a f() {
        return this.f54081j;
    }

    public final Headers g() {
        return this.f54078g;
    }

    public final coil.request.a h() {
        return this.f54082k;
    }

    public int hashCode() {
        int hashCode = ((this.f54072a.hashCode() * 31) + this.f54073b.hashCode()) * 31;
        ColorSpace colorSpace = this.f54074c;
        return ((((((((((((((((hashCode + (colorSpace != null ? colorSpace.hashCode() : 0)) * 31) + this.f54075d.hashCode()) * 31) + Boolean.hashCode(this.f54076e)) * 31) + Boolean.hashCode(this.f54077f)) * 31) + this.f54078g.hashCode()) * 31) + this.f54079h.hashCode()) * 31) + this.f54080i.hashCode()) * 31) + this.f54081j.hashCode()) * 31) + this.f54082k.hashCode();
    }

    public final c6.f i() {
        return this.f54075d;
    }

    public String toString() {
        return "Options(context=" + this.f54072a + ", config=" + this.f54073b + ", colorSpace=" + this.f54074c + ", scale=" + this.f54075d + ", allowInexactSize=" + this.f54076e + ", allowRgb565=" + this.f54077f + ", headers=" + this.f54078g + ", parameters=" + this.f54079h + ", memoryCachePolicy=" + this.f54080i + ", diskCachePolicy=" + this.f54081j + ", networkCachePolicy=" + this.f54082k + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}