package l80;

import com.google.protobuf.MessageLite;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import retrofit2.f;

/* loaded from: classes4.dex */
final class b<T extends MessageLite> implements f<T, RequestBody> {

    /* renamed from: a  reason: collision with root package name */
    private static final MediaType f37113a = MediaType.get("application/x-protobuf");

    @Override // retrofit2.f
    /* renamed from: a */
    public RequestBody convert(T t11) {
        return RequestBody.create(f37113a, t11.toByteArray());
    }
}