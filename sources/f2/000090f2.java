package org.bouncycastle.asn1;

import java.io.IOException;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;
import okhttp3.HttpUrl;
import org.bouncycastle.util.a;

/* loaded from: classes5.dex */
public abstract class p extends n implements Iterable {

    /* renamed from: a  reason: collision with root package name */
    e40.b[] f43074a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public class a implements Enumeration {

        /* renamed from: a  reason: collision with root package name */
        private int f43075a = 0;

        a() {
        }

        @Override // java.util.Enumeration
        public boolean hasMoreElements() {
            return this.f43075a < p.this.f43074a.length;
        }

        @Override // java.util.Enumeration
        public Object nextElement() {
            int i11 = this.f43075a;
            e40.b[] bVarArr = p.this.f43074a;
            if (i11 < bVarArr.length) {
                this.f43075a = i11 + 1;
                return bVarArr[i11];
            }
            throw new NoSuchElementException();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public p() {
        this.f43074a = d.f43028d;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public p(e40.b bVar) {
        Objects.requireNonNull(bVar, "'element' cannot be null");
        this.f43074a = new e40.b[]{bVar};
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public p(d dVar) {
        Objects.requireNonNull(dVar, "'elementVector' cannot be null");
        this.f43074a = dVar.g();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public p(e40.b[] bVarArr) {
        if (org.bouncycastle.util.a.O(bVarArr)) {
            throw new NullPointerException("'elements' cannot be null, or contain null");
        }
        this.f43074a = d.b(bVarArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public p(e40.b[] bVarArr, boolean z11) {
        this.f43074a = z11 ? d.b(bVarArr) : bVarArr;
    }

    public static p p(Object obj) {
        if (obj == null || (obj instanceof p)) {
            return (p) obj;
        }
        if (obj instanceof e40.e) {
            return p(((e40.e) obj).toASN1Primitive());
        }
        if (obj instanceof byte[]) {
            try {
                return p(n.k((byte[]) obj));
            } catch (IOException e11) {
                throw new IllegalArgumentException("failed to construct sequence from byte[]: " + e11.getMessage());
            }
        }
        if (obj instanceof e40.b) {
            n aSN1Primitive = ((e40.b) obj).toASN1Primitive();
            if (aSN1Primitive instanceof p) {
                return (p) aSN1Primitive;
            }
        }
        throw new IllegalArgumentException("unknown object in getInstance: " + obj.getClass().getName());
    }

    public static p q(s sVar, boolean z11) {
        if (z11) {
            if (sVar.t()) {
                return p(sVar.r());
            }
            throw new IllegalArgumentException("object implicit - explicit expected.");
        }
        n r11 = sVar.r();
        if (sVar.t()) {
            return sVar instanceof f0 ? new b0(r11) : new k1(r11);
        } else if (r11 instanceof p) {
            p pVar = (p) r11;
            return sVar instanceof f0 ? pVar : (p) pVar.o();
        } else {
            throw new IllegalArgumentException("unknown object in getInstance: " + sVar.getClass().getName());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.n
    public boolean e(n nVar) {
        if (nVar instanceof p) {
            p pVar = (p) nVar;
            int size = size();
            if (pVar.size() != size) {
                return false;
            }
            for (int i11 = 0; i11 < size; i11++) {
                n aSN1Primitive = this.f43074a[i11].toASN1Primitive();
                n aSN1Primitive2 = pVar.f43074a[i11].toASN1Primitive();
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
        int length = this.f43074a.length;
        int i11 = length + 1;
        while (true) {
            length--;
            if (length < 0) {
                return i11;
            }
            i11 = (i11 * 257) ^ this.f43074a[length].toASN1Primitive().hashCode();
        }
    }

    @Override // java.lang.Iterable
    public Iterator<e40.b> iterator() {
        return new a.C0862a(this.f43074a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.n
    public boolean m() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.n
    public n n() {
        return new w0(this.f43074a, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.n
    public n o() {
        return new k1(this.f43074a, false);
    }

    public e40.b r(int i11) {
        return this.f43074a[i11];
    }

    public Enumeration s() {
        return new a();
    }

    public int size() {
        return this.f43074a.length;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public e40.b[] t() {
        return this.f43074a;
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
            stringBuffer.append(this.f43074a[i11]);
            i11++;
            if (i11 >= size) {
                stringBuffer.append(']');
                return stringBuffer.toString();
            }
            stringBuffer.append(", ");
        }
    }
}