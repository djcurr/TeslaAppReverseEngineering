package v20;

/* loaded from: classes5.dex */
public final class i2 {

    /* renamed from: a  reason: collision with root package name */
    private static final kotlinx.coroutines.internal.f0 f53948a = new kotlinx.coroutines.internal.f0("COMPLETING_ALREADY");

    /* renamed from: b  reason: collision with root package name */
    public static final kotlinx.coroutines.internal.f0 f53949b = new kotlinx.coroutines.internal.f0("COMPLETING_WAITING_CHILDREN");

    /* renamed from: c  reason: collision with root package name */
    private static final kotlinx.coroutines.internal.f0 f53950c = new kotlinx.coroutines.internal.f0("COMPLETING_RETRY");

    /* renamed from: d  reason: collision with root package name */
    private static final kotlinx.coroutines.internal.f0 f53951d = new kotlinx.coroutines.internal.f0("TOO_LATE_TO_CANCEL");

    /* renamed from: e  reason: collision with root package name */
    private static final kotlinx.coroutines.internal.f0 f53952e = new kotlinx.coroutines.internal.f0("SEALED");

    /* renamed from: f  reason: collision with root package name */
    private static final j1 f53953f = new j1(false);

    /* renamed from: g  reason: collision with root package name */
    private static final j1 f53954g = new j1(true);

    public static final Object g(Object obj) {
        return obj instanceof v1 ? new w1((v1) obj) : obj;
    }

    public static final Object h(Object obj) {
        v1 v1Var;
        w1 w1Var = obj instanceof w1 ? (w1) obj : null;
        return (w1Var == null || (v1Var = w1Var.f54011a) == null) ? obj : v1Var;
    }
}