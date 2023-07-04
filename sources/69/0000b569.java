package tl;

import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.jvm.internal.s;
import zm.b;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private static volatile FirebaseAnalytics f52344a;

    /* renamed from: b  reason: collision with root package name */
    private static final Object f52345b = new Object();

    public static final FirebaseAnalytics a() {
        return f52344a;
    }

    public static final FirebaseAnalytics b(zm.a aVar) {
        s.g(aVar, "<this>");
        if (f52344a == null) {
            synchronized (f52345b) {
                if (a() == null) {
                    c(FirebaseAnalytics.getInstance(b.a(zm.a.f60534a).j()));
                }
            }
        }
        FirebaseAnalytics firebaseAnalytics = f52344a;
        s.e(firebaseAnalytics);
        return firebaseAnalytics;
    }

    public static final void c(FirebaseAnalytics firebaseAnalytics) {
        f52344a = firebaseAnalytics;
    }
}