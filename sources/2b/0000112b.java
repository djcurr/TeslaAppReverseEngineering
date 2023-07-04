package ch.qos.logback.core.net;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/* loaded from: classes.dex */
public class SyslogOutputStream extends OutputStream {
    private static final int MAX_LEN = 1024;
    private InetAddress address;
    private ByteArrayOutputStream baos = new ByteArrayOutputStream();

    /* renamed from: ds  reason: collision with root package name */
    private DatagramSocket f9134ds = new DatagramSocket();
    private final int port;

    public SyslogOutputStream(String str, int i11) {
        this.address = InetAddress.getByName(str);
        this.port = i11;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        DatagramSocket datagramSocket = this.f9134ds;
        if (datagramSocket != null) {
            datagramSocket.close();
        }
        this.address = null;
        this.f9134ds = null;
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() {
        DatagramSocket datagramSocket;
        byte[] byteArray = this.baos.toByteArray();
        DatagramPacket datagramPacket = new DatagramPacket(byteArray, byteArray.length, this.address, this.port);
        if (this.baos.size() > 1024) {
            this.baos = new ByteArrayOutputStream();
        } else {
            this.baos.reset();
        }
        if (byteArray.length == 0 || (datagramSocket = this.f9134ds) == null) {
            return;
        }
        datagramSocket.send(datagramPacket);
    }

    public int getPort() {
        return this.port;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getSendBufferSize() {
        return this.f9134ds.getSendBufferSize();
    }

    @Override // java.io.OutputStream
    public void write(int i11) {
        this.baos.write(i11);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i11, int i12) {
        this.baos.write(bArr, i11, i12);
    }
}