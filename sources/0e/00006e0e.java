package fe;

import android.os.Looper;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    private static a f26204a;

    /* renamed from: fe.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0515a {
        void release();
    }

    public static synchronized a b() {
        a aVar;
        synchronized (a.class) {
            if (f26204a == null) {
                f26204a = new b();
            }
            aVar = f26204a;
        }
        return aVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean c() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    public abstract void a(InterfaceC0515a interfaceC0515a);

    public abstract void d(InterfaceC0515a interfaceC0515a);
}