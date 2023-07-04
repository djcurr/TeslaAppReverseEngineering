package fn;

import android.util.Log;

/* loaded from: classes2.dex */
class c {

    /* renamed from: a  reason: collision with root package name */
    private static c f26692a;

    private c() {
    }

    public static synchronized c c() {
        c cVar;
        synchronized (c.class) {
            if (f26692a == null) {
                f26692a = new c();
            }
            cVar = f26692a;
        }
        return cVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(String str) {
        Log.d("FirebasePerformance", str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(String str) {
        Log.e("FirebasePerformance", str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d(String str) {
        Log.i("FirebasePerformance", str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e(String str) {
        Log.w("FirebasePerformance", str);
    }
}