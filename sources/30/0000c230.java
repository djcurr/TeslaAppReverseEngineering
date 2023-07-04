package y70;

import android.util.Log;
import java.io.PrintStream;
import java.util.logging.Level;

/* loaded from: classes5.dex */
public interface f {

    /* loaded from: classes5.dex */
    public static class a implements f {

        /* renamed from: b  reason: collision with root package name */
        static final boolean f59364b;

        /* renamed from: a  reason: collision with root package name */
        private final String f59365a;

        static {
            boolean z11;
            try {
                Class.forName("android.util.Log");
                z11 = true;
            } catch (ClassNotFoundException unused) {
                z11 = false;
            }
            f59364b = z11;
        }

        public a(String str) {
            this.f59365a = str;
        }

        public static boolean c() {
            return f59364b;
        }

        @Override // y70.f
        public void a(Level level, String str, Throwable th2) {
            if (level != Level.OFF) {
                int d11 = d(level);
                String str2 = this.f59365a;
                Log.println(d11, str2, str + "\n" + Log.getStackTraceString(th2));
            }
        }

        @Override // y70.f
        public void b(Level level, String str) {
            if (level != Level.OFF) {
                Log.println(d(level), this.f59365a, str);
            }
        }

        protected int d(Level level) {
            int intValue = level.intValue();
            if (intValue < 800) {
                return intValue < 500 ? 2 : 3;
            } else if (intValue < 900) {
                return 4;
            } else {
                return intValue < 1000 ? 5 : 6;
            }
        }
    }

    /* loaded from: classes5.dex */
    public static class b implements f {
        @Override // y70.f
        public void a(Level level, String str, Throwable th2) {
            PrintStream printStream = System.out;
            printStream.println("[" + level + "] " + str);
            th2.printStackTrace(System.out);
        }

        @Override // y70.f
        public void b(Level level, String str) {
            PrintStream printStream = System.out;
            printStream.println("[" + level + "] " + str);
        }
    }

    void a(Level level, String str, Throwable th2);

    void b(Level level, String str);
}