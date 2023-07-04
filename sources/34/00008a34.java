package na;

import android.net.Uri;
import android.text.TextUtils;
import java.net.URL;
import java.security.MessageDigest;
import java.util.Map;

/* loaded from: classes.dex */
public class g implements ha.b {

    /* renamed from: b  reason: collision with root package name */
    private final h f40707b;

    /* renamed from: c  reason: collision with root package name */
    private final URL f40708c;

    /* renamed from: d  reason: collision with root package name */
    private final String f40709d;

    /* renamed from: e  reason: collision with root package name */
    private String f40710e;

    /* renamed from: f  reason: collision with root package name */
    private URL f40711f;

    /* renamed from: g  reason: collision with root package name */
    private volatile byte[] f40712g;

    /* renamed from: h  reason: collision with root package name */
    private int f40713h;

    public g(URL url) {
        this(url, h.f40714a);
    }

    private byte[] d() {
        if (this.f40712g == null) {
            this.f40712g = c().getBytes(ha.b.f29009a);
        }
        return this.f40712g;
    }

    private String f() {
        if (TextUtils.isEmpty(this.f40710e)) {
            String str = this.f40709d;
            if (TextUtils.isEmpty(str)) {
                str = ((URL) bb.j.d(this.f40708c)).toString();
            }
            this.f40710e = Uri.encode(str, "@#&=*+-_.,:!?()/~'%;$");
        }
        return this.f40710e;
    }

    private URL g() {
        if (this.f40711f == null) {
            this.f40711f = new URL(f());
        }
        return this.f40711f;
    }

    @Override // ha.b
    public void b(MessageDigest messageDigest) {
        messageDigest.update(d());
    }

    public String c() {
        String str = this.f40709d;
        return str != null ? str : ((URL) bb.j.d(this.f40708c)).toString();
    }

    public Map<String, String> e() {
        return this.f40707b.a();
    }

    @Override // ha.b
    public boolean equals(Object obj) {
        if (obj instanceof g) {
            g gVar = (g) obj;
            return c().equals(gVar.c()) && this.f40707b.equals(gVar.f40707b);
        }
        return false;
    }

    public String h() {
        return f();
    }

    @Override // ha.b
    public int hashCode() {
        if (this.f40713h == 0) {
            int hashCode = c().hashCode();
            this.f40713h = hashCode;
            this.f40713h = (hashCode * 31) + this.f40707b.hashCode();
        }
        return this.f40713h;
    }

    public URL i() {
        return g();
    }

    public String toString() {
        return c();
    }

    public g(String str) {
        this(str, h.f40714a);
    }

    public g(URL url, h hVar) {
        this.f40708c = (URL) bb.j.d(url);
        this.f40709d = null;
        this.f40707b = (h) bb.j.d(hVar);
    }

    public g(String str, h hVar) {
        this.f40708c = null;
        this.f40709d = bb.j.b(str);
        this.f40707b = (h) bb.j.d(hVar);
    }
}