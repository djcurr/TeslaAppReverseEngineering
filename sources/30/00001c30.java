package com.google.android.exoplayer2.source.hls.playlist;

import android.net.Uri;
import com.google.android.exoplayer2.source.k;
import java.io.IOException;
import kj.g;
import lj.e;

/* loaded from: classes3.dex */
public interface HlsPlaylistTracker {

    /* loaded from: classes3.dex */
    public static final class PlaylistResetException extends IOException {
        public PlaylistResetException(Uri uri) {
        }
    }

    /* loaded from: classes3.dex */
    public static final class PlaylistStuckException extends IOException {
        public PlaylistStuckException(Uri uri) {
        }
    }

    /* loaded from: classes3.dex */
    public interface a {
        HlsPlaylistTracker a(g gVar, com.google.android.exoplayer2.upstream.g gVar2, e eVar);
    }

    /* loaded from: classes3.dex */
    public interface b {
        void f();

        boolean i(Uri uri, long j11);
    }

    /* loaded from: classes3.dex */
    public interface c {
        void c(d dVar);
    }

    void a(b bVar);

    void b(Uri uri);

    long c();

    com.google.android.exoplayer2.source.hls.playlist.c d();

    void e(Uri uri);

    void f(b bVar);

    boolean g(Uri uri);

    boolean h();

    void k(Uri uri, k.a aVar, c cVar);

    void l();

    d m(Uri uri, boolean z11);

    void stop();
}