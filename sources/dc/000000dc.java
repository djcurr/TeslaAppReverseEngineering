package al;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import com.google.android.vending.expansion.downloader.impl.DownloaderService;
import java.lang.ref.WeakReference;

/* loaded from: classes3.dex */
public class c {

    /* loaded from: classes3.dex */
    private static class a implements f {

        /* renamed from: a  reason: collision with root package name */
        private Messenger f557a;

        public a(Messenger messenger) {
            this.f557a = messenger;
        }

        private void a(int i11, Bundle bundle) {
            Message obtain = Message.obtain((Handler) null, i11);
            obtain.setData(bundle);
            try {
                this.f557a.send(obtain);
            } catch (RemoteException e11) {
                e11.printStackTrace();
            }
        }

        @Override // al.f
        public void onDownloadProgress(al.b bVar) {
            Bundle bundle = new Bundle(1);
            bundle.putParcelable("progress", bVar);
            a(11, bundle);
        }

        @Override // al.f
        public void onDownloadStateChanged(int i11) {
            Bundle bundle = new Bundle(1);
            bundle.putInt("newState", i11);
            a(10, bundle);
        }

        @Override // al.f
        public void onServiceConnected(Messenger messenger) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class b implements h {

        /* renamed from: a  reason: collision with root package name */
        private f f558a;

        /* renamed from: b  reason: collision with root package name */
        private Class<?> f559b;

        /* renamed from: c  reason: collision with root package name */
        private boolean f560c;

        /* renamed from: d  reason: collision with root package name */
        private Messenger f561d;

        /* renamed from: e  reason: collision with root package name */
        private Context f562e;

        /* renamed from: f  reason: collision with root package name */
        private final HandlerC0012b f563f;

        /* renamed from: g  reason: collision with root package name */
        final Messenger f564g;

        /* renamed from: h  reason: collision with root package name */
        private ServiceConnection f565h;

        /* loaded from: classes3.dex */
        class a implements ServiceConnection {
            a() {
            }

            @Override // android.content.ServiceConnection
            public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
                b.this.f561d = new Messenger(iBinder);
                b.this.f558a.onServiceConnected(b.this.f561d);
            }

            @Override // android.content.ServiceConnection
            public void onServiceDisconnected(ComponentName componentName) {
                b.this.f561d = null;
            }
        }

        /* renamed from: al.c$b$b  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        private static class HandlerC0012b extends Handler {

            /* renamed from: a  reason: collision with root package name */
            private final WeakReference<b> f567a;

            public HandlerC0012b(b bVar) {
                this.f567a = new WeakReference<>(bVar);
            }

            @Override // android.os.Handler
            public void handleMessage(Message message) {
                b bVar = this.f567a.get();
                if (bVar != null) {
                    bVar.h(message);
                }
            }
        }

        public b(f fVar, Class<?> cls) {
            this.f558a = null;
            HandlerC0012b handlerC0012b = new HandlerC0012b(this);
            this.f563f = handlerC0012b;
            this.f564g = new Messenger(handlerC0012b);
            this.f565h = new a();
            this.f558a = fVar;
            this.f559b = cls;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void h(Message message) {
            switch (message.what) {
                case 10:
                    this.f558a.onDownloadStateChanged(message.getData().getInt("newState"));
                    return;
                case 11:
                    Bundle data = message.getData();
                    Context context = this.f562e;
                    if (context != null) {
                        data.setClassLoader(context.getClassLoader());
                        this.f558a.onDownloadProgress((al.b) message.getData().getParcelable("progress"));
                        return;
                    }
                    return;
                case 12:
                    this.f558a.onServiceConnected((Messenger) message.getData().getParcelable(DownloaderService.EXTRA_MESSAGE_HANDLER));
                    return;
                default:
                    return;
            }
        }

        @Override // al.h
        public void a(Context context) {
            this.f562e = context;
            Intent intent = new Intent(context, this.f559b);
            intent.putExtra(DownloaderService.EXTRA_MESSAGE_HANDLER, this.f564g);
            if (context.bindService(intent, this.f565h, 2)) {
                this.f560c = true;
            }
        }

        @Override // al.h
        public Messenger b() {
            return this.f564g;
        }

        @Override // al.h
        public void c(Context context) {
            if (this.f560c) {
                context.unbindService(this.f565h);
                this.f560c = false;
            }
            this.f562e = null;
        }
    }

    public static f a(Messenger messenger) {
        return new a(messenger);
    }

    public static h b(f fVar, Class<?> cls) {
        return new b(fVar, cls);
    }

    public static int c(Context context, PendingIntent pendingIntent, Class<?> cls) {
        return DownloaderService.startDownloadServiceIfRequired(context, pendingIntent, cls);
    }

    public static int d(Context context, Intent intent, Class<?> cls) {
        return DownloaderService.startDownloadServiceIfRequired(context, intent, cls);
    }
}