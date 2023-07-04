package com.canhub.cropper;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.AsyncTask;
import android.util.DisplayMetrics;
import com.canhub.cropper.c;
import java.lang.ref.WeakReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class b extends AsyncTask<Void, Void, a> {

    /* renamed from: a  reason: collision with root package name */
    private final WeakReference<CropImageView> f10958a;

    /* renamed from: b  reason: collision with root package name */
    private final Uri f10959b;

    /* renamed from: c  reason: collision with root package name */
    private final Context f10960c;

    /* renamed from: d  reason: collision with root package name */
    private final int f10961d;

    /* renamed from: e  reason: collision with root package name */
    private final int f10962e;

    public b(CropImageView cropImageView, Uri uri) {
        this.f10959b = uri;
        this.f10958a = new WeakReference<>(cropImageView);
        this.f10960c = cropImageView.getContext();
        DisplayMetrics displayMetrics = cropImageView.getResources().getDisplayMetrics();
        float f11 = displayMetrics.density;
        double d11 = f11 > 1.0f ? 1.0f / f11 : 1.0d;
        this.f10961d = (int) (displayMetrics.widthPixels * d11);
        this.f10962e = (int) (displayMetrics.heightPixels * d11);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: a */
    public a doInBackground(Void... voidArr) {
        try {
            if (isCancelled()) {
                return null;
            }
            c.a l11 = c.l(this.f10960c, this.f10959b, this.f10961d, this.f10962e);
            if (isCancelled()) {
                return null;
            }
            c.b A = c.A(l11.f10975a, this.f10960c, this.f10959b);
            return new a(this.f10959b, A.f10977a, l11.f10976b, A.f10978b);
        } catch (Exception e11) {
            return new a(this.f10959b, e11);
        }
    }

    public Uri b() {
        return this.f10959b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: c */
    public void onPostExecute(a aVar) {
        Bitmap bitmap;
        CropImageView cropImageView;
        if (aVar != null) {
            boolean z11 = false;
            if (!isCancelled() && (cropImageView = this.f10958a.get()) != null) {
                z11 = true;
                cropImageView.n(aVar);
            }
            if (z11 || (bitmap = aVar.f10964b) == null) {
                return;
            }
            bitmap.recycle();
        }
    }

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final Uri f10963a;

        /* renamed from: b  reason: collision with root package name */
        public final Bitmap f10964b;

        /* renamed from: c  reason: collision with root package name */
        public final int f10965c;

        /* renamed from: d  reason: collision with root package name */
        public final int f10966d;

        /* renamed from: e  reason: collision with root package name */
        public final Exception f10967e;

        a(Uri uri, Bitmap bitmap, int i11, int i12) {
            this.f10963a = uri;
            this.f10964b = bitmap;
            this.f10965c = i11;
            this.f10966d = i12;
            this.f10967e = null;
        }

        a(Uri uri, Exception exc) {
            this.f10963a = uri;
            this.f10964b = null;
            this.f10965c = 0;
            this.f10966d = 0;
            this.f10967e = exc;
        }
    }
}