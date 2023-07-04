package ib;

import a40.a;

/* loaded from: classes.dex */
public abstract class c extends mp.c {

    /* renamed from: o  reason: collision with root package name */
    private static final /* synthetic */ a.InterfaceC0010a f30227o = null;

    static {
        n();
    }

    public c(String str) {
        super(str);
    }

    private static /* synthetic */ void n() {
        d40.b bVar = new d40.b("ChunkOffsetBox.java", c.class);
        f30227o = bVar.f("method-execution", bVar.e("1", "toString", "com.coremedia.iso.boxes.ChunkOffsetBox", "", "", "", "java.lang.String"), 18);
    }

    public String toString() {
        mp.f.b().c(d40.b.b(f30227o, this, this));
        return getClass().getSimpleName() + "[entryCount=" + u().length + "]";
    }

    public abstract long[] u();
}