package com.squareup.picasso;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.NetworkInfo;
import com.squareup.picasso.t;
import okio.e0;

/* loaded from: classes2.dex */
public abstract class y {

    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final t.e f20826a;

        /* renamed from: b  reason: collision with root package name */
        private final Bitmap f20827b;

        /* renamed from: c  reason: collision with root package name */
        private final e0 f20828c;

        /* renamed from: d  reason: collision with root package name */
        private final int f20829d;

        public a(Bitmap bitmap, t.e eVar) {
            this((Bitmap) d0.d(bitmap, "bitmap == null"), null, eVar, 0);
        }

        public Bitmap a() {
            return this.f20827b;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public int b() {
            return this.f20829d;
        }

        public t.e c() {
            return this.f20826a;
        }

        public e0 d() {
            return this.f20828c;
        }

        public a(e0 e0Var, t.e eVar) {
            this(null, (e0) d0.d(e0Var, "source == null"), eVar, 0);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public a(Bitmap bitmap, e0 e0Var, t.e eVar, int i11) {
            if ((bitmap != null) != (e0Var != null)) {
                this.f20827b = bitmap;
                this.f20828c = e0Var;
                this.f20826a = (t.e) d0.d(eVar, "loadedFrom == null");
                this.f20829d = i11;
                return;
            }
            throw new AssertionError();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(int i11, int i12, int i13, int i14, BitmapFactory.Options options, w wVar) {
        int min;
        double floor;
        if (i14 > i12 || i13 > i11) {
            if (i12 == 0) {
                floor = Math.floor(i13 / i11);
            } else if (i11 == 0) {
                floor = Math.floor(i14 / i12);
            } else {
                int floor2 = (int) Math.floor(i14 / i12);
                int floor3 = (int) Math.floor(i13 / i11);
                if (wVar.f20787l) {
                    min = Math.max(floor2, floor3);
                } else {
                    min = Math.min(floor2, floor3);
                }
            }
            min = (int) floor;
        } else {
            min = 1;
        }
        options.inSampleSize = min;
        options.inJustDecodeBounds = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void b(int i11, int i12, BitmapFactory.Options options, w wVar) {
        a(i11, i12, options.outWidth, options.outHeight, options, wVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static BitmapFactory.Options d(w wVar) {
        boolean c11 = wVar.c();
        boolean z11 = wVar.f20794s != null;
        BitmapFactory.Options options = null;
        if (c11 || z11 || wVar.f20793r) {
            options = new BitmapFactory.Options();
            options.inJustDecodeBounds = c11;
            boolean z12 = wVar.f20793r;
            options.inInputShareable = z12;
            options.inPurgeable = z12;
            if (z11) {
                options.inPreferredConfig = wVar.f20794s;
            }
        }
        return options;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean g(BitmapFactory.Options options) {
        return options != null && options.inJustDecodeBounds;
    }

    public abstract boolean c(w wVar);

    /* JADX INFO: Access modifiers changed from: package-private */
    public int e() {
        return 0;
    }

    public abstract a f(w wVar, int i11);

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean h(boolean z11, NetworkInfo networkInfo) {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean i() {
        return false;
    }
}