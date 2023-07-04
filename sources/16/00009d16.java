package org.spongycastle.crypto.tls;

/* loaded from: classes4.dex */
class DTLSRecordLayer implements DatagramTransport {
    private static final int MAX_FRAGMENT_LENGTH = 16384;
    private static final int RECORD_HEADER_LENGTH = 13;
    private static final long RETRANSMIT_TIMEOUT = 240000;
    private static final long TCP_MSL = 120000;
    private final TlsContext context;
    private DTLSEpoch currentEpoch;
    private final TlsPeer peer;
    private DTLSEpoch pendingEpoch;
    private volatile int plaintextLimit;
    private DTLSEpoch readEpoch;
    private final DatagramTransport transport;
    private DTLSEpoch writeEpoch;
    private final ByteQueue recordQueue = new ByteQueue();
    private volatile boolean closed = false;
    private volatile boolean failed = false;
    private volatile ProtocolVersion readVersion = null;
    private volatile ProtocolVersion writeVersion = null;
    private DTLSHandshakeRetransmit retransmit = null;
    private DTLSEpoch retransmitEpoch = null;
    private long retransmitExpiry = 0;
    private volatile boolean inHandshake = true;

    /* JADX INFO: Access modifiers changed from: package-private */
    public DTLSRecordLayer(DatagramTransport datagramTransport, TlsContext tlsContext, TlsPeer tlsPeer, short s11) {
        this.transport = datagramTransport;
        this.context = tlsContext;
        this.peer = tlsPeer;
        DTLSEpoch dTLSEpoch = new DTLSEpoch(0, new TlsNullCipher(tlsContext));
        this.currentEpoch = dTLSEpoch;
        this.pendingEpoch = null;
        this.readEpoch = dTLSEpoch;
        this.writeEpoch = dTLSEpoch;
        setPlaintextLimit(16384);
    }

    private void closeTransport() {
        if (this.closed) {
            return;
        }
        try {
            if (!this.failed) {
                warn((short) 0, null);
            }
            this.transport.close();
        } catch (Exception unused) {
        }
        this.closed = true;
    }

    private static long getMacSequenceNumber(int i11, long j11) {
        return ((i11 & 4294967295L) << 48) | j11;
    }

    private void raiseAlert(short s11, short s12, String str, Throwable th2) {
        this.peer.notifyAlertRaised(s11, s12, str, th2);
        sendRecord((short) 21, new byte[]{(byte) s11, (byte) s12}, 0, 2);
    }

    private int receiveRecord(byte[] bArr, int i11, int i12, int i13) {
        int readUint16;
        int i14;
        if (this.recordQueue.available() > 0) {
            if (this.recordQueue.available() >= 13) {
                byte[] bArr2 = new byte[2];
                this.recordQueue.read(bArr2, 0, 2, 11);
                i14 = TlsUtils.readUint16(bArr2, 0);
            } else {
                i14 = 0;
            }
            int min = Math.min(this.recordQueue.available(), i14 + 13);
            this.recordQueue.removeData(bArr, i11, min, 0);
            return min;
        }
        int receive = this.transport.receive(bArr, i11, i12, i13);
        if (receive < 13 || receive <= (readUint16 = TlsUtils.readUint16(bArr, i11 + 11) + 13)) {
            return receive;
        }
        this.recordQueue.addData(bArr, i11 + readUint16, receive - readUint16);
        return readUint16;
    }

    private void sendRecord(short s11, byte[] bArr, int i11, int i12) {
        if (this.writeVersion == null) {
            return;
        }
        if (i12 > this.plaintextLimit) {
            throw new TlsFatalAlert((short) 80);
        }
        if (i12 < 1 && s11 != 23) {
            throw new TlsFatalAlert((short) 80);
        }
        int epoch = this.writeEpoch.getEpoch();
        long allocateSequenceNumber = this.writeEpoch.allocateSequenceNumber();
        byte[] encodePlaintext = this.writeEpoch.getCipher().encodePlaintext(getMacSequenceNumber(epoch, allocateSequenceNumber), s11, bArr, i11, i12);
        int length = encodePlaintext.length + 13;
        byte[] bArr2 = new byte[length];
        TlsUtils.writeUint8(s11, bArr2, 0);
        TlsUtils.writeVersion(this.writeVersion, bArr2, 1);
        TlsUtils.writeUint16(epoch, bArr2, 3);
        TlsUtils.writeUint48(allocateSequenceNumber, bArr2, 5);
        TlsUtils.writeUint16(encodePlaintext.length, bArr2, 11);
        System.arraycopy(encodePlaintext, 0, bArr2, 13, encodePlaintext.length);
        this.transport.send(bArr2, 0, length);
    }

