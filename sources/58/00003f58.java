package com.oney.WebRTCModule;

import android.util.Base64;
import android.util.Log;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.spongycastle.i18n.TextBundle;
import org.webrtc.AudioTrack;
import org.webrtc.DataChannel;
import org.webrtc.IceCandidate;
import org.webrtc.MediaStream;
import org.webrtc.MediaStreamTrack;
import org.webrtc.PeerConnection;
import org.webrtc.RTCStatsCollectorCallback;
import org.webrtc.RTCStatsReport;
import org.webrtc.RtpReceiver;
import org.webrtc.SessionDescription;
import org.webrtc.VideoTrack;

/* loaded from: classes2.dex */
public class l implements PeerConnection.Observer {

    /* renamed from: i */
    private static final String f18039i = WebRTCModule.TAG;

    /* renamed from: b */
    private final int f18041b;

    /* renamed from: c */
    private PeerConnection f18042c;

    /* renamed from: g */
    private final q f18046g;

    /* renamed from: h */
    private final WebRTCModule f18047h;

    /* renamed from: a */
    private final Map<String, d> f18040a = new HashMap();

    /* renamed from: d */
    final List<MediaStream> f18043d = new ArrayList();

    /* renamed from: e */
    final Map<String, MediaStream> f18044e = new HashMap();

    /* renamed from: f */
    final Map<String, MediaStreamTrack> f18045f = new HashMap();

    /* loaded from: classes2.dex */
    public static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f18048a;

        /* renamed from: b */
        static final /* synthetic */ int[] f18049b;

        /* renamed from: c */
        static final /* synthetic */ int[] f18050c;

        /* renamed from: d */
        static final /* synthetic */ int[] f18051d;

