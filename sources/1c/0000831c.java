package lj;

import com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistParser;
import com.google.android.exoplayer2.upstream.h;

/* loaded from: classes3.dex */
public final class a implements e {
    @Override // lj.e
    public h.a<d> a(com.google.android.exoplayer2.source.hls.playlist.c cVar, com.google.android.exoplayer2.source.hls.playlist.d dVar) {
        return new HlsPlaylistParser(cVar, dVar);
    }

    @Override // lj.e
    public h.a<d> b() {
        return new HlsPlaylistParser();
    }
}