package com.oney.WebRTCModule;

import android.app.Activity;
import android.content.Intent;
import android.media.projection.MediaProjectionManager;
import android.util.DisplayMetrics;
import android.util.Log;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.BaseActivityEventListener;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;
import org.webrtc.AudioSource;
import org.webrtc.AudioTrack;
import org.webrtc.Camera1Enumerator;
import org.webrtc.Camera2Enumerator;
import org.webrtc.CameraEnumerator;
import org.webrtc.MediaConstraints;
import org.webrtc.MediaSource;
import org.webrtc.MediaStream;
import org.webrtc.MediaStreamTrack;
import org.webrtc.PeerConnectionFactory;
import org.webrtc.SurfaceTextureHelper;
import org.webrtc.VideoCapturer;
import org.webrtc.VideoSource;
import org.webrtc.VideoTrack;

/* loaded from: classes2.dex */
public class i {

    /* renamed from: g */
    private static final String f18011g = WebRTCModule.TAG;

    /* renamed from: h */
    private static final int f18012h = (int) (Math.random() * 32767.0d);

    /* renamed from: a */
    private final CameraEnumerator f18013a;

    /* renamed from: b */
    private final ReactApplicationContext f18014b;

    /* renamed from: c */
    private final Map<String, d> f18015c = new HashMap();

    /* renamed from: d */
    private final WebRTCModule f18016d;

    /* renamed from: e */
    private Promise f18017e;

    /* renamed from: f */
    private Intent f18018f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class a extends BaseActivityEventListener {
        a() {
            i.this = r1;
        }

        @Override // com.facebook.react.bridge.BaseActivityEventListener, com.facebook.react.bridge.ActivityEventListener
        public void onActivityResult(Activity activity, int i11, int i12, Intent intent) {
            super.onActivityResult(activity, i11, i12, intent);
            if (i11 == i.f18012h) {
                if (i12 != -1) {
                    i.this.f18017e.reject("DOMException", "NotAllowedError");
                    i.this.f18017e = null;
                    return;
                }
                i.this.f18018f = intent;
                i.this.j();
            }
        }
    }

    /* loaded from: classes2.dex */
    public class b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Activity f18020a;

        /* renamed from: b */
        final /* synthetic */ MediaProjectionManager f18021b;

