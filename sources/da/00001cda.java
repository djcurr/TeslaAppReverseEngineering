package com.google.android.exoplayer2.video;

import android.view.Surface;
import com.google.android.exoplayer2.mediacodec.MediaCodecDecoderException;
import com.google.android.exoplayer2.mediacodec.i;

/* loaded from: classes3.dex */
public class MediaCodecVideoDecoderException extends MediaCodecDecoderException {
    public MediaCodecVideoDecoderException(Throwable th2, i iVar, Surface surface) {
        super(th2, iVar);
        System.identityHashCode(surface);
        if (surface != null) {
            surface.isValid();
        }
    }
}