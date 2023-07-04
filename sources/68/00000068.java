package a6;

import android.content.Context;
import android.net.ConnectivityManager;
import android.os.Build;
import g6.f;
import g6.k;
import kotlin.jvm.internal.s;

/* loaded from: classes.dex */
public interface b {

    /* renamed from: a  reason: collision with root package name */
    public static final a f279a = a.f280a;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f280a = new a();

        private a() {
        }

        public final b a(Context context, InterfaceC0011b listener, k kVar) {
            b cVar;
            s.g(context, "context");
            s.g(listener, "listener");
            ConnectivityManager connectivityManager = (ConnectivityManager) androidx.core.content.b.getSystemService(context, ConnectivityManager.class);
            if (connectivityManager != null) {
                if (androidx.core.content.b.checkSelfPermission(context, "android.permission.ACCESS_NETWORK_STATE") == 0) {
                    try {
                        if (Build.VERSION.SDK_INT >= 21) {
                            cVar = new d(connectivityManager, listener);
                        } else {
                            cVar = new c(context, connectivityManager, listener);
                        }
                        return cVar;
                    } catch (Exception e11) {
                        if (kVar != null) {
                            f.a(kVar, "NetworkObserver", new RuntimeException("Failed to register network observer.", e11));
                        }
                        return a6.a.f278b;
                    }
                }
            }
            if (kVar != null && kVar.getLevel() <= 5) {
                kVar.a("NetworkObserver", 5, "Unable to register network observer.", null);
            }
            return a6.a.f278b;
        }
    }

    /* renamed from: a6.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0011b {
        void a(boolean z11);
    }

    boolean a();

    void shutdown();
}