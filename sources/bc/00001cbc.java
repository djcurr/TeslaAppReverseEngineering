package com.google.android.exoplayer2.upstream;

import ak.k0;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes3.dex */
public final class RawResourceDataSource extends zj.e {

    /* renamed from: e  reason: collision with root package name */
    private final Resources f14615e;

    /* renamed from: f  reason: collision with root package name */
    private final String f14616f;

    /* renamed from: g  reason: collision with root package name */
    private Uri f14617g;

    /* renamed from: h  reason: collision with root package name */
    private AssetFileDescriptor f14618h;

    /* renamed from: i  reason: collision with root package name */
    private InputStream f14619i;

    /* renamed from: j  reason: collision with root package name */
    private long f14620j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f14621k;

    /* loaded from: classes3.dex */
    public static class RawResourceDataSourceException extends IOException {
        public RawResourceDataSourceException(String str) {
            super(str);
        }

        public RawResourceDataSourceException(IOException iOException) {
            super(iOException);
        }
    }

    public RawResourceDataSource(Context context) {
        super(false);
        this.f14615e = context.getResources();
        this.f14616f = context.getPackageName();
    }

    public static Uri buildRawResourceUri(int i11) {
        StringBuilder sb2 = new StringBuilder(26);
        sb2.append("rawresource:///");
        sb2.append(i11);
        return Uri.parse(sb2.toString());
    }

    @Override // com.google.android.exoplayer2.upstream.a
    public void close() {
        this.f14617g = null;
        try {
            try {
                InputStream inputStream = this.f14619i;
                if (inputStream != null) {
                    inputStream.close();
                }
                this.f14619i = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.f14618h;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } catch (IOException e11) {
                        throw new RawResourceDataSourceException(e11);
                    }
                } finally {
                    this.f14618h = null;
                    if (this.f14621k) {
                        this.f14621k = false;
                        p();
                    }
                }
            } catch (Throwable th2) {
                this.f14619i = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor2 = this.f14618h;
                        if (assetFileDescriptor2 != null) {
                            assetFileDescriptor2.close();
                        }
                        this.f14618h = null;
                        if (this.f14621k) {
                            this.f14621k = false;
                            p();
                        }
                        throw th2;
                    } catch (IOException e12) {
                        throw new RawResourceDataSourceException(e12);
                    }
                } finally {
                    this.f14618h = null;
                    if (this.f14621k) {
                        this.f14621k = false;
                        p();
                    }
                }
            }
        } catch (IOException e13) {
            throw new RawResourceDataSourceException(e13);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.a
    public long i(b bVar) {
        int parseInt;
        Uri uri = bVar.f14632a;
        this.f14617g = uri;
        if (!TextUtils.equals("rawresource", uri.getScheme()) && (!TextUtils.equals("android.resource", uri.getScheme()) || uri.getPathSegments().size() != 1 || !((String) ak.a.e(uri.getLastPathSegment())).matches("\\d+"))) {
            if (TextUtils.equals("android.resource", uri.getScheme())) {
                String str = (String) ak.a.e(uri.getPath());
                if (str.startsWith("/")) {
                    str = str.substring(1);
                }
                String host = uri.getHost();
                String valueOf = String.valueOf(TextUtils.isEmpty(host) ? "" : String.valueOf(host).concat(":"));
                String valueOf2 = String.valueOf(str);
                parseInt = this.f14615e.getIdentifier(valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf), "raw", this.f14616f);
                if (parseInt == 0) {
                    throw new RawResourceDataSourceException("Resource not found.");
                }
            } else {
                throw new RawResourceDataSourceException("URI must either use scheme rawresource or android.resource");
            }
        } else {
            try {
                parseInt = Integer.parseInt((String) ak.a.e(uri.getLastPathSegment()));
            } catch (NumberFormatException unused) {
                throw new RawResourceDataSourceException("Resource identifier must be an integer.");
            }
        }
        q(bVar);
        AssetFileDescriptor openRawResourceFd = this.f14615e.openRawResourceFd(parseInt);
        this.f14618h = openRawResourceFd;
        if (openRawResourceFd != null) {
            FileInputStream fileInputStream = new FileInputStream(openRawResourceFd.getFileDescriptor());
            this.f14619i = fileInputStream;
            try {
                fileInputStream.skip(openRawResourceFd.getStartOffset());
                if (fileInputStream.skip(bVar.f14637f) >= bVar.f14637f) {
                    long j11 = bVar.f14638g;
                    if (j11 != -1) {
                        this.f14620j = j11;
                    } else {
                        long length = openRawResourceFd.getLength();
                        this.f14620j = length != -1 ? length - bVar.f14637f : -1L;
                    }
                    this.f14621k = true;
                    r(bVar);
                    return this.f14620j;
                }
                throw new EOFException();
            } catch (IOException e11) {
                throw new RawResourceDataSourceException(e11);
            }
        }
        String valueOf3 = String.valueOf(uri);
        StringBuilder sb2 = new StringBuilder(valueOf3.length() + 24);
        sb2.append("Resource is compressed: ");
        sb2.append(valueOf3);
        throw new RawResourceDataSourceException(sb2.toString());
    }

    @Override // com.google.android.exoplayer2.upstream.a
    public Uri m() {
        return this.f14617g;
    }

    @Override // zj.f
    public int read(byte[] bArr, int i11, int i12) {
        if (i12 == 0) {
            return 0;
        }
        long j11 = this.f14620j;
        if (j11 == 0) {
            return -1;
        }
        if (j11 != -1) {
            try {
                i12 = (int) Math.min(j11, i12);
            } catch (IOException e11) {
                throw new RawResourceDataSourceException(e11);
            }
        }
        int read = ((InputStream) k0.j(this.f14619i)).read(bArr, i11, i12);
        if (read == -1) {
            if (this.f14620j == -1) {
                return -1;
            }
            throw new RawResourceDataSourceException(new EOFException());
        }
        long j12 = this.f14620j;
        if (j12 != -1) {
            this.f14620j = j12 - read;
        }
        o(read);
        return read;
    }
}