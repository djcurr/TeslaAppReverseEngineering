package com.oney.WebRTCModule;

import android.util.Base64;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import java.nio.charset.StandardCharsets;
import org.spongycastle.i18n.TextBundle;
import org.webrtc.DataChannel;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class d implements DataChannel.Observer {

    /* renamed from: a  reason: collision with root package name */
    private final String f17988a;

    /* renamed from: b  reason: collision with root package name */
    private final DataChannel f17989b;

    /* renamed from: c  reason: collision with root package name */
    private final int f17990c;

    /* renamed from: d  reason: collision with root package name */
    private final WebRTCModule f17991d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f17992a;

        static {
            int[] iArr = new int[DataChannel.State.values().length];
            f17992a = iArr;
            try {
                iArr[DataChannel.State.CONNECTING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17992a[DataChannel.State.OPEN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17992a[DataChannel.State.CLOSING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17992a[DataChannel.State.CLOSED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public d(WebRTCModule webRTCModule, int i11, String str, DataChannel dataChannel) {
        this.f17991d = webRTCModule;
        this.f17990c = i11;
        this.f17988a = str;
        this.f17989b = dataChannel;
    }

    public String a(DataChannel.State state) {
        int i11 = a.f17992a[state.ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 4) {
                        return null;
                    }
                    return "closed";
                }
                return "closing";
            }
            return "open";
        }
        return "connecting";
    }

    public DataChannel b() {
        return this.f17989b;
    }

    @Override // org.webrtc.DataChannel.Observer
    public void onBufferedAmountChange(long j11) {
    }

    @Override // org.webrtc.DataChannel.Observer
    public void onMessage(DataChannel.Buffer buffer) {
        byte[] bArr;
        String str;
        String str2;
        WritableMap createMap = Arguments.createMap();
        createMap.putString("reactTag", this.f17988a);
        createMap.putInt("peerConnectionId", this.f17990c);
        if (buffer.data.hasArray()) {
            bArr = buffer.data.array();
        } else {
            bArr = new byte[buffer.data.remaining()];
            buffer.data.get(bArr);
        }
        if (buffer.binary) {
            str = Base64.encodeToString(bArr, 2);
            str2 = "binary";
        } else {
            str = new String(bArr, StandardCharsets.UTF_8);
            str2 = TextBundle.TEXT_ENTRY;
        }
        createMap.putString("type", str2);
        createMap.putString(MessageExtension.FIELD_DATA, str);
        this.f17991d.sendEvent("dataChannelReceiveMessage", createMap);
    }

    @Override // org.webrtc.DataChannel.Observer
    public void onStateChange() {
        WritableMap createMap = Arguments.createMap();
        createMap.putString("reactTag", this.f17988a);
        createMap.putInt("peerConnectionId", this.f17990c);
        createMap.putInt("id", this.f17989b.id());
        createMap.putString("state", a(this.f17989b.state()));
        this.f17991d.sendEvent("dataChannelStateChanged", createMap);
    }
}