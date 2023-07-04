package fj;

import android.net.Uri;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes3.dex */
public final class g {

    /* renamed from: c  reason: collision with root package name */
    private static final AtomicLong f26293c = new AtomicLong();

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, List<String>> f26294a;

    /* renamed from: b  reason: collision with root package name */
    public final long f26295b;

    public g(long j11, com.google.android.exoplayer2.upstream.b bVar, long j12) {
        this(j11, bVar, bVar.f14632a, Collections.emptyMap(), j12, 0L, 0L);
    }

    public static long a() {
        return f26293c.getAndIncrement();
    }

    public g(long j11, com.google.android.exoplayer2.upstream.b bVar, Uri uri, Map<String, List<String>> map, long j12, long j13, long j14) {
        this.f26294a = map;
        this.f26295b = j13;
    }
}