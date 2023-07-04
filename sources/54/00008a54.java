package na;

import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import java.io.File;
import java.io.InputStream;
import na.n;

/* loaded from: classes.dex */
public class u<Data> implements n<String, Data> {

    /* renamed from: a  reason: collision with root package name */
    private final n<Uri, Data> f40765a;

    /* loaded from: classes.dex */
    public static final class a implements o<String, AssetFileDescriptor> {
        @Override // na.o
        public void a() {
        }

        @Override // na.o
        public n<String, AssetFileDescriptor> c(r rVar) {
            return new u(rVar.d(Uri.class, AssetFileDescriptor.class));
        }
    }

    /* loaded from: classes.dex */
    public static class b implements o<String, ParcelFileDescriptor> {
        @Override // na.o
        public void a() {
        }

        @Override // na.o
        public n<String, ParcelFileDescriptor> c(r rVar) {
            return new u(rVar.d(Uri.class, ParcelFileDescriptor.class));
        }
    }

    /* loaded from: classes.dex */
    public static class c implements o<String, InputStream> {
        @Override // na.o
        public void a() {
        }

        @Override // na.o
        public n<String, InputStream> c(r rVar) {
            return new u(rVar.d(Uri.class, InputStream.class));
        }
    }

    public u(n<Uri, Data> nVar) {
        this.f40765a = nVar;
    }

    private static Uri e(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.charAt(0) == '/') {
            return f(str);
        }
        Uri parse = Uri.parse(str);
        return parse.getScheme() == null ? f(str) : parse;
    }

    private static Uri f(String str) {
        return Uri.fromFile(new File(str));
    }

    @Override // na.n
    /* renamed from: c */
    public n.a<Data> b(String str, int i11, int i12, ha.e eVar) {
        Uri e11 = e(str);
        if (e11 == null || !this.f40765a.a(e11)) {
            return null;
        }
        return this.f40765a.b(e11, i11, i12, eVar);
    }

    @Override // na.n
    /* renamed from: d */
    public boolean a(String str) {
        return true;
    }
}