package eh;

import android.content.Context;
import java.io.File;

/* loaded from: classes3.dex */
public class b {

    /* loaded from: classes3.dex */
    public interface a {
        void a(Context context, String[] strArr, String str, File file, eh.c cVar);
    }

    /* renamed from: eh.b$b  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public interface InterfaceC0486b {
        void a(String str);

        String b(String str);

        String c(String str);

        String[] d();

        void e(String str);
    }

    /* loaded from: classes3.dex */
    public interface c {
        void a();

        void b(Throwable th2);
    }

    /* loaded from: classes3.dex */
    public interface d {
        void log(String str);
    }

    public static void a(Context context, String str, String str2) {
        b(context, str, str2, null);
    }

    public static void b(Context context, String str, String str2, c cVar) {
        new eh.c().f(context, str, str2, cVar);
    }
}