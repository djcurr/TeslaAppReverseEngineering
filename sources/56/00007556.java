package ig;

import com.facebook.imagepipeline.request.ImageRequestBuilder;
import com.facebook.react.bridge.ReadableMap;

/* loaded from: classes3.dex */
public class a extends com.facebook.imagepipeline.request.a {

    /* renamed from: x  reason: collision with root package name */
    private final ReadableMap f30394x;

    protected a(ImageRequestBuilder imageRequestBuilder, ReadableMap readableMap) {
        super(imageRequestBuilder);
        this.f30394x = readableMap;
    }

    public static a y(ImageRequestBuilder imageRequestBuilder, ReadableMap readableMap) {
        return new a(imageRequestBuilder, readableMap);
    }

    public ReadableMap z() {
        return this.f30394x;
    }
}