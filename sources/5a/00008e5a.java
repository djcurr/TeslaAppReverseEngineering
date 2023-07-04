package okhttp3;

import com.google.android.libraries.places.api.model.PlaceTypes;
import java.net.Socket;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0005\u001a\u00020\u0004H&J\n\u0010\u0007\u001a\u0004\u0018\u00010\u0006H&J\b\u0010\t\u001a\u00020\bH&¨\u0006\n"}, d2 = {"Lokhttp3/Connection;", "", "Lokhttp3/Route;", PlaceTypes.ROUTE, "Ljava/net/Socket;", "socket", "Lokhttp3/Handshake;", "handshake", "Lokhttp3/Protocol;", "protocol", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes5.dex */
public interface Connection {
    Handshake handshake();

    Protocol protocol();

    Route route();

    Socket socket();
}