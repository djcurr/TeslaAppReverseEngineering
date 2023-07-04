package com.android.volley;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public interface a {

    /* renamed from: com.android.volley.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0196a {

        /* renamed from: a  reason: collision with root package name */
        public byte[] f10250a;

        /* renamed from: b  reason: collision with root package name */
        public String f10251b;

        /* renamed from: c  reason: collision with root package name */
        public long f10252c;

        /* renamed from: d  reason: collision with root package name */
        public long f10253d;

        /* renamed from: e  reason: collision with root package name */
        public long f10254e;

        /* renamed from: f  reason: collision with root package name */
        public long f10255f;

        /* renamed from: g  reason: collision with root package name */
        public Map<String, String> f10256g = Collections.emptyMap();

        /* renamed from: h  reason: collision with root package name */
        public List<e> f10257h;

        public boolean a() {
            return b(System.currentTimeMillis());
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public boolean b(long j11) {
            return this.f10254e < j11;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public boolean c(long j11) {
            return this.f10255f < j11;
        }
    }

    void a(String str, boolean z11);

    void b(String str, C0196a c0196a);

    C0196a get(String str);

    void initialize();
}