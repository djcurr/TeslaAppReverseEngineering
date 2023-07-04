package c50;

import java.util.Enumeration;
import org.bouncycastle.asn1.k;
import org.bouncycastle.asn1.n;
import org.bouncycastle.asn1.p;
import org.bouncycastle.asn1.s;
import org.bouncycastle.asn1.w0;

/* loaded from: classes5.dex */
public class c extends e40.c implements e40.a {

    /* renamed from: f  reason: collision with root package name */
    private static e f8881f = d50.c.P;

    /* renamed from: a  reason: collision with root package name */
    private boolean f8882a;

    /* renamed from: b  reason: collision with root package name */
    private int f8883b;

    /* renamed from: c  reason: collision with root package name */
    private e f8884c;

    /* renamed from: d  reason: collision with root package name */
    private b[] f8885d;

    /* renamed from: e  reason: collision with root package name */
    private w0 f8886e;

    public c(e eVar, c cVar) {
        this.f8884c = eVar;
        this.f8885d = cVar.f8885d;
        this.f8886e = cVar.f8886e;
    }

    public c(e eVar, String str) {
        this(eVar.fromString(str));
        this.f8884c = eVar;
    }

    private c(e eVar, p pVar) {
        this.f8884c = eVar;
        this.f8885d = new b[pVar.size()];
        Enumeration s11 = pVar.s();
        int i11 = 0;
        boolean z11 = true;
        while (s11.hasMoreElements()) {
            Object nextElement = s11.nextElement();
            b h11 = b.h(nextElement);
            z11 &= h11 == nextElement;
            this.f8885d[i11] = h11;
            i11++;
        }
        this.f8886e = z11 ? w0.u(pVar) : new w0(this.f8885d);
    }

    public c(e eVar, b[] bVarArr) {
        this.f8884c = eVar;
        b[] bVarArr2 = (b[]) bVarArr.clone();
        this.f8885d = bVarArr2;
        this.f8886e = new w0(bVarArr2);
    }

    public c(String str) {
        this(f8881f, str);
    }

    private c(p pVar) {
        this(f8881f, pVar);
    }

    public c(b[] bVarArr) {
        this(f8881f, bVarArr);
    }

    public static c e(e eVar, Object obj) {
        if (obj instanceof c) {
            return new c(eVar, (c) obj);
        }
        if (obj != null) {
            return new c(eVar, p.p(obj));
        }
        return null;
    }

    public static c f(Object obj) {
        if (obj instanceof c) {
            return (c) obj;
        }
        if (obj != null) {
            return new c(p.p(obj));
        }
        return null;
    }

    public static c h(s sVar, boolean z11) {
        return f(p.q(sVar, true));
    }

    @Override // e40.c
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof c) || (obj instanceof p)) {
            if (toASN1Primitive().j(((e40.b) obj).toASN1Primitive())) {
                return true;
            }
            try {
                return this.f8884c.a(this, new c(p.p(((e40.b) obj).toASN1Primitive())));
            } catch (Exception unused) {
                return false;
            }
        }
        return false;
    }

    @Override // e40.c
    public int hashCode() {
        if (this.f8882a) {
            return this.f8883b;
        }
        this.f8882a = true;
        int d11 = this.f8884c.d(this);
        this.f8883b = d11;
        return d11;
    }

    public b[] i() {
        return (b[]) this.f8885d.clone();
    }

    public b[] j(k kVar) {
        int length = this.f8885d.length;
        b[] bVarArr = new b[length];
        int i11 = 0;
        int i12 = 0;
        while (true) {
            b[] bVarArr2 = this.f8885d;
            if (i11 == bVarArr2.length) {
                break;
            }
            b bVar = bVarArr2[i11];
            if (bVar.e(kVar)) {
                bVarArr[i12] = bVar;
                i12++;
            }
            i11++;
        }
        if (i12 < length) {
            b[] bVarArr3 = new b[i12];
            System.arraycopy(bVarArr, 0, bVarArr3, 0, i12);
            return bVarArr3;
        }
        return bVarArr;
    }

    @Override // e40.c, e40.b
    public n toASN1Primitive() {
        return this.f8886e;
    }

    public String toString() {
        return this.f8884c.c(this);
    }
}