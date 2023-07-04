package i40;

import java.util.Enumeration;
import org.bouncycastle.asn1.k;
import org.bouncycastle.asn1.l;
import org.bouncycastle.asn1.n;
import org.bouncycastle.asn1.p;
import org.bouncycastle.asn1.s0;
import org.bouncycastle.asn1.w0;

/* loaded from: classes5.dex */
public class c extends e40.c {

    /* renamed from: a  reason: collision with root package name */
    private l f29867a;

    /* renamed from: b  reason: collision with root package name */
    private k f29868b;

    private c(p pVar) {
        Enumeration s11 = pVar.s();
        this.f29867a = (l) s11.nextElement();
        this.f29868b = (k) s11.nextElement();
    }

    public c(byte[] bArr, k kVar) {
        this.f29867a = new s0(bArr);
        this.f29868b = kVar;
    }

    public static c h(Object obj) {
        if (obj instanceof c) {
            return (c) obj;
        }
        if (obj != null) {
            return new c(p.p(obj));
        }
        return null;
    }

    public k e() {
        return this.f29868b;
    }

    public byte[] f() {
        return org.bouncycastle.util.a.h(this.f29867a.r());
    }

    @Override // e40.c, e40.b
    public n toASN1Primitive() {
        org.bouncycastle.asn1.d dVar = new org.bouncycastle.asn1.d(2);
        dVar.a(this.f29867a);
        dVar.a(this.f29868b);
        return new w0(dVar);
    }
}