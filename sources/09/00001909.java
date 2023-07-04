package com.facebook.react.modules.network;

import okhttp3.MediaType;
import okhttp3.ResponseBody;
import okio.e0;
import okio.r;

/* loaded from: classes3.dex */
public class j extends ResponseBody {

    /* renamed from: a  reason: collision with root package name */
    private final ResponseBody f12060a;

    /* renamed from: b  reason: collision with root package name */
    private final h f12061b;

    /* renamed from: c  reason: collision with root package name */
    private okio.h f12062c;

    /* renamed from: d  reason: collision with root package name */
    private long f12063d = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class a extends okio.l {
        a(e0 e0Var) {
            super(e0Var);
        }

        @Override // okio.l, okio.e0
        public long read(okio.f fVar, long j11) {
            long read = super.read(fVar, j11);
            int i11 = (read > (-1L) ? 1 : (read == (-1L) ? 0 : -1));
            j.g(j.this, i11 != 0 ? read : 0L);
            j.this.f12061b.a(j.this.f12063d, j.this.f12060a.contentLength(), i11 == 0);
            return read;
        }
    }

    public j(ResponseBody responseBody, h hVar) {
        this.f12060a = responseBody;
        this.f12061b = hVar;
    }

    static /* synthetic */ long g(j jVar, long j11) {
        long j12 = jVar.f12063d + j11;
        jVar.f12063d = j12;
        return j12;
    }

    @Override // okhttp3.ResponseBody
    public long contentLength() {
        return this.f12060a.contentLength();
    }

    @Override // okhttp3.ResponseBody
    public MediaType contentType() {
        return this.f12060a.contentType();
    }

    public long m() {
        return this.f12063d;
    }

    @Override // okhttp3.ResponseBody
    public okio.h source() {
        if (this.f12062c == null) {
            this.f12062c = r.d(source(this.f12060a.source()));
        }
        return this.f12062c;
    }

    private e0 source(e0 e0Var) {
        return new a(e0Var);
    }
}