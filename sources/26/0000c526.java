package zs;

import android.content.Context;
import kotlin.jvm.internal.s;

/* loaded from: classes6.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final c f60699a = new c();

    private c() {
    }

    public final byte[] a(String email, Context context) {
        s.g(email, "email");
        s.g(context, "context");
        byte[] t11 = a.t(a.l().n(email, context.getApplicationContext()).getPublic());
        s.f(t11, "getUniqueKeyPortion(\n   …tionContext).public\n    )");
        return t11;
    }
}