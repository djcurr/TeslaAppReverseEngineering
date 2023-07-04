package com.squareup.picasso;

import android.graphics.Bitmap;
import android.net.Uri;
import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.squareup.picasso.t;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class w {

    /* renamed from: u */
    private static final long f20775u = TimeUnit.SECONDS.toNanos(5);

    /* renamed from: a */
    int f20776a;

    /* renamed from: b */
    long f20777b;

    /* renamed from: c */
    int f20778c;

    /* renamed from: d */
    public final Uri f20779d;

    /* renamed from: e */
    public final int f20780e;

    /* renamed from: f */
    public final String f20781f;

    /* renamed from: g */
    public final List<c0> f20782g;

    /* renamed from: h */
    public final int f20783h;

    /* renamed from: i */
    public final int f20784i;

    /* renamed from: j */
    public final boolean f20785j;

    /* renamed from: k */
    public final int f20786k;

    /* renamed from: l */
    public final boolean f20787l;

    /* renamed from: m */
    public final boolean f20788m;

    /* renamed from: n */
    public final float f20789n;

    /* renamed from: o */
    public final float f20790o;

    /* renamed from: p */
    public final float f20791p;

    /* renamed from: q */
    public final boolean f20792q;

    /* renamed from: r */
    public final boolean f20793r;

    /* renamed from: s */
    public final Bitmap.Config f20794s;

    /* renamed from: t */
    public final t.f f20795t;

    /* loaded from: classes2.dex */
    public static final class b {

        /* renamed from: a */
        private Uri f20796a;

        /* renamed from: b */
        private int f20797b;

        /* renamed from: c */
        private String f20798c;

        /* renamed from: d */
        private int f20799d;

        /* renamed from: e */
        private int f20800e;

        /* renamed from: f */
        private boolean f20801f;

        /* renamed from: g */
        private int f20802g;

        /* renamed from: h */
        private boolean f20803h;

        /* renamed from: i */
        private boolean f20804i;

        /* renamed from: j */
        private float f20805j;

        /* renamed from: k */
        private float f20806k;

        /* renamed from: l */
        private float f20807l;

        /* renamed from: m */
        private boolean f20808m;

        /* renamed from: n */
        private boolean f20809n;

        /* renamed from: o */
        private List<c0> f20810o;

        /* renamed from: p */
        private Bitmap.Config f20811p;

        /* renamed from: q */
        private t.f f20812q;

        public b(Uri uri, int i11, Bitmap.Config config) {
            this.f20796a = uri;
            this.f20797b = i11;
            this.f20811p = config;
        }

        public w a() {
            boolean z11 = this.f20803h;
            if (z11 && this.f20801f) {
                throw new IllegalStateException("Center crop and center inside can not be used together.");
            }
            if (this.f20801f && this.f20799d == 0 && this.f20800e == 0) {
                throw new IllegalStateException("Center crop requires calling resize with positive width and height.");
            }
            if (z11 && this.f20799d == 0 && this.f20800e == 0) {
                throw new IllegalStateException("Center inside requires calling resize with positive width and height.");
            }
            if (this.f20812q == null) {
                this.f20812q = t.f.NORMAL;
            }
            return new w(this.f20796a, this.f20797b, this.f20798c, this.f20810o, this.f20799d, this.f20800e, this.f20801f, this.f20803h, this.f20802g, this.f20804i, this.f20805j, this.f20806k, this.f20807l, this.f20808m, this.f20809n, this.f20811p, this.f20812q);
        }

        public b b(int i11) {
            if (!this.f20803h) {
                this.f20801f = true;
                this.f20802g = i11;
                return this;
            }
            throw new IllegalStateException("Center crop can not be used after calling centerInside");
        }

        public boolean c() {
            return (this.f20796a == null && this.f20797b == 0) ? false : true;
        }

        public boolean d() {
            return (this.f20799d == 0 && this.f20800e == 0) ? false : true;
        }

        public b e() {
            if (this.f20800e == 0 && this.f20799d == 0) {
                throw new IllegalStateException("onlyScaleDown can not be applied without resize");
            }
            this.f20804i = true;
            return this;
        }

        public b f(int i11, int i12) {
            if (i11 >= 0) {
                if (i12 >= 0) {
                    if (i12 == 0 && i11 == 0) {
                        throw new IllegalArgumentException("At least one dimension has to be positive number.");
                    }
                    this.f20799d = i11;
                    this.f20800e = i12;
                    return this;
                }
                throw new IllegalArgumentException("Height must be positive number or 0.");
            }
            throw new IllegalArgumentException("Width must be positive number or 0.");
        }
    }

    public String a() {
        Uri uri = this.f20779d;
        if (uri != null) {
            return String.valueOf(uri.getPath());
        }
        return Integer.toHexString(this.f20780e);
    }

    public boolean b() {
        return this.f20782g != null;
    }

    public boolean c() {
        return (this.f20783h == 0 && this.f20784i == 0) ? false : true;
    }

    public String d() {
        long nanoTime = System.nanoTime() - this.f20777b;
        if (nanoTime > f20775u) {
            return g() + '+' + TimeUnit.NANOSECONDS.toSeconds(nanoTime) + 's';
        }
        return g() + '+' + TimeUnit.NANOSECONDS.toMillis(nanoTime) + "ms";
    }

    public boolean e() {
        return c() || this.f20789n != BitmapDescriptorFactory.HUE_RED;
    }

    public boolean f() {
        return e() || b();
    }

    public String g() {
        return "[R" + this.f20776a + ']';
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("Request{");
        int i11 = this.f20780e;
        if (i11 > 0) {
            sb2.append(i11);
        } else {
            sb2.append(this.f20779d);
        }
        List<c0> list = this.f20782g;
        if (list != null && !list.isEmpty()) {
            for (c0 c0Var : this.f20782g) {
                sb2.append(' ');
                sb2.append(c0Var.key());
            }
        }
        if (this.f20781f != null) {
            sb2.append(" stableKey(");
            sb2.append(this.f20781f);
            sb2.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        }
        if (this.f20783h > 0) {
            sb2.append(" resize(");
            sb2.append(this.f20783h);
            sb2.append(CoreConstants.COMMA_CHAR);
            sb2.append(this.f20784i);
            sb2.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        }
        if (this.f20785j) {
            sb2.append(" centerCrop");
        }
        if (this.f20787l) {
            sb2.append(" centerInside");
        }
        if (this.f20789n != BitmapDescriptorFactory.HUE_RED) {
            sb2.append(" rotation(");
            sb2.append(this.f20789n);
            if (this.f20792q) {
                sb2.append(" @ ");
                sb2.append(this.f20790o);
                sb2.append(CoreConstants.COMMA_CHAR);
                sb2.append(this.f20791p);
            }
            sb2.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        }
        if (this.f20793r) {
            sb2.append(" purgeable");
        }
        if (this.f20794s != null) {
            sb2.append(' ');
            sb2.append(this.f20794s);
        }
        sb2.append(CoreConstants.CURLY_RIGHT);
        return sb2.toString();
    }

    private w(Uri uri, int i11, String str, List<c0> list, int i12, int i13, boolean z11, boolean z12, int i14, boolean z13, float f11, float f12, float f13, boolean z14, boolean z15, Bitmap.Config config, t.f fVar) {
        this.f20779d = uri;
        this.f20780e = i11;
        this.f20781f = str;
        if (list == null) {
            this.f20782g = null;
        } else {
            this.f20782g = Collections.unmodifiableList(list);
        }
        this.f20783h = i12;
        this.f20784i = i13;
        this.f20785j = z11;
        this.f20787l = z12;
        this.f20786k = i14;
        this.f20788m = z13;
        this.f20789n = f11;
        this.f20790o = f12;
        this.f20791p = f13;
        this.f20792q = z14;
        this.f20793r = z15;
        this.f20794s = config;
        this.f20795t = fVar;
    }
}