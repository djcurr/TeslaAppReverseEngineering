package ib;

import a40.a;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public class e extends mp.c {

    /* renamed from: o  reason: collision with root package name */
    private static final /* synthetic */ a.InterfaceC0010a f30228o = null;

    static {
        n();
    }

    public e() {
        super("url ");
    }

    private static /* synthetic */ void n() {
        d40.b bVar = new d40.b("DataEntryUrlBox.java", e.class);
        f30228o = bVar.f("method-execution", bVar.e("1", "toString", "com.coremedia.iso.boxes.DataEntryUrlBox", "", "", "", "java.lang.String"), 51);
    }

    @Override // mp.a
    public void b(ByteBuffer byteBuffer) {
        q(byteBuffer);
    }

    @Override // mp.a
    protected void c(ByteBuffer byteBuffer) {
        t(byteBuffer);
    }

    @Override // mp.a
    protected long d() {
        return 4L;
    }

    public String toString() {
        mp.f.b().c(d40.b.b(f30228o, this, this));
        return "DataEntryUrlBox[]";
    }
}