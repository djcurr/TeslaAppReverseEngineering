package m00;

import ch.qos.logback.classic.pattern.CallerDataConverter;
import kotlin.jvm.internal.DefaultConstructorMarker;
import wz.n0;

/* loaded from: classes5.dex */
public class g implements Iterable<Integer>, i00.a {

    /* renamed from: d  reason: collision with root package name */
    public static final a f38147d = new a(null);

    /* renamed from: a  reason: collision with root package name */
    private final int f38148a;

    /* renamed from: b  reason: collision with root package name */
    private final int f38149b;

    /* renamed from: c  reason: collision with root package name */
    private final int f38150c;

    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final g a(int i11, int i12, int i13) {
            return new g(i11, i12, i13);
        }
    }

    public g(int i11, int i12, int i13) {
        if (i13 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i13 != Integer.MIN_VALUE) {
            this.f38148a = i11;
            this.f38149b = b00.c.b(i11, i12, i13);
            this.f38150c = i13;
            return;
        }
        throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
    }

    public final int c() {
        return this.f38148a;
    }

    public final int e() {
        return this.f38149b;
    }

    public boolean equals(Object obj) {
        if (obj instanceof g) {
            if (!isEmpty() || !((g) obj).isEmpty()) {
                g gVar = (g) obj;
                if (this.f38148a != gVar.f38148a || this.f38149b != gVar.f38149b || this.f38150c != gVar.f38150c) {
                }
            }
            return true;
        }
        return false;
    }

    public final int f() {
        return this.f38150c;
    }

    @Override // java.lang.Iterable
    /* renamed from: h */
    public n0 iterator() {
        return new h(this.f38148a, this.f38149b, this.f38150c);
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f38148a * 31) + this.f38149b) * 31) + this.f38150c;
    }

    public boolean isEmpty() {
        if (this.f38150c > 0) {
            if (this.f38148a > this.f38149b) {
                return true;
            }
        } else if (this.f38148a < this.f38149b) {
            return true;
        }
        return false;
    }

    public String toString() {
        StringBuilder sb2;
        int i11;
        if (this.f38150c > 0) {
            sb2 = new StringBuilder();
            sb2.append(this.f38148a);
            sb2.append(CallerDataConverter.DEFAULT_RANGE_DELIMITER);
            sb2.append(this.f38149b);
            sb2.append(" step ");
            i11 = this.f38150c;
        } else {
            sb2 = new StringBuilder();
            sb2.append(this.f38148a);
            sb2.append(" downTo ");
            sb2.append(this.f38149b);
            sb2.append(" step ");
            i11 = -this.f38150c;
        }
        sb2.append(i11);
        return sb2.toString();
    }
}