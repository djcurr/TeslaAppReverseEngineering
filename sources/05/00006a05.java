package expo.modules.imagepicker.exporters;

import android.graphics.Rect;
import android.net.Uri;
import com.stripe.android.model.Stripe3ds2AuthParams;
import e00.b;
import expo.modules.imagepicker.exporters.ImageExporter;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.s;
import u30.d;
import vz.b0;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014J \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016R\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0016\u0010\u000e\u001a\u00020\r8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0011\u001a\u00020\u00108\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"Lexpo/modules/imagepicker/exporters/CropImageExporter;", "Lexpo/modules/imagepicker/exporters/ImageExporter;", "Landroid/net/Uri;", Stripe3ds2AuthParams.FIELD_SOURCE, "Ljava/io/File;", "output", "Lexpo/modules/imagepicker/exporters/ImageExporter$Listener;", "exporterListener", "Lvz/b0;", "export", "", "mRotation", "I", "Landroid/graphics/Rect;", "mCropRect", "Landroid/graphics/Rect;", "", "mBase64", "Z", "<init>", "(ILandroid/graphics/Rect;Z)V", "expo-image-picker_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes5.dex */
public final class CropImageExporter implements ImageExporter {
    private final boolean mBase64;
    private final Rect mCropRect;
    private final int mRotation;

    public CropImageExporter(int i11, Rect mCropRect, boolean z11) {
        s.g(mCropRect, "mCropRect");
        this.mRotation = i11;
        this.mCropRect = mCropRect;
        this.mBase64 = z11;
    }

    @Override // expo.modules.imagepicker.exporters.ImageExporter
    public void export(Uri source, File output, ImageExporter.Listener exporterListener) {
        int width;
        int height;
        FileInputStream fileInputStream;
        s.g(source, "source");
        s.g(output, "output");
        s.g(exporterListener, "exporterListener");
        int i11 = this.mRotation % 360;
        if (i11 < 0) {
            i11 += 360;
        }
        if (i11 != 0 && i11 != 180) {
            width = this.mCropRect.height();
            height = this.mCropRect.width();
        } else {
            width = this.mCropRect.width();
            height = this.mCropRect.height();
        }
        if (this.mBase64) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                try {
                    String path = source.getPath();
                    s.e(path);
                    fileInputStream = new FileInputStream(path);
                } catch (IOException e11) {
                    exporterListener.onFailure(e11);
                } catch (NullPointerException e12) {
                    exporterListener.onFailure(e12);
                }
                try {
                    d.a(fileInputStream, byteArrayOutputStream);
                    exporterListener.onResult(byteArrayOutputStream, width, height);
                    b0 b0Var = b0.f54756a;
                    b.a(fileInputStream, null);
                    b0 b0Var2 = b0.f54756a;
                    b.a(byteArrayOutputStream, null);
                } finally {
                }
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    b.a(byteArrayOutputStream, th2);
                    throw th3;
                }
            }
        } else {
            exporterListener.onResult(null, width, height);
        }
    }
}