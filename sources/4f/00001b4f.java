package com.google.android.exoplayer2.audio;

import com.google.android.exoplayer2.audio.AudioProcessor;
import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
final class e extends d {

    /* renamed from: i  reason: collision with root package name */
    private int[] f13148i;

    /* renamed from: j  reason: collision with root package name */
    private int[] f13149j;

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public void d(ByteBuffer byteBuffer) {
        int[] iArr = (int[]) ak.a.e(this.f13149j);
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        ByteBuffer l11 = l(((limit - position) / this.f13141b.f13043d) * this.f13142c.f13043d);
        while (position < limit) {
            for (int i11 : iArr) {
                l11.putShort(byteBuffer.getShort((i11 * 2) + position));
            }
            position += this.f13141b.f13043d;
        }
        byteBuffer.position(limit);
        l11.flip();
    }

    @Override // com.google.android.exoplayer2.audio.d
    public AudioProcessor.a h(AudioProcessor.a aVar) {
        int[] iArr = this.f13148i;
        if (iArr == null) {
            return AudioProcessor.a.f13039e;
        }
        if (aVar.f13042c == 2) {
            boolean z11 = aVar.f13041b != iArr.length;
            int i11 = 0;
            while (i11 < iArr.length) {
                int i12 = iArr[i11];
                if (i12 >= aVar.f13041b) {
                    throw new AudioProcessor.UnhandledAudioFormatException(aVar);
                }
                z11 |= i12 != i11;
                i11++;
            }
            if (z11) {
                return new AudioProcessor.a(aVar.f13040a, iArr.length, 2);
            }
            return AudioProcessor.a.f13039e;
        }
        throw new AudioProcessor.UnhandledAudioFormatException(aVar);
    }

    @Override // com.google.android.exoplayer2.audio.d
    protected void i() {
        this.f13149j = this.f13148i;
    }

    @Override // com.google.android.exoplayer2.audio.d
    protected void k() {
        this.f13149j = null;
        this.f13148i = null;
    }

    public void m(int[] iArr) {
        this.f13148i = iArr;
    }
}