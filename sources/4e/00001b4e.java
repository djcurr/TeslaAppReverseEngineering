package com.google.android.exoplayer2.audio;

import com.google.android.exoplayer2.audio.AudioProcessor;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes3.dex */
public abstract class d implements AudioProcessor {

    /* renamed from: b  reason: collision with root package name */
    protected AudioProcessor.a f13141b;

    /* renamed from: c  reason: collision with root package name */
    protected AudioProcessor.a f13142c;

    /* renamed from: d  reason: collision with root package name */
    private AudioProcessor.a f13143d;

    /* renamed from: e  reason: collision with root package name */
    private AudioProcessor.a f13144e;

    /* renamed from: f  reason: collision with root package name */
    private ByteBuffer f13145f;

    /* renamed from: g  reason: collision with root package name */
    private ByteBuffer f13146g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f13147h;

    public d() {
        ByteBuffer byteBuffer = AudioProcessor.f13038a;
        this.f13145f = byteBuffer;
        this.f13146g = byteBuffer;
        AudioProcessor.a aVar = AudioProcessor.a.f13039e;
        this.f13143d = aVar;
        this.f13144e = aVar;
        this.f13141b = aVar;
        this.f13142c = aVar;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public boolean a() {
        return this.f13144e != AudioProcessor.a.f13039e;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public ByteBuffer b() {
        ByteBuffer byteBuffer = this.f13146g;
        this.f13146g = AudioProcessor.f13038a;
        return byteBuffer;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public boolean c() {
        return this.f13147h && this.f13146g == AudioProcessor.f13038a;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public final AudioProcessor.a e(AudioProcessor.a aVar) {
        this.f13143d = aVar;
        this.f13144e = h(aVar);
        return a() ? this.f13144e : AudioProcessor.a.f13039e;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public final void f() {
        this.f13147h = true;
        j();
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public final void flush() {
        this.f13146g = AudioProcessor.f13038a;
        this.f13147h = false;
        this.f13141b = this.f13143d;
        this.f13142c = this.f13144e;
        i();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean g() {
        return this.f13146g.hasRemaining();
    }

    protected abstract AudioProcessor.a h(AudioProcessor.a aVar);

    protected void i() {
    }

    protected void j() {
    }

    protected void k() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final ByteBuffer l(int i11) {
        if (this.f13145f.capacity() < i11) {
            this.f13145f = ByteBuffer.allocateDirect(i11).order(ByteOrder.nativeOrder());
        } else {
            this.f13145f.clear();
        }
        ByteBuffer byteBuffer = this.f13145f;
        this.f13146g = byteBuffer;
        return byteBuffer;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public final void reset() {
        flush();
        this.f13145f = AudioProcessor.f13038a;
        AudioProcessor.a aVar = AudioProcessor.a.f13039e;
        this.f13143d = aVar;
        this.f13144e = aVar;
        this.f13141b = aVar;
        this.f13142c = aVar;
        k();
    }
}