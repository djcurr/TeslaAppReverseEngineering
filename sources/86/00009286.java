package org.bouncycastle.jcajce.provider.asymmetric.rsa;

import e50.b;
import i60.d;
import java.io.IOException;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidParameterSpecException;
import java.security.spec.MGF1ParameterSpec;
import java.security.spec.PSSParameterSpec;
import java.util.Objects;
import javax.crypto.spec.OAEPParameterSpec;
import javax.crypto.spec.PSource;
import org.bouncycastle.asn1.i;
import org.bouncycastle.asn1.k;
import org.bouncycastle.asn1.l;
import org.bouncycastle.asn1.q0;
import org.bouncycastle.asn1.s0;
import org.bouncycastle.jcajce.provider.util.DigestFactory;
import org.spongycastle.asn1.ASN1Encoding;
import w40.n;
import w40.r;
import w40.u;

/* loaded from: classes5.dex */
public abstract class AlgorithmParametersSpi extends java.security.AlgorithmParametersSpi {

    /* loaded from: classes5.dex */
    public static class OAEP extends AlgorithmParametersSpi {
        OAEPParameterSpec currentSpec;

        @Override // java.security.AlgorithmParametersSpi
        protected byte[] engineGetEncoded() {
            k oid = DigestFactory.getOID(this.currentSpec.getDigestAlgorithm());
            q0 q0Var = q0.f43085a;
            try {
                return new r(new b(oid, q0Var), new b(n.f55553u1, new b(DigestFactory.getOID(((MGF1ParameterSpec) this.currentSpec.getMGFParameters()).getDigestAlgorithm()), q0Var)), new b(n.f55555v1, new s0(((PSource.PSpecified) this.currentSpec.getPSource()).getValue()))).d(ASN1Encoding.DER);
            } catch (IOException unused) {
                throw new RuntimeException("Error encoding OAEPParameters");
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
        protected void engineInit(AlgorithmParameterSpec algorithmParameterSpec) {
            if (!(algorithmParameterSpec instanceof OAEPParameterSpec)) {
                throw new InvalidParameterSpecException("OAEPParameterSpec required to initialise an OAEP algorithm parameters object");
            }
            this.currentSpec = (OAEPParameterSpec) algorithmParameterSpec;
        }

        @Override // java.security.AlgorithmParametersSpi
        protected void engineInit(byte[] bArr) {
            try {
                r f11 = r.f(bArr);
                if (f11.h().e().j(n.f55553u1)) {
                    this.currentSpec = new OAEPParameterSpec(d.a(f11.e().e()), OAEPParameterSpec.DEFAULT.getMGFAlgorithm(), new MGF1ParameterSpec(d.a(b.f(f11.h().i()).e())), new PSource.PSpecified(l.p(f11.i().i()).r()));
                    return;
                }
                throw new IOException("unknown mask generation function: " + f11.h().e());
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw new IOException("Not a valid OAEP Parameter encoding.");
            } catch (ClassCastException unused2) {
                throw new IOException("Not a valid OAEP Parameter encoding.");
            }
        }

        @Override // java.security.AlgorithmParametersSpi
        protected void engineInit(byte[] bArr, String str) {
            if (str.equalsIgnoreCase("X.509") || str.equalsIgnoreCase("ASN.1")) {
                engineInit(bArr);
                return;
            }
            throw new IOException("Unknown parameter format " + str);
        }

        @Override // java.security.AlgorithmParametersSpi
        protected String engineToString() {
            return "OAEP Parameters";
        }

        @Override // org.bouncycastle.jcajce.provider.asymmetric.rsa.AlgorithmParametersSpi
        protected AlgorithmParameterSpec localEngineGetParameterSpec(Class cls) {
            if (cls == OAEPParameterSpec.class || cls == AlgorithmParameterSpec.class) {
                return this.currentSpec;
            }
            throw new InvalidParameterSpecException("unknown parameter spec passed to OAEP parameters object.");
        }
    }

    /* loaded from: classes5.dex */
    public static class PSS extends AlgorithmParametersSpi {
        PSSParameterSpec currentSpec;

        @Override // java.security.AlgorithmParametersSpi
        protected byte[] engineGetEncoded() {
            PSSParameterSpec pSSParameterSpec = this.currentSpec;
            k oid = DigestFactory.getOID(pSSParameterSpec.getDigestAlgorithm());
            q0 q0Var = q0.f43085a;
            b bVar = new b(oid, q0Var);
            MGF1ParameterSpec mGF1ParameterSpec = (MGF1ParameterSpec) pSSParameterSpec.getMGFParameters();
            if (mGF1ParameterSpec != null) {
                return new u(bVar, new b(n.f55553u1, new b(DigestFactory.getOID(mGF1ParameterSpec.getDigestAlgorithm()), q0Var)), new i(pSSParameterSpec.getSaltLength()), new i(pSSParameterSpec.getTrailerField())).d(ASN1Encoding.DER);
            }
            return new u(bVar, new b(pSSParameterSpec.getMGFAlgorithm().equals("SHAKE128") ? r40.b.f49157m : r40.b.f49158n), new i(pSSParameterSpec.getSaltLength()), new i(pSSParameterSpec.getTrailerField())).d(ASN1Encoding.DER);
        }

        @Override // java.security.AlgorithmParametersSpi
        protected byte[] engineGetEncoded(String str) {
            if (str.equalsIgnoreCase("X.509") || str.equalsIgnoreCase("ASN.1")) {
                return engineGetEncoded();
            }
            return null;
        }

        @Override // java.security.AlgorithmParametersSpi
        protected void engineInit(AlgorithmParameterSpec algorithmParameterSpec) {
            if (!(algorithmParameterSpec instanceof PSSParameterSpec)) {
                throw new InvalidParameterSpecException("PSSParameterSpec required to initialise an PSS algorithm parameters object");
            }
            this.currentSpec = (PSSParameterSpec) algorithmParameterSpec;
        }

        @Override // java.security.AlgorithmParametersSpi
        protected void engineInit(byte[] bArr) {
            try {
                u f11 = u.f(bArr);
                k e11 = f11.h().e();
                if (e11.j(n.f55553u1)) {
                    this.currentSpec = new PSSParameterSpec(d.a(f11.e().e()), PSSParameterSpec.DEFAULT.getMGFAlgorithm(), new MGF1ParameterSpec(d.a(b.f(f11.h().i()).e())), f11.i().intValue(), f11.j().intValue());
                    return;
                }
                k kVar = r40.b.f49157m;
                if (!e11.j(kVar) && !e11.j(r40.b.f49158n)) {
                    throw new IOException("unknown mask generation function: " + f11.h().e());
                }
                this.currentSpec = new PSSParameterSpec(d.a(f11.e().e()), e11.j(kVar) ? "SHAKE128" : "SHAKE256", null, f11.i().intValue(), f11.j().intValue());
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw new IOException("Not a valid PSS Parameter encoding.");
            } catch (ClassCastException unused2) {
                throw new IOException("Not a valid PSS Parameter encoding.");
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
            return "PSS Parameters";
        }

        @Override // org.bouncycastle.jcajce.provider.asymmetric.rsa.AlgorithmParametersSpi
        protected AlgorithmParameterSpec localEngineGetParameterSpec(Class cls) {
            if (cls == PSSParameterSpec.class || cls == AlgorithmParameterSpec.class) {
                return this.currentSpec;
            }
            throw new InvalidParameterSpecException("unknown parameter spec passed to PSS parameters object.");
        }
    }

    @Override // java.security.AlgorithmParametersSpi
    protected AlgorithmParameterSpec engineGetParameterSpec(Class cls) {
        Objects.requireNonNull(cls, "argument to getParameterSpec must not be null");
        return localEngineGetParameterSpec(cls);
    }

    protected boolean isASN1FormatString(String str) {
        return str == null || str.equals("ASN.1");
    }

    protected abstract AlgorithmParameterSpec localEngineGetParameterSpec(Class cls);
}