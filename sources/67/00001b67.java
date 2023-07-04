package com.google.android.exoplayer2.decoder;

import fi.a;
import fi.b;
import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
public class DecoderInputBuffer extends a {

    /* renamed from: b  reason: collision with root package name */
    public final b f13263b;

    /* renamed from: c  reason: collision with root package name */
    public ByteBuffer f13264c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f13265d;

    /* renamed from: e  reason: collision with root package name */
    public long f13266e;

    /* renamed from: f  reason: collision with root package name */
    public ByteBuffer f13267f;

    /* renamed from: g  reason: collision with root package name */
    private final int f13268g;

    /* renamed from: h  reason: collision with root package name */
    private final int f13269h;

    /* loaded from: classes3.dex */
    public static final class InsufficientCapacityException extends IllegalStateException {
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public InsufficientCapacityException(int r3, int r4) {
            /*
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r1 = 44
                r0.<init>(r1)
                java.lang.String r1 = "Buffer too small ("
                r0.append(r1)
                r0.append(r3)
                java.lang.String r3 = " < "
                r0.append(r3)
                r0.append(r4)
                java.lang.String r3 = ")"
                r0.append(r3)
                java.lang.String r3 = r0.toString()
                r2.<init>(r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.decoder.DecoderInputBuffer.InsufficientCapacityException.<init>(int, int):void");
        }
    }

    public DecoderInputBuffer(int i11) {
        this(i11, 0);
    }

    private ByteBuffer q(int i11) {
        int i12 = this.f13268g;
        if (i12 == 1) {
            return ByteBuffer.allocate(i11);
        }
        if (i12 == 2) {
            return ByteBuffer.allocateDirect(i11);
        }
        ByteBuffer byteBuffer = this.f13264c;
        throw new InsufficientCapacityException(byteBuffer == null ? 0 : byteBuffer.capacity(), i11);
    }

    public static DecoderInputBuffer v() {
        return new DecoderInputBuffer(0);
    }

    @Override // fi.a
    public void f() {
        super.f();
        ByteBuffer byteBuffer = this.f13264c;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.f13267f;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.f13265d = false;
    }

    public void r(int i11) {
        int i12 = i11 + this.f13269h;
        ByteBuffer byteBuffer = this.f13264c;
        if (byteBuffer == null) {
            this.f13264c = q(i12);
            return;
        }
        int capacity = byteBuffer.capacity();
        int position = byteBuffer.position();
        int i13 = i12 + position;
        if (capacity >= i13) {
            this.f13264c = byteBuffer;
            return;
        }
        ByteBuffer q11 = q(i13);
        q11.order(byteBuffer.order());
        if (position > 0) {
            byteBuffer.flip();
            q11.put(byteBuffer);
        }
        this.f13264c = q11;
    }

    public final void s() {
        ByteBuffer byteBuffer = this.f13264c;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.f13267f;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }

    public final boolean t() {
        return h(1073741824);
    }

    public final boolean u() {
        return this.f13264c == null && this.f13268g == 0;
    }

    public void w(int i11) {
        ByteBuffer byteBuffer = this.f13267f;
        if (byteBuffer != null && byteBuffer.capacity() >= i11) {
            this.f13267f.clear();
        } else {
            this.f13267f = ByteBuffer.allocate(i11);
        }
    }

    public DecoderInputBuffer(int i11, int i12) {
        this.f13263b = new b();
        this.f13268g = i11;
        this.f13269h = i12;
    }
}