package r10;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import wz.e0;
import wz.o;
import wz.p;
import wz.w;

/* loaded from: classes5.dex */
public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    private final int[] f49025a;

    /* renamed from: b  reason: collision with root package name */
    private final int f49026b;

    /* renamed from: c  reason: collision with root package name */
    private final int f49027c;

    /* renamed from: d  reason: collision with root package name */
    private final int f49028d;

    /* renamed from: e  reason: collision with root package name */
    private final List<Integer> f49029e;

    /* renamed from: r10.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static final class C1068a {
        private C1068a() {
        }

        public /* synthetic */ C1068a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new C1068a(null);
    }

    public a(int... numbers) {
        Integer M;
        Integer M2;
        Integer M3;
        List<Integer> i11;
        List<Integer> d11;
        s.g(numbers, "numbers");
        this.f49025a = numbers;
        M = p.M(numbers, 0);
        this.f49026b = M == null ? -1 : M.intValue();
        M2 = p.M(numbers, 1);
        this.f49027c = M2 == null ? -1 : M2.intValue();
        M3 = p.M(numbers, 2);
        this.f49028d = M3 != null ? M3.intValue() : -1;
        if (numbers.length > 3) {
            d11 = o.d(numbers);
            i11 = e0.O0(d11.subList(3, numbers.length));
        } else {
            i11 = w.i();
        }
        this.f49029e = i11;
    }

    public final int a() {
        return this.f49026b;
    }

    public final int b() {
        return this.f49027c;
    }

    public final boolean c(int i11, int i12, int i13) {
        int i14 = this.f49026b;
        if (i14 > i11) {
            return true;
        }
        if (i14 < i11) {
            return false;
        }
        int i15 = this.f49027c;
        if (i15 > i12) {
            return true;
        }
        return i15 >= i12 && this.f49028d >= i13;
    }

    public final boolean d(a version) {
        s.g(version, "version");
        return c(version.f49026b, version.f49027c, version.f49028d);
    }

    public final boolean e(int i11, int i12, int i13) {
        int i14 = this.f49026b;
        if (i14 < i11) {
            return true;
        }
        if (i14 > i11) {
            return false;
        }
        int i15 = this.f49027c;
        if (i15 < i12) {
            return true;
        }
        return i15 <= i12 && this.f49028d <= i13;
    }

    public boolean equals(Object obj) {
        if (obj != null && s.c(getClass(), obj.getClass())) {
            a aVar = (a) obj;
            if (this.f49026b == aVar.f49026b && this.f49027c == aVar.f49027c && this.f49028d == aVar.f49028d && s.c(this.f49029e, aVar.f49029e)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean f(a ourVersion) {
        s.g(ourVersion, "ourVersion");
        int i11 = this.f49026b;
        if (i11 == 0) {
            if (ourVersion.f49026b == 0 && this.f49027c == ourVersion.f49027c) {
                return true;
            }
        } else if (i11 == ourVersion.f49026b && this.f49027c <= ourVersion.f49027c) {
            return true;
        }
        return false;
    }

    public final int[] g() {
        return this.f49025a;
    }

    public int hashCode() {
        int i11 = this.f49026b;
        int i12 = i11 + (i11 * 31) + this.f49027c;
        int i13 = i12 + (i12 * 31) + this.f49028d;
        return i13 + (i13 * 31) + this.f49029e.hashCode();
    }

    public String toString() {
        String l02;
        int[] g11 = g();
        ArrayList arrayList = new ArrayList();
        int length = g11.length;
        for (int i11 = 0; i11 < length; i11++) {
            int i12 = g11[i11];
            if (!(i12 != -1)) {
                break;
            }
            arrayList.add(Integer.valueOf(i12));
        }
        if (arrayList.isEmpty()) {
            return "unknown";
        }
        l02 = e0.l0(arrayList, ".", null, null, 0, null, null, 62, null);
        return l02;
    }
}