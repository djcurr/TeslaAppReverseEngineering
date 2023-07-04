package pa;

import android.graphics.ColorSpace;
import android.graphics.ImageDecoder;
import android.os.Build;
import android.util.Log;
import android.util.Size;
import com.bumptech.glide.load.e;
import com.bumptech.glide.load.resource.bitmap.l;
import com.bumptech.glide.load.resource.bitmap.m;
import com.bumptech.glide.load.resource.bitmap.r;
import ha.d;
import ha.f;

/* loaded from: classes.dex */
public abstract class a<T> implements f<ImageDecoder.Source, T> {

    /* renamed from: a  reason: collision with root package name */
    final r f46411a = r.b();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: pa.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0989a implements ImageDecoder.OnHeaderDecodedListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f46412a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f46413b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f46414c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ com.bumptech.glide.load.b f46415d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ l f46416e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ e f46417f;

        /* renamed from: pa.a$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        class C0990a implements ImageDecoder.OnPartialImageListener {
            C0990a(C0989a c0989a) {
            }

            @Override // android.graphics.ImageDecoder.OnPartialImageListener
            public boolean onPartialImage(ImageDecoder.DecodeException decodeException) {
                return false;
            }
        }

        C0989a(int i11, int i12, boolean z11, com.bumptech.glide.load.b bVar, l lVar, e eVar) {
            this.f46412a = i11;
            this.f46413b = i12;
            this.f46414c = z11;
            this.f46415d = bVar;
            this.f46416e = lVar;
            this.f46417f = eVar;
        }

        @Override // android.graphics.ImageDecoder.OnHeaderDecodedListener
        public void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
            boolean z11 = false;
            if (a.this.f46411a.e(this.f46412a, this.f46413b, this.f46414c, false)) {
                imageDecoder.setAllocator(3);
            } else {
                imageDecoder.setAllocator(1);
            }
            if (this.f46415d == com.bumptech.glide.load.b.PREFER_RGB_565) {
                imageDecoder.setMemorySizePolicy(0);
            }
            imageDecoder.setOnPartialImageListener(new C0990a(this));
            Size size = imageInfo.getSize();
            int i11 = this.f46412a;
            if (i11 == Integer.MIN_VALUE) {
                i11 = size.getWidth();
            }
            int i12 = this.f46413b;
            if (i12 == Integer.MIN_VALUE) {
                i12 = size.getHeight();
            }
            float b11 = this.f46416e.b(size.getWidth(), size.getHeight(), i11, i12);
            int round = Math.round(size.getWidth() * b11);
            int round2 = Math.round(size.getHeight() * b11);
            if (Log.isLoggable("ImageDecoder", 2)) {
                Log.v("ImageDecoder", "Resizing from [" + size.getWidth() + "x" + size.getHeight() + "] to [" + round + "x" + round2 + "] scaleFactor: " + b11);
            }
            imageDecoder.setTargetSize(round, round2);
            int i13 = Build.VERSION.SDK_INT;
            if (i13 < 28) {
                if (i13 >= 26) {
                    imageDecoder.setTargetColorSpace(ColorSpace.get(ColorSpace.Named.SRGB));
                    return;
                }
                return;
            }
            if (this.f46417f == e.DISPLAY_P3 && imageInfo.getColorSpace() != null && imageInfo.getColorSpace().isWideGamut()) {
                z11 = true;
            }
            imageDecoder.setTargetColorSpace(ColorSpace.get(z11 ? ColorSpace.Named.DISPLAY_P3 : ColorSpace.Named.SRGB));
        }
    }

    protected abstract ja.c<T> c(ImageDecoder.Source source, int i11, int i12, ImageDecoder.OnHeaderDecodedListener onHeaderDecodedListener);

    @Override // ha.f
    /* renamed from: d */
    public final ja.c<T> b(ImageDecoder.Source source, int i11, int i12, ha.e eVar) {
        com.bumptech.glide.load.b bVar = (com.bumptech.glide.load.b) eVar.c(m.f10771f);
        l lVar = (l) eVar.c(l.f10769f);
        d<Boolean> dVar = m.f10774i;
        return c(source, i11, i12, new C0989a(i11, i12, eVar.c(dVar) != null && ((Boolean) eVar.c(dVar)).booleanValue(), bVar, lVar, (e) eVar.c(m.f10772g)));
    }

    @Override // ha.f
    /* renamed from: e */
    public final boolean a(ImageDecoder.Source source, ha.e eVar) {
        return true;
    }
}