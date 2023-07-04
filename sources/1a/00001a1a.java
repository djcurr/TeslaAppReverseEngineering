package com.facebook.react.views.image;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;

/* loaded from: classes3.dex */
public class g<INFO> extends je.g implements ge.d<INFO> {

    /* loaded from: classes3.dex */
    private static final class b extends Drawable {
        private b() {
        }

        @Override // android.graphics.drawable.Drawable
        public void draw(Canvas canvas) {
        }

        @Override // android.graphics.drawable.Drawable
        public int getOpacity() {
            return -1;
        }

        @Override // android.graphics.drawable.Drawable
        public void setAlpha(int i11) {
        }

        @Override // android.graphics.drawable.Drawable
        public void setColorFilter(ColorFilter colorFilter) {
        }
    }

    public g() {
        super(new b());
    }

    @Override // ge.d
    public void a(String str, INFO info) {
    }

    @Override // ge.d
    public void f(String str) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // je.g, android.graphics.drawable.Drawable
    public boolean onLevelChange(int i11) {
        x(i11, 10000);
        return super.onLevelChange(i11);
    }

    @Override // ge.d
    public void q(String str, Throwable th2) {
    }

    public void x(int i11, int i12) {
        throw null;
    }
}