package ib;

import a40.a;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public class s extends a {

    /* renamed from: p  reason: collision with root package name */
    private static final /* synthetic */ a.InterfaceC0010a f30281p = null;

    /* renamed from: q  reason: collision with root package name */
    private static final /* synthetic */ a.InterfaceC0010a f30282q = null;

    /* renamed from: o  reason: collision with root package name */
    private float f30283o;

    static {
        n();
    }

    public s() {
        super("smhd");
    }

    private static /* synthetic */ void n() {
        d40.b bVar = new d40.b("SoundMediaHeaderBox.java", s.class);
        f30281p = bVar.f("method-execution", bVar.e("1", "getBalance", "com.coremedia.iso.boxes.SoundMediaHeaderBox", "", "", "", "float"), 36);
        f30282q = bVar.f("method-execution", bVar.e("1", "toString", "com.coremedia.iso.boxes.SoundMediaHeaderBox", "", "", "", "java.lang.String"), 58);
    }

    @Override // mp.a
    public void b(ByteBuffer byteBuffer) {
        q(byteBuffer);
        this.f30283o = hb.d.e(byteBuffer);
        hb.d.h(byteBuffer);
    }

    @Override // mp.a
    protected void c(ByteBuffer byteBuffer) {
        t(byteBuffer);
        hb.e.c(byteBuffer, this.f30283o);
        hb.e.e(byteBuffer, 0);
    }

    @Override // mp.a
    protected long d() {
        return 8L;
    }

    public String toString() {
        mp.f.b().c(d40.b.b(f30282q, this, this));
        return "SoundMediaHeaderBox[balance=" + u() + "]";
    }

    public float u() {
        mp.f.b().c(d40.b.b(f30281p, this, this));
        return this.f30283o;
    }
}