package na;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import ch.qos.logback.core.joran.action.Action;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import na.n;

/* loaded from: classes.dex */
public class w<Data> implements n<Uri, Data> {

    /* renamed from: b  reason: collision with root package name */
    private static final Set<String> f40769b = Collections.unmodifiableSet(new HashSet(Arrays.asList(Action.FILE_ATTRIBUTE, "android.resource", "content")));

    /* renamed from: a  reason: collision with root package name */
    private final c<Data> f40770a;

    /* loaded from: classes.dex */
    public static final class a implements o<Uri, AssetFileDescriptor>, c<AssetFileDescriptor> {

        /* renamed from: a  reason: collision with root package name */
        private final ContentResolver f40771a;

        public a(ContentResolver contentResolver) {
            this.f40771a = contentResolver;
        }

        @Override // na.o
        public void a() {
        }

        @Override // na.w.c
        public com.bumptech.glide.load.data.d<AssetFileDescriptor> b(Uri uri) {
            return new com.bumptech.glide.load.data.a(this.f40771a, uri);
        }

        @Override // na.o
        public n<Uri, AssetFileDescriptor> c(r rVar) {
            return new w(this);
        }
    }

    /* loaded from: classes.dex */
    public static class b implements o<Uri, ParcelFileDescriptor>, c<ParcelFileDescriptor> {

        /* renamed from: a  reason: collision with root package name */
        private final ContentResolver f40772a;

        public b(ContentResolver contentResolver) {
            this.f40772a = contentResolver;
        }

        @Override // na.o
        public void a() {
        }

        @Override // na.w.c
        public com.bumptech.glide.load.data.d<ParcelFileDescriptor> b(Uri uri) {
            return new com.bumptech.glide.load.data.i(this.f40772a, uri);
        }

        @Override // na.o
        public n<Uri, ParcelFileDescriptor> c(r rVar) {
            return new w(this);
        }
    }

    /* loaded from: classes.dex */
    public interface c<Data> {
        com.bumptech.glide.load.data.d<Data> b(Uri uri);
    }

    /* loaded from: classes.dex */
    public static class d implements o<Uri, InputStream>, c<InputStream> {

        /* renamed from: a  reason: collision with root package name */
        private final ContentResolver f40773a;

        public d(ContentResolver contentResolver) {
            this.f40773a = contentResolver;
        }

        @Override // na.o
        public void a() {
        }

        @Override // na.w.c
        public com.bumptech.glide.load.data.d<InputStream> b(Uri uri) {
            return new com.bumptech.glide.load.data.n(this.f40773a, uri);
        }

        @Override // na.o
        public n<Uri, InputStream> c(r rVar) {
            return new w(this);
        }
    }

    public w(c<Data> cVar) {
        this.f40770a = cVar;
    }

    @Override // na.n
    /* renamed from: c */
    public n.a<Data> b(Uri uri, int i11, int i12, ha.e eVar) {
        return new n.a<>(new ab.d(uri), this.f40770a.b(uri));
    }

    @Override // na.n
    /* renamed from: d */
    public boolean a(Uri uri) {
        return f40769b.contains(uri.getScheme());
    }
}