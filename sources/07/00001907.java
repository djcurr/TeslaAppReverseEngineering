package com.facebook.react.modules.network;

import java.io.OutputStream;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okio.c0;
import okio.r;

/* loaded from: classes3.dex */
public class i extends RequestBody {

    /* renamed from: a  reason: collision with root package name */
    private final RequestBody f12056a;

    /* renamed from: b  reason: collision with root package name */
    private final h f12057b;

    /* renamed from: c  reason: collision with root package name */
    private long f12058c = 0;

    public i(RequestBody requestBody, h hVar) {
        this.f12056a = requestBody;
        this.f12057b = hVar;
    }

    private c0 b(okio.g gVar) {
        return r.g(new a(gVar.G1()));
    }

    @Override // okhttp3.RequestBody
    public long contentLength() {
        if (this.f12058c == 0) {
            this.f12058c = this.f12056a.contentLength();
        }
        return this.f12058c;
    }

    @Override // okhttp3.RequestBody
    public MediaType contentType() {
        return this.f12056a.contentType();
    }

    @Override // okhttp3.RequestBody
    public void writeTo(okio.g gVar) {
        okio.g c11 = r.c(b(gVar));
        contentLength();
        this.f12056a.writeTo(c11);
        c11.flush();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class a extends b {
        a(OutputStream outputStream) {
            super(outputStream);
        }

        private void g() {
            long a11 = a();
            long contentLength = i.this.contentLength();
            i.this.f12057b.a(a11, contentLength, a11 == contentLength);
        }

        @Override // com.facebook.react.modules.network.b, java.io.FilterOutputStream, java.io.OutputStream
        public void write(byte[] bArr, int i11, int i12) {
            super.write(bArr, i11, i12);
            g();
        }

        @Override // com.facebook.react.modules.network.b, java.io.FilterOutputStream, java.io.OutputStream
        public void write(int i11) {
            super.write(i11);
            g();
        }
    }
}