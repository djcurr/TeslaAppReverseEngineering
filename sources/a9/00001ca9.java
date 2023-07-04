package com.google.android.exoplayer2.upstream;

import ak.k0;
import android.net.Uri;
import android.text.TextUtils;
import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/* loaded from: classes3.dex */
public final class FileDataSource extends zj.e {

    /* renamed from: e  reason: collision with root package name */
    private RandomAccessFile f14587e;

    /* renamed from: f  reason: collision with root package name */
    private Uri f14588f;

    /* renamed from: g  reason: collision with root package name */
    private long f14589g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f14590h;

    /* loaded from: classes3.dex */
    public static class FileDataSourceException extends IOException {
        public FileDataSourceException(IOException iOException) {
            super(iOException);
        }

        public FileDataSourceException(String str, IOException iOException) {
            super(str, iOException);
        }
    }

    public FileDataSource() {
        super(false);
    }

    private static RandomAccessFile s(Uri uri) {
        try {
            return new RandomAccessFile((String) ak.a.e(uri.getPath()), "r");
        } catch (FileNotFoundException e11) {
            if (TextUtils.isEmpty(uri.getQuery()) && TextUtils.isEmpty(uri.getFragment())) {
                throw new FileDataSourceException(e11);
            }
            throw new FileDataSourceException(String.format("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=%s,query=%s,fragment=%s", uri.getPath(), uri.getQuery(), uri.getFragment()), e11);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.a
    public void close() {
        this.f14588f = null;
        try {
            try {
                RandomAccessFile randomAccessFile = this.f14587e;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
            } catch (IOException e11) {
                throw new FileDataSourceException(e11);
            }
        } finally {
            this.f14587e = null;
            if (this.f14590h) {
                this.f14590h = false;
                p();
            }
        }
    }

    @Override // com.google.android.exoplayer2.upstream.a
    public long i(b bVar) {
        try {
            Uri uri = bVar.f14632a;
            this.f14588f = uri;
            q(bVar);
            RandomAccessFile s11 = s(uri);
            this.f14587e = s11;
            s11.seek(bVar.f14637f);
            long j11 = bVar.f14638g;
            if (j11 == -1) {
                j11 = this.f14587e.length() - bVar.f14637f;
            }
            this.f14589g = j11;
            if (j11 >= 0) {
                this.f14590h = true;
                r(bVar);
                return this.f14589g;
            }
            throw new EOFException();
        } catch (IOException e11) {
            throw new FileDataSourceException(e11);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.a
    public Uri m() {
        return this.f14588f;
    }

    @Override // zj.f
    public int read(byte[] bArr, int i11, int i12) {
        if (i12 == 0) {
            return 0;
        }
        if (this.f14589g == 0) {
            return -1;
        }
        try {
            int read = ((RandomAccessFile) k0.j(this.f14587e)).read(bArr, i11, (int) Math.min(this.f14589g, i12));
            if (read > 0) {
                this.f14589g -= read;
                o(read);
            }
            return read;
        } catch (IOException e11) {
            throw new FileDataSourceException(e11);
        }
    }
}