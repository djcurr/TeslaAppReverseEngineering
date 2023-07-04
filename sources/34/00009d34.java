package org.spongycastle.crypto.tls;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import org.spongycastle.util.Arrays;
import org.spongycastle.util.io.Streams;

/* loaded from: classes4.dex */
public class HeartbeatMessage {
    protected int paddingLength;
    protected byte[] payload;
    protected short type;

    /* loaded from: classes4.dex */
    static class PayloadBuffer extends ByteArrayOutputStream {
        PayloadBuffer() {
        }

        byte[] toTruncatedByteArray(int i11) {
            if (((ByteArrayOutputStream) this).count < i11 + 16) {
                return null;
            }
            return Arrays.copyOf(((ByteArrayOutputStream) this).buf, i11);
        }
    }

    public HeartbeatMessage(short s11, byte[] bArr, int i11) {
        if (HeartbeatMessageType.isValid(s11)) {
            if (bArr == null || bArr.length >= 65536) {
                throw new IllegalArgumentException("'payload' must have length < 2^16");
            }
            if (i11 >= 16) {
                this.type = s11;
                this.payload = bArr;
                this.paddingLength = i11;
                return;
            }
            throw new IllegalArgumentException("'paddingLength' must be at least 16");
        }
        throw new IllegalArgumentException("'type' is not a valid HeartbeatMessageType value");
    }

    public static HeartbeatMessage parse(InputStream inputStream) {
        short readUint8 = TlsUtils.readUint8(inputStream);
        if (HeartbeatMessageType.isValid(readUint8)) {
            int readUint16 = TlsUtils.readUint16(inputStream);
            PayloadBuffer payloadBuffer = new PayloadBuffer();
            Streams.pipeAll(inputStream, payloadBuffer);
            byte[] truncatedByteArray = payloadBuffer.toTruncatedByteArray(readUint16);
            if (truncatedByteArray == null) {
                return null;
            }
            return new HeartbeatMessage(readUint8, truncatedByteArray, payloadBuffer.size() - truncatedByteArray.length);
        }
        throw new TlsFatalAlert((short) 47);
    }

    public void encode(TlsContext tlsContext, OutputStream outputStream) {
        TlsUtils.writeUint8(this.type, outputStream);
        TlsUtils.checkUint16(this.payload.length);
        TlsUtils.writeUint16(this.payload.length, outputStream);
        outputStream.write(this.payload);
        byte[] bArr = new byte[this.paddingLength];
        tlsContext.getNonceRandomGenerator().nextBytes(bArr);
        outputStream.write(bArr);
    }
}