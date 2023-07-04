package kotlinx.coroutines.internal;

/* loaded from: classes5.dex */
public final class r {

    /* renamed from: a  reason: collision with root package name */
    private static final Object f35498a = new f0("CONDITION_FALSE");

    /* renamed from: b  reason: collision with root package name */
    private static final Object f35499b = new f0("LIST_EMPTY");

    public static final Object a() {
        return f35498a;
    }

    public static final Object b() {
        return f35499b;
    }

    public static final s c(Object obj) {
        b0 b0Var = obj instanceof b0 ? (b0) obj : null;
        s sVar = b0Var != null ? b0Var.f35449a : null;
        return sVar == null ? (s) obj : sVar;
    }
}