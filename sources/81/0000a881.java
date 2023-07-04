package ow;

import android.content.Context;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.s;
import mw.e;

/* loaded from: classes6.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    private static final AtomicReference<a> f45191a;

    static {
        new b();
        AtomicReference<a> atomicReference = new AtomicReference<>();
        f45191a = atomicReference;
        a aVar = atomicReference.get();
        if (aVar == null) {
            return;
        }
        aVar.a();
    }

    private b() {
    }

    public static final String a(Context context) {
        s.g(context, "context");
        return f45191a.get().b(context);
    }

    public static final int b() {
        return f45191a.get().d();
    }

    public static final void c(a notificationDependencies) {
        s.g(notificationDependencies, "notificationDependencies");
        f45191a.compareAndSet(null, notificationDependencies);
    }

    public static final void d(e notification, Context context, com.wix.reactnativenotifications.core.notification.a type) {
        s.g(notification, "notification");
        s.g(context, "context");
        s.g(type, "type");
        f45191a.get().c(notification, context, type);
    }

    public static final void e(Context context, String str) {
        s.g(context, "context");
        f45191a.get().e(context, str);
    }
}