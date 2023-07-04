package ib;

import a40.a;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class i extends mp.c {
    private static final /* synthetic */ a.InterfaceC0010a A = null;
    private static final /* synthetic */ a.InterfaceC0010a B = null;
    private static final /* synthetic */ a.InterfaceC0010a C = null;
    private static final /* synthetic */ a.InterfaceC0010a E = null;
    private static final /* synthetic */ a.InterfaceC0010a F = null;

    /* renamed from: z  reason: collision with root package name */
    public static final Map<String, String> f30236z;

    /* renamed from: o  reason: collision with root package name */
    private String f30237o;

    /* renamed from: p  reason: collision with root package name */
    private String f30238p;

    /* renamed from: q  reason: collision with root package name */
    private long f30239q;

    /* renamed from: t  reason: collision with root package name */
    private long f30240t;

    /* renamed from: w  reason: collision with root package name */
    private long f30241w;

    /* renamed from: x  reason: collision with root package name */
    private boolean f30242x;

    /* renamed from: y  reason: collision with root package name */
    private long f30243y;

    static {
        n();
        HashMap hashMap = new HashMap();
        hashMap.put("odsm", "ObjectDescriptorStream - defined in ISO/IEC JTC1/SC29/WG11 - CODING OF MOVING PICTURES AND AUDIO");
        hashMap.put("crsm", "ClockReferenceStream - defined in ISO/IEC JTC1/SC29/WG11 - CODING OF MOVING PICTURES AND AUDIO");
        hashMap.put("sdsm", "SceneDescriptionStream - defined in ISO/IEC JTC1/SC29/WG11 - CODING OF MOVING PICTURES AND AUDIO");
        hashMap.put("m7sm", "MPEG7Stream - defined in ISO/IEC JTC1/SC29/WG11 - CODING OF MOVING PICTURES AND AUDIO");
        hashMap.put("ocsm", "ObjectContentInfoStream - defined in ISO/IEC JTC1/SC29/WG11 - CODING OF MOVING PICTURES AND AUDIO");
        hashMap.put("ipsm", "IPMP Stream - defined in ISO/IEC JTC1/SC29/WG11 - CODING OF MOVING PICTURES AND AUDIO");
        hashMap.put("mjsm", "MPEG-J Stream - defined in ISO/IEC JTC1/SC29/WG11 - CODING OF MOVING PICTURES AND AUDIO");
        hashMap.put("mdir", "Apple Meta Data iTunes Reader");
        hashMap.put("mp7b", "MPEG-7 binary XML");
        hashMap.put("mp7t", "MPEG-7 XML");
        hashMap.put("vide", "Video Track");
        hashMap.put("soun", "Sound Track");
        hashMap.put("hint", "Hint Track");
        hashMap.put("appl", "Apple specific");
        hashMap.put("meta", "Timed Metadata track - defined in ISO/IEC JTC1/SC29/WG11 - CODING OF MOVING PICTURES AND AUDIO");
        f30236z = Collections.unmodifiableMap(hashMap);
    }

    public i() {
        super("hdlr");
        this.f30238p = null;
        this.f30242x = true;
    }

    private static /* synthetic */ void n() {
        d40.b bVar = new d40.b("HandlerBox.java", i.class);
        A = bVar.f("method-execution", bVar.e("1", "getHandlerType", "com.coremedia.iso.boxes.HandlerBox", "", "", "", "java.lang.String"), 78);
        B = bVar.f("method-execution", bVar.e("1", "setName", "com.coremedia.iso.boxes.HandlerBox", "java.lang.String", "name", "", "void"), 87);
        C = bVar.f("method-execution", bVar.e("1", "setHandlerType", "com.coremedia.iso.boxes.HandlerBox", "java.lang.String", "handlerType", "", "void"), 91);
        E = bVar.f("method-execution", bVar.e("1", "getName", "com.coremedia.iso.boxes.HandlerBox", "", "", "", "java.lang.String"), 95);
        bVar.f("method-execution", bVar.e("1", "getHumanReadableTrackType", "com.coremedia.iso.boxes.HandlerBox", "", "", "", "java.lang.String"), 99);
        F = bVar.f("method-execution", bVar.e("1", "toString", "com.coremedia.iso.boxes.HandlerBox", "", "", "", "java.lang.String"), 149);
    }

    @Override // mp.a
    public void b(ByteBuffer byteBuffer) {
        q(byteBuffer);
        this.f30243y = hb.d.j(byteBuffer);
        this.f30237o = hb.d.b(byteBuffer);
        this.f30239q = hb.d.j(byteBuffer);
        this.f30240t = hb.d.j(byteBuffer);
        this.f30241w = hb.d.j(byteBuffer);
        if (byteBuffer.remaining() > 0) {
            String g11 = hb.d.g(byteBuffer, byteBuffer.remaining());
            this.f30238p = g11;
            if (g11.endsWith("\u0000")) {
                String str = this.f30238p;
                this.f30238p = str.substring(0, str.length() - 1);
                this.f30242x = true;
                return;
            }
            this.f30242x = false;
            return;
        }
        this.f30242x = false;
    }

    @Override // mp.a
    protected void c(ByteBuffer byteBuffer) {
        t(byteBuffer);
        hb.e.g(byteBuffer, this.f30243y);
        byteBuffer.put(hb.c.J(this.f30237o));
        hb.e.g(byteBuffer, this.f30239q);
        hb.e.g(byteBuffer, this.f30240t);
        hb.e.g(byteBuffer, this.f30241w);
        String str = this.f30238p;
        if (str != null) {
            byteBuffer.put(hb.f.b(str));
        }
        if (this.f30242x) {
            byteBuffer.put((byte) 0);
        }
    }

    @Override // mp.a
    protected long d() {
        int c11;
        if (this.f30242x) {
            c11 = hb.f.c(this.f30238p) + 25;
        } else {
            c11 = hb.f.c(this.f30238p) + 24;
        }
        return c11;
    }

    public String toString() {
        mp.f.b().c(d40.b.b(F, this, this));
        return "HandlerBox[handlerType=" + u() + ";name=" + v() + "]";
    }

    public String u() {
        mp.f.b().c(d40.b.b(A, this, this));
        return this.f30237o;
    }

    public String v() {
        mp.f.b().c(d40.b.b(E, this, this));
        return this.f30238p;
    }

    public void w(String str) {
        mp.f.b().c(d40.b.c(C, this, this, str));
        this.f30237o = str;
    }

    public void x(String str) {
        mp.f.b().c(d40.b.c(B, this, this, str));
        this.f30238p = str;
    }
}