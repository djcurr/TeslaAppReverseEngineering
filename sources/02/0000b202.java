package s3;

import android.content.Context;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Handler;
import v3.h;

/* loaded from: classes.dex */
public class f {

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private final int f50222a;

        /* renamed from: b  reason: collision with root package name */
        private final b[] f50223b;

        @Deprecated
        public a(int i11, b[] bVarArr) {
            this.f50222a = i11;
            this.f50223b = bVarArr;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public static a a(int i11, b[] bVarArr) {
            return new a(i11, bVarArr);
        }

        public b[] b() {
            return this.f50223b;
        }

        public int c() {
            return this.f50222a;
        }
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        private final Uri f50224a;

        /* renamed from: b  reason: collision with root package name */
        private final int f50225b;

        /* renamed from: c  reason: collision with root package name */
        private final int f50226c;

        /* renamed from: d  reason: collision with root package name */
        private final boolean f50227d;

        /* renamed from: e  reason: collision with root package name */
        private final int f50228e;

        @Deprecated
        public b(Uri uri, int i11, int i12, boolean z11, int i13) {
            this.f50224a = (Uri) h.f(uri);
            this.f50225b = i11;
            this.f50226c = i12;
            this.f50227d = z11;
            this.f50228e = i13;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public static b a(Uri uri, int i11, int i12, boolean z11, int i13) {
            return new b(uri, i11, i12, z11, i13);
        }

        public int b() {
            return this.f50228e;
        }

        public int c() {
            return this.f50225b;
        }

        public Uri d() {
            return this.f50224a;
        }

        public int e() {
            return this.f50226c;
        }

        public boolean f() {
            return this.f50227d;
        }
    }

    /* loaded from: classes.dex */
    public static class c {
        public void a(int i11) {
            throw null;
        }

        public void b(Typeface typeface) {
            throw null;
        }
    }

    public static Typeface a(Context context, d dVar, int i11, boolean z11, int i12, Handler handler, c cVar) {
        s3.a aVar = new s3.a(cVar, handler);
        if (z11) {
            return e.e(context, dVar, aVar, i11, i12);
        }
        return e.d(context, dVar, i11, null, aVar);
    }
}