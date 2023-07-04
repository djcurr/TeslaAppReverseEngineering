package h8;

import android.util.Log;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public class c implements v7.h {

    /* renamed from: a  reason: collision with root package name */
    private static final Set<String> f28975a = new HashSet();

    @Override // v7.h
    public void a(String str, Throwable th2) {
        Set<String> set = f28975a;
        if (set.contains(str)) {
            return;
        }
        Log.w("LOTTIE", str, th2);
        set.add(str);
    }

    public void b(String str, Throwable th2) {
        if (v7.c.f54232a) {
            Log.d("LOTTIE", str, th2);
        }
    }

    @Override // v7.h
    public void debug(String str) {
        b(str, null);
    }

    @Override // v7.h
    public void error(String str, Throwable th2) {
        if (v7.c.f54232a) {
            Log.d("LOTTIE", str, th2);
        }
    }

    @Override // v7.h
    public void warning(String str) {
        a(str, null);
    }
}