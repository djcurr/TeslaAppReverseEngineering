package android.support.v4.media.session;

import android.media.MediaMetadata;
import android.media.session.MediaController;
import android.media.session.MediaSession;
import android.media.session.PlaybackState;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.a;
import androidx.media.AudioAttributesCompat;
import java.lang.ref.WeakReference;
import java.util.List;

/* loaded from: classes.dex */
public abstract class c implements IBinder.DeathRecipient {

    /* renamed from: a  reason: collision with root package name */
    android.support.v4.media.session.a f999a;

    /* loaded from: classes.dex */
    private static class a extends MediaController.Callback {

        /* renamed from: a  reason: collision with root package name */
        private final WeakReference<c> f1000a;

        a(c cVar) {
            this.f1000a = new WeakReference<>(cVar);
        }

        @Override // android.media.session.MediaController.Callback
        public void onAudioInfoChanged(MediaController.PlaybackInfo playbackInfo) {
            c cVar = this.f1000a.get();
            if (cVar != null) {
                cVar.a(new d(playbackInfo.getPlaybackType(), AudioAttributesCompat.c(playbackInfo.getAudioAttributes()), playbackInfo.getVolumeControl(), playbackInfo.getMaxVolume(), playbackInfo.getCurrentVolume()));
            }
        }

        @Override // android.media.session.MediaController.Callback
        public void onExtrasChanged(Bundle bundle) {
            MediaSessionCompat.a(bundle);
            c cVar = this.f1000a.get();
            if (cVar != null) {
                cVar.b(bundle);
            }
        }

        @Override // android.media.session.MediaController.Callback
        public void onMetadataChanged(MediaMetadata mediaMetadata) {
            c cVar = this.f1000a.get();
            if (cVar != null) {
                cVar.c(MediaMetadataCompat.a(mediaMetadata));
            }
        }

        @Override // android.media.session.MediaController.Callback
        public void onPlaybackStateChanged(PlaybackState playbackState) {
            c cVar = this.f1000a.get();
            if (cVar == null || cVar.f999a != null) {
                return;
            }
            cVar.d(PlaybackStateCompat.a(playbackState));
        }

        @Override // android.media.session.MediaController.Callback
        public void onQueueChanged(List<MediaSession.QueueItem> list) {
            c cVar = this.f1000a.get();
            if (cVar != null) {
                cVar.e(MediaSessionCompat.QueueItem.b(list));
            }
        }

        @Override // android.media.session.MediaController.Callback
        public void onQueueTitleChanged(CharSequence charSequence) {
            c cVar = this.f1000a.get();
            if (cVar != null) {
                cVar.f(charSequence);
            }
        }

        @Override // android.media.session.MediaController.Callback
        public void onSessionDestroyed() {
            c cVar = this.f1000a.get();
            if (cVar != null) {
                cVar.g();
            }
        }

        @Override // android.media.session.MediaController.Callback
        public void onSessionEvent(String str, Bundle bundle) {
            MediaSessionCompat.a(bundle);
            c cVar = this.f1000a.get();
            if (cVar != null) {
                if (cVar.f999a == null || Build.VERSION.SDK_INT >= 23) {
                    cVar.h(str, bundle);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class b extends a.AbstractBinderC0031a {

        /* renamed from: a  reason: collision with root package name */
        private final WeakReference<c> f1001a;

        /* JADX INFO: Access modifiers changed from: package-private */
        public b(c cVar) {
            this.f1001a = new WeakReference<>(cVar);
        }

        public void A(CharSequence charSequence) {
            c cVar = this.f1001a.get();
            if (cVar != null) {
                cVar.i(6, charSequence, null);
            }
        }

        @Override // android.support.v4.media.session.a
        public void I(PlaybackStateCompat playbackStateCompat) {
            c cVar = this.f1001a.get();
            if (cVar != null) {
                cVar.i(2, playbackStateCompat, null);
            }
        }

        @Override // android.support.v4.media.session.a
        public void f(int i11) {
            c cVar = this.f1001a.get();
            if (cVar != null) {
                cVar.i(9, Integer.valueOf(i11), null);
            }
        }

        @Override // android.support.v4.media.session.a
        public void g(String str, Bundle bundle) {
            c cVar = this.f1001a.get();
            if (cVar != null) {
                cVar.i(1, str, bundle);
            }
        }

        @Override // android.support.v4.media.session.a
        public void h() {
            c cVar = this.f1001a.get();
            if (cVar != null) {
                cVar.i(13, null, null);
            }
        }

        public void i(List<MediaSessionCompat.QueueItem> list) {
            c cVar = this.f1001a.get();
            if (cVar != null) {
                cVar.i(5, list, null);
            }
        }

        public void j() {
            c cVar = this.f1001a.get();
            if (cVar != null) {
                cVar.i(8, null, null);
            }
        }

        public void k(MediaMetadataCompat mediaMetadataCompat) {
            c cVar = this.f1001a.get();
            if (cVar != null) {
                cVar.i(3, mediaMetadataCompat, null);
            }
        }

        @Override // android.support.v4.media.session.a
        public void l(int i11) {
            c cVar = this.f1001a.get();
            if (cVar != null) {
                cVar.i(12, Integer.valueOf(i11), null);
            }
        }

        public void q(ParcelableVolumeInfo parcelableVolumeInfo) {
            c cVar = this.f1001a.get();
            if (cVar != null) {
                cVar.i(4, parcelableVolumeInfo != null ? new d(parcelableVolumeInfo.f977a, parcelableVolumeInfo.f978b, parcelableVolumeInfo.f979c, parcelableVolumeInfo.f980d, parcelableVolumeInfo.f981e) : null, null);
            }
        }

        public void s(Bundle bundle) {
            c cVar = this.f1001a.get();
            if (cVar != null) {
                cVar.i(7, bundle, null);
            }
        }

        @Override // android.support.v4.media.session.a
        public void w(boolean z11) {
            c cVar = this.f1001a.get();
            if (cVar != null) {
                cVar.i(11, Boolean.valueOf(z11), null);
            }
        }

        @Override // android.support.v4.media.session.a
        public void z(boolean z11) {
        }
    }

    public c() {
        if (Build.VERSION.SDK_INT >= 21) {
            new a(this);
        } else {
            this.f999a = new b(this);
        }
    }

    public void a(d dVar) {
    }

    public void b(Bundle bundle) {
    }

    @Override // android.os.IBinder.DeathRecipient
    public void binderDied() {
        i(8, null, null);
    }

    public void c(MediaMetadataCompat mediaMetadataCompat) {
    }

    public void d(PlaybackStateCompat playbackStateCompat) {
    }

    public void e(List<MediaSessionCompat.QueueItem> list) {
    }

    public void f(CharSequence charSequence) {
    }

    public void g() {
    }

    public void h(String str, Bundle bundle) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void i(int i11, Object obj, Bundle bundle) {
    }
}