package wo;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    private final a f56155a;

    /* renamed from: b  reason: collision with root package name */
    private final int[] f56156b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(a aVar, int[] iArr) {
        if (iArr.length != 0) {
            this.f56155a = aVar;
            int length = iArr.length;
            if (length > 1 && iArr[0] == 0) {
                int i11 = 1;
                while (i11 < length && iArr[i11] == 0) {
                    i11++;
                }
                if (i11 == length) {
                    this.f56156b = new int[]{0};
                    return;
                }
                int[] iArr2 = new int[length - i11];
                this.f56156b = iArr2;
                System.arraycopy(iArr, i11, iArr2, 0, iArr2.length);
                return;
            }
            this.f56156b = iArr;
            return;
        }
        throw new IllegalArgumentException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public b a(b bVar) {
        if (this.f56155a.equals(bVar.f56155a)) {
            if (e()) {
                return bVar;
            }
            if (bVar.e()) {
                return this;
            }
            int[] iArr = this.f56156b;
            int[] iArr2 = bVar.f56156b;
            if (iArr.length <= iArr2.length) {
                iArr = iArr2;
                iArr2 = iArr;
            }
            int[] iArr3 = new int[iArr.length];
            int length = iArr.length - iArr2.length;
            System.arraycopy(iArr, 0, iArr3, 0, length);
            for (int i11 = length; i11 < iArr.length; i11++) {
                iArr3[i11] = a.a(iArr2[i11 - length], iArr[i11]);
            }
            return new b(this.f56155a, iArr3);
        }
        throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int b(int i11) {
        if (i11 == 0) {
            return c(0);
        }
        if (i11 == 1) {
            int i12 = 0;
            for (int i13 : this.f56156b) {
                i12 = a.a(i12, i13);
            }
            return i12;
        }
        int[] iArr = this.f56156b;
        int i14 = iArr[0];
        int length = iArr.length;
        for (int i15 = 1; i15 < length; i15++) {
            i14 = a.a(this.f56155a.j(i11, i14), this.f56156b[i15]);
        }
        return i14;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int c(int i11) {
        int[] iArr = this.f56156b;
        return iArr[(iArr.length - 1) - i11];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int d() {
        return this.f56156b.length - 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean e() {
        return this.f56156b[0] == 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public b f(int i11) {
        if (i11 == 0) {
            return this.f56155a.g();
        }
        if (i11 == 1) {
            return this;
        }
        int length = this.f56156b.length;
        int[] iArr = new int[length];
        for (int i12 = 0; i12 < length; i12++) {
            iArr[i12] = this.f56155a.j(this.f56156b[i12], i11);
        }
        return new b(this.f56155a, iArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public b g(b bVar) {
        if (this.f56155a.equals(bVar.f56155a)) {
            if (!e() && !bVar.e()) {
                int[] iArr = this.f56156b;
                int length = iArr.length;
                int[] iArr2 = bVar.f56156b;
                int length2 = iArr2.length;
                int[] iArr3 = new int[(length + length2) - 1];
                for (int i11 = 0; i11 < length; i11++) {
                    int i12 = iArr[i11];
                    for (int i13 = 0; i13 < length2; i13++) {
                        int i14 = i11 + i13;
                        iArr3[i14] = a.a(iArr3[i14], this.f56155a.j(i12, iArr2[i13]));
                    }
                }
                return new b(this.f56155a, iArr3);
            }
            return this.f56155a.g();
        }
        throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public b h(int i11, int i12) {
        if (i11 >= 0) {
            if (i12 == 0) {
                return this.f56155a.g();
            }
            int length = this.f56156b.length;
            int[] iArr = new int[i11 + length];
            for (int i13 = 0; i13 < length; i13++) {
                iArr[i13] = this.f56155a.j(this.f56156b[i13], i12);
            }
            return new b(this.f56155a, iArr);
        }
        throw new IllegalArgumentException();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(d() * 8);
        for (int d11 = d(); d11 >= 0; d11--) {
            int c11 = c(d11);
            if (c11 != 0) {
                if (c11 < 0) {
                    sb2.append(" - ");
                    c11 = -c11;
                } else if (sb2.length() > 0) {
                    sb2.append(" + ");
                }
                if (d11 == 0 || c11 != 1) {
                    int i11 = this.f56155a.i(c11);
                    if (i11 == 0) {
                        sb2.append('1');
                    } else if (i11 == 1) {
                        sb2.append('a');
                    } else {
                        sb2.append("a^");
                        sb2.append(i11);
                    }
                }
                if (d11 != 0) {
                    if (d11 == 1) {
                        sb2.append('x');
                    } else {
                        sb2.append("x^");
                        sb2.append(d11);
                    }
                }
            }
        }
        return sb2.toString();
    }
}