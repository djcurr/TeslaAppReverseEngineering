package kotlinx.coroutines.sync;

import kotlinx.coroutines.internal.f0;

/* loaded from: classes5.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    private static final f0 f35604a;

    /* renamed from: b  reason: collision with root package name */
    private static final f0 f35605b;

    /* renamed from: c  reason: collision with root package name */
    private static final f0 f35606c;

    /* renamed from: d  reason: collision with root package name */
    private static final a f35607d;

    /* renamed from: e  reason: collision with root package name */
    private static final a f35608e;

    static {
        new f0("LOCK_FAIL");
        f35604a = new f0("UNLOCK_FAIL");
        f0 f0Var = new f0("LOCKED");
        f35605b = f0Var;
        f0 f0Var2 = new f0("UNLOCKED");
        f35606c = f0Var2;
        f35607d = new a(f0Var);
        f35608e = new a(f0Var2);
    }

    public static final b a(boolean z11) {
        return new c(z11);
    }

    public static /* synthetic */ b b(boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        return a(z11);
    }
}