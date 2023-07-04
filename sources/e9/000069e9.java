package expo.modules.imagepicker;

import com.facebook.react.bridge.BaseJavaModule;
import expo.modules.core.Promise;
import expo.modules.imagepicker.MediaTypes;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0014\b\u0086\b\u0018\u0000 (2\u00020\u0001:\u0001(BE\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0004\u0012\f\u0010\u000f\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0006\u0012\u0006\u0010\u0010\u001a\u00020\u0004\u0012\u0006\u0010\u0011\u001a\u00020\t\u0012\u0006\u0010\u0012\u001a\u00020\u0004\u0012\u0006\u0010\u0013\u001a\u00020\u0002¢\u0006\u0004\b&\u0010'J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u000f\u0010\u0007\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0006HÆ\u0003J\t\u0010\b\u001a\u00020\u0004HÆ\u0003J\t\u0010\n\u001a\u00020\tHÆ\u0003J\t\u0010\u000b\u001a\u00020\u0004HÆ\u0003J\t\u0010\f\u001a\u00020\u0002HÆ\u0003JU\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u00042\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00062\b\b\u0002\u0010\u0010\u001a\u00020\u00042\b\b\u0002\u0010\u0011\u001a\u00020\t2\b\b\u0002\u0010\u0012\u001a\u00020\u00042\b\b\u0002\u0010\u0013\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0016\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u0019\u001a\u00020\u00042\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\r\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\r\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\u000e\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u001d\u001a\u0004\b\u000e\u0010\u001eR\u001f\u0010\u000f\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u001f\u001a\u0004\b \u0010!R\u0019\u0010\u0010\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u001d\u001a\u0004\b\u0010\u0010\u001eR\u0019\u0010\u0011\u001a\u00020\t8\u0006@\u0006¢\u0006\f\n\u0004\b\u0011\u0010\"\u001a\u0004\b#\u0010$R\u0019\u0010\u0012\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u001d\u001a\u0004\b\u0012\u0010\u001eR\u0019\u0010\u0013\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u001a\u001a\u0004\b%\u0010\u001c¨\u0006)"}, d2 = {"Lexpo/modules/imagepicker/ImagePickerOptions;", "", "", "component1", "", "component2", "", "component3", "component4", "Lexpo/modules/imagepicker/MediaTypes;", "component5", "component6", "component7", ImagePickerConstants.OPTION_QUALITY, "isAllowsEditing", "forceAspect", "isBase64", ImagePickerConstants.OPTION_MEDIA_TYPES, "isExif", ImagePickerConstants.OPTION_VIDEO_MAX_DURATION, "copy", "", "toString", "hashCode", "other", "equals", "I", "getQuality", "()I", "Z", "()Z", "Ljava/util/List;", "getForceAspect", "()Ljava/util/List;", "Lexpo/modules/imagepicker/MediaTypes;", "getMediaTypes", "()Lexpo/modules/imagepicker/MediaTypes;", "getVideoMaxDuration", "<init>", "(IZLjava/util/List;ZLexpo/modules/imagepicker/MediaTypes;ZI)V", "Companion", "expo-image-picker_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes5.dex */
public final class ImagePickerOptions {
    public static final Companion Companion = new Companion(null);
    private final List<?> forceAspect;
    private final boolean isAllowsEditing;
    private final boolean isBase64;
    private final boolean isExif;
    private final MediaTypes mediaTypes;
    private final int quality;
    private final int videoMaxDuration;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ&\u0010\b\u001a\u0004\u0018\u00010\u00072\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u0005¨\u0006\u000b"}, d2 = {"Lexpo/modules/imagepicker/ImagePickerOptions$Companion;", "", "", "", "options", "Lexpo/modules/core/Promise;", BaseJavaModule.METHOD_TYPE_PROMISE, "Lexpo/modules/imagepicker/ImagePickerOptions;", "optionsFromMap", "<init>", "()V", "expo-image-picker_release"}, k = 1, mv = {1, 5, 1})
    /* loaded from: classes5.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ImagePickerOptions optionsFromMap(Map<String, ? extends Object> options, Promise promise) {
            List list;
            int intValue;
            s.g(options, "options");
            s.g(promise, "promise");
            Object obj = options.get(ImagePickerConstants.OPTION_QUALITY);
            int i11 = 100;
            if (obj != null) {
                if (obj instanceof Number) {
                    i11 = (int) (((Number) obj).doubleValue() * 100);
                } else {
                    promise.reject(ImagePickerConstants.ERR_INVALID_OPTION, "Quality can not be `null`.");
                    return null;
                }
            }
            int i12 = i11;
            Object obj2 = options.get(ImagePickerConstants.OPTION_ALLOWS_EDITING);
            Boolean bool = obj2 instanceof Boolean ? (Boolean) obj2 : null;
            boolean booleanValue = bool == null ? false : bool.booleanValue();
            Object obj3 = options.get(ImagePickerConstants.OPTION_ASPECT);
            if (obj3 != null) {
                if (obj3 instanceof List) {
                    List list2 = (List) obj3;
                    if (list2.size() == 2 && (list2.get(0) instanceof Number) && (list2.get(1) instanceof Number)) {
                        list = list2;
                    }
                }
                promise.reject(ImagePickerConstants.ERR_INVALID_OPTION, "'Aspect option must be of form [Number, Number]");
                return null;
            }
            list = null;
            Object obj4 = options.get(ImagePickerConstants.OPTION_BASE64);
            Boolean bool2 = obj4 instanceof Boolean ? (Boolean) obj4 : null;
            boolean booleanValue2 = bool2 == null ? false : bool2.booleanValue();
            MediaTypes.Companion companion = MediaTypes.Companion;
            Object obj5 = options.get(ImagePickerConstants.OPTION_MEDIA_TYPES);
            String str = obj5 instanceof String ? (String) obj5 : null;
            if (str == null) {
                str = "Images";
            }
            MediaTypes fromString = companion.fromString(str);
            if (fromString == null) {
                promise.reject(ImagePickerConstants.ERR_INVALID_OPTION, "Unknown media types: " + options.get(ImagePickerConstants.OPTION_MEDIA_TYPES));
                return null;
            }
            Object obj6 = options.get(ImagePickerConstants.OPTION_EXIF);
            Boolean bool3 = obj6 instanceof Boolean ? (Boolean) obj6 : null;
            boolean booleanValue3 = bool3 == null ? false : bool3.booleanValue();
            Object obj7 = options.get(ImagePickerConstants.OPTION_VIDEO_MAX_DURATION);
            if (obj7 != null) {
                if (obj7 instanceof Number) {
                    Number number = (Number) obj7;
                    if (number.intValue() >= 0) {
                        intValue = number.intValue();
                    }
                }
                promise.reject(ImagePickerConstants.ERR_INVALID_OPTION, "videoMaxDuration must be a non-negative integer");
                return null;
            }
            intValue = 0;
            return new ImagePickerOptions(i12, booleanValue, list, booleanValue2, fromString, booleanValue3, intValue);
        }
    }

    public ImagePickerOptions(int i11, boolean z11, List<?> list, boolean z12, MediaTypes mediaTypes, boolean z13, int i12) {
        s.g(mediaTypes, "mediaTypes");
        this.quality = i11;
        this.isAllowsEditing = z11;
        this.forceAspect = list;
        this.isBase64 = z12;
        this.mediaTypes = mediaTypes;
        this.isExif = z13;
        this.videoMaxDuration = i12;
    }

    public static /* synthetic */ ImagePickerOptions copy$default(ImagePickerOptions imagePickerOptions, int i11, boolean z11, List list, boolean z12, MediaTypes mediaTypes, boolean z13, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = imagePickerOptions.quality;
        }
        if ((i13 & 2) != 0) {
            z11 = imagePickerOptions.isAllowsEditing;
        }
        boolean z14 = z11;
        List<?> list2 = list;
        if ((i13 & 4) != 0) {
            list2 = imagePickerOptions.forceAspect;
        }
        List list3 = list2;
        if ((i13 & 8) != 0) {
            z12 = imagePickerOptions.isBase64;
        }
        boolean z15 = z12;
        if ((i13 & 16) != 0) {
            mediaTypes = imagePickerOptions.mediaTypes;
        }
        MediaTypes mediaTypes2 = mediaTypes;
        if ((i13 & 32) != 0) {
            z13 = imagePickerOptions.isExif;
        }
        boolean z16 = z13;
        if ((i13 & 64) != 0) {
            i12 = imagePickerOptions.videoMaxDuration;
        }
        return imagePickerOptions.copy(i11, z14, list3, z15, mediaTypes2, z16, i12);
    }

    public final int component1() {
        return this.quality;
    }

    public final boolean component2() {
        return this.isAllowsEditing;
    }

    public final List<?> component3() {
        return this.forceAspect;
    }

    public final boolean component4() {
        return this.isBase64;
    }

    public final MediaTypes component5() {
        return this.mediaTypes;
    }

    public final boolean component6() {
        return this.isExif;
    }

    public final int component7() {
        return this.videoMaxDuration;
    }

    public final ImagePickerOptions copy(int i11, boolean z11, List<?> list, boolean z12, MediaTypes mediaTypes, boolean z13, int i12) {
        s.g(mediaTypes, "mediaTypes");
        return new ImagePickerOptions(i11, z11, list, z12, mediaTypes, z13, i12);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ImagePickerOptions) {
            ImagePickerOptions imagePickerOptions = (ImagePickerOptions) obj;
            return this.quality == imagePickerOptions.quality && this.isAllowsEditing == imagePickerOptions.isAllowsEditing && s.c(this.forceAspect, imagePickerOptions.forceAspect) && this.isBase64 == imagePickerOptions.isBase64 && this.mediaTypes == imagePickerOptions.mediaTypes && this.isExif == imagePickerOptions.isExif && this.videoMaxDuration == imagePickerOptions.videoMaxDuration;
        }
        return false;
    }

    public final List<?> getForceAspect() {
        return this.forceAspect;
    }

    public final MediaTypes getMediaTypes() {
        return this.mediaTypes;
    }

    public final int getQuality() {
        return this.quality;
    }

    public final int getVideoMaxDuration() {
        return this.videoMaxDuration;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = Integer.hashCode(this.quality) * 31;
        boolean z11 = this.isAllowsEditing;
        int i11 = z11;
        if (z11 != 0) {
            i11 = 1;
        }
        int i12 = (hashCode + i11) * 31;
        List<?> list = this.forceAspect;
        int hashCode2 = (i12 + (list == null ? 0 : list.hashCode())) * 31;
        boolean z12 = this.isBase64;
        int i13 = z12;
        if (z12 != 0) {
            i13 = 1;
        }
        int hashCode3 = (((hashCode2 + i13) * 31) + this.mediaTypes.hashCode()) * 31;
        boolean z13 = this.isExif;
        return ((hashCode3 + (z13 ? 1 : z13 ? 1 : 0)) * 31) + Integer.hashCode(this.videoMaxDuration);
    }

    public final boolean isAllowsEditing() {
        return this.isAllowsEditing;
    }

    public final boolean isBase64() {
        return this.isBase64;
    }

    public final boolean isExif() {
        return this.isExif;
    }

    public String toString() {
        int i11 = this.quality;
        boolean z11 = this.isAllowsEditing;
        List<?> list = this.forceAspect;
        boolean z12 = this.isBase64;
        MediaTypes mediaTypes = this.mediaTypes;
        boolean z13 = this.isExif;
        int i12 = this.videoMaxDuration;
        return "ImagePickerOptions(quality=" + i11 + ", isAllowsEditing=" + z11 + ", forceAspect=" + list + ", isBase64=" + z12 + ", mediaTypes=" + mediaTypes + ", isExif=" + z13 + ", videoMaxDuration=" + i12 + ")";
    }
}