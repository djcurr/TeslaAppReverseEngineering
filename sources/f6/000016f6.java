package com.facebook.imagepipeline.producers;

import android.content.ContentResolver;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.media.ThumbnailUtils;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.provider.DocumentsContract;
import android.provider.MediaStore;
import com.google.android.gms.common.internal.ImagesContract;
import java.io.FileNotFoundException;
import java.util.Map;
import java.util.concurrent.Executor;
import org.webrtc.MediaStreamTrack;

/* loaded from: classes3.dex */
public class h0 implements o0<qd.a<nf.c>> {

    /* renamed from: a  reason: collision with root package name */
    private final Executor f11397a;

    /* renamed from: b  reason: collision with root package name */
    private final ContentResolver f11398b;

    /* loaded from: classes3.dex */
    class a extends w0<qd.a<nf.c>> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ r0 f11399f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ p0 f11400g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ com.facebook.imagepipeline.request.a f11401h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(l lVar, r0 r0Var, p0 p0Var, String str, r0 r0Var2, p0 p0Var2, com.facebook.imagepipeline.request.a aVar) {
            super(lVar, r0Var, p0Var, str);
            this.f11399f = r0Var2;
            this.f11400g = p0Var2;
            this.f11401h = aVar;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.imagepipeline.producers.w0, kd.g
        public void e(Exception exc) {
            super.e(exc);
            this.f11399f.b(this.f11400g, "VideoThumbnailProducer", false);
            this.f11400g.g(ImagesContract.LOCAL);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // kd.g
        /* renamed from: j */
        public void b(qd.a<nf.c> aVar) {
            qd.a.C(aVar);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.imagepipeline.producers.w0
        /* renamed from: k */
        public Map<String, String> i(qd.a<nf.c> aVar) {
            return md.g.of("createdThumbnail", String.valueOf(aVar != null));
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // kd.g
        /* renamed from: l */
        public qd.a<nf.c> c() {
            String str;
            try {
                str = h0.this.i(this.f11401h);
            } catch (IllegalArgumentException unused) {
                str = null;
            }
            Bitmap createVideoThumbnail = str != null ? ThumbnailUtils.createVideoThumbnail(str, h0.g(this.f11401h)) : h0.h(h0.this.f11398b, this.f11401h.s());
            if (createVideoThumbnail == null) {
                return null;
            }
            nf.d dVar = new nf.d(createVideoThumbnail, gf.h.b(), nf.i.f41655d, 0);
            this.f11400g.b("image_format", "thumbnail");
            dVar.m(this.f11400g.getExtras());
            return qd.a.p0(dVar);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.imagepipeline.producers.w0, kd.g
        /* renamed from: m */
        public void f(qd.a<nf.c> aVar) {
            super.f(aVar);
            this.f11399f.b(this.f11400g, "VideoThumbnailProducer", aVar != null);
            this.f11400g.g(ImagesContract.LOCAL);
        }
    }

    /* loaded from: classes3.dex */
    class b extends e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ w0 f11403a;

        b(h0 h0Var, w0 w0Var) {
            this.f11403a = w0Var;
        }

        @Override // com.facebook.imagepipeline.producers.q0
        public void b() {
            this.f11403a.a();
        }
    }

    public h0(Executor executor, ContentResolver contentResolver) {
        this.f11397a = executor;
        this.f11398b = contentResolver;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int g(com.facebook.imagepipeline.request.a aVar) {
        return (aVar.k() > 96 || aVar.j() > 96) ? 1 : 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Bitmap h(ContentResolver contentResolver, Uri uri) {
        if (Build.VERSION.SDK_INT >= 10) {
            try {
                ParcelFileDescriptor openFileDescriptor = contentResolver.openFileDescriptor(uri, "r");
                MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                mediaMetadataRetriever.setDataSource(openFileDescriptor.getFileDescriptor());
                return mediaMetadataRetriever.getFrameAtTime(-1L);
            } catch (FileNotFoundException unused) {
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String i(com.facebook.imagepipeline.request.a aVar) {
        Uri uri;
        String str;
        String[] strArr;
        Uri s11 = aVar.s();
        if (ud.d.j(s11)) {
            return aVar.r().getPath();
        }
        if (ud.d.i(s11)) {
            if (Build.VERSION.SDK_INT < 19 || !"com.android.providers.media.documents".equals(s11.getAuthority())) {
                uri = s11;
                str = null;
                strArr = null;
            } else {
                String documentId = DocumentsContract.getDocumentId(s11);
                str = "_id=?";
                uri = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
                strArr = new String[]{documentId.split(":")[1]};
            }
            Cursor query = this.f11398b.query(uri, new String[]{"_data"}, str, strArr, null);
            if (query != null) {
                try {
                    if (query.moveToFirst()) {
                        return query.getString(query.getColumnIndexOrThrow("_data"));
                    }
                } finally {
                    query.close();
                }
            }
            if (query != null) {
            }
        }
        return null;
    }

    @Override // com.facebook.imagepipeline.producers.o0
    public void b(l<qd.a<nf.c>> lVar, p0 p0Var) {
        r0 h11 = p0Var.h();
        com.facebook.imagepipeline.request.a l11 = p0Var.l();
        p0Var.e(ImagesContract.LOCAL, MediaStreamTrack.VIDEO_TRACK_KIND);
        a aVar = new a(lVar, h11, p0Var, "VideoThumbnailProducer", h11, p0Var, l11);
        p0Var.c(new b(this, aVar));
        this.f11397a.execute(aVar);
    }
}