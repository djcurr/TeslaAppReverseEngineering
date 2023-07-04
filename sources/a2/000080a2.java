package ks;

import kotlin.jvm.internal.s;

/* loaded from: classes6.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final c f35701a = new c();

    /* renamed from: b  reason: collision with root package name */
    public static b f35702b;

    private c() {
    }

    public final b a() {
        b bVar = f35702b;
        if (bVar != null) {
            return bVar;
        }
        s.x("INSTANCE");
        return null;
    }

    public final void b(b bVar) {
        s.g(bVar, "<set-?>");
        f35702b = bVar;
    }
}