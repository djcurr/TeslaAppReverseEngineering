package cy;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;

/* loaded from: classes5.dex */
public interface a {
    void onConnected(Bundle bundle);

    void onConnectionFailed(ConnectionResult connectionResult);

    void onConnectionSuspended(int i11);
}