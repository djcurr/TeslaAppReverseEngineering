package com.google.android.exoplayer2.mediacodec;

import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import ei.s;
import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
final class g {

    /* renamed from: a  reason: collision with root package name */
    private long f13696a;

    /* renamed from: b  reason: collision with root package name */
    private long f13697b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f13698c;

    private long a(ci.i iVar) {
        return (this.f13696a * 1000000) / iVar.E;
    }

    public void b() {
        this.f13696a = 0L;
        this.f13697b = 0L;
        this.f13698c = false;
    }

    public long c(ci.i iVar, DecoderInputBuffer decoderInputBuffer) {
        if (this.f13698c) {
            return decoderInputBuffer.f13266e;
        }
        ByteBuffer byteBuffer = (ByteBuffer) ak.a.e(decoderInputBuffer.f13264c);
        int i11 = 0;
        for (int i12 = 0; i12 < 4; i12++) {
            i11 = (i11 << 8) | (byteBuffer.get(i12) & 255);
        }
        int m11 = s.m(i11);
        if (m11 == -1) {
            this.f13698c = true;
            ak.o.h("C2Mp3TimestampTracker", "MPEG audio header is invalid.");
            return decoderInputBuffer.f13266e;
        } else if (this.f13696a == 0) {
            long j11 = decoderInputBuffer.f13266e;
            this.f13697b = j11;
            this.f13696a = m11 - 529;
            return j11;
        } else {
            long a11 = a(iVar);
            this.f13696a += m11;
            return this.f13697b + a11;
        }
    }
}