package bc;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* loaded from: classes.dex */
public class k extends Number implements Comparable<k> {

    /* renamed from: a  reason: collision with root package name */
    private final long f7613a;

    /* renamed from: b  reason: collision with root package name */
    private final long f7614b;

    public k(long j11, long j12) {
        this.f7613a = j11;
        this.f7614b = j12;
    }

    private static long a(long j11, long j12) {
        int i11;
        if (j11 < 0) {
            j11 = -j11;
        }
        if (j12 < 0) {
            j12 = -j12;
        }
        while (true) {
            i11 = (j11 > 0L ? 1 : (j11 == 0L ? 0 : -1));
            if (i11 == 0 || j12 == 0) {
                break;
            } else if (j11 > j12) {
                j11 %= j12;
            } else {
                j12 %= j11;
            }
        }
        return i11 == 0 ? j12 : j11;
    }

    @Override // java.lang.Comparable
    /* renamed from: b */
    public int compareTo(k kVar) {
        return Double.compare(doubleValue(), kVar.doubleValue());
    }

    @Override // java.lang.Number
    public final byte byteValue() {
        return (byte) doubleValue();
    }

    public boolean c(k kVar) {
        return kVar.doubleValue() == doubleValue();
    }

    public final long d() {
        return this.f7614b;
    }

    @Override // java.lang.Number
    public double doubleValue() {
        long j11 = this.f7613a;
        if (j11 == 0) {
            return 0.0d;
        }
        return j11 / this.f7614b;
    }

    public final long e() {
        return this.f7613a;
    }

    public boolean equals(Object obj) {
        return obj != null && (obj instanceof k) && doubleValue() == ((k) obj).doubleValue();
    }

    public k f() {
        return new k(this.f7614b, this.f7613a);
    }

    @Override // java.lang.Number
    public float floatValue() {
        long j11 = this.f7613a;
        return j11 == 0 ? BitmapDescriptorFactory.HUE_RED : ((float) j11) / ((float) this.f7614b);
    }

    public k g() {
        long a11 = a(this.f7613a, this.f7614b);
        return new k(this.f7613a / a11, this.f7614b / a11);
    }

    public boolean h() {
        long j11 = this.f7614b;
        return j11 == 1 || (j11 != 0 && this.f7613a % j11 == 0) || (j11 == 0 && this.f7613a == 0);
    }

    public int hashCode() {
        return (((int) this.f7614b) * 23) + ((int) this.f7613a);
    }

    public boolean i() {
        return this.f7613a == 0 || this.f7614b == 0;
    }

    @Override // java.lang.Number
    public final int intValue() {
        return (int) doubleValue();
    }

    public String k(boolean z11) {
        if (this.f7614b == 0 && this.f7613a != 0) {
            return toString();
        }
        if (h()) {
            return Integer.toString(intValue());
        }
        long j11 = this.f7613a;
        if (j11 != 1) {
            long j12 = this.f7614b;
            if (j12 % j11 == 0) {
                return new k(1L, j12 / j11).k(z11);
            }
        }
        k g11 = g();
        if (z11) {
            String d11 = Double.toString(g11.doubleValue());
            if (d11.length() < 5) {
                return d11;
            }
        }
        return g11.toString();
    }

    @Override // java.lang.Number
    public final long longValue() {
        return (long) doubleValue();
    }

    @Override // java.lang.Number
    public final short shortValue() {
        return (short) doubleValue();
    }

    public String toString() {
        return this.f7613a + "/" + this.f7614b;
    }
}