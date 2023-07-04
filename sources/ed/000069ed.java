package expo.modules.imagepicker;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0001\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lexpo/modules/imagepicker/MediaTypes;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "IMAGES", "VIDEOS", "ALL", "expo-image-picker_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes5.dex */
public enum MediaTypes {
    IMAGES,
    VIDEOS,
    ALL;
    
    public static final Companion Companion = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b"}, d2 = {"Lexpo/modules/imagepicker/MediaTypes$Companion;", "", "", "type", "Lexpo/modules/imagepicker/MediaTypes;", "fromString", "<init>", "()V", "expo-image-picker_release"}, k = 1, mv = {1, 5, 1})
    /* loaded from: classes5.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final MediaTypes fromString(String type) {
            s.g(type, "type");
            int hashCode = type.hashCode();
            if (hashCode != -2101383528) {
                if (hashCode != -1732810888) {
                    if (hashCode == 65921 && type.equals("All")) {
                        return MediaTypes.ALL;
                    }
                } else if (type.equals("Videos")) {
                    return MediaTypes.VIDEOS;
                }
            } else if (type.equals("Images")) {
                return MediaTypes.IMAGES;
            }
            return null;
        }
    }
}