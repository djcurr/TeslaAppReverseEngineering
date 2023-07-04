package al;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import com.google.android.vending.expansion.downloader.impl.DownloaderService;
import java.lang.ref.WeakReference;

/* loaded from: classes3.dex */
public class d {

    /* loaded from: classes3.dex */
    private static class a implements g {

        /* renamed from: a  reason: collision with root package name */
        private Messenger f568a;

        public a(Messenger messenger) {
            this.f568a = messenger;
        }

        private void a(int i11, Bundle bundle) {
            Message obtain = Message.obtain((Handler) null, i11);
            obtain.setData(bundle);
            try {
                this.f568a.send(obtain);
            } catch (RemoteException e11) {
                e11.printStackTrace();
            }
        }

        @Override // al.g
        public void onClientUpdated(Messenger messenger) {
            Bundle bundle = new Bundle(1);
            bundle.putParcelable(DownloaderService.EXTRA_MESSAGE_HANDLER, messenger);
            a(6, bundle);
        }

        @Override // al.g
        public void requestAbortDownload() {
            a(1, new Bundle());
        }

        @Override // al.g
        public void requestContinueDownload() {
            a(4, new Bundle());
        }

        @Override // al.g
        public void requestDownloadStatus() {
            a(5, new Bundle());
        }

        @Override // al.g
        public void requestPauseDownload() {
            a(2, new Bundle());
        }

        @Override // al.g
        public void setDownloadFlags(int i11) {
            Bundle bundle = new Bundle();
            bundle.putInt("flags", i11);
            a(3, bundle);
        }
    }

    /* loaded from: classes3.dex */
    private static class b implements h {

        /* renamed from: a  reason: collision with root package name */
        private g f569a;

        /* renamed from: b  reason: collision with root package name */
        private final a f570b;

        /* renamed from: c  reason: collision with root package name */
        final Messenger f571c;

        /* loaded from: classes3.dex */
        private static class a extends Handler {

            /* renamed from: a  reason: collision with root package name */
            private final WeakReference<b> f572a;

            public a(b bVar) {
                this.f572a = new WeakReference<>(bVar);
            }

            @Override // android.os.Handler
            public void handleMessage(Message message) {
                b bVar = this.f572a.get();
                if (bVar != null) {
                    bVar.e(message);
                }
            }
        }

        public b(g gVar) {
            this.f569a = null;
            a aVar = new a(this);
            this.f570b = aVar;
            this.f571c = new Messenger(aVar);
            this.f569a = gVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void e(Message message) {
            switch (message.what) {
                case 1:
                    this.f569a.requestAbortDownload();
                    return;
                case 2:
                    this.f569a.requestPauseDownload();
                    return;
                case 3:
                    this.f569a.setDownloadFlags(message.getData().getInt("flags"));
                    return;
                case 4:
                    this.f569a.requestContinueDownload();
                    return;
                case 5:
                    this.f569a.requestDownloadStatus();
                    return;
                case 6:
                    this.f569a.onClientUpdated((Messenger) message.getData().getParcelable(DownloaderService.EXTRA_MESSAGE_HANDLER));
                    return;
                default:
                    return;
            }
        }

        @Override // al.h
        public void a(Context context) {
        }

        @Override // al.h
        public Messenger b() {
            return this.f571c;
        }

        @Override // al.h
        public void c(Context context) {
        }
    }

    public static g a(Messenger messenger) {
        return new a(messenger);
    }

    public static h b(g gVar) {
        return new b(gVar);
    }
}