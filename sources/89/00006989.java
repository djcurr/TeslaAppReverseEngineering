package expo.modules.filesystem;

import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.text.v;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u001a\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u00002\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u0002\"\u0016\u0010\u0003\u001a\u00020\u00008\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004\"\u001e\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00000\u00008\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004\"\u0016\u0010\u0007\u001a\u00020\u00008\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004\"\u0016\u0010\b\u001a\u00020\u00008\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0004\"\u0016\u0010\n\u001a\u00020\t8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000b\"\u0016\u0010\f\u001a\u00020\u00008\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0004\"\u0016\u0010\u000e\u001a\u00020\r8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"", "path", "slashifyFilePath", "NAME", "Ljava/lang/String;", "kotlin.jvm.PlatformType", "TAG", "EXDownloadProgressEventName", "EXUploadProgressEventName", "", "MIN_EVENT_DT_MS", "J", "HEADER_KEY", "", "DIR_PERMISSIONS_REQUEST_CODE", "I", "expo-file-system_release"}, k = 2, mv = {1, 5, 1})
/* loaded from: classes5.dex */
public final class FileSystemModuleKt {
    private static final int DIR_PERMISSIONS_REQUEST_CODE = 5394;
    private static final String EXDownloadProgressEventName = "expo-file-system.downloadProgress";
    private static final String EXUploadProgressEventName = "expo-file-system.uploadProgress";
    private static final String HEADER_KEY = "headers";
    private static final long MIN_EVENT_DT_MS = 100;
    private static final String NAME = "ExponentFileSystem";
    private static final String TAG = FileSystemModule.class.getSimpleName();

    /* JADX INFO: Access modifiers changed from: private */
    public static final String slashifyFilePath(String str) {
        boolean H;
        if (str == null) {
            return null;
        }
        H = v.H(str, "file:///", false, 2, null);
        return H ? str : Pattern.compile("^file:/*").matcher(str).replaceAll("file:///");
    }
}