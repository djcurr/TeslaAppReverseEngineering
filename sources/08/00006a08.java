package expo.modules.imagepicker.exporters;

import android.content.ContentResolver;
import android.graphics.BitmapFactory;
import android.net.Uri;
import ch.qos.logback.core.joran.action.Action;
import com.stripe.android.model.Stripe3ds2AuthParams;
import e00.b;
import expo.modules.imagepicker.exporters.ImageExporter;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.s;
import u30.d;
import vz.b0;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0015\u0010\u0016J\"\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002J \u0010\u000e\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fH\u0016R\u0016\u0010\u0010\u001a\u00020\u000f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0013\u001a\u00020\u00128\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, d2 = {"Lexpo/modules/imagepicker/exporters/RawImageExporter;", "Lexpo/modules/imagepicker/exporters/ImageExporter;", "Landroid/net/Uri;", "originalUri", "Ljava/io/File;", Action.FILE_ATTRIBUTE, "Ljava/io/ByteArrayOutputStream;", "out", "Lvz/b0;", "copyImage", Stripe3ds2AuthParams.FIELD_SOURCE, "output", "Lexpo/modules/imagepicker/exporters/ImageExporter$Listener;", "exporterListener", "export", "Landroid/content/ContentResolver;", "contentResolver", "Landroid/content/ContentResolver;", "", "mBase64", "Z", "<init>", "(Landroid/content/ContentResolver;Z)V", "expo-image-picker_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes5.dex */
public final class RawImageExporter implements ImageExporter {
    private final ContentResolver contentResolver;
    private final boolean mBase64;

    public RawImageExporter(ContentResolver contentResolver, boolean z11) {
        s.g(contentResolver, "contentResolver");
        this.contentResolver = contentResolver;
        this.mBase64 = z11;
    }

    private final void copyImage(Uri uri, File file, ByteArrayOutputStream byteArrayOutputStream) {
        InputStream openInputStream = this.contentResolver.openInputStream(uri);
        if (openInputStream == null) {
            return;
        }
        if (byteArrayOutputStream != null) {
            try {
                d.a(openInputStream, byteArrayOutputStream);
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    b.a(openInputStream, th2);
                    throw th3;
                }
            }
        }
        if (uri.compareTo(Uri.fromFile(file)) != 0) {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            if (byteArrayOutputStream != null) {
                fileOutputStream.write(byteArrayOutputStream.toByteArray());
                b0 b0Var = b0.f54756a;
            } else {
                d.a(openInputStream, fileOutputStream);
            }
            b.a(fileOutputStream, null);
        }
        b0 b0Var2 = b0.f54756a;
        b.a(openInputStream, null);
    }

    @Override // expo.modules.imagepicker.exporters.ImageExporter
    public void export(Uri source, File output, ImageExporter.Listener exporterListener) {
        s.g(source, "source");
        s.g(output, "output");
        s.g(exporterListener, "exporterListener");
        ByteArrayOutputStream byteArrayOutputStream = this.mBase64 ? new ByteArrayOutputStream() : null;
        try {
            try {
                copyImage(source, output, byteArrayOutputStream);
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeFile(output.getAbsolutePath(), options);
                exporterListener.onResult(byteArrayOutputStream, options.outWidth, options.outHeight);
            } catch (IOException e11) {
                exporterListener.onFailure(e11);
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
}