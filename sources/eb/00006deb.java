package f80;

import org.spongycastle.crypto.tls.CipherSuite;

/* loaded from: classes5.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private int f26120a;

    /* renamed from: b  reason: collision with root package name */
    private int f26121b;

    /* renamed from: c  reason: collision with root package name */
    private int f26122c;

    /* renamed from: d  reason: collision with root package name */
    private int f26123d;

    public a(int i11, int i12) {
        this(i11, i12, 0);
    }

    public int a() {
        return this.f26122c;
    }

    public int b() {
        if (e()) {
            return this.f26120a;
        }
        return this.f26121b;
    }

    public int c() {
        return this.f26123d;
    }

    public int d() {
        if (e()) {
            return this.f26121b;
        }
        return this.f26120a;
    }

    public boolean e() {
        return this.f26123d % CipherSuite.TLS_DHE_PSK_WITH_NULL_SHA256 == 90;
    }

    public boolean equals(Object obj) {
        if (obj instanceof a) {
            a aVar = (a) obj;
            return aVar.d() == d() && aVar.b() == b() && aVar.a() == a() && aVar.c() == c();
        }
        return super.equals(obj);
    }

    public a(int i11, int i12, int i13) {
        this(i11, i12, i13, -1);
    }

    public a(int i11, int i12, int i13, int i14) {
        this.f26120a = i11;
        this.f26121b = i12;
        this.f26122c = i14;
        this.f26123d = i13;
    }
}