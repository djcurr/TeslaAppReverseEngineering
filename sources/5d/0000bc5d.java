package w5;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.net.Uri;
import ch.qos.logback.core.CoreConstants;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* loaded from: classes.dex */
public final class l implements g<Uri> {

    /* renamed from: a  reason: collision with root package name */
    private final Context f55628a;

    /* renamed from: b  reason: collision with root package name */
    private final v5.g f55629b;

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
    }

    public l(Context context, v5.g drawableDecoder) {
        s.g(context, "context");
        s.g(drawableDecoder, "drawableDecoder");
        this.f55628a = context;
        this.f55629b = drawableDecoder;
    }

    private final Void g(Uri uri) {
        throw new IllegalStateException("Invalid android.resource URI: " + uri);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0035, code lost:
        r14 = kotlin.text.u.n(r14);
     */
    @Override // w5.g
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object c(t5.b r10, android.net.Uri r11, c6.g r12, v5.j r13, zz.d<? super w5.f> r14) {
        /*
            r9 = this;
            java.lang.String r10 = r11.getAuthority()
            if (r10 == 0) goto Lf1
            java.lang.String r14 = "it"
            kotlin.jvm.internal.s.f(r10, r14)
            boolean r14 = kotlin.text.m.w(r10)
            r0 = 1
            r14 = r14 ^ r0
            java.lang.Boolean r14 = kotlin.coroutines.jvm.internal.b.a(r14)
            boolean r14 = r14.booleanValue()
            if (r14 == 0) goto L1c
            goto L1d
        L1c:
            r10 = 0
        L1d:
            if (r10 == 0) goto Lf1
            java.lang.String r14 = "data.authority?.takeIf {…InvalidUriException(data)"
            kotlin.jvm.internal.s.f(r10, r14)
            java.util.List r14 = r11.getPathSegments()
            java.lang.String r1 = "data.pathSegments"
            kotlin.jvm.internal.s.f(r14, r1)
            java.lang.Object r14 = wz.u.p0(r14)
            java.lang.String r14 = (java.lang.String) r14
            if (r14 == 0) goto Le8
            java.lang.Integer r14 = kotlin.text.m.n(r14)
            if (r14 == 0) goto Le8
            int r11 = r14.intValue()
            android.content.Context r14 = r13.e()
            android.content.pm.PackageManager r1 = r14.getPackageManager()
            android.content.res.Resources r1 = r1.getResourcesForApplication(r10)
            java.lang.String r2 = "context.packageManager.g…rApplication(packageName)"
            kotlin.jvm.internal.s.f(r1, r2)
            android.util.TypedValue r2 = new android.util.TypedValue
            r2.<init>()
            r1.getValue(r11, r2, r0)
            java.lang.CharSequence r0 = r2.string
            java.lang.String r2 = "path"
            kotlin.jvm.internal.s.f(r0, r2)
            r4 = 47
            r5 = 0
            r6 = 0
            r7 = 6
            r8 = 0
            r3 = r0
            int r2 = kotlin.text.m.d0(r3, r4, r5, r6, r7, r8)
            int r3 = r0.length()
            java.lang.CharSequence r0 = r0.subSequence(r2, r3)
            java.lang.String r0 = r0.toString()
            android.webkit.MimeTypeMap r2 = android.webkit.MimeTypeMap.getSingleton()
            java.lang.String r3 = "MimeTypeMap.getSingleton()"
            kotlin.jvm.internal.s.f(r2, r3)
            java.lang.String r0 = g6.e.e(r2, r0)
            java.lang.String r2 = "text/xml"
            boolean r2 = kotlin.jvm.internal.s.c(r0, r2)
            if (r2 == 0) goto Lce
            java.lang.String r0 = r14.getPackageName()
            boolean r10 = kotlin.jvm.internal.s.c(r10, r0)
            if (r10 == 0) goto L9a
            android.graphics.drawable.Drawable r10 = g6.c.a(r14, r11)
            goto L9e
        L9a:
            android.graphics.drawable.Drawable r10 = g6.c.d(r14, r1, r11)
        L9e:
            r1 = r10
            boolean r10 = g6.e.k(r1)
            w5.e r11 = new w5.e
            if (r10 == 0) goto Lc8
            v5.g r0 = r9.f55629b
            android.graphics.Bitmap$Config r2 = r13.d()
            c6.f r4 = r13.i()
            boolean r5 = r13.a()
            r3 = r12
            android.graphics.Bitmap r12 = r0.a(r1, r2, r3, r4, r5)
            android.content.res.Resources r13 = r14.getResources()
            java.lang.String r14 = "context.resources"
            kotlin.jvm.internal.s.f(r13, r14)
            android.graphics.drawable.BitmapDrawable r1 = new android.graphics.drawable.BitmapDrawable
            r1.<init>(r13, r12)
        Lc8:
            v5.b r12 = v5.b.MEMORY
            r11.<init>(r1, r10, r12)
            goto Le7
        Lce:
            w5.m r10 = new w5.m
            java.io.InputStream r11 = r1.openRawResource(r11)
            java.lang.String r12 = "resources.openRawResource(resId)"
            kotlin.jvm.internal.s.f(r11, r12)
            okio.e0 r11 = okio.r.k(r11)
            okio.h r11 = okio.r.d(r11)
            v5.b r12 = v5.b.MEMORY
            r10.<init>(r11, r0, r12)
            r11 = r10
        Le7:
            return r11
        Le8:
            r9.g(r11)
            kotlin.KotlinNothingValueException r10 = new kotlin.KotlinNothingValueException
            r10.<init>()
            throw r10
        Lf1:
            r9.g(r11)
            kotlin.KotlinNothingValueException r10 = new kotlin.KotlinNothingValueException
            r10.<init>()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: w5.l.c(t5.b, android.net.Uri, c6.g, v5.j, zz.d):java.lang.Object");
    }

    @Override // w5.g
    /* renamed from: e */
    public boolean a(Uri data) {
        s.g(data, "data");
        return s.c(data.getScheme(), "android.resource");
    }

    @Override // w5.g
    /* renamed from: f */
    public String b(Uri data) {
        s.g(data, "data");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(data);
        sb2.append(CoreConstants.DASH_CHAR);
        Resources resources = this.f55628a.getResources();
        s.f(resources, "context.resources");
        Configuration configuration = resources.getConfiguration();
        s.f(configuration, "context.resources.configuration");
        sb2.append(g6.e.f(configuration));
        return sb2.toString();
    }
}