package com.facebook.imagepipeline.producers;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.media.ExifInterface;
import android.net.Uri;
import android.os.Build;
import android.util.Pair;
import com.facebook.common.memory.PooledByteBuffer;
import com.google.android.gms.common.internal.ImagesContract;
import expo.modules.imagepicker.ImagePickerConstants;
import java.io.File;
import java.io.FileDescriptor;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public class LocalExifThumbnailProducer implements d1<nf.e> {

    /* renamed from: a  reason: collision with root package name */
    private final Executor f11314a;

    /* renamed from: b  reason: collision with root package name */
    private final pd.g f11315b;

    /* renamed from: c  reason: collision with root package name */
    private final ContentResolver f11316c;

    /* JADX INFO: Access modifiers changed from: private */
    @com.facebook.soloader.e
    /* loaded from: classes3.dex */
    public class Api24Utils {
        private Api24Utils(LocalExifThumbnailProducer localExifThumbnailProducer) {
        }

        ExifInterface a(FileDescriptor fileDescriptor) {
            if (Build.VERSION.SDK_INT >= 24) {
                return new ExifInterface(fileDescriptor);
            }
            return null;
        }

        /* synthetic */ Api24Utils(LocalExifThumbnailProducer localExifThumbnailProducer, a aVar) {
            this(localExifThumbnailProducer);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class a extends w0<nf.e> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ com.facebook.imagepipeline.request.a f11317f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(l lVar, r0 r0Var, p0 p0Var, String str, com.facebook.imagepipeline.request.a aVar) {
            super(lVar, r0Var, p0Var, str);
            this.f11317f = aVar;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // kd.g
        /* renamed from: j */
        public void b(nf.e eVar) {
            nf.e.j(eVar);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.imagepipeline.producers.w0
        /* renamed from: k */
        public Map<String, String> i(nf.e eVar) {
            return md.g.of("createdThumbnail", Boolean.toString(eVar != null));
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // kd.g
        /* renamed from: l */
        public nf.e c() {
            ExifInterface g11 = LocalExifThumbnailProducer.this.g(this.f11317f.s());
            if (g11 == null || !g11.hasThumbnail()) {
                return null;
            }
            return LocalExifThumbnailProducer.this.e(LocalExifThumbnailProducer.this.f11315b.d((byte[]) md.k.g(g11.getThumbnail())), g11);
        }
    }

    /* loaded from: classes3.dex */
    class b extends e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ w0 f11319a;

        b(LocalExifThumbnailProducer localExifThumbnailProducer, w0 w0Var) {
            this.f11319a = w0Var;
        }

        @Override // com.facebook.imagepipeline.producers.q0
        public void b() {
            this.f11319a.a();
        }
    }

    public LocalExifThumbnailProducer(Executor executor, pd.g gVar, ContentResolver contentResolver) {
        this.f11314a = executor;
        this.f11315b = gVar;
        this.f11316c = contentResolver;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public nf.e e(PooledByteBuffer pooledByteBuffer, ExifInterface exifInterface) {
        Pair<Integer, Integer> a11 = com.facebook.imageutils.a.a(new pd.h(pooledByteBuffer));
        int h11 = h(exifInterface);
        int intValue = a11 != null ? ((Integer) a11.first).intValue() : -1;
        int intValue2 = a11 != null ? ((Integer) a11.second).intValue() : -1;
        qd.a p02 = qd.a.p0(pooledByteBuffer);
        try {
            nf.e eVar = new nf.e(p02);
            qd.a.C(p02);
            eVar.Z0(af.b.f395a);
            eVar.b1(h11);
            eVar.p1(intValue);
            eVar.X0(intValue2);
            return eVar;
        } catch (Throwable th2) {
            qd.a.C(p02);
            throw th2;
        }
    }

    private int h(ExifInterface exifInterface) {
        return com.facebook.imageutils.c.a(Integer.parseInt((String) md.k.g(exifInterface.getAttribute("Orientation"))));
    }

    @Override // com.facebook.imagepipeline.producers.d1
    public boolean a(p001if.d dVar) {
        return e1.b(512, 512, dVar);
    }

    @Override // com.facebook.imagepipeline.producers.o0
    public void b(l<nf.e> lVar, p0 p0Var) {
        r0 h11 = p0Var.h();
        com.facebook.imagepipeline.request.a l11 = p0Var.l();
        p0Var.e(ImagesContract.LOCAL, ImagePickerConstants.OPTION_EXIF);
        a aVar = new a(lVar, h11, p0Var, "LocalExifThumbnailProducer", l11);
        p0Var.c(new b(this, aVar));
        this.f11314a.execute(aVar);
    }

    boolean f(String str) {
        if (str == null) {
            return false;
        }
        File file = new File(str);
        return file.exists() && file.canRead();
    }

    ExifInterface g(Uri uri) {
        String b11 = ud.d.b(this.f11316c, uri);
        if (b11 == null) {
            return null;
        }
        try {
        } catch (IOException unused) {
        } catch (StackOverflowError unused2) {
            nd.a.f(LocalExifThumbnailProducer.class, "StackOverflowError in ExifInterface constructor");
        }
        if (f(b11)) {
            return new ExifInterface(b11);
        }
        AssetFileDescriptor a11 = ud.d.a(this.f11316c, uri);
        if (a11 != null && Build.VERSION.SDK_INT >= 24) {
            ExifInterface a12 = new Api24Utils(this, null).a(a11.getFileDescriptor());
            a11.close();
            return a12;
        }
        return null;
    }
}