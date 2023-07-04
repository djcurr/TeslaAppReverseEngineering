package com.oney.WebRTCModule;

import android.util.Log;
import android.util.SparseArray;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import org.webrtc.AddIceObserver;
import org.webrtc.AudioTrack;
import org.webrtc.DefaultVideoDecoderFactory;
import org.webrtc.DefaultVideoEncoderFactory;
import org.webrtc.EglBase;
import org.webrtc.IceCandidate;
import org.webrtc.MediaConstraints;
import org.webrtc.MediaStream;
import org.webrtc.MediaStreamTrack;
import org.webrtc.PeerConnection;
import org.webrtc.PeerConnectionFactory;
import org.webrtc.SdpObserver;
import org.webrtc.SessionDescription;
import org.webrtc.SoftwareVideoDecoderFactory;
import org.webrtc.SoftwareVideoEncoderFactory;
import org.webrtc.VideoDecoderFactory;
import org.webrtc.VideoEncoderFactory;
import org.webrtc.VideoTrack;
import org.webrtc.audio.JavaAudioDeviceModule;

@fg.a(name = "WebRTCModule")
/* loaded from: classes2.dex */
public class WebRTCModule extends ReactContextBaseJavaModule {
    static final String TAG = "com.oney.WebRTCModule.WebRTCModule";
    private final i getUserMediaImpl;
    final Map<String, MediaStream> localStreams;
    PeerConnectionFactory mFactory;
    private final SparseArray<l> mPeerConnectionObservers;

    /* loaded from: classes2.dex */
    public class a implements SdpObserver {

        /* renamed from: a */
        final /* synthetic */ Callback f17959a;

        a(WebRTCModule webRTCModule, Callback callback) {
            this.f17959a = callback;
        }

        @Override // org.webrtc.SdpObserver
        public void onCreateFailure(String str) {
            this.f17959a.invoke(Boolean.FALSE, str);
        }

        @Override // org.webrtc.SdpObserver
        public void onCreateSuccess(SessionDescription sessionDescription) {
            WritableMap createMap = Arguments.createMap();
            createMap.putString("sdp", sessionDescription.description);
            createMap.putString("type", sessionDescription.type.canonicalForm());
            this.f17959a.invoke(Boolean.TRUE, createMap);
        }

        @Override // org.webrtc.SdpObserver
        public void onSetFailure(String str) {
        }

        @Override // org.webrtc.SdpObserver
        public void onSetSuccess() {
        }
    }

    /* loaded from: classes2.dex */
    public class b implements SdpObserver {

        /* renamed from: a */
        final /* synthetic */ Callback f17960a;

        b(WebRTCModule webRTCModule, Callback callback) {
            this.f17960a = callback;
        }

        @Override // org.webrtc.SdpObserver
        public void onCreateFailure(String str) {
            this.f17960a.invoke(Boolean.FALSE, str);
        }

        @Override // org.webrtc.SdpObserver
        public void onCreateSuccess(SessionDescription sessionDescription) {
            WritableMap createMap = Arguments.createMap();
            createMap.putString("sdp", sessionDescription.description);
            createMap.putString("type", sessionDescription.type.canonicalForm());
            this.f17960a.invoke(Boolean.TRUE, createMap);
        }

        @Override // org.webrtc.SdpObserver
        public void onSetFailure(String str) {
        }

        @Override // org.webrtc.SdpObserver
        public void onSetSuccess() {
        }
    }

    /* loaded from: classes2.dex */
    public class c implements SdpObserver {

        /* renamed from: a */
        final /* synthetic */ PeerConnection f17961a;

        /* renamed from: b */
        final /* synthetic */ Promise f17962b;

        c(WebRTCModule webRTCModule, PeerConnection peerConnection, Promise promise) {
            this.f17961a = peerConnection;
            this.f17962b = promise;
        }

        @Override // org.webrtc.SdpObserver
        public void onCreateFailure(String str) {
        }

        @Override // org.webrtc.SdpObserver
        public void onCreateSuccess(SessionDescription sessionDescription) {
        }

        @Override // org.webrtc.SdpObserver
        public void onSetFailure(String str) {
            this.f17962b.reject("E_OPERATION_ERROR", str);
        }

        @Override // org.webrtc.SdpObserver
        public void onSetSuccess() {
            SessionDescription localDescription = this.f17961a.getLocalDescription();
            WritableMap createMap = Arguments.createMap();
            createMap.putString("type", localDescription.type.canonicalForm());
            createMap.putString("sdp", localDescription.description);
            this.f17962b.resolve(createMap);
        }
    }

    /* loaded from: classes2.dex */
    public class d implements SdpObserver {

        /* renamed from: a */
        final /* synthetic */ PeerConnection f17963a;

