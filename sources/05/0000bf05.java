package x50;

import java.util.Hashtable;
import org.bouncycastle.crypto.p;
import org.bouncycastle.crypto.v;
import org.spongycastle.pqc.jcajce.spec.McElieceCCA2KeyGenParameterSpec;
import r70.f;

/* loaded from: classes5.dex */
class d {

    /* renamed from: a  reason: collision with root package name */
    static final Hashtable f57123a;

    static {
        Hashtable hashtable = new Hashtable();
        f57123a = hashtable;
        hashtable.put(McElieceCCA2KeyGenParameterSpec.SHA1, f.d(128));
        hashtable.put(McElieceCCA2KeyGenParameterSpec.SHA224, f.d(192));
        hashtable.put(McElieceCCA2KeyGenParameterSpec.SHA256, f.d(256));
        hashtable.put(McElieceCCA2KeyGenParameterSpec.SHA384, f.d(256));
        hashtable.put(McElieceCCA2KeyGenParameterSpec.SHA512, f.d(256));
        hashtable.put("SHA-512/224", f.d(192));
        hashtable.put("SHA-512/256", f.d(256));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(p pVar) {
        return ((Integer) f57123a.get(pVar.getAlgorithmName())).intValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int b(v vVar) {
        String algorithmName = vVar.getAlgorithmName();
        return ((Integer) f57123a.get(algorithmName.substring(0, algorithmName.indexOf("/")))).intValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static byte[] c(p pVar, byte[] bArr, int i11) {
        int i12 = (i11 + 7) / 8;
        byte[] bArr2 = new byte[i12];
        int digestSize = i12 / pVar.getDigestSize();
        int digestSize2 = pVar.getDigestSize();
        byte[] bArr3 = new byte[digestSize2];
        int i13 = 1;
        int i14 = 0;
        for (int i15 = 0; i15 <= digestSize; i15++) {
            pVar.update((byte) i13);
            pVar.update((byte) (i11 >> 24));
            pVar.update((byte) (i11 >> 16));
            pVar.update((byte) (i11 >> 8));
            pVar.update((byte) i11);
            pVar.update(bArr, 0, bArr.length);
            pVar.doFinal(bArr3, 0);
            int i16 = i15 * digestSize2;
            int i17 = i12 - i16;
            if (i17 > digestSize2) {
                i17 = digestSize2;
            }
            System.arraycopy(bArr3, 0, bArr2, i16, i17);
            i13++;
        }
        int i18 = i11 % 8;
        if (i18 != 0) {
            int i19 = 8 - i18;
            int i21 = 0;
            while (i14 != i12) {
                int i22 = bArr2[i14] & 255;
                bArr2[i14] = (byte) ((i21 << (8 - i19)) | (i22 >>> i19));
                i14++;
                i21 = i22;
            }
        }
        return bArr2;
    }
}