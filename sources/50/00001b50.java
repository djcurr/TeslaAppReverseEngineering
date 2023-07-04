package com.google.android.exoplayer2.audio;

import ak.k0;
import com.google.android.exoplayer2.audio.AudioProcessor;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
final class f extends d {

    /* renamed from: i  reason: collision with root package name */
    private static final int f13150i = Float.floatToIntBits(Float.NaN);

    private static void m(int i11, ByteBuffer byteBuffer) {
        int floatToIntBits = Float.floatToIntBits((float) (i11 * 4.656612875245797E-10d));
        if (floatToIntBits == f13150i) {
            floatToIntBits = Float.floatToIntBits(BitmapDescriptorFactory.HUE_RED);
        }
        byteBuffer.putInt(floatToIntBits);
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public void d(ByteBuffer byteBuffer) {
        ByteBuffer l11;
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i11 = limit - position;
        int i12 = this.f13141b.f13042c;
        if (i12 == 536870912) {
            l11 = l((i11 / 3) * 4);
            while (position < limit) {
                m(((byteBuffer.get(position) & 255) << 8) | ((byteBuffer.get(position + 1) & 255) << 16) | ((byteBuffer.get(position + 2) & 255) << 24), l11);
                position += 3;
            }
        } else if (i12 == 805306368) {
            l11 = l(i11);
            while (position < limit) {
                m((byteBuffer.get(position) & 255) | ((byteBuffer.get(position + 1) & 255) << 8) | ((byteBuffer.get(position + 2) & 255) << 16) | ((byteBuffer.get(position + 3) & 255) << 24), l11);
                position += 4;
            }
        } else {
            throw new IllegalStateException();
        }
        byteBuffer.position(byteBuffer.limit());
        l11.flip();
    }

    @Override // com.google.android.exoplayer2.audio.d
    public AudioProcessor.a h(AudioProcessor.a aVar) {
        int i11 = aVar.f13042c;
        if (k0.o0(i11)) {
            if (i11 != 4) {
                return new AudioProcessor.a(aVar.f13040a, aVar.f13041b, 4);
            }
            return AudioProcessor.a.f13039e;
        }
        throw new AudioProcessor.UnhandledAudioFormatException(aVar);
    }
}