        /* renamed from: b */
        final /* synthetic */ Callback f17964b;

        d(WebRTCModule webRTCModule, PeerConnection peerConnection, Callback callback) {
            this.f17963a = peerConnection;
            this.f17964b = callback;
        }

        @Override // org.webrtc.SdpObserver
        public void onCreateFailure(String str) {
        }

        @Override // org.webrtc.SdpObserver
        public void onCreateSuccess(SessionDescription sessionDescription) {
        }

        @Override // org.webrtc.SdpObserver
        public void onSetFailure(String str) {
            this.f17964b.invoke(Boolean.FALSE, str);
        }

        @Override // org.webrtc.SdpObserver
        public void onSetSuccess() {
            SessionDescription remoteDescription = this.f17963a.getRemoteDescription();
            WritableMap createMap = Arguments.createMap();
            createMap.putString("type", remoteDescription.type.canonicalForm());
            createMap.putString("sdp", remoteDescription.description);
            this.f17964b.invoke(Boolean.TRUE, createMap);
        }
    }

    /* loaded from: classes2.dex */
    public class e implements AddIceObserver {

        /* renamed from: a */
        final /* synthetic */ PeerConnection f17965a;

        /* renamed from: b */
        final /* synthetic */ Promise f17966b;

        e(WebRTCModule webRTCModule, PeerConnection peerConnection, Promise promise) {
            this.f17965a = peerConnection;
            this.f17966b = promise;
        }

        @Override // org.webrtc.AddIceObserver
        public void onAddFailure(String str) {
            this.f17966b.reject("E_OPERATION_ERROR", str);
        }

        @Override // org.webrtc.AddIceObserver
        public void onAddSuccess() {
            WritableMap createMap = Arguments.createMap();
            SessionDescription remoteDescription = this.f17965a.getRemoteDescription();
            createMap.putString("type", remoteDescription.type.canonicalForm());
            createMap.putString("sdp", remoteDescription.description);
            this.f17966b.resolve(createMap);
        }
    }

