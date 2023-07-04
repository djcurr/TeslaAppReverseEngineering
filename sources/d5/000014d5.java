package com.brentvatne.exoplayer;

import bj.i;
import bj.m;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import wi.a;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class h {

    /* renamed from: c  reason: collision with root package name */
    static final String[] f10430c = {"onVideoLoadStart", "onVideoLoad", "onVideoError", "onVideoProgress", "onVideoSeek", "onVideoEnd", "onVideoFullscreenPlayerWillPresent", "onVideoFullscreenPlayerDidPresent", "onVideoFullscreenPlayerWillDismiss", "onVideoFullscreenPlayerDidDismiss", "onPlaybackStalled", "onPlaybackResume", "onReadyForDisplay", "onVideoBuffer", "onVideoIdle", "onTimedMetadata", "onVideoAudioBecomingNoisy", "onAudioFocusChanged", "onPlaybackRateChange", "onVideoBandwidthUpdate"};

    /* renamed from: a  reason: collision with root package name */
    private final RCTEventEmitter f10431a;

    /* renamed from: b  reason: collision with root package name */
    private int f10432b = -1;

    /* JADX INFO: Access modifiers changed from: package-private */
    public h(ReactContext reactContext) {
        this.f10431a = (RCTEventEmitter) reactContext.getJSModule(RCTEventEmitter.class);
    }

    private void q(String str, WritableMap writableMap) {
        this.f10431a.receiveEvent(this.f10432b, str, writableMap);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a() {
        q("onVideoAudioBecomingNoisy", null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(boolean z11) {
        WritableMap createMap = Arguments.createMap();
        createMap.putBoolean("hasAudioFocus", z11);
        q("onAudioFocusChanged", createMap);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c(double d11, int i11, int i12, String str) {
        WritableMap createMap = Arguments.createMap();
        createMap.putDouble("bitrate", d11);
        createMap.putInt(Snapshot.WIDTH, i12);
        createMap.putInt(Snapshot.HEIGHT, i11);
        createMap.putString("trackId", str);
        q("onVideoBandwidthUpdate", createMap);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d(boolean z11) {
        WritableMap createMap = Arguments.createMap();
        createMap.putBoolean("isBuffering", z11);
        q("onVideoBuffer", createMap);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e() {
        q("onVideoEnd", null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void f(String str, Exception exc) {
        WritableMap createMap = Arguments.createMap();
        createMap.putString("errorString", str);
        createMap.putString("errorException", exc.toString());
        WritableMap createMap2 = Arguments.createMap();
        createMap2.putMap("error", createMap);
        q("onVideoError", createMap2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void g() {
        q("onVideoFullscreenPlayerDidDismiss", null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void h() {
        q("onVideoFullscreenPlayerDidPresent", null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void i() {
        q("onVideoFullscreenPlayerWillDismiss", null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void j() {
        q("onVideoFullscreenPlayerWillPresent", null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void k() {
        q("onVideoIdle", null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void l(double d11, double d12, int i11, int i12, WritableArray writableArray, WritableArray writableArray2, WritableArray writableArray3, String str) {
        WritableMap createMap = Arguments.createMap();
        createMap.putDouble("duration", d11 / 1000.0d);
        createMap.putDouble("currentTime", d12 / 1000.0d);
        WritableMap createMap2 = Arguments.createMap();
        createMap2.putInt(Snapshot.WIDTH, i11);
        createMap2.putInt(Snapshot.HEIGHT, i12);
        if (i11 > i12) {
            createMap2.putString("orientation", "landscape");
        } else {
            createMap2.putString("orientation", "portrait");
        }
        createMap.putMap("naturalSize", createMap2);
        createMap.putString("trackId", str);
        createMap.putArray("videoTracks", writableArray3);
        createMap.putArray("audioTracks", writableArray);
        createMap.putArray("textTracks", writableArray2);
        createMap.putBoolean("canPlayFastForward", true);
        createMap.putBoolean("canPlaySlowForward", true);
        createMap.putBoolean("canPlaySlowReverse", true);
        createMap.putBoolean("canPlayReverse", true);
        createMap.putBoolean("canPlayFastForward", true);
        createMap.putBoolean("canStepBackward", true);
        createMap.putBoolean("canStepForward", true);
        q("onVideoLoad", createMap);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void m() {
        q("onVideoLoadStart", null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void n(float f11) {
        WritableMap createMap = Arguments.createMap();
        createMap.putDouble("playbackRate", f11);
        q("onPlaybackRateChange", createMap);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void o(double d11, double d12, double d13, double d14) {
        WritableMap createMap = Arguments.createMap();
        createMap.putDouble("currentTime", d11 / 1000.0d);
        createMap.putDouble("playableDuration", d12 / 1000.0d);
        createMap.putDouble("seekableDuration", d13 / 1000.0d);
        createMap.putDouble("currentPlaybackTime", d14);
        q("onVideoProgress", createMap);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void p() {
        q("onReadyForDisplay", null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void r(long j11, long j12) {
        WritableMap createMap = Arguments.createMap();
        createMap.putDouble("currentTime", j11 / 1000.0d);
        createMap.putDouble("seekTime", j12 / 1000.0d);
        q("onVideoSeek", createMap);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void s(int i11) {
        this.f10432b = i11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void t(wi.a aVar) {
        WritableArray createArray = Arguments.createArray();
        for (int i11 = 0; i11 < aVar.d(); i11++) {
            a.b c11 = aVar.c(i11);
            if (c11 instanceof i) {
                i iVar = (i) c11;
                String str = iVar instanceof m ? ((m) iVar).f7709c : "";
                String str2 = iVar.f7697a;
                WritableMap createMap = Arguments.createMap();
                createMap.putString("identifier", str2);
                createMap.putString("value", str);
                createArray.pushMap(createMap);
            } else if (c11 instanceof yi.a) {
                yi.a aVar2 = (yi.a) c11;
                WritableMap createMap2 = Arguments.createMap();
                createMap2.putString("identifier", aVar2.f59592a);
                createMap2.putString("value", aVar2.f59593b);
                createArray.pushMap(createMap2);
            }
        }
        WritableMap createMap3 = Arguments.createMap();
        createMap3.putArray("metadata", createArray);
        q("onTimedMetadata", createMap3);
    }
}