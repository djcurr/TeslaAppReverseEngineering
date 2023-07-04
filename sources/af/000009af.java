package androidx.work;

import android.content.Context;

/* loaded from: classes.dex */
public abstract class d0 {

    /* renamed from: a */
    private static final String f6540a = q.f("WorkerFactory");

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a extends d0 {
        a() {
        }

        @Override // androidx.work.d0
        public ListenableWorker a(Context context, String str, WorkerParameters workerParameters) {
            return null;
        }
    }

    public static d0 c() {
        return new a();
    }

    public abstract ListenableWorker a(Context context, String str, WorkerParameters workerParameters);

    public final ListenableWorker b(Context context, String str, WorkerParameters workerParameters) {
        ListenableWorker a11 = a(context, str, workerParameters);
        if (a11 == null) {
            Class cls = null;
            try {
                cls = Class.forName(str).asSubclass(ListenableWorker.class);
            } catch (Throwable th2) {
                q c11 = q.c();
                String str2 = f6540a;
                c11.b(str2, "Invalid class: " + str, th2);
            }
            if (cls != null) {
                try {
                    a11 = (ListenableWorker) cls.getDeclaredConstructor(Context.class, WorkerParameters.class).newInstance(context, workerParameters);
                } catch (Throwable th3) {
                    q c12 = q.c();
                    String str3 = f6540a;
                    c12.b(str3, "Could not instantiate " + str, th3);
                }
            }
        }
        if (a11 == null || !a11.isUsed()) {
            return a11;
        }
        throw new IllegalStateException(String.format("WorkerFactory (%s) returned an instance of a ListenableWorker (%s) which has already been invoked. createWorker() must always return a new instance of a ListenableWorker.", getClass().getName(), str));
    }
}