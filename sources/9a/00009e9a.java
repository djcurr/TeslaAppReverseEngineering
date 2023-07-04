package org.spongycastle.jcajce.provider.asymmetric.elgamal;

import java.io.IOException;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidParameterSpecException;
import javax.crypto.spec.DHParameterSpec;
import org.spongycastle.asn1.ASN1Encoding;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.oiw.ElGamalParameter;
import org.spongycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameters;
import org.spongycastle.jce.spec.ElGamalParameterSpec;

/* loaded from: classes4.dex */
public class AlgorithmParametersSpi extends BaseAlgorithmParameters {
    ElGamalParameterSpec currentSpec;

    @Override // java.security.AlgorithmParametersSpi
    protected byte[] engineGetEncoded() {
        try {
            return new ElGamalParameter(this.currentSpec.getP(), this.currentSpec.getG()).getEncoded(ASN1Encoding.DER);
        } catch (IOException unused) {
            throw new RuntimeException("Error encoding ElGamalParameters");
        }
    }

    @Override // java.security.AlgorithmParametersSpi
    protected void engineInit(AlgorithmParameterSpec algorithmParameterSpec) {
        boolean z11 = algorithmParameterSpec instanceof ElGamalParameterSpec;
        if (!z11 && !(algorithmParameterSpec instanceof DHParameterSpec)) {
            throw new InvalidParameterSpecException("DHParameterSpec required to initialise a ElGamal algorithm parameters object");
        }
        if (z11) {
            this.currentSpec = (ElGamalParameterSpec) algorithmParameterSpec;
            return;
        }
        DHParameterSpec dHParameterSpec = (DHParameterSpec) algorithmParameterSpec;
        this.currentSpec = new ElGamalParameterSpec(dHParameterSpec.getP(), dHParameterSpec.getG());
    }

    @Override // java.security.AlgorithmParametersSpi
    protected String engineToString() {
        return "ElGamal Parameters";
    }

    @Override // org.spongycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameters
    protected AlgorithmParameterSpec localEngineGetParameterSpec(Class cls) {
        if (cls != ElGamalParameterSpec.class && cls != AlgorithmParameterSpec.class) {
            if (cls == DHParameterSpec.class) {
                return new DHParameterSpec(this.currentSpec.getP(), this.currentSpec.getG());
            }
            throw new InvalidParameterSpecException("unknown parameter spec passed to ElGamal parameters object.");
        }
        return this.currentSpec;
    }

    @Override // java.security.AlgorithmParametersSpi
    protected byte[] engineGetEncoded(String str) {
        if (isASN1FormatString(str) || str.equalsIgnoreCase("X.509")) {
            return engineGetEncoded();
        }
        return null;
    }

    @Override // java.security.AlgorithmParametersSpi
    protected void engineInit(byte[] bArr) {
        try {
            ElGamalParameter elGamalParameter = ElGamalParameter.getInstance(ASN1Primitive.fromByteArray(bArr));
            this.currentSpec = new ElGamalParameterSpec(elGamalParameter.getP(), elGamalParameter.getG());
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new IOException("Not a valid ElGamal Parameter encoding.");
        } catch (ClassCastException unused2) {
            throw new IOException("Not a valid ElGamal Parameter encoding.");
        }
    }

    @Override // java.security.AlgorithmParametersSpi
    protected void engineInit(byte[] bArr, String str) {
        if (!isASN1FormatString(str) && !str.equalsIgnoreCase("X.509")) {
            throw new IOException("Unknown parameter format " + str);
        }
        engineInit(bArr);
    }
}