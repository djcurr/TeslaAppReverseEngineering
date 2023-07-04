package e60;

import java.security.Key;
import java.security.cert.X509Certificate;

/* loaded from: classes5.dex */
public class a extends e60.c {

    /* renamed from: d  reason: collision with root package name */
    private final z50.e f24854d;

    /* renamed from: e  reason: collision with root package name */
    private final b f24855e;

    /* renamed from: f  reason: collision with root package name */
    private final c f24856f;

    /* renamed from: g  reason: collision with root package name */
    private final d f24857g;

    /* renamed from: h  reason: collision with root package name */
    private final Key f24858h;

    /* renamed from: i  reason: collision with root package name */
    private final X509Certificate[] f24859i;

    /* renamed from: j  reason: collision with root package name */
    private final InterfaceC0480a f24860j;

    /* renamed from: e60.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public interface InterfaceC0480a {
        boolean a(X509Certificate[] x509CertificateArr);
    }

    /* loaded from: classes5.dex */
    public enum b {
        AES256_CCM,
        AES256_KWP
    }

    /* loaded from: classes5.dex */
    public enum c {
        HmacSHA512,
        HmacSHA3_512
    }

    /* loaded from: classes5.dex */
    public enum d {
        SHA512withDSA,
        SHA3_512withDSA,
        SHA512withECDSA,
        SHA3_512withECDSA,
        SHA512withRSA,
        SHA3_512withRSA
    }

    public InterfaceC0480a c() {
        return this.f24860j;
    }

    public X509Certificate[] d() {
        return this.f24859i;
    }

    public b e() {
        return this.f24855e;
    }

    public c f() {
        return this.f24856f;
    }

    public z50.e g() {
        return this.f24854d;
    }

    public d h() {
        return this.f24857g;
    }

    public Key i() {
        return this.f24858h;
    }
}