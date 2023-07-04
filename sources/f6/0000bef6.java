package x30;

import java.util.Comparator;

/* loaded from: classes5.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private int f57025a = 0;

    private void t(Object obj, Object obj2, Comparator<?> comparator) {
        if (obj instanceof long[]) {
            p((long[]) obj, (long[]) obj2);
        } else if (obj instanceof int[]) {
            o((int[]) obj, (int[]) obj2);
        } else if (obj instanceof short[]) {
            r((short[]) obj, (short[]) obj2);
        } else if (obj instanceof char[]) {
            l((char[]) obj, (char[]) obj2);
        } else if (obj instanceof byte[]) {
            k((byte[]) obj, (byte[]) obj2);
        } else if (obj instanceof double[]) {
            m((double[]) obj, (double[]) obj2);
        } else if (obj instanceof float[]) {
            n((float[]) obj, (float[]) obj2);
        } else if (obj instanceof boolean[]) {
            s((boolean[]) obj, (boolean[]) obj2);
        } else {
            q((Object[]) obj, (Object[]) obj2, comparator);
        }
    }

    public a a(byte b11, byte b12) {
        if (this.f57025a != 0) {
            return this;
        }
        this.f57025a = Byte.compare(b11, b12);
        return this;
    }

    public a b(char c11, char c12) {
        if (this.f57025a != 0) {
            return this;
        }
        this.f57025a = Character.compare(c11, c12);
        return this;
    }

    public a c(double d11, double d12) {
        if (this.f57025a != 0) {
            return this;
        }
        this.f57025a = Double.compare(d11, d12);
        return this;
    }

    public a d(float f11, float f12) {
        if (this.f57025a != 0) {
            return this;
        }
        this.f57025a = Float.compare(f11, f12);
        return this;
    }

    public a e(int i11, int i12) {
        if (this.f57025a != 0) {
            return this;
        }
        this.f57025a = Integer.compare(i11, i12);
        return this;
    }

    public a f(long j11, long j12) {
        if (this.f57025a != 0) {
            return this;
        }
        this.f57025a = Long.compare(j11, j12);
        return this;
    }

    public a g(Object obj, Object obj2) {
        return h(obj, obj2, null);
    }

    public a h(Object obj, Object obj2, Comparator<?> comparator) {
        if (this.f57025a == 0 && obj != obj2) {
            if (obj == null) {
                this.f57025a = -1;
                return this;
            } else if (obj2 == null) {
                this.f57025a = 1;
                return this;
            } else {
                if (obj.getClass().isArray()) {
                    t(obj, obj2, comparator);
                } else if (comparator == null) {
                    this.f57025a = ((Comparable) obj).compareTo(obj2);
                } else {
                    this.f57025a = comparator.compare(obj, obj2);
                }
                return this;
            }
        }
        return this;
    }

    public a i(short s11, short s12) {
        if (this.f57025a != 0) {
            return this;
        }
        this.f57025a = Short.compare(s11, s12);
        return this;
    }

    public a j(boolean z11, boolean z12) {
        if (this.f57025a == 0 && z11 != z12) {
            if (z11) {
                this.f57025a = 1;
            } else {
                this.f57025a = -1;
            }
            return this;
        }
        return this;
    }

    public a k(byte[] bArr, byte[] bArr2) {
        if (this.f57025a == 0 && bArr != bArr2) {
            if (bArr == null) {
                this.f57025a = -1;
                return this;
            } else if (bArr2 == null) {
                this.f57025a = 1;
                return this;
            } else if (bArr.length != bArr2.length) {
                this.f57025a = bArr.length >= bArr2.length ? 1 : -1;
                return this;
            } else {
                for (int i11 = 0; i11 < bArr.length && this.f57025a == 0; i11++) {
                    a(bArr[i11], bArr2[i11]);
                }
                return this;
            }
        }
        return this;
    }

    public a l(char[] cArr, char[] cArr2) {
        if (this.f57025a == 0 && cArr != cArr2) {
            if (cArr == null) {
                this.f57025a = -1;
                return this;
            } else if (cArr2 == null) {
                this.f57025a = 1;
                return this;
            } else if (cArr.length != cArr2.length) {
                this.f57025a = cArr.length >= cArr2.length ? 1 : -1;
                return this;
            } else {
                for (int i11 = 0; i11 < cArr.length && this.f57025a == 0; i11++) {
                    b(cArr[i11], cArr2[i11]);
                }
                return this;
            }
        }
        return this;
    }

    public a m(double[] dArr, double[] dArr2) {
        if (this.f57025a == 0 && dArr != dArr2) {
            if (dArr == null) {
                this.f57025a = -1;
                return this;
            } else if (dArr2 == null) {
                this.f57025a = 1;
                return this;
            } else if (dArr.length != dArr2.length) {
                this.f57025a = dArr.length >= dArr2.length ? 1 : -1;
                return this;
            } else {
                for (int i11 = 0; i11 < dArr.length && this.f57025a == 0; i11++) {
                    c(dArr[i11], dArr2[i11]);
                }
                return this;
            }
        }
        return this;
    }

    public a n(float[] fArr, float[] fArr2) {
        if (this.f57025a == 0 && fArr != fArr2) {
            if (fArr == null) {
                this.f57025a = -1;
                return this;
            } else if (fArr2 == null) {
                this.f57025a = 1;
                return this;
            } else if (fArr.length != fArr2.length) {
                this.f57025a = fArr.length >= fArr2.length ? 1 : -1;
                return this;
            } else {
                for (int i11 = 0; i11 < fArr.length && this.f57025a == 0; i11++) {
                    d(fArr[i11], fArr2[i11]);
                }
                return this;
            }
        }
        return this;
    }

    public a o(int[] iArr, int[] iArr2) {
        if (this.f57025a == 0 && iArr != iArr2) {
            if (iArr == null) {
                this.f57025a = -1;
                return this;
            } else if (iArr2 == null) {
                this.f57025a = 1;
                return this;
            } else if (iArr.length != iArr2.length) {
                this.f57025a = iArr.length >= iArr2.length ? 1 : -1;
                return this;
            } else {
                for (int i11 = 0; i11 < iArr.length && this.f57025a == 0; i11++) {
                    e(iArr[i11], iArr2[i11]);
                }
                return this;
            }
        }
        return this;
    }

    public a p(long[] jArr, long[] jArr2) {
        if (this.f57025a == 0 && jArr != jArr2) {
            if (jArr == null) {
                this.f57025a = -1;
                return this;
            } else if (jArr2 == null) {
                this.f57025a = 1;
                return this;
            } else if (jArr.length != jArr2.length) {
                this.f57025a = jArr.length >= jArr2.length ? 1 : -1;
                return this;
            } else {
                for (int i11 = 0; i11 < jArr.length && this.f57025a == 0; i11++) {
                    f(jArr[i11], jArr2[i11]);
                }
                return this;
            }
        }
        return this;
    }

    public a q(Object[] objArr, Object[] objArr2, Comparator<?> comparator) {
        if (this.f57025a == 0 && objArr != objArr2) {
            if (objArr == null) {
                this.f57025a = -1;
                return this;
            } else if (objArr2 == null) {
                this.f57025a = 1;
                return this;
            } else if (objArr.length != objArr2.length) {
                this.f57025a = objArr.length >= objArr2.length ? 1 : -1;
                return this;
            } else {
                for (int i11 = 0; i11 < objArr.length && this.f57025a == 0; i11++) {
                    h(objArr[i11], objArr2[i11], comparator);
                }
                return this;
            }
        }
        return this;
    }

    public a r(short[] sArr, short[] sArr2) {
        if (this.f57025a == 0 && sArr != sArr2) {
            if (sArr == null) {
                this.f57025a = -1;
                return this;
            } else if (sArr2 == null) {
                this.f57025a = 1;
                return this;
            } else if (sArr.length != sArr2.length) {
                this.f57025a = sArr.length >= sArr2.length ? 1 : -1;
                return this;
            } else {
                for (int i11 = 0; i11 < sArr.length && this.f57025a == 0; i11++) {
                    i(sArr[i11], sArr2[i11]);
                }
                return this;
            }
        }
        return this;
    }

    public a s(boolean[] zArr, boolean[] zArr2) {
        if (this.f57025a == 0 && zArr != zArr2) {
            if (zArr == null) {
                this.f57025a = -1;
                return this;
            } else if (zArr2 == null) {
                this.f57025a = 1;
                return this;
            } else if (zArr.length != zArr2.length) {
                this.f57025a = zArr.length >= zArr2.length ? 1 : -1;
                return this;
            } else {
                for (int i11 = 0; i11 < zArr.length && this.f57025a == 0; i11++) {
                    j(zArr[i11], zArr2[i11]);
                }
                return this;
            }
        }
        return this;
    }

    public int u() {
        return this.f57025a;
    }
}