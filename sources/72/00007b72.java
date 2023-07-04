package jb;

import hb.e;
import hb.f;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import okhttp3.internal.http2.Settings;

/* loaded from: classes.dex */
public final class c extends a {

    /* renamed from: k  reason: collision with root package name */
    private int f33321k;

    /* renamed from: l  reason: collision with root package name */
    private int f33322l;

    /* renamed from: m  reason: collision with root package name */
    private double f33323m;

    /* renamed from: n  reason: collision with root package name */
    private double f33324n;

    /* renamed from: o  reason: collision with root package name */
    private int f33325o;

    /* renamed from: p  reason: collision with root package name */
    private String f33326p;

    /* renamed from: q  reason: collision with root package name */
    private int f33327q;

    /* renamed from: t  reason: collision with root package name */
    private long[] f33328t;

    public c() {
        super("avc1");
        this.f33323m = 72.0d;
        this.f33324n = 72.0d;
        this.f33325o = 1;
        this.f33326p = "";
        this.f33327q = 24;
        this.f33328t = new long[3];
    }

    public void C0(int i11) {
        this.f33322l = i11;
    }

    public void D0(double d11) {
        this.f33323m = d11;
    }

    public void F0(double d11) {
        this.f33324n = d11;
    }

    public void G0(int i11) {
        this.f33321k = i11;
    }

    public String R() {
        return this.f33326p;
    }

    @Override // mp.b, ib.b
    public long a() {
        long p11 = p() + 78;
        return p11 + ((this.f38671i || 8 + p11 >= 4294967296L) ? 16 : 8);
    }

    public int a0() {
        return this.f33327q;
    }

    public int e0() {
        return this.f33325o;
    }

    @Override // mp.b, ib.b
    public void g(WritableByteChannel writableByteChannel) {
        writableByteChannel.write(J());
        ByteBuffer allocate = ByteBuffer.allocate(78);
        allocate.position(6);
        e.e(allocate, this.f33308j);
        e.e(allocate, 0);
        e.e(allocate, 0);
        e.g(allocate, this.f33328t[0]);
        e.g(allocate, this.f33328t[1]);
        e.g(allocate, this.f33328t[2]);
        e.e(allocate, getWidth());
        e.e(allocate, getHeight());
        e.b(allocate, n0());
        e.b(allocate, p0());
        e.g(allocate, 0L);
        e.e(allocate, e0());
        e.i(allocate, f.c(R()));
        allocate.put(f.b(R()));
        int c11 = f.c(R());
        while (c11 < 31) {
            c11++;
            allocate.put((byte) 0);
        }
        e.e(allocate, a0());
        e.e(allocate, Settings.DEFAULT_INITIAL_WINDOW_SIZE);
        writableByteChannel.write((ByteBuffer) allocate.rewind());
        D(writableByteChannel);
    }

    public int getHeight() {
        return this.f33322l;
    }

    public int getWidth() {
        return this.f33321k;
    }

    public double n0() {
        return this.f33323m;
    }

    public double p0() {
        return this.f33324n;
    }

    public void t0(int i11) {
        this.f33327q = i11;
    }

    public void u0(int i11) {
        this.f33325o = i11;
    }

    public c(String str) {
        super(str);
        this.f33323m = 72.0d;
        this.f33324n = 72.0d;
        this.f33325o = 1;
        this.f33326p = "";
        this.f33327q = 24;
        this.f33328t = new long[3];
    }
}