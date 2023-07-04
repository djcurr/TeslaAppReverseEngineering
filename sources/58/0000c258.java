package yd;

import android.graphics.Color;
import com.facebook.react.fabric.FabricUIManager;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    public static final wd.a f59445a;

    /* renamed from: b  reason: collision with root package name */
    public static final wd.a f59446b;

    /* renamed from: c  reason: collision with root package name */
    public static final wd.a f59447c;

    /* renamed from: d  reason: collision with root package name */
    public static final wd.a f59448d;

    /* renamed from: e  reason: collision with root package name */
    public static final wd.a f59449e;

    static {
        new wd.a("Performance", "Markers for Performance", -16711936);
        new wd.a("Navigation", "Tag for navigation", Color.rgb(156, 39, 176));
        f59445a = new wd.a("RN Core", "Tag for React Native Core", -16777216);
        f59446b = new wd.a("Bridge Calls", "JS to Java calls (warning: this is spammy)", -65281);
        f59447c = new wd.a("Native Module", "Native Module init", Color.rgb(128, 0, 128));
        f59448d = new wd.a("UI Manager", "UI Manager View Operations (requires restart\nwarning: this is spammy)", -16711681);
        f59449e = new wd.a(FabricUIManager.TAG, "Fabric UI Manager View Operations", -16711681);
        new wd.a("FabricReconciler", "Reconciler for Fabric", -16711681);
        new wd.a("Relay", "including prefetching", Color.rgb(255, 153, 0));
    }
}