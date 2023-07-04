package nx;

import okhttp3.internal.http2.Header;

/* loaded from: classes5.dex */
public final class d {

    /* renamed from: d  reason: collision with root package name */
    public static final okio.i f41931d = okio.i.f(Header.RESPONSE_STATUS_UTF8);

    /* renamed from: e  reason: collision with root package name */
    public static final okio.i f41932e = okio.i.f(Header.TARGET_METHOD_UTF8);

    /* renamed from: f  reason: collision with root package name */
    public static final okio.i f41933f = okio.i.f(Header.TARGET_PATH_UTF8);

    /* renamed from: g  reason: collision with root package name */
    public static final okio.i f41934g = okio.i.f(Header.TARGET_SCHEME_UTF8);

    /* renamed from: h  reason: collision with root package name */
    public static final okio.i f41935h = okio.i.f(Header.TARGET_AUTHORITY_UTF8);

    /* renamed from: a  reason: collision with root package name */
    public final okio.i f41936a;

    /* renamed from: b  reason: collision with root package name */
    public final okio.i f41937b;

    /* renamed from: c  reason: collision with root package name */
    final int f41938c;

    static {
        okio.i.f(":host");
        okio.i.f(":version");
    }

    public d(String str, String str2) {
        this(okio.i.f(str), okio.i.f(str2));
    }

    public boolean equals(Object obj) {
        if (obj instanceof d) {
            d dVar = (d) obj;
            return this.f41936a.equals(dVar.f41936a) && this.f41937b.equals(dVar.f41937b);
        }
        return false;
    }

    public int hashCode() {
        return ((527 + this.f41936a.hashCode()) * 31) + this.f41937b.hashCode();
    }

    public String toString() {
        return String.format("%s: %s", this.f41936a.F(), this.f41937b.F());
    }

    public d(okio.i iVar, String str) {
        this(iVar, okio.i.f(str));
    }

    public d(okio.i iVar, okio.i iVar2) {
        this.f41936a = iVar;
        this.f41937b = iVar2;
        this.f41938c = iVar.z() + 32 + iVar2.z();
    }
}