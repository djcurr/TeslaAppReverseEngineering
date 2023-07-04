package q50;

/* loaded from: classes5.dex */
public interface b {
    int doFinal(byte[] bArr, int i11);

    String getAlgorithmName();

    byte[] getMac();

    int getOutputSize(int i11);

    int getUpdateOutputSize(int i11);

    void init(boolean z11, org.bouncycastle.crypto.i iVar);

    void processAADBytes(byte[] bArr, int i11, int i12);

    int processByte(byte b11, byte[] bArr, int i11);

    int processBytes(byte[] bArr, int i11, int i12, byte[] bArr2, int i13);
}