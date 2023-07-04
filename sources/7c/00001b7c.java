package com.google.android.exoplayer2.drm;

import android.net.Uri;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class MediaDrmCallbackException extends IOException {

    /* renamed from: a  reason: collision with root package name */
    public final com.google.android.exoplayer2.upstream.b f13336a;

    /* renamed from: b  reason: collision with root package name */
    public final Uri f13337b;

    /* renamed from: c  reason: collision with root package name */
    public final Map<String, List<String>> f13338c;

    /* renamed from: d  reason: collision with root package name */
    public final long f13339d;

    public MediaDrmCallbackException(com.google.android.exoplayer2.upstream.b bVar, Uri uri, Map<String, List<String>> map, long j11, Throwable th2) {
        super(th2);
        this.f13336a = bVar;
        this.f13337b = uri;
        this.f13338c = map;
        this.f13339d = j11;
    }
}