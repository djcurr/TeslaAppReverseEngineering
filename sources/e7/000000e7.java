package al;

import android.os.Messenger;

/* loaded from: classes3.dex */
public interface g {
    void onClientUpdated(Messenger messenger);

    void requestAbortDownload();

    void requestContinueDownload();

    void requestDownloadStatus();

    void requestPauseDownload();

    void setDownloadFlags(int i11);
}