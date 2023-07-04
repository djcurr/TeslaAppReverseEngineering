package org.spongycastle.crypto.tls;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

/* loaded from: classes4.dex */
public class UDPTransport implements DatagramTransport {
    protected static final int MAX_IP_OVERHEAD = 84;
    protected static final int MIN_IP_OVERHEAD = 20;
    protected static final int UDP_OVERHEAD = 8;
    protected final int receiveLimit;
    protected final int sendLimit;
    protected final DatagramSocket socket;

    public UDPTransport(DatagramSocket datagramSocket, int i11) {
        if (datagramSocket.isBound() && datagramSocket.isConnected()) {
            this.socket = datagramSocket;
            this.receiveLimit = (i11 - 20) - 8;
            this.sendLimit = (i11 - 84) - 8;
            return;
        }
        throw new IllegalArgumentException("'socket' must be bound and connected");
    }

    @Override // org.spongycastle.crypto.tls.DatagramTransport
    public void close() {
        this.socket.close();
    }

    @Override // org.spongycastle.crypto.tls.DatagramTransport
    public int getReceiveLimit() {
        return this.receiveLimit;
    }

    @Override // org.spongycastle.crypto.tls.DatagramTransport
    public int getSendLimit() {
        return this.sendLimit;
    }

    @Override // org.spongycastle.crypto.tls.DatagramTransport
    public int receive(byte[] bArr, int i11, int i12, int i13) {
        this.socket.setSoTimeout(i13);
        DatagramPacket datagramPacket = new DatagramPacket(bArr, i11, i12);
        this.socket.receive(datagramPacket);
        return datagramPacket.getLength();
    }

    @Override // org.spongycastle.crypto.tls.DatagramTransport
    public void send(byte[] bArr, int i11, int i12) {
        if (i12 <= getSendLimit()) {
            this.socket.send(new DatagramPacket(bArr, i11, i12));
            return;
        }
        throw new TlsFatalAlert((short) 80);
    }
}