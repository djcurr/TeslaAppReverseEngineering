package com.google.android.exoplayer2.upstream;

import ak.k0;
import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes3.dex */
public final class AssetDataSource extends zj.e {

    /* renamed from: e  reason: collision with root package name */
    private final AssetManager f14576e;

    /* renamed from: f  reason: collision with root package name */
    private Uri f14577f;

    /* renamed from: g  reason: collision with root package name */
    private InputStream f14578g;

    /* renamed from: h  reason: collision with root package name */
    private long f14579h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f14580i;

    /* loaded from: classes3.dex */
    public static final class AssetDataSourceException extends IOException {
        public AssetDataSourceException(IOException iOException) {
            super(iOException);
        }
    }

    public AssetDataSource(Context context) {
        super(false);
        this.f14576e = context.getAssets();
    }

    @Override // com.google.android.exoplayer2.upstream.a
    public void close() {
        this.f14577f = null;
        try {
            try {
                InputStream inputStream = this.f14578g;
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (IOException e11) {
                throw new AssetDataSourceException(e11);
            }
        } finally {
            this.f14578g = null;
            if (this.f14580i) {
                this.f14580i = false;
                p();
            }
        }
    }

    @Override // com.google.android.exoplayer2.upstream.a
    public long i(b bVar) {
        try {
            Uri uri = bVar.f14632a;
            this.f14577f = uri;
            String str = (String) ak.a.e(uri.getPath());
            if (str.startsWith("/android_asset/")) {
                str = str.substring(15);
            } else if (str.startsWith("/")) {
                str = str.substring(1);
            }
            q(bVar);
            InputStream open = this.f14576e.open(str, 1);
            this.f14578g = open;
            if (open.skip(bVar.f14637f) >= bVar.f14637f) {
                long j11 = bVar.f14638g;
                if (j11 != -1) {
                    this.f14579h = j11;
                } else {
                    long available = this.f14578g.available();
                    this.f14579h = available;
                    if (available == 2147483647L) {
                        this.f14579h = -1L;
                    }
                }
                this.f14580i = true;
                r(bVar);
                return this.f14579h;
            }
            throw new EOFException();
        } catch (IOException e11) {
            throw new AssetDataSourceException(e11);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.a
    public Uri m() {
        return this.f14577f;
    }

    @Override // zj.f
    public int read(byte[] bArr, int i11, int i12) {
        if (i12 == 0) {
            return 0;
        }
        long j11 = this.f14579h;
        if (j11 == 0) {
            return -1;
        }
        if (j11 != -1) {
            try {
                i12 = (int) Math.min(j11, i12);
            } catch (IOException e11) {
                throw new AssetDataSourceException(e11);
            }
        }
        int read = ((InputStream) k0.j(this.f14578g)).read(bArr, i11, i12);
        if (read == -1) {
            if (this.f14579h == -1) {
                return -1;
            }
            throw new AssetDataSourceException(new EOFException());
        }
        long j12 = this.f14579h;
        if (j12 != -1) {
            this.f14579h = j12 - read;
        }
        o(read);
        return read;
    }
}