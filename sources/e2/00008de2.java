package oa;

import android.content.Context;
import android.net.Uri;
import com.bumptech.glide.load.resource.bitmap.b0;
import java.io.InputStream;
import na.n;
import na.o;
import na.r;

/* loaded from: classes.dex */
public class c implements n<Uri, InputStream> {

    /* renamed from: a  reason: collision with root package name */
    private final Context f42329a;

    /* loaded from: classes.dex */
    public static class a implements o<Uri, InputStream> {

        /* renamed from: a  reason: collision with root package name */
        private final Context f42330a;

        public a(Context context) {
            this.f42330a = context;
        }

        @Override // na.o
        public void a() {
        }

        @Override // na.o
        public n<Uri, InputStream> c(r rVar) {
            return new c(this.f42330a);
        }
    }

    public c(Context context) {
        this.f42329a = context.getApplicationContext();
    }

    private boolean e(ha.e eVar) {
        Long l11 = (Long) eVar.c(b0.f10744d);
        return l11 != null && l11.longValue() == -1;
    }

    @Override // na.n
    /* renamed from: c */
    public n.a<InputStream> b(Uri uri, int i11, int i12, ha.e eVar) {
        if (ia.b.d(i11, i12) && e(eVar)) {
            return new n.a<>(new ab.d(uri), ia.c.f(this.f42329a, uri));
        }
        return null;
    }

    @Override // na.n
    /* renamed from: d */
    public boolean a(Uri uri) {
        return ia.b.c(uri);
    }
}