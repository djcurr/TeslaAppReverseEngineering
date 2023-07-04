package w5;

import android.content.Context;
import android.net.Uri;
import android.webkit.MimeTypeMap;
import ch.qos.logback.core.joran.action.Action;
import java.io.InputStream;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import okio.r;
import wz.e0;

/* loaded from: classes.dex */
public final class a implements g<Uri> {

    /* renamed from: a  reason: collision with root package name */
    private final Context f55605a;

    /* renamed from: w5.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C1267a {
        private C1267a() {
        }

        public /* synthetic */ C1267a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new C1267a(null);
    }

    public a(Context context) {
        s.g(context, "context");
        this.f55605a = context;
    }

    @Override // w5.g
    /* renamed from: d */
    public Object c(t5.b bVar, Uri uri, c6.g gVar, v5.j jVar, zz.d<? super f> dVar) {
        List V;
        String l02;
        List<String> pathSegments = uri.getPathSegments();
        s.f(pathSegments, "data.pathSegments");
        V = e0.V(pathSegments, 1);
        l02 = e0.l0(V, "/", null, null, 0, null, null, 62, null);
        InputStream open = this.f55605a.getAssets().open(l02);
        s.f(open, "context.assets.open(path)");
        okio.h d11 = r.d(r.k(open));
        MimeTypeMap singleton = MimeTypeMap.getSingleton();
        s.f(singleton, "MimeTypeMap.getSingleton()");
        return new m(d11, g6.e.e(singleton, l02), v5.b.DISK);
    }

    @Override // w5.g
    /* renamed from: e */
    public boolean a(Uri data) {
        s.g(data, "data");
        return s.c(data.getScheme(), Action.FILE_ATTRIBUTE) && s.c(g6.e.c(data), "android_asset");
    }

    @Override // w5.g
    /* renamed from: f */
    public String b(Uri data) {
        s.g(data, "data");
        String uri = data.toString();
        s.f(uri, "data.toString()");
        return uri;
    }
}