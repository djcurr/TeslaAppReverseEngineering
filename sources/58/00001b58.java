package com.google.android.exoplayer2.audio;

import ak.k0;
import com.google.android.exoplayer2.audio.AudioProcessor;
import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
final class l extends d {

    /* renamed from: i  reason: collision with root package name */
    private int f13204i;

    /* renamed from: j  reason: collision with root package name */
    private int f13205j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f13206k;

    /* renamed from: l  reason: collision with root package name */
    private int f13207l;

    /* renamed from: m  reason: collision with root package name */
    private byte[] f13208m = k0.f482f;

    /* renamed from: n  reason: collision with root package name */
    private int f13209n;

    /* renamed from: o  reason: collision with root package name */
    private long f13210o;

    @Override // com.google.android.exoplayer2.audio.d, com.google.android.exoplayer2.audio.AudioProcessor
    public ByteBuffer b() {
        int i11;
        if (super.c() && (i11 = this.f13209n) > 0) {
            l(i11).put(this.f13208m, 0, this.f13209n).flip();
            this.f13209n = 0;
        }
        return super.b();
    }

    @Override // com.google.android.exoplayer2.audio.d, com.google.android.exoplayer2.audio.AudioProcessor
    public boolean c() {
        return super.c() && this.f13209n == 0;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public void d(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i11 = limit - position;
        if (i11 == 0) {
            return;
        }
        int min = Math.min(i11, this.f13207l);
        this.f13210o += min / this.f13141b.f13043d;
        this.f13207l -= min;
        byteBuffer.position(position + min);
        if (this.f13207l > 0) {
            return;
        }
        int i12 = i11 - min;
        int length = (this.f13209n + i12) - this.f13208m.length;
        ByteBuffer l11 = l(length);
        int r11 = k0.r(length, 0, this.f13209n);
        l11.put(this.f13208m, 0, r11);
        int r12 = k0.r(length - r11, 0, i12);
        byteBuffer.limit(byteBuffer.position() + r12);
        l11.put(byteBuffer);
        byteBuffer.limit(limit);
        int i13 = i12 - r12;
        int i14 = this.f13209n - r11;
        this.f13209n = i14;
        byte[] bArr = this.f13208m;
        System.arraycopy(bArr, r11, bArr, 0, i14);
        byteBuffer.get(this.f13208m, this.f13209n, i13);
        this.f13209n += i13;
        l11.flip();
    }

    @Override // com.google.android.exoplayer2.audio.d
    public AudioProcessor.a h(AudioProcessor.a aVar) {
        if (aVar.f13042c == 2) {
            this.f13206k = true;
            return (this.f13204i == 0 && this.f13205j == 0) ? AudioProcessor.a.f13039e : aVar;
        }
        throw new AudioProcessor.UnhandledAudioFormatException(aVar);
    }

    @Override // com.google.android.exoplayer2.audio.d
    protected void i() {
        if (this.f13206k) {
            this.f13206k = false;
            int i11 = this.f13205j;
            int i12 = this.f13141b.f13043d;
            this.f13208m = new byte[i11 * i12];
            this.f13207l = this.f13204i * i12;
        }
        this.f13209n = 0;
    }

    @Override // com.google.android.exoplayer2.audio.d
    protected void j() {
        int i11;
        if (this.f13206k) {
            if (this.f13209n > 0) {
                this.f13210o += i11 / this.f13141b.f13043d;
            }
            this.f13209n = 0;
        }
    }

    @Override // com.google.android.exoplayer2.audio.d
    protected void k() {
        this.f13208m = k0.f482f;
    }

    public long m() {
        return this.f13210o;
    }

    public void n() {
        this.f13210o = 0L;
    }

    public void o(int i11, int i12) {
        this.f13204i = i11;
        this.f13205j = i12;
    }
}