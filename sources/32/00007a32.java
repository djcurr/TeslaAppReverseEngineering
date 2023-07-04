package it;

import android.content.Context;
import com.tesla.features.RefreshFeaturesConfigWorker;
import com.tesla.logging.TeslaLog;
import kotlin.jvm.internal.s;

/* loaded from: classes6.dex */
public final class c {

    /* renamed from: a */
    public static final c f32751a = new c();

    private c() {
    }

    public static /* synthetic */ void a(Context context, Boolean bool) {
        c(context, bool);
    }

    public static final void c(Context context, Boolean loggedIn) {
        s.g(context, "$context");
        s.f(loggedIn, "loggedIn");
        if (loggedIn.booleanValue()) {
            TeslaLog.INSTANCE.i("Features", "User is logged in, scheduling/updating features config");
            RefreshFeaturesConfigWorker.f21861c.a(context);
        }
    }

    public final void b(final Context context) {
        s.g(context, "context");
        yu.i.f59792a.h().k().I(new ky.f() { // from class: it.b
            @Override // ky.f
            public final void accept(Object obj) {
                c.a(context, (Boolean) obj);
            }
        });
    }
}