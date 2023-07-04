package org.spongycastle.crypto.tls;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public class RecordStream {
    private static int DEFAULT_PLAINTEXT_LIMIT = 16384;
    static final int TLS_HEADER_LENGTH_OFFSET = 3;
    static final int TLS_HEADER_SIZE = 5;
    static final int TLS_HEADER_TYPE_OFFSET = 0;
    static final int TLS_HEADER_VERSION_OFFSET = 1;
    private int ciphertextLimit;
    private int compressedLimit;
    private TlsProtocol handler;
    private InputStream input;
    private OutputStream output;
    private int plaintextLimit;
    private TlsCompression readCompression;
    private TlsCompression writeCompression;
    private TlsCompression pendingCompression = null;
    private TlsCipher pendingCipher = null;
    private TlsCipher readCipher = null;
    private TlsCipher writeCipher = null;
    private long readSeqNo = 0;
    private long writeSeqNo = 0;
    private ByteArrayOutputStream buffer = new ByteArrayOutputStream();
    private TlsHandshakeHash handshakeHash = null;
    private ProtocolVersion readVersion = null;
    private ProtocolVersion writeVersion = null;
    private boolean restrictReadVersion = true;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RecordStream(TlsProtocol tlsProtocol, InputStream inputStream, OutputStream outputStream) {
        this.readCompression = null;
        this.writeCompression = null;
        this.handler = tlsProtocol;
        this.input = inputStream;
        this.output = outputStream;
        TlsNullCompression tlsNullCompression = new TlsNullCompression();
        this.readCompression = tlsNullCompression;
        this.writeCompression = tlsNullCompression;
    }

    private static void checkLength(int i11, int i12, short s11) {
        if (i11 > i12) {
            throw new TlsFatalAlert(s11);
        }
    }

    private static void checkType(short s11, short s12) {
        switch (s11) {
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
                return;
            default:
                throw new TlsFatalAlert(s12);
        }
    }

    private byte[] getBufferContents() {
        byte[] byteArray = this.buffer.toByteArray();
        this.buffer.reset();
        return byteArray;
    }

    byte[] decodeAndVerify(short s11, InputStream inputStream, int i11) {
        checkLength(i11, this.ciphertextLimit, (short) 22);
        byte[] readFully = TlsUtils.readFully(i11, inputStream);
        TlsCipher tlsCipher = this.readCipher;
        long j11 = this.readSeqNo;
        this.readSeqNo = 1 + j11;
        byte[] decodeCiphertext = tlsCipher.decodeCiphertext(j11, s11, readFully, 0, readFully.length);
        checkLength(decodeCiphertext.length, this.compressedLimit, (short) 22);
        OutputStream decompress = this.readCompression.decompress(this.buffer);
        if (decompress != this.buffer) {
            decompress.write(decodeCiphertext, 0, decodeCiphertext.length);
            decompress.flush();
            decodeCiphertext = getBufferContents();
        }
        checkLength(decodeCiphertext.length, this.plaintextLimit, (short) 30);
        if (decodeCiphertext.length >= 1 || s11 == 23) {
            return decodeCiphertext;
        }
        throw new TlsFatalAlert((short) 47);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void finaliseHandshake() {
        TlsCompression tlsCompression = this.readCompression;
        TlsCompression tlsCompression2 = this.pendingCompression;
        if (tlsCompression == tlsCompression2 && this.writeCompression == tlsCompression2) {
            TlsCipher tlsCipher = this.readCipher;
            TlsCipher tlsCipher2 = this.pendingCipher;
            if (tlsCipher == tlsCipher2 && this.writeCipher == tlsCipher2) {
                this.pendingCompression = null;
                this.pendingCipher = null;
                return;
            }
        }
        throw new TlsFatalAlert((short) 40);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void flush() {
        this.output.flush();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public TlsHandshakeHash getHandshakeHash() {
        return this.handshakeHash;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getPlaintextLimit() {
        return this.plaintextLimit;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ProtocolVersion getReadVersion() {
        return this.readVersion;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void init(TlsContext tlsContext) {
        TlsNullCipher tlsNullCipher = new TlsNullCipher(tlsContext);
        this.readCipher = tlsNullCipher;
        this.writeCipher = tlsNullCipher;
        DeferredHash deferredHash = new DeferredHash();
        this.handshakeHash = deferredHash;
        deferredHash.init(tlsContext);
        setPlaintextLimit(DEFAULT_PLAINTEXT_LIMIT);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void notifyHelloComplete() {
        this.handshakeHash = this.handshakeHash.notifyPRFDetermined();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public TlsHandshakeHash prepareToFinish() {
        TlsHandshakeHash tlsHandshakeHash = this.handshakeHash;
        this.handshakeHash = tlsHandshakeHash.stopTracking();
        return tlsHandshakeHash;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean readRecord() {
        byte[] readAllOrNothing = TlsUtils.readAllOrNothing(5, this.input);
        if (readAllOrNothing == null) {
            return false;
        }
        short readUint8 = TlsUtils.readUint8(readAllOrNothing, 0);
        checkType(readUint8, (short) 10);
        if (!this.restrictReadVersion) {
            if ((TlsUtils.readVersionRaw(readAllOrNothing, 1) & (-256)) != 768) {
                throw new TlsFatalAlert((short) 47);
            }
        } else {
            ProtocolVersion readVersion = TlsUtils.readVersion(readAllOrNothing, 1);
            ProtocolVersion protocolVersion = this.readVersion;
            if (protocolVersion == null) {
                this.readVersion = readVersion;
            } else if (!readVersion.equals(protocolVersion)) {
                throw new TlsFatalAlert((short) 47);
            }
        }
        byte[] decodeAndVerify = decodeAndVerify(readUint8, this.input, TlsUtils.readUint16(readAllOrNothing, 3));
        this.handler.processRecord(readUint8, decodeAndVerify, 0, decodeAndVerify.length);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void receivedReadCipherSpec() {
        TlsCipher tlsCipher;
        TlsCompression tlsCompression = this.pendingCompression;
        if (tlsCompression != null && (tlsCipher = this.pendingCipher) != null) {
            this.readCompression = tlsCompression;
            this.readCipher = tlsCipher;
            this.readSeqNo = 0L;
            return;
        }
        throw new TlsFatalAlert((short) 40);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void safeClose() {
        try {
            this.input.close();
        } catch (IOException unused) {
        }
        try {
            this.output.close();
        } catch (IOException unused2) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void sentWriteCipherSpec() {
        TlsCipher tlsCipher;
        TlsCompression tlsCompression = this.pendingCompression;
        if (tlsCompression != null && (tlsCipher = this.pendingCipher) != null) {
            this.writeCompression = tlsCompression;
            this.writeCipher = tlsCipher;
            this.writeSeqNo = 0L;
            return;
        }
        throw new TlsFatalAlert((short) 40);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setPendingConnectionState(TlsCompression tlsCompression, TlsCipher tlsCipher) {
        this.pendingCompression = tlsCompression;
        this.pendingCipher = tlsCipher;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setPlaintextLimit(int i11) {
        this.plaintextLimit = i11;
        int i12 = i11 + 1024;
        this.compressedLimit = i12;
        this.ciphertextLimit = i12 + 1024;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setReadVersion(ProtocolVersion protocolVersion) {
        this.readVersion = protocolVersion;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setRestrictReadVersion(boolean z11) {
        this.restrictReadVersion = z11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setWriteVersion(ProtocolVersion protocolVersion) {
        this.writeVersion = protocolVersion;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void updateHandshakeData(byte[] bArr, int i11, int i12) {
        this.handshakeHash.update(bArr, i11, i12);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void writeRecord(short s11, byte[] bArr, int i11, int i12) {
        byte[] encodePlaintext;
        if (this.writeVersion == null) {
            return;
        }
        checkType(s11, (short) 80);
        checkLength(i12, this.plaintextLimit, (short) 80);
        if (i12 < 1 && s11 != 23) {
            throw new TlsFatalAlert((short) 80);
        }
        if (s11 == 22) {
            updateHandshakeData(bArr, i11, i12);
        }
        OutputStream compress = this.writeCompression.compress(this.buffer);
        if (compress == this.buffer) {
            TlsCipher tlsCipher = this.writeCipher;
            long j11 = this.writeSeqNo;
            this.writeSeqNo = 1 + j11;
            encodePlaintext = tlsCipher.encodePlaintext(j11, s11, bArr, i11, i12);
        } else {
            compress.write(bArr, i11, i12);
            compress.flush();
            byte[] bufferContents = getBufferContents();
            checkLength(bufferContents.length, i12 + 1024, (short) 80);
            TlsCipher tlsCipher2 = this.writeCipher;
            long j12 = this.writeSeqNo;
            this.writeSeqNo = 1 + j12;
            encodePlaintext = tlsCipher2.encodePlaintext(j12, s11, bufferContents, 0, bufferContents.length);
        }
        checkLength(encodePlaintext.length, this.ciphertextLimit, (short) 80);
        byte[] bArr2 = new byte[encodePlaintext.length + 5];
        TlsUtils.writeUint8(s11, bArr2, 0);
        TlsUtils.writeVersion(this.writeVersion, bArr2, 1);
        TlsUtils.writeUint16(encodePlaintext.length, bArr2, 3);
        System.arraycopy(encodePlaintext, 0, bArr2, 5, encodePlaintext.length);
        this.output.write(bArr2);
        this.output.flush();
    }
}