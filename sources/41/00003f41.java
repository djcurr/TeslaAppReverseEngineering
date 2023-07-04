package com.oney.WebRTCModule;

import android.util.Log;
import org.webrtc.CameraVideoCapturer;

/* loaded from: classes2.dex */
class c implements CameraVideoCapturer.CameraEventsHandler {

    /* renamed from: a  reason: collision with root package name */
    private static final String f17985a = WebRTCModule.TAG;

    @Override // org.webrtc.CameraVideoCapturer.CameraEventsHandler
    public void onCameraClosed() {
        Log.d(f17985a, "CameraEventsHandler.onFirstFrameAvailable");
    }

    @Override // org.webrtc.CameraVideoCapturer.CameraEventsHandler
    public void onCameraDisconnected() {
        Log.d(f17985a, "CameraEventsHandler.onCameraDisconnected");
    }

    @Override // org.webrtc.CameraVideoCapturer.CameraEventsHandler
    public void onCameraError(String str) {
        String str2 = f17985a;
        Log.d(str2, "CameraEventsHandler.onCameraError: errorDescription=" + str);
    }

    @Override // org.webrtc.CameraVideoCapturer.CameraEventsHandler
    public void onCameraFreezed(String str) {
        String str2 = f17985a;
        Log.d(str2, "CameraEventsHandler.onCameraFreezed: errorDescription=" + str);
    }

    @Override // org.webrtc.CameraVideoCapturer.CameraEventsHandler
    public void onCameraOpening(String str) {
        String str2 = f17985a;
        Log.d(str2, "CameraEventsHandler.onCameraOpening: cameraName=" + str);
    }

    @Override // org.webrtc.CameraVideoCapturer.CameraEventsHandler
    public void onFirstFrameAvailable() {
        Log.d(f17985a, "CameraEventsHandler.onFirstFrameAvailable");
    }
}