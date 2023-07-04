package bc;

import org.spongycastle.crypto.tls.CipherSuite;
import org.spongycastle.math.ec.Tnaf;

/* loaded from: classes.dex */
public class b {
    public static int a(byte[] bArr) {
        return (bArr[3] & 255) | ((bArr[0] << 24) & (-16777216)) | ((bArr[1] << Tnaf.POW_2_WIDTH) & 16711680) | ((bArr[2] << 8) & CipherSuite.DRAFT_TLS_DHE_RSA_WITH_AES_128_OCB);
    }
}