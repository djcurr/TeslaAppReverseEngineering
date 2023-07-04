package com.google.android.exoplayer2.upstream;

import com.google.android.exoplayer2.upstream.a;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public interface HttpDataSource extends com.google.android.exoplayer2.upstream.a {

    /* loaded from: classes3.dex */
    public static final class CleartextNotPermittedException extends HttpDataSourceException {
        public CleartextNotPermittedException(IOException iOException, com.google.android.exoplayer2.upstream.b bVar) {
            super("Cleartext HTTP traffic not permitted. See https://exoplayer.dev/issues/cleartext-not-permitted", iOException, bVar, 1);
        }
    }

    /* loaded from: classes3.dex */
    public static class HttpDataSourceException extends IOException {
        public HttpDataSourceException(String str, com.google.android.exoplayer2.upstream.b bVar, int i11) {
            super(str);
        }

        public HttpDataSourceException(IOException iOException, com.google.android.exoplayer2.upstream.b bVar, int i11) {
            super(iOException);
        }

        public HttpDataSourceException(String str, IOException iOException, com.google.android.exoplayer2.upstream.b bVar, int i11) {
            super(str, iOException);
        }
    }

    /* loaded from: classes3.dex */
    public static final class InvalidContentTypeException extends HttpDataSourceException {
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public InvalidContentTypeException(java.lang.String r3, com.google.android.exoplayer2.upstream.b r4) {
            /*
                r2 = this;
                java.lang.String r3 = java.lang.String.valueOf(r3)
                int r0 = r3.length()
                java.lang.String r1 = "Invalid content type: "
                if (r0 == 0) goto L11
                java.lang.String r3 = r1.concat(r3)
                goto L16
            L11:
                java.lang.String r3 = new java.lang.String
                r3.<init>(r1)
            L16:
                r0 = 1
                r2.<init>(r3, r4, r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.upstream.HttpDataSource.InvalidContentTypeException.<init>(java.lang.String, com.google.android.exoplayer2.upstream.b):void");
        }
    }

    /* loaded from: classes3.dex */
    public static final class InvalidResponseCodeException extends HttpDataSourceException {

        /* renamed from: a  reason: collision with root package name */
        public final int f14591a;

        /* renamed from: b  reason: collision with root package name */
        public final Map<String, List<String>> f14592b;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public InvalidResponseCodeException(int r1, java.lang.String r2, java.util.Map<java.lang.String, java.util.List<java.lang.String>> r3, com.google.android.exoplayer2.upstream.b r4, byte[] r5) {
            /*
                r0 = this;
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r5 = 26
                r2.<init>(r5)
                java.lang.String r5 = "Response code: "
                r2.append(r5)
                r2.append(r1)
                java.lang.String r2 = r2.toString()
                r5 = 1
                r0.<init>(r2, r4, r5)
                r0.f14591a = r1
                r0.f14592b = r3
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.upstream.HttpDataSource.InvalidResponseCodeException.<init>(int, java.lang.String, java.util.Map, com.google.android.exoplayer2.upstream.b, byte[]):void");
        }
    }

    /* loaded from: classes3.dex */
    public static abstract class a implements b {

        /* renamed from: a  reason: collision with root package name */
        private final c f14593a = new c();

        protected abstract HttpDataSource b(c cVar);

        @Deprecated
        public final c c() {
            return this.f14593a;
        }

        @Override // com.google.android.exoplayer2.upstream.a.InterfaceC0258a
        public final HttpDataSource a() {
            return b(this.f14593a);
        }
    }

    /* loaded from: classes3.dex */
    public interface b extends a.InterfaceC0258a {
        @Override // com.google.android.exoplayer2.upstream.a.InterfaceC0258a
        HttpDataSource a();
    }

    /* loaded from: classes3.dex */
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        private final Map<String, String> f14594a = new HashMap();

        /* renamed from: b  reason: collision with root package name */
        private Map<String, String> f14595b;

        public synchronized Map<String, String> a() {
            if (this.f14595b == null) {
                this.f14595b = Collections.unmodifiableMap(new HashMap(this.f14594a));
            }
            return this.f14595b;
        }

        public synchronized void b(Map<String, String> map) {
            this.f14595b = null;
            this.f14594a.putAll(map);
        }
    }
}