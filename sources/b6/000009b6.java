package androidx.work;

import android.app.Notification;
import ch.qos.logback.core.CoreConstants;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    private final int f6545a;

    /* renamed from: b  reason: collision with root package name */
    private final int f6546b;

    /* renamed from: c  reason: collision with root package name */
    private final Notification f6547c;

    public i(int i11, Notification notification) {
        this(i11, notification, 0);
    }

    public int a() {
        return this.f6546b;
    }

    public Notification b() {
        return this.f6547c;
    }

    public int c() {
        return this.f6545a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || i.class != obj.getClass()) {
            return false;
        }
        i iVar = (i) obj;
        if (this.f6545a == iVar.f6545a && this.f6546b == iVar.f6546b) {
            return this.f6547c.equals(iVar.f6547c);
        }
        return false;
    }

    public int hashCode() {
        return (((this.f6545a * 31) + this.f6546b) * 31) + this.f6547c.hashCode();
    }

    public String toString() {
        return "ForegroundInfo{mNotificationId=" + this.f6545a + ", mForegroundServiceType=" + this.f6546b + ", mNotification=" + this.f6547c + CoreConstants.CURLY_RIGHT;
    }

    public i(int i11, Notification notification, int i12) {
        this.f6545a = i11;
        this.f6547c = notification;
        this.f6546b = i12;
    }
}