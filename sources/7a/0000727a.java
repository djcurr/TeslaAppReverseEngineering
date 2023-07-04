package h30;

import org.spongycastle.asn1.cmp.PKIFailureInfo;
import vz.q;

/* loaded from: classes5.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final e f28826a = new e();

    /* renamed from: b  reason: collision with root package name */
    private static final wz.k<char[]> f28827b = new wz.k<>();

    /* renamed from: c  reason: collision with root package name */
    private static int f28828c;

    /* renamed from: d  reason: collision with root package name */
    private static final int f28829d;

    static {
        Object b11;
        Integer n11;
        try {
            q.a aVar = vz.q.f54772b;
            String property = System.getProperty("kotlinx.serialization.json.pool.size");
            kotlin.jvm.internal.s.f(property, "getProperty(\"kotlinx.ser…lization.json.pool.size\")");
            n11 = kotlin.text.u.n(property);
            b11 = vz.q.b(n11);
        } catch (Throwable th2) {
            q.a aVar2 = vz.q.f54772b;
            b11 = vz.q.b(vz.r.a(th2));
        }
        if (vz.q.g(b11)) {
            b11 = null;
        }
        Integer num = (Integer) b11;
        f28829d = num != null ? num.intValue() : PKIFailureInfo.badCertTemplate;
    }

    private e() {
    }

    public final void a(char[] array) {
        kotlin.jvm.internal.s.g(array, "array");
        synchronized (this) {
            int i11 = f28828c;
            if (array.length + i11 < f28829d) {
                f28828c = i11 + array.length;
                f28827b.addLast(array);
            }
            vz.b0 b0Var = vz.b0.f54756a;
        }
    }

    public final char[] b() {
        char[] q11;
        synchronized (this) {
            q11 = f28827b.q();
            if (q11 != null) {
                f28828c -= q11.length;
            } else {
                q11 = null;
            }
        }
        return q11 == null ? new char[128] : q11;
    }
}