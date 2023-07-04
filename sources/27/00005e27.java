package com.swmansion.reanimated.transitions;

import android.view.View;
import android.view.ViewGroup;
import androidx.transition.a0;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.IllegalViewOperationException;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.m;
import com.facebook.react.uimanager.q0;

/* loaded from: classes6.dex */
public class TransitionModule {
    private final UIManagerModule mUIManager;

    public TransitionModule(UIManagerModule uIManagerModule) {
        this.mUIManager = uIManagerModule;
    }

    public void animateNextTransition(final int i11, final ReadableMap readableMap) {
        this.mUIManager.prependUIBlock(new q0() { // from class: com.swmansion.reanimated.transitions.TransitionModule.1
            @Override // com.facebook.react.uimanager.q0
            public void execute(m mVar) {
                try {
                    View resolveView = mVar.resolveView(i11);
                    if (resolveView instanceof ViewGroup) {
                        ReadableArray array = readableMap.getArray("transitions");
                        int size = array.size();
                        for (int i12 = 0; i12 < size; i12++) {
                            a0.a((ViewGroup) resolveView, TransitionUtils.inflate(array.getMap(i12)));
                        }
                    }
                } catch (IllegalViewOperationException unused) {
                }
            }
        });
    }
}