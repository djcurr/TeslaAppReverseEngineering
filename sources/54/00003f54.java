package com.oney.WebRTCModule;

import org.webrtc.Logging;
import org.webrtc.NativeLibraryLoader;

/* loaded from: classes2.dex */
public class j implements NativeLibraryLoader {

    /* renamed from: a  reason: collision with root package name */
    private static String f18031a = "LibraryLoader";

    @Override // org.webrtc.NativeLibraryLoader
    public boolean load(String str) {
        String str2 = f18031a;
        Logging.d(str2, "Loading library: " + str);
        System.loadLibrary(str);
        return true;
    }
}