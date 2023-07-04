package androidx.room;

import android.content.Context;
import android.util.Log;
import androidx.room.t0;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import java.util.concurrent.Callable;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class x0 implements v4.h, q {

    /* renamed from: a  reason: collision with root package name */
    private final Context f5877a;

    /* renamed from: b  reason: collision with root package name */
    private final String f5878b;

    /* renamed from: c  reason: collision with root package name */
    private final File f5879c;

    /* renamed from: d  reason: collision with root package name */
    private final Callable<InputStream> f5880d;

    /* renamed from: e  reason: collision with root package name */
    private final int f5881e;

    /* renamed from: f  reason: collision with root package name */
    private final v4.h f5882f;

    /* renamed from: g  reason: collision with root package name */
    private p f5883g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f5884h;

    /* JADX INFO: Access modifiers changed from: package-private */
    public x0(Context context, String str, File file, Callable<InputStream> callable, int i11, v4.h hVar) {
        this.f5877a = context;
        this.f5878b = str;
        this.f5879c = file;
        this.f5880d = callable;
        this.f5881e = i11;
        this.f5882f = hVar;
    }

    private void a(File file, boolean z11) {
        ReadableByteChannel newChannel;
        if (this.f5878b != null) {
            newChannel = Channels.newChannel(this.f5877a.getAssets().open(this.f5878b));
        } else if (this.f5879c != null) {
            newChannel = new FileInputStream(this.f5879c).getChannel();
        } else {
            Callable<InputStream> callable = this.f5880d;
            if (callable != null) {
                try {
                    newChannel = Channels.newChannel(callable.call());
                } catch (Exception e11) {
                    throw new IOException("inputStreamCallable exception on call", e11);
                }
            } else {
                throw new IllegalStateException("copyFromAssetPath, copyFromFile and copyFromInputStream are all null!");
            }
        }
        File createTempFile = File.createTempFile("room-copy-helper", ".tmp", this.f5877a.getCacheDir());
        createTempFile.deleteOnExit();
        u4.d.a(newChannel, new FileOutputStream(createTempFile).getChannel());
        File parentFile = file.getParentFile();
        if (parentFile != null && !parentFile.exists() && !parentFile.mkdirs()) {
            throw new IOException("Failed to create directories for " + file.getAbsolutePath());
        }
        g(createTempFile, z11);
        if (createTempFile.renameTo(file)) {
            return;
        }
        throw new IOException("Failed to move intermediate file (" + createTempFile.getAbsolutePath() + ") to destination (" + file.getAbsolutePath() + ").");
    }

    private void g(File file, boolean z11) {
        p pVar = this.f5883g;
        if (pVar != null) {
            t0.e eVar = pVar.f5810f;
        }
    }

    private void l(boolean z11) {
        String databaseName = getDatabaseName();
        File databasePath = this.f5877a.getDatabasePath(databaseName);
        p pVar = this.f5883g;
        u4.a aVar = new u4.a(databaseName, this.f5877a.getFilesDir(), pVar == null || pVar.f5817m);
        try {
            aVar.b();
            if (!databasePath.exists()) {
                try {
                    a(databasePath, z11);
                    aVar.c();
                    return;
                } catch (IOException e11) {
                    throw new RuntimeException("Unable to copy database file.", e11);
                }
            } else if (this.f5883g == null) {
                aVar.c();
                return;
            } else {
                try {
                    int d11 = u4.c.d(databasePath);
                    int i11 = this.f5881e;
                    if (d11 == i11) {
                        aVar.c();
                        return;
                    } else if (this.f5883g.a(d11, i11)) {
                        aVar.c();
                        return;
                    } else {
                        if (this.f5877a.deleteDatabase(databaseName)) {
                            try {
                                a(databasePath, z11);
                            } catch (IOException e12) {
                                Log.w("ROOM", "Unable to copy database file.", e12);
                            }
                        } else {
                            Log.w("ROOM", "Failed to delete database file (" + databaseName + ") for a copy destructive migration.");
                        }
                        aVar.c();
                        return;
                    }
                } catch (IOException e13) {
                    Log.w("ROOM", "Unable to read database version.", e13);
                    aVar.c();
                    return;
                }
            }
        } catch (Throwable th2) {
            aVar.c();
            throw th2;
        }
        aVar.c();
        throw th2;
    }

    @Override // v4.h
    public synchronized v4.g W0() {
        if (!this.f5884h) {
            l(true);
            this.f5884h = true;
        }
        return this.f5882f.W0();
    }

    @Override // v4.h, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        this.f5882f.close();
        this.f5884h = false;
    }

    @Override // v4.h
    public String getDatabaseName() {
        return this.f5882f.getDatabaseName();
    }

    @Override // androidx.room.q
    public v4.h getDelegate() {
        return this.f5882f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void j(p pVar) {
        this.f5883g = pVar;
    }

    @Override // v4.h
    public void setWriteAheadLoggingEnabled(boolean z11) {
        this.f5882f.setWriteAheadLoggingEnabled(z11);
    }
}