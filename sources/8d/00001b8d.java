package com.google.android.exoplayer2.drm;

import com.google.android.exoplayer2.drm.e;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* loaded from: classes3.dex */
public interface j {

    /* loaded from: classes3.dex */
    public static final class a implements d {

        /* renamed from: a  reason: collision with root package name */
        private final j f13364a;

        public a(j jVar) {
            this.f13364a = jVar;
        }

        @Override // com.google.android.exoplayer2.drm.j.d
        public j a(UUID uuid) {
            this.f13364a.b();
            return this.f13364a;
        }
    }

    /* loaded from: classes3.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final byte[] f13365a;

        /* renamed from: b  reason: collision with root package name */
        private final String f13366b;

        public b(byte[] bArr, String str, int i11) {
            this.f13365a = bArr;
            this.f13366b = str;
        }

        public byte[] a() {
            return this.f13365a;
        }

        public String b() {
            return this.f13366b;
        }
    }

    /* loaded from: classes3.dex */
    public interface c {
        void a(j jVar, byte[] bArr, int i11, int i12, byte[] bArr2);
    }

    /* loaded from: classes3.dex */
    public interface d {
        j a(UUID uuid);
    }

    /* loaded from: classes3.dex */
    public static final class e {

        /* renamed from: a  reason: collision with root package name */
        private final byte[] f13367a;

        /* renamed from: b  reason: collision with root package name */
        private final String f13368b;

        public e(byte[] bArr, String str) {
            this.f13367a = bArr;
            this.f13368b = str;
        }

        public byte[] a() {
            return this.f13367a;
        }

        public String b() {
            return this.f13368b;
        }
    }

    Class<? extends hi.m> a();

    void b();

    Map<String, String> c(byte[] bArr);

    hi.m d(byte[] bArr);

    e e();

    byte[] f();

    void g(byte[] bArr, byte[] bArr2);

    void h(c cVar);

    void i(byte[] bArr);

    void j(byte[] bArr);

    byte[] k(byte[] bArr, byte[] bArr2);

    b l(byte[] bArr, List<e.b> list, int i11, HashMap<String, String> hashMap);

    void release();
}