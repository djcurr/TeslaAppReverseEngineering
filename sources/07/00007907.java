package io.sentry.android.core;

import android.content.Context;
import java.io.File;
import java.io.FileOutputStream;
import java.io.RandomAccessFile;
import java.nio.charset.Charset;
import java.util.UUID;

/* loaded from: classes5.dex */
final class h0 {

    /* renamed from: a  reason: collision with root package name */
    static String f32085a;

    /* renamed from: b  reason: collision with root package name */
    private static final Charset f32086b = Charset.forName("UTF-8");

    public static synchronized String a(Context context) {
        synchronized (h0.class) {
            if (f32085a == null) {
                File file = new File(context.getFilesDir(), "INSTALLATION");
                if (!file.exists()) {
                    String c11 = c(file);
                    f32085a = c11;
                    return c11;
                }
                f32085a = b(file);
            }
            return f32085a;
        }
    }

    static String b(File file) {
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
        try {
            byte[] bArr = new byte[(int) randomAccessFile.length()];
            randomAccessFile.readFully(bArr);
            String str = new String(bArr, f32086b);
            randomAccessFile.close();
            return str;
        } catch (Throwable th2) {
            try {
                randomAccessFile.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    static String c(File file) {
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            String uuid = UUID.randomUUID().toString();
            fileOutputStream.write(uuid.getBytes(f32086b));
            fileOutputStream.flush();
            fileOutputStream.close();
            return uuid;
        } catch (Throwable th2) {
            try {
                fileOutputStream.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }
}