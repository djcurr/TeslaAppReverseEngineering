package n3;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class f extends Drawable.ConstantState {

    /* renamed from: a  reason: collision with root package name */
    int f40434a;

    /* renamed from: b  reason: collision with root package name */
    Drawable.ConstantState f40435b;

    /* renamed from: c  reason: collision with root package name */
    ColorStateList f40436c;

    /* renamed from: d  reason: collision with root package name */
    PorterDuff.Mode f40437d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public f(f fVar) {
        this.f40436c = null;
        this.f40437d = d.f40426g;
        if (fVar != null) {
            this.f40434a = fVar.f40434a;
            this.f40435b = fVar.f40435b;
            this.f40436c = fVar.f40436c;
            this.f40437d = fVar.f40437d;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean a() {
        return this.f40435b != null;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        int i11 = this.f40434a;
        Drawable.ConstantState constantState = this.f40435b;
        return i11 | (constantState != null ? constantState.getChangingConfigurations() : 0);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable() {
        return newDrawable(null);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable(Resources resources) {
        if (Build.VERSION.SDK_INT >= 21) {
            return new e(this, resources);
        }
        return new d(this, resources);
    }
}