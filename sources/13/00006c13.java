package ezvcard.parameter;

/* loaded from: classes5.dex */
public class ImageType extends MediaTypeParameter {

    /* renamed from: d  reason: collision with root package name */
    private static final b<ImageType> f25394d = new b<>(ImageType.class);

    static {
        new ImageType("GIF", "image/gif", "gif");
        new ImageType("JPEG", "image/jpeg", "jpg");
        new ImageType("PNG", "image/png", "png");
    }

    private ImageType(String str, String str2, String str3) {
        super(str, str2, str3);
    }

    public static ImageType f(String str, String str2, String str3) {
        return (ImageType) f25394d.d(new String[]{str, str2, str3});
    }

    public static ImageType g(String str, String str2, String str3) {
        return (ImageType) f25394d.e(new String[]{str, str2, str3});
    }
}