package com.google.android.exoplayer2.audio;

import ak.k0;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes3.dex */
public interface AudioProcessor {

    /* renamed from: a  reason: collision with root package name */
    public static final ByteBuffer f13038a = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());

    /* loaded from: classes3.dex */
    public static final class UnhandledAudioFormatException extends Exception {
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public UnhandledAudioFormatException(com.google.android.exoplayer2.audio.AudioProcessor.a r3) {
            /*
                r2 = this;
                java.lang.String r3 = java.lang.String.valueOf(r3)
                int r0 = r3.length()
                int r0 = r0 + 18
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>(r0)
                java.lang.String r0 = "Unhandled format: "
                r1.append(r0)
                r1.append(r3)
                java.lang.String r3 = r1.toString()
                r2.<init>(r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.audio.AudioProcessor.UnhandledAudioFormatException.<init>(com.google.android.exoplayer2.audio.AudioProcessor$a):void");
        }
    }

    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: e  reason: collision with root package name */
        public static final a f13039e = new a(-1, -1, -1);

        /* renamed from: a  reason: collision with root package name */
        public final int f13040a;

        /* renamed from: b  reason: collision with root package name */
        public final int f13041b;

        /* renamed from: c  reason: collision with root package name */
        public final int f13042c;

        /* renamed from: d  reason: collision with root package name */
        public final int f13043d;

        public a(int i11, int i12, int i13) {
            this.f13040a = i11;
            this.f13041b = i12;
            this.f13042c = i13;
            this.f13043d = k0.p0(i13) ? k0.c0(i13, i12) : -1;
        }

        public String toString() {
            int i11 = this.f13040a;
            int i12 = this.f13041b;
            int i13 = this.f13042c;
            StringBuilder sb2 = new StringBuilder(83);
            sb2.append("AudioFormat[sampleRate=");
            sb2.append(i11);
            sb2.append(", channelCount=");
            sb2.append(i12);
            sb2.append(", encoding=");
            sb2.append(i13);
            sb2.append(']');
            return sb2.toString();
        }
    }

    boolean a();

    ByteBuffer b();

    boolean c();

    void d(ByteBuffer byteBuffer);

    a e(a aVar);

    void f();

    void flush();

    void reset();
}