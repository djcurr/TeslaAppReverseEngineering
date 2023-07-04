package expo.modules.imagepicker.fileproviders;

import android.net.Uri;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.s;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lexpo/modules/imagepicker/fileproviders/CropFileProvider;", "Lexpo/modules/imagepicker/fileproviders/FileProvider;", "Ljava/io/File;", "generateFile", "Landroid/net/Uri;", "croppedUri", "Landroid/net/Uri;", "<init>", "(Landroid/net/Uri;)V", "expo-image-picker_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes5.dex */
public final class CropFileProvider implements FileProvider {
    private final Uri croppedUri;

    public CropFileProvider(Uri croppedUri) {
        s.g(croppedUri, "croppedUri");
        this.croppedUri = croppedUri;
    }

    @Override // expo.modules.imagepicker.fileproviders.FileProvider
    public File generateFile() {
        String path = this.croppedUri.getPath();
        s.e(path);
        return new File(path);
    }
}