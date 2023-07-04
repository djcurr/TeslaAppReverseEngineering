package dt;

import android.app.Notification;
import kotlin.jvm.internal.s;

/* loaded from: classes6.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    private final int f24240a;

    /* renamed from: b  reason: collision with root package name */
    private final Notification f24241b;

    public b(int i11, Notification notification) {
        s.g(notification, "notification");
        this.f24240a = i11;
        this.f24241b = notification;
    }

    public final int a() {
        return this.f24240a;
    }

    public final Notification b() {
        return this.f24241b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            return this.f24240a == bVar.f24240a && s.c(this.f24241b, bVar.f24241b);
        }
        return false;
    }

    public int hashCode() {
        return (Integer.hashCode(this.f24240a) * 31) + this.f24241b.hashCode();
    }

    public String toString() {
        int i11 = this.f24240a;
        Notification notification = this.f24241b;
        return "NotificationPackage(id=" + i11 + ", notification=" + notification + ")";
    }
}