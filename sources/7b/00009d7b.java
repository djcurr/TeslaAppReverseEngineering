package org.spongycastle.crypto.tls;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.SecureRandom;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import org.spongycastle.crypto.Digest;
import org.spongycastle.crypto.prng.RandomGenerator;
import org.spongycastle.crypto.tls.SessionParameters;
import org.spongycastle.util.Arrays;
import org.spongycastle.util.Integers;

/* loaded from: classes4.dex */
public abstract class TlsProtocol {
    protected static final short ADS_MODE_0_N = 1;
    protected static final short ADS_MODE_0_N_FIRSTONLY = 2;
    protected static final short ADS_MODE_1_Nsub1 = 0;
    protected static final short CS_CERTIFICATE_REQUEST = 7;
    protected static final short CS_CERTIFICATE_STATUS = 5;
    protected static final short CS_CERTIFICATE_VERIFY = 12;
    protected static final short CS_CLIENT_CERTIFICATE = 10;
    protected static final short CS_CLIENT_FINISHED = 13;
    protected static final short CS_CLIENT_HELLO = 1;
    protected static final short CS_CLIENT_KEY_EXCHANGE = 11;
    protected static final short CS_CLIENT_SUPPLEMENTAL_DATA = 9;
    protected static final short CS_END = 16;
    protected static final short CS_SERVER_CERTIFICATE = 4;
    protected static final short CS_SERVER_FINISHED = 15;
    protected static final short CS_SERVER_HELLO = 2;
    protected static final short CS_SERVER_HELLO_DONE = 8;
    protected static final short CS_SERVER_KEY_EXCHANGE = 6;
    protected static final short CS_SERVER_SESSION_TICKET = 14;
    protected static final short CS_SERVER_SUPPLEMENTAL_DATA = 3;
    protected static final short CS_START = 0;
    protected static final Integer EXT_RenegotiationInfo = Integers.valueOf(65281);
    protected static final Integer EXT_SessionTicket = Integers.valueOf(35);
    private static final String TLS_ERROR_MESSAGE = "Internal TLS error, this could be an attack";
    private ByteQueue alertQueue;
    protected boolean allowCertificateStatus;
    private volatile boolean appDataReady;
    private volatile boolean appDataSplitEnabled;
    private volatile int appDataSplitMode;
    private ByteQueue applicationDataQueue;
    protected boolean blocking;
    protected Hashtable clientExtensions;
    private volatile boolean closed;
    protected short connection_state;
    protected boolean expectSessionTicket;
    private byte[] expected_verify_data;
    private volatile boolean failedWithError;
    private ByteQueue handshakeQueue;
    protected ByteQueueInputStream inputBuffers;
    protected int[] offeredCipherSuites;
    protected short[] offeredCompressionMethods;
    protected ByteQueueOutputStream outputBuffer;
    protected Certificate peerCertificate;
    protected boolean receivedChangeCipherSpec;
    RecordStream recordStream;
    protected boolean resumedSession;
    protected SecureRandom secureRandom;
    protected boolean secure_renegotiation;
    protected SecurityParameters securityParameters;
    protected Hashtable serverExtensions;
    protected SessionParameters sessionParameters;
    private TlsInputStream tlsInputStream;
    private TlsOutputStream tlsOutputStream;
    protected TlsSession tlsSession;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class HandshakeMessage extends ByteArrayOutputStream {
        public HandshakeMessage(TlsProtocol tlsProtocol, short s11) {
            this(s11, 60);
        }

        public void writeToRecordStream() {
            int i11 = ((ByteArrayOutputStream) this).count - 4;
            TlsUtils.checkUint24(i11);
            TlsUtils.writeUint24(i11, ((ByteArrayOutputStream) this).buf, 1);
            TlsProtocol.this.writeHandshakeMessage(((ByteArrayOutputStream) this).buf, 0, ((ByteArrayOutputStream) this).count);
            ((ByteArrayOutputStream) this).buf = null;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public HandshakeMessage(short s11, int i11) {
            super(i11 + 4);
            TlsProtocol.this = r1;
            TlsUtils.writeUint8(s11, (OutputStream) this);
            ((ByteArrayOutputStream) this).count += 3;
        }
    }

    public TlsProtocol(InputStream inputStream, OutputStream outputStream, SecureRandom secureRandom) {
        this.applicationDataQueue = new ByteQueue();
        this.alertQueue = new ByteQueue(2);
        this.handshakeQueue = new ByteQueue();
        this.tlsInputStream = null;
        this.tlsOutputStream = null;
        this.closed = false;
        this.failedWithError = false;
        this.appDataReady = false;
        this.appDataSplitEnabled = true;
        this.appDataSplitMode = 0;
        this.expected_verify_data = null;
        this.tlsSession = null;
        this.sessionParameters = null;
        this.securityParameters = null;
        this.peerCertificate = null;
        this.offeredCipherSuites = null;
        this.offeredCompressionMethods = null;
        this.clientExtensions = null;
        this.serverExtensions = null;
        this.connection_state = (short) 0;
        this.resumedSession = false;
        this.receivedChangeCipherSpec = false;
        this.secure_renegotiation = false;
        this.allowCertificateStatus = false;
        this.expectSessionTicket = false;
        this.blocking = true;
        this.recordStream = new RecordStream(this, inputStream, outputStream);
        this.secureRandom = secureRandom;
    }

    public static void assertEmpty(ByteArrayInputStream byteArrayInputStream) {
        if (byteArrayInputStream.available() > 0) {
            throw new TlsFatalAlert((short) 50);
        }
    }

    public static byte[] createRandomBlock(boolean z11, RandomGenerator randomGenerator) {
        byte[] bArr = new byte[32];
        randomGenerator.nextBytes(bArr);
        if (z11) {
            TlsUtils.writeGMTUnixTime(bArr, 0);
        }
        return bArr;
    }

    public static byte[] createRenegotiationInfo(byte[] bArr) {
        return TlsUtils.encodeOpaque8(bArr);
    }

    public static void establishMasterSecret(TlsContext tlsContext, TlsKeyExchange tlsKeyExchange) {
        byte[] generatePremasterSecret = tlsKeyExchange.generatePremasterSecret();
        try {
            tlsContext.getSecurityParameters().masterSecret = TlsUtils.calculateMasterSecret(tlsContext, generatePremasterSecret);
        } finally {
            if (generatePremasterSecret != null) {
                Arrays.fill(generatePremasterSecret, (byte) 0);
            }
        }
    }

    public static byte[] getCurrentPRFHash(TlsContext tlsContext, TlsHandshakeHash tlsHandshakeHash, byte[] bArr) {
        Digest forkPRFHash = tlsHandshakeHash.forkPRFHash();
        if (bArr != null && TlsUtils.isSSL(tlsContext)) {
            forkPRFHash.update(bArr, 0, bArr.length);
        }
        byte[] bArr2 = new byte[forkPRFHash.getDigestSize()];
        forkPRFHash.doFinal(bArr2, 0);
        return bArr2;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int getPRFAlgorithm(org.spongycastle.crypto.tls.TlsContext r4, int r5) {
        /*
            boolean r4 = org.spongycastle.crypto.tls.TlsUtils.isTLSv12(r4)
            r0 = 1
            r1 = 47
            switch(r5) {
                case 59: goto L38;
                case 60: goto L38;
                case 61: goto L38;
                case 62: goto L38;
                case 63: goto L38;
                case 64: goto L38;
                default: goto La;
            }
        La:
            switch(r5) {
                case 103: goto L38;
                case 104: goto L38;
                case 105: goto L38;
                case 106: goto L38;
                case 107: goto L38;
                default: goto Ld;
            }
        Ld:
            r2 = 2
            switch(r5) {
                case 156: goto L38;
                case 157: goto L2f;
                case 158: goto L38;
                case 159: goto L2f;
                case 160: goto L38;
                case 161: goto L2f;
                case 162: goto L38;
                case 163: goto L2f;
                case 164: goto L38;
                case 165: goto L2f;
                default: goto L11;
            }
        L11:
            switch(r5) {
                case 168: goto L38;
                case 169: goto L2f;
                case 170: goto L38;
                case 171: goto L2f;
                case 172: goto L38;
                case 173: goto L2f;
                default: goto L14;
            }
        L14:
            r3 = 0
            switch(r5) {
                case 175: goto L2b;
                case 177: goto L2b;
                case 179: goto L2b;
                case 181: goto L2b;
                case 183: goto L2b;
                case 49208: goto L2b;
                case 49211: goto L2b;
                case 49266: goto L38;
                case 49267: goto L2f;
                case 49268: goto L38;
                case 49269: goto L2f;
                case 49270: goto L38;
                case 49271: goto L2f;
                case 49272: goto L38;
                case 49273: goto L2f;
                case 49274: goto L38;
                case 49275: goto L2f;
                case 49276: goto L38;
                case 49277: goto L2f;
                case 49278: goto L38;
                case 49279: goto L2f;
                case 49280: goto L38;
                case 49281: goto L2f;
                case 49282: goto L38;
                case 49283: goto L2f;
                case 49284: goto L38;
                case 49285: goto L2f;
                case 49286: goto L38;
                case 49287: goto L2f;
                case 49288: goto L38;
                case 49289: goto L2f;
                case 49290: goto L38;
                case 49291: goto L2f;
                case 49292: goto L38;
                case 49293: goto L2f;
                case 49294: goto L38;
                case 49295: goto L2f;
                case 49296: goto L38;
                case 49297: goto L2f;
                case 49298: goto L38;
                case 49299: goto L2f;
                case 49301: goto L2b;
                case 49303: goto L2b;
                case 49305: goto L2b;
                case 65296: goto L38;
                case 65297: goto L38;
                case 65298: goto L38;
                case 65299: goto L38;
                case 65300: goto L38;
                case 65301: goto L38;
                default: goto L18;
            }
        L18:
            switch(r5) {
                case 185: goto L2b;
                case 186: goto L38;
                case 187: goto L38;
                case 188: goto L38;
                case 189: goto L38;
                case 190: goto L38;
                case 191: goto L38;
                case 192: goto L38;
                case 193: goto L38;
                case 194: goto L38;
                case 195: goto L38;
                case 196: goto L38;
                case 197: goto L38;
                default: goto L1b;
            }
        L1b:
            switch(r5) {
                case 49187: goto L38;
                case 49188: goto L2f;
                case 49189: goto L38;
                case 49190: goto L2f;
                case 49191: goto L38;
                case 49192: goto L2f;
                case 49193: goto L38;
                case 49194: goto L2f;
                case 49195: goto L38;
                case 49196: goto L2f;
                case 49197: goto L38;
                case 49198: goto L2f;
                case 49199: goto L38;
                case 49200: goto L2f;
                case 49201: goto L38;
                case 49202: goto L2f;
                default: goto L1e;
            }
        L1e:
            switch(r5) {
                case 49307: goto L2b;
                case 49308: goto L38;
                case 49309: goto L38;
                case 49310: goto L38;
                case 49311: goto L38;
                case 49312: goto L38;
                case 49313: goto L38;
                case 49314: goto L38;
                case 49315: goto L38;
                case 49316: goto L38;
                case 49317: goto L38;
                case 49318: goto L38;
                case 49319: goto L38;
                case 49320: goto L38;
                case 49321: goto L38;
                case 49322: goto L38;
                case 49323: goto L38;
                case 49324: goto L38;
                case 49325: goto L38;
                case 49326: goto L38;
                case 49327: goto L38;
                default: goto L21;
            }
        L21:
            switch(r5) {
                case 52392: goto L38;
                case 52393: goto L38;
                case 52394: goto L38;
                case 52395: goto L38;
                case 52396: goto L38;
                case 52397: goto L38;
                case 52398: goto L38;
                default: goto L24;
            }
        L24:
            switch(r5) {
                case 65280: goto L38;
                case 65281: goto L38;
                case 65282: goto L38;
                case 65283: goto L38;
                case 65284: goto L38;
                case 65285: goto L38;
                default: goto L27;
            }
        L27:
            if (r4 == 0) goto L2a
            return r0
        L2a:
            return r3
        L2b:
            if (r4 == 0) goto L2e
            return r2
        L2e:
            return r3
        L2f:
            if (r4 == 0) goto L32
            return r2
        L32:
            org.spongycastle.crypto.tls.TlsFatalAlert r4 = new org.spongycastle.crypto.tls.TlsFatalAlert
            r4.<init>(r1)
            throw r4
        L38:
            if (r4 == 0) goto L3b
            return r0
        L3b:
            org.spongycastle.crypto.tls.TlsFatalAlert r4 = new org.spongycastle.crypto.tls.TlsFatalAlert
            r4.<init>(r1)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: org.spongycastle.crypto.tls.TlsProtocol.getPRFAlgorithm(org.spongycastle.crypto.tls.TlsContext, int):int");
    }

    private void processAlert() {
        while (this.alertQueue.available() >= 2) {
            byte[] removeData = this.alertQueue.removeData(2, 0);
            short s11 = removeData[0];
            short s12 = removeData[1];
            getPeer().notifyAlertReceived(s11, s12);
            if (s11 != 2) {
                if (s12 == 0) {
                    handleClose(false);
                }
                handleWarningMessage(s12);
            } else {
                invalidateSession();
                this.failedWithError = true;
                this.closed = true;
                this.recordStream.safeClose();
                throw new IOException(TLS_ERROR_MESSAGE);
            }
        }
    }

    private void processApplicationData() {
    }

    private void processChangeCipherSpec(byte[] bArr, int i11, int i12) {
        for (int i13 = 0; i13 < i12; i13++) {
            if (TlsUtils.readUint8(bArr, i11 + i13) == 1) {
                if (!this.receivedChangeCipherSpec && this.alertQueue.available() <= 0 && this.handshakeQueue.available() <= 0) {
                    this.recordStream.receivedReadCipherSpec();
                    this.receivedChangeCipherSpec = true;
                    handleChangeCipherSpecMessage();
                } else {
                    throw new TlsFatalAlert((short) 10);
                }
            } else {
                throw new TlsFatalAlert((short) 50);
            }
        }
    }

    private void processHandshake() {
        boolean z11;
        do {
            z11 = true;
            if (this.handshakeQueue.available() >= 4) {
                byte[] bArr = new byte[4];
                this.handshakeQueue.read(bArr, 0, 4, 0);
                short readUint8 = TlsUtils.readUint8(bArr, 0);
                int readUint24 = TlsUtils.readUint24(bArr, 1);
                if (this.handshakeQueue.available() >= readUint24 + 4) {
                    byte[] removeData = this.handshakeQueue.removeData(readUint24, 4);
                    checkReceivedChangeCipherSpec(this.connection_state == 16 || readUint8 == 20);
                    if (readUint8 != 0) {
                        if (readUint8 == 20) {
                            TlsContext context = getContext();
                            if (this.expected_verify_data == null && context.getSecurityParameters().getMasterSecret() != null) {
                                this.expected_verify_data = createVerifyData(!context.isServer());
                            }
                        }
                        this.recordStream.updateHandshakeData(bArr, 0, 4);
                        this.recordStream.updateHandshakeData(removeData, 0, readUint24);
                    }
                    handleHandshakeMessage(readUint8, removeData);
                    continue;
                }
            }
            z11 = false;
            continue;
        } while (z11);
    }

    public static Hashtable readExtensions(ByteArrayInputStream byteArrayInputStream) {
        if (byteArrayInputStream.available() < 1) {
            return null;
        }
        byte[] readOpaque16 = TlsUtils.readOpaque16(byteArrayInputStream);
        assertEmpty(byteArrayInputStream);
        ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(readOpaque16);
        Hashtable hashtable = new Hashtable();
        while (byteArrayInputStream2.available() > 0) {
            if (hashtable.put(Integers.valueOf(TlsUtils.readUint16(byteArrayInputStream2)), TlsUtils.readOpaque16(byteArrayInputStream2)) != null) {
                throw new TlsFatalAlert((short) 47);
            }
        }
        return hashtable;
    }

    public static Vector readSupplementalDataMessage(ByteArrayInputStream byteArrayInputStream) {
        byte[] readOpaque24 = TlsUtils.readOpaque24(byteArrayInputStream);
        assertEmpty(byteArrayInputStream);
        ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(readOpaque24);
        Vector vector = new Vector();
        while (byteArrayInputStream2.available() > 0) {
            vector.addElement(new SupplementalDataEntry(TlsUtils.readUint16(byteArrayInputStream2), TlsUtils.readOpaque16(byteArrayInputStream2)));
        }
        return vector;
    }

    public static void writeExtensions(OutputStream outputStream, Hashtable hashtable) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        writeSelectedExtensions(byteArrayOutputStream, hashtable, true);
        writeSelectedExtensions(byteArrayOutputStream, hashtable, false);
        TlsUtils.writeOpaque16(byteArrayOutputStream.toByteArray(), outputStream);
    }

    protected static void writeSelectedExtensions(OutputStream outputStream, Hashtable hashtable, boolean z11) {
        Enumeration keys = hashtable.keys();
        while (keys.hasMoreElements()) {
            Integer num = (Integer) keys.nextElement();
            int intValue = num.intValue();
            byte[] bArr = (byte[]) hashtable.get(num);
            if (z11 == (bArr.length == 0)) {
                TlsUtils.checkUint16(intValue);
                TlsUtils.writeUint16(intValue, outputStream);
                TlsUtils.writeOpaque16(bArr, outputStream);
            }
        }
    }

    public static void writeSupplementalData(OutputStream outputStream, Vector vector) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        for (int i11 = 0; i11 < vector.size(); i11++) {
            SupplementalDataEntry supplementalDataEntry = (SupplementalDataEntry) vector.elementAt(i11);
            int dataType = supplementalDataEntry.getDataType();
            TlsUtils.checkUint16(dataType);
            TlsUtils.writeUint16(dataType, byteArrayOutputStream);
            TlsUtils.writeOpaque16(supplementalDataEntry.getData(), byteArrayOutputStream);
        }
        TlsUtils.writeOpaque24(byteArrayOutputStream.toByteArray(), outputStream);
    }

    public int applicationDataAvailable() {
        return this.applicationDataQueue.available();
    }

    public void applyMaxFragmentLengthExtension() {
        short s11 = this.securityParameters.maxFragmentLength;
        if (s11 >= 0) {
            if (MaxFragmentLength.isValid(s11)) {
                this.recordStream.setPlaintextLimit(1 << (this.securityParameters.maxFragmentLength + CS_SERVER_HELLO_DONE));
                return;
            }
            throw new TlsFatalAlert((short) 80);
        }
    }

    public void blockForHandshake() {
        if (this.blocking) {
            while (this.connection_state != 16) {
                safeReadRecord();
            }
        }
    }

    protected void checkReceivedChangeCipherSpec(boolean z11) {
        if (z11 != this.receivedChangeCipherSpec) {
            throw new TlsFatalAlert((short) 10);
        }
    }

    public void cleanupHandshake() {
        byte[] bArr = this.expected_verify_data;
        if (bArr != null) {
            Arrays.fill(bArr, (byte) 0);
            this.expected_verify_data = null;
        }
        this.securityParameters.clear();
        this.peerCertificate = null;
        this.offeredCipherSuites = null;
        this.offeredCompressionMethods = null;
        this.clientExtensions = null;
        this.serverExtensions = null;
        this.resumedSession = false;
        this.receivedChangeCipherSpec = false;
        this.secure_renegotiation = false;
        this.allowCertificateStatus = false;
        this.expectSessionTicket = false;
    }

    public void close() {
        handleClose(true);
    }

    public void completeHandshake() {
        try {
            this.recordStream.finaliseHandshake();
            this.appDataSplitEnabled = !TlsUtils.isTLSv11(getContext());
            if (!this.appDataReady) {
                this.appDataReady = true;
                if (this.blocking) {
                    this.tlsInputStream = new TlsInputStream(this);
                    this.tlsOutputStream = new TlsOutputStream(this);
                }
            }
            if (this.tlsSession != null) {
                if (this.sessionParameters == null) {
                    this.sessionParameters = new SessionParameters.Builder().setCipherSuite(this.securityParameters.getCipherSuite()).setCompressionAlgorithm(this.securityParameters.getCompressionAlgorithm()).setMasterSecret(this.securityParameters.getMasterSecret()).setPeerCertificate(this.peerCertificate).setPSKIdentity(this.securityParameters.getPSKIdentity()).setSRPIdentity(this.securityParameters.getSRPIdentity()).setServerExtensions(this.serverExtensions).build();
                    this.tlsSession = new TlsSessionImpl(this.tlsSession.getSessionID(), this.sessionParameters);
                }
                getContextAdmin().setResumableSession(this.tlsSession);
            }
            getPeer().notifyHandshakeComplete();
        } finally {
            cleanupHandshake();
        }
    }

    protected byte[] createVerifyData(boolean z11) {
        TlsContext context = getContext();
        return TlsUtils.calculateVerifyData(context, z11 ? ExporterLabel.server_finished : ExporterLabel.client_finished, getCurrentPRFHash(context, this.recordStream.getHandshakeHash(), z11 ? TlsUtils.SSL_SERVER : TlsUtils.SSL_CLIENT));
    }

    protected void failWithError(short s11, short s12, String str, Throwable th2) {
        if (!this.closed) {
            this.closed = true;
            if (s11 == 2) {
                invalidateSession();
                this.failedWithError = true;
            }
            raiseAlert(s11, s12, str, th2);
            this.recordStream.safeClose();
            if (s11 != 2) {
                return;
            }
        }
        throw new IOException(TLS_ERROR_MESSAGE);
    }

    public void flush() {
        this.recordStream.flush();
    }

    public int getAvailableInputBytes() {
        if (!this.blocking) {
            return applicationDataAvailable();
        }
        throw new IllegalStateException("Cannot use getAvailableInputBytes() in blocking mode! Use getInputStream().available() instead.");
    }

    public int getAvailableOutputBytes() {
        if (!this.blocking) {
            return this.outputBuffer.getBuffer().available();
        }
        throw new IllegalStateException("Cannot use getAvailableOutputBytes() in blocking mode! Use getOutputStream() instead.");
    }

    protected abstract TlsContext getContext();

    abstract AbstractTlsContext getContextAdmin();

    public InputStream getInputStream() {
        if (this.blocking) {
            return this.tlsInputStream;
        }
        throw new IllegalStateException("Cannot use InputStream in non-blocking mode! Use offerInput() instead.");
    }

    public OutputStream getOutputStream() {
        if (this.blocking) {
            return this.tlsOutputStream;
        }
        throw new IllegalStateException("Cannot use OutputStream in non-blocking mode! Use offerOutput() instead.");
    }

    protected abstract TlsPeer getPeer();

    protected void handleChangeCipherSpecMessage() {
    }

    protected void handleClose(boolean z11) {
        if (this.closed) {
            return;
        }
        if (z11 && !this.appDataReady) {
            raiseWarning((short) 90, "User canceled handshake");
        }
        failWithError((short) 1, (short) 0, "Connection closed", null);
    }

    protected abstract void handleHandshakeMessage(short s11, byte[] bArr);

    public void handleWarningMessage(short s11) {
    }

    public void invalidateSession() {
        SessionParameters sessionParameters = this.sessionParameters;
        if (sessionParameters != null) {
            sessionParameters.clear();
            this.sessionParameters = null;
        }
        TlsSession tlsSession = this.tlsSession;
        if (tlsSession != null) {
            tlsSession.invalidate();
            this.tlsSession = null;
        }
    }

    public boolean isClosed() {
        return this.closed;
    }

    public void offerInput(byte[] bArr) {
        if (!this.blocking) {
            if (!this.closed) {
                this.inputBuffers.addBytes(bArr);
                while (this.inputBuffers.available() >= 5) {
                    byte[] bArr2 = new byte[5];
                    this.inputBuffers.peek(bArr2);
                    if (this.inputBuffers.available() < TlsUtils.readUint16(bArr2, 3) + 5) {
                        return;
                    }
                    safeReadRecord();
                }
                return;
            }
            throw new IOException("Connection is closed, cannot accept any more input");
        }
        throw new IllegalStateException("Cannot use offerInput() in blocking mode! Use getInputStream() instead.");
    }

    public void offerOutput(byte[] bArr, int i11, int i12) {
        if (!this.blocking) {
            if (this.appDataReady) {
                writeData(bArr, i11, i12);
                return;
            }
            throw new IOException("Application data cannot be sent until the handshake is complete!");
        }
        throw new IllegalStateException("Cannot use offerOutput() in blocking mode! Use getOutputStream() instead.");
    }

    public void processFinishedMessage(ByteArrayInputStream byteArrayInputStream) {
        byte[] bArr = this.expected_verify_data;
        if (bArr != null) {
            byte[] readFully = TlsUtils.readFully(bArr.length, byteArrayInputStream);
            assertEmpty(byteArrayInputStream);
            if (!Arrays.constantTimeAreEqual(this.expected_verify_data, readFully)) {
                throw new TlsFatalAlert((short) 51);
            }
            return;
        }
        throw new TlsFatalAlert((short) 80);
    }

    public short processMaxFragmentLengthExtension(Hashtable hashtable, Hashtable hashtable2, short s11) {
        short maxFragmentLengthExtension = TlsExtensionsUtils.getMaxFragmentLengthExtension(hashtable2);
        if (maxFragmentLengthExtension < 0 || (MaxFragmentLength.isValid(maxFragmentLengthExtension) && (this.resumedSession || maxFragmentLengthExtension == TlsExtensionsUtils.getMaxFragmentLengthExtension(hashtable)))) {
            return maxFragmentLengthExtension;
        }
        throw new TlsFatalAlert(s11);
    }

    public void processRecord(short s11, byte[] bArr, int i11, int i12) {
        switch (s11) {
            case 20:
                processChangeCipherSpec(bArr, i11, i12);
                return;
            case 21:
                this.alertQueue.addData(bArr, i11, i12);
                processAlert();
                return;
            case 22:
                this.handshakeQueue.addData(bArr, i11, i12);
                processHandshake();
                return;
            case 23:
                if (this.appDataReady) {
                    this.applicationDataQueue.addData(bArr, i11, i12);
                    processApplicationData();
                    return;
                }
                throw new TlsFatalAlert((short) 10);
            case 24:
                if (!this.appDataReady) {
                    throw new TlsFatalAlert((short) 10);
                }
                return;
            default:
                return;
        }
    }

    protected void raiseAlert(short s11, short s12, String str, Throwable th2) {
        getPeer().notifyAlertRaised(s11, s12, str, th2);
        safeWriteRecord((short) 21, new byte[]{(byte) s11, (byte) s12}, 0, 2);
    }

    protected void raiseWarning(short s11, String str) {
        raiseAlert((short) 1, s11, str, null);
    }

    public int readApplicationData(byte[] bArr, int i11, int i12) {
        if (i12 < 1) {
            return 0;
        }
        while (this.applicationDataQueue.available() == 0) {
            if (this.closed) {
                if (this.failedWithError) {
                    throw new IOException(TLS_ERROR_MESSAGE);
                }
                return -1;
            }
            safeReadRecord();
        }
        int min = Math.min(i12, this.applicationDataQueue.available());
        this.applicationDataQueue.removeData(bArr, i11, min, 0);
        return min;
    }

    public int readInput(byte[] bArr, int i11, int i12) {
        if (!this.blocking) {
            try {
                return readApplicationData(bArr, i11, Math.min(i12, applicationDataAvailable()));
            } catch (IOException e11) {
                throw new RuntimeException(e11.toString());
            }
        }
        throw new IllegalStateException("Cannot use readInput() in blocking mode! Use getInputStream() instead.");
    }

    public int readOutput(byte[] bArr, int i11, int i12) {
        if (!this.blocking) {
            int min = Math.min(getAvailableOutputBytes(), i12);
            this.outputBuffer.getBuffer().removeData(bArr, i11, min, 0);
            return min;
        }
        throw new IllegalStateException("Cannot use readOutput() in blocking mode! Use getOutputStream() instead.");
    }

    public void refuseRenegotiation() {
        if (!TlsUtils.isSSL(getContext())) {
            raiseWarning((short) 100, "Renegotiation not supported");
            return;
        }
        throw new TlsFatalAlert((short) 40);
    }

    protected void safeReadRecord() {
        try {
            if (this.recordStream.readRecord()) {
                return;
            }
            throw new EOFException();
        } catch (TlsFatalAlert e11) {
            if (!this.closed) {
                failWithError((short) 2, e11.getAlertDescription(), "Failed to read record", e11);
            }
            throw e11;
        } catch (IOException e12) {
            if (!this.closed) {
                failWithError((short) 2, (short) 80, "Failed to read record", e12);
            }
            throw e12;
        } catch (RuntimeException e13) {
            if (!this.closed) {
                failWithError((short) 2, (short) 80, "Failed to read record", e13);
            }
            throw e13;
        }
    }

    protected void safeWriteRecord(short s11, byte[] bArr, int i11, int i12) {
        try {
            this.recordStream.writeRecord(s11, bArr, i11, i12);
        } catch (IOException e11) {
            if (!this.closed) {
                failWithError((short) 2, (short) 80, "Failed to write record", e11);
            }
            throw e11;
        } catch (RuntimeException e12) {
            if (!this.closed) {
                failWithError((short) 2, (short) 80, "Failed to write record", e12);
            }
            throw e12;
        } catch (TlsFatalAlert e13) {
            if (!this.closed) {
                failWithError((short) 2, e13.getAlertDescription(), "Failed to write record", e13);
            }
            throw e13;
        }
    }

    public void sendCertificateMessage(Certificate certificate) {
        if (certificate == null) {
            certificate = Certificate.EMPTY_CHAIN;
        }
        if (certificate.isEmpty() && !getContext().isServer()) {
            ProtocolVersion serverVersion = getContext().getServerVersion();
            if (serverVersion.isSSL()) {
                raiseWarning((short) 41, serverVersion.toString() + " client didn't provide credentials");
                return;
            }
        }
        HandshakeMessage handshakeMessage = new HandshakeMessage(this, (short) 11);
        certificate.encode(handshakeMessage);
        handshakeMessage.writeToRecordStream();
    }

    public void sendChangeCipherSpecMessage() {
        safeWriteRecord((short) 20, new byte[]{1}, 0, 1);
        this.recordStream.sentWriteCipherSpec();
    }

    public void sendFinishedMessage() {
        byte[] createVerifyData = createVerifyData(getContext().isServer());
        HandshakeMessage handshakeMessage = new HandshakeMessage((short) 20, createVerifyData.length);
        handshakeMessage.write(createVerifyData);
        handshakeMessage.writeToRecordStream();
    }

    public void sendSupplementalDataMessage(Vector vector) {
        HandshakeMessage handshakeMessage = new HandshakeMessage(this, (short) 23);
        writeSupplementalData(handshakeMessage, vector);
        handshakeMessage.writeToRecordStream();
    }

    protected void setAppDataSplitMode(int i11) {
        if (i11 >= 0 && i11 <= 2) {
            this.appDataSplitMode = i11;
            return;
        }
        throw new IllegalArgumentException("Illegal appDataSplitMode mode: " + i11);
    }

    public void writeData(byte[] bArr, int i11, int i12) {
        if (this.closed) {
            if (this.failedWithError) {
                throw new IOException(TLS_ERROR_MESSAGE);
            }
            throw new IOException("Sorry, connection has been closed, you cannot write more data");
        }
        while (i12 > 0) {
            if (this.appDataSplitEnabled) {
                int i13 = this.appDataSplitMode;
                if (i13 != 1) {
                    if (i13 != 2) {
                        safeWriteRecord((short) 23, bArr, i11, 1);
                        i11++;
                        i12--;
                    } else {
                        this.appDataSplitEnabled = false;
                    }
                }
                safeWriteRecord((short) 23, TlsUtils.EMPTY_BYTES, 0, 0);
            }
            if (i12 > 0) {
                int min = Math.min(i12, this.recordStream.getPlaintextLimit());
                safeWriteRecord((short) 23, bArr, i11, min);
                i11 += min;
                i12 -= min;
            }
        }
    }

    public void writeHandshakeMessage(byte[] bArr, int i11, int i12) {
        while (i12 > 0) {
            int min = Math.min(i12, this.recordStream.getPlaintextLimit());
            safeWriteRecord((short) 22, bArr, i11, min);
            i11 += min;
            i12 -= min;
        }
    }

    public TlsProtocol(SecureRandom secureRandom) {
        this.applicationDataQueue = new ByteQueue();
        this.alertQueue = new ByteQueue(2);
        this.handshakeQueue = new ByteQueue();
        this.tlsInputStream = null;
        this.tlsOutputStream = null;
        this.closed = false;
        this.failedWithError = false;
        this.appDataReady = false;
        this.appDataSplitEnabled = true;
        this.appDataSplitMode = 0;
        this.expected_verify_data = null;
        this.tlsSession = null;
        this.sessionParameters = null;
        this.securityParameters = null;
        this.peerCertificate = null;
        this.offeredCipherSuites = null;
        this.offeredCompressionMethods = null;
        this.clientExtensions = null;
        this.serverExtensions = null;
        this.connection_state = (short) 0;
        this.resumedSession = false;
        this.receivedChangeCipherSpec = false;
        this.secure_renegotiation = false;
        this.allowCertificateStatus = false;
        this.expectSessionTicket = false;
        this.blocking = false;
        this.inputBuffers = new ByteQueueInputStream();
        this.outputBuffer = new ByteQueueOutputStream();
        this.recordStream = new RecordStream(this, this.inputBuffers, this.outputBuffer);
        this.secureRandom = secureRandom;
    }
}