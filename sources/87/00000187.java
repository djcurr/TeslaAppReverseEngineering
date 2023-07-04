package android.support.v4.media.session;

import android.os.Bundle;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.b;
import android.support.v4.media.session.c;
import android.util.Log;
import androidx.core.app.e;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes.dex */
class MediaControllerCompat$MediaControllerImplApi21 {

    /* renamed from: a  reason: collision with root package name */
    final Object f965a;

    /* renamed from: b  reason: collision with root package name */
    private final List<c> f966b;

    /* renamed from: c  reason: collision with root package name */
    private HashMap<c, a> f967c;

    /* renamed from: d  reason: collision with root package name */
    final MediaSessionCompat.Token f968d;

    /* loaded from: classes.dex */
    private static class ExtraBinderRequestResultReceiver extends ResultReceiver {

        /* renamed from: a  reason: collision with root package name */
        private WeakReference<MediaControllerCompat$MediaControllerImplApi21> f969a;

        @Override // android.os.ResultReceiver
        protected void onReceiveResult(int i11, Bundle bundle) {
            MediaControllerCompat$MediaControllerImplApi21 mediaControllerCompat$MediaControllerImplApi21 = this.f969a.get();
            if (mediaControllerCompat$MediaControllerImplApi21 == null || bundle == null) {
                return;
            }
            synchronized (mediaControllerCompat$MediaControllerImplApi21.f965a) {
                mediaControllerCompat$MediaControllerImplApi21.f968d.b(b.a.J(e.a(bundle, "android.support.v4.media.session.EXTRA_BINDER")));
                mediaControllerCompat$MediaControllerImplApi21.f968d.c(a5.a.b(bundle, "android.support.v4.media.session.SESSION_TOKEN2"));
                mediaControllerCompat$MediaControllerImplApi21.a();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class a extends c.b {
        a(c cVar) {
            super(cVar);
        }

        @Override // android.support.v4.media.session.c.b, android.support.v4.media.session.a
        public void A(CharSequence charSequence) {
            throw new AssertionError();
        }

        @Override // android.support.v4.media.session.c.b, android.support.v4.media.session.a
        public void i(List<MediaSessionCompat.QueueItem> list) {
            throw new AssertionError();
        }

        @Override // android.support.v4.media.session.c.b, android.support.v4.media.session.a
        public void j() {
            throw new AssertionError();
        }

        @Override // android.support.v4.media.session.c.b, android.support.v4.media.session.a
        public void k(MediaMetadataCompat mediaMetadataCompat) {
            throw new AssertionError();
        }

        @Override // android.support.v4.media.session.c.b, android.support.v4.media.session.a
        public void q(ParcelableVolumeInfo parcelableVolumeInfo) {
            throw new AssertionError();
        }

        @Override // android.support.v4.media.session.c.b, android.support.v4.media.session.a
        public void s(Bundle bundle) {
            throw new AssertionError();
        }
    }

    void a() {
        if (this.f968d.a() == null) {
            return;
        }
        for (c cVar : this.f966b) {
            a aVar = new a(cVar);
            this.f967c.put(cVar, aVar);
            cVar.f999a = aVar;
            try {
                this.f968d.a().r(aVar);
                cVar.i(13, null, null);
            } catch (RemoteException e11) {
                Log.e("MediaControllerCompat", "Dead object in registerCallback.", e11);
            }
        }
        this.f966b.clear();
    }
}