package com.bumptech.glide.load.resource.bitmap;

import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.media.MediaDataSource;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import ha.d;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* loaded from: classes.dex */
public class b0<T> implements ha.f<T, Bitmap> {

    /* renamed from: d  reason: collision with root package name */
    public static final ha.d<Long> f10744d = ha.d.a("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.TargetFrame", -1L, new a());

    /* renamed from: e  reason: collision with root package name */
    public static final ha.d<Integer> f10745e = ha.d.a("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.FrameOption", 2, new b());

    /* renamed from: f  reason: collision with root package name */
    private static final e f10746f = new e();

    /* renamed from: a  reason: collision with root package name */
    private final f<T> f10747a;

    /* renamed from: b  reason: collision with root package name */
    private final ka.e f10748b;

    /* renamed from: c  reason: collision with root package name */
    private final e f10749c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements d.b<Long> {

        /* renamed from: a  reason: collision with root package name */
        private final ByteBuffer f10750a = ByteBuffer.allocate(8);

        a() {
        }

        @Override // ha.d.b
        /* renamed from: b */
        public void a(byte[] bArr, Long l11, MessageDigest messageDigest) {
            messageDigest.update(bArr);
            synchronized (this.f10750a) {
                this.f10750a.position(0);
                messageDigest.update(this.f10750a.putLong(l11.longValue()).array());
            }
        }
    }

    /* loaded from: classes.dex */
    class b implements d.b<Integer> {

        /* renamed from: a  reason: collision with root package name */
        private final ByteBuffer f10751a = ByteBuffer.allocate(4);

        b() {
        }

        @Override // ha.d.b
        /* renamed from: b */
        public void a(byte[] bArr, Integer num, MessageDigest messageDigest) {
            if (num == null) {
                return;
            }
            messageDigest.update(bArr);
            synchronized (this.f10751a) {
                this.f10751a.position(0);
                messageDigest.update(this.f10751a.putInt(num.intValue()).array());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class c implements f<AssetFileDescriptor> {
        private c() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.b0.f
        /* renamed from: b */
        public void a(MediaMetadataRetriever mediaMetadataRetriever, AssetFileDescriptor assetFileDescriptor) {
            mediaMetadataRetriever.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
        }

        /* synthetic */ c(a aVar) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class d implements f<ByteBuffer> {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public class a extends MediaDataSource {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ ByteBuffer f10752a;

            a(d dVar, ByteBuffer byteBuffer) {
                this.f10752a = byteBuffer;
            }

            @Override // java.io.Closeable, java.lang.AutoCloseable
            public void close() {
            }

            @Override // android.media.MediaDataSource
            public long getSize() {
                return this.f10752a.limit();
            }

            @Override // android.media.MediaDataSource
            public int readAt(long j11, byte[] bArr, int i11, int i12) {
                if (j11 >= this.f10752a.limit()) {
                    return -1;
                }
                this.f10752a.position((int) j11);
                int min = Math.min(i12, this.f10752a.remaining());
                this.f10752a.get(bArr, i11, min);
                return min;
            }
        }

        d() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.b0.f
        /* renamed from: b */
        public void a(MediaMetadataRetriever mediaMetadataRetriever, ByteBuffer byteBuffer) {
            mediaMetadataRetriever.setDataSource(new a(this, byteBuffer));
        }
    }

    /* loaded from: classes.dex */
    static class e {
        e() {
        }

        public MediaMetadataRetriever a() {
            return new MediaMetadataRetriever();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface f<T> {
        void a(MediaMetadataRetriever mediaMetadataRetriever, T t11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class g implements f<ParcelFileDescriptor> {
        g() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.b0.f
        /* renamed from: b */
        public void a(MediaMetadataRetriever mediaMetadataRetriever, ParcelFileDescriptor parcelFileDescriptor) {
            mediaMetadataRetriever.setDataSource(parcelFileDescriptor.getFileDescriptor());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class h extends RuntimeException {
        h() {
            super("MediaMetadataRetriever failed to retrieve a frame without throwing, check the adb logs for .*MetadataRetriever.* prior to this exception for details");
        }
    }

    b0(ka.e eVar, f<T> fVar) {
        this(eVar, fVar, f10746f);
    }

    public static ha.f<AssetFileDescriptor, Bitmap> c(ka.e eVar) {
        return new b0(eVar, new c(null));
    }

    public static ha.f<ByteBuffer, Bitmap> d(ka.e eVar) {
        return new b0(eVar, new d());
    }

    private static Bitmap e(MediaMetadataRetriever mediaMetadataRetriever, long j11, int i11, int i12, int i13, l lVar) {
        Bitmap g11 = (Build.VERSION.SDK_INT < 27 || i12 == Integer.MIN_VALUE || i13 == Integer.MIN_VALUE || lVar == l.f10767d) ? null : g(mediaMetadataRetriever, j11, i11, i12, i13, lVar);
        if (g11 == null) {
            g11 = f(mediaMetadataRetriever, j11, i11);
        }
        if (g11 != null) {
            return g11;
        }
        throw new h();
    }

    private static Bitmap f(MediaMetadataRetriever mediaMetadataRetriever, long j11, int i11) {
        return mediaMetadataRetriever.getFrameAtTime(j11, i11);
    }

    private static Bitmap g(MediaMetadataRetriever mediaMetadataRetriever, long j11, int i11, int i12, int i13, l lVar) {
        try {
            int parseInt = Integer.parseInt(mediaMetadataRetriever.extractMetadata(18));
            int parseInt2 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(19));
            int parseInt3 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(24));
            if (parseInt3 == 90 || parseInt3 == 270) {
                parseInt2 = parseInt;
                parseInt = parseInt2;
            }
            float b11 = lVar.b(parseInt, parseInt2, i12, i13);
            return mediaMetadataRetriever.getScaledFrameAtTime(j11, i11, Math.round(parseInt * b11), Math.round(b11 * parseInt2));
        } catch (Throwable th2) {
            if (Log.isLoggable("VideoDecoder", 3)) {
                Log.d("VideoDecoder", "Exception trying to decode a scaled frame on oreo+, falling back to a fullsize frame", th2);
                return null;
            }
            return null;
        }
    }

    public static ha.f<ParcelFileDescriptor, Bitmap> h(ka.e eVar) {
        return new b0(eVar, new g());
    }

    @Override // ha.f
    public boolean a(T t11, ha.e eVar) {
        return true;
    }

    @Override // ha.f
    public ja.c<Bitmap> b(T t11, int i11, int i12, ha.e eVar) {
        long longValue = ((Long) eVar.c(f10744d)).longValue();
        if (longValue < 0 && longValue != -1) {
            throw new IllegalArgumentException("Requested frame must be non-negative, or DEFAULT_FRAME, given: " + longValue);
        }
        Integer num = (Integer) eVar.c(f10745e);
        if (num == null) {
            num = 2;
        }
        l lVar = (l) eVar.c(l.f10769f);
        if (lVar == null) {
            lVar = l.f10768e;
        }
        l lVar2 = lVar;
        MediaMetadataRetriever a11 = this.f10749c.a();
        try {
            this.f10747a.a(a11, t11);
            Bitmap e11 = e(a11, longValue, num.intValue(), i11, i12, lVar2);
            a11.release();
            return com.bumptech.glide.load.resource.bitmap.e.d(e11, this.f10748b);
        } catch (Throwable th2) {
            a11.release();
            throw th2;
        }
    }

    b0(ka.e eVar, f<T> fVar, e eVar2) {
        this.f10748b = eVar;
        this.f10747a = fVar;
        this.f10749c = eVar2;
    }
}