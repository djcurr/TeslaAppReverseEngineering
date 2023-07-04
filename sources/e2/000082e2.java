package l80;

import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLite;
import com.google.protobuf.Parser;
import okhttp3.ResponseBody;
import retrofit2.f;

/* loaded from: classes4.dex */
final class c<T extends MessageLite> implements f<ResponseBody, T> {

    /* renamed from: a  reason: collision with root package name */
    private final Parser<T> f37114a;

    /* renamed from: b  reason: collision with root package name */
    private final ExtensionRegistryLite f37115b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(Parser<T> parser, ExtensionRegistryLite extensionRegistryLite) {
        this.f37114a = parser;
        this.f37115b = extensionRegistryLite;
    }

    @Override // retrofit2.f
    /* renamed from: a */
    public T convert(ResponseBody responseBody) {
        T parseFrom;
        try {
            try {
                if (this.f37115b == null) {
                    parseFrom = this.f37114a.parseFrom(responseBody.byteStream());
                } else {
                    parseFrom = this.f37114a.parseFrom(responseBody.byteStream(), this.f37115b);
                }
                return parseFrom;
            } catch (InvalidProtocolBufferException e11) {
                throw new RuntimeException(e11);
            }
        } finally {
            responseBody.close();
        }
    }
}