package org.spongycastle.cert.crmf;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.security.SecureRandom;
import org.spongycastle.asn1.DERNull;
import org.spongycastle.asn1.cmp.CMPObjectIdentifiers;
import org.spongycastle.asn1.cmp.PBMParameter;
import org.spongycastle.asn1.iana.IANAObjectIdentifiers;
import org.spongycastle.asn1.oiw.OIWObjectIdentifiers;
import org.spongycastle.asn1.x509.AlgorithmIdentifier;
import org.spongycastle.operator.GenericKey;
import org.spongycastle.operator.MacCalculator;
import org.spongycastle.operator.RuntimeOperatorException;
import org.spongycastle.util.Strings;

/* loaded from: classes5.dex */
public class PKMACBuilder {
    private PKMACValuesCalculator calculator;
    private int iterationCount;
    private AlgorithmIdentifier mac;
    private int maxIterations;
    private AlgorithmIdentifier owf;
    private PBMParameter parameters;
    private SecureRandom random;
    private int saltLength;

    public PKMACBuilder(PKMACValuesCalculator pKMACValuesCalculator) {
        this(new AlgorithmIdentifier(OIWObjectIdentifiers.idSHA1), 1000, new AlgorithmIdentifier(IANAObjectIdentifiers.hmacSHA1, DERNull.INSTANCE), pKMACValuesCalculator);
    }

    private void checkIterationCountCeiling(int i11) {
        int i12 = this.maxIterations;
        if (i12 <= 0 || i11 <= i12) {
            return;
        }
        throw new IllegalArgumentException("iteration count exceeds limit (" + i11 + " > " + this.maxIterations + ")");
    }

    private MacCalculator genCalculator(final PBMParameter pBMParameter, char[] cArr) {
        byte[] uTF8ByteArray = Strings.toUTF8ByteArray(cArr);
        byte[] octets = pBMParameter.getSalt().getOctets();
        final byte[] bArr = new byte[uTF8ByteArray.length + octets.length];
        System.arraycopy(uTF8ByteArray, 0, bArr, 0, uTF8ByteArray.length);
        System.arraycopy(octets, 0, bArr, uTF8ByteArray.length, octets.length);
        this.calculator.setup(pBMParameter.getOwf(), pBMParameter.getMac());
        int intValue = pBMParameter.getIterationCount().getValue().intValue();
        do {
            bArr = this.calculator.calculateDigest(bArr);
            intValue--;
        } while (intValue > 0);
        return new MacCalculator() { // from class: org.spongycastle.cert.crmf.PKMACBuilder.1
            ByteArrayOutputStream bOut = new ByteArrayOutputStream();

            @Override // org.spongycastle.operator.MacCalculator
            public AlgorithmIdentifier getAlgorithmIdentifier() {
                return new AlgorithmIdentifier(CMPObjectIdentifiers.passwordBasedMac, pBMParameter);
            }

            @Override // org.spongycastle.operator.MacCalculator
            public GenericKey getKey() {
                return new GenericKey(getAlgorithmIdentifier(), bArr);
            }

            @Override // org.spongycastle.operator.MacCalculator
            public byte[] getMac() {
                try {
                    return PKMACBuilder.this.calculator.calculateMac(bArr, this.bOut.toByteArray());
                } catch (CRMFException e11) {
                    throw new RuntimeOperatorException("exception calculating mac: " + e11.getMessage(), e11);
                }
            }

            @Override // org.spongycastle.operator.MacCalculator
            public OutputStream getOutputStream() {
                return this.bOut;
            }
        };
    }

    public MacCalculator build(char[] cArr) {
        PBMParameter pBMParameter = this.parameters;
        if (pBMParameter != null) {
            return genCalculator(pBMParameter, cArr);
        }
        byte[] bArr = new byte[this.saltLength];
        if (this.random == null) {
            this.random = new SecureRandom();
        }
        this.random.nextBytes(bArr);
        return genCalculator(new PBMParameter(bArr, this.owf, this.iterationCount, this.mac), cArr);
    }

    public PKMACBuilder setIterationCount(int i11) {
        if (i11 >= 100) {
            checkIterationCountCeiling(i11);
            this.iterationCount = i11;
            return this;
        }
        throw new IllegalArgumentException("iteration count must be at least 100");
    }

    public PKMACBuilder setParameters(PBMParameter pBMParameter) {
        checkIterationCountCeiling(pBMParameter.getIterationCount().getValue().intValue());
        this.parameters = pBMParameter;
        return this;
    }

    public PKMACBuilder setSaltLength(int i11) {
        if (i11 >= 8) {
            this.saltLength = i11;
            return this;
        }
        throw new IllegalArgumentException("salt length must be at least 8 bytes");
    }

    public PKMACBuilder setSecureRandom(SecureRandom secureRandom) {
        this.random = secureRandom;
        return this;
    }

    public PKMACBuilder(PKMACValuesCalculator pKMACValuesCalculator, int i11) {
        this.saltLength = 20;
        this.maxIterations = i11;
        this.calculator = pKMACValuesCalculator;
    }

    private PKMACBuilder(AlgorithmIdentifier algorithmIdentifier, int i11, AlgorithmIdentifier algorithmIdentifier2, PKMACValuesCalculator pKMACValuesCalculator) {
        this.saltLength = 20;
        this.owf = algorithmIdentifier;
        this.iterationCount = i11;
        this.mac = algorithmIdentifier2;
        this.calculator = pKMACValuesCalculator;
    }
}