package org.bouncycastle.jcajce.provider.asymmetric.ies;

import java.io.IOException;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidParameterSpecException;
import java.util.Objects;
import l60.p;
import org.bouncycastle.asn1.d;
import org.bouncycastle.asn1.i;
import org.bouncycastle.asn1.l;
import org.bouncycastle.asn1.n;
import org.bouncycastle.asn1.s;
import org.bouncycastle.asn1.s0;
import org.bouncycastle.asn1.w0;
import org.bouncycastle.asn1.z0;
import org.spongycastle.asn1.ASN1Encoding;

/* loaded from: classes5.dex */
public class AlgorithmParametersSpi extends java.security.AlgorithmParametersSpi {
    p currentSpec;

    @Override // java.security.AlgorithmParametersSpi
    protected byte[] engineGetEncoded() {
        try {
            d dVar = new d();
            if (this.currentSpec.b() != null) {
                dVar.a(new z0(false, 0, new s0(this.currentSpec.b())));
            }
            if (this.currentSpec.c() != null) {
                dVar.a(new z0(false, 1, new s0(this.currentSpec.c())));
            }
            dVar.a(new i(this.currentSpec.d()));
            if (this.currentSpec.e() != null) {
                d dVar2 = new d();
                dVar2.a(new i(this.currentSpec.a()));
                dVar2.a(new i(this.currentSpec.e()));
                dVar.a(new w0(dVar2));
            }
            return new w0(dVar).d(ASN1Encoding.DER);
        } catch (IOException unused) {
            throw new RuntimeException("Error encoding IESParameters");
        }
    }

    @Override // java.security.AlgorithmParametersSpi
    protected byte[] engineGetEncoded(String str) {
        if (isASN1FormatString(str) || str.equalsIgnoreCase("X.509")) {
            return engineGetEncoded();
        }
        return null;
    }

    @Override // java.security.AlgorithmParametersSpi
    protected AlgorithmParameterSpec engineGetParameterSpec(Class cls) {
        Objects.requireNonNull(cls, "argument to getParameterSpec must not be null");
        return localEngineGetParameterSpec(cls);
    }

    @Override // java.security.AlgorithmParametersSpi
    protected void engineInit(AlgorithmParameterSpec algorithmParameterSpec) {
        if (!(algorithmParameterSpec instanceof p)) {
            throw new InvalidParameterSpecException("IESParameterSpec required to initialise a IES algorithm parameters object");
        }
        this.currentSpec = (p) algorithmParameterSpec;
    }

    @Override // java.security.AlgorithmParametersSpi
    protected void engineInit(byte[] bArr) {
        try {
            org.bouncycastle.asn1.p pVar = (org.bouncycastle.asn1.p) n.k(bArr);
            if (pVar.size() == 1) {
                this.currentSpec = new p(null, null, i.p(pVar.r(0)).x());
            } else if (pVar.size() == 2) {
                s p11 = s.p(pVar.r(0));
                this.currentSpec = p11.s() == 0 ? new p(l.q(p11, false).r(), null, i.p(pVar.r(1)).x()) : new p(null, l.q(p11, false).r(), i.p(pVar.r(1)).x());
            } else if (pVar.size() == 3) {
                this.currentSpec = new p(l.q(s.p(pVar.r(0)), false).r(), l.q(s.p(pVar.r(1)), false).r(), i.p(pVar.r(2)).x());
            } else if (pVar.size() == 4) {
                s p12 = s.p(pVar.r(0));
                s p13 = s.p(pVar.r(1));
                org.bouncycastle.asn1.p p14 = org.bouncycastle.asn1.p.p(pVar.r(3));
                this.currentSpec = new p(l.q(p12, false).r(), l.q(p13, false).r(), i.p(pVar.r(2)).x(), i.p(p14.r(0)).x(), l.p(p14.r(1)).r());
            }
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new IOException("Not a valid IES Parameter encoding.");
        } catch (ClassCastException unused2) {
            throw new IOException("Not a valid IES Parameter encoding.");
        }
    }

    @Override // java.security.AlgorithmParametersSpi
    protected void engineInit(byte[] bArr, String str) {
        if (isASN1FormatString(str) || str.equalsIgnoreCase("X.509")) {
            engineInit(bArr);
            return;
        }
        throw new IOException("Unknown parameter format " + str);
    }

    @Override // java.security.AlgorithmParametersSpi
    protected String engineToString() {
        return "IES Parameters";
    }

    protected boolean isASN1FormatString(String str) {
        return str == null || str.equals("ASN.1");
    }

    protected AlgorithmParameterSpec localEngineGetParameterSpec(Class cls) {
        if (cls == p.class || cls == AlgorithmParameterSpec.class) {
            return this.currentSpec;
        }
        throw new InvalidParameterSpecException("unknown parameter spec passed to ElGamal parameters object.");
    }
}