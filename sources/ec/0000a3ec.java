package org.spongycastle.pqc.crypto.ntru;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;
import org.spongycastle.crypto.Digest;
import org.spongycastle.crypto.digests.SHA256Digest;
import org.spongycastle.crypto.digests.SHA512Digest;
import org.spongycastle.pqc.jcajce.spec.McElieceCCA2KeyGenParameterSpec;

/* loaded from: classes4.dex */
public class NTRUEncryptionParameters implements Cloneable {
    public int N;
    public int bufferLenBits;
    int bufferLenTrits;

    /* renamed from: c  reason: collision with root package name */
    public int f43822c;

    /* renamed from: db  reason: collision with root package name */
    public int f43823db;

    /* renamed from: df  reason: collision with root package name */
    public int f43824df;
    public int df1;
    public int df2;
    public int df3;

    /* renamed from: dg  reason: collision with root package name */
    public int f43825dg;
    public int dm0;

    /* renamed from: dr  reason: collision with root package name */
    public int f43826dr;
    public int dr1;
    public int dr2;
    public int dr3;
    public boolean fastFp;
    public Digest hashAlg;
    public boolean hashSeed;
    int llen;
    public int maxMsgLenBytes;
    public int minCallsMask;
    public int minCallsR;
    public byte[] oid;
    public int pkLen;
    public int polyType;

    /* renamed from: q  reason: collision with root package name */
    public int f43827q;
    public boolean sparse;

    public NTRUEncryptionParameters(int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, boolean z11, byte[] bArr, boolean z12, boolean z13, Digest digest) {
        this.N = i11;
        this.f43827q = i12;
        this.f43824df = i13;
        this.f43823db = i15;
        this.dm0 = i14;
        this.f43822c = i16;
        this.minCallsR = i17;
        this.minCallsMask = i18;
        this.hashSeed = z11;
        this.oid = bArr;
        this.sparse = z12;
        this.fastFp = z13;
        this.polyType = 0;
        this.hashAlg = digest;
        init();
    }