        static {
            int[] iArr = new int[PeerConnection.SignalingState.values().length];
            f18051d = iArr;
            try {
                iArr[PeerConnection.SignalingState.STABLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f18051d[PeerConnection.SignalingState.HAVE_LOCAL_OFFER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f18051d[PeerConnection.SignalingState.HAVE_LOCAL_PRANSWER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f18051d[PeerConnection.SignalingState.HAVE_REMOTE_OFFER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f18051d[PeerConnection.SignalingState.HAVE_REMOTE_PRANSWER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f18051d[PeerConnection.SignalingState.CLOSED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            int[] iArr2 = new int[PeerConnection.IceGatheringState.values().length];
            f18050c = iArr2;
            try {
                iArr2[PeerConnection.IceGatheringState.NEW.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f18050c[PeerConnection.IceGatheringState.GATHERING.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f18050c[PeerConnection.IceGatheringState.COMPLETE.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            int[] iArr3 = new int[PeerConnection.IceConnectionState.values().length];
            f18049b = iArr3;
            try {
                iArr3[PeerConnection.IceConnectionState.NEW.ordinal()] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f18049b[PeerConnection.IceConnectionState.CHECKING.ordinal()] = 2;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f18049b[PeerConnection.IceConnectionState.CONNECTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f18049b[PeerConnection.IceConnectionState.COMPLETED.ordinal()] = 4;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f18049b[PeerConnection.IceConnectionState.FAILED.ordinal()] = 5;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f18049b[PeerConnection.IceConnectionState.DISCONNECTED.ordinal()] = 6;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f18049b[PeerConnection.IceConnectionState.CLOSED.ordinal()] = 7;
            } catch (NoSuchFieldError unused16) {
            }
            int[] iArr4 = new int[PeerConnection.PeerConnectionState.values().length];
            f18048a = iArr4;
            try {
                iArr4[PeerConnection.PeerConnectionState.NEW.ordinal()] = 1;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f18048a[PeerConnection.PeerConnectionState.CONNECTING.ordinal()] = 2;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f18048a[PeerConnection.PeerConnectionState.CONNECTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f18048a[PeerConnection.PeerConnectionState.DISCONNECTED.ordinal()] = 4;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f18048a[PeerConnection.PeerConnectionState.FAILED.ordinal()] = 5;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f18048a[PeerConnection.PeerConnectionState.CLOSED.ordinal()] = 6;
            } catch (NoSuchFieldError unused22) {
            }
        }
    }

    public l(WebRTCModule webRTCModule, int i11) {
        this.f18047h = webRTCModule;
        this.f18041b = i11;
        this.f18046g = new q(webRTCModule, i11);
    }

    public static /* synthetic */ void a(Promise promise, RTCStatsReport rTCStatsReport) {
        m(promise, rTCStatsReport);
    }

    private String i(MediaStream mediaStream) {
        for (Map.Entry<String, MediaStream> entry : this.f18044e.entrySet()) {
            if (entry.getValue().equals(mediaStream)) {
                return entry.getKey();
            }
        }
        return null;
    }

    private String k(PeerConnection.IceConnectionState iceConnectionState) {
        switch (a.f18049b[iceConnectionState.ordinal()]) {
            case 1:
                return "new";
            case 2:
                return "checking";
            case 3:
                return "connected";
            case 4:
                return "completed";
            case 5:
                return "failed";
            case 6:
                return "disconnected";
            case 7:
                return "closed";
            default:
                return null;
        }
    }

    private String l(PeerConnection.IceGatheringState iceGatheringState) {
        int i11 = a.f18050c[iceGatheringState.ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    return null;
                }
                return "complete";
            }
            return "gathering";
        }
        return "new";
    }

    public static /* synthetic */ void m(Promise promise, RTCStatsReport rTCStatsReport) {
        promise.resolve(o.b(rTCStatsReport));
    }

    private String n(PeerConnection.PeerConnectionState peerConnectionState) {
        switch (a.f18048a[peerConnectionState.ordinal()]) {
            case 1:
                return "new";
            case 2:
                return "connecting";
            case 3:
                return "connected";
            case 4:
                return "disconnected";
            case 5:
                return "failed";
            case 6:
                return "closed";
            default:
                return null;
        }
    }

    private String q(PeerConnection.SignalingState signalingState) {
        switch (a.f18051d[signalingState.ordinal()]) {
            case 1:
                return "stable";
            case 2:
                return "have-local-offer";
            case 3:
                return "have-local-pranswer";
            case 4:
                return "have-remote-offer";
            case 5:
                return "have-remote-pranswer";
            case 6:
                return "closed";
            default:
                return null;
        }
    }

    public boolean b(MediaStream mediaStream) {
        PeerConnection peerConnection = this.f18042c;
        if (peerConnection == null || !peerConnection.addStream(mediaStream)) {
            return false;
        }
        this.f18043d.add(mediaStream);
        return true;
    }

    public void c() {
        String str = f18039i;
        Log.d(str, "PeerConnection.close() for " + this.f18041b);
        this.f18042c.close();
        Iterator it2 = new ArrayList(this.f18043d).iterator();
        while (it2.hasNext()) {
            o((MediaStream) it2.next());
        }
        for (MediaStream mediaStream : this.f18044e.values()) {
            for (VideoTrack videoTrack : mediaStream.videoTracks) {
                this.f18046g.e(videoTrack);
            }
        }
        for (d dVar : this.f18040a.values()) {
            DataChannel b11 = dVar.b();
            b11.close();
            b11.unregisterObserver();
        }
        this.f18042c.dispose();
        this.f18044e.clear();
        this.f18045f.clear();
        this.f18040a.clear();
    }

    public WritableMap d(String str, ReadableMap readableMap) {
        DataChannel.Init init = new DataChannel.Init();
        if (readableMap != null) {
            if (readableMap.hasKey("id")) {
                init.f43888id = readableMap.getInt("id");
            }
            if (readableMap.hasKey("ordered")) {
                init.ordered = readableMap.getBoolean("ordered");
            }
            if (readableMap.hasKey("maxRetransmitTime")) {
                init.maxRetransmitTimeMs = readableMap.getInt("maxRetransmitTime");
            }
            if (readableMap.hasKey("maxRetransmits")) {
                init.maxRetransmits = readableMap.getInt("maxRetransmits");
            }
            if (readableMap.hasKey("protocol")) {
                init.protocol = readableMap.getString("protocol");
            }
            if (readableMap.hasKey("negotiated")) {
                init.negotiated = readableMap.getBoolean("negotiated");
            }
        }
        DataChannel createDataChannel = this.f18042c.createDataChannel(str, init);
        if (createDataChannel == null) {
            return null;
        }
        String uuid = UUID.randomUUID().toString();
        d dVar = new d(this.f18047h, this.f18041b, uuid, createDataChannel);
        this.f18040a.put(uuid, dVar);
        createDataChannel.registerObserver(dVar);
        WritableMap createMap = Arguments.createMap();
        createMap.putInt("peerConnectionId", this.f18041b);
        createMap.putString("reactTag", uuid);
        createMap.putString("label", createDataChannel.label());
        createMap.putInt("id", createDataChannel.id());
        createMap.putBoolean("ordered", init.ordered);
        createMap.putInt("maxPacketLifeTime", init.maxRetransmitTimeMs);
        createMap.putInt("maxRetransmits", init.maxRetransmits);
        createMap.putString("protocol", init.protocol);
        createMap.putBoolean("negotiated", init.negotiated);
        createMap.putString("readyState", dVar.a(createDataChannel.state()));
        return createMap;
    }

    public void e(String str) {
        d dVar = this.f18040a.get(str);
        if (dVar == null) {
            Log.d(f18039i, "dataChannelClose() dataChannel is null");
        } else {
            dVar.b().close();
        }
    }

    public void f(String str) {
        d dVar = this.f18040a.get(str);
        if (dVar == null) {
            Log.d(f18039i, "dataChannelDispose() dataChannel is null");
            return;
        }
        dVar.b().unregisterObserver();
        this.f18040a.remove(str);
    }

    public void g(String str, String str2, String str3) {
        byte[] decode;
        d dVar = this.f18040a.get(str);
        if (dVar == null) {
            Log.d(f18039i, "dataChannelSend() dataChannel is null");
            return;
        }
        if (str3.equals(TextBundle.TEXT_ENTRY)) {
            decode = str2.getBytes(StandardCharsets.UTF_8);
        } else if (str3.equals("binary")) {
            decode = Base64.decode(str2, 2);
        } else {
            String str4 = f18039i;
            Log.e(str4, "Unsupported data type: " + str3);
            return;
        }
        dVar.b().send(new DataChannel.Buffer(ByteBuffer.wrap(decode), str3.equals("binary")));
    }

    public PeerConnection h() {
        return this.f18042c;
    }

    public void j(final Promise promise) {
        this.f18042c.getStats(new RTCStatsCollectorCallback() { // from class: com.oney.WebRTCModule.k
            @Override // org.webrtc.RTCStatsCollectorCallback
            public final void onStatsDelivered(RTCStatsReport rTCStatsReport) {
                l.a(promise, rTCStatsReport);
            }
        });
    }

    public boolean o(MediaStream mediaStream) {
        PeerConnection peerConnection = this.f18042c;
        if (peerConnection != null) {
            peerConnection.removeStream(mediaStream);
        }
        return this.f18043d.remove(mediaStream);
    }

    @Override // org.webrtc.PeerConnection.Observer
    public void onAddStream(MediaStream mediaStream) {
        String str;
        String id2 = mediaStream.getId();
        if ("default".equals(id2)) {
            for (Map.Entry<String, MediaStream> entry : this.f18044e.entrySet()) {
                if (entry.getValue().equals(mediaStream)) {
                    str = entry.getKey();
                    break;
                }
            }
        }
        str = null;
        if (str == null) {
            str = UUID.randomUUID().toString();
            this.f18044e.put(str, mediaStream);
        }
        WritableMap createMap = Arguments.createMap();
        createMap.putInt("id", this.f18041b);
        createMap.putString("streamId", id2);
        createMap.putString("streamReactTag", str);
        WritableArray createArray = Arguments.createArray();
        for (int i11 = 0; i11 < mediaStream.videoTracks.size(); i11++) {
            VideoTrack videoTrack = mediaStream.videoTracks.get(i11);
            String id3 = videoTrack.id();
            this.f18045f.put(id3, videoTrack);
            WritableMap createMap2 = Arguments.createMap();
            createMap2.putString("id", id3);
            createMap2.putString("label", "Video");
            createMap2.putString("kind", videoTrack.kind());
            createMap2.putBoolean("enabled", videoTrack.enabled());
            createMap2.putString("readyState", videoTrack.state().toString());
            createMap2.putBoolean("remote", true);
            createArray.pushMap(createMap2);
            this.f18046g.d(videoTrack);
        }
        for (int i12 = 0; i12 < mediaStream.audioTracks.size(); i12++) {
            AudioTrack audioTrack = mediaStream.audioTracks.get(i12);
            String id4 = audioTrack.id();
            this.f18045f.put(id4, audioTrack);
            WritableMap createMap3 = Arguments.createMap();
            createMap3.putString("id", id4);
            createMap3.putString("label", "Audio");
            createMap3.putString("kind", audioTrack.kind());
            createMap3.putBoolean("enabled", audioTrack.enabled());
            createMap3.putString("readyState", audioTrack.state().toString());
            createMap3.putBoolean("remote", true);
            createArray.pushMap(createMap3);
        }
        createMap.putArray("tracks", createArray);
        SessionDescription remoteDescription = this.f18042c.getRemoteDescription();
        WritableMap createMap4 = Arguments.createMap();
        createMap4.putString("type", remoteDescription.type.canonicalForm());
        createMap4.putString("sdp", remoteDescription.description);
        createMap.putMap("sdp", createMap4);
        this.f18047h.sendEvent("peerConnectionAddedStream", createMap);
    }

    @Override // org.webrtc.PeerConnection.Observer
    public void onAddTrack(RtpReceiver rtpReceiver, MediaStream[] mediaStreamArr) {
        Log.d(f18039i, "onAddTrack");
    }

    @Override // org.webrtc.PeerConnection.Observer
    public void onConnectionChange(PeerConnection.PeerConnectionState peerConnectionState) {
        WritableMap createMap = Arguments.createMap();
        createMap.putInt("id", this.f18041b);
        createMap.putString("connectionState", n(peerConnectionState));
        this.f18047h.sendEvent("peerConnectionStateChanged", createMap);
    }

    @Override // org.webrtc.PeerConnection.Observer
    public void onDataChannel(DataChannel dataChannel) {
        String uuid = UUID.randomUUID().toString();
        d dVar = new d(this.f18047h, this.f18041b, uuid, dataChannel);
        this.f18040a.put(uuid, dVar);
        dataChannel.registerObserver(dVar);
        WritableMap createMap = Arguments.createMap();
        createMap.putInt("peerConnectionId", this.f18041b);
        createMap.putString("reactTag", uuid);
        createMap.putString("label", dataChannel.label());
        createMap.putInt("id", dataChannel.id());
        createMap.putBoolean("ordered", true);
        createMap.putInt("maxPacketLifeTime", -1);
        createMap.putInt("maxRetransmits", -1);
        createMap.putString("protocol", "");
        createMap.putBoolean("negotiated", false);
        createMap.putString("readyState", dVar.a(dataChannel.state()));
        WritableMap createMap2 = Arguments.createMap();
        createMap2.putInt("id", this.f18041b);
        createMap2.putMap("dataChannel", createMap);
        this.f18047h.sendEvent("peerConnectionDidOpenDataChannel", createMap2);
    }

    @Override // org.webrtc.PeerConnection.Observer
    public void onIceCandidate(IceCandidate iceCandidate) {
        Log.d(f18039i, "onIceCandidate");
        WritableMap createMap = Arguments.createMap();
        createMap.putInt("id", this.f18041b);
        WritableMap createMap2 = Arguments.createMap();
        createMap2.putInt("sdpMLineIndex", iceCandidate.sdpMLineIndex);
        createMap2.putString("sdpMid", iceCandidate.sdpMid);
        createMap2.putString("candidate", iceCandidate.sdp);
        createMap.putMap("candidate", createMap2);
        SessionDescription localDescription = this.f18042c.getLocalDescription();
        WritableMap createMap3 = Arguments.createMap();
        createMap3.putString("type", localDescription.type.canonicalForm());
        createMap3.putString("sdp", localDescription.description);
        createMap.putMap("sdp", createMap3);
        this.f18047h.sendEvent("peerConnectionGotICECandidate", createMap);
    }

    @Override // org.webrtc.PeerConnection.Observer
    public void onIceCandidatesRemoved(IceCandidate[] iceCandidateArr) {
        Log.d(f18039i, "onIceCandidatesRemoved");
    }

    @Override // org.webrtc.PeerConnection.Observer
    public void onIceConnectionChange(PeerConnection.IceConnectionState iceConnectionState) {
        WritableMap createMap = Arguments.createMap();
        createMap.putInt("id", this.f18041b);
        createMap.putString("iceConnectionState", k(iceConnectionState));
        this.f18047h.sendEvent("peerConnectionIceConnectionChanged", createMap);
    }

    @Override // org.webrtc.PeerConnection.Observer
    public void onIceConnectionReceivingChange(boolean z11) {
    }

    @Override // org.webrtc.PeerConnection.Observer
    public void onIceGatheringChange(PeerConnection.IceGatheringState iceGatheringState) {
        String str = f18039i;
        Log.d(str, "onIceGatheringChange" + iceGatheringState.name());
        WritableMap createMap = Arguments.createMap();
        createMap.putInt("id", this.f18041b);
        createMap.putString("iceGatheringState", l(iceGatheringState));
        if (iceGatheringState == PeerConnection.IceGatheringState.COMPLETE) {
            SessionDescription localDescription = this.f18042c.getLocalDescription();
            WritableMap createMap2 = Arguments.createMap();
            createMap2.putString("type", localDescription.type.canonicalForm());
            createMap2.putString("sdp", localDescription.description);
            createMap.putMap("sdp", createMap2);
        }
        this.f18047h.sendEvent("peerConnectionIceGatheringChanged", createMap);
    }

    @Override // org.webrtc.PeerConnection.Observer
    public void onRemoveStream(MediaStream mediaStream) {
        String i11 = i(mediaStream);
        if (i11 == null) {
            String str = f18039i;
            Log.w(str, "onRemoveStream - no remote stream for id: " + mediaStream.getId());
            return;
        }
        for (VideoTrack videoTrack : mediaStream.videoTracks) {
            this.f18046g.e(videoTrack);
            this.f18045f.remove(videoTrack.id());
        }
        for (AudioTrack audioTrack : mediaStream.audioTracks) {
            this.f18045f.remove(audioTrack.id());
        }
        this.f18044e.remove(i11);
        WritableMap createMap = Arguments.createMap();
        createMap.putInt("id", this.f18041b);
        createMap.putString("streamId", i11);
        SessionDescription remoteDescription = this.f18042c.getRemoteDescription();
        WritableMap createMap2 = Arguments.createMap();
        createMap2.putString("type", remoteDescription.type.canonicalForm());
        createMap2.putString("sdp", remoteDescription.description);
        createMap.putMap("sdp", createMap2);
        this.f18047h.sendEvent("peerConnectionRemovedStream", createMap);
    }

    @Override // org.webrtc.PeerConnection.Observer
    public void onRenegotiationNeeded() {
        WritableMap createMap = Arguments.createMap();
        createMap.putInt("id", this.f18041b);
        this.f18047h.sendEvent("peerConnectionOnRenegotiationNeeded", createMap);
    }

    @Override // org.webrtc.PeerConnection.Observer
    public void onSignalingChange(PeerConnection.SignalingState signalingState) {
        WritableMap createMap = Arguments.createMap();
        createMap.putInt("id", this.f18041b);
        createMap.putString("signalingState", q(signalingState));
        this.f18047h.sendEvent("peerConnectionSignalingStateChanged", createMap);
    }

    public void p(PeerConnection peerConnection) {
        this.f18042c = peerConnection;
    }
}