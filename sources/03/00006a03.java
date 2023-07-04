package expo.modules.imagepicker.exporters;

import android.graphics.Bitmap;
import android.net.Uri;
import com.stripe.android.model.Stripe3ds2AuthParams;
import e00.b;
import expo.modules.imagepicker.exporters.ImageExporter;
import expo.modules.interfaces.imageloader.ImageLoaderInterface;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.s;
import kotlin.text.w;
import u30.c;
import vz.b0;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001c\u0010\u001dJ*\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002J \u0010\r\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J \u0010\u0012\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0010H\u0016R\u0016\u0010\u0014\u001a\u00020\u00138\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0017\u001a\u00020\u00168\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001a\u001a\u00020\u00198\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, d2 = {"Lexpo/modules/imagepicker/exporters/CompressionImageExporter;", "Lexpo/modules/imagepicker/exporters/ImageExporter;", "Landroid/graphics/Bitmap;", "bitmap", "Landroid/graphics/Bitmap$CompressFormat;", "compressFormat", "Ljava/io/File;", "output", "Ljava/io/ByteArrayOutputStream;", "out", "Lvz/b0;", "saveBitmap", "image", "writeImage", "Landroid/net/Uri;", Stripe3ds2AuthParams.FIELD_SOURCE, "Lexpo/modules/imagepicker/exporters/ImageExporter$Listener;", "exporterListener", "export", "Lexpo/modules/interfaces/imageloader/ImageLoaderInterface;", "mImageLoader", "Lexpo/modules/interfaces/imageloader/ImageLoaderInterface;", "", "mQuality", "I", "", "mBase64", "Z", "<init>", "(Lexpo/modules/interfaces/imageloader/ImageLoaderInterface;IZ)V", "expo-image-picker_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes5.dex */
public final class CompressionImageExporter implements ImageExporter {
    private final boolean mBase64;
    private final ImageLoaderInterface mImageLoader;
    private final int mQuality;

    public CompressionImageExporter(ImageLoaderInterface mImageLoader, int i11, boolean z11) {
        s.g(mImageLoader, "mImageLoader");
        this.mImageLoader = mImageLoader;
        this.mQuality = i11;
        this.mBase64 = z11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void saveBitmap(Bitmap bitmap, Bitmap.CompressFormat compressFormat, File file, ByteArrayOutputStream byteArrayOutputStream) {
        writeImage(bitmap, file, compressFormat);
        if (this.mBase64) {
            bitmap.compress(Bitmap.CompressFormat.JPEG, this.mQuality, byteArrayOutputStream);
        }
    }

    private final void writeImage(Bitmap bitmap, File file, Bitmap.CompressFormat compressFormat) {
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            bitmap.compress(compressFormat, this.mQuality, fileOutputStream);
            b.a(fileOutputStream, null);
        } finally {
        }
    }

    @Override // expo.modules.imagepicker.exporters.ImageExporter
    public void export(Uri source, final File output, final ImageExporter.Listener exporterListener) {
        s.g(source, "source");
        s.g(output, "output");
        s.g(exporterListener, "exporterListener");
        this.mImageLoader.loadImageForManipulationFromURL(source.toString(), new ImageLoaderInterface.ResultListener() { // from class: expo.modules.imagepicker.exporters.CompressionImageExporter$export$imageLoaderHandler$1
            @Override // expo.modules.interfaces.imageloader.ImageLoaderInterface.ResultListener
            public void onFailure(Throwable th2) {
                exporterListener.onFailure(th2);
            }

            @Override // expo.modules.interfaces.imageloader.ImageLoaderInterface.ResultListener
            public void onSuccess(Bitmap bitmap) {
                boolean z11;
                boolean M;
                Bitmap.CompressFormat compressFormat;
                s.g(bitmap, "bitmap");
                int width = bitmap.getWidth();
                int height = bitmap.getHeight();
                z11 = CompressionImageExporter.this.mBase64;
                ByteArrayOutputStream byteArrayOutputStream = z11 ? new ByteArrayOutputStream() : null;
                File file = output;
                CompressionImageExporter compressionImageExporter = CompressionImageExporter.this;
                ImageExporter.Listener listener = exporterListener;
                try {
                    try {
                        String a11 = c.a(file.getPath());
                        s.f(a11, "getExtension(output.path)");
                        M = w.M(a11, "png", false, 2, null);
                        if (M) {
                            compressFormat = Bitmap.CompressFormat.PNG;
                        } else {
                            compressFormat = Bitmap.CompressFormat.JPEG;
                        }
                        compressionImageExporter.saveBitmap(bitmap, compressFormat, file, byteArrayOutputStream);
                        listener.onResult(byteArrayOutputStream, width, height);
                    } catch (IOException e11) {
                        listener.onFailure(e11);
                    }
                    b0 b0Var = b0.f54756a;
                    b.a(byteArrayOutputStream, null);
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        b.a(byteArrayOutputStream, th2);
                        throw th3;
                    }
                }
            }
        });
    }
}