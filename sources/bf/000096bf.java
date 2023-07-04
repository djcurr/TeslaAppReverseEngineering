package org.godotengine.godot;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import androidx.fragment.app.h;

/* loaded from: classes5.dex */
public abstract class FullScreenGodotApp extends h {
    protected Godot godotFragment;

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        Godot godot = this.godotFragment;
        if (godot != null) {
            godot.onBackPressed();
        } else {
            super.onBackPressed();
        }
    }

    @Override // androidx.fragment.app.h, androidx.activity.ComponentActivity, androidx.core.app.f, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.godot_app_layout);
        this.godotFragment = new Godot();
        getSupportFragmentManager().m().p(R.id.godot_fragment_container, this.godotFragment).w(this.godotFragment).k();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyMultiple(int i11, int i12, KeyEvent keyEvent) {
        Godot godot = this.godotFragment;
        if (godot == null || !godot.onKeyMultiple(i11, i12, keyEvent)) {
            return super.onKeyMultiple(i11, i12, keyEvent);
        }
        return true;
    }

    @Override // androidx.fragment.app.h, android.app.Activity
    public void onNewIntent(Intent intent) {
        Godot godot = this.godotFragment;
        if (godot != null) {
            godot.onNewIntent(intent);
        }
    }
}