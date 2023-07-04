package com.squareup.picasso;

import android.content.Context;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import java.io.File;
import okhttp3.Cache;
import okhttp3.Call;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/* loaded from: classes2.dex */
public final class s implements j {

    /* renamed from: a  reason: collision with root package name */
    final Call.Factory f20734a;

    public s(Context context) {
        this(d0.e(context));
    }

    @Override // com.squareup.picasso.j
    public Response a(Request request) {
        return FirebasePerfOkHttpClient.execute(this.f20734a.newCall(request));
    }

    public s(File file) {
        this(file, d0.a(file));
    }

    public s(File file, long j11) {
        this(new OkHttpClient.Builder().cache(new Cache(file, j11)).build());
    }

    public s(OkHttpClient okHttpClient) {
        this.f20734a = okHttpClient;
        okHttpClient.cache();
    }
}