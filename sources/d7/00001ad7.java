package com.facebook.soloader;

import android.content.Context;
import android.os.Parcel;
import android.os.StrictMode;
import android.util.Log;
import java.io.Closeable;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.io.SyncFailedException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public abstract class s extends com.facebook.soloader.d {

    /* renamed from: d  reason: collision with root package name */
    protected final Context f12930d;

    /* renamed from: e  reason: collision with root package name */
    protected String f12931e;

    /* renamed from: f  reason: collision with root package name */
    protected k f12932f;

    /* renamed from: g  reason: collision with root package name */
    private final Map<String, Object> f12933g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ File f12934a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ byte[] f12935b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ c f12936c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ File f12937d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ k f12938e;

        a(File file, byte[] bArr, c cVar, File file2, k kVar) {
            this.f12934a = file;
            this.f12935b = bArr;
            this.f12936c = cVar;
            this.f12937d = file2;
            this.f12938e = kVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Log.v("fb-UnpackingSoSource", "starting syncer worker");
                RandomAccessFile randomAccessFile = new RandomAccessFile(this.f12934a, "rw");
                randomAccessFile.write(this.f12935b);
                randomAccessFile.setLength(randomAccessFile.getFilePointer());
                randomAccessFile.close();
                RandomAccessFile randomAccessFile2 = new RandomAccessFile(new File(s.this.f12895a, "dso_manifest"), "rw");
                this.f12936c.b(randomAccessFile2);
                randomAccessFile2.close();
                SysUtil.f(s.this.f12895a);
                s.x(this.f12937d, (byte) 1);
                Log.v("fb-UnpackingSoSource", "releasing dso store lock for " + s.this.f12895a + " (from syncer thread)");
                this.f12938e.close();
            } catch (IOException e11) {
                throw new RuntimeException(e11);
            }
        }
    }

    /* loaded from: classes3.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final String f12940a;

        /* renamed from: b  reason: collision with root package name */
        public final String f12941b;

        public b(String str, String str2) {
            this.f12940a = str;
            this.f12941b = str2;
        }
    }

    /* loaded from: classes3.dex */
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        public final b[] f12942a;

        public c(b[] bVarArr) {
            this.f12942a = bVarArr;
        }

        static final c a(DataInput dataInput) {
            if (dataInput.readByte() == 1) {
                int readInt = dataInput.readInt();
                if (readInt >= 0) {
                    b[] bVarArr = new b[readInt];
                    for (int i11 = 0; i11 < readInt; i11++) {
                        bVarArr[i11] = new b(dataInput.readUTF(), dataInput.readUTF());
                    }
                    return new c(bVarArr);
                }
                throw new RuntimeException("illegal number of shared libraries");
            }
            throw new RuntimeException("wrong dso manifest version");
        }

        public final void b(DataOutput dataOutput) {
            dataOutput.writeByte(1);
            dataOutput.writeInt(this.f12942a.length);
            int i11 = 0;
            while (true) {
                b[] bVarArr = this.f12942a;
                if (i11 >= bVarArr.length) {
                    return;
                }
                dataOutput.writeUTF(bVarArr[i11].f12940a);
                dataOutput.writeUTF(this.f12942a[i11].f12941b);
                i11++;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: classes3.dex */
    public interface d extends Closeable {
        int available();

        void f1(DataOutput dataOutput, byte[] bArr);

        String getFileName();

        b x1();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: classes3.dex */
    public static abstract class e implements Closeable {
        public abstract boolean a();

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        public abstract d g();
    }

    /* loaded from: classes3.dex */
    public static class f implements d {

        /* renamed from: a  reason: collision with root package name */
        private final b f12943a;

        /* renamed from: b  reason: collision with root package name */
        private final InputStream f12944b;

        public f(b bVar, InputStream inputStream) {
            this.f12943a = bVar;
            this.f12944b = inputStream;
        }

        @Override // com.facebook.soloader.s.d
        public int available() {
            return this.f12944b.available();
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f12944b.close();
        }

        @Override // com.facebook.soloader.s.d
        public void f1(DataOutput dataOutput, byte[] bArr) {
            SysUtil.a(dataOutput, this.f12944b, Integer.MAX_VALUE, bArr);
        }

        @Override // com.facebook.soloader.s.d
        public String getFileName() {
            return this.f12943a.f12940a;
        }

        @Override // com.facebook.soloader.s.d
        public b x1() {
            return this.f12943a;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: classes3.dex */
    public static abstract class g implements Closeable {
        public abstract c a();

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        public abstract e g();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public s(Context context, String str) {
        super(r(context, str), 1);
        this.f12933g = new HashMap();
        this.f12930d = context;
    }

    private void j(b[] bVarArr) {
        String[] list = this.f12895a.list();
        if (list != null) {
            for (String str : list) {
                if (!str.equals("dso_state") && !str.equals("dso_lock") && !str.equals("dso_instance_lock") && !str.equals("dso_deps") && !str.equals("dso_manifest")) {
                    boolean z11 = false;
                    for (int i11 = 0; !z11 && i11 < bVarArr.length; i11++) {
                        if (bVarArr[i11].f12940a.equals(q(str))) {
                            z11 = true;
                        }
                    }
                    if (!z11) {
                        File file = new File(this.f12895a, str);
                        Log.v("fb-UnpackingSoSource", "deleting unaccounted-for file " + file);
                        SysUtil.c(file);
                    }
                }
            }
            return;
        }
        throw new IOException("unable to list directory " + this.f12895a);
    }

    private void l(d dVar, byte[] bArr) {
        boolean writable;
        Log.i("fb-UnpackingSoSource", "extracting DSO " + dVar.x1().f12940a);
        try {
            if (this.f12895a.setWritable(true)) {
                m(dVar, bArr);
                if (writable) {
                    return;
                }
                return;
            }
            throw new IOException("cannot make directory writable for us: " + this.f12895a);
        } finally {
            if (!this.f12895a.setWritable(false)) {
                Log.w("fb-UnpackingSoSource", "error removing " + this.f12895a.getCanonicalPath() + " write permission");
            }
        }
    }

    private void m(d dVar, byte[] bArr) {
        RandomAccessFile randomAccessFile;
        File file = new File(this.f12895a, dVar.getFileName());
        RandomAccessFile randomAccessFile2 = null;
        try {
            try {
                if (file.exists() && !file.setWritable(true)) {
                    Log.w("fb-UnpackingSoSource", "error adding write permission to: " + file);
                }
                try {
                    randomAccessFile = new RandomAccessFile(file, "rw");
                } catch (IOException e11) {
                    Log.w("fb-UnpackingSoSource", "error overwriting " + file + " trying to delete and start over", e11);
                    SysUtil.c(file);
                    randomAccessFile = new RandomAccessFile(file, "rw");
                }
                randomAccessFile2 = randomAccessFile;
                int available = dVar.available();
                if (available > 1) {
                    SysUtil.d(randomAccessFile2.getFD(), available);
                }
                dVar.f1(randomAccessFile2, bArr);
                randomAccessFile2.setLength(randomAccessFile2.getFilePointer());
                if (file.setExecutable(true, false)) {
                    if (!file.setWritable(false)) {
                        Log.w("fb-UnpackingSoSource", "error removing " + file + " write permission");
                    }
                    randomAccessFile2.close();
                    return;
                }
                throw new IOException("cannot make file executable: " + file);
            } catch (IOException e12) {
                SysUtil.c(file);
                throw e12;
            }
        } catch (Throwable th2) {
            if (!file.setWritable(false)) {
                Log.w("fb-UnpackingSoSource", "error removing " + file + " write permission");
            }
            if (randomAccessFile2 != null) {
                randomAccessFile2.close();
            }
            throw th2;
        }
    }

    private Object o(String str) {
        Object obj;
        synchronized (this.f12933g) {
            obj = this.f12933g.get(str);
            if (obj == null) {
                obj = new Object();
                this.f12933g.put(str, obj);
            }
        }
        return obj;
    }

    public static File r(Context context, String str) {
        return new File(context.getApplicationInfo().dataDir + "/" + str);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0043 A[Catch: all -> 0x0036, TryCatch #4 {all -> 0x0036, blocks: (B:4:0x0031, B:13:0x0043, B:14:0x004a, B:15:0x0054, B:17:0x005a, B:33:0x00a6, B:9:0x003a, B:20:0x0062, B:22:0x0067, B:24:0x0079, B:27:0x008c, B:28:0x008f, B:32:0x00a3), top: B:49:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005a A[Catch: all -> 0x0036, TRY_LEAVE, TryCatch #4 {all -> 0x0036, blocks: (B:4:0x0031, B:13:0x0043, B:14:0x004a, B:15:0x0054, B:17:0x005a, B:33:0x00a6, B:9:0x003a, B:20:0x0062, B:22:0x0067, B:24:0x0079, B:27:0x008c, B:28:0x008f, B:32:0x00a3), top: B:49:0x0031 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void v(byte r10, com.facebook.soloader.s.c r11, com.facebook.soloader.s.e r12) {
        /*
            r9 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "regenerating DSO store "
            r0.append(r1)
            java.lang.Class r1 = r9.getClass()
            java.lang.String r1 = r1.getName()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "fb-UnpackingSoSource"
            android.util.Log.v(r1, r0)
            java.io.File r0 = new java.io.File
            java.io.File r2 = r9.f12895a
            java.lang.String r3 = "dso_manifest"
            r0.<init>(r2, r3)
            java.io.RandomAccessFile r2 = new java.io.RandomAccessFile
            java.lang.String r3 = "rw"
            r2.<init>(r0, r3)
            r0 = 1
            if (r10 != r0) goto L3f
            com.facebook.soloader.s$c r10 = com.facebook.soloader.s.c.a(r2)     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L39
            goto L40
        L36:
            r10 = move-exception
            goto Ld6
        L39:
            r10 = move-exception
            java.lang.String r3 = "error reading existing DSO manifest"
            android.util.Log.i(r1, r3, r10)     // Catch: java.lang.Throwable -> L36
        L3f:
            r10 = 0
        L40:
            r3 = 0
            if (r10 != 0) goto L4a
            com.facebook.soloader.s$c r10 = new com.facebook.soloader.s$c     // Catch: java.lang.Throwable -> L36
            com.facebook.soloader.s$b[] r4 = new com.facebook.soloader.s.b[r3]     // Catch: java.lang.Throwable -> L36
            r10.<init>(r4)     // Catch: java.lang.Throwable -> L36
        L4a:
            com.facebook.soloader.s$b[] r11 = r11.f12942a     // Catch: java.lang.Throwable -> L36
            r9.j(r11)     // Catch: java.lang.Throwable -> L36
            r11 = 32768(0x8000, float:4.5918E-41)
            byte[] r11 = new byte[r11]     // Catch: java.lang.Throwable -> L36
        L54:
            boolean r4 = r12.a()     // Catch: java.lang.Throwable -> L36
            if (r4 == 0) goto Lb6
            com.facebook.soloader.s$d r4 = r12.g()     // Catch: java.lang.Throwable -> L36
            r5 = r0
            r6 = r3
        L60:
            if (r5 == 0) goto L8f
            com.facebook.soloader.s$b[] r7 = r10.f12942a     // Catch: java.lang.Throwable -> Laa
            int r7 = r7.length     // Catch: java.lang.Throwable -> Laa
            if (r6 >= r7) goto L8f
            com.facebook.soloader.s$b r7 = r4.x1()     // Catch: java.lang.Throwable -> Laa
            java.lang.String r7 = r7.f12940a     // Catch: java.lang.Throwable -> Laa
            com.facebook.soloader.s$b[] r8 = r10.f12942a     // Catch: java.lang.Throwable -> Laa
            r8 = r8[r6]     // Catch: java.lang.Throwable -> Laa
            java.lang.String r8 = r8.f12940a     // Catch: java.lang.Throwable -> Laa
            boolean r7 = r8.equals(r7)     // Catch: java.lang.Throwable -> Laa
            if (r7 == 0) goto L8c
            com.facebook.soloader.s$b[] r7 = r10.f12942a     // Catch: java.lang.Throwable -> Laa
            r7 = r7[r6]     // Catch: java.lang.Throwable -> Laa
            java.lang.String r7 = r7.f12941b     // Catch: java.lang.Throwable -> Laa
            com.facebook.soloader.s$b r8 = r4.x1()     // Catch: java.lang.Throwable -> Laa
            java.lang.String r8 = r8.f12941b     // Catch: java.lang.Throwable -> Laa
            boolean r7 = r7.equals(r8)     // Catch: java.lang.Throwable -> Laa
            if (r7 == 0) goto L8c
            r5 = r3
        L8c:
            int r6 = r6 + 1
            goto L60
        L8f:
            java.io.File r6 = new java.io.File     // Catch: java.lang.Throwable -> Laa
            java.io.File r7 = r9.f12895a     // Catch: java.lang.Throwable -> Laa
            java.lang.String r8 = r4.getFileName()     // Catch: java.lang.Throwable -> Laa
            r6.<init>(r7, r8)     // Catch: java.lang.Throwable -> Laa
            boolean r6 = r6.exists()     // Catch: java.lang.Throwable -> Laa
            if (r6 != 0) goto La1
            r5 = r0
        La1:
            if (r5 == 0) goto La6
            r9.l(r4, r11)     // Catch: java.lang.Throwable -> Laa
        La6:
            r4.close()     // Catch: java.lang.Throwable -> L36
            goto L54
        Laa:
            r10 = move-exception
            if (r4 == 0) goto Lb5
            r4.close()     // Catch: java.lang.Throwable -> Lb1
            goto Lb5
        Lb1:
            r11 = move-exception
            r10.addSuppressed(r11)     // Catch: java.lang.Throwable -> L36
        Lb5:
            throw r10     // Catch: java.lang.Throwable -> L36
        Lb6:
            r2.close()
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "Finished regenerating DSO store "
            r10.append(r11)
            java.lang.Class r11 = r9.getClass()
            java.lang.String r11 = r11.getName()
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            android.util.Log.v(r1, r10)
            return
        Ld6:
            r2.close()     // Catch: java.lang.Throwable -> Lda
            goto Lde
        Lda:
            r11 = move-exception
            r10.addSuppressed(r11)
        Lde:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.soloader.s.v(byte, com.facebook.soloader.s$c, com.facebook.soloader.s$e):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void x(File file, byte b11) {
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
            randomAccessFile.seek(0L);
            randomAccessFile.write(b11);
            randomAccessFile.setLength(randomAccessFile.getFilePointer());
            randomAccessFile.getFD().sync();
            randomAccessFile.close();
        } catch (SyncFailedException e11) {
            Log.w("fb-UnpackingSoSource", "state file sync failed", e11);
        }
    }

    @Override // com.facebook.soloader.d, com.facebook.soloader.q
    public int a(String str, int i11, StrictMode.ThreadPolicy threadPolicy) {
        int h11;
        synchronized (o(str)) {
            h11 = h(str, i11, this.f12895a, threadPolicy);
        }
        return h11;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.soloader.q
    public void b(int i11) {
        SysUtil.n(this.f12895a);
        k p11 = p(new File(this.f12895a, "dso_lock"), true);
        if (this.f12932f == null) {
            this.f12932f = p(new File(this.f12895a, "dso_instance_lock"), false);
        }
        try {
            Log.v("fb-UnpackingSoSource", "locked dso store " + this.f12895a);
            if (u(p11, i11, n())) {
                p11 = null;
            } else {
                Log.i("fb-UnpackingSoSource", "dso store is up-to-date: " + this.f12895a);
            }
        } finally {
            if (p11 != null) {
                Log.v("fb-UnpackingSoSource", "releasing dso store lock for " + this.f12895a);
                p11.close();
            } else {
                Log.v("fb-UnpackingSoSource", "not releasing dso store lock for " + this.f12895a + " (syncer thread started)");
            }
        }
    }

    protected boolean k(byte[] bArr, byte[] bArr2) {
        return !Arrays.equals(bArr, bArr2);
    }

    protected byte[] n() {
        Parcel obtain = Parcel.obtain();
        g s11 = s((byte) 1);
        try {
            b[] bVarArr = s11.a().f12942a;
            obtain.writeByte((byte) 1);
            obtain.writeInt(bVarArr.length);
            for (int i11 = 0; i11 < bVarArr.length; i11++) {
                obtain.writeString(bVarArr[i11].f12940a);
                obtain.writeString(bVarArr[i11].f12941b);
            }
            s11.close();
            byte[] marshall = obtain.marshall();
            obtain.recycle();
            return marshall;
        } catch (Throwable th2) {
            if (s11 != null) {
                try {
                    s11.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    protected k p(File file, boolean z11) {
        return SysUtil.i(this.f12895a, file, z11);
    }

    protected String q(String str) {
        return str;
    }

    protected abstract g s(byte b11);

    /* JADX INFO: Access modifiers changed from: protected */
    public synchronized void t(String str) {
        synchronized (o(str)) {
            this.f12931e = str;
            b(2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00a0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected boolean u(com.facebook.soloader.k r12, int r13, byte[] r14) {
        /*
            Method dump skipped, instructions count: 246
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.soloader.s.u(com.facebook.soloader.k, int, byte[]):boolean");
    }

    public void w(String[] strArr) {
    }
}