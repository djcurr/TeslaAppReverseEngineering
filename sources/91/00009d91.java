package org.spongycastle.crypto.tls;

import java.io.InputStream;
import java.io.OutputStream;
import org.spongycastle.util.Strings;

/* loaded from: classes4.dex */
public class URLAndHash {
    protected byte[] sha1Hash;
    protected String url;

    public URLAndHash(String str, byte[] bArr) {
        if (str != null && str.length() >= 1 && str.length() < 65536) {
            if (bArr != null && bArr.length != 20) {
                throw new IllegalArgumentException("'sha1Hash' must have length == 20, if present");
            }
            this.url = str;
            this.sha1Hash = bArr;
            return;
        }
        throw new IllegalArgumentException("'url' must have length from 1 to (2^16 - 1)");
    }

    public static URLAndHash parse(TlsContext tlsContext, InputStream inputStream) {
        byte[] readOpaque16 = TlsUtils.readOpaque16(inputStream);
        if (readOpaque16.length >= 1) {
            String fromByteArray = Strings.fromByteArray(readOpaque16);
            byte[] bArr = null;
            short readUint8 = TlsUtils.readUint8(inputStream);
            if (readUint8 != 0) {
                if (readUint8 == 1) {
                    bArr = TlsUtils.readFully(20, inputStream);
                } else {
                    throw new TlsFatalAlert((short) 47);
                }
            } else if (TlsUtils.isTLSv12(tlsContext)) {
                throw new TlsFatalAlert((short) 47);
            }
            return new URLAndHash(fromByteArray, bArr);
        }
        throw new TlsFatalAlert((short) 47);
    }

    public void encode(OutputStream outputStream) {
        TlsUtils.writeOpaque16(Strings.toByteArray(this.url), outputStream);
        if (this.sha1Hash == null) {
            TlsUtils.writeUint8(0, outputStream);
            return;
        }
        TlsUtils.writeUint8(1, outputStream);
        outputStream.write(this.sha1Hash);
    }

    public byte[] getSHA1Hash() {
        return this.sha1Hash;
    }

    public String getURL() {
        return this.url;
    }
}