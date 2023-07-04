package com.tesla.godot;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.bridge.ReactApplicationContext;
import com.tesla.logging.g;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.Collections;
import java.util.concurrent.ConcurrentLinkedQueue;
import ku.e;
import org.godotengine.godot.Godot;
import org.godotengine.godot.plugin.GodotPluginRegistry;
import tt.l;

/* loaded from: classes6.dex */
public class TMGodot extends Godot {
    private static final String TAG = "TMGodot";
    private static WeakReference<Listener> _listener;
    private static TMGodot instance;
    private final g logger = g.g(TAG);
    private final ReactApplicationContext react;
    private static final Collection<String> _queuedMessages = new ConcurrentLinkedQueue();
    private static boolean _godotReady = false;

    /* loaded from: classes6.dex */
    public interface Listener {
        void onGodotReady();
    }

    public TMGodot(ReactApplicationContext reactApplicationContext) {
        this.react = reactApplicationContext;
    }

    public static void clearQueuedMessages() {
        _queuedMessages.clear();
    }

    public static TMGodot getInstance(ReactApplicationContext reactApplicationContext) {
        if (instance == null) {
            e.d().j(l.GODOT_INITIALIZATION, Collections.emptyList());
            instance = new TMGodot(reactApplicationContext);
        }
        return instance;
    }

    public static Collection<String> getQueuedMessages() {
        return _queuedMessages;
    }

    public static AndroidGodotInterface godotInterface() {
        return (AndroidGodotInterface) GodotPluginRegistry.getPluginRegistry().getPlugin("AndroidGodotInterface");
    }

    public static boolean godotReady() {
        return _godotReady;
    }

    public static void queueMessage(String str) {
        _queuedMessages.add(str);
    }

    public static void sendMessageToGodot(String str) {
        godotInterface().addMessage(str);
    }

    public static void setGodotReady(boolean z11) {
        e.d().e(l.GODOT_INITIALIZATION, Collections.emptyList(), Collections.emptyList());
        _godotReady = z11;
        WeakReference<Listener> weakReference = _listener;
        if (weakReference != null) {
            weakReference.get().onGodotReady();
        }
    }

    public static void setListener(Listener listener) {
        _listener = new WeakReference<>(listener);
    }

    @Override // androidx.fragment.app.Fragment
    public View getView() {
        this.logger.a("getView");
        return super.getView();
    }

    @Override // org.godotengine.godot.Godot
    public boolean gotTouchEvent(MotionEvent motionEvent) {
        this.logger.a("gotTouchEvent");
        return super.gotTouchEvent(motionEvent);
    }

    @Override // org.godotengine.godot.Godot, androidx.fragment.app.Fragment
    public void onActivityResult(int i11, int i12, Intent intent) {
        this.logger.a("onActivityResult");
        super.onActivityResult(i11, i12, intent);
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        this.logger.a("onAttach");
        super.onAttach(context);
    }

    @Override // org.godotengine.godot.Godot
    public void onBackPressed() {
        this.react.getCurrentActivity().onBackPressed();
        this.logger.a("onBackPressed");
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        this.logger.a("onConfigurationChanged");
        super.onConfigurationChanged(configuration);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        this.logger.a("onCreate");
        super.onCreate(bundle);
    }

    @Override // org.godotengine.godot.Godot, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.logger.a("onCreateView");
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    @Override // org.godotengine.godot.Godot, androidx.fragment.app.Fragment
    public void onDestroy() {
        this.logger.a("onDestroy");
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.logger.a("onDestroyView");
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        this.logger.a("onDetach");
        super.onDetach();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.godotengine.godot.Godot
    public void onGodotMainLoopStarted() {
        this.logger.a("onGodotMainLoopStarted");
        super.onGodotMainLoopStarted();
    }

    @Override // androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean z11) {
        this.logger.a("onHiddenChanged");
        super.onHiddenChanged(z11);
    }

    @Override // androidx.fragment.app.Fragment
    public void onInflate(Context context, AttributeSet attributeSet, Bundle bundle) {
        this.logger.a("onInflate");
        super.onInflate(context, attributeSet, bundle);
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onLowMemory() {
        this.logger.a("onLowMemory");
        super.onLowMemory();
    }

    @Override // org.godotengine.godot.Godot
    public void onNewIntent(Intent intent) {
        this.logger.a("onNewIntent");
        super.onNewIntent(intent);
    }

    @Override // org.godotengine.godot.Godot, androidx.fragment.app.Fragment
    public void onPause() {
        this.logger.a("onPause");
        super.onPause();
    }

    @Override // org.godotengine.godot.Godot, androidx.fragment.app.Fragment
    public void onResume() {
        this.logger.a("onResume");
        super.onResume();
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        this.logger.a("onSaveInstanceState");
        super.onSaveInstanceState(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        this.logger.a("onStart");
        super.onStart();
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        this.logger.a("onStop");
        super.onStop();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        this.logger.a("onViewCreated");
        super.onViewCreated(view, bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewStateRestored(Bundle bundle) {
        this.logger.a("onViewStateRestored");
        super.onViewStateRestored(bundle);
    }

    @Override // org.godotengine.godot.Godot
    public void restart() {
        this.logger.a("restart");
        super.restart();
    }

    @Override // org.godotengine.godot.Godot
    public void setKeepScreenOn(boolean z11) {
        this.logger.a("setKeepScreenOn");
        super.setKeepScreenOn(z11);
    }

    @Override // androidx.fragment.app.Fragment
    public void startActivity(Intent intent) {
        this.logger.a("startActivity");
        super.startActivity(intent);
    }

    @Override // androidx.fragment.app.Fragment
    public void startActivity(Intent intent, Bundle bundle) {
        this.logger.a("startActivity 2");
        super.startActivity(intent, bundle);
    }
}