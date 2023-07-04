package org.godotengine.godot;

import android.app.Instrumentation;
import android.content.Intent;
import android.os.Bundle;

/* loaded from: classes5.dex */
public class GodotInstrumentation extends Instrumentation {
    private Intent intent;

    @Override // android.app.Instrumentation
    public void onCreate(Bundle bundle) {
        this.intent = (Intent) bundle.getParcelable("intent");
        start();
    }

    @Override // android.app.Instrumentation
    public void onStart() {
        startActivitySync(this.intent);
    }
}