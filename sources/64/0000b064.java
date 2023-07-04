package ra;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import bb.j;

/* loaded from: classes.dex */
public abstract class b<T extends Drawable> implements ja.c<T>, ja.b {

    /* renamed from: a  reason: collision with root package name */
    protected final T f49330a;

    public b(T t11) {
        this.f49330a = (T) j.d(t11);
    }

    @Override // ja.c
    /* renamed from: c */
    public final T get() {
        Drawable.ConstantState constantState = this.f49330a.getConstantState();
        if (constantState == null) {
            return this.f49330a;
        }
        return (T) constantState.newDrawable();
    }

    @Override // ja.b
    public void initialize() {
        T t11 = this.f49330a;
        if (t11 instanceof BitmapDrawable) {
            ((BitmapDrawable) t11).getBitmap().prepareToDraw();
        } else if (t11 instanceof ta.c) {
            ((ta.c) t11).e().prepareToDraw();
        }
    }
}