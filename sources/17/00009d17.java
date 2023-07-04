package org.spongycastle.crypto.tls;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import org.spongycastle.util.Integers;

/* loaded from: classes4.dex */
class DTLSReliableHandshake {
    private static final int MAX_RECEIVE_AHEAD = 10;
    private TlsHandshakeHash handshakeHash;
    private DTLSRecordLayer recordLayer;
    private Hashtable currentInboundFlight = new Hashtable();
    private Hashtable previousInboundFlight = null;
    private Vector outboundFlight = new Vector();
    private boolean sending = true;
    private int message_seq = 0;
    private int next_receive_seq = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static class Message {
        private final byte[] body;
        private final int message_seq;
        private final short msg_type;

        public byte[] getBody() {
            return this.body;
        }

        public int getSeq() {
            return this.message_seq;
        }

        public short getType() {
            return this.msg_type;
        }

        private Message(int i11, short s11, byte[] bArr) {
            this.message_seq = i11;
            this.msg_type = s11;
            this.body = bArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static class RecordLayerBuffer extends ByteArrayOutputStream {
        RecordLayerBuffer(int i11) {
            super(i11);
        }

        void sendToRecordLayer(DTLSRecordLayer dTLSRecordLayer) {
            dTLSRecordLayer.send(((ByteArrayOutputStream) this).buf, 0, ((ByteArrayOutputStream) this).count);
            ((ByteArrayOutputStream) this).buf = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public DTLSReliableHandshake(TlsContext tlsContext, DTLSRecordLayer dTLSRecordLayer) {
        this.recordLayer = dTLSRecordLayer;
        DeferredHash deferredHash = new DeferredHash();
        this.handshakeHash = deferredHash;
        deferredHash.init(tlsContext);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean checkAll(Hashtable hashtable) {
        Enumeration elements = hashtable.elements();
        while (elements.hasMoreElements()) {
            if (((DTLSReassembler) elements.nextElement()).getBodyIfComplete() == null) {
                return false;
            }
        }
        return true;
    }

    private void checkInboundFlight() {
        Enumeration keys = this.currentInboundFlight.keys();
        while (keys.hasMoreElements()) {
            ((Integer) keys.nextElement()).intValue();
        }
    }

    private void prepareInboundFlight() {
        resetAll(this.currentInboundFlight);
        this.previousInboundFlight = this.currentInboundFlight;
        this.currentInboundFlight = new Hashtable();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void resendOutboundFlight() {
        this.recordLayer.resetWriteEpoch();
        for (int i11 = 0; i11 < this.outboundFlight.size(); i11++) {
            writeMessage((Message) this.outboundFlight.elementAt(i11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void resetAll(Hashtable hashtable) {
        Enumeration elements = hashtable.elements();
        while (elements.hasMoreElements()) {
            ((DTLSReassembler) elements.nextElement()).reset();
        }
    }

    private Message updateHandshakeMessagesDigest(Message message) {
        if (message.getType() != 0) {
            byte[] body = message.getBody();
            byte[] bArr = new byte[12];
            TlsUtils.writeUint8(message.getType(), bArr, 0);
            TlsUtils.writeUint24(body.length, bArr, 1);
            TlsUtils.writeUint16(message.getSeq(), bArr, 4);
            TlsUtils.writeUint24(0, bArr, 6);
            TlsUtils.writeUint24(body.length, bArr, 9);
            this.handshakeHash.update(bArr, 0, 12);
            this.handshakeHash.update(body, 0, body.length);
        }
        return message;
    }

    private void writeHandshakeFragment(Message message, int i11, int i12) {
        RecordLayerBuffer recordLayerBuffer = new RecordLayerBuffer(i12 + 12);
        TlsUtils.writeUint8(message.getType(), (OutputStream) recordLayerBuffer);
        TlsUtils.writeUint24(message.getBody().length, recordLayerBuffer);
        TlsUtils.writeUint16(message.getSeq(), recordLayerBuffer);
        TlsUtils.writeUint24(i11, recordLayerBuffer);
        TlsUtils.writeUint24(i12, recordLayerBuffer);
        recordLayerBuffer.write(message.getBody(), i11, i12);
        recordLayerBuffer.sendToRecordLayer(this.recordLayer);
    }

    private void writeMessage(Message message) {
        int sendLimit = this.recordLayer.getSendLimit() - 12;
        if (sendLimit >= 1) {
            int length = message.getBody().length;
            int i11 = 0;
            do {
                int min = Math.min(length - i11, sendLimit);
                writeHandshakeFragment(message, i11, min);
                i11 += min;
            } while (i11 < length);
            return;
        }
        throw new TlsFatalAlert((short) 80);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void finish() {
        DTLSHandshakeRetransmit dTLSHandshakeRetransmit;
        if (!this.sending) {
            checkInboundFlight();
        } else if (this.currentInboundFlight != null) {
            dTLSHandshakeRetransmit = new DTLSHandshakeRetransmit() { // from class: org.spongycastle.crypto.tls.DTLSReliableHandshake.1
                @Override // org.spongycastle.crypto.tls.DTLSHandshakeRetransmit
                public void receivedHandshakeRecord(int i11, byte[] bArr, int i12, int i13) {
                    int readUint16;
                    DTLSReassembler dTLSReassembler;
                    if (i13 < 12) {
                        return;
                    }
                    int readUint24 = TlsUtils.readUint24(bArr, i12 + 9);
                    if (i13 == readUint24 + 12 && (readUint16 = TlsUtils.readUint16(bArr, i12 + 4)) < DTLSReliableHandshake.this.next_receive_seq) {
                        short readUint8 = TlsUtils.readUint8(bArr, i12);
                        if (i11 != (readUint8 == 20 ? 1 : 0)) {
                            return;
                        }
                        int readUint242 = TlsUtils.readUint24(bArr, i12 + 1);
                        int readUint243 = TlsUtils.readUint24(bArr, i12 + 6);
                        if (readUint243 + readUint24 <= readUint242 && (dTLSReassembler = (DTLSReassembler) DTLSReliableHandshake.this.currentInboundFlight.get(Integers.valueOf(readUint16))) != null) {
                            dTLSReassembler.contributeFragment(readUint8, readUint242, bArr, i12 + 12, readUint243, readUint24);
                            if (DTLSReliableHandshake.checkAll(DTLSReliableHandshake.this.currentInboundFlight)) {
                                DTLSReliableHandshake.this.resendOutboundFlight();
                                DTLSReliableHandshake.resetAll(DTLSReliableHandshake.this.currentInboundFlight);
                            }
                        }
                    }
                }
            };
            this.recordLayer.handshakeSuccessful(dTLSHandshakeRetransmit);
        }
        dTLSHandshakeRetransmit = null;
        this.recordLayer.handshakeSuccessful(dTLSHandshakeRetransmit);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public TlsHandshakeHash getHandshakeHash() {
        return this.handshakeHash;
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
    public Message receiveMessage() {
        int readUint16;
        DTLSReassembler dTLSReassembler;
        byte[] bodyIfComplete;
        byte[] bodyIfComplete2;
        if (this.sending) {
            this.sending = false;
            prepareInboundFlight();
        }
        DTLSReassembler dTLSReassembler2 = (DTLSReassembler) this.currentInboundFlight.get(Integers.valueOf(this.next_receive_seq));
        if (dTLSReassembler2 != null && (bodyIfComplete2 = dTLSReassembler2.getBodyIfComplete()) != null) {
            this.previousInboundFlight = null;
            int i11 = this.next_receive_seq;
            this.next_receive_seq = i11 + 1;
            return updateHandshakeMessagesDigest(new Message(i11, dTLSReassembler2.getMsgType(), bodyIfComplete2));
        }
        int i12 = 1000;
        byte[] bArr = null;
        while (true) {
            int receiveLimit = this.recordLayer.getReceiveLimit();
            if (bArr == null || bArr.length < receiveLimit) {
                bArr = new byte[receiveLimit];
            }
            while (true) {
                try {
                    int receive = this.recordLayer.receive(bArr, 0, receiveLimit, i12);
                    if (receive < 0) {
                        break;
                    } else if (receive >= 12) {
                        int readUint24 = TlsUtils.readUint24(bArr, 9);
                        if (receive == readUint24 + 12 && (readUint16 = TlsUtils.readUint16(bArr, 4)) <= this.next_receive_seq + 10) {
                            short readUint8 = TlsUtils.readUint8(bArr, 0);
                            int readUint242 = TlsUtils.readUint24(bArr, 1);
                            int readUint243 = TlsUtils.readUint24(bArr, 6);
                            if (readUint243 + readUint24 <= readUint242) {
                                if (readUint16 < this.next_receive_seq) {
                                    Hashtable hashtable = this.previousInboundFlight;
                                    if (hashtable != null && (dTLSReassembler = (DTLSReassembler) hashtable.get(Integers.valueOf(readUint16))) != null) {
                                        dTLSReassembler.contributeFragment(readUint8, readUint242, bArr, 12, readUint243, readUint24);
                                        if (checkAll(this.previousInboundFlight)) {
                                            resendOutboundFlight();
                                            i12 = Math.min(i12 * 2, 60000);
                                            resetAll(this.previousInboundFlight);
                                        }
                                    }
                                } else {
                                    DTLSReassembler dTLSReassembler3 = (DTLSReassembler) this.currentInboundFlight.get(Integers.valueOf(readUint16));
                                    if (dTLSReassembler3 == null) {
                                        dTLSReassembler3 = new DTLSReassembler(readUint8, readUint242);
                                        this.currentInboundFlight.put(Integers.valueOf(readUint16), dTLSReassembler3);
                                    }
                                    DTLSReassembler dTLSReassembler4 = dTLSReassembler3;
                                    dTLSReassembler4.contributeFragment(readUint8, readUint242, bArr, 12, readUint243, readUint24);
                                    if (readUint16 == this.next_receive_seq && (bodyIfComplete = dTLSReassembler4.getBodyIfComplete()) != null) {
                                        this.previousInboundFlight = null;
                                        int i13 = this.next_receive_seq;
                                        this.next_receive_seq = i13 + 1;
                                        return updateHandshakeMessagesDigest(new Message(i13, dTLSReassembler4.getMsgType(), bodyIfComplete));
                                    }
                                }
                            }
                        }
                    }
                } catch (IOException unused) {
                }
            }
            resendOutboundFlight();
            i12 = Math.min(i12 * 2, 60000);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public byte[] receiveMessageBody(short s11) {
        Message receiveMessage = receiveMessage();
        if (receiveMessage.getType() == s11) {
            return receiveMessage.getBody();
        }
        throw new TlsFatalAlert((short) 10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void resetHandshakeMessagesDigest() {
        this.handshakeHash.reset();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void sendMessage(short s11, byte[] bArr) {
        TlsUtils.checkUint24(bArr.length);
        if (!this.sending) {
            checkInboundFlight();
            this.sending = true;
            this.outboundFlight.removeAllElements();
        }
        int i11 = this.message_seq;
        this.message_seq = i11 + 1;
        Message message = new Message(i11, s11, bArr);
        this.outboundFlight.addElement(message);
        writeMessage(message);
        updateHandshakeMessagesDigest(message);
    }
}