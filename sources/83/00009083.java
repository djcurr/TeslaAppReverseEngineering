package op;

import ch.qos.logback.core.CoreConstants;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

@g(tags = {3})
/* loaded from: classes2.dex */
public class h extends b {

    /* renamed from: q  reason: collision with root package name */
    private static Logger f42899q = Logger.getLogger(h.class.getName());

    /* renamed from: d  reason: collision with root package name */
    int f42900d;

    /* renamed from: e  reason: collision with root package name */
    int f42901e;

    /* renamed from: f  reason: collision with root package name */
    int f42902f;

    /* renamed from: g  reason: collision with root package name */
    int f42903g;

    /* renamed from: h  reason: collision with root package name */
    int f42904h;

    /* renamed from: j  reason: collision with root package name */
    String f42906j;

    /* renamed from: k  reason: collision with root package name */
    int f42907k;

    /* renamed from: l  reason: collision with root package name */
    int f42908l;

    /* renamed from: m  reason: collision with root package name */
    int f42909m;

    /* renamed from: n  reason: collision with root package name */
    e f42910n;

    /* renamed from: o  reason: collision with root package name */
    n f42911o;

    /* renamed from: i  reason: collision with root package name */
    int f42905i = 0;

    /* renamed from: p  reason: collision with root package name */
    List<b> f42912p = new ArrayList();

