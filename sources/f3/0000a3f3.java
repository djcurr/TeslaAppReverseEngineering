package org.spongycastle.pqc.crypto.ntru;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.SecureRandom;
import java.text.DecimalFormat;
import org.spongycastle.crypto.Digest;
import org.spongycastle.crypto.KeyGenerationParameters;
import org.spongycastle.crypto.digests.SHA256Digest;
import org.spongycastle.crypto.digests.SHA512Digest;
import org.spongycastle.pqc.jcajce.spec.McElieceCCA2KeyGenParameterSpec;

/* loaded from: classes4.dex */
public class NTRUSigningKeyGenerationParameters extends KeyGenerationParameters implements Cloneable {
    public static final int BASIS_TYPE_STANDARD = 0;
    public static final int BASIS_TYPE_TRANSPOSE = 1;
    public static final int KEY_GEN_ALG_FLOAT = 1;
    public static final int KEY_GEN_ALG_RESULTANT = 0;
    public int B;
    public int N;
    public int basisType;
    double beta;
    public double betaSq;
    int bitsF;

    /* renamed from: d  reason: collision with root package name */
    public int f43832d;

    /* renamed from: d1  reason: collision with root package name */
    public int f43833d1;

    /* renamed from: d2  reason: collision with root package name */
    public int f43834d2;

    /* renamed from: d3  reason: collision with root package name */
    public int f43835d3;
    public Digest hashAlg;
    public int keyGenAlg;
    double keyNormBound;
    public double keyNormBoundSq;
    double normBound;
    public double normBoundSq;
    public int polyType;
    public boolean primeCheck;

    /* renamed from: q  reason: collision with root package name */
    public int f43836q;
    public int signFailTolerance;
    public boolean sparse;
    public static final NTRUSigningKeyGenerationParameters APR2011_439 = new NTRUSigningKeyGenerationParameters(439, 2048, 146, 1, 1, 0.165d, 490.0d, 280.0d, false, true, 0, new SHA256Digest());
    public static final NTRUSigningKeyGenerationParameters APR2011_439_PROD = new NTRUSigningKeyGenerationParameters(439, 2048, 9, 8, 5, 1, 1, 0.165d, 490.0d, 280.0d, false, true, 0, new SHA256Digest());
    public static final NTRUSigningKeyGenerationParameters APR2011_743 = new NTRUSigningKeyGenerationParameters(743, 2048, 248, 1, 1, 0.127d, 560.0d, 360.0d, true, false, 0, new SHA512Digest());
    public static final NTRUSigningKeyGenerationParameters APR2011_743_PROD = new NTRUSigningKeyGenerationParameters(743, 2048, 11, 11, 15, 1, 1, 0.127d, 560.0d, 360.0d, true, false, 0, new SHA512Digest());
    public static final NTRUSigningKeyGenerationParameters TEST157 = new NTRUSigningKeyGenerationParameters(157, 256, 29, 1, 1, 0.38d, 200.0d, 80.0d, false, false, 0, new SHA256Digest());
    public static final NTRUSigningKeyGenerationParameters TEST157_PROD = new NTRUSigningKeyGenerationParameters(157, 256, 5, 5, 8, 1, 1, 0.38d, 200.0d, 80.0d, false, false, 0, new SHA256Digest());

    public NTRUSigningKeyGenerationParameters(int i11, int i12, int i13, int i14, int i15, double d11, double d12, double d13, boolean z11, boolean z12, int i16, Digest digest) {
        super(new SecureRandom(), i11);
        this.signFailTolerance = 100;
        this.bitsF = 6;
        this.N = i11;
        this.f43836q = i12;
        this.f43832d = i13;
        this.B = i14;
        this.basisType = i15;
        this.beta = d11;
        this.normBound = d12;
        this.keyNormBound = d13;
        this.primeCheck = z11;
        this.sparse = z12;
        this.keyGenAlg = i16;
        this.hashAlg = digest;
        this.polyType = 0;
        init();
    }

