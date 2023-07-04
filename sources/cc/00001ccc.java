package com.google.android.exoplayer2.upstream;

import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.upstream.HttpDataSource;
import com.google.android.exoplayer2.upstream.Loader;
import com.google.android.exoplayer2.upstream.g;
import java.io.FileNotFoundException;
import java.io.IOException;

/* loaded from: classes3.dex */
public class f implements g {

    /* renamed from: a  reason: collision with root package name */
    private final int f14691a;

    public f() {
        this(-1);
    }

    @Override // com.google.android.exoplayer2.upstream.g
    public long a(g.a aVar) {
        IOException iOException = aVar.f14694c;
        if ((iOException instanceof ParserException) || (iOException instanceof FileNotFoundException) || (iOException instanceof HttpDataSource.CleartextNotPermittedException) || (iOException instanceof Loader.UnexpectedLoaderException)) {
            return -9223372036854775807L;
        }
        return Math.min((aVar.f14695d - 1) * 1000, 5000);
    }

    @Override // com.google.android.exoplayer2.upstream.g
    public long c(g.a aVar) {
        IOException iOException = aVar.f14694c;
        if (iOException instanceof HttpDataSource.InvalidResponseCodeException) {
            int i11 = ((HttpDataSource.InvalidResponseCodeException) iOException).f14591a;
            return (i11 == 403 || i11 == 404 || i11 == 410 || i11 == 416 || i11 == 500 || i11 == 503) ? 60000L : -9223372036854775807L;
        }
        return -9223372036854775807L;
    }

    @Override // com.google.android.exoplayer2.upstream.g
    public int d(int i11) {
        int i12 = this.f14691a;
        return i12 == -1 ? i11 == 7 ? 6 : 3 : i12;
    }

    public f(int i11) {
        this.f14691a = i11;
    }
}