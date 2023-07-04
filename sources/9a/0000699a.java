package expo.modules.filesystem;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0001\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0007B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lexpo/modules/filesystem/UploadType;", "", "", "value", "I", "<init>", "(Ljava/lang/String;II)V", "Companion", "INVALID", "BINARY_CONTENT", "MULTIPART", "expo-file-system_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes5.dex */
public enum UploadType {
    INVALID(-1),
    BINARY_CONTENT(0),
    MULTIPART(1);
    
    public static final Companion Companion = new Companion(null);
    private final int value;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b"}, d2 = {"Lexpo/modules/filesystem/UploadType$Companion;", "", "", "value", "Lexpo/modules/filesystem/UploadType;", "fromInt", "<init>", "()V", "expo-file-system_release"}, k = 1, mv = {1, 5, 1})
    /* loaded from: classes5.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final UploadType fromInt(int i11) {
            UploadType uploadType;
            boolean z11;
            UploadType[] values = UploadType.values();
            int length = values.length;
            int i12 = 0;
            while (true) {
                if (i12 >= length) {
                    uploadType = null;
                    break;
                }
                uploadType = values[i12];
                i12++;
                if (i11 == uploadType.value) {
                    z11 = true;
                    continue;
                } else {
                    z11 = false;
                    continue;
                }
                if (z11) {
                    break;
                }
            }
            return uploadType == null ? UploadType.INVALID : uploadType;
        }
    }

    UploadType(int i11) {
        this.value = i11;
    }
}