package v20;

import ch.qos.logback.core.CoreConstants;
import kotlin.jvm.internal.DefaultConstructorMarker;
import zz.g;

/* loaded from: classes5.dex */
public final class m0 extends zz.a implements z2<String> {

    /* renamed from: b  reason: collision with root package name */
    public static final a f53976b = new a(null);

    /* renamed from: a  reason: collision with root package name */
    private final long f53977a;

    /* loaded from: classes5.dex */
    public static final class a implements g.c<m0> {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public m0(long j11) {
        super(f53976b);
        this.f53977a = j11;
    }

    public final long I0() {
        return this.f53977a;
    }

    @Override // v20.z2
    /* renamed from: J0 */
    public void t0(zz.g gVar, String str) {
        Thread.currentThread().setName(str);
    }

    @Override // v20.z2
    /* renamed from: P0 */
    public String p0(zz.g gVar) {
        int e02;
        String I0;
        n0 n0Var = (n0) gVar.get(n0.f53978b);
        String str = "coroutine";
        if (n0Var != null && (I0 = n0Var.I0()) != null) {
            str = I0;
        }
        Thread currentThread = Thread.currentThread();
        String name = currentThread.getName();
        e02 = kotlin.text.w.e0(name, " @", 0, false, 6, null);
        if (e02 < 0) {
            e02 = name.length();
        }
        StringBuilder sb2 = new StringBuilder(str.length() + e02 + 10);
        String substring = name.substring(0, e02);
        kotlin.jvm.internal.s.f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        sb2.append(substring);
        sb2.append(" @");
        sb2.append(str);
        sb2.append('#');
        sb2.append(I0());
        String sb3 = sb2.toString();
        kotlin.jvm.internal.s.f(sb3, "StringBuilder(capacity).…builderAction).toString()");
        currentThread.setName(sb3);
        return name;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m0) && this.f53977a == ((m0) obj).f53977a;
    }

    public int hashCode() {
        return Long.hashCode(this.f53977a);
    }

    public String toString() {
        return "CoroutineId(" + this.f53977a + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}