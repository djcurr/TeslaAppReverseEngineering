package v50;

import java.io.IOException;
import java.io.InputStream;
import org.bouncycastle.crypto.u;
import u50.e0;
import u50.y;

/* loaded from: classes5.dex */
public class b implements u {

    /* renamed from: a  reason: collision with root package name */
    private y f54084a;

    public b(y yVar) {
        this.f54084a = yVar;
    }

    @Override // org.bouncycastle.crypto.u
    public u50.b readKey(InputStream inputStream) {
        byte[] bArr;
        int read = inputStream.read();
        if (read != 0) {
            if (read == 2 || read == 3) {
                bArr = new byte[((this.f54084a.a().t() + 7) / 8) + 1];
            } else if (read != 4 && read != 6 && read != 7) {
                throw new IOException("Sender's public key has invalid point encoding 0x" + Integer.toString(read, 16));
            } else {
                bArr = new byte[(((this.f54084a.a().t() + 7) / 8) * 2) + 1];
            }
            bArr[0] = (byte) read;
            t70.a.f(inputStream, bArr, 1, bArr.length - 1);
            return new e0(this.f54084a.a().j(bArr), this.f54084a);
        }
        throw new IOException("Sender's public key invalid.");
    }
}