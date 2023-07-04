package oa;

import android.content.Context;
import android.net.Uri;
import java.io.InputStream;
import na.n;
import na.o;
import na.r;

/* loaded from: classes.dex */
public class b implements n<Uri, InputStream> {

    /* renamed from: a  reason: collision with root package name */
    private final Context f42327a;

    /* loaded from: classes.dex */
    public static class a implements o<Uri, InputStream> {

        /* renamed from: a  reason: collision with root package name */
        private final Context f42328a;

        public a(Context context) {
            this.f42328a = context;
        }

        @Override // na.o
        public void a() {
        }

        @Override // na.o
        public n<Uri, InputStream> c(r rVar) {
            return new b(this.f42328a);
        }
    }

    public b(Context context) {
        this.f42327a = context.getApplicationContext();
    }

    @Override // na.n
    /* renamed from: c */
    public n.a<InputStream> b(Uri uri, int i11, int i12, ha.e eVar) {
        if (ia.b.d(i11, i12)) {
            return new n.a<>(new ab.d(uri), ia.c.e(this.f42327a, uri));
        }
        return null;
    }

    @Override // na.n
    /* renamed from: d */
    public boolean a(Uri uri) {
        return ia.b.a(uri);
    }
}