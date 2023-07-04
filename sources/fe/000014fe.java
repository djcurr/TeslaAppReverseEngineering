package com.bumptech.glide.load;

import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import com.bumptech.glide.load.resource.bitmap.w;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: classes.dex */
public final class d {

    /* loaded from: classes.dex */
    class a implements g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ InputStream f10495a;

        a(InputStream inputStream) {
            this.f10495a = inputStream;
        }

        @Override // com.bumptech.glide.load.d.g
        public ImageHeaderParser.ImageType a(ImageHeaderParser imageHeaderParser) {
            try {
                return imageHeaderParser.b(this.f10495a);
            } finally {
                this.f10495a.reset();
            }
        }
    }

    /* loaded from: classes.dex */
    class b implements g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ByteBuffer f10496a;

        b(ByteBuffer byteBuffer) {
            this.f10496a = byteBuffer;
        }

        @Override // com.bumptech.glide.load.d.g
        public ImageHeaderParser.ImageType a(ImageHeaderParser imageHeaderParser) {
            return imageHeaderParser.a(this.f10496a);
        }
    }

    /* loaded from: classes.dex */
    class c implements g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ParcelFileDescriptorRewinder f10497a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ka.b f10498b;

        c(ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, ka.b bVar) {
            this.f10497a = parcelFileDescriptorRewinder;
            this.f10498b = bVar;
        }

        @Override // com.bumptech.glide.load.d.g
        public ImageHeaderParser.ImageType a(ImageHeaderParser imageHeaderParser) {
            w wVar;
            w wVar2 = null;
            try {
                wVar = new w(new FileInputStream(this.f10497a.a().getFileDescriptor()), this.f10498b);
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                ImageHeaderParser.ImageType b11 = imageHeaderParser.b(wVar);
                try {
                    wVar.close();
                } catch (IOException unused) {
                }
                this.f10497a.a();
                return b11;
            } catch (Throwable th3) {
                th = th3;
                wVar2 = wVar;
                if (wVar2 != null) {
                    try {
                        wVar2.close();
                    } catch (IOException unused2) {
                    }
                }
                this.f10497a.a();
                throw th;
            }
        }
    }

    /* renamed from: com.bumptech.glide.load.d$d  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    class C0200d implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ InputStream f10499a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ka.b f10500b;

        C0200d(InputStream inputStream, ka.b bVar) {
            this.f10499a = inputStream;
            this.f10500b = bVar;
        }

        @Override // com.bumptech.glide.load.d.f
        public int a(ImageHeaderParser imageHeaderParser) {
            try {
                return imageHeaderParser.c(this.f10499a, this.f10500b);
            } finally {
                this.f10499a.reset();
            }
        }
    }

    /* loaded from: classes.dex */
    class e implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ParcelFileDescriptorRewinder f10501a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ka.b f10502b;

        e(ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, ka.b bVar) {
            this.f10501a = parcelFileDescriptorRewinder;
            this.f10502b = bVar;
        }

        @Override // com.bumptech.glide.load.d.f
        public int a(ImageHeaderParser imageHeaderParser) {
            w wVar;
            w wVar2 = null;
            try {
                wVar = new w(new FileInputStream(this.f10501a.a().getFileDescriptor()), this.f10502b);
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                int c11 = imageHeaderParser.c(wVar, this.f10502b);
                try {
                    wVar.close();
                } catch (IOException unused) {
                }
                this.f10501a.a();
                return c11;
            } catch (Throwable th3) {
                th = th3;
                wVar2 = wVar;
                if (wVar2 != null) {
                    try {
                        wVar2.close();
                    } catch (IOException unused2) {
                    }
                }
                this.f10501a.a();
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public interface f {
        int a(ImageHeaderParser imageHeaderParser);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public interface g {
        ImageHeaderParser.ImageType a(ImageHeaderParser imageHeaderParser);
    }

    public static int a(List<ImageHeaderParser> list, ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, ka.b bVar) {
        return c(list, new e(parcelFileDescriptorRewinder, bVar));
    }

    public static int b(List<ImageHeaderParser> list, InputStream inputStream, ka.b bVar) {
        if (inputStream == null) {
            return -1;
        }
        if (!inputStream.markSupported()) {
            inputStream = new w(inputStream, bVar);
        }
        inputStream.mark(5242880);
        return c(list, new C0200d(inputStream, bVar));
    }

    private static int c(List<ImageHeaderParser> list, f fVar) {
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            int a11 = fVar.a(list.get(i11));
            if (a11 != -1) {
                return a11;
            }
        }
        return -1;
    }

    public static ImageHeaderParser.ImageType d(List<ImageHeaderParser> list, ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, ka.b bVar) {
        return g(list, new c(parcelFileDescriptorRewinder, bVar));
    }

    public static ImageHeaderParser.ImageType e(List<ImageHeaderParser> list, InputStream inputStream, ka.b bVar) {
        if (inputStream == null) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
        if (!inputStream.markSupported()) {
            inputStream = new w(inputStream, bVar);
        }
        inputStream.mark(5242880);
        return g(list, new a(inputStream));
    }

    public static ImageHeaderParser.ImageType f(List<ImageHeaderParser> list, ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
        return g(list, new b(byteBuffer));
    }

    private static ImageHeaderParser.ImageType g(List<ImageHeaderParser> list, g gVar) {
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            ImageHeaderParser.ImageType a11 = gVar.a(list.get(i11));
            if (a11 != ImageHeaderParser.ImageType.UNKNOWN) {
                return a11;
            }
        }
        return ImageHeaderParser.ImageType.UNKNOWN;
    }
}