    /* loaded from: classes2.dex */
    public static /* synthetic */ class f {

        /* renamed from: a */
        static final /* synthetic */ int[] f17967a;

        static {
            int[] iArr = new int[ReadableType.values().length];
            f17967a = iArr;
            try {
                iArr[ReadableType.String.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17967a[ReadableType.Array.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* loaded from: classes2.dex */
    public static class g {
    }

    public WebRTCModule(ReactApplicationContext reactApplicationContext) {
        this(reactApplicationContext, null);
    }

    public static /* synthetic */ void A(WebRTCModule webRTCModule, int i11, String str, String str2, String str3) {
        webRTCModule.lambda$dataChannelSend$26(i11, str, str2, str3);
    }

    public static /* synthetic */ void a(WebRTCModule webRTCModule, String str) {
        webRTCModule.lambda$mediaStreamRelease$8(str);
    }

    public static /* synthetic */ void b(WebRTCModule webRTCModule, ReadableMap readableMap, Callback callback, Callback callback2) {
        webRTCModule.lambda$getUserMedia$3(readableMap, callback, callback2);
    }

    public static /* synthetic */ void c(WebRTCModule webRTCModule, int i11, Promise promise, ReadableMap readableMap) {
        webRTCModule.lambda$peerConnectionAddICECandidate$19(i11, promise, readableMap);
    }

    private PeerConnection.IceServer createIceServer(String str) {
        return PeerConnection.IceServer.builder(str).createIceServer();
    }

    private List<PeerConnection.IceServer> createIceServers(ReadableArray readableArray) {
        int size = readableArray == null ? 0 : readableArray.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i11 = 0; i11 < size; i11++) {
            ReadableMap map = readableArray.getMap(i11);
            boolean z11 = map.hasKey("username") && map.hasKey("credential");
            if (map.hasKey("urls")) {
                int i12 = f.f17967a[map.getType("urls").ordinal()];
                if (i12 != 1) {
                    if (i12 == 2) {
                        ReadableArray array = map.getArray("urls");
                        for (int i13 = 0; i13 < array.size(); i13++) {
                            String string = array.getString(i13);
                            if (z11) {
                                arrayList.add(createIceServer(string, map.getString("username"), map.getString("credential")));
                            } else {
                                arrayList.add(createIceServer(string));
                            }
                        }
                    }
                } else if (z11) {
                    arrayList.add(createIceServer(map.getString("urls"), map.getString("username"), map.getString("credential")));
                } else {
                    arrayList.add(createIceServer(map.getString("urls")));
                }
            }
        }
        return arrayList;
    }

    public static /* synthetic */ void d(WebRTCModule webRTCModule, int i11, ReadableMap readableMap) {
        webRTCModule.lambda$peerConnectionSetConfiguration$12(i11, readableMap);
    }

    public static /* synthetic */ void e(WebRTCModule webRTCModule, String str, String str2) {
        webRTCModule.lambda$mediaStreamAddTrack$6(str, str2);
    }

    public static /* synthetic */ void f(WebRTCModule webRTCModule, Promise promise) {
        webRTCModule.lambda$getDisplayMedia$2(promise);
    }

    public static /* synthetic */ void g(WebRTCModule webRTCModule, Callback callback) {
        webRTCModule.lambda$enumerateDevices$4(callback);
    }

    private PeerConnection getPeerConnection(int i11) {
        l lVar = this.mPeerConnectionObservers.get(i11);
        if (lVar == null) {
            return null;
        }
        return lVar.h();
    }

    private MediaStreamTrack getTrack(String str) {
        MediaStreamTrack localTrack = getLocalTrack(str);
        if (localTrack == null) {
            int size = this.mPeerConnectionObservers.size();
            for (int i11 = 0; i11 < size; i11++) {
                localTrack = this.mPeerConnectionObservers.valueAt(i11).f18045f.get(str);
                if (localTrack != null) {
                    break;
                }
            }
        }
        return localTrack;
    }

    public static /* synthetic */ void h(WebRTCModule webRTCModule, int i11, Callback callback, ReadableMap readableMap) {
        webRTCModule.lambda$peerConnectionCreateOffer$15(i11, callback, readableMap);
    }

    public static /* synthetic */ void i(WebRTCModule webRTCModule, String str, boolean z11) {
        webRTCModule.lambda$mediaStreamTrackSetEnabled$10(str, z11);
    }

    public static /* synthetic */ void j(WebRTCModule webRTCModule, int i11, PeerConnection.RTCConfiguration rTCConfiguration) {
        webRTCModule.lambda$peerConnectionInit$0(i11, rTCConfiguration);
    }

    public static /* synthetic */ void k(WebRTCModule webRTCModule, int i11, Callback callback, ReadableMap readableMap) {
        webRTCModule.lambda$peerConnectionCreateAnswer$16(i11, callback, readableMap);
    }

    public static /* synthetic */ void l(WebRTCModule webRTCModule, int i11) {
        webRTCModule.lambda$peerConnectionRestartIce$22(i11);
    }

    public /* synthetic */ Object lambda$createDataChannel$23(int i11, String str, ReadableMap readableMap) {
        l lVar = this.mPeerConnectionObservers.get(i11);
        if (lVar != null && lVar.h() != null) {
            return lVar.d(str, readableMap);
        }
        Log.d(TAG, "createDataChannel() peerConnection is null");
        return null;
    }

    public /* synthetic */ void lambda$dataChannelClose$24(int i11, String str) {
        l lVar = this.mPeerConnectionObservers.get(i11);
        if (lVar != null && lVar.h() != null) {
            lVar.e(str);
        } else {
            Log.d(TAG, "dataChannelClose() peerConnection is null");
        }
    }

    public /* synthetic */ void lambda$dataChannelDispose$25(int i11, String str) {
        l lVar = this.mPeerConnectionObservers.get(i11);
        if (lVar != null && lVar.h() != null) {
            lVar.f(str);
        } else {
            Log.d(TAG, "dataChannelDispose() peerConnection is null");
        }
    }

    public /* synthetic */ void lambda$dataChannelSend$26(int i11, String str, String str2, String str3) {
        l lVar = this.mPeerConnectionObservers.get(i11);
        if (lVar != null && lVar.h() != null) {
            lVar.g(str, str2, str3);
        } else {
            Log.d(TAG, "dataChannelSend() peerConnection is null");
        }
    }

    public /* synthetic */ void lambda$enumerateDevices$4(Callback callback) {
        callback.invoke(this.getUserMediaImpl.o());
    }

    public /* synthetic */ void lambda$getDisplayMedia$2(Promise promise) {
        this.getUserMediaImpl.p(promise);
    }

    public /* synthetic */ Object lambda$getStreamForReactTag$1(String str) {
        MediaStream mediaStream = this.localStreams.get(str);
        if (mediaStream != null) {
            return mediaStream;
        }
        int size = this.mPeerConnectionObservers.size();
        for (int i11 = 0; i11 < size; i11++) {
            MediaStream mediaStream2 = this.mPeerConnectionObservers.valueAt(i11).f18044e.get(str);
            if (mediaStream2 != null) {
                return mediaStream2;
            }
        }
        return null;
    }

    public /* synthetic */ void lambda$getUserMedia$3(ReadableMap readableMap, Callback callback, Callback callback2) {
        this.getUserMediaImpl.r(readableMap, callback, callback2);
    }

    public /* synthetic */ void lambda$mediaStreamAddTrack$6(String str, String str2) {
        MediaStream mediaStream = this.localStreams.get(str);
        MediaStreamTrack track = getTrack(str2);
        if (mediaStream != null && track != null) {
            String kind = track.kind();
            if (MediaStreamTrack.AUDIO_TRACK_KIND.equals(kind)) {
                mediaStream.addTrack((AudioTrack) track);
                return;
            } else if (MediaStreamTrack.VIDEO_TRACK_KIND.equals(kind)) {
                mediaStream.addTrack((VideoTrack) track);
                return;
            } else {
                return;
            }
        }
        Log.d(TAG, "mediaStreamAddTrack() stream || track is null");
    }

    public /* synthetic */ void lambda$mediaStreamCreate$5(String str) {
        this.localStreams.put(str, this.mFactory.createLocalMediaStream(str));
    }

    public /* synthetic */ void lambda$mediaStreamRelease$8(String str) {
        MediaStream mediaStream = this.localStreams.get(str);
        if (mediaStream == null) {
            Log.d(TAG, "mediaStreamRelease() stream is null");
            return;
        }
        this.localStreams.remove(str);
        int size = this.mPeerConnectionObservers.size();
        for (int i11 = 0; i11 < size; i11++) {
            this.mPeerConnectionObservers.valueAt(i11).o(mediaStream);
        }
        mediaStream.dispose();
    }

    public /* synthetic */ void lambda$mediaStreamRemoveTrack$7(String str, String str2) {
        MediaStream mediaStream = this.localStreams.get(str);
        MediaStreamTrack track = getTrack(str2);
        if (mediaStream != null && track != null) {
            String kind = track.kind();
            if (MediaStreamTrack.AUDIO_TRACK_KIND.equals(kind)) {
                mediaStream.removeTrack((AudioTrack) track);
                return;
            } else if (MediaStreamTrack.VIDEO_TRACK_KIND.equals(kind)) {
                mediaStream.removeTrack((VideoTrack) track);
                return;
            } else {
                return;
            }
        }
        Log.d(TAG, "mediaStreamRemoveTrack() stream || track is null");
    }

    public /* synthetic */ void lambda$mediaStreamTrackRelease$9(String str) {
        MediaStreamTrack localTrack = getLocalTrack(str);
        if (localTrack == null) {
            Log.d(TAG, "mediaStreamTrackRelease() track is null");
            return;
        }
        localTrack.setEnabled(false);
        this.getUserMediaImpl.n(str);
    }

    public /* synthetic */ void lambda$mediaStreamTrackSetEnabled$10(String str, boolean z11) {
        MediaStreamTrack track = getTrack(str);
        if (track == null) {
            Log.d(TAG, "mediaStreamTrackSetEnabled() track is null");
        } else if (track.enabled() == z11) {
        } else {
            track.setEnabled(z11);
            this.getUserMediaImpl.u(str, z11);
        }
    }

    public /* synthetic */ void lambda$mediaStreamTrackSwitchCamera$11(String str) {
        if (getLocalTrack(str) != null) {
            this.getUserMediaImpl.v(str);
        }
    }

    public /* synthetic */ void lambda$peerConnectionAddICECandidate$19(int i11, Promise promise, ReadableMap readableMap) {
        PeerConnection peerConnection = getPeerConnection(i11);
        if (peerConnection == null) {
            Log.d(TAG, "peerConnectionAddICECandidate() peerConnection is null");
            promise.reject(new Exception("PeerConnection not found"));
        } else if (readableMap.hasKey("sdpMid") && readableMap.hasKey("sdpMLineIndex") && readableMap.hasKey("sdpMid")) {
            peerConnection.addIceCandidate(new IceCandidate(readableMap.getString("sdpMid"), readableMap.getInt("sdpMLineIndex"), readableMap.getString("candidate")), new e(this, peerConnection, promise));
        } else {
            promise.reject("E_TYPE_ERROR", "Invalid argument");
        }
    }

    public /* synthetic */ void lambda$peerConnectionAddStream$13(String str, int i11) {
        MediaStream mediaStream = this.localStreams.get(str);
        if (mediaStream == null) {
            Log.d(TAG, "peerConnectionAddStream() mediaStream is null");
            return;
        }
        l lVar = this.mPeerConnectionObservers.get(i11);
        if (lVar == null || !lVar.b(mediaStream)) {
            Log.e(TAG, "peerConnectionAddStream() failed");
        }
    }

    public /* synthetic */ void lambda$peerConnectionClose$21(int i11) {
        l lVar = this.mPeerConnectionObservers.get(i11);
        if (lVar != null && lVar.h() != null) {
            lVar.c();
            this.mPeerConnectionObservers.remove(i11);
            return;
        }
        Log.d(TAG, "peerConnectionClose() peerConnection is null");
    }

    public /* synthetic */ void lambda$peerConnectionCreateAnswer$16(int i11, Callback callback, ReadableMap readableMap) {
        PeerConnection peerConnection = getPeerConnection(i11);
        if (peerConnection == null) {
            Log.d(TAG, "peerConnectionCreateAnswer() peerConnection is null");
            callback.invoke(Boolean.FALSE, "peerConnection is null");
            return;
        }
        peerConnection.createAnswer(new b(this, callback), constraintsForOptions(readableMap));
    }

    public /* synthetic */ void lambda$peerConnectionCreateOffer$15(int i11, Callback callback, ReadableMap readableMap) {
        PeerConnection peerConnection = getPeerConnection(i11);
        if (peerConnection == null) {
            Log.d(TAG, "peerConnectionCreateOffer() peerConnection is null");
            callback.invoke(Boolean.FALSE, "peerConnection is null");
            return;
        }
        peerConnection.createOffer(new a(this, callback), constraintsForOptions(readableMap));
    }

    public /* synthetic */ void lambda$peerConnectionGetStats$20(int i11, Promise promise) {
        l lVar = this.mPeerConnectionObservers.get(i11);
        if (lVar != null && lVar.h() != null) {
            lVar.j(promise);
            return;
        }
        Log.d(TAG, "peerConnectionGetStats() peerConnection is null");
        promise.reject(new Exception("PeerConnection ID not found"));
    }

    public /* synthetic */ void lambda$peerConnectionInit$0(int i11, PeerConnection.RTCConfiguration rTCConfiguration) {
        l lVar = new l(this, i11);
        lVar.p(this.mFactory.createPeerConnection(rTCConfiguration, lVar));
        this.mPeerConnectionObservers.put(i11, lVar);
    }

    public /* synthetic */ void lambda$peerConnectionRemoveStream$14(String str, int i11) {
        MediaStream mediaStream = this.localStreams.get(str);
        if (mediaStream == null) {
            Log.d(TAG, "peerConnectionRemoveStream() mediaStream is null");
            return;
        }
        l lVar = this.mPeerConnectionObservers.get(i11);
        if (lVar == null || !lVar.o(mediaStream)) {
            Log.e(TAG, "peerConnectionRemoveStream() failed");
        }
    }

    public /* synthetic */ void lambda$peerConnectionRestartIce$22(int i11) {
        PeerConnection peerConnection = getPeerConnection(i11);
        if (peerConnection == null) {
            Log.w(TAG, "peerConnectionRestartIce() peerConnection is null");
        } else {
            peerConnection.restartIce();
        }
    }

    public /* synthetic */ void lambda$peerConnectionSetConfiguration$12(int i11, ReadableMap readableMap) {
        PeerConnection peerConnection = getPeerConnection(i11);
        if (peerConnection == null) {
            Log.d(TAG, "peerConnectionSetConfiguration() peerConnection is null");
        } else {
            peerConnection.setConfiguration(parseRTCConfiguration(readableMap));
        }
    }

    public /* synthetic */ void lambda$peerConnectionSetLocalDescription$17(int i11, Promise promise, ReadableMap readableMap) {
        PeerConnection peerConnection = getPeerConnection(i11);
        if (peerConnection == null) {
            Log.d(TAG, "peerConnectionSetLocalDescription() peerConnection is null");
            promise.reject(new Exception("PeerConnection not found"));
            return;
        }
        c cVar = new c(this, peerConnection, promise);
        if (readableMap != null) {
            String string = readableMap.getString("type");
            Objects.requireNonNull(string);
            peerConnection.setLocalDescription(cVar, new SessionDescription(SessionDescription.Type.fromCanonicalForm(string), readableMap.getString("sdp")));
            return;
        }
        peerConnection.setLocalDescription(cVar);
    }

    public /* synthetic */ void lambda$peerConnectionSetRemoteDescription$18(int i11, Callback callback, ReadableMap readableMap) {
        PeerConnection peerConnection = getPeerConnection(i11);
        if (peerConnection == null) {
            Log.d(TAG, "peerConnectionSetRemoteDescription() peerConnection is null");
            callback.invoke(Boolean.FALSE, "peerConnection is null");
            return;
        }
        peerConnection.setRemoteDescription(new d(this, peerConnection, callback), new SessionDescription(SessionDescription.Type.fromCanonicalForm(readableMap.getString("type")), readableMap.getString("sdp")));
    }

    public static /* synthetic */ void m(WebRTCModule webRTCModule, String str) {
        webRTCModule.lambda$mediaStreamTrackRelease$9(str);
    }

    public static /* synthetic */ void n(WebRTCModule webRTCModule, String str) {
        webRTCModule.lambda$mediaStreamTrackSwitchCamera$11(str);
    }

    public static /* synthetic */ void o(WebRTCModule webRTCModule, int i11, Promise promise, ReadableMap readableMap) {
        webRTCModule.lambda$peerConnectionSetLocalDescription$17(i11, promise, readableMap);
    }

    public static /* synthetic */ Object p(WebRTCModule webRTCModule, String str) {
        return webRTCModule.lambda$getStreamForReactTag$1(str);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:226:0x00b7, code lost:
        if (r2.equals("max-bundle") == false) goto L43;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private org.webrtc.PeerConnection.RTCConfiguration parseRTCConfiguration(com.facebook.react.bridge.ReadableMap r10) {
        /*
            Method dump skipped, instructions count: 666
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.oney.WebRTCModule.WebRTCModule.parseRTCConfiguration(com.facebook.react.bridge.ReadableMap):org.webrtc.PeerConnection$RTCConfiguration");
    }

    public static /* synthetic */ void q(WebRTCModule webRTCModule, String str, int i11) {
        webRTCModule.lambda$peerConnectionRemoveStream$14(str, i11);
    }

    public static /* synthetic */ void r(WebRTCModule webRTCModule, String str, int i11) {
        webRTCModule.lambda$peerConnectionAddStream$13(str, i11);
    }

    public static /* synthetic */ void s(WebRTCModule webRTCModule, int i11) {
        webRTCModule.lambda$peerConnectionClose$21(i11);
    }

    public static /* synthetic */ void t(WebRTCModule webRTCModule, String str, String str2) {
        webRTCModule.lambda$mediaStreamRemoveTrack$7(str, str2);
    }

    public static /* synthetic */ void u(WebRTCModule webRTCModule, int i11, Callback callback, ReadableMap readableMap) {
        webRTCModule.lambda$peerConnectionSetRemoteDescription$18(i11, callback, readableMap);
    }

    public static /* synthetic */ void v(WebRTCModule webRTCModule, int i11, String str) {
        webRTCModule.lambda$dataChannelDispose$25(i11, str);
    }

    public static /* synthetic */ Object w(WebRTCModule webRTCModule, int i11, String str, ReadableMap readableMap) {
        return webRTCModule.lambda$createDataChannel$23(i11, str, readableMap);
    }

    public static /* synthetic */ void x(WebRTCModule webRTCModule, int i11, Promise promise) {
        webRTCModule.lambda$peerConnectionGetStats$20(i11, promise);
    }

    public static /* synthetic */ void y(WebRTCModule webRTCModule, String str) {
        webRTCModule.lambda$mediaStreamCreate$5(str);
    }

    public static /* synthetic */ void z(WebRTCModule webRTCModule, int i11, String str) {
        webRTCModule.lambda$dataChannelClose$24(i11, str);
    }

    @ReactMethod
    public void addListener(String str) {
    }

    public MediaConstraints constraintsForOptions(ReadableMap readableMap) {
        MediaConstraints mediaConstraints = new MediaConstraints();
        ReadableMapKeySetIterator keySetIterator = readableMap.keySetIterator();
        while (keySetIterator.hasNextKey()) {
            String nextKey = keySetIterator.nextKey();
            mediaConstraints.mandatory.add(new MediaConstraints.KeyValuePair(nextKey, m.a(readableMap, nextKey)));
        }
        return mediaConstraints;
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public WritableMap createDataChannel(final int i11, final String str, final ReadableMap readableMap) {
        try {
            return (WritableMap) p.c(new Callable() { // from class: com.oney.WebRTCModule.i0
                {
                    WebRTCModule.this = this;
                }

                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return WebRTCModule.w(WebRTCModule.this, i11, str, readableMap);
                }
            }).get();
        } catch (InterruptedException | ExecutionException unused) {
            return null;
        }
    }

    @ReactMethod
    public void dataChannelClose(final int i11, final String str) {
        p.a(new Runnable() { // from class: com.oney.WebRTCModule.s
            {
                WebRTCModule.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                WebRTCModule.z(WebRTCModule.this, i11, str);
            }
        });
    }

    @ReactMethod
    public void dataChannelDispose(final int i11, final String str) {
        p.a(new Runnable() { // from class: com.oney.WebRTCModule.r0
            {
                WebRTCModule.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                WebRTCModule.v(WebRTCModule.this, i11, str);
            }
        });
    }

    @ReactMethod
    public void dataChannelSend(final int i11, final String str, final String str2, final String str3) {
        p.a(new Runnable() { // from class: com.oney.WebRTCModule.t
            {
                WebRTCModule.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                WebRTCModule.A(WebRTCModule.this, i11, str, str2, str3);
            }
        });
    }

    @ReactMethod
    public void enumerateDevices(final Callback callback) {
        p.a(new Runnable() { // from class: com.oney.WebRTCModule.v
            {
                WebRTCModule.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                WebRTCModule.g(WebRTCModule.this, callback);
            }
        });
    }

    @ReactMethod
    public void getDisplayMedia(final Promise promise) {
        p.a(new Runnable() { // from class: com.oney.WebRTCModule.w
            {
                WebRTCModule.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                WebRTCModule.f(WebRTCModule.this, promise);
            }
        });
    }

    MediaStreamTrack getLocalTrack(String str) {
        return this.getUserMediaImpl.q(str);
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "WebRTCModule";
    }

    public MediaStream getStreamForReactTag(final String str) {
        try {
            return (MediaStream) p.c(new Callable() { // from class: com.oney.WebRTCModule.j0
                {
                    WebRTCModule.this = this;
                }

                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return WebRTCModule.p(WebRTCModule.this, str);
                }
            }).get();
        } catch (InterruptedException | ExecutionException unused) {
            return null;
        }
    }

    @ReactMethod
    public void getUserMedia(final ReadableMap readableMap, final Callback callback, final Callback callback2) {
        p.a(new Runnable() { // from class: com.oney.WebRTCModule.x
            {
                WebRTCModule.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                WebRTCModule.b(WebRTCModule.this, readableMap, callback, callback2);
            }
        });
    }

    @ReactMethod
    public void mediaStreamAddTrack(final String str, final String str2) {
        p.a(new Runnable() { // from class: com.oney.WebRTCModule.f0
            {
                WebRTCModule.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                WebRTCModule.e(WebRTCModule.this, str, str2);
            }
        });
    }

    @ReactMethod
    public void mediaStreamCreate(final String str) {
        p.a(new Runnable() { // from class: com.oney.WebRTCModule.b0
            {
                WebRTCModule.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                WebRTCModule.y(WebRTCModule.this, str);
            }
        });
    }

    @ReactMethod
    public void mediaStreamRelease(final String str) {
        p.a(new Runnable() { // from class: com.oney.WebRTCModule.y
            {
                WebRTCModule.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                WebRTCModule.a(WebRTCModule.this, str);
            }
        });
    }

    @ReactMethod
    public void mediaStreamRemoveTrack(final String str, final String str2) {
        p.a(new Runnable() { // from class: com.oney.WebRTCModule.g0
            {
                WebRTCModule.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                WebRTCModule.t(WebRTCModule.this, str, str2);
            }
        });
    }

    @ReactMethod
    public void mediaStreamTrackRelease(final String str) {
        p.a(new Runnable() { // from class: com.oney.WebRTCModule.z
            {
                WebRTCModule.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                WebRTCModule.m(WebRTCModule.this, str);
            }
        });
    }

    @ReactMethod
    public void mediaStreamTrackSetEnabled(final String str, final boolean z11) {
        p.a(new Runnable() { // from class: com.oney.WebRTCModule.h0
            {
                WebRTCModule.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                WebRTCModule.i(WebRTCModule.this, str, z11);
            }
        });
    }

    @ReactMethod
    public void mediaStreamTrackSwitchCamera(final String str) {
        p.a(new Runnable() { // from class: com.oney.WebRTCModule.a0
            {
                WebRTCModule.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                WebRTCModule.n(WebRTCModule.this, str);
            }
        });
    }

    @ReactMethod
    public void peerConnectionAddICECandidate(final int i11, final ReadableMap readableMap, final Promise promise) {
        p.a(new Runnable() { // from class: com.oney.WebRTCModule.o0
            {
                WebRTCModule.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                WebRTCModule.c(WebRTCModule.this, i11, promise, readableMap);
            }
        });
    }

    @ReactMethod
    public void peerConnectionAddStream(final String str, final int i11) {
        p.a(new Runnable() { // from class: com.oney.WebRTCModule.e0
            {
                WebRTCModule.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                WebRTCModule.r(WebRTCModule.this, str, i11);
            }
        });
    }

    @ReactMethod
    public void peerConnectionClose(final int i11) {
        p.a(new Runnable() { // from class: com.oney.WebRTCModule.c0
            {
                WebRTCModule.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                WebRTCModule.s(WebRTCModule.this, i11);
            }
        });
    }

    @ReactMethod
    public void peerConnectionCreateAnswer(final int i11, final ReadableMap readableMap, final Callback callback) {
        p.a(new Runnable() { // from class: com.oney.WebRTCModule.l0
            {
                WebRTCModule.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                WebRTCModule.k(WebRTCModule.this, i11, callback, readableMap);
            }
        });
    }

    @ReactMethod
    public void peerConnectionCreateOffer(final int i11, final ReadableMap readableMap, final Callback callback) {
        p.a(new Runnable() { // from class: com.oney.WebRTCModule.k0
            {
                WebRTCModule.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                WebRTCModule.h(WebRTCModule.this, i11, callback, readableMap);
            }
        });
    }

    @ReactMethod
    public void peerConnectionGetStats(final int i11, final Promise promise) {
        p.a(new Runnable() { // from class: com.oney.WebRTCModule.n0
            {
                WebRTCModule.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                WebRTCModule.x(WebRTCModule.this, i11, promise);
            }
        });
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public void peerConnectionInit(ReadableMap readableMap, final int i11) {
        final PeerConnection.RTCConfiguration parseRTCConfiguration = parseRTCConfiguration(readableMap);
        try {
            p.b(new Runnable() { // from class: com.oney.WebRTCModule.u
                @Override // java.lang.Runnable
                public final void run() {
                    WebRTCModule.j(WebRTCModule.this, i11, parseRTCConfiguration);
                }
            }).get();
        } catch (InterruptedException | ExecutionException e11) {
            e11.printStackTrace();
            throw new RuntimeException(e11);
        }
    }

    @ReactMethod
    public void peerConnectionRemoveStream(final String str, final int i11) {
        p.a(new Runnable() { // from class: com.oney.WebRTCModule.d0
            {
                WebRTCModule.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                WebRTCModule.q(WebRTCModule.this, str, i11);
            }
        });
    }

    @ReactMethod
    public void peerConnectionRestartIce(final int i11) {
        p.a(new Runnable() { // from class: com.oney.WebRTCModule.r
            {
                WebRTCModule.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                WebRTCModule.l(WebRTCModule.this, i11);
            }
        });
    }

    @ReactMethod
    public void peerConnectionSetConfiguration(final ReadableMap readableMap, final int i11) {
        p.a(new Runnable() { // from class: com.oney.WebRTCModule.q0
            {
                WebRTCModule.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                WebRTCModule.d(WebRTCModule.this, i11, readableMap);
            }
        });
    }

    @ReactMethod
    public void peerConnectionSetLocalDescription(final int i11, final ReadableMap readableMap, final Promise promise) {
        p.a(new Runnable() { // from class: com.oney.WebRTCModule.p0
            {
                WebRTCModule.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                WebRTCModule.o(WebRTCModule.this, i11, promise, readableMap);
            }
        });
    }

    @ReactMethod
    public void peerConnectionSetRemoteDescription(final ReadableMap readableMap, final int i11, final Callback callback) {
        p.a(new Runnable() { // from class: com.oney.WebRTCModule.m0
            {
                WebRTCModule.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                WebRTCModule.u(WebRTCModule.this, i11, callback, readableMap);
            }
        });
    }

    @ReactMethod
    public void removeListeners(Integer num) {
    }

    public void sendEvent(String str, WritableMap writableMap) {
        ((DeviceEventManagerModule.RCTDeviceEventEmitter) getReactApplicationContext().getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit(str, writableMap);
    }

    public WebRTCModule(ReactApplicationContext reactApplicationContext, g gVar) {
        super(reactApplicationContext);
        VideoEncoderFactory softwareVideoEncoderFactory;
        VideoDecoderFactory softwareVideoDecoderFactory;
        this.mPeerConnectionObservers = new SparseArray<>();
        this.localStreams = new HashMap();
        PeerConnectionFactory.initialize(PeerConnectionFactory.InitializationOptions.builder(reactApplicationContext).setNativeLibraryLoader(new j()).setInjectableLogger(null, null).createInitializationOptions());
        EglBase.Context b11 = com.oney.WebRTCModule.f.b();
        if (b11 != null) {
            softwareVideoEncoderFactory = new DefaultVideoEncoderFactory(b11, true, false);
            softwareVideoDecoderFactory = new DefaultVideoDecoderFactory(b11);
        } else {
            softwareVideoEncoderFactory = new SoftwareVideoEncoderFactory();
            softwareVideoDecoderFactory = new SoftwareVideoDecoderFactory();
        }
        this.mFactory = PeerConnectionFactory.builder().setAudioDeviceModule(JavaAudioDeviceModule.builder(reactApplicationContext).setEnableVolumeLogger(false).createAudioDeviceModule()).setVideoEncoderFactory(softwareVideoEncoderFactory).setVideoDecoderFactory(softwareVideoDecoderFactory).createPeerConnectionFactory();
        this.getUserMediaImpl = new i(this, reactApplicationContext);
    }

    private PeerConnection.IceServer createIceServer(String str, String str2, String str3) {
        return PeerConnection.IceServer.builder(str).setUsername(str2).setPassword(str3).createIceServer();
    }
}