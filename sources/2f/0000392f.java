package com.google.firebase.messaging;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

/* loaded from: classes2.dex */
public class f0 implements Closeable {

    /* renamed from: a */
    private final URL f16795a;

    /* renamed from: b */
    private volatile Future<?> f16796b;

    /* renamed from: c */
    private Task<Bitmap> f16797c;

    private f0(URL url) {
        this.f16795a = url;
    }

    public static /* synthetic */ void a(f0 f0Var, TaskCompletionSource taskCompletionSource) {
        f0Var.p(taskCompletionSource);
    }

    private byte[] j() {
        URLConnection openConnection = this.f16795a.openConnection();
        if (openConnection.getContentLength() <= 1048576) {
            InputStream inputStream = openConnection.getInputStream();
            try {
                byte[] d11 = b.d(b.b(inputStream, 1048577L));
                if (inputStream != null) {
                    inputStream.close();
                }
                if (Log.isLoggable("FirebaseMessaging", 2)) {
                    Log.v("FirebaseMessaging", "Downloaded " + d11.length + " bytes from " + this.f16795a);
                }
                if (d11.length <= 1048576) {
                    return d11;
                }
                throw new IOException("Image exceeds max size of 1048576");
            } catch (Throwable th2) {
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        }
        throw new IOException("Content-Length exceeds max size of 1048576");
    }

    public static f0 l(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return new f0(new URL(str));
        } catch (MalformedURLException unused) {
            Log.w("FirebaseMessaging", "Not downloading image, bad URL: " + str);
            return null;
        }
    }

    public /* synthetic */ void p(TaskCompletionSource taskCompletionSource) {
        try {
            taskCompletionSource.setResult(g());
        } catch (Exception e11) {
            taskCompletionSource.setException(e11);
        }
    }

    public void C(ExecutorService executorService) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f16796b = executorService.submit(new Runnable() { // from class: com.google.firebase.messaging.e0
            {
                f0.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                f0.a(f0.this, taskCompletionSource);
            }
        });
        this.f16797c = taskCompletionSource.getTask();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f16796b.cancel(true);
    }

    public Bitmap g() {
        if (Log.isLoggable("FirebaseMessaging", 4)) {
            Log.i("FirebaseMessaging", "Starting download of: " + this.f16795a);
        }
        byte[] j11 = j();
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(j11, 0, j11.length);
        if (decodeByteArray != null) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Successfully downloaded image: " + this.f16795a);
            }
            return decodeByteArray;
        }
        throw new IOException("Failed to decode image: " + this.f16795a);
    }

    public Task<Bitmap> m() {
        return (Task) Preconditions.checkNotNull(this.f16797c);
    }
}