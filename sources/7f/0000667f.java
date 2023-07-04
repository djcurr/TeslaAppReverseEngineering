package e00;

import java.io.InputStream;
import java.io.OutputStream;
import kotlin.jvm.internal.s;
import org.spongycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes5.dex */
public final class a {
    public static final long a(InputStream inputStream, OutputStream out, int i11) {
        s.g(inputStream, "<this>");
        s.g(out, "out");
        byte[] bArr = new byte[i11];
        int read = inputStream.read(bArr);
        long j11 = 0;
        while (read >= 0) {
            out.write(bArr, 0, read);
            j11 += read;
            read = inputStream.read(bArr);
        }
        return j11;
    }

    public static /* synthetic */ long b(InputStream inputStream, OutputStream outputStream, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = PKIFailureInfo.certRevoked;
        }
        return a(inputStream, outputStream, i11);
    }
}