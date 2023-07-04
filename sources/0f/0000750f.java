package ib;

import a40.a;
import ch.qos.logback.core.CoreConstants;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class v extends mp.c {

    /* renamed from: p  reason: collision with root package name */
    private static final /* synthetic */ a.InterfaceC0010a f30290p = null;

    /* renamed from: q  reason: collision with root package name */
    private static final /* synthetic */ a.InterfaceC0010a f30291q = null;

    /* renamed from: o  reason: collision with root package name */
    List<a> f30292o;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        long f30293a;

        /* renamed from: b  reason: collision with root package name */
        long f30294b;

        public a(long j11, long j12) {
            this.f30293a = j11;
            this.f30294b = j12;
        }

        public long a() {
            return this.f30293a;
        }

        public long b() {
            return this.f30294b;
        }

        public void c(long j11) {
            this.f30293a = j11;
        }

        public String toString() {
            return "Entry{count=" + this.f30293a + ", delta=" + this.f30294b + CoreConstants.CURLY_RIGHT;
        }
    }

    static {
        n();
        new WeakHashMap();
    }

    public v() {
        super("stts");
        this.f30292o = Collections.emptyList();
    }

    private static /* synthetic */ void n() {
        d40.b bVar = new d40.b("TimeToSampleBox.java", v.class);
        bVar.f("method-execution", bVar.e("1", "getEntries", "com.coremedia.iso.boxes.TimeToSampleBox", "", "", "", "java.util.List"), 79);
        f30290p = bVar.f("method-execution", bVar.e("1", "setEntries", "com.coremedia.iso.boxes.TimeToSampleBox", "java.util.List", "entries", "", "void"), 83);
        f30291q = bVar.f("method-execution", bVar.e("1", "toString", "com.coremedia.iso.boxes.TimeToSampleBox", "", "", "", "java.lang.String"), 87);
    }

    @Override // mp.a
    public void b(ByteBuffer byteBuffer) {
        q(byteBuffer);
        int a11 = pp.b.a(hb.d.j(byteBuffer));
        this.f30292o = new ArrayList(a11);
        for (int i11 = 0; i11 < a11; i11++) {
            this.f30292o.add(new a(hb.d.j(byteBuffer), hb.d.j(byteBuffer)));
        }
    }

    @Override // mp.a
    protected void c(ByteBuffer byteBuffer) {
        t(byteBuffer);
        hb.e.g(byteBuffer, this.f30292o.size());
        for (a aVar : this.f30292o) {
            hb.e.g(byteBuffer, aVar.a());
            hb.e.g(byteBuffer, aVar.b());
        }
    }

    @Override // mp.a
    protected long d() {
        return (this.f30292o.size() * 8) + 8;
    }

    public String toString() {
        mp.f.b().c(d40.b.b(f30291q, this, this));
        return "TimeToSampleBox[entryCount=" + this.f30292o.size() + "]";
    }

    public void u(List<a> list) {
        mp.f.b().c(d40.b.c(f30290p, this, this, list));
        this.f30292o = list;
    }
}