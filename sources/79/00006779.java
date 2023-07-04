package e60;

import java.security.PublicKey;
import java.security.cert.CertPath;
import java.security.cert.X509Certificate;
import java.util.Date;

/* loaded from: classes5.dex */
public class o {

    /* renamed from: a  reason: collision with root package name */
    private final s f24892a;

    /* renamed from: b  reason: collision with root package name */
    private final Date f24893b;

    /* renamed from: c  reason: collision with root package name */
    private final CertPath f24894c;

    /* renamed from: d  reason: collision with root package name */
    private final int f24895d;

    /* renamed from: e  reason: collision with root package name */
    private final X509Certificate f24896e;

    /* renamed from: f  reason: collision with root package name */
    private final PublicKey f24897f;

    public o(s sVar, Date date, CertPath certPath, int i11, X509Certificate x509Certificate, PublicKey publicKey) {
        this.f24892a = sVar;
        this.f24893b = date;
        this.f24894c = certPath;
        this.f24895d = i11;
        this.f24896e = x509Certificate;
        this.f24897f = publicKey;
    }

    public CertPath a() {
        return this.f24894c;
    }

    public int b() {
        return this.f24895d;
    }

    public s c() {
        return this.f24892a;
    }

    public X509Certificate d() {
        return this.f24896e;
    }

    public Date e() {
        return new Date(this.f24893b.getTime());
    }

    public PublicKey f() {
        return this.f24897f;
    }
}