package w50;

/* loaded from: classes5.dex */
public class e {
    public static byte[] a(c cVar, int i11) {
        byte[] bArr = new byte[i11];
        if (i11 * 8 <= cVar.entropySize()) {
            System.arraycopy(cVar.getEntropy(), 0, bArr, 0, i11);
        } else {
            int entropySize = cVar.entropySize() / 8;
            for (int i12 = 0; i12 < i11; i12 += entropySize) {
                byte[] entropy = cVar.getEntropy();
                int i13 = i11 - i12;
                if (entropy.length <= i13) {
                    System.arraycopy(entropy, 0, bArr, i12, entropy.length);
                } else {
                    System.arraycopy(entropy, 0, bArr, i12, i13);
                }
            }
        }
        return bArr;
    }
}