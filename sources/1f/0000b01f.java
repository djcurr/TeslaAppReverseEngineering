package r5;

import android.content.Context;
import kotlin.jvm.internal.s;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private static d f49171a;

    /* renamed from: b  reason: collision with root package name */
    private static e f49172b;

    /* renamed from: c  reason: collision with root package name */
    public static final a f49173c = new a();

    private a() {
    }

    public static final d a(Context context) {
        s.g(context, "context");
        d dVar = f49171a;
        return dVar != null ? dVar : f49173c.b(context);
    }

    private final synchronized d b(Context context) {
        d a11;
        d dVar = f49171a;
        if (dVar != null) {
            return dVar;
        }
        e eVar = f49172b;
        if (eVar == null || (a11 = eVar.a()) == null) {
            Context applicationContext = context.getApplicationContext();
            if (!(applicationContext instanceof e)) {
                applicationContext = null;
            }
            e eVar2 = (e) applicationContext;
            a11 = eVar2 != null ? eVar2.a() : null;
        }
        if (a11 == null) {
            a11 = d.f49186a.a(context);
        }
        f49172b = null;
        f49171a = a11;
        return a11;
    }
}