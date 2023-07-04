package expo.modules.imagepicker;

import android.content.ContentResolver;
import android.net.Uri;
import android.util.Log;
import e00.b;
import java.io.IOException;
import java.io.InputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.s;
import vz.b0;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004R\u0016\u0010\b\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lexpo/modules/imagepicker/ExifDataHandler;", "", "Landroid/net/Uri;", "newUri", "Landroid/content/ContentResolver;", "contentResolver", "Lvz/b0;", "copyExifData", "uri", "Landroid/net/Uri;", "<init>", "(Landroid/net/Uri;)V", "expo-image-picker_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes5.dex */
public final class ExifDataHandler {
    private final Uri uri;

    public ExifDataHandler(Uri uri) {
        s.g(uri, "uri");
        this.uri = uri;
    }

    public final void copyExifData(Uri newUri, ContentResolver contentResolver) {
        InputStream openInputStream;
        s.g(newUri, "newUri");
        s.g(contentResolver, "contentResolver");
        if (s.c(this.uri, newUri) || (openInputStream = contentResolver.openInputStream(this.uri)) == null) {
            return;
        }
        try {
            androidx.exifinterface.media.a aVar = new androidx.exifinterface.media.a(openInputStream);
            String path = newUri.getPath();
            if (path != null) {
                androidx.exifinterface.media.a aVar2 = new androidx.exifinterface.media.a(path);
                String[][] exifTags = ImagePickerConstants.INSTANCE.getExifTags();
                int i11 = 0;
                int length = exifTags.length;
                while (i11 < length) {
                    String[] strArr = exifTags[i11];
                    i11++;
                    String str = strArr[1];
                    String g11 = aVar.g(str);
                    if (g11 != null && !s.c(str, "ImageLength") && !s.c(str, "ImageWidth") && !s.c(str, "PixelXDimension") && !s.c(str, "PixelYDimension") && !s.c(str, "Orientation")) {
                        aVar2.d0(str, g11);
                    }
                }
                try {
                    aVar2.Y();
                    b0 b0Var = b0.f54756a;
                } catch (IOException e11) {
                    String message = e11.getMessage();
                    Log.w(ImagePickerConstants.TAG, "Couldn't save Exif data: " + message, e11);
                }
            }
            b.a(openInputStream, null);
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                b.a(openInputStream, th2);
                throw th3;
            }
        }
    }
}