    private void init() {
        this.f43826dr = this.f43824df;
        this.dr1 = this.df1;
        this.dr2 = this.df2;
        this.dr3 = this.df3;
        int i11 = this.N;
        this.f43825dg = i11 / 3;
        this.llen = 1;
        int i12 = this.f43823db;
        this.maxMsgLenBytes = (((((i11 * 3) / 2) / 8) - 1) - (i12 / 8)) - 1;
        this.bufferLenBits = (((((i11 * 3) / 2) + 7) / 8) * 8) + 1;
        this.bufferLenTrits = i11 - 1;
        this.pkLen = i12;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            NTRUEncryptionParameters nTRUEncryptionParameters = (NTRUEncryptionParameters) obj;
            if (this.N == nTRUEncryptionParameters.N && this.bufferLenBits == nTRUEncryptionParameters.bufferLenBits && this.bufferLenTrits == nTRUEncryptionParameters.bufferLenTrits && this.f43822c == nTRUEncryptionParameters.f43822c && this.f43823db == nTRUEncryptionParameters.f43823db && this.f43824df == nTRUEncryptionParameters.f43824df && this.df1 == nTRUEncryptionParameters.df1 && this.df2 == nTRUEncryptionParameters.df2 && this.df3 == nTRUEncryptionParameters.df3 && this.f43825dg == nTRUEncryptionParameters.f43825dg && this.dm0 == nTRUEncryptionParameters.dm0 && this.f43826dr == nTRUEncryptionParameters.f43826dr && this.dr1 == nTRUEncryptionParameters.dr1 && this.dr2 == nTRUEncryptionParameters.dr2 && this.dr3 == nTRUEncryptionParameters.dr3 && this.fastFp == nTRUEncryptionParameters.fastFp) {
                Digest digest = this.hashAlg;
                if (digest == null) {
                    if (nTRUEncryptionParameters.hashAlg != null) {
                        return false;
                    }
                } else if (!digest.getAlgorithmName().equals(nTRUEncryptionParameters.hashAlg.getAlgorithmName())) {
                    return false;
                }
                return this.hashSeed == nTRUEncryptionParameters.hashSeed && this.llen == nTRUEncryptionParameters.llen && this.maxMsgLenBytes == nTRUEncryptionParameters.maxMsgLenBytes && this.minCallsMask == nTRUEncryptionParameters.minCallsMask && this.minCallsR == nTRUEncryptionParameters.minCallsR && Arrays.equals(this.oid, nTRUEncryptionParameters.oid) && this.pkLen == nTRUEncryptionParameters.pkLen && this.polyType == nTRUEncryptionParameters.polyType && this.f43827q == nTRUEncryptionParameters.f43827q && this.sparse == nTRUEncryptionParameters.sparse;
            }
            return false;
        }
        return false;
    }

    public int getMaxMessageLength() {
        return this.maxMsgLenBytes;
    }

    public int hashCode() {
        int i11 = (((((((((((((((((((((((((((((((this.N + 31) * 31) + this.bufferLenBits) * 31) + this.bufferLenTrits) * 31) + this.f43822c) * 31) + this.f43823db) * 31) + this.f43824df) * 31) + this.df1) * 31) + this.df2) * 31) + this.df3) * 31) + this.f43825dg) * 31) + this.dm0) * 31) + this.f43826dr) * 31) + this.dr1) * 31) + this.dr2) * 31) + this.dr3) * 31) + (this.fastFp ? 1231 : 1237)) * 31;
        Digest digest = this.hashAlg;
        return ((((((((((((((((((((i11 + (digest == null ? 0 : digest.getAlgorithmName().hashCode())) * 31) + (this.hashSeed ? 1231 : 1237)) * 31) + this.llen) * 31) + this.maxMsgLenBytes) * 31) + this.minCallsMask) * 31) + this.minCallsR) * 31) + Arrays.hashCode(this.oid)) * 31) + this.pkLen) * 31) + this.polyType) * 31) + this.f43827q) * 31) + (this.sparse ? 1231 : 1237);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("EncryptionParameters(N=" + this.N + " q=" + this.f43827q);
        if (this.polyType == 0) {
            sb2.append(" polyType=SIMPLE df=" + this.f43824df);
        } else {
            sb2.append(" polyType=PRODUCT df1=" + this.df1 + " df2=" + this.df2 + " df3=" + this.df3);
        }
        sb2.append(" dm0=" + this.dm0 + " db=" + this.f43823db + " c=" + this.f43822c + " minCallsR=" + this.minCallsR + " minCallsMask=" + this.minCallsMask + " hashSeed=" + this.hashSeed + " hashAlg=" + this.hashAlg + " oid=" + Arrays.toString(this.oid) + " sparse=" + this.sparse + ")");
        return sb2.toString();
    }

    public void writeTo(OutputStream outputStream) {
        DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
        dataOutputStream.writeInt(this.N);
        dataOutputStream.writeInt(this.f43827q);
        dataOutputStream.writeInt(this.f43824df);
        dataOutputStream.writeInt(this.df1);
        dataOutputStream.writeInt(this.df2);
        dataOutputStream.writeInt(this.df3);
        dataOutputStream.writeInt(this.f43823db);
        dataOutputStream.writeInt(this.dm0);
        dataOutputStream.writeInt(this.f43822c);
        dataOutputStream.writeInt(this.minCallsR);
        dataOutputStream.writeInt(this.minCallsMask);
        dataOutputStream.writeBoolean(this.hashSeed);
        dataOutputStream.write(this.oid);
        dataOutputStream.writeBoolean(this.sparse);
        dataOutputStream.writeBoolean(this.fastFp);
        dataOutputStream.write(this.polyType);
        dataOutputStream.writeUTF(this.hashAlg.getAlgorithmName());
    }

    public NTRUEncryptionParameters clone() {
        if (this.polyType == 0) {
            return new NTRUEncryptionParameters(this.N, this.f43827q, this.f43824df, this.dm0, this.f43823db, this.f43822c, this.minCallsR, this.minCallsMask, this.hashSeed, this.oid, this.sparse, this.fastFp, this.hashAlg);
        }
        return new NTRUEncryptionParameters(this.N, this.f43827q, this.df1, this.df2, this.df3, this.dm0, this.f43823db, this.f43822c, this.minCallsR, this.minCallsMask, this.hashSeed, this.oid, this.sparse, this.fastFp, this.hashAlg);
    }

    public NTRUEncryptionParameters(int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i21, boolean z11, byte[] bArr, boolean z12, boolean z13, Digest digest) {
        this.N = i11;
        this.f43827q = i12;
        this.df1 = i13;
        this.df2 = i14;
        this.df3 = i15;
        this.f43823db = i17;
        this.dm0 = i16;
        this.f43822c = i18;
        this.minCallsR = i19;
        this.minCallsMask = i21;
        this.hashSeed = z11;
        this.oid = bArr;
        this.sparse = z12;
        this.fastFp = z13;
        this.polyType = 1;
        this.hashAlg = digest;
        init();
    }

    public NTRUEncryptionParameters(InputStream inputStream) {
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        this.N = dataInputStream.readInt();
        this.f43827q = dataInputStream.readInt();
        this.f43824df = dataInputStream.readInt();
        this.df1 = dataInputStream.readInt();
        this.df2 = dataInputStream.readInt();
        this.df3 = dataInputStream.readInt();
        this.f43823db = dataInputStream.readInt();
        this.dm0 = dataInputStream.readInt();
        this.f43822c = dataInputStream.readInt();
        this.minCallsR = dataInputStream.readInt();
        this.minCallsMask = dataInputStream.readInt();
        this.hashSeed = dataInputStream.readBoolean();
        byte[] bArr = new byte[3];
        this.oid = bArr;
        dataInputStream.read(bArr);
        this.sparse = dataInputStream.readBoolean();
        this.fastFp = dataInputStream.readBoolean();
        this.polyType = dataInputStream.read();
        String readUTF = dataInputStream.readUTF();
        if (McElieceCCA2KeyGenParameterSpec.SHA512.equals(readUTF)) {
            this.hashAlg = new SHA512Digest();
        } else if (McElieceCCA2KeyGenParameterSpec.SHA256.equals(readUTF)) {
            this.hashAlg = new SHA256Digest();
        }
        init();
    }
}