package ib;

import a40.a;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/* loaded from: classes.dex */
public class h extends mp.a {

    /* renamed from: n  reason: collision with root package name */
    private static final /* synthetic */ a.InterfaceC0010a f30231n = null;

    /* renamed from: o  reason: collision with root package name */
    private static final /* synthetic */ a.InterfaceC0010a f30232o = null;

    /* renamed from: k  reason: collision with root package name */
    private String f30233k;

    /* renamed from: l  reason: collision with root package name */
    private long f30234l;

    /* renamed from: m  reason: collision with root package name */
    private List<String> f30235m;

    static {
        n();
    }

    public h() {
        super("ftyp");
        this.f30235m = Collections.emptyList();
    }

    private static /* synthetic */ void n() {
        d40.b bVar = new d40.b("FileTypeBox.java", h.class);
        f30231n = bVar.f("method-execution", bVar.e("1", "getMajorBrand", "com.coremedia.iso.boxes.FileTypeBox", "", "", "", "java.lang.String"), 85);
        bVar.f("method-execution", bVar.e("1", "setMajorBrand", "com.coremedia.iso.boxes.FileTypeBox", "java.lang.String", "majorBrand", "", "void"), 94);
        bVar.f("method-execution", bVar.e("1", "setMinorVersion", "com.coremedia.iso.boxes.FileTypeBox", "long", "minorVersion", "", "void"), 103);
        f30232o = bVar.f("method-execution", bVar.e("1", "getMinorVersion", "com.coremedia.iso.boxes.FileTypeBox", "", "", "", "long"), 113);
        bVar.f("method-execution", bVar.e("1", "getCompatibleBrands", "com.coremedia.iso.boxes.FileTypeBox", "", "", "", "java.util.List"), 122);
        bVar.f("method-execution", bVar.e("1", "setCompatibleBrands", "com.coremedia.iso.boxes.FileTypeBox", "java.util.List", "compatibleBrands", "", "void"), 126);
    }

    @Override // mp.a
    public void b(ByteBuffer byteBuffer) {
        this.f30233k = hb.d.b(byteBuffer);
        this.f30234l = hb.d.j(byteBuffer);
        int remaining = byteBuffer.remaining() / 4;
        this.f30235m = new LinkedList();
        for (int i11 = 0; i11 < remaining; i11++) {
            this.f30235m.add(hb.d.b(byteBuffer));
        }
    }

    @Override // mp.a
    protected void c(ByteBuffer byteBuffer) {
        byteBuffer.put(hb.c.J(this.f30233k));
        hb.e.g(byteBuffer, this.f30234l);
        for (String str : this.f30235m) {
            byteBuffer.put(hb.c.J(str));
        }
    }

    @Override // mp.a
    protected long d() {
        return (this.f30235m.size() * 4) + 8;
    }

    public String o() {
        mp.f.b().c(d40.b.b(f30231n, this, this));
        return this.f30233k;
    }

    public long p() {
        mp.f.b().c(d40.b.b(f30232o, this, this));
        return this.f30234l;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("FileTypeBox[");
        sb2.append("majorBrand=");
        sb2.append(o());
        sb2.append(";");
        sb2.append("minorVersion=");
        sb2.append(p());
        for (String str : this.f30235m) {
            sb2.append(";");
            sb2.append("compatibleBrand=");
            sb2.append(str);
        }
        sb2.append("]");
        return sb2.toString();
    }

    public h(String str, long j11, List<String> list) {
        super("ftyp");
        this.f30235m = Collections.emptyList();
        this.f30233k = str;
        this.f30234l = j11;
        this.f30235m = list;
    }
}