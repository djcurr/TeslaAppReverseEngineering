package com.google.android.exoplayer2.upstream;

import ak.k0;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;

/* loaded from: classes3.dex */
public final class ContentDataSource extends zj.e {

    /* renamed from: e  reason: collision with root package name */
    private final ContentResolver f14581e;

    /* renamed from: f  reason: collision with root package name */
    private Uri f14582f;

    /* renamed from: g  reason: collision with root package name */
    private AssetFileDescriptor f14583g;

    /* renamed from: h  reason: collision with root package name */
    private FileInputStream f14584h;

    /* renamed from: i  reason: collision with root package name */
    private long f14585i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f14586j;

    /* loaded from: classes3.dex */
    public static class ContentDataSourceException extends IOException {
        public ContentDataSourceException(IOException iOException) {
            super(iOException);
        }
    }

    public ContentDataSource(Context context) {
        super(false);
        this.f14581e = context.getContentResolver();
    }

    @Override // com.google.android.exoplayer2.upstream.a
    public void close() {
        this.f14582f = null;
        try {
            try {
                FileInputStream fileInputStream = this.f14584h;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                this.f14584h = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.f14583g;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } catch (IOException e11) {
                        throw new ContentDataSourceException(e11);
                    }
                } finally {
                    this.f14583g = null;
                    if (this.f14586j) {
                        this.f14586j = false;
                        p();
                    }
                }
            } catch (Throwable th2) {
                this.f14584h = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor2 = this.f14583g;
                        if (assetFileDescriptor2 != null) {
                            assetFileDescriptor2.close();
                        }
                        this.f14583g = null;
                        if (this.f14586j) {
                            this.f14586j = false;
                            p();
                        }
                        throw th2;
                    } catch (IOException e12) {
                        throw new ContentDataSourceException(e12);
                    }
                } finally {
                    this.f14583g = null;
                    if (this.f14586j) {
                        this.f14586j = false;
                        p();
                    }
                }
            }
        } catch (IOException e13) {
            throw new ContentDataSourceException(e13);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.a
    public long i(b bVar) {
        try {
            Uri uri = bVar.f14632a;
            this.f14582f = uri;
            q(bVar);
            AssetFileDescriptor openAssetFileDescriptor = this.f14581e.openAssetFileDescriptor(uri, "r");
            this.f14583g = openAssetFileDescriptor;
            if (openAssetFileDescriptor != null) {
                FileInputStream fileInputStream = new FileInputStream(openAssetFileDescriptor.getFileDescriptor());
                this.f14584h = fileInputStream;
                long startOffset = openAssetFileDescriptor.getStartOffset();
                long skip = fileInputStream.skip(bVar.f14637f + startOffset) - startOffset;
                if (skip == bVar.f14637f) {
                    long j11 = bVar.f14638g;
                    if (j11 != -1) {
                        this.f14585i = j11;
                    } else {
                        long length = openAssetFileDescriptor.getLength();
                        if (length == -1) {
                            FileChannel channel = fileInputStream.getChannel();
                            long size = channel.size();
                            if (size == 0) {
                                this.f14585i = -1L;
                            } else {
                                long position = size - channel.position();
                                this.f14585i = position;
                                if (position < 0) {
                                    throw new EOFException();
                                }
                            }
                        } else {
                            long j12 = length - skip;
                            this.f14585i = j12;
                            if (j12 < 0) {
                                throw new EOFException();
                            }
                        }
                    }
                    this.f14586j = true;
                    r(bVar);
                    return this.f14585i;
                }
                throw new EOFException();
            }
            String valueOf = String.valueOf(uri);
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 36);
            sb2.append("Could not open file descriptor for: ");
            sb2.append(valueOf);
            throw new FileNotFoundException(sb2.toString());
        } catch (IOException e11) {
            throw new ContentDataSourceException(e11);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.a
    public Uri m() {
        return this.f14582f;
    }

    @Override // zj.f
    public int read(byte[] bArr, int i11, int i12) {
        if (i12 == 0) {
            return 0;
        }
        long j11 = this.f14585i;
        if (j11 == 0) {
            return -1;
        }
        if (j11 != -1) {
            try {
                i12 = (int) Math.min(j11, i12);
            } catch (IOException e11) {
                throw new ContentDataSourceException(e11);
            }
        }
        int read = ((FileInputStream) k0.j(this.f14584h)).read(bArr, i11, i12);
        if (read == -1) {
            if (this.f14585i == -1) {
                return -1;
            }
            throw new ContentDataSourceException(new EOFException());
        }
        long j12 = this.f14585i;
        if (j12 != -1) {
            this.f14585i = j12 - read;
        }
        o(read);
        return read;
    }
}