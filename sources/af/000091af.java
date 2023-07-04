package org.bouncycastle.jcajce.provider.asymmetric.ec;

import f50.g;
import f50.i;
import f50.k;
import java.io.IOException;
import java.math.BigInteger;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.ECGenParameterSpec;
import java.security.spec.ECParameterSpec;
import java.security.spec.InvalidParameterSpecException;
import l60.d;
import l60.e;
import org.bouncycastle.asn1.j;
import org.bouncycastle.asn1.q0;
import org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util;
import org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil;
import org.bouncycastle.jce.provider.BouncyCastleProvider;

/* loaded from: classes5.dex */
public class AlgorithmParametersSpi extends java.security.AlgorithmParametersSpi {
    private String curveName;
    private ECParameterSpec ecParameterSpec;

    @Override // java.security.AlgorithmParametersSpi
    protected byte[] engineGetEncoded() {
        return engineGetEncoded("ASN.1");
    }

    @Override // java.security.AlgorithmParametersSpi
    protected byte[] engineGetEncoded(String str) {
        g gVar;
        if (!isASN1FormatString(str)) {
            throw new IOException("Unknown parameters format in AlgorithmParameters object: " + str);
        }
        ECParameterSpec eCParameterSpec = this.ecParameterSpec;
        if (eCParameterSpec == null) {
            gVar = new g((j) q0.f43085a);
        } else {
            String str2 = this.curveName;
            if (str2 != null) {
                gVar = new g(ECUtil.getNamedCurveOid(str2));
            } else {
                e convertSpec = EC5Util.convertSpec(eCParameterSpec);
                gVar = new g(new i(convertSpec.a(), new k(convertSpec.b(), false), convertSpec.d(), convertSpec.c(), convertSpec.e()));
            }
        }
        return gVar.getEncoded();
    }

    @Override // java.security.AlgorithmParametersSpi
    protected <T extends AlgorithmParameterSpec> T engineGetParameterSpec(Class<T> cls) {
        if (ECParameterSpec.class.isAssignableFrom(cls) || cls == AlgorithmParameterSpec.class) {
            return this.ecParameterSpec;
        }
        if (ECGenParameterSpec.class.isAssignableFrom(cls)) {
            String str = this.curveName;
            if (str != null) {
                org.bouncycastle.asn1.k namedCurveOid = ECUtil.getNamedCurveOid(str);
                return namedCurveOid != null ? new ECGenParameterSpec(namedCurveOid.t()) : new ECGenParameterSpec(this.curveName);
            }
            org.bouncycastle.asn1.k namedCurveOid2 = ECUtil.getNamedCurveOid(EC5Util.convertSpec(this.ecParameterSpec));
            if (namedCurveOid2 != null) {
                return new ECGenParameterSpec(namedCurveOid2.t());
            }
        }
        throw new InvalidParameterSpecException("EC AlgorithmParameters cannot convert to " + cls.getName());
    }

    @Override // java.security.AlgorithmParametersSpi
    protected void engineInit(AlgorithmParameterSpec algorithmParameterSpec) {
        if (!(algorithmParameterSpec instanceof ECGenParameterSpec)) {
            if (algorithmParameterSpec instanceof ECParameterSpec) {
                this.curveName = algorithmParameterSpec instanceof d ? ((d) algorithmParameterSpec).c() : null;
                this.ecParameterSpec = (ECParameterSpec) algorithmParameterSpec;
                return;
            }
            throw new InvalidParameterSpecException("AlgorithmParameterSpec class not recognized: " + algorithmParameterSpec.getClass().getName());
        }
        ECGenParameterSpec eCGenParameterSpec = (ECGenParameterSpec) algorithmParameterSpec;
        i domainParametersFromGenSpec = ECUtils.getDomainParametersFromGenSpec(eCGenParameterSpec, BouncyCastleProvider.CONFIGURATION);
        if (domainParametersFromGenSpec != null) {
            this.curveName = eCGenParameterSpec.getName();
            ECParameterSpec convertToSpec = EC5Util.convertToSpec(domainParametersFromGenSpec);
            this.ecParameterSpec = new d(this.curveName, convertToSpec.getCurve(), convertToSpec.getGenerator(), convertToSpec.getOrder(), BigInteger.valueOf(convertToSpec.getCofactor()));
            return;
        }
        throw new InvalidParameterSpecException("EC curve name not recognized: " + eCGenParameterSpec.getName());
    }

    @Override // java.security.AlgorithmParametersSpi
    protected void engineInit(byte[] bArr) {
        engineInit(bArr, "ASN.1");
    }

    @Override // java.security.AlgorithmParametersSpi
    protected void engineInit(byte[] bArr, String str) {
        if (!isASN1FormatString(str)) {
            throw new IOException("Unknown encoded parameters format in AlgorithmParameters object: " + str);
        }
        g e11 = g.e(bArr);
        n60.e curve = EC5Util.getCurve(BouncyCastleProvider.CONFIGURATION, e11);
        if (e11.i()) {
            org.bouncycastle.asn1.k u11 = org.bouncycastle.asn1.k.u(e11.f());
            String d11 = f50.d.d(u11);
            this.curveName = d11;
            if (d11 == null) {
                this.curveName = u11.t();
            }
        }
        this.ecParameterSpec = EC5Util.convertToSpec(e11, curve);
    }

    @Override // java.security.AlgorithmParametersSpi
    protected String engineToString() {
        return "EC Parameters";
    }

    protected boolean isASN1FormatString(String str) {
        return str == null || str.equals("ASN.1");
    }
}