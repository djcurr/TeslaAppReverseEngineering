package com.google.android.exoplayer2.mediacodec;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import com.google.android.exoplayer2.mediacodec.o;
import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
public interface h {

    /* loaded from: classes3.dex */
    public interface a {

        /* renamed from: a  reason: collision with root package name */
        public static final a f13699a = new o.b();

        h a(MediaCodec mediaCodec);
    }

    /* loaded from: classes3.dex */
    public interface b {
        void a(h hVar, long j11, long j12);
    }

    void a(b bVar, Handler handler);

    void b(int i11);

    void c(Surface surface);

    void configure(MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i11);

    void d(int i11, int i12, fi.b bVar, long j11, int i13);

    void e(int i11, long j11);

    int f();

    void flush();

    int g(MediaCodec.BufferInfo bufferInfo);

    ByteBuffer getInputBuffer(int i11);

    ByteBuffer getOutputBuffer(int i11);

    MediaFormat getOutputFormat();

    void queueInputBuffer(int i11, int i12, int i13, long j11, int i14);

    void release();

    void releaseOutputBuffer(int i11, boolean z11);

    void setParameters(Bundle bundle);

    void start();
}