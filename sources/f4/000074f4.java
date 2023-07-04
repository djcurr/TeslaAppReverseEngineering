package ia;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;
import android.util.Log;
import com.bumptech.glide.h;
import com.bumptech.glide.load.data.d;
import com.bumptech.glide.load.data.g;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public class c implements com.bumptech.glide.load.data.d<InputStream> {

    /* renamed from: a  reason: collision with root package name */
    private final Uri f30214a;

    /* renamed from: b  reason: collision with root package name */
    private final e f30215b;

    /* renamed from: c  reason: collision with root package name */
    private InputStream f30216c;

    /* loaded from: classes.dex */
    static class a implements d {

        /* renamed from: b  reason: collision with root package name */
        private static final String[] f30217b = {"_data"};

        /* renamed from: a  reason: collision with root package name */
        private final ContentResolver f30218a;

        a(ContentResolver contentResolver) {
            this.f30218a = contentResolver;
        }

        @Override // ia.d
        public Cursor a(Uri uri) {
            return this.f30218a.query(MediaStore.Images.Thumbnails.EXTERNAL_CONTENT_URI, f30217b, "kind = 1 AND image_id = ?", new String[]{uri.getLastPathSegment()}, null);
        }
    }

    /* loaded from: classes.dex */
    static class b implements d {

        /* renamed from: b  reason: collision with root package name */
        private static final String[] f30219b = {"_data"};

        /* renamed from: a  reason: collision with root package name */
        private final ContentResolver f30220a;

        b(ContentResolver contentResolver) {
            this.f30220a = contentResolver;
        }

        @Override // ia.d
        public Cursor a(Uri uri) {
            return this.f30220a.query(MediaStore.Video.Thumbnails.EXTERNAL_CONTENT_URI, f30219b, "kind = 1 AND video_id = ?", new String[]{uri.getLastPathSegment()}, null);
        }
    }

    c(Uri uri, e eVar) {
        this.f30214a = uri;
        this.f30215b = eVar;
    }

    private static c b(Context context, Uri uri, d dVar) {
        return new c(uri, new e(com.bumptech.glide.c.e(context).n().g(), dVar, com.bumptech.glide.c.e(context).g(), context.getContentResolver()));
    }

    public static c e(Context context, Uri uri) {
        return b(context, uri, new a(context.getContentResolver()));
    }

    public static c f(Context context, Uri uri) {
        return b(context, uri, new b(context.getContentResolver()));
    }

    private InputStream g() {
        InputStream d11 = this.f30215b.d(this.f30214a);
        int a11 = d11 != null ? this.f30215b.a(this.f30214a) : -1;
        return a11 != -1 ? new g(d11, a11) : d11;
    }

    @Override // com.bumptech.glide.load.data.d
    public Class<InputStream> a() {
        return InputStream.class;
    }

    @Override // com.bumptech.glide.load.data.d
    public com.bumptech.glide.load.a c() {
        return com.bumptech.glide.load.a.LOCAL;
    }

    @Override // com.bumptech.glide.load.data.d
    public void cancel() {
    }

    @Override // com.bumptech.glide.load.data.d
    public void cleanup() {
        InputStream inputStream = this.f30216c;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    @Override // com.bumptech.glide.load.data.d
    public void d(h hVar, d.a<? super InputStream> aVar) {
        try {
            InputStream g11 = g();
            this.f30216c = g11;
            aVar.e(g11);
        } catch (FileNotFoundException e11) {
            if (Log.isLoggable("MediaStoreThumbFetcher", 3)) {
                Log.d("MediaStoreThumbFetcher", "Failed to find thumbnail file", e11);
            }
            aVar.b(e11);
        }
    }
}