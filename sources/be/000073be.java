package ht;

import com.google.firebase.crashlytics.FirebaseCrashlytics;
import java.util.Map;
import kotlin.jvm.internal.s;

/* loaded from: classes6.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f29422a = new a();

    private a() {
    }

    public final void a(String key, String value) {
        s.g(key, "key");
        s.g(value, "value");
        FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
        firebaseCrashlytics.log(key + ": " + value);
    }

    public final void b(Map<String, String> data, Throwable throwable) {
        s.g(data, "data");
        s.g(throwable, "throwable");
        FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
        for (Map.Entry<String, String> entry : data.entrySet()) {
            f29422a.a(entry.getKey(), entry.getValue());
        }
        firebaseCrashlytics.recordException(throwable);
    }
}