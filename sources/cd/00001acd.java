package com.facebook.soloader;

import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileLock;

/* loaded from: classes3.dex */
public final class k implements Closeable {

    /* renamed from: a  reason: collision with root package name */
    private FileOutputStream f12921a;

    /* renamed from: b  reason: collision with root package name */
    private FileLock f12922b;

    private k(File file, boolean z11) {
        a(file, z11);
    }

    private void a(File file, boolean z11) {
        FileLock fileLock;
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        this.f12921a = fileOutputStream;
        try {
            if (z11) {
                try {
                    fileLock = fileOutputStream.getChannel().tryLock();
                } catch (IOException unused) {
                    fileLock = null;
                }
            } else {
                fileLock = fileOutputStream.getChannel().lock();
            }
            if (fileLock == null) {
            }
            this.f12922b = fileLock;
        } finally {
            this.f12921a.close();
        }
    }

    public static k g(File file) {
        return new k(file, false);
    }

    public static k j(File file) {
        k kVar = new k(file, true);
        if (kVar.f12922b == null) {
            kVar.close();
            return null;
        }
        return kVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            FileLock fileLock = this.f12922b;
            if (fileLock != null) {
                fileLock.release();
            }
        } finally {
            this.f12921a.close();
        }
    }
}