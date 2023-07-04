package zj;

import android.net.Uri;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class m implements com.google.android.exoplayer2.upstream.a {

    /* renamed from: a */
    private final com.google.android.exoplayer2.upstream.a f60486a;

    /* renamed from: b */
    private long f60487b;

    /* renamed from: c */
    private Uri f60488c = Uri.EMPTY;

    /* renamed from: d */
    private Map<String, List<String>> f60489d = Collections.emptyMap();

    public m(com.google.android.exoplayer2.upstream.a aVar) {
        this.f60486a = (com.google.android.exoplayer2.upstream.a) ak.a.e(aVar);
    }

    @Override // com.google.android.exoplayer2.upstream.a
    public void b(n nVar) {
        ak.a.e(nVar);
        this.f60486a.b(nVar);
    }

    @Override // com.google.android.exoplayer2.upstream.a
    public Map<String, List<String>> c() {
        return this.f60486a.c();
    }

    @Override // com.google.android.exoplayer2.upstream.a
    public void close() {
        this.f60486a.close();
    }

    @Override // com.google.android.exoplayer2.upstream.a
    public long i(com.google.android.exoplayer2.upstream.b bVar) {
        this.f60488c = bVar.f14632a;
        this.f60489d = Collections.emptyMap();
        long i11 = this.f60486a.i(bVar);
        this.f60488c = (Uri) ak.a.e(m());
        this.f60489d = c();
        return i11;
    }

    @Override // com.google.android.exoplayer2.upstream.a
    public Uri m() {
        return this.f60486a.m();
    }

    public long o() {
        return this.f60487b;
    }

    public Uri p() {
        return this.f60488c;
    }

    public Map<String, List<String>> q() {
        return this.f60489d;
    }

    public void r() {
        this.f60487b = 0L;
    }

    @Override // zj.f
    public int read(byte[] bArr, int i11, int i12) {
        int read = this.f60486a.read(bArr, i11, i12);
        if (read != -1) {
            this.f60487b += read;
        }
        return read;
    }
}