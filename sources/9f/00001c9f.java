package com.google.android.exoplayer2.ui;

/* loaded from: classes3.dex */
public interface i {

    /* loaded from: classes3.dex */
    public interface a {
        void a(i iVar, long j11);

        void b(i iVar, long j11, boolean z11);

        void c(i iVar, long j11);
    }

    void a(a aVar);

    void b(long[] jArr, boolean[] zArr, int i11);

    long getPreferredUpdateDelay();

    void setBufferedPosition(long j11);

    void setDuration(long j11);

    void setEnabled(boolean z11);

    void setPosition(long j11);
}