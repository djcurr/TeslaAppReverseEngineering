package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import java.io.InputStream;
import java.util.List;

/* loaded from: classes.dex */
interface s {

    /* loaded from: classes.dex */
    public static final class a implements s {

        /* renamed from: a  reason: collision with root package name */
        private final com.bumptech.glide.load.data.k f10799a;

        /* renamed from: b  reason: collision with root package name */
        private final ka.b f10800b;

        /* renamed from: c  reason: collision with root package name */
        private final List<ImageHeaderParser> f10801c;

        /* JADX INFO: Access modifiers changed from: package-private */
        public a(InputStream inputStream, List<ImageHeaderParser> list, ka.b bVar) {
            this.f10800b = (ka.b) bb.j.d(bVar);
            this.f10801c = (List) bb.j.d(list);
            this.f10799a = new com.bumptech.glide.load.data.k(inputStream, bVar);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.s
        public Bitmap a(BitmapFactory.Options options) {
            return BitmapFactory.decodeStream(this.f10799a.a(), null, options);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.s
        public void b() {
            this.f10799a.b();
        }

        @Override // com.bumptech.glide.load.resource.bitmap.s
        public int c() {
            return com.bumptech.glide.load.d.b(this.f10801c, this.f10799a.a(), this.f10800b);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.s
        public ImageHeaderParser.ImageType d() {
            return com.bumptech.glide.load.d.e(this.f10801c, this.f10799a.a(), this.f10800b);
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements s {

        /* renamed from: a  reason: collision with root package name */
        private final ka.b f10802a;

        /* renamed from: b  reason: collision with root package name */
        private final List<ImageHeaderParser> f10803b;

        /* renamed from: c  reason: collision with root package name */
        private final ParcelFileDescriptorRewinder f10804c;

        /* JADX INFO: Access modifiers changed from: package-private */
        public b(ParcelFileDescriptor parcelFileDescriptor, List<ImageHeaderParser> list, ka.b bVar) {
            this.f10802a = (ka.b) bb.j.d(bVar);
            this.f10803b = (List) bb.j.d(list);
            this.f10804c = new ParcelFileDescriptorRewinder(parcelFileDescriptor);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.s
        public Bitmap a(BitmapFactory.Options options) {
            return BitmapFactory.decodeFileDescriptor(this.f10804c.a().getFileDescriptor(), null, options);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.s
        public void b() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.s
        public int c() {
            return com.bumptech.glide.load.d.a(this.f10803b, this.f10804c, this.f10802a);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.s
        public ImageHeaderParser.ImageType d() {
            return com.bumptech.glide.load.d.d(this.f10803b, this.f10804c, this.f10802a);
        }
    }

    Bitmap a(BitmapFactory.Options options);

    void b();

    int c();

    ImageHeaderParser.ImageType d();
}