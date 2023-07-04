package nc;

import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import org.spongycastle.i18n.LocalizedMessage;

/* loaded from: classes.dex */
public final class d {
    public static String a(byte[] bArr) {
        if (bArr.length > 2 && bArr[0] == 27 && bArr[1] == 37 && bArr[2] == 71) {
            return "UTF-8";
        }
        if (bArr.length > 3 && bArr[0] == 27 && ((bArr[3] & 255) | ((bArr[2] & 255) << 8) | ((bArr[1] & 255) << 16)) == 14844066 && bArr[4] == 65) {
            return LocalizedMessage.DEFAULT_ENCODING;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Charset b(byte[] bArr) {
        String[] strArr = {"UTF-8", System.getProperty("file.encoding"), LocalizedMessage.DEFAULT_ENCODING};
        for (int i11 = 0; i11 < 3; i11++) {
            Charset forName = Charset.forName(strArr[i11]);
            try {
                forName.newDecoder().decode(ByteBuffer.wrap(bArr));
                return forName;
            } catch (CharacterCodingException unused) {
            }
        }
        return null;
    }
}