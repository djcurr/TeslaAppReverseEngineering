package com.nimbusds.jose;

import ch.qos.logback.core.CoreConstants;
import java.text.ParseException;
import zp.f;
import zp.i;
import zp.j;
import zp.k;
import zp.l;

/* loaded from: classes2.dex */
public class a extends f {

    /* renamed from: c  reason: collision with root package name */
    private l f17920c;

    /* renamed from: d  reason: collision with root package name */
    private nq.c f17921d;

    /* renamed from: e  reason: collision with root package name */
    private nq.c f17922e;

    /* renamed from: f  reason: collision with root package name */
    private nq.c f17923f;

    /* renamed from: g  reason: collision with root package name */
    private nq.c f17924g;

    /* renamed from: h  reason: collision with root package name */
    private EnumC0322a f17925h;

    /* renamed from: com.nimbusds.jose.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public enum EnumC0322a {
        UNENCRYPTED,
        ENCRYPTED,
        DECRYPTED
    }

    public a(l lVar, c cVar) {
        if (lVar != null) {
            this.f17920c = lVar;
            if (cVar != null) {
                d(cVar);
                this.f17921d = null;
                this.f17923f = null;
                this.f17925h = EnumC0322a.UNENCRYPTED;
                return;
            }
            throw new IllegalArgumentException("The payload must not be null");
        }
        throw new IllegalArgumentException("The JWE header must not be null");
    }

    private void h() {
        EnumC0322a enumC0322a = this.f17925h;
        if (enumC0322a != EnumC0322a.ENCRYPTED && enumC0322a != EnumC0322a.DECRYPTED) {
            throw new IllegalStateException("The JWE object must be in an encrypted or decrypted state");
        }
    }

    private void i() {
        if (this.f17925h != EnumC0322a.ENCRYPTED) {
            throw new IllegalStateException("The JWE object must be in an encrypted state");
        }
    }

    private void j(k kVar) {
        if (kVar.supportedJWEAlgorithms().contains(o().r())) {
            if (kVar.supportedEncryptionMethods().contains(o().t())) {
                return;
            }
            throw new JOSEException("The " + o().t() + " encryption method or key size is not supported by the JWE encrypter: Supported methods: " + kVar.supportedEncryptionMethods());
        }
        throw new JOSEException("The " + o().r() + " algorithm is not supported by the JWE encrypter: Supported algorithms: " + kVar.supportedJWEAlgorithms());
    }

    private void k() {
        if (this.f17925h != EnumC0322a.UNENCRYPTED) {
            throw new IllegalStateException("The JWE object must be in an unencrypted state");
        }
    }

    public static a q(String str) {
        nq.c[] e11 = f.e(str);
        if (e11.length == 5) {
            return new a(e11[0], e11[1], e11[2], e11[3], e11[4]);
        }
        throw new ParseException("Unexpected number of Base64URL parts, must be five", 0);
    }

    public synchronized void f(j jVar) {
        i();
        try {
            d(new c(jVar.b(o(), n(), p(), m(), l())));
            this.f17925h = EnumC0322a.DECRYPTED;
        } catch (JOSEException e11) {
            throw e11;
        } catch (Exception e12) {
            throw new JOSEException(e12.getMessage(), e12);
        }
    }

    public synchronized void g(k kVar) {
        k();
        j(kVar);
        try {
            i encrypt = kVar.encrypt(o(), b().d());
            if (encrypt.d() != null) {
                this.f17920c = encrypt.d();
            }
            this.f17921d = encrypt.c();
            this.f17922e = encrypt.e();
            this.f17923f = encrypt.b();
            this.f17924g = encrypt.a();
            this.f17925h = EnumC0322a.ENCRYPTED;
        } catch (JOSEException e11) {
            throw e11;
        } catch (Exception e12) {
            throw new JOSEException(e12.getMessage(), e12);
        }
    }

    public nq.c l() {
        return this.f17924g;
    }

    public nq.c m() {
        return this.f17923f;
    }

    public nq.c n() {
        return this.f17921d;
    }

    public l o() {
        return this.f17920c;
    }

    public nq.c p() {
        return this.f17922e;
    }

    public String r() {
        h();
        StringBuilder sb2 = new StringBuilder(this.f17920c.h().toString());
        sb2.append(CoreConstants.DOT);
        nq.c cVar = this.f17921d;
        if (cVar != null) {
            sb2.append(cVar);
        }
        sb2.append(CoreConstants.DOT);
        nq.c cVar2 = this.f17922e;
        if (cVar2 != null) {
            sb2.append(cVar2);
        }
        sb2.append(CoreConstants.DOT);
        sb2.append(this.f17923f);
        sb2.append(CoreConstants.DOT);
        nq.c cVar3 = this.f17924g;
        if (cVar3 != null) {
            sb2.append(cVar3);
        }
        return sb2.toString();
    }

    public a(nq.c cVar, nq.c cVar2, nq.c cVar3, nq.c cVar4, nq.c cVar5) {
        if (cVar != null) {
            try {
                this.f17920c = l.x(cVar);
                if (cVar2 != null && !cVar2.toString().isEmpty()) {
                    this.f17921d = cVar2;
                } else {
                    this.f17921d = null;
                }
                if (cVar3 != null && !cVar3.toString().isEmpty()) {
                    this.f17922e = cVar3;
                } else {
                    this.f17922e = null;
                }
                if (cVar4 != null) {
                    this.f17923f = cVar4;
                    if (cVar5 != null && !cVar5.toString().isEmpty()) {
                        this.f17924g = cVar5;
                    } else {
                        this.f17924g = null;
                    }
                    this.f17925h = EnumC0322a.ENCRYPTED;
                    c(cVar, cVar2, cVar3, cVar4, cVar5);
                    return;
                }
                throw new IllegalArgumentException("The fourth part must not be null");
            } catch (ParseException e11) {
                throw new ParseException("Invalid JWE header: " + e11.getMessage(), 0);
            }
        }
        throw new IllegalArgumentException("The first part must not be null");
    }
}