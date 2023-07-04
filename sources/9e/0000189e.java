package com.facebook.react;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.KeyEvent;

/* loaded from: classes3.dex */
public abstract class l extends androidx.appcompat.app.d implements com.facebook.react.modules.core.b, com.facebook.react.modules.core.e {

    /* renamed from: a  reason: collision with root package name */
    private final m f11912a = k();

    @Override // com.facebook.react.modules.core.e
    public void b(String[] strArr, int i11, com.facebook.react.modules.core.f fVar) {
        this.f11912a.requestPermissions(strArr, i11, fVar);
    }

    @Override // com.facebook.react.modules.core.b
    public void i() {
        super.onBackPressed();
    }

    protected m k() {
        return new m(this, l());
    }

    protected String l() {
        return null;
    }

    @Override // androidx.fragment.app.h, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i11, int i12, Intent intent) {
        super.onActivityResult(i11, i12, intent);
        this.f11912a.onActivityResult(i11, i12, intent);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (this.f11912a.onBackPressed()) {
            return;
        }
        super.onBackPressed();
    }

    @Override // androidx.appcompat.app.d, androidx.fragment.app.h, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f11912a.onConfigurationChanged(configuration);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.h, androidx.activity.ComponentActivity, androidx.core.app.f, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f11912a.onCreate(bundle);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.d, androidx.fragment.app.h, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.f11912a.onDestroy();
    }

    @Override // androidx.appcompat.app.d, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i11, KeyEvent keyEvent) {
        return this.f11912a.onKeyDown(i11, keyEvent) || super.onKeyDown(i11, keyEvent);
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyLongPress(int i11, KeyEvent keyEvent) {
        return this.f11912a.onKeyLongPress(i11, keyEvent) || super.onKeyLongPress(i11, keyEvent);
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i11, KeyEvent keyEvent) {
        return this.f11912a.onKeyUp(i11, keyEvent) || super.onKeyUp(i11, keyEvent);
    }

    @Override // androidx.fragment.app.h, android.app.Activity
    public void onNewIntent(Intent intent) {
        if (this.f11912a.onNewIntent(intent)) {
            return;
        }
        super.onNewIntent(intent);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.h, android.app.Activity
    public void onPause() {
        super.onPause();
        this.f11912a.onPause();
    }

    @Override // androidx.fragment.app.h, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i11, String[] strArr, int[] iArr) {
        this.f11912a.onRequestPermissionsResult(i11, strArr, iArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.h, android.app.Activity
    public void onResume() {
        super.onResume();
        this.f11912a.onResume();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z11) {
        super.onWindowFocusChanged(z11);
        this.f11912a.onWindowFocusChanged(z11);
    }
}