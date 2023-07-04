package mp;

import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;

/* loaded from: classes2.dex */
public class b extends d implements ib.b {

    /* renamed from: h  reason: collision with root package name */
    protected String f38670h;

    /* renamed from: i  reason: collision with root package name */
    protected boolean f38671i;

    public b(String str) {
        this.f38670h = str;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public ByteBuffer J() {
        ByteBuffer wrap;
        if (!this.f38671i && a() < 4294967296L) {
            wrap = ByteBuffer.wrap(new byte[]{0, 0, 0, 0, this.f38670h.getBytes()[0], this.f38670h.getBytes()[1], this.f38670h.getBytes()[2], this.f38670h.getBytes()[3]});
            hb.e.g(wrap, a());
        } else {
            byte[] bArr = new byte[16];
            bArr[3] = 1;
            bArr[4] = this.f38670h.getBytes()[0];
            bArr[5] = this.f38670h.getBytes()[1];
            bArr[6] = this.f38670h.getBytes()[2];
            bArr[7] = this.f38670h.getBytes()[3];
            wrap = ByteBuffer.wrap(bArr);
            wrap.position(8);
            hb.e.h(wrap, a());
        }
        wrap.rewind();
        return wrap;
    }

    public long a() {
        long p11 = p();
        return p11 + ((this.f38671i || 8 + p11 >= 4294967296L) ? 16 : 8);
    }

    public void g(WritableByteChannel writableByteChannel) {
        writableByteChannel.write(J());
        D(writableByteChannel);
    }

    @Override // ib.b
    public void j(ib.d dVar) {
    }
}