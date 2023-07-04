package org.spongycastle.pqc.crypto.ntru;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.text.DecimalFormat;
import org.spongycastle.crypto.Digest;
import org.spongycastle.crypto.digests.SHA256Digest;
import org.spongycastle.crypto.digests.SHA512Digest;
import org.spongycastle.pqc.jcajce.spec.McElieceCCA2KeyGenParameterSpec;

/* loaded from: classes4.dex */
public class NTRUSigningParameters implements Cloneable {
    public int B;
    public int N;
    double beta;
    public double betaSq;
    int bitsF;

    /* renamed from: d  reason: collision with root package name */
    public int f43837d;

    /* renamed from: d1  reason: collision with root package name */
    public int f43838d1;

    /* renamed from: d2  reason: collision with root package name */
    public int f43839d2;

    /* renamed from: d3  reason: collision with root package name */
    public int f43840d3;
    public Digest hashAlg;
    double normBound;
    public double normBoundSq;

    /* renamed from: q  reason: collision with root package name */
    public int f43841q;
    public int signFailTolerance;

    public NTRUSigningParameters(int i11, int i12, int i13, int i14, double d11, double d12, Digest digest) {
        this.signFailTolerance = 100;
        this.bitsF = 6;
        this.N = i11;
        this.f43841q = i12;
        this.f43837d = i13;
        this.B = i14;
        this.beta = d11;
        this.normBound = d12;
        this.hashAlg = digest;
        init();
    }

    private void init() {
        double d11 = this.beta;
        this.betaSq = d11 * d11;
        double d12 = this.normBound;
        this.normBoundSq = d12 * d12;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof NTRUSigningParameters)) {
            NTRUSigningParameters nTRUSigningParameters = (NTRUSigningParameters) obj;
            if (this.B == nTRUSigningParameters.B && this.N == nTRUSigningParameters.N && Double.doubleToLongBits(this.beta) == Double.doubleToLongBits(nTRUSigningParameters.beta) && Double.doubleToLongBits(this.betaSq) == Double.doubleToLongBits(nTRUSigningParameters.betaSq) && this.bitsF == nTRUSigningParameters.bitsF && this.f43837d == nTRUSigningParameters.f43837d && this.f43838d1 == nTRUSigningParameters.f43838d1 && this.f43839d2 == nTRUSigningParameters.f43839d2 && this.f43840d3 == nTRUSigningParameters.f43840d3) {
                Digest digest = this.hashAlg;
                if (digest == null) {
                    if (nTRUSigningParameters.hashAlg != null) {
                        return false;
                    }
                } else if (!digest.getAlgorithmName().equals(nTRUSigningParameters.hashAlg.getAlgorithmName())) {
                    return false;
                }
                return Double.doubleToLongBits(this.normBound) == Double.doubleToLongBits(nTRUSigningParameters.normBound) && Double.doubleToLongBits(this.normBoundSq) == Double.doubleToLongBits(nTRUSigningParameters.normBoundSq) && this.f43841q == nTRUSigningParameters.f43841q && this.signFailTolerance == nTRUSigningParameters.signFailTolerance;
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        int i11 = ((this.B + 31) * 31) + this.N;
        long doubleToLongBits = Double.doubleToLongBits(this.beta);
        int i12 = (i11 * 31) + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
        long doubleToLongBits2 = Double.doubleToLongBits(this.betaSq);
        int i13 = ((((((((((((i12 * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)))) * 31) + this.bitsF) * 31) + this.f43837d) * 31) + this.f43838d1) * 31) + this.f43839d2) * 31) + this.f43840d3) * 31;
        Digest digest = this.hashAlg;
        int hashCode = i13 + (digest == null ? 0 : digest.getAlgorithmName().hashCode());
        long doubleToLongBits3 = Double.doubleToLongBits(this.normBound);
        int i14 = (hashCode * 31) + ((int) (doubleToLongBits3 ^ (doubleToLongBits3 >>> 32)));
        long doubleToLongBits4 = Double.doubleToLongBits(this.normBoundSq);
        return (((((i14 * 31) + ((int) (doubleToLongBits4 ^ (doubleToLongBits4 >>> 32)))) * 31) + this.f43841q) * 31) + this.signFailTolerance;
    }

    public String toString() {
        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        StringBuilder sb2 = new StringBuilder("SignatureParameters(N=" + this.N + " q=" + this.f43841q);
        sb2.append(" B=" + this.B + " beta=" + decimalFormat.format(this.beta) + " normBound=" + decimalFormat.format(this.normBound) + " hashAlg=" + this.hashAlg + ")");
        return sb2.toString();
    }

    public void writeTo(OutputStream outputStream) {
        DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
        dataOutputStream.writeInt(this.N);
        dataOutputStream.writeInt(this.f43841q);
        dataOutputStream.writeInt(this.f43837d);
        dataOutputStream.writeInt(this.f43838d1);
        dataOutputStream.writeInt(this.f43839d2);
        dataOutputStream.writeInt(this.f43840d3);
        dataOutputStream.writeInt(this.B);
        dataOutputStream.writeDouble(this.beta);
        dataOutputStream.writeDouble(this.normBound);
        dataOutputStream.writeInt(this.signFailTolerance);
        dataOutputStream.writeInt(this.bitsF);
        dataOutputStream.writeUTF(this.hashAlg.getAlgorithmName());
    }

    public NTRUSigningParameters clone() {
        return new NTRUSigningParameters(this.N, this.f43841q, this.f43837d, this.B, this.beta, this.normBound, this.hashAlg);
    }

    public NTRUSigningParameters(int i11, int i12, int i13, int i14, int i15, int i16, double d11, double d12, double d13, Digest digest) {
        this.signFailTolerance = 100;
        this.bitsF = 6;
        this.N = i11;
        this.f43841q = i12;
        this.f43838d1 = i13;
        this.f43839d2 = i14;
        this.f43840d3 = i15;
        this.B = i16;
        this.beta = d11;
        this.normBound = d12;
        this.hashAlg = digest;
        init();
    }

    public NTRUSigningParameters(InputStream inputStream) {
        this.signFailTolerance = 100;
        this.bitsF = 6;
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        this.N = dataInputStream.readInt();
        this.f43841q = dataInputStream.readInt();
        this.f43837d = dataInputStream.readInt();
        this.f43838d1 = dataInputStream.readInt();
        this.f43839d2 = dataInputStream.readInt();
        this.f43840d3 = dataInputStream.readInt();
        this.B = dataInputStream.readInt();
        this.beta = dataInputStream.readDouble();
        this.normBound = dataInputStream.readDouble();
        this.signFailTolerance = dataInputStream.readInt();
        this.bitsF = dataInputStream.readInt();
        String readUTF = dataInputStream.readUTF();
        if (McElieceCCA2KeyGenParameterSpec.SHA512.equals(readUTF)) {
            this.hashAlg = new SHA512Digest();
        } else if (McElieceCCA2KeyGenParameterSpec.SHA256.equals(readUTF)) {
            this.hashAlg = new SHA256Digest();
        }
        init();
    }
}