package com.google.android.exoplayer2.audio;

import ei.p;
import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
public interface AudioSink {

    /* loaded from: classes3.dex */
    public static final class InitializationException extends Exception {

        /* renamed from: a  reason: collision with root package name */
        public final boolean f13045a;

        /* renamed from: b  reason: collision with root package name */
        public final ci.i f13046b;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public InitializationException(int r4, int r5, int r6, int r7, ci.i r8, boolean r9, java.lang.Exception r10) {
            /*
                r3 = this;
                if (r9 == 0) goto L5
                java.lang.String r0 = " (recoverable)"
                goto L7
            L5:
                java.lang.String r0 = ""
            L7:
                int r1 = r0.length()
                int r1 = r1 + 80
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>(r1)
                java.lang.String r1 = "AudioTrack init failed "
                r2.append(r1)
                r2.append(r4)
                java.lang.String r4 = " "
                r2.append(r4)
                java.lang.String r4 = "Config("
                r2.append(r4)
                r2.append(r5)
                java.lang.String r4 = ", "
                r2.append(r4)
                r2.append(r6)
                r2.append(r4)
                r2.append(r7)
                java.lang.String r4 = ")"
                r2.append(r4)
                r2.append(r0)
                java.lang.String r4 = r2.toString()
                r3.<init>(r4, r10)
                r3.f13045a = r9
                r3.f13046b = r8
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.audio.AudioSink.InitializationException.<init>(int, int, int, int, ci.i, boolean, java.lang.Exception):void");
        }
    }

    /* loaded from: classes3.dex */
    public static final class WriteException extends Exception {

        /* renamed from: a  reason: collision with root package name */
        public final boolean f13047a;

        /* renamed from: b  reason: collision with root package name */
        public final ci.i f13048b;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public WriteException(int r3, ci.i r4, boolean r5) {
            /*
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r1 = 36
                r0.<init>(r1)
                java.lang.String r1 = "AudioTrack write failed: "
                r0.append(r1)
                r0.append(r3)
                java.lang.String r3 = r0.toString()
                r2.<init>(r3)
                r2.f13047a = r5
                r2.f13048b = r4
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.audio.AudioSink.WriteException.<init>(int, ci.i, boolean):void");
        }
    }

    /* loaded from: classes3.dex */
    public interface a {
        void a(boolean z11);

        default void b(long j11) {
        }

        default void c(Exception exc) {
        }

        default void d(long j11) {
        }

        void e(int i11, long j11, long j12);

        void f();

        default void g() {
        }
    }

    boolean a(ci.i iVar);

    ci.l b();

    boolean c();

    void d();

    void e(ci.l lVar);

    boolean f();

    void flush();

    void g(int i11);

    void h();

    void i(p pVar);

    boolean j(ByteBuffer byteBuffer, long j11, int i11);

    void k(a aVar);

    void l();

    void m();

    long n(boolean z11);

    void o(ci.i iVar, int i11, int[] iArr);

    int p(ci.i iVar);

    void q();

    void r(float f11);

    void reset();

    void s();

    void t(ei.d dVar);

    void u();

    void v(boolean z11);

    /* loaded from: classes3.dex */
    public static final class ConfigurationException extends Exception {

        /* renamed from: a  reason: collision with root package name */
        public final ci.i f13044a;

        public ConfigurationException(Throwable th2, ci.i iVar) {
            super(th2);
            this.f13044a = iVar;
        }

        public ConfigurationException(String str, ci.i iVar) {
            super(str);
            this.f13044a = iVar;
        }
    }
}