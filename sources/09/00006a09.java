package expo.modules.imagepicker.fileproviders;

import expo.modules.core.utilities.FileUtilities;
import expo.modules.imagepicker.ImagePickerConstants;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.s;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0016\u0010\u0004\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lexpo/modules/imagepicker/fileproviders/CacheFileProvider;", "Lexpo/modules/imagepicker/fileproviders/FileProvider;", "Ljava/io/File;", "generateFile", "cacheFolder", "Ljava/io/File;", "", "extension", "Ljava/lang/String;", "<init>", "(Ljava/io/File;Ljava/lang/String;)V", "expo-image-picker_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes5.dex */
public final class CacheFileProvider implements FileProvider {
    private final File cacheFolder;
    private final String extension;

    public CacheFileProvider(File cacheFolder, String extension) {
        s.g(cacheFolder, "cacheFolder");
        s.g(extension, "extension");
        this.cacheFolder = cacheFolder;
        this.extension = extension;
    }

    @Override // expo.modules.imagepicker.fileproviders.FileProvider
    public File generateFile() {
        return new File(FileUtilities.generateOutputPath(this.cacheFolder, ImagePickerConstants.CACHE_DIR_NAME, this.extension));
    }
}