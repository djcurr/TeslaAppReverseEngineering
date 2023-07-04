package b6;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import ch.qos.logback.core.CoreConstants;
import g6.m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import v20.e1;
import v20.j0;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: m  reason: collision with root package name */
    public static final b f7411m;

    /* renamed from: a  reason: collision with root package name */
    private final j0 f7412a;

    /* renamed from: b  reason: collision with root package name */
    private final f6.b f7413b;

    /* renamed from: c  reason: collision with root package name */
    private final c6.d f7414c;

    /* renamed from: d  reason: collision with root package name */
    private final Bitmap.Config f7415d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f7416e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f7417f;

    /* renamed from: g  reason: collision with root package name */
    private final Drawable f7418g;

    /* renamed from: h  reason: collision with root package name */
    private final Drawable f7419h;

    /* renamed from: i  reason: collision with root package name */
    private final Drawable f7420i;

    /* renamed from: j  reason: collision with root package name */
    private final coil.request.a f7421j;

    /* renamed from: k  reason: collision with root package name */
    private final coil.request.a f7422k;

    /* renamed from: l  reason: collision with root package name */
    private final coil.request.a f7423l;

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new a(null);
        f7411m = new b(null, null, null, null, false, false, null, null, null, null, null, null, 4095, null);
    }

    public b() {
        this(null, null, null, null, false, false, null, null, null, null, null, null, 4095, null);
    }

    public b(j0 dispatcher, f6.b transition, c6.d precision, Bitmap.Config bitmapConfig, boolean z11, boolean z12, Drawable drawable, Drawable drawable2, Drawable drawable3, coil.request.a memoryCachePolicy, coil.request.a diskCachePolicy, coil.request.a networkCachePolicy) {
        s.g(dispatcher, "dispatcher");
        s.g(transition, "transition");
        s.g(precision, "precision");
        s.g(bitmapConfig, "bitmapConfig");
        s.g(memoryCachePolicy, "memoryCachePolicy");
        s.g(diskCachePolicy, "diskCachePolicy");
        s.g(networkCachePolicy, "networkCachePolicy");
        this.f7412a = dispatcher;
        this.f7413b = transition;
        this.f7414c = precision;
        this.f7415d = bitmapConfig;
        this.f7416e = z11;
        this.f7417f = z12;
        this.f7418g = drawable;
        this.f7419h = drawable2;
        this.f7420i = drawable3;
        this.f7421j = memoryCachePolicy;
        this.f7422k = diskCachePolicy;
        this.f7423l = networkCachePolicy;
    }

    public final boolean a() {
        return this.f7416e;
    }

    public final boolean b() {
        return this.f7417f;
    }

    public final Bitmap.Config c() {
        return this.f7415d;
    }

    public final coil.request.a d() {
        return this.f7422k;
    }

    public final j0 e() {
        return this.f7412a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (s.c(this.f7412a, bVar.f7412a) && s.c(this.f7413b, bVar.f7413b) && this.f7414c == bVar.f7414c && this.f7415d == bVar.f7415d && this.f7416e == bVar.f7416e && this.f7417f == bVar.f7417f && s.c(this.f7418g, bVar.f7418g) && s.c(this.f7419h, bVar.f7419h) && s.c(this.f7420i, bVar.f7420i) && this.f7421j == bVar.f7421j && this.f7422k == bVar.f7422k && this.f7423l == bVar.f7423l) {
                return true;
            }
        }
        return false;
    }

    public final Drawable f() {
        return this.f7419h;
    }

    public final Drawable g() {
        return this.f7420i;
    }

    public final coil.request.a h() {
        return this.f7421j;
    }

    public int hashCode() {
        int hashCode = ((((((((((this.f7412a.hashCode() * 31) + this.f7413b.hashCode()) * 31) + this.f7414c.hashCode()) * 31) + this.f7415d.hashCode()) * 31) + Boolean.hashCode(this.f7416e)) * 31) + Boolean.hashCode(this.f7417f)) * 31;
        Drawable drawable = this.f7418g;
        int hashCode2 = (hashCode + (drawable != null ? drawable.hashCode() : 0)) * 31;
        Drawable drawable2 = this.f7419h;
        int hashCode3 = (hashCode2 + (drawable2 != null ? drawable2.hashCode() : 0)) * 31;
        Drawable drawable3 = this.f7420i;
        return ((((((hashCode3 + (drawable3 != null ? drawable3.hashCode() : 0)) * 31) + this.f7421j.hashCode()) * 31) + this.f7422k.hashCode()) * 31) + this.f7423l.hashCode();
    }

    public final coil.request.a i() {
        return this.f7423l;
    }

    public final Drawable j() {
        return this.f7418g;
    }

    public final c6.d k() {
        return this.f7414c;
    }

    public final f6.b l() {
        return this.f7413b;
    }

    public String toString() {
        return "DefaultRequestOptions(dispatcher=" + this.f7412a + ", transition=" + this.f7413b + ", precision=" + this.f7414c + ", bitmapConfig=" + this.f7415d + ", allowHardware=" + this.f7416e + ", allowRgb565=" + this.f7417f + ", placeholder=" + this.f7418g + ", error=" + this.f7419h + ", fallback=" + this.f7420i + ", memoryCachePolicy=" + this.f7421j + ", diskCachePolicy=" + this.f7422k + ", networkCachePolicy=" + this.f7423l + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public /* synthetic */ b(j0 j0Var, f6.b bVar, c6.d dVar, Bitmap.Config config, boolean z11, boolean z12, Drawable drawable, Drawable drawable2, Drawable drawable3, coil.request.a aVar, coil.request.a aVar2, coil.request.a aVar3, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? e1.b() : j0Var, (i11 & 2) != 0 ? f6.b.f25911a : bVar, (i11 & 4) != 0 ? c6.d.AUTOMATIC : dVar, (i11 & 8) != 0 ? m.f27804a.d() : config, (i11 & 16) != 0 ? true : z11, (i11 & 32) != 0 ? false : z12, (i11 & 64) != 0 ? null : drawable, (i11 & 128) != 0 ? null : drawable2, (i11 & 256) == 0 ? drawable3 : null, (i11 & 512) != 0 ? coil.request.a.ENABLED : aVar, (i11 & 1024) != 0 ? coil.request.a.ENABLED : aVar2, (i11 & 2048) != 0 ? coil.request.a.ENABLED : aVar3);
    }
}