package org.bouncycastle.asn1;

import java.io.IOException;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;
import okhttp3.HttpUrl;
import org.bouncycastle.util.a;
import org.spongycastle.asn1.ASN1Encoding;

/* loaded from: classes5.dex */
public abstract class q extends n implements Iterable {

    /* renamed from: a  reason: collision with root package name */
    protected final e40.b[] f43081a;

    /* renamed from: b  reason: collision with root package name */
    protected final boolean f43082b;

    /* loaded from: classes5.dex */
    class a implements Enumeration {

        /* renamed from: a  reason: collision with root package name */
        private int f43083a = 0;

        a() {
        }

        @Override // java.util.Enumeration
        public boolean hasMoreElements() {
            return this.f43083a < q.this.f43081a.length;
        }

        @Override // java.util.Enumeration
        public Object nextElement() {
            int i11 = this.f43083a;
            e40.b[] bVarArr = q.this.f43081a;
            if (i11 < bVarArr.length) {
                this.f43083a = i11 + 1;
                return bVarArr[i11];
            }
            throw new NoSuchElementException();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public q() {
        this.f43081a = d.f43028d;
        this.f43082b = true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public q(e40.b bVar) {
        Objects.requireNonNull(bVar, "'element' cannot be null");
        this.f43081a = new e40.b[]{bVar};
        this.f43082b = true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public q(d dVar, boolean z11) {
        e40.b[] g11;
        Objects.requireNonNull(dVar, "'elementVector' cannot be null");
        if (!z11 || dVar.f() < 2) {
            g11 = dVar.g();
        } else {
            g11 = dVar.c();
            v(g11);
        }
        this.f43081a = g11;
        this.f43082b = z11 || g11.length < 2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public q(boolean z11, e40.b[] bVarArr) {
        this.f43081a = bVarArr;
        this.f43082b = z11 || bVarArr.length < 2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public q(e40.b[] bVarArr, boolean z11) {
        if (org.bouncycastle.util.a.O(bVarArr)) {
            throw new NullPointerException("'elements' cannot be null, or contain null");
        }
        e40.b[] b11 = d.b(bVarArr);
        if (z11 && b11.length >= 2) {
            v(b11);
        }
        this.f43081a = b11;
        this.f43082b = z11 || b11.length < 2;
    }

    private static byte[] p(e40.b bVar) {
        try {
            return bVar.toASN1Primitive().d(ASN1Encoding.DER);
        } catch (IOException unused) {
            throw new IllegalArgumentException("cannot encode object added to SET");
        }
    }

    public static q q(Object obj) {
        if (obj == null || (obj instanceof q)) {
            return (q) obj;
        }
        if (obj instanceof e40.f) {
            return q(((e40.f) obj).toASN1Primitive());
        }
        if (obj instanceof byte[]) {
            try {
                return q(n.k((byte[]) obj));
            } catch (IOException e11) {
                throw new IllegalArgumentException("failed to construct set from byte[]: " + e11.getMessage());
            }
        }
        if (obj instanceof e40.b) {
            n aSN1Primitive = ((e40.b) obj).toASN1Primitive();
            if (aSN1Primitive instanceof q) {
                return (q) aSN1Primitive;
            }
        }
        throw new IllegalArgumentException("unknown object in getInstance: " + obj.getClass().getName());
    }

    public static q r(s sVar, boolean z11) {
        if (z11) {
            if (sVar.t()) {
                return q(sVar.r());
            }
            throw new IllegalArgumentException("object implicit - explicit expected.");
        }
        n r11 = sVar.r();
        if (sVar.t()) {
            return sVar instanceof f0 ? new d0(r11) : new m1(r11);
        } else if (r11 instanceof q) {
            q qVar = (q) r11;
            return sVar instanceof f0 ? qVar : (q) qVar.o();
        } else if (r11 instanceof p) {
            e40.b[] t11 = ((p) r11).t();
            return sVar instanceof f0 ? new d0(false, t11) : new m1(false, t11);
        } else {
            throw new IllegalArgumentException("unknown object in getInstance: " + sVar.getClass().getName());
        }
    }

    private static boolean u(byte[] bArr, byte[] bArr2) {
        int i11 = bArr[0] & (-33);
        int i12 = bArr2[0] & (-33);
        if (i11 != i12) {
            return i11 < i12;
        }
        int min = Math.min(bArr.length, bArr2.length) - 1;
        for (int i13 = 1; i13 < min; i13++) {
            if (bArr[i13] != bArr2[i13]) {
                return (bArr[i13] & 255) < (bArr2[i13] & 255);
            }
        }
        return (bArr[min] & 255) <= (bArr2[min] & 255);
    }

    private static void v(e40.b[] bVarArr) {
        int length = bVarArr.length;
        if (length < 2) {
            return;
        }
        e40.b bVar = bVarArr[0];
        e40.b bVar2 = bVarArr[1];
        byte[] p11 = p(bVar);
        byte[] p12 = p(bVar2);
        if (u(p12, p11)) {
            bVar2 = bVar;
            bVar = bVar2;
            p12 = p11;
            p11 = p12;
        }
        for (int i11 = 2; i11 < length; i11++) {
            e40.b bVar3 = bVarArr[i11];
            byte[] p13 = p(bVar3);
            if (u(p12, p13)) {
                bVarArr[i11 - 2] = bVar;
                bVar = bVar2;
                p11 = p12;
                bVar2 = bVar3;
                p12 = p13;
            } else if (u(p11, p13)) {
                bVarArr[i11 - 2] = bVar;
                bVar = bVar3;
                p11 = p13;
            } else {
                int i12 = i11 - 1;
                while (true) {
                    i12--;
                    if (i12 <= 0) {
                        break;
                    }
                    e40.b bVar4 = bVarArr[i12 - 1];
                    if (u(p(bVar4), p13)) {
                        break;
                    }
                    bVarArr[i12] = bVar4;
                }
                bVarArr[i12] = bVar3;
            }
        }
        bVarArr[length - 2] = bVar;
        bVarArr[length - 1] = bVar2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.n
    public boolean e(n nVar) {
        if (nVar instanceof q) {
            q qVar = (q) nVar;
            int size = size();
            if (qVar.size() != size) {
                return false;
            }
            x0 x0Var = (x0) n();
            x0 x0Var2 = (x0) qVar.n();
            for (int i11 = 0; i11 < size; i11++) {
                n aSN1Primitive = x0Var.f43081a[i11].toASN1Primitive();
                n aSN1Primitive2 = x0Var2.f43081a[i11].toASN1Primitive();
                if (aSN1Primitive != aSN1Primitive2 && !aSN1Primitive.e(aSN1Primitive2)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    @Override // e40.c
    public int hashCode() {
        int length = this.f43081a.length;
        int i11 = length + 1;
        while (true) {
            length--;
            if (length < 0) {
                return i11;
            }
            i11 += this.f43081a[length].toASN1Primitive().hashCode();
        }
    }

    @Override // java.lang.Iterable
    public Iterator<e40.b> iterator() {
        return new a.C0862a(w());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.n
    public boolean m() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.n
    public n n() {
        e40.b[] bVarArr;
        if (this.f43082b) {
            bVarArr = this.f43081a;
        } else {
            bVarArr = (e40.b[]) this.f43081a.clone();
            v(bVarArr);
        }
        return new x0(true, bVarArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.n
    public n o() {
        return new m1(this.f43082b, this.f43081a);
    }

    public e40.b s(int i11) {
        return this.f43081a[i11];
    }

    public int size() {
        return this.f43081a.length;
    }

    public Enumeration t() {
        return new a();
    }

    public String toString() {
        int size = size();
        if (size == 0) {
            return HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append('[');
        int i11 = 0;
        while (true) {
            stringBuffer.append(this.f43081a[i11]);
            i11++;
            if (i11 >= size) {
                stringBuffer.append(']');
                return stringBuffer.toString();
            }
            stringBuffer.append(", ");
        }
    }

    public e40.b[] w() {
        return d.b(this.f43081a);
    }
}