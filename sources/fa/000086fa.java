package mp;

import expo.modules.constants.ExponentInstallationId;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;

/* loaded from: classes2.dex */
public abstract class a implements ib.b {

    /* renamed from: j  reason: collision with root package name */
    private static pp.f f38660j = pp.f.a(a.class);

    /* renamed from: a  reason: collision with root package name */
    protected String f38661a;

    /* renamed from: b  reason: collision with root package name */
    private byte[] f38662b;

    /* renamed from: e  reason: collision with root package name */
    private ByteBuffer f38665e;

    /* renamed from: f  reason: collision with root package name */
    long f38666f;

    /* renamed from: h  reason: collision with root package name */
    e f38668h;

    /* renamed from: g  reason: collision with root package name */
    long f38667g = -1;

    /* renamed from: i  reason: collision with root package name */
    private ByteBuffer f38669i = null;

    /* renamed from: d  reason: collision with root package name */
    boolean f38664d = true;

    /* renamed from: c  reason: collision with root package name */
    boolean f38663c = true;

    /* JADX INFO: Access modifiers changed from: protected */
    public a(String str) {
        this.f38661a = str;
    }

    private void e(ByteBuffer byteBuffer) {
        if (k()) {
            hb.e.g(byteBuffer, a());
            byteBuffer.put(hb.c.J(f()));
        } else {
            hb.e.g(byteBuffer, 1L);
            byteBuffer.put(hb.c.J(f()));
            hb.e.h(byteBuffer, a());
        }
        if (ExponentInstallationId.LEGACY_UUID_KEY.equals(f())) {
            byteBuffer.put(h());
        }
    }

    private boolean k() {
        int i11 = ExponentInstallationId.LEGACY_UUID_KEY.equals(f()) ? 24 : 8;
        if (!this.f38664d) {
            return this.f38667g + ((long) i11) < 4294967296L;
        } else if (!this.f38663c) {
            return ((long) (this.f38665e.limit() + i11)) < 4294967296L;
        } else {
            long d11 = d();
            ByteBuffer byteBuffer = this.f38669i;
            return (d11 + ((long) (byteBuffer != null ? byteBuffer.limit() : 0))) + ((long) i11) < 4294967296L;
        }
    }

    private synchronized void m() {
        if (!this.f38664d) {
            try {
                pp.f fVar = f38660j;
                fVar.b("mem mapping " + f());
                this.f38665e = this.f38668h.m1(this.f38666f, this.f38667g);
                this.f38664d = true;
            } catch (IOException e11) {
                throw new RuntimeException(e11);
            }
        }
    }

    @Override // ib.b
    public long a() {
        long j11;
        ByteBuffer byteBuffer;
        if (!this.f38664d) {
            j11 = this.f38667g;
        } else if (this.f38663c) {
            j11 = d();
        } else {
            ByteBuffer byteBuffer2 = this.f38665e;
            j11 = byteBuffer2 != null ? byteBuffer2.limit() : 0;
        }
        return j11 + (j11 >= 4294967288L ? 8 : 0) + 8 + (ExponentInstallationId.LEGACY_UUID_KEY.equals(f()) ? 16 : 0) + (this.f38669i != null ? byteBuffer.limit() : 0);
    }

    protected abstract void b(ByteBuffer byteBuffer);

    protected abstract void c(ByteBuffer byteBuffer);

    protected abstract long d();

    public String f() {
        return this.f38661a;
    }

    @Override // ib.b
    public void g(WritableByteChannel writableByteChannel) {
        if (this.f38664d) {
            if (this.f38663c) {
                ByteBuffer allocate = ByteBuffer.allocate(pp.b.a(a()));
                e(allocate);
                c(allocate);
                ByteBuffer byteBuffer = this.f38669i;
                if (byteBuffer != null) {
                    byteBuffer.rewind();
                    while (this.f38669i.remaining() > 0) {
                        allocate.put(this.f38669i);
                    }
                }
                writableByteChannel.write((ByteBuffer) allocate.rewind());
                return;
            }
            ByteBuffer allocate2 = ByteBuffer.allocate((k() ? 8 : 16) + (ExponentInstallationId.LEGACY_UUID_KEY.equals(f()) ? 16 : 0));
            e(allocate2);
            writableByteChannel.write((ByteBuffer) allocate2.rewind());
            writableByteChannel.write((ByteBuffer) this.f38665e.position(0));
            return;
        }
        ByteBuffer allocate3 = ByteBuffer.allocate((k() ? 8 : 16) + (ExponentInstallationId.LEGACY_UUID_KEY.equals(f()) ? 16 : 0));
        e(allocate3);
        writableByteChannel.write((ByteBuffer) allocate3.rewind());
        this.f38668h.q(this.f38666f, this.f38667g, writableByteChannel);
    }

    public byte[] h() {
        return this.f38662b;
    }

    public boolean i() {
        return this.f38663c;
    }

    @Override // ib.b
    public void j(ib.d dVar) {
    }

    public final synchronized void l() {
        m();
        pp.f fVar = f38660j;
        fVar.b("parsing details of " + f());
        ByteBuffer byteBuffer = this.f38665e;
        if (byteBuffer != null) {
            this.f38663c = true;
            byteBuffer.rewind();
            b(byteBuffer);
            if (byteBuffer.remaining() > 0) {
                this.f38669i = byteBuffer.slice();
            }
            this.f38665e = null;
        }
    }
}