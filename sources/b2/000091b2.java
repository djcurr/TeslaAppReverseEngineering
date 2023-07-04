package org.bouncycastle.jcajce.provider.asymmetric.ec;

import f50.g;
import f50.i;
import f50.k;
import java.math.BigInteger;
import java.security.PublicKey;
import java.security.spec.ECGenParameterSpec;
import java.security.spec.ECParameterSpec;
import l60.d;
import n60.e;
import org.bouncycastle.asn1.j;
import org.bouncycastle.asn1.q0;
import org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util;
import org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil;
import org.bouncycastle.jcajce.provider.config.ProviderConfiguration;
import u50.b;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public class ECUtils {
    ECUtils() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static b generatePublicKeyParameter(PublicKey publicKey) {
        return publicKey instanceof BCECPublicKey ? ((BCECPublicKey) publicKey).engineGetKeyParameters() : ECUtil.generatePublicKeyParameter(publicKey);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static i getDomainParametersFromGenSpec(ECGenParameterSpec eCGenParameterSpec, ProviderConfiguration providerConfiguration) {
        return getDomainParametersFromName(eCGenParameterSpec.getName(), providerConfiguration);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static g getDomainParametersFromName(ECParameterSpec eCParameterSpec, boolean z11) {
        if (!(eCParameterSpec instanceof d)) {
            if (eCParameterSpec == null) {
                return new g((j) q0.f43085a);
            }
            e convertCurve = EC5Util.convertCurve(eCParameterSpec.getCurve());
            return new g(new i(convertCurve, new k(EC5Util.convertPoint(convertCurve, eCParameterSpec.getGenerator()), z11), eCParameterSpec.getOrder(), BigInteger.valueOf(eCParameterSpec.getCofactor()), eCParameterSpec.getCurve().getSeed()));
        }
        d dVar = (d) eCParameterSpec;
        org.bouncycastle.asn1.k namedCurveOid = ECUtil.getNamedCurveOid(dVar.c());
        if (namedCurveOid == null) {
            namedCurveOid = new org.bouncycastle.asn1.k(dVar.c());
        }
        return new g(namedCurveOid);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static i getDomainParametersFromName(String str, ProviderConfiguration providerConfiguration) {
        if (str == null || str.length() < 1) {
            return null;
        }
        int indexOf = str.indexOf(32);
        if (indexOf > 0) {
            str = str.substring(indexOf + 1);
        }
        org.bouncycastle.asn1.k oid = getOID(str);
        if (oid == null) {
            return ECUtil.getNamedCurveByName(str);
        }
        i namedCurveByOid = ECUtil.getNamedCurveByOid(oid);
        return (namedCurveByOid != null || providerConfiguration == null) ? namedCurveByOid : (i) providerConfiguration.getAdditionalECParameters().get(oid);
    }

    private static org.bouncycastle.asn1.k getOID(String str) {
        char charAt = str.charAt(0);
        if (charAt < '0' || charAt > '2') {
            return null;
        }
        try {
            return new org.bouncycastle.asn1.k(str);
        } catch (Exception unused) {
            return null;
        }
    }
}