        b(i iVar, Activity activity, MediaProjectionManager mediaProjectionManager) {
            this.f18020a = activity;
            this.f18021b = mediaProjectionManager;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f18020a.startActivityForResult(this.f18021b.createScreenCaptureIntent(), i.f18012h);
        }
    }

    /* loaded from: classes2.dex */
    public interface c<T, U> {
        void accept(T t11, U u11);
    }

    /* loaded from: classes2.dex */
    public static class d {

        /* renamed from: a */
        public final MediaSource f18022a;

        /* renamed from: b */
        public final MediaStreamTrack f18023b;

        /* renamed from: c */
        public final com.oney.WebRTCModule.a f18024c;

        /* renamed from: d */
        private final SurfaceTextureHelper f18025d;

        /* renamed from: e */
        private boolean f18026e = false;

        public d(MediaStreamTrack mediaStreamTrack, MediaSource mediaSource, com.oney.WebRTCModule.a aVar, SurfaceTextureHelper surfaceTextureHelper) {
            this.f18023b = mediaStreamTrack;
            this.f18022a = mediaSource;
            this.f18024c = aVar;
            this.f18025d = surfaceTextureHelper;
        }

        public void a() {
            if (this.f18026e) {
                return;
            }
            com.oney.WebRTCModule.a aVar = this.f18024c;
            if (aVar != null && aVar.h()) {
                this.f18024c.b();
            }
            SurfaceTextureHelper surfaceTextureHelper = this.f18025d;
            if (surfaceTextureHelper != null) {
                surfaceTextureHelper.stopListening();
                this.f18025d.dispose();
            }
            this.f18022a.dispose();
            this.f18023b.dispose();
            this.f18026e = true;
        }
    }

    public i(WebRTCModule webRTCModule, ReactApplicationContext reactApplicationContext) {
        boolean z11;
        this.f18016d = webRTCModule;
        this.f18014b = reactApplicationContext;
        try {
            z11 = Camera2Enumerator.isSupported(reactApplicationContext);
        } catch (Throwable th2) {
            Log.w(f18011g, "Error checking for Camera2 API support.", th2);
            z11 = false;
        }
        if (z11) {
            Log.d(f18011g, "Creating video capturer using Camera2 API.");
            this.f18013a = new Camera2Enumerator(reactApplicationContext);
        } else {
            Log.d(f18011g, "Creating video capturer using Camera1 API.");
            this.f18013a = new Camera1Enumerator(false);
        }
        reactApplicationContext.addActivityEventListener(new a());
    }

    public static /* synthetic */ void a(Callback callback, String str, ArrayList arrayList) {
        t(callback, str, arrayList);
    }

    public static /* synthetic */ void b(i iVar, String str, ArrayList arrayList) {
        iVar.s(str, arrayList);
    }

    private void h(MediaConstraints mediaConstraints) {
        ArrayList arrayList = new ArrayList(mediaConstraints.mandatory.size());
        for (MediaConstraints.KeyValuePair keyValuePair : mediaConstraints.mandatory) {
            if (keyValuePair.getValue() != null) {
                arrayList.add(keyValuePair);
            } else {
                Log.d(f18011g, String.format("constraint %s is null, ignoring it", keyValuePair.getKey()));
            }
        }
        mediaConstraints.mandatory.clear();
        mediaConstraints.mandatory.addAll(arrayList);
    }

    private AudioTrack i(ReadableMap readableMap) {
        ReadableMap map = readableMap.getMap(MediaStreamTrack.AUDIO_TRACK_KIND);
        String str = f18011g;
        Log.d(str, "getUserMedia(audio): " + map);
        String uuid = UUID.randomUUID().toString();
        WebRTCModule webRTCModule = this.f18016d;
        PeerConnectionFactory peerConnectionFactory = webRTCModule.mFactory;
        MediaConstraints constraintsForOptions = webRTCModule.constraintsForOptions(map);
        h(constraintsForOptions);
        AudioSource createAudioSource = peerConnectionFactory.createAudioSource(constraintsForOptions);
        AudioTrack createAudioTrack = peerConnectionFactory.createAudioTrack(uuid, createAudioSource);
        this.f18015c.put(uuid, new d(createAudioTrack, createAudioSource, null, null));
        return createAudioTrack;
    }

    public void j() {
        VideoTrack k11 = k();
        if (k11 == null) {
            this.f18017e.reject(new RuntimeException("ScreenTrack is null."));
        } else {
            l(new MediaStreamTrack[]{k11}, new c() { // from class: com.oney.WebRTCModule.h
                {
                    i.this = this;
                }

                @Override // com.oney.WebRTCModule.i.c
                public final void accept(Object obj, Object obj2) {
                    i.b(i.this, (String) obj, (ArrayList) obj2);
                }
            });
        }
        this.f18018f = null;
        this.f18017e = null;
    }

    private VideoTrack k() {
        DisplayMetrics a11 = e.a(this.f18014b.getCurrentActivity());
        return m(new n(this.f18014b.getCurrentActivity(), a11.widthPixels, a11.heightPixels, this.f18018f));
    }

    private void l(MediaStreamTrack[] mediaStreamTrackArr, c<String, ArrayList<WritableMap>> cVar) {
        String uuid = UUID.randomUUID().toString();
        MediaStream createLocalMediaStream = this.f18016d.mFactory.createLocalMediaStream(uuid);
        ArrayList<WritableMap> arrayList = new ArrayList<>();
        for (MediaStreamTrack mediaStreamTrack : mediaStreamTrackArr) {
            if (mediaStreamTrack != null) {
                if (mediaStreamTrack instanceof AudioTrack) {
                    createLocalMediaStream.addTrack((AudioTrack) mediaStreamTrack);
                } else {
                    createLocalMediaStream.addTrack((VideoTrack) mediaStreamTrack);
                }
                WritableMap createMap = Arguments.createMap();
                String id2 = mediaStreamTrack.id();
                createMap.putBoolean("enabled", mediaStreamTrack.enabled());
                createMap.putString("id", id2);
                createMap.putString("kind", mediaStreamTrack.kind());
                createMap.putString("label", id2);
                createMap.putString("readyState", mediaStreamTrack.state().toString());
                createMap.putBoolean("remote", false);
                if (mediaStreamTrack instanceof VideoTrack) {
                    com.oney.WebRTCModule.a aVar = this.f18015c.get(id2).f18024c;
                    WritableMap createMap2 = Arguments.createMap();
                    createMap2.putInt(Snapshot.HEIGHT, aVar.d());
                    createMap2.putInt(Snapshot.WIDTH, aVar.e());
                    createMap2.putInt("frameRate", aVar.c());
                    createMap.putMap("settings", createMap2);
                }
                arrayList.add(createMap);
            }
        }
        Log.d(f18011g, "MediaStream id: " + uuid);
        this.f18016d.localStreams.put(uuid, createLocalMediaStream);
        cVar.accept(uuid, arrayList);
    }

    private VideoTrack m(com.oney.WebRTCModule.a aVar) {
        aVar.f();
        VideoCapturer videoCapturer = aVar.f17971d;
        if (videoCapturer == null) {
            return null;
        }
        PeerConnectionFactory peerConnectionFactory = this.f18016d.mFactory;
        SurfaceTextureHelper create = SurfaceTextureHelper.create("CaptureThread", f.b());
        if (create == null) {
            Log.d(f18011g, "Error creating SurfaceTextureHelper");
            return null;
        }
        VideoSource createVideoSource = peerConnectionFactory.createVideoSource(videoCapturer.isScreencast());
        videoCapturer.initialize(create, this.f18014b, createVideoSource.getCapturerObserver());
        String uuid = UUID.randomUUID().toString();
        VideoTrack createVideoTrack = peerConnectionFactory.createVideoTrack(uuid, createVideoSource);
        createVideoTrack.setEnabled(true);
        this.f18015c.put(uuid, new d(createVideoTrack, createVideoSource, aVar, create));
        aVar.g();
        return createVideoTrack;
    }

    public /* synthetic */ void s(String str, ArrayList arrayList) {
        WritableMap createMap = Arguments.createMap();
        createMap.putString("streamId", str);
        if (arrayList.size() == 0) {
            this.f18017e.reject(new RuntimeException("No ScreenTrackInfo found."));
            return;
        }
        createMap.putMap("track", (ReadableMap) arrayList.get(0));
        this.f18017e.resolve(createMap);
    }

    public static /* synthetic */ void t(Callback callback, String str, ArrayList arrayList) {
        WritableArray createArray = Arguments.createArray();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            createArray.pushMap((WritableMap) it2.next());
        }
        callback.invoke(str, createArray);
    }

    public void n(String str) {
        d remove = this.f18015c.remove(str);
        if (remove != null) {
            remove.a();
        }
    }

    public ReadableArray o() {
        WritableArray createArray = Arguments.createArray();
        String[] deviceNames = this.f18013a.getDeviceNames();
        for (int i11 = 0; i11 < deviceNames.length; i11++) {
            String str = deviceNames[i11];
            try {
                boolean isFrontFacing = this.f18013a.isFrontFacing(str);
                WritableMap createMap = Arguments.createMap();
                createMap.putString("facing", isFrontFacing ? "front" : "environment");
                createMap.putString("deviceId", "" + i11);
                createMap.putString("groupId", "");
                createMap.putString("label", str);
                createMap.putString("kind", "videoinput");
                createArray.pushMap(createMap);
            } catch (Exception unused) {
                Log.e(f18011g, "Failed to check the facing mode of camera");
            }
        }
        WritableMap createMap2 = Arguments.createMap();
        createMap2.putString("deviceId", "audio-1");
        createMap2.putString("groupId", "");
        createMap2.putString("label", "Audio");
        createMap2.putString("kind", "audioinput");
        createArray.pushMap(createMap2);
        return createArray;
    }

    public void p(Promise promise) {
        if (this.f18017e != null) {
            promise.reject(new RuntimeException("Another operation is pending."));
            return;
        }
        Activity currentActivity = this.f18014b.getCurrentActivity();
        if (currentActivity == null) {
            promise.reject(new RuntimeException("No current Activity."));
            return;
        }
        this.f18017e = promise;
        MediaProjectionManager mediaProjectionManager = (MediaProjectionManager) currentActivity.getApplication().getSystemService("media_projection");
        if (mediaProjectionManager != null) {
            UiThreadUtil.runOnUiThread(new b(this, currentActivity, mediaProjectionManager));
        } else {
            promise.reject(new RuntimeException("MediaProjectionManager is null."));
        }
    }

    public MediaStreamTrack q(String str) {
        d dVar = this.f18015c.get(str);
        if (dVar == null) {
            return null;
        }
        return dVar.f18023b;
    }

    public void r(ReadableMap readableMap, final Callback callback, Callback callback2) {
        VideoTrack videoTrack = null;
        AudioTrack i11 = readableMap.hasKey(MediaStreamTrack.AUDIO_TRACK_KIND) ? i(readableMap) : null;
        if (readableMap.hasKey(MediaStreamTrack.VIDEO_TRACK_KIND)) {
            ReadableMap map = readableMap.getMap(MediaStreamTrack.VIDEO_TRACK_KIND);
            String str = f18011g;
            Log.d(str, "getUserMedia(video): " + map);
            videoTrack = m(new com.oney.WebRTCModule.b(this.f18013a, map));
        }
        if (i11 == null && videoTrack == null) {
            callback2.invoke("DOMException", "AbortError");
        } else {
            l(new MediaStreamTrack[]{i11, videoTrack}, new c() { // from class: com.oney.WebRTCModule.g
                @Override // com.oney.WebRTCModule.i.c
                public final void accept(Object obj, Object obj2) {
                    i.a(callback, (String) obj, (ArrayList) obj2);
                }
            });
        }
    }

    public void u(String str, boolean z11) {
        com.oney.WebRTCModule.a aVar;
        d dVar = this.f18015c.get(str);
        if (dVar == null || (aVar = dVar.f18024c) == null) {
            return;
        }
        if (z11) {
            aVar.g();
        } else {
            aVar.h();
        }
    }

    public void v(String str) {
        d dVar = this.f18015c.get(str);
        if (dVar != null) {
            com.oney.WebRTCModule.a aVar = dVar.f18024c;
            if (aVar instanceof com.oney.WebRTCModule.b) {
                ((com.oney.WebRTCModule.b) aVar).m();
            }
        }
    }
}