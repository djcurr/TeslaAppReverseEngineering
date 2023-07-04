package expo.modules.imagepicker;

import android.app.Application;
import android.content.ContentResolver;
import android.net.Uri;
import android.util.Log;
import android.webkit.MimeTypeMap;
import androidx.core.content.FileProvider;
import ch.qos.logback.core.joran.action.Action;
import expo.modules.core.utilities.FileUtilities;
import ezvcard.property.Kind;
import java.io.File;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.s;
import kotlin.text.w;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u001a\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0002\u001a\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0000\u001a\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00002\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t\u001a\u0016\u0010\u000f\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\r\u001a\u000e\u0010\u0010\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u0003\u001a\u000e\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0000\u001a\u000e\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0000¨\u0006\u0015"}, d2 = {"", "url", "getTypeFromFileUrl", "Ljava/io/File;", "cacheDir", "extension", "createOutputFile", "Landroid/content/ContentResolver;", "contentResolver", "Landroid/net/Uri;", "uri", "getType", Action.FILE_ATTRIBUTE, "Landroid/app/Application;", Kind.APPLICATION, "contentUriFromFile", "uriFromFile", "path", "uriFromFilePath", "type", "deduceExtension", "expo-image-picker_release"}, k = 2, mv = {1, 5, 1})
/* loaded from: classes5.dex */
public final class ImagePickerUtilsKt {
    public static final Uri contentUriFromFile(File file, Application application) {
        s.g(file, "file");
        s.g(application, "application");
        try {
            String packageName = application.getPackageName();
            Uri uriForFile = FileProvider.getUriForFile(application, packageName + ".ImagePickerFileProvider", file);
            s.f(uriForFile, "{\n    FileProvider.getUr…rFileProvider\", file)\n  }");
            return uriForFile;
        } catch (Exception unused) {
            Uri fromFile = Uri.fromFile(file);
            s.f(fromFile, "{\n    Uri.fromFile(file)\n  }");
            return fromFile;
        }
    }

    public static final File createOutputFile(File cacheDir, String extension) {
        s.g(cacheDir, "cacheDir");
        s.g(extension, "extension");
        try {
            File file = new File(FileUtilities.generateOutputPath(cacheDir, ImagePickerConstants.CACHE_DIR_NAME, extension));
            file.createNewFile();
            return file;
        } catch (IOException unused) {
            return null;
        }
    }

    public static final String deduceExtension(String type) {
        boolean M;
        boolean M2;
        boolean M3;
        boolean M4;
        s.g(type, "type");
        M = w.M(type, "png", false, 2, null);
        if (M) {
            return ".png";
        }
        M2 = w.M(type, "gif", false, 2, null);
        if (M2) {
            return ".gif";
        }
        M3 = w.M(type, "bmp", false, 2, null);
        if (M3) {
            return ".bmp";
        }
        M4 = w.M(type, "jpeg", false, 2, null);
        if (M4) {
            return ".jpg";
        }
        Log.w(ImagePickerConstants.TAG, "Image type not supported. Falling back to JPEG instead.");
        return ".jpg";
    }

    public static final String getType(ContentResolver contentResolver, Uri uri) {
        s.g(contentResolver, "contentResolver");
        s.g(uri, "uri");
        String type = contentResolver.getType(uri);
        if (type == null) {
            String uri2 = uri.toString();
            s.f(uri2, "uri.toString()");
            return getTypeFromFileUrl(uri2);
        }
        return type;
    }

    private static final String getTypeFromFileUrl(String str) {
        String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(str);
        if (fileExtensionFromUrl != null) {
            return MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileExtensionFromUrl);
        }
        return null;
    }

    public static final Uri uriFromFile(File file) {
        s.g(file, "file");
        Uri fromFile = Uri.fromFile(file);
        s.f(fromFile, "fromFile(file)");
        return fromFile;
    }

    public static final Uri uriFromFilePath(String path) {
        s.g(path, "path");
        return uriFromFile(new File(path));
    }
}