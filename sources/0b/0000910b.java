package org.bouncycastle.asn1;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.NoSuchElementException;

/* loaded from: classes5.dex */
public class x extends l {

    /* renamed from: b  reason: collision with root package name */
    private final int f43114b;

    /* renamed from: c  reason: collision with root package name */
    private final l[] f43115c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public class a implements Enumeration {

        /* renamed from: a  reason: collision with root package name */
        int f43116a = 0;

        a() {
        }

        @Override // java.util.Enumeration
        public boolean hasMoreElements() {
            return this.f43116a < x.this.f43063a.length;
        }

        @Override // java.util.Enumeration
        public Object nextElement() {
            int i11 = this.f43116a;
            x xVar = x.this;
            byte[] bArr = xVar.f43063a;
            if (i11 < bArr.length) {
                int min = Math.min(bArr.length - i11, xVar.f43114b);
                byte[] bArr2 = new byte[min];
                System.arraycopy(x.this.f43063a, this.f43116a, bArr2, 0, min);
                this.f43116a += min;
                return new s0(bArr2);
            }
            throw new NoSuchElementException();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public class b implements Enumeration {

        /* renamed from: a  reason: collision with root package name */
        int f43118a = 0;

        b() {
        }

        @Override // java.util.Enumeration
        public boolean hasMoreElements() {
            return this.f43118a < x.this.f43115c.length;
        }

        @Override // java.util.Enumeration
        public Object nextElement() {
            if (this.f43118a < x.this.f43115c.length) {
                l[] lVarArr = x.this.f43115c;
                int i11 = this.f43118a;
                this.f43118a = i11 + 1;
                return lVarArr[i11];
            }
            throw new NoSuchElementException();
        }
    }

    public x(byte[] bArr) {
        this(bArr, 1000);
    }

    public x(byte[] bArr, int i11) {
        this(bArr, null, i11);
    }

    private x(byte[] bArr, l[] lVarArr, int i11) {
        super(bArr);
        this.f43115c = lVarArr;
        this.f43114b = i11;
    }

    public x(l[] lVarArr) {
        this(lVarArr, 1000);
    }

    public x(l[] lVarArr, int i11) {
        this(w(lVarArr), lVarArr, i11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static x u(p pVar) {
        int size = pVar.size();
        l[] lVarArr = new l[size];
        for (int i11 = 0; i11 < size; i11++) {
            lVarArr[i11] = l.p(pVar.r(i11));
        }
        return new x(lVarArr);
    }

    private static byte[] w(l[] lVarArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        for (int i11 = 0; i11 != lVarArr.length; i11++) {
            try {
                byteArrayOutputStream.write(lVarArr[i11].r());
            } catch (IOException e11) {
                throw new IllegalArgumentException("exception converting octets " + e11.toString());
            }
        }
        return byteArrayOutputStream.toByteArray();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.n
    public void f(m mVar, boolean z11) {
        mVar.p(z11, 36, v());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.n
    public int h() {
        Enumeration v11 = v();
        int i11 = 0;
        while (v11.hasMoreElements()) {
            i11 += ((e40.b) v11.nextElement()).toASN1Primitive().h();
        }
        return i11 + 2 + 2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.n
    public boolean m() {
        return true;
    }

    public Enumeration v() {
        return this.f43115c == null ? new a() : new b();
    }
}