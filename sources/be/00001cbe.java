package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.SocketException;

/* loaded from: classes3.dex */
public final class UdpDataSource extends zj.e {

    /* renamed from: e  reason: collision with root package name */
    private final int f14622e;

    /* renamed from: f  reason: collision with root package name */
    private final byte[] f14623f;

    /* renamed from: g  reason: collision with root package name */
    private final DatagramPacket f14624g;

    /* renamed from: h  reason: collision with root package name */
    private Uri f14625h;

    /* renamed from: i  reason: collision with root package name */
    private DatagramSocket f14626i;

    /* renamed from: j  reason: collision with root package name */
    private MulticastSocket f14627j;

    /* renamed from: k  reason: collision with root package name */
    private InetAddress f14628k;

    /* renamed from: l  reason: collision with root package name */
    private InetSocketAddress f14629l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f14630m;

    /* renamed from: n  reason: collision with root package name */
    private int f14631n;

    /* loaded from: classes3.dex */
    public static final class UdpDataSourceException extends IOException {
        public UdpDataSourceException(IOException iOException) {
            super(iOException);
        }
    }

    public UdpDataSource() {
        this(2000);
    }

    @Override // com.google.android.exoplayer2.upstream.a
    public void close() {
        this.f14625h = null;
        MulticastSocket multicastSocket = this.f14627j;
        if (multicastSocket != null) {
            try {
                multicastSocket.leaveGroup(this.f14628k);
            } catch (IOException unused) {
            }
            this.f14627j = null;
        }
        DatagramSocket datagramSocket = this.f14626i;
        if (datagramSocket != null) {
            datagramSocket.close();
            this.f14626i = null;
        }
        this.f14628k = null;
        this.f14629l = null;
        this.f14631n = 0;
        if (this.f14630m) {
            this.f14630m = false;
            p();
        }
    }

    @Override // com.google.android.exoplayer2.upstream.a
    public long i(b bVar) {
        Uri uri = bVar.f14632a;
        this.f14625h = uri;
        String host = uri.getHost();
        int port = this.f14625h.getPort();
        q(bVar);
        try {
            this.f14628k = InetAddress.getByName(host);
            this.f14629l = new InetSocketAddress(this.f14628k, port);
            if (this.f14628k.isMulticastAddress()) {
                MulticastSocket multicastSocket = new MulticastSocket(this.f14629l);
                this.f14627j = multicastSocket;
                multicastSocket.joinGroup(this.f14628k);
                this.f14626i = this.f14627j;
            } else {
                this.f14626i = new DatagramSocket(this.f14629l);
            }
            try {
                this.f14626i.setSoTimeout(this.f14622e);
                this.f14630m = true;
                r(bVar);
                return -1L;
            } catch (SocketException e11) {
                throw new UdpDataSourceException(e11);
            }
        } catch (IOException e12) {
            throw new UdpDataSourceException(e12);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.a
    public Uri m() {
        return this.f14625h;
    }

    @Override // zj.f
    public int read(byte[] bArr, int i11, int i12) {
        if (i12 == 0) {
            return 0;
        }
        if (this.f14631n == 0) {
            try {
                this.f14626i.receive(this.f14624g);
                int length = this.f14624g.getLength();
                this.f14631n = length;
                o(length);
            } catch (IOException e11) {
                throw new UdpDataSourceException(e11);
            }
        }
        int length2 = this.f14624g.getLength();
        int i13 = this.f14631n;
        int min = Math.min(i13, i12);
        System.arraycopy(this.f14623f, length2 - i13, bArr, i11, min);
        this.f14631n -= min;
        return min;
    }

    public UdpDataSource(int i11) {
        this(i11, 8000);
    }

    public UdpDataSource(int i11, int i12) {
        super(true);
        this.f14622e = i12;
        byte[] bArr = new byte[i11];
        this.f14623f = bArr;
        this.f14624g = new DatagramPacket(bArr, 0, i11);
    }
}