package com.facebook.react.bridge;

import android.content.res.AssetManager;

/* loaded from: classes3.dex */
public interface JSBundleLoaderDelegate {
    void loadScriptFromAssets(AssetManager assetManager, String str, boolean z11);

    void loadScriptFromFile(String str, String str2, boolean z11);

    void loadSplitBundleFromFile(String str, String str2);

    void setSourceURLs(String str, String str2);
}