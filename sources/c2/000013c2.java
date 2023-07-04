package com.airbnb.android.react.maps;

import android.content.Context;
import android.net.Uri;
import android.os.AsyncTask;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;

/* loaded from: classes.dex */
public class n extends AsyncTask<String, Void, InputStream> {

    /* renamed from: a  reason: collision with root package name */
    private Context f9936a;

    public n(Context context) {
        this.f9936a = context;
    }

    private InputStream b(Context context, Uri uri) {
        File createTempFile = File.createTempFile("FileUtil", "temp", context.getApplicationContext().getCacheDir());
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

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: a */
    public InputStream doInBackground(String... strArr) {
        try {
            Uri parse = Uri.parse(strArr[0]);
            if (parse.getScheme().startsWith("http")) {
                return b(this.f9936a, parse);
            }
            return this.f9936a.getContentResolver().openInputStream(parse);
        } catch (Exception e11) {
            nd.a.k("ReactNative", "Could not retrieve file for contentUri " + strArr[0], e11);
            return null;
        }
    }
}