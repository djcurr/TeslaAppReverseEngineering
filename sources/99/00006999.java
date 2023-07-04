package expo.modules.filesystem;

import kotlin.Metadata;
import okhttp3.RequestBody;

@FunctionalInterface
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bç\u0080\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0005"}, d2 = {"Lexpo/modules/filesystem/RequestBodyDecorator;", "", "Lokhttp3/RequestBody;", "requestBody", "decorate", "expo-file-system_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes5.dex */
public interface RequestBodyDecorator {
    RequestBody decorate(RequestBody requestBody);
}