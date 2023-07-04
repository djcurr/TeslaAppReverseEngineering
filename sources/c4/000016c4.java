package com.facebook.imagepipeline.platform;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.MemoryFile;
import com.facebook.common.memory.PooledByteBuffer;
import com.facebook.imagepipeline.nativecode.DalvikPurgeableDecoder;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.reflect.Method;
import md.k;
import md.p;
import pd.h;

@md.d
/* loaded from: classes3.dex */
public class GingerbreadPurgeableDecoder extends DalvikPurgeableDecoder {

    /* renamed from: d  reason: collision with root package name */
    private static Method f11304d;

    /* renamed from: e  reason: collision with root package name */
    public static final /* synthetic */ int f11305e = 0;

    /* renamed from: c  reason: collision with root package name */
    private final vd.b f11306c = vd.c.i();

    private static MemoryFile i(qd.a<PooledByteBuffer> aVar, int i11, byte[] bArr) {
        OutputStream outputStream;
        sd.a aVar2;
        h hVar = null;
        OutputStream outputStream2 = null;
        MemoryFile memoryFile = new MemoryFile(null, (bArr == null ? 0 : bArr.length) + i11);
        memoryFile.allowPurging(false);
        try {
            h hVar2 = new h(aVar.J());
            try {
                aVar2 = new sd.a(hVar2, i11);
            } catch (Throwable th2) {
                th = th2;
                outputStream = null;
                aVar2 = null;
            }
            try {
                outputStream2 = memoryFile.getOutputStream();
                md.a.a(aVar2, outputStream2);
                if (bArr != null) {
                    memoryFile.writeBytes(bArr, 0, i11, bArr.length);
                }
                qd.a.C(aVar);
                md.b.b(hVar2);
                md.b.b(aVar2);
                md.b.a(outputStream2, true);
                return memoryFile;
            } catch (Throwable th3) {
                th = th3;
                outputStream = outputStream2;
                hVar = hVar2;
                qd.a.C(aVar);
                md.b.b(hVar);
                md.b.b(aVar2);
                md.b.a(outputStream, true);
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            outputStream = null;
            aVar2 = null;
        }
    }

    private Bitmap j(qd.a<PooledByteBuffer> aVar, int i11, byte[] bArr, BitmapFactory.Options options) {
        MemoryFile memoryFile = null;
        try {
            try {
                MemoryFile i12 = i(aVar, i11, bArr);
                try {
                    FileDescriptor l11 = l(i12);
                    vd.b bVar = this.f11306c;
                    if (bVar != null) {
                        Bitmap bitmap = (Bitmap) k.h(bVar.b(l11, null, options), "BitmapFactory returned null");
                        if (i12 != null) {
                            i12.close();
                        }
                        return bitmap;
                    }
                    throw new IllegalStateException("WebpBitmapFactory is null");
                } catch (IOException e11) {
                    e = e11;
                    memoryFile = i12;
                    throw p.a(e);
                } catch (Throwable th2) {
                    th = th2;
                    memoryFile = i12;
                    if (memoryFile != null) {
                        memoryFile.close();
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (IOException e12) {
            e = e12;
        }
    }

    private synchronized Method k() {
        if (f11304d == null) {
            try {
                f11304d = MemoryFile.class.getDeclaredMethod("getFileDescriptor", new Class[0]);
            } catch (Exception e11) {
                throw p.a(e11);
            }
        }
        return f11304d;
    }

    private FileDescriptor l(MemoryFile memoryFile) {
        try {
            return (FileDescriptor) k.g(k().invoke(memoryFile, new Object[0]));
        } catch (Exception e11) {
            throw p.a(e11);
        }
    }

    @Override // com.facebook.imagepipeline.nativecode.DalvikPurgeableDecoder
    protected Bitmap d(qd.a<PooledByteBuffer> aVar, BitmapFactory.Options options) {
        return j(aVar, aVar.J().size(), null, options);
    }

    @Override // com.facebook.imagepipeline.nativecode.DalvikPurgeableDecoder
    protected Bitmap e(qd.a<PooledByteBuffer> aVar, int i11, BitmapFactory.Options options) {
        return j(aVar, i11, DalvikPurgeableDecoder.f(aVar, i11) ? null : DalvikPurgeableDecoder.f11293b, options);
    }
}