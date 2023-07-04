package com.facebook.react.devsupport;

import android.os.Handler;
import android.view.View;
import android.widget.EditText;

/* loaded from: classes3.dex */
public class d {

    /* renamed from: a  reason: collision with root package name */
    private boolean f11836a = false;

    /* loaded from: classes3.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            d.this.f11836a = false;
        }
    }

    public boolean b(int i11, View view) {
        if (i11 == 46 && !(view instanceof EditText)) {
            if (this.f11836a) {
                this.f11836a = false;
                return true;
            }
            this.f11836a = true;
            new Handler().postDelayed(new a(), 200L);
        }
        return false;
    }
}