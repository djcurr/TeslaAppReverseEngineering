package uf;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.os.Build;
import java.io.OutputStream;

/* loaded from: classes3.dex */
public class g implements c {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f53429a;

    /* renamed from: b  reason: collision with root package name */
    private final int f53430b;

    public g(boolean z11, int i11) {
        this.f53429a = z11;
        this.f53430b = i11;
    }

    private static Bitmap.CompressFormat d(af.c cVar) {
        if (cVar == null) {
            return Bitmap.CompressFormat.JPEG;
        }
        if (cVar == af.b.f395a) {
            return Bitmap.CompressFormat.JPEG;
        }
        if (cVar == af.b.f396b) {
            return Bitmap.CompressFormat.PNG;
        }
        if (Build.VERSION.SDK_INT >= 14 && af.b.a(cVar)) {
            return Bitmap.CompressFormat.WEBP;
        }
        return Bitmap.CompressFormat.JPEG;
    }

    private int e(nf.e eVar, p001if.e eVar2, p001if.d dVar) {
        if (this.f53429a) {
            return a.b(eVar2, dVar, eVar, this.f53430b);
        }
        return 1;
    }

    @Override // uf.c
    public boolean a(af.c cVar) {
        return cVar == af.b.f405k || cVar == af.b.f395a;
    }

    @Override // uf.c
    public b b(nf.e eVar, OutputStream outputStream, p001if.e eVar2, p001if.d dVar, af.c cVar, Integer num) {
        g gVar;
        p001if.e eVar3;
        Bitmap bitmap;
        Throwable th2;
        OutOfMemoryError e11;
        Integer num2 = num == null ? 85 : num;
        if (eVar2 == null) {
            eVar3 = p001if.e.a();
            gVar = this;
        } else {
            gVar = this;
            eVar3 = eVar2;
        }
        int e12 = gVar.e(eVar, eVar3, dVar);
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inSampleSize = e12;
        try {
            Bitmap decodeStream = BitmapFactory.decodeStream(eVar.R(), null, options);
            if (decodeStream == null) {
                nd.a.j("SimpleImageTranscoder", "Couldn't decode the EncodedImage InputStream ! ");
                return new b(2);
            }
            Matrix g11 = e.g(eVar, eVar3);
            if (g11 != null) {
                try {
                    bitmap = Bitmap.createBitmap(decodeStream, 0, 0, decodeStream.getWidth(), decodeStream.getHeight(), g11, false);
                } catch (OutOfMemoryError e13) {
                    e11 = e13;
                    bitmap = decodeStream;
                    nd.a.k("SimpleImageTranscoder", "Out-Of-Memory during transcode", e11);
                    b bVar = new b(2);
                    bitmap.recycle();
                    decodeStream.recycle();
                    return bVar;
                } catch (Throwable th3) {
                    th2 = th3;
                    bitmap = decodeStream;
                    bitmap.recycle();
                    decodeStream.recycle();
                    throw th2;
                }
            } else {
                bitmap = decodeStream;
            }
            try {
                try {
                    bitmap.compress(d(cVar), num2.intValue(), outputStream);
                    b bVar2 = new b(e12 > 1 ? 0 : 1);
                    bitmap.recycle();
                    decodeStream.recycle();
                    return bVar2;
                } catch (Throwable th4) {
                    th2 = th4;
                    bitmap.recycle();
                    decodeStream.recycle();
                    throw th2;
                }
            } catch (OutOfMemoryError e14) {
                e11 = e14;
                nd.a.k("SimpleImageTranscoder", "Out-Of-Memory during transcode", e11);
                b bVar3 = new b(2);
                bitmap.recycle();
                decodeStream.recycle();
                return bVar3;
            }
        } catch (OutOfMemoryError e15) {
            nd.a.k("SimpleImageTranscoder", "Out-Of-Memory during transcode", e15);
            return new b(2);
        }
    }

    @Override // uf.c
    public boolean c(nf.e eVar, p001if.e eVar2, p001if.d dVar) {
        if (eVar2 == null) {
            eVar2 = p001if.e.a();
        }
        return this.f53429a && a.b(eVar2, dVar, eVar, this.f53430b) > 1;
    }

    @Override // uf.c
    public String getIdentifier() {
        return "SimpleImageTranscoder";
    }
}