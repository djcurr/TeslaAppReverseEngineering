package com.facebook.soloader;

import android.content.Context;
import android.os.Parcel;
import android.util.Log;
import com.facebook.soloader.j;
import com.facebook.soloader.s;
import java.io.File;
import java.util.zip.ZipEntry;

/* loaded from: classes3.dex */
public class a extends j {

    /* renamed from: j  reason: collision with root package name */
    private final int f12885j;

    /* renamed from: com.facebook.soloader.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    protected class C0240a extends j.c {

        /* renamed from: e  reason: collision with root package name */
        private File f12886e;

        /* renamed from: f  reason: collision with root package name */
        private final int f12887f;

        C0240a(j jVar) {
            super(jVar);
            this.f12886e = new File(a.this.f12930d.getApplicationInfo().nativeLibraryDir);
            this.f12887f = a.this.f12885j;
        }

        @Override // com.facebook.soloader.j.c
        protected boolean p(ZipEntry zipEntry, String str) {
            String str2;
            String name = zipEntry.getName();
            boolean z11 = false;
            if (str.equals(a.this.f12931e)) {
                a.this.f12931e = null;
                str2 = String.format("allowing consideration of corrupted lib %s", str);
            } else if ((this.f12887f & 1) == 0) {
                str2 = "allowing consideration of " + name + ": self-extraction preferred";
            } else {
                File file = new File(this.f12886e, str);
                if (!file.isFile()) {
                    str2 = String.format("allowing considering of %s: %s not in system lib dir", name, str);
                } else {
                    long length = file.length();
                    long size = zipEntry.getSize();
                    if (length != size) {
                        str2 = String.format("allowing consideration of %s: sysdir file length is %s, but the file is %s bytes long in the APK", file, Long.valueOf(length), Long.valueOf(size));
                    } else {
                        str2 = "not allowing consideration of " + name + ": deferring to libdir";
                        Log.d("ApkSoSource", str2);
                        return z11;
                    }
                }
            }
            z11 = true;
            Log.d("ApkSoSource", str2);
            return z11;
        }
    }

    public a(Context context, File file, String str, int i11) {
        super(context, str, file, "^lib/([^/]+)/([^/]+\\.so)$");
        this.f12885j = i11;
    }

    @Override // com.facebook.soloader.s
    protected byte[] n() {
        File canonicalFile = this.f12911h.getCanonicalFile();
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeByte((byte) 2);
            obtain.writeString(canonicalFile.getPath());
            obtain.writeLong(canonicalFile.lastModified());
            obtain.writeInt(SysUtil.g(this.f12930d));
            if ((this.f12885j & 1) == 0) {
                obtain.writeByte((byte) 0);
                return obtain.marshall();
            }
            String str = this.f12930d.getApplicationInfo().nativeLibraryDir;
            if (str == null) {
                obtain.writeByte((byte) 1);
                return obtain.marshall();
            }
            File canonicalFile2 = new File(str).getCanonicalFile();
            if (!canonicalFile2.exists()) {
                obtain.writeByte((byte) 1);
                return obtain.marshall();
            }
            obtain.writeByte((byte) 2);
            obtain.writeString(canonicalFile2.getPath());
            obtain.writeLong(canonicalFile2.lastModified());
            return obtain.marshall();
        } finally {
            obtain.recycle();
        }
    }

    @Override // com.facebook.soloader.s
    protected s.g s(byte b11) {
        return new C0240a(this);
    }
}