    @Override // op.b
    public void e(ByteBuffer byteBuffer) {
        this.f42900d = hb.d.h(byteBuffer);
        int l11 = hb.d.l(byteBuffer);
        int i11 = l11 >>> 7;
        this.f42901e = i11;
        this.f42902f = (l11 >>> 6) & 1;
        this.f42903g = (l11 >>> 5) & 1;
        this.f42904h = l11 & 31;
        if (i11 == 1) {
            this.f42908l = hb.d.h(byteBuffer);
        }
        if (this.f42902f == 1) {
            int l12 = hb.d.l(byteBuffer);
            this.f42905i = l12;
            this.f42906j = hb.d.g(byteBuffer, l12);
        }
        if (this.f42903g == 1) {
            this.f42909m = hb.d.h(byteBuffer);
        }
        int b11 = b() + 1 + 2 + 1 + (this.f42901e == 1 ? 2 : 0) + (this.f42902f == 1 ? this.f42905i + 1 : 0) + (this.f42903g == 1 ? 2 : 0);
        int position = byteBuffer.position();
        if (a() > b11 + 2) {
            b a11 = l.a(-1, byteBuffer);
            long position2 = byteBuffer.position() - position;
            Logger logger = f42899q;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(a11);
            sb2.append(" - ESDescriptor1 read: ");
            sb2.append(position2);
            sb2.append(", size: ");
            sb2.append(a11 != null ? Integer.valueOf(a11.a()) : null);
            logger.finer(sb2.toString());
            if (a11 != null) {
                int a12 = a11.a();
                byteBuffer.position(position + a12);
                b11 += a12;
            } else {
                b11 = (int) (b11 + position2);
            }
            if (a11 instanceof e) {
                this.f42910n = (e) a11;
            }
        }
        int position3 = byteBuffer.position();
        if (a() > b11 + 2) {
            b a13 = l.a(-1, byteBuffer);
            long position4 = byteBuffer.position() - position3;
            Logger logger2 = f42899q;
            StringBuilder sb3 = new StringBuilder();
            sb3.append(a13);
            sb3.append(" - ESDescriptor2 read: ");
            sb3.append(position4);
            sb3.append(", size: ");
            sb3.append(a13 != null ? Integer.valueOf(a13.a()) : null);
            logger2.finer(sb3.toString());
            if (a13 != null) {
                int a14 = a13.a();
                byteBuffer.position(position3 + a14);
                b11 += a14;
            } else {
                b11 = (int) (b11 + position4);
            }
            if (a13 instanceof n) {
                this.f42911o = (n) a13;
            }
        } else {
            f42899q.warning("SLConfigDescriptor is missing!");
        }
        while (a() - b11 > 2) {
            int position5 = byteBuffer.position();
            b a15 = l.a(-1, byteBuffer);
            long position6 = byteBuffer.position() - position5;
            Logger logger3 = f42899q;
            StringBuilder sb4 = new StringBuilder();
            sb4.append(a15);
            sb4.append(" - ESDescriptor3 read: ");
            sb4.append(position6);
            sb4.append(", size: ");
            sb4.append(a15 != null ? Integer.valueOf(a15.a()) : null);
            logger3.finer(sb4.toString());
            if (a15 != null) {
                int a16 = a15.a();
                byteBuffer.position(position5 + a16);
                b11 += a16;
            } else {
                b11 = (int) (b11 + position6);
            }
            this.f42912p.add(a15);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || h.class != obj.getClass()) {
            return false;
        }
        h hVar = (h) obj;
        if (this.f42902f == hVar.f42902f && this.f42905i == hVar.f42905i && this.f42908l == hVar.f42908l && this.f42900d == hVar.f42900d && this.f42909m == hVar.f42909m && this.f42903g == hVar.f42903g && this.f42907k == hVar.f42907k && this.f42901e == hVar.f42901e && this.f42904h == hVar.f42904h) {
            String str = this.f42906j;
            if (str == null ? hVar.f42906j == null : str.equals(hVar.f42906j)) {
                e eVar = this.f42910n;
                if (eVar == null ? hVar.f42910n == null : eVar.equals(hVar.f42910n)) {
                    List<b> list = this.f42912p;
                    if (list == null ? hVar.f42912p == null : list.equals(hVar.f42912p)) {
                        n nVar = this.f42911o;
                        n nVar2 = hVar.f42911o;
                        return nVar == null ? nVar2 == null : nVar.equals(nVar2);
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public ByteBuffer f() {
        ByteBuffer allocate = ByteBuffer.allocate(g());
        hb.e.i(allocate, 3);
        hb.e.i(allocate, g() - 2);
        hb.e.e(allocate, this.f42900d);
        hb.e.i(allocate, (this.f42901e << 7) | (this.f42902f << 6) | (this.f42903g << 5) | (this.f42904h & 31));
        if (this.f42901e > 0) {
            hb.e.e(allocate, this.f42908l);
        }
        if (this.f42902f > 0) {
            hb.e.i(allocate, this.f42905i);
            hb.e.j(allocate, this.f42906j);
        }
        if (this.f42903g > 0) {
            hb.e.e(allocate, this.f42909m);
        }
        ByteBuffer f11 = this.f42910n.f();
        ByteBuffer f12 = this.f42911o.f();
        allocate.put(f11.array());
        allocate.put(f12.array());
        return allocate;
    }

    public int g() {
        int i11 = this.f42901e > 0 ? 7 : 5;
        if (this.f42902f > 0) {
            i11 += this.f42905i + 1;
        }
        if (this.f42903g > 0) {
            i11 += 2;
        }
        return i11 + this.f42910n.g() + this.f42911o.g();
    }

    public void h(e eVar) {
        this.f42910n = eVar;
    }

    public int hashCode() {
        int i11 = ((((((((((this.f42900d * 31) + this.f42901e) * 31) + this.f42902f) * 31) + this.f42903g) * 31) + this.f42904h) * 31) + this.f42905i) * 31;
        String str = this.f42906j;
        int hashCode = (((((((i11 + (str != null ? str.hashCode() : 0)) * 31) + this.f42907k) * 31) + this.f42908l) * 31) + this.f42909m) * 31;
        e eVar = this.f42910n;
        int hashCode2 = (hashCode + (eVar != null ? eVar.hashCode() : 0)) * 31;
        n nVar = this.f42911o;
        int hashCode3 = (hashCode2 + (nVar != null ? nVar.hashCode() : 0)) * 31;
        List<b> list = this.f42912p;
        return hashCode3 + (list != null ? list.hashCode() : 0);
    }

    public void i(int i11) {
        this.f42900d = i11;
    }

    public void j(n nVar) {
        this.f42911o = nVar;
    }

    @Override // op.b
    public String toString() {
        return "ESDescriptor{esId=" + this.f42900d + ", streamDependenceFlag=" + this.f42901e + ", URLFlag=" + this.f42902f + ", oCRstreamFlag=" + this.f42903g + ", streamPriority=" + this.f42904h + ", URLLength=" + this.f42905i + ", URLString='" + this.f42906j + CoreConstants.SINGLE_QUOTE_CHAR + ", remoteODFlag=" + this.f42907k + ", dependsOnEsId=" + this.f42908l + ", oCREsId=" + this.f42909m + ", decoderConfigDescriptor=" + this.f42910n + ", slConfigDescriptor=" + this.f42911o + CoreConstants.CURLY_RIGHT;
    }
}