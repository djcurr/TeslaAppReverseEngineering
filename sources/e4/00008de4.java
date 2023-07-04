package oa;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.provider.MediaStore;
import android.text.TextUtils;
import com.bumptech.glide.h;
import com.bumptech.glide.load.data.d;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import na.n;
import na.o;
import na.r;

/* loaded from: classes.dex */
public final class d<DataT> implements n<Uri, DataT> {

    /* renamed from: a  reason: collision with root package name */
    private final Context f42331a;

    /* renamed from: b  reason: collision with root package name */
    private final n<File, DataT> f42332b;

    /* renamed from: c  reason: collision with root package name */
    private final n<Uri, DataT> f42333c;

    /* renamed from: d  reason: collision with root package name */
    private final Class<DataT> f42334d;

    /* loaded from: classes.dex */
    private static abstract class a<DataT> implements o<Uri, DataT> {

        /* renamed from: a  reason: collision with root package name */
        private final Context f42335a;

        /* renamed from: b  reason: collision with root package name */
        private final Class<DataT> f42336b;

        a(Context context, Class<DataT> cls) {
            this.f42335a = context;
            this.f42336b = cls;
        }

        @Override // na.o
        public final void a() {
        }

        @Override // na.o
        public final n<Uri, DataT> c(r rVar) {
            return new d(this.f42335a, rVar.d(File.class, this.f42336b), rVar.d(Uri.class, this.f42336b), this.f42336b);
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends a<ParcelFileDescriptor> {
        public b(Context context) {
            super(context, ParcelFileDescriptor.class);
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends a<InputStream> {
        public c(Context context) {
            super(context, InputStream.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: oa.d$d  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0841d<DataT> implements com.bumptech.glide.load.data.d<DataT> {

        /* renamed from: k  reason: collision with root package name */
        private static final String[] f42337k = {"_data"};

        /* renamed from: a  reason: collision with root package name */
        private final Context f42338a;

        /* renamed from: b  reason: collision with root package name */
        private final n<File, DataT> f42339b;

        /* renamed from: c  reason: collision with root package name */
        private final n<Uri, DataT> f42340c;

        /* renamed from: d  reason: collision with root package name */
        private final Uri f42341d;

        /* renamed from: e  reason: collision with root package name */
        private final int f42342e;

        /* renamed from: f  reason: collision with root package name */
        private final int f42343f;

        /* renamed from: g  reason: collision with root package name */
        private final ha.e f42344g;

        /* renamed from: h  reason: collision with root package name */
        private final Class<DataT> f42345h;

        /* renamed from: i  reason: collision with root package name */
        private volatile boolean f42346i;

        /* renamed from: j  reason: collision with root package name */
        private volatile com.bumptech.glide.load.data.d<DataT> f42347j;

        C0841d(Context context, n<File, DataT> nVar, n<Uri, DataT> nVar2, Uri uri, int i11, int i12, ha.e eVar, Class<DataT> cls) {
            this.f42338a = context.getApplicationContext();
            this.f42339b = nVar;
            this.f42340c = nVar2;
            this.f42341d = uri;
            this.f42342e = i11;
            this.f42343f = i12;
            this.f42344g = eVar;
            this.f42345h = cls;
        }

        private n.a<DataT> b() {
            if (Environment.isExternalStorageLegacy()) {
                return this.f42339b.b(g(this.f42341d), this.f42342e, this.f42343f, this.f42344g);
            }
            return this.f42340c.b(f() ? MediaStore.setRequireOriginal(this.f42341d) : this.f42341d, this.f42342e, this.f42343f, this.f42344g);
        }

        private com.bumptech.glide.load.data.d<DataT> e() {
            n.a<DataT> b11 = b();
            if (b11 != null) {
                return b11.f40735c;
            }
            return null;
        }

        private boolean f() {
            return this.f42338a.checkSelfPermission("android.permission.ACCESS_MEDIA_LOCATION") == 0;
        }

        private File g(Uri uri) {
            Cursor cursor = null;
            try {
                Cursor query = this.f42338a.getContentResolver().query(uri, f42337k, null, null, null);
                if (query != null && query.moveToFirst()) {
                    String string = query.getString(query.getColumnIndexOrThrow("_data"));
                    if (!TextUtils.isEmpty(string)) {
                        File file = new File(string);
                        query.close();
                        return file;
                    }
                    throw new FileNotFoundException("File path was empty in media store for: " + uri);
                }
                throw new FileNotFoundException("Failed to media store entry for: " + uri);
            } catch (Throwable th2) {
                if (0 != 0) {
                    cursor.close();
                }
                throw th2;
            }
        }

        @Override // com.bumptech.glide.load.data.d
        public Class<DataT> a() {
            return this.f42345h;
        }

        @Override // com.bumptech.glide.load.data.d
        public com.bumptech.glide.load.a c() {
            return com.bumptech.glide.load.a.LOCAL;
        }

        @Override // com.bumptech.glide.load.data.d
        public void cancel() {
            this.f42346i = true;
            com.bumptech.glide.load.data.d<DataT> dVar = this.f42347j;
            if (dVar != null) {
                dVar.cancel();
            }
        }

        @Override // com.bumptech.glide.load.data.d
        public void cleanup() {
            com.bumptech.glide.load.data.d<DataT> dVar = this.f42347j;
            if (dVar != null) {
                dVar.cleanup();
            }
        }

        @Override // com.bumptech.glide.load.data.d
        public void d(h hVar, d.a<? super DataT> aVar) {
            try {
                com.bumptech.glide.load.data.d<DataT> e11 = e();
                if (e11 == null) {
                    aVar.b(new IllegalArgumentException("Failed to build fetcher for: " + this.f42341d));
                    return;
                }
                this.f42347j = e11;
                if (this.f42346i) {
                    cancel();
                } else {
                    e11.d(hVar, aVar);
                }
            } catch (FileNotFoundException e12) {
                aVar.b(e12);
            }
        }
    }

    d(Context context, n<File, DataT> nVar, n<Uri, DataT> nVar2, Class<DataT> cls) {
        this.f42331a = context.getApplicationContext();
        this.f42332b = nVar;
        this.f42333c = nVar2;
        this.f42334d = cls;
    }

    @Override // na.n
    /* renamed from: c */
    public n.a<DataT> b(Uri uri, int i11, int i12, ha.e eVar) {
        return new n.a<>(new ab.d(uri), new C0841d(this.f42331a, this.f42332b, this.f42333c, uri, i11, i12, eVar, this.f42334d));
    }

    @Override // na.n
    /* renamed from: d */
    public boolean a(Uri uri) {
        return Build.VERSION.SDK_INT >= 29 && ia.b.b(uri);
    }
}