    @Override // org.spongycastle.crypto.tls.DatagramTransport
    public void close() {
        if (this.closed) {
            return;
        }
        if (this.inHandshake) {
            warn((short) 90, "User canceled handshake");
        }
        closeTransport();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void fail(short s11) {
        if (this.closed) {
            return;
        }
        try {
            raiseAlert((short) 2, s11, null, null);
        } catch (Exception unused) {
        }
        this.failed = true;
        closeTransport();
    }

    void failed() {
        if (this.closed) {
            return;
        }
        this.failed = true;
        closeTransport();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ProtocolVersion getReadVersion() {
        return this.readVersion;
    }

    @Override // org.spongycastle.crypto.tls.DatagramTransport
    public int getReceiveLimit() {
        return Math.min(this.plaintextLimit, this.readEpoch.getCipher().getPlaintextLimit(this.transport.getReceiveLimit() - 13));
    }

    @Override // org.spongycastle.crypto.tls.DatagramTransport
    public int getSendLimit() {
        return Math.min(this.plaintextLimit, this.writeEpoch.getCipher().getPlaintextLimit(this.transport.getSendLimit() - 13));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void handshakeSuccessful(DTLSHandshakeRetransmit dTLSHandshakeRetransmit) {
        DTLSEpoch dTLSEpoch = this.readEpoch;
        DTLSEpoch dTLSEpoch2 = this.currentEpoch;
        if (dTLSEpoch != dTLSEpoch2 && this.writeEpoch != dTLSEpoch2) {
            if (dTLSHandshakeRetransmit != null) {
                this.retransmit = dTLSHandshakeRetransmit;
                this.retransmitEpoch = dTLSEpoch2;
                this.retransmitExpiry = System.currentTimeMillis() + RETRANSMIT_TIMEOUT;
            }
            this.inHandshake = false;
            this.currentEpoch = this.pendingEpoch;
            this.pendingEpoch = null;
            return;
        }
        throw new IllegalStateException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void initPendingEpoch(TlsCipher tlsCipher) {
        if (this.pendingEpoch == null) {
            this.pendingEpoch = new DTLSEpoch(this.writeEpoch.getEpoch() + 1, tlsCipher);
            return;
        }
        throw new IllegalStateException();
    }

    /* JADX WARN: Code restructure failed: missing block: B:84:0x0122, code lost:
        if (r18.inHandshake != false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0126, code lost:
        if (r18.retransmit == null) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0128, code lost:
        r18.retransmit = null;
        r18.retransmitEpoch = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x012d, code lost:
        java.lang.System.arraycopy(r3, 0, r19, r20, r3.length);
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0137, code lost:
        return r3.length;
     */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0074 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0075 A[Catch: IOException -> 0x0138, TryCatch #0 {IOException -> 0x0138, blocks: (B:8:0x0018, B:10:0x001c, B:12:0x0026, B:13:0x002a, B:18:0x003b, B:21:0x0045, B:22:0x0049, B:24:0x004d, B:26:0x005a, B:38:0x0075, B:41:0x0085, B:44:0x0091, B:46:0x0095, B:49:0x009e, B:52:0x00cc, B:54:0x00d0, B:55:0x00d2, B:83:0x0120, B:85:0x0124, B:87:0x0128, B:88:0x012d, B:57:0x00d6, B:60:0x00db, B:62:0x00df, B:64:0x00e3, B:65:0x00e9, B:67:0x00ed, B:70:0x00fe, B:71:0x0102, B:72:0x010a, B:74:0x010d, B:76:0x0110, B:82:0x011d, B:79:0x0117, B:81:0x011b, B:30:0x0063, B:32:0x0067, B:34:0x006d), top: B:92:0x0018 }] */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1, types: [org.spongycastle.crypto.tls.DTLSHandshakeRetransmit, org.spongycastle.crypto.tls.DTLSEpoch] */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v3 */
    @Override // org.spongycastle.crypto.tls.DatagramTransport
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int receive(byte[] r19, int r20, int r21, int r22) {
        /*
            Method dump skipped, instructions count: 342
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.spongycastle.crypto.tls.DTLSRecordLayer.receive(byte[], int, int, int):int");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void resetWriteEpoch() {
        DTLSEpoch dTLSEpoch = this.retransmitEpoch;
        if (dTLSEpoch != null) {
            this.writeEpoch = dTLSEpoch;
        } else {
            this.writeEpoch = this.currentEpoch;
        }
    }

    @Override // org.spongycastle.crypto.tls.DatagramTransport
    public void send(byte[] bArr, int i11, int i12) {
        short s11;
        if (this.inHandshake || this.writeEpoch == this.retransmitEpoch) {
            s11 = 22;
            if (TlsUtils.readUint8(bArr, i11) == 20) {
                DTLSEpoch dTLSEpoch = null;
                if (this.inHandshake) {
                    dTLSEpoch = this.pendingEpoch;
                } else if (this.writeEpoch == this.retransmitEpoch) {
                    dTLSEpoch = this.currentEpoch;
                }
                if (dTLSEpoch != null) {
                    sendRecord((short) 20, new byte[]{1}, 0, 1);
                    this.writeEpoch = dTLSEpoch;
                } else {
                    throw new IllegalStateException();
                }
            }
        } else {
            s11 = 23;
        }
        sendRecord(s11, bArr, i11, i12);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setPlaintextLimit(int i11) {
        this.plaintextLimit = i11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setReadVersion(ProtocolVersion protocolVersion) {
        this.readVersion = protocolVersion;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setWriteVersion(ProtocolVersion protocolVersion) {
        this.writeVersion = protocolVersion;
    }

    void warn(short s11, String str) {
        raiseAlert((short) 1, s11, str, null);
    }
}