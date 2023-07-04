package lj;

import com.google.android.exoplayer2.upstream.h;
import java.util.List;

/* loaded from: classes3.dex */
public final class c implements e {

    /* renamed from: a  reason: collision with root package name */
    private final e f37203a;

    /* renamed from: b  reason: collision with root package name */
    private final List<ej.c> f37204b;

    public c(e eVar, List<ej.c> list) {
        this.f37203a = eVar;
        this.f37204b = list;
    }

    @Override // lj.e
    public h.a<d> a(com.google.android.exoplayer2.source.hls.playlist.c cVar, com.google.android.exoplayer2.source.hls.playlist.d dVar) {
        return new ej.b(this.f37203a.a(cVar, dVar), this.f37204b);
    }

    @Override // lj.e
    public h.a<d> b() {
        return new ej.b(this.f37203a.b(), this.f37204b);
    }
}