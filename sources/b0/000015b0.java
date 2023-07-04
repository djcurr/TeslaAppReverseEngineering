package com.canhub.cropper;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.AsyncTask;
import com.canhub.cropper.CropImageView;
import com.canhub.cropper.c;
import java.lang.ref.WeakReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class a extends AsyncTask<Void, Void, C0205a> {

    /* renamed from: a  reason: collision with root package name */
    private final WeakReference<CropImageView> f10935a;

    /* renamed from: b  reason: collision with root package name */
    private final Bitmap f10936b;

    /* renamed from: c  reason: collision with root package name */
    private final Uri f10937c;

    /* renamed from: d  reason: collision with root package name */
    private final Context f10938d;

    /* renamed from: e  reason: collision with root package name */
    private final float[] f10939e;

    /* renamed from: f  reason: collision with root package name */
    private final int f10940f;

    /* renamed from: g  reason: collision with root package name */
    private final int f10941g;

    /* renamed from: h  reason: collision with root package name */
    private final int f10942h;

    /* renamed from: i  reason: collision with root package name */
    private final boolean f10943i;

    /* renamed from: j  reason: collision with root package name */
    private final int f10944j;

    /* renamed from: k  reason: collision with root package name */
    private final int f10945k;

    /* renamed from: l  reason: collision with root package name */
    private final int f10946l;

    /* renamed from: m  reason: collision with root package name */
    private final int f10947m;

    /* renamed from: n  reason: collision with root package name */
    private final boolean f10948n;

    /* renamed from: o  reason: collision with root package name */
    private final boolean f10949o;

    /* renamed from: p  reason: collision with root package name */
    private final CropImageView.j f10950p;

    /* renamed from: q  reason: collision with root package name */
    private final Uri f10951q;

    /* renamed from: r  reason: collision with root package name */
    private final Bitmap.CompressFormat f10952r;

    /* renamed from: s  reason: collision with root package name */
    private final int f10953s;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(CropImageView cropImageView, Bitmap bitmap, float[] fArr, int i11, boolean z11, int i12, int i13, int i14, int i15, boolean z12, boolean z13, CropImageView.j jVar, Uri uri, Bitmap.CompressFormat compressFormat, int i16) {
        this.f10935a = new WeakReference<>(cropImageView);
        this.f10938d = cropImageView.getContext();
        this.f10936b = bitmap;
        this.f10939e = fArr;
        this.f10937c = null;
        this.f10940f = i11;
        this.f10943i = z11;
        this.f10944j = i12;
        this.f10945k = i13;
        this.f10946l = i14;
        this.f10947m = i15;
        this.f10948n = z12;
        this.f10949o = z13;
        this.f10950p = jVar;
        this.f10951q = uri;
        this.f10952r = compressFormat;
        this.f10953s = i16;
        this.f10941g = 0;
        this.f10942h = 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: a */
    public C0205a doInBackground(Void... voidArr) {
        c.a g11;
        try {
            if (isCancelled()) {
                return null;
            }
            Uri uri = this.f10937c;
            if (uri != null) {
                g11 = c.d(this.f10938d, uri, this.f10939e, this.f10940f, this.f10941g, this.f10942h, this.f10943i, this.f10944j, this.f10945k, this.f10946l, this.f10947m, this.f10948n, this.f10949o);
            } else {
                Bitmap bitmap = this.f10936b;
                if (bitmap != null) {
                    g11 = c.g(bitmap, this.f10939e, this.f10940f, this.f10943i, this.f10944j, this.f10945k, this.f10948n, this.f10949o);
                } else {
                    return new C0205a((Bitmap) null, 1);
                }
            }
            Bitmap y11 = c.y(g11.f10975a, this.f10946l, this.f10947m, this.f10950p);
            Uri uri2 = this.f10951q;
            if (uri2 == null) {
                return new C0205a(y11, g11.f10976b);
            }
            c.C(this.f10938d, y11, uri2, this.f10952r, this.f10953s);
            if (y11 != null) {
                y11.recycle();
            }
            return new C0205a(this.f10951q, g11.f10976b);
        } catch (Exception e11) {
            return new C0205a(e11, this.f10951q != null);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: b */
    public void onPostExecute(C0205a c0205a) {
        Bitmap bitmap;
        CropImageView cropImageView;
        if (c0205a != null) {
            boolean z11 = false;
            if (!isCancelled() && (cropImageView = this.f10935a.get()) != null) {
                z11 = true;
                cropImageView.m(c0205a);
            }
            if (z11 || (bitmap = c0205a.f10954a) == null) {
                return;
            }
            bitmap.recycle();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.canhub.cropper.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0205a {

        /* renamed from: a  reason: collision with root package name */
        public final Bitmap f10954a;

        /* renamed from: b  reason: collision with root package name */
        public final Uri f10955b;

        /* renamed from: c  reason: collision with root package name */
        final Exception f10956c;

        /* renamed from: d  reason: collision with root package name */
        final int f10957d;

        C0205a(Bitmap bitmap, int i11) {
            this.f10954a = bitmap;
            this.f10955b = null;
            this.f10956c = null;
            this.f10957d = i11;
        }

        C0205a(Uri uri, int i11) {
            this.f10954a = null;
            this.f10955b = uri;
            this.f10956c = null;
            this.f10957d = i11;
        }

        C0205a(Exception exc, boolean z11) {
            this.f10954a = null;
            this.f10955b = null;
            this.f10956c = exc;
            this.f10957d = 1;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(CropImageView cropImageView, Uri uri, float[] fArr, int i11, int i12, int i13, boolean z11, int i14, int i15, int i16, int i17, boolean z12, boolean z13, CropImageView.j jVar, Uri uri2, Bitmap.CompressFormat compressFormat, int i18) {
        this.f10935a = new WeakReference<>(cropImageView);
        this.f10938d = cropImageView.getContext();
        this.f10937c = uri;
        this.f10939e = fArr;
        this.f10940f = i11;
        this.f10943i = z11;
        this.f10944j = i14;
        this.f10945k = i15;
        this.f10941g = i12;
        this.f10942h = i13;
        this.f10946l = i16;
        this.f10947m = i17;
        this.f10948n = z12;
        this.f10949o = z13;
        this.f10950p = jVar;
        this.f10951q = uri2;
        this.f10952r = compressFormat;
        this.f10953s = i18;
        this.f10936b = null;
    }
}