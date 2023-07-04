package com.facebook.react.modules.network;

import android.content.Context;
import android.net.Uri;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import java.util.zip.GZIPOutputStream;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okhttp3.internal.Util;
import okio.e0;
import okio.r;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class m {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class a extends RequestBody {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ MediaType f12068a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ InputStream f12069b;

        a(MediaType mediaType, InputStream inputStream) {
            this.f12068a = mediaType;
            this.f12069b = inputStream;
        }

        @Override // okhttp3.RequestBody
        public long contentLength() {
            try {
                return this.f12069b.available();
            } catch (IOException unused) {
                return 0L;
            }
        }

        @Override // okhttp3.RequestBody
        public MediaType contentType() {
            return this.f12068a;
        }

        @Override // okhttp3.RequestBody
        public void writeTo(okio.g gVar) {
            e0 e0Var = null;
            try {
                e0Var = r.k(this.f12069b);
                gVar.b0(e0Var);
            } finally {
                Util.closeQuietly(e0Var);
            }
        }
    }

    public static RequestBody a(MediaType mediaType, InputStream inputStream) {
        return new a(mediaType, inputStream);
    }

    public static RequestBody b(MediaType mediaType, String str) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(str.getBytes());
            gZIPOutputStream.close();
            return RequestBody.create(mediaType, byteArrayOutputStream.toByteArray());
        } catch (IOException unused) {
            return null;
        }
    }

    public static i c(RequestBody requestBody, h hVar) {
        return new i(requestBody, hVar);
    }

    private static InputStream d(Context context, Uri uri) {
        File createTempFile = File.createTempFile("RequestBodyUtil", "temp", context.getApplicationContext().getCacheDir());
        createTempFile.deleteOnExit();
        InputStream openStream = FirebasePerfUrlConnection.openStream(new URL(uri.toString()));
        try {
            ReadableByteChannel newChannel = Channels.newChannel(openStream);
            FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
            try {
                fileOutputStream.getChannel().transferFrom(newChannel, 0L, Long.MAX_VALUE);
                FileInputStream fileInputStream = new FileInputStream(createTempFile);
                newChannel.close();
                return fileInputStream;
            } finally {
                fileOutputStream.close();
            }
        } finally {
            openStream.close();
        }
    }

    public static RequestBody e(String str) {
        if (str.equals("POST") || str.equals("PUT") || str.equals("PATCH")) {
            return RequestBody.create((MediaType) null, okio.i.f42656d);
        }
        return null;
    }

    public static InputStream f(Context context, String str) {
        try {
            Uri parse = Uri.parse(str);
            if (parse.getScheme().startsWith("http")) {
                return d(context, parse);
            }
            return context.getContentResolver().openInputStream(parse);
        } catch (Exception e11) {
            nd.a.k("ReactNative", "Could not retrieve file for contentUri " + str, e11);
            return null;
        }
    }

    public static boolean g(String str) {
        return "gzip".equalsIgnoreCase(str);
    }
}