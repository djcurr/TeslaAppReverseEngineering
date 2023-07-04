package na;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import com.bumptech.glide.load.data.d;
import java.io.File;
import java.io.FileNotFoundException;
import na.n;

/* loaded from: classes.dex */
public final class k implements n<Uri, File> {

    /* renamed from: a  reason: collision with root package name */
    private final Context f40723a;

    /* loaded from: classes.dex */
    public static final class a implements o<Uri, File> {

        /* renamed from: a  reason: collision with root package name */
        private final Context f40724a;

        public a(Context context) {
            this.f40724a = context;
        }

        @Override // na.o
        public void a() {
        }

        @Override // na.o
        public n<Uri, File> c(r rVar) {
            return new k(this.f40724a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class b implements com.bumptech.glide.load.data.d<File> {

        /* renamed from: c  reason: collision with root package name */
        private static final String[] f40725c = {"_data"};

        /* renamed from: a  reason: collision with root package name */
        private final Context f40726a;

        /* renamed from: b  reason: collision with root package name */
        private final Uri f40727b;

        b(Context context, Uri uri) {
            this.f40726a = context;
            this.f40727b = uri;
        }

        @Override // com.bumptech.glide.load.data.d
        public Class<File> a() {
            return File.class;
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
        }

        @Override // com.bumptech.glide.load.data.d
        public void d(com.bumptech.glide.h hVar, d.a<? super File> aVar) {
            Cursor query = this.f40726a.getContentResolver().query(this.f40727b, f40725c, null, null, null);
            if (query != null) {
                try {
                    r0 = query.moveToFirst() ? query.getString(query.getColumnIndexOrThrow("_data")) : null;
                } finally {
                    query.close();
                }
            }
            if (TextUtils.isEmpty(r0)) {
                aVar.b(new FileNotFoundException("Failed to find file path for: " + this.f40727b));
                return;
            }
            aVar.e(new File(r0));
        }
    }

    public k(Context context) {
        this.f40723a = context;
    }

    @Override // na.n
    /* renamed from: c */
    public n.a<File> b(Uri uri, int i11, int i12, ha.e eVar) {
        return new n.a<>(new ab.d(uri), new b(this.f40723a, uri));
    }

    @Override // na.n
    /* renamed from: d */
    public boolean a(Uri uri) {
        return ia.b.b(uri);
    }
}