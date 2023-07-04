package ib;

import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;

/* loaded from: classes.dex */
public class g extends mp.b {

    /* renamed from: j  reason: collision with root package name */
    private int f30229j;

    /* renamed from: k  reason: collision with root package name */
    private int f30230k;

    public g() {
        super("dref");
    }

    @Override // mp.b, ib.b
    public long a() {
        long p11 = p() + 8;
        return p11 + ((this.f38671i || 8 + p11 >= 4294967296L) ? 16 : 8);
    }

    @Override // mp.b, ib.b
    public void g(WritableByteChannel writableByteChannel) {
        writableByteChannel.write(J());
        ByteBuffer allocate = ByteBuffer.allocate(8);
        hb.e.i(allocate, this.f30229j);
        hb.e.f(allocate, this.f30230k);
        hb.e.g(allocate, m().size());
        writableByteChannel.write((ByteBuffer) allocate.rewind());
        D(writableByteChannel);
    }
}