package com.oney.WebRTCModule;

import android.util.Log;
import com.facebook.react.bridge.ReadableMap;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import java.util.ArrayList;
import org.webrtc.CameraEnumerator;
import org.webrtc.CameraVideoCapturer;
import org.webrtc.VideoCapturer;

/* loaded from: classes2.dex */
public class b extends com.oney.WebRTCModule.a {

    /* renamed from: i  reason: collision with root package name */
    private static final String f17974i = "b";

    /* renamed from: e  reason: collision with root package name */
    private boolean f17975e;

    /* renamed from: f  reason: collision with root package name */
    private final CameraEnumerator f17976f;

    /* renamed from: g  reason: collision with root package name */
    private final ReadableMap f17977g;

    /* renamed from: h  reason: collision with root package name */
    private final c f17978h;

    /* loaded from: classes2.dex */
    class a implements CameraVideoCapturer.CameraSwitchHandler {
        a() {
        }

        @Override // org.webrtc.CameraVideoCapturer.CameraSwitchHandler
        public void onCameraSwitchDone(boolean z11) {
            b.this.f17975e = z11;
        }

        @Override // org.webrtc.CameraVideoCapturer.CameraSwitchHandler
        public void onCameraSwitchError(String str) {
            String str2 = b.f17974i;
            Log.e(str2, "Error switching camera: " + str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.oney.WebRTCModule.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class C0323b implements CameraVideoCapturer.CameraSwitchHandler {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f17980a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f17981b;

        C0323b(boolean z11, int i11) {
            this.f17980a = z11;
            this.f17981b = i11;
        }

        @Override // org.webrtc.CameraVideoCapturer.CameraSwitchHandler
        public void onCameraSwitchDone(boolean z11) {
            boolean z12 = this.f17980a;
            if (z11 == z12) {
                b.this.f17975e = z12;
                return;
            }
            int i11 = this.f17981b - 1;
            if (i11 > 0) {
                b.this.n(z12, i11);
            }
        }

        @Override // org.webrtc.CameraVideoCapturer.CameraSwitchHandler
        public void onCameraSwitchError(String str) {
            String str2 = b.f17974i;
            Log.e(str2, "Error switching camera: " + str);
        }
    }

    public b(CameraEnumerator cameraEnumerator, ReadableMap readableMap) {
        super(readableMap.getInt(Snapshot.WIDTH), readableMap.getInt(Snapshot.HEIGHT), readableMap.getInt("frameRate"));
        this.f17978h = new c();
        this.f17976f = cameraEnumerator;
        this.f17977g = readableMap;
    }

    private VideoCapturer l(String str, String str2) {
        String[] deviceNames = this.f17976f.getDeviceNames();
        ArrayList arrayList = new ArrayList();
        if (str != null) {
            int length = deviceNames.length;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    break;
                }
                String str3 = deviceNames[i11];
                if (str3.equals(str)) {
                    CameraVideoCapturer createCapturer = this.f17976f.createCapturer(str3, this.f17978h);
                    String str4 = "Create user-specified camera " + str3;
                    if (createCapturer != null) {
                        Log.d(f17974i, str4 + " succeeded");
                        this.f17975e = this.f17976f.isFrontFacing(str3);
                        return createCapturer;
                    }
                    Log.d(f17974i, str4 + " failed");
                    arrayList.add(str3);
                } else {
                    i11++;
                }
            }
        }
        boolean z11 = str2 == null || !str2.equals("environment");
        for (String str5 : deviceNames) {
            if (!arrayList.contains(str5)) {
                try {
                    if (this.f17976f.isFrontFacing(str5) != z11) {
                        continue;
                    } else {
                        CameraVideoCapturer createCapturer2 = this.f17976f.createCapturer(str5, this.f17978h);
                        String str6 = "Create camera " + str5;
                        if (createCapturer2 != null) {
                            Log.d(f17974i, str6 + " succeeded");
                            this.f17975e = this.f17976f.isFrontFacing(str5);
                            return createCapturer2;
                        }
                        Log.d(f17974i, str6 + " failed");
                        arrayList.add(str5);
                    }
                } catch (Exception e11) {
                    Log.e(f17974i, "Failed to check the facing mode of camera " + str5, e11);
                    arrayList.add(str5);
                }
            }
        }
        for (String str7 : deviceNames) {
            if (!arrayList.contains(str7)) {
                CameraVideoCapturer createCapturer3 = this.f17976f.createCapturer(str7, this.f17978h);
                String str8 = "Create fallback camera " + str7;
                if (createCapturer3 != null) {
                    Log.d(f17974i, str8 + " succeeded");
                    this.f17975e = this.f17976f.isFrontFacing(str7);
                    return createCapturer3;
                }
                Log.d(f17974i, str8 + " failed");
                arrayList.add(str7);
            }
        }
        Log.w(f17974i, "Unable to identify a suitable camera.");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n(boolean z11, int i11) {
        ((CameraVideoCapturer) this.f17971d).switchCamera(new C0323b(z11, i11));
    }

    @Override // com.oney.WebRTCModule.a
    protected VideoCapturer a() {
        return l(m.a(this.f17977g, "deviceId"), m.a(this.f17977g, "facingMode"));
    }

    public void m() {
        VideoCapturer videoCapturer = this.f17971d;
        if (videoCapturer instanceof CameraVideoCapturer) {
            CameraVideoCapturer cameraVideoCapturer = (CameraVideoCapturer) videoCapturer;
            int length = this.f17976f.getDeviceNames().length;
            if (length < 2) {
                return;
            }
            if (length == 2) {
                cameraVideoCapturer.switchCamera(new a());
            } else {
                n(!this.f17975e, length);
            }
        }
    }
}