package org.webrtc;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.view.Surface;
import java.nio.ByteBuffer;

/* loaded from: classes4.dex */
interface MediaCodecWrapper {
    void configure(MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i11);

    Surface createInputSurface();

    int dequeueInputBuffer(long j11);

    int dequeueOutputBuffer(MediaCodec.BufferInfo bufferInfo, long j11);

    void flush();

    ByteBuffer getInputBuffer(int i11);

    MediaFormat getInputFormat();

    ByteBuffer getOutputBuffer(int i11);

    MediaFormat getOutputFormat();

    void queueInputBuffer(int i11, int i12, int i13, long j11, int i14);

    void release();

    void releaseOutputBuffer(int i11, boolean z11);

    void setParameters(Bundle bundle);

    void start();

    void stop();
}