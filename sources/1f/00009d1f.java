package org.spongycastle.crypto.tls;

/* loaded from: classes4.dex */
public interface DatagramTransport {
    void close();

    int getReceiveLimit();

    int getSendLimit();

    int receive(byte[] bArr, int i11, int i12, int i13);

    void send(byte[] bArr, int i11, int i12);
}