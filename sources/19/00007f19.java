package kotlin.reflect.jvm.internal.impl.renderer;

import java.util.Set;
import wz.x0;

/* loaded from: classes5.dex */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    public static final h f35137a = new h();

    /* renamed from: b  reason: collision with root package name */
    private static final Set<u10.c> f35138b;

    static {
        Set<u10.c> i11;
        i11 = x0.i(new u10.c("kotlin.internal.NoInfer"), new u10.c("kotlin.internal.Exact"));
        f35138b = i11;
    }

    private h() {
    }

    public final Set<u10.c> a() {
        return f35138b;
    }
}