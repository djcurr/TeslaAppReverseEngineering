package com.google.firebase.remoteconfig.internal;

import android.content.SharedPreferences;
import java.util.Date;
import mn.f;

/* loaded from: classes2.dex */
public class m {

    /* renamed from: d  reason: collision with root package name */
    static final Date f17147d = new Date(-1);

    /* renamed from: e  reason: collision with root package name */
    static final Date f17148e = new Date(-1);

    /* renamed from: a  reason: collision with root package name */
    private final SharedPreferences f17149a;

    /* renamed from: b  reason: collision with root package name */
    private final Object f17150b = new Object();

    /* renamed from: c  reason: collision with root package name */
    private final Object f17151c = new Object();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private int f17152a;

        /* renamed from: b  reason: collision with root package name */
        private Date f17153b;

        a(int i11, Date date) {
            this.f17152a = i11;
            this.f17153b = date;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public Date a() {
            return this.f17153b;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public int b() {
            return this.f17152a;
        }
    }

    public m(SharedPreferences sharedPreferences) {
        this.f17149a = sharedPreferences;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a a() {
        a aVar;
        synchronized (this.f17151c) {
            aVar = new a(this.f17149a.getInt("num_failed_fetches", 0), new Date(this.f17149a.getLong("backoff_end_time_in_millis", -1L)));
        }
        return aVar;
    }

    public long b() {
        return this.f17149a.getLong("fetch_timeout_in_seconds", 60L);
    }

    public mn.e c() {
        o a11;
        synchronized (this.f17150b) {
            long j11 = this.f17149a.getLong("last_fetch_time_in_millis", -1L);
            int i11 = this.f17149a.getInt("last_fetch_status", 0);
            a11 = o.b().c(i11).d(j11).b(new f.b().d(this.f17149a.getLong("fetch_timeout_in_seconds", 60L)).e(this.f17149a.getLong("minimum_fetch_interval_in_seconds", j.f17124j)).c()).a();
        }
        return a11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String d() {
        return this.f17149a.getString("last_fetch_etag", null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Date e() {
        return new Date(this.f17149a.getLong("last_fetch_time_in_millis", -1L));
    }

    public long f() {
        return this.f17149a.getLong("minimum_fetch_interval_in_seconds", j.f17124j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void g() {
        h(0, f17148e);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void h(int i11, Date date) {
        synchronized (this.f17151c) {
            this.f17149a.edit().putInt("num_failed_fetches", i11).putLong("backoff_end_time_in_millis", date.getTime()).apply();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void i(String str) {
        synchronized (this.f17150b) {
            this.f17149a.edit().putString("last_fetch_etag", str).apply();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void j() {
        synchronized (this.f17150b) {
            this.f17149a.edit().putInt("last_fetch_status", 1).apply();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void k(Date date) {
        synchronized (this.f17150b) {
            this.f17149a.edit().putInt("last_fetch_status", -1).putLong("last_fetch_time_in_millis", date.getTime()).apply();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void l() {
        synchronized (this.f17150b) {
            this.f17149a.edit().putInt("last_fetch_status", 2).apply();
        }
    }
}