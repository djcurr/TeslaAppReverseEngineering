package com.google.android.exoplayer2.mediacodec;

import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
final class f extends DecoderInputBuffer {

    /* renamed from: i  reason: collision with root package name */
    private long f13693i;

    /* renamed from: j  reason: collision with root package name */
    private int f13694j;

    /* renamed from: k  reason: collision with root package name */
    private int f13695k;

    public f() {
        super(2);
        this.f13695k = 32;
    }

    private boolean y(DecoderInputBuffer decoderInputBuffer) {
        ByteBuffer byteBuffer;
        if (D()) {
            if (this.f13694j < this.f13695k && decoderInputBuffer.k() == k()) {
                ByteBuffer byteBuffer2 = decoderInputBuffer.f13264c;
                return byteBuffer2 == null || (byteBuffer = this.f13264c) == null || byteBuffer.position() + byteBuffer2.remaining() <= 3072000;
            }
            return false;
        }
        return true;
    }

    public long A() {
        return this.f13693i;
    }

    public int B() {
        return this.f13694j;
    }

    public boolean D() {
        return this.f13694j > 0;
    }

    public void E(int i11) {
        ak.a.a(i11 > 0);
        this.f13695k = i11;
    }

    @Override // com.google.android.exoplayer2.decoder.DecoderInputBuffer, fi.a
    public void f() {
        super.f();
        this.f13694j = 0;
    }

    public boolean x(DecoderInputBuffer decoderInputBuffer) {
        ak.a.a(!decoderInputBuffer.t());
        ak.a.a(!decoderInputBuffer.i());
        ak.a.a(!decoderInputBuffer.l());
        if (y(decoderInputBuffer)) {
            int i11 = this.f13694j;
            this.f13694j = i11 + 1;
            if (i11 == 0) {
                this.f13266e = decoderInputBuffer.f13266e;
                if (decoderInputBuffer.n()) {
                    o(1);
                }
            }
            if (decoderInputBuffer.k()) {
                o(Integer.MIN_VALUE);
            }
            ByteBuffer byteBuffer = decoderInputBuffer.f13264c;
            if (byteBuffer != null) {
                r(byteBuffer.remaining());
                this.f13264c.put(byteBuffer);
            }
            this.f13693i = decoderInputBuffer.f13266e;
            return true;
        }
        return false;
    }

    public long z() {
        return this.f13266e;
    }
}