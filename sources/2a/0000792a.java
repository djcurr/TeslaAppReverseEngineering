package io.sentry.android.core;

import android.os.SystemClock;
import java.util.Date;
import org.jetbrains.annotations.ApiStatus;

@ApiStatus.Internal
/* loaded from: classes5.dex */
public final class y {

    /* renamed from: e  reason: collision with root package name */
    private static y f32174e = new y();

    /* renamed from: a  reason: collision with root package name */
    private Long f32175a;

    /* renamed from: b  reason: collision with root package name */
    private Long f32176b;

    /* renamed from: c  reason: collision with root package name */
    private Boolean f32177c = null;

    /* renamed from: d  reason: collision with root package name */
    private Date f32178d;

    private y() {
    }

    public static y c() {
        return f32174e;
    }

    public synchronized Long a() {
        Long l11;
        if (this.f32175a != null && (l11 = this.f32176b) != null && this.f32177c != null) {
            long longValue = l11.longValue() - this.f32175a.longValue();
            if (longValue >= 60000) {
                return null;
            }
            return Long.valueOf(longValue);
        }
        return null;
    }

    public Date b() {
        return this.f32178d;
    }

    public Boolean d() {
        return this.f32177c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void e() {
        f(SystemClock.uptimeMillis());
    }

    void f(long j11) {
        this.f32176b = Long.valueOf(j11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void g(long j11, Date date) {
        if (this.f32178d == null || this.f32175a == null) {
            this.f32178d = date;
            this.f32175a = Long.valueOf(j11);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void h(boolean z11) {
        if (this.f32177c != null) {
            return;
        }
        this.f32177c = Boolean.valueOf(z11);
    }
}