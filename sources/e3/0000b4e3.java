package ta;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.Log;
import bb.k;
import com.bumptech.glide.load.ImageHeaderParser;
import fa.a;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Queue;

/* loaded from: classes.dex */
public class a implements ha.f<ByteBuffer, c> {

    /* renamed from: f  reason: collision with root package name */
    private static final C1151a f51809f = new C1151a();

    /* renamed from: g  reason: collision with root package name */
    private static final b f51810g = new b();

    /* renamed from: a  reason: collision with root package name */
    private final Context f51811a;

    /* renamed from: b  reason: collision with root package name */
    private final List<ImageHeaderParser> f51812b;

    /* renamed from: c  reason: collision with root package name */
    private final b f51813c;

    /* renamed from: d  reason: collision with root package name */
    private final C1151a f51814d;

    /* renamed from: e  reason: collision with root package name */
    private final ta.b f51815e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ta.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C1151a {
        C1151a() {
        }

        fa.a a(a.InterfaceC0513a interfaceC0513a, fa.c cVar, ByteBuffer byteBuffer, int i11) {
            return new fa.e(interfaceC0513a, cVar, byteBuffer, i11);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        private final Queue<fa.d> f51816a = k.f(0);

        b() {
        }

        synchronized fa.d a(ByteBuffer byteBuffer) {
            fa.d poll;
            poll = this.f51816a.poll();
            if (poll == null) {
                poll = new fa.d();
            }
            return poll.p(byteBuffer);
        }

        synchronized void b(fa.d dVar) {
            dVar.a();
            this.f51816a.offer(dVar);
        }
    }

    public a(Context context, List<ImageHeaderParser> list, ka.e eVar, ka.b bVar) {
        this(context, list, eVar, bVar, f51810g, f51809f);
    }

    private e c(ByteBuffer byteBuffer, int i11, int i12, fa.d dVar, ha.e eVar) {
        Bitmap.Config config;
        long b11 = bb.f.b();
        try {
            fa.c c11 = dVar.c();
            if (c11.b() > 0 && c11.c() == 0) {
                if (eVar.c(i.f51857a) == com.bumptech.glide.load.b.PREFER_RGB_565) {
                    config = Bitmap.Config.RGB_565;
                } else {
                    config = Bitmap.Config.ARGB_8888;
                }
                fa.a a11 = this.f51814d.a(this.f51815e, c11, byteBuffer, e(c11, i11, i12));
                a11.c(config);
                a11.b();
                Bitmap nextFrame = a11.getNextFrame();
                if (nextFrame == null) {
                    return null;
                }
                e eVar2 = new e(new c(this.f51811a, a11, pa.c.c(), i11, i12, nextFrame));
                if (Log.isLoggable("BufferGifDecoder", 2)) {
                    Log.v("BufferGifDecoder", "Decoded GIF from stream in " + bb.f.a(b11));
                }
                return eVar2;
            }
            if (Log.isLoggable("BufferGifDecoder", 2)) {
                Log.v("BufferGifDecoder", "Decoded GIF from stream in " + bb.f.a(b11));
            }
            return null;
        } finally {
            if (Log.isLoggable("BufferGifDecoder", 2)) {
                Log.v("BufferGifDecoder", "Decoded GIF from stream in " + bb.f.a(b11));
            }
        }
    }

    private static int e(fa.c cVar, int i11, int i12) {
        int min = Math.min(cVar.a() / i12, cVar.d() / i11);
        int max = Math.max(1, min == 0 ? 0 : Integer.highestOneBit(min));
        if (Log.isLoggable("BufferGifDecoder", 2) && max > 1) {
            Log.v("BufferGifDecoder", "Downsampling GIF, sampleSize: " + max + ", target dimens: [" + i11 + "x" + i12 + "], actual dimens: [" + cVar.d() + "x" + cVar.a() + "]");
        }
        return max;
    }

    @Override // ha.f
    /* renamed from: d */
    public e b(ByteBuffer byteBuffer, int i11, int i12, ha.e eVar) {
        fa.d a11 = this.f51813c.a(byteBuffer);
        try {
            return c(byteBuffer, i11, i12, a11, eVar);
        } finally {
            this.f51813c.b(a11);
        }
    }

    @Override // ha.f
    /* renamed from: f */
    public boolean a(ByteBuffer byteBuffer, ha.e eVar) {
        return !((Boolean) eVar.c(i.f51858b)).booleanValue() && com.bumptech.glide.load.d.f(this.f51812b, byteBuffer) == ImageHeaderParser.ImageType.GIF;
    }

    a(Context context, List<ImageHeaderParser> list, ka.e eVar, ka.b bVar, b bVar2, C1151a c1151a) {
        this.f51811a = context.getApplicationContext();
        this.f51812b = list;
        this.f51814d = c1151a;
        this.f51815e = new ta.b(eVar, bVar);
        this.f51813c = bVar2;
    }
}