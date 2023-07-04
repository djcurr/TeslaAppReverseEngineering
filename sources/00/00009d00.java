package org.spongycastle.crypto.tls;

import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: classes4.dex */
public class CertificateStatusRequest {
    protected Object request;
    protected short statusType;

    public CertificateStatusRequest(short s11, Object obj) {
        if (isCorrectType(s11, obj)) {
            this.statusType = s11;
            this.request = obj;
            return;
        }
        throw new IllegalArgumentException("'request' is not an instance of the correct type");
    }

    protected static boolean isCorrectType(short s11, Object obj) {
        if (s11 == 1) {
            return obj instanceof OCSPStatusRequest;
        }
        throw new IllegalArgumentException("'statusType' is an unsupported value");
    }

    public static CertificateStatusRequest parse(InputStream inputStream) {
        short readUint8 = TlsUtils.readUint8(inputStream);
        if (readUint8 == 1) {
            return new CertificateStatusRequest(readUint8, OCSPStatusRequest.parse(inputStream));
        }
        throw new TlsFatalAlert((short) 50);
    }

    public void encode(OutputStream outputStream) {
        TlsUtils.writeUint8(this.statusType, outputStream);
        if (this.statusType == 1) {
            ((OCSPStatusRequest) this.request).encode(outputStream);
            return;
        }
        throw new TlsFatalAlert((short) 80);
    }

    public OCSPStatusRequest getOCSPStatusRequest() {
        if (isCorrectType((short) 1, this.request)) {
            return (OCSPStatusRequest) this.request;
        }
        throw new IllegalStateException("'request' is not an OCSPStatusRequest");
    }

    public Object getRequest() {
        return this.request;
    }

    public short getStatusType() {
        return this.statusType;
    }
}