    private void init() {
        double d11 = this.beta;
        this.betaSq = d11 * d11;
        double d12 = this.normBound;
        this.normBoundSq = d12 * d12;
        double d13 = this.keyNormBound;
        this.keyNormBoundSq = d13 * d13;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof NTRUSigningKeyGenerationParameters)) {
            NTRUSigningKeyGenerationParameters nTRUSigningKeyGenerationParameters = (NTRUSigningKeyGenerationParameters) obj;
            if (this.B == nTRUSigningKeyGenerationParameters.B && this.N == nTRUSigningKeyGenerationParameters.N && this.basisType == nTRUSigningKeyGenerationParameters.basisType && Double.doubleToLongBits(this.beta) == Double.doubleToLongBits(nTRUSigningKeyGenerationParameters.beta) && Double.doubleToLongBits(this.betaSq) == Double.doubleToLongBits(nTRUSigningKeyGenerationParameters.betaSq) && this.bitsF == nTRUSigningKeyGenerationParameters.bitsF && this.f43832d == nTRUSigningKeyGenerationParameters.f43832d && this.f43833d1 == nTRUSigningKeyGenerationParameters.f43833d1 && this.f43834d2 == nTRUSigningKeyGenerationParameters.f43834d2 && this.f43835d3 == nTRUSigningKeyGenerationParameters.f43835d3) {
                Digest digest = this.hashAlg;
                if (digest == null) {
                    if (nTRUSigningKeyGenerationParameters.hashAlg != null) {
                        return false;
                    }
                } else if (!digest.getAlgorithmName().equals(nTRUSigningKeyGenerationParameters.hashAlg.getAlgorithmName())) {
                    return false;
                }
                return this.keyGenAlg == nTRUSigningKeyGenerationParameters.keyGenAlg && Double.doubleToLongBits(this.keyNormBound) == Double.doubleToLongBits(nTRUSigningKeyGenerationParameters.keyNormBound) && Double.doubleToLongBits(this.keyNormBoundSq) == Double.doubleToLongBits(nTRUSigningKeyGenerationParameters.keyNormBoundSq) && Double.doubleToLongBits(this.normBound) == Double.doubleToLongBits(nTRUSigningKeyGenerationParameters.normBound) && Double.doubleToLongBits(this.normBoundSq) == Double.doubleToLongBits(nTRUSigningKeyGenerationParameters.normBoundSq) && this.polyType == nTRUSigningKeyGenerationParameters.polyType && this.primeCheck == nTRUSigningKeyGenerationParameters.primeCheck && this.f43836q == nTRUSigningKeyGenerationParameters.f43836q && this.signFailTolerance == nTRUSigningKeyGenerationParameters.signFailTolerance && this.sparse == nTRUSigningKeyGenerationParameters.sparse;
            }
            return false;
        }
        return false;
    }

    public NTRUSigningParameters getSigningParameters() {
        return new NTRUSigningParameters(this.N, this.f43836q, this.f43832d, this.B, this.beta, this.normBound, this.hashAlg);
    }

    public int hashCode() {
        int i11 = ((((this.B + 31) * 31) + this.N) * 31) + this.basisType;
        long doubleToLongBits = Double.doubleToLongBits(this.beta);
        int i12 = (i11 * 31) + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
        long doubleToLongBits2 = Double.doubleToLongBits(this.betaSq);
        int i13 = ((((((((((((i12 * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)))) * 31) + this.bitsF) * 31) + this.f43832d) * 31) + this.f43833d1) * 31) + this.f43834d2) * 31) + this.f43835d3) * 31;
        Digest digest = this.hashAlg;
        int hashCode = ((i13 + (digest == null ? 0 : digest.getAlgorithmName().hashCode())) * 31) + this.keyGenAlg;
        long doubleToLongBits3 = Double.doubleToLongBits(this.keyNormBound);
        int i14 = (hashCode * 31) + ((int) (doubleToLongBits3 ^ (doubleToLongBits3 >>> 32)));
        long doubleToLongBits4 = Double.doubleToLongBits(this.keyNormBoundSq);
        int i15 = (i14 * 31) + ((int) (doubleToLongBits4 ^ (doubleToLongBits4 >>> 32)));
        long doubleToLongBits5 = Double.doubleToLongBits(this.normBound);
        int i16 = (i15 * 31) + ((int) (doubleToLongBits5 ^ (doubleToLongBits5 >>> 32)));
        long doubleToLongBits6 = Double.doubleToLongBits(this.normBoundSq);
        return (((((((((((i16 * 31) + ((int) (doubleToLongBits6 ^ (doubleToLongBits6 >>> 32)))) * 31) + this.polyType) * 31) + (this.primeCheck ? 1231 : 1237)) * 31) + this.f43836q) * 31) + this.signFailTolerance) * 31) + (this.sparse ? 1231 : 1237);
    }

    public String toString() {
        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        StringBuilder sb2 = new StringBuilder("SignatureParameters(N=" + this.N + " q=" + this.f43836q);
        if (this.polyType == 0) {
            sb2.append(" polyType=SIMPLE d=" + this.f43832d);
        } else {
            sb2.append(" polyType=PRODUCT d1=" + this.f43833d1 + " d2=" + this.f43834d2 + " d3=" + this.f43835d3);
        }
        sb2.append(" B=" + this.B + " basisType=" + this.basisType + " beta=" + decimalFormat.format(this.beta) + " normBound=" + decimalFormat.format(this.normBound) + " keyNormBound=" + decimalFormat.format(this.keyNormBound) + " prime=" + this.primeCheck + " sparse=" + this.sparse + " keyGenAlg=" + this.keyGenAlg + " hashAlg=" + this.hashAlg + ")");
        return sb2.toString();
    }

    public void writeTo(OutputStream outputStream) {
        DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
        dataOutputStream.writeInt(this.N);
        dataOutputStream.writeInt(this.f43836q);
        dataOutputStream.writeInt(this.f43832d);
        dataOutputStream.writeInt(this.f43833d1);
        dataOutputStream.writeInt(this.f43834d2);
        dataOutputStream.writeInt(this.f43835d3);
        dataOutputStream.writeInt(this.B);
        dataOutputStream.writeInt(this.basisType);
        dataOutputStream.writeDouble(this.beta);
        dataOutputStream.writeDouble(this.normBound);
        dataOutputStream.writeDouble(this.keyNormBound);
        dataOutputStream.writeInt(this.signFailTolerance);
        dataOutputStream.writeBoolean(this.primeCheck);
        dataOutputStream.writeBoolean(this.sparse);
        dataOutputStream.writeInt(this.bitsF);
        dataOutputStream.write(this.keyGenAlg);
        dataOutputStream.writeUTF(this.hashAlg.getAlgorithmName());
        dataOutputStream.write(this.polyType);
    }

    public NTRUSigningKeyGenerationParameters clone() {
        if (this.polyType == 0) {
            return new NTRUSigningKeyGenerationParameters(this.N, this.f43836q, this.f43832d, this.B, this.basisType, this.beta, this.normBound, this.keyNormBound, this.primeCheck, this.sparse, this.keyGenAlg, this.hashAlg);
        }
        return new NTRUSigningKeyGenerationParameters(this.N, this.f43836q, this.f43833d1, this.f43834d2, this.f43835d3, this.B, this.basisType, this.beta, this.normBound, this.keyNormBound, this.primeCheck, this.sparse, this.keyGenAlg, this.hashAlg);
    }

    public NTRUSigningKeyGenerationParameters(int i11, int i12, int i13, int i14, int i15, int i16, int i17, double d11, double d12, double d13, boolean z11, boolean z12, int i18, Digest digest) {
        super(new SecureRandom(), i11);
        this.signFailTolerance = 100;
        this.bitsF = 6;
        this.N = i11;
        this.f43836q = i12;
        this.f43833d1 = i13;
        this.f43834d2 = i14;
        this.f43835d3 = i15;
        this.B = i16;
        this.basisType = i17;
        this.beta = d11;
        this.normBound = d12;
        this.keyNormBound = d13;
        this.primeCheck = z11;
        this.sparse = z12;
        this.keyGenAlg = i18;
        this.hashAlg = digest;
        this.polyType = 1;
        init();
    }

    public NTRUSigningKeyGenerationParameters(InputStream inputStream) {
        super(new SecureRandom(), 0);
        this.signFailTolerance = 100;
        this.bitsF = 6;
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        this.N = dataInputStream.readInt();
        this.f43836q = dataInputStream.readInt();
        this.f43832d = dataInputStream.readInt();
        this.f43833d1 = dataInputStream.readInt();
        this.f43834d2 = dataInputStream.readInt();
        this.f43835d3 = dataInputStream.readInt();
        this.B = dataInputStream.readInt();
        this.basisType = dataInputStream.readInt();
        this.beta = dataInputStream.readDouble();
        this.normBound = dataInputStream.readDouble();
        this.keyNormBound = dataInputStream.readDouble();
        this.signFailTolerance = dataInputStream.readInt();
        this.primeCheck = dataInputStream.readBoolean();
        this.sparse = dataInputStream.readBoolean();
        this.bitsF = dataInputStream.readInt();
        this.keyGenAlg = dataInputStream.read();
        String readUTF = dataInputStream.readUTF();
        if (McElieceCCA2KeyGenParameterSpec.SHA512.equals(readUTF)) {
            this.hashAlg = new SHA512Digest();
        } else if (McElieceCCA2KeyGenParameterSpec.SHA256.equals(readUTF)) {
            this.hashAlg = new SHA256Digest();
        }
        this.polyType = dataInputStream.read();
        init();
    }
}