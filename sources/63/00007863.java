package io.realm.internal.android;

import android.os.Looper;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;

/* loaded from: classes5.dex */
public class a implements io.realm.internal.a {
    @SuppressFBWarnings({"MS_SHOULD_BE_FINAL", "MS_CANNOT_BE_FINAL"})

    /* renamed from: c  reason: collision with root package name */
    public static boolean f31911c = false;

    /* renamed from: a  reason: collision with root package name */
    private final Looper f31912a = Looper.myLooper();

    /* renamed from: b  reason: collision with root package name */
    private final boolean f31913b = e();

    private boolean d() {
        return this.f31912a != null;
    }

    private static boolean e() {
        String name = Thread.currentThread().getName();
        return name != null && name.startsWith("IntentService[");
    }

    @Override // io.realm.internal.a
    public boolean a() {
        Looper looper = this.f31912a;
        return looper != null && (f31911c || looper == Looper.getMainLooper());
    }

    @Override // io.realm.internal.a
    public void b(String str) {
        String str2 = "";
        if (!d()) {
            if (str != null) {
                str2 = str + " Realm cannot be automatically updated on a thread without a looper.";
            }
            throw new IllegalStateException(str2);
        } else if (this.f31913b) {
            if (str != null) {
                str2 = str + " Realm cannot be automatically updated on an IntentService thread.";
            }
            throw new IllegalStateException(str2);
        }
    }

    @Override // io.realm.internal.a
    public boolean c() {
        return d() && !this.f31913b;
    }
}