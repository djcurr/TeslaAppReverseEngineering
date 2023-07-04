package jb;

import ch.qos.logback.core.CoreConstants;
import hb.e;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;

/* loaded from: classes.dex */
public final class b extends a {
    private byte[] A;

    /* renamed from: k  reason: collision with root package name */
    private int f33309k;

    /* renamed from: l  reason: collision with root package name */
    private int f33310l;

    /* renamed from: m  reason: collision with root package name */
    private long f33311m;

    /* renamed from: n  reason: collision with root package name */
    private int f33312n;

    /* renamed from: o  reason: collision with root package name */
    private int f33313o;

    /* renamed from: p  reason: collision with root package name */
    private int f33314p;

    /* renamed from: q  reason: collision with root package name */
    private long f33315q;

    /* renamed from: t  reason: collision with root package name */
    private long f33316t;

    /* renamed from: w  reason: collision with root package name */
    private long f33317w;

    /* renamed from: x  reason: collision with root package name */
    private long f33318x;

    /* renamed from: y  reason: collision with root package name */
    private int f33319y;

    /* renamed from: z  reason: collision with root package name */
    private long f33320z;

    public b(String str) {
        super(str);
    }

    public int R() {
        return this.f33309k;
    }

    @Override // mp.b, ib.b
    public long a() {
        int i11 = this.f33312n;
        int i12 = 16;
        long p11 = (i11 == 1 ? 16 : 0) + 28 + (i11 == 2 ? 36 : 0) + p();
        if (!this.f38671i && 8 + p11 < 4294967296L) {
            i12 = 8;
        }
        return p11 + i12;
    }

    public long a0() {
        return this.f33311m;
    }

    public void e0(int i11) {
        this.f33309k = i11;
    }

    @Override // mp.b, ib.b
    public void g(WritableByteChannel writableByteChannel) {
        writableByteChannel.write(J());
        int i11 = this.f33312n;
        ByteBuffer allocate = ByteBuffer.allocate((i11 == 1 ? 16 : 0) + 28 + (i11 == 2 ? 36 : 0));
        allocate.position(6);
        e.e(allocate, this.f33308j);
        e.e(allocate, this.f33312n);
        e.e(allocate, this.f33319y);
        e.g(allocate, this.f33320z);
        e.e(allocate, this.f33309k);
        e.e(allocate, this.f33310l);
        e.e(allocate, this.f33313o);
        e.e(allocate, this.f33314p);
        if (this.f38670h.equals("mlpa")) {
            e.g(allocate, a0());
        } else {
            e.g(allocate, a0() << 16);
        }
        if (this.f33312n == 1) {
            e.g(allocate, this.f33315q);
            e.g(allocate, this.f33316t);
            e.g(allocate, this.f33317w);
            e.g(allocate, this.f33318x);
        }
        if (this.f33312n == 2) {
            e.g(allocate, this.f33315q);
            e.g(allocate, this.f33316t);
            e.g(allocate, this.f33317w);
            e.g(allocate, this.f33318x);
            allocate.put(this.A);
        }
        writableByteChannel.write((ByteBuffer) allocate.rewind());
        D(writableByteChannel);
    }

    public void n0(long j11) {
        this.f33311m = j11;
    }

    public void p0(int i11) {
        this.f33310l = i11;
    }

    @Override // mp.d
    public String toString() {
        return "AudioSampleEntry{bytesPerSample=" + this.f33318x + ", bytesPerFrame=" + this.f33317w + ", bytesPerPacket=" + this.f33316t + ", samplesPerPacket=" + this.f33315q + ", packetSize=" + this.f33314p + ", compressionId=" + this.f33313o + ", soundVersion=" + this.f33312n + ", sampleRate=" + this.f33311m + ", sampleSize=" + this.f33310l + ", channelCount=" + this.f33309k + ", boxes=" + m() + CoreConstants.CURLY_RIGHT;
    }
}