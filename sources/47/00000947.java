package androidx.vectordrawable.graphics.drawable;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes.dex */
public class c extends h implements Animatable {

    /* renamed from: b  reason: collision with root package name */
    private b f6279b;

    /* renamed from: c  reason: collision with root package name */
    private Context f6280c;

    /* renamed from: d  reason: collision with root package name */
    private ArgbEvaluator f6281d;

    /* renamed from: e  reason: collision with root package name */
    final Drawable.Callback f6282e;

    /* loaded from: classes.dex */
    class a implements Drawable.Callback {
        a() {
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void invalidateDrawable(Drawable drawable) {
            c.this.invalidateSelf();
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j11) {
            c.this.scheduleSelf(runnable, j11);
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            c.this.unscheduleSelf(runnable);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class b extends Drawable.ConstantState {

        /* renamed from: a  reason: collision with root package name */
        int f6284a;

        /* renamed from: b  reason: collision with root package name */
        i f6285b;

        /* renamed from: c  reason: collision with root package name */
        AnimatorSet f6286c;

        /* renamed from: d  reason: collision with root package name */
        ArrayList<Animator> f6287d;

        /* renamed from: e  reason: collision with root package name */
        androidx.collection.a<Animator, String> f6288e;

        public b(Context context, b bVar, Drawable.Callback callback, Resources resources) {
            if (bVar != null) {
                this.f6284a = bVar.f6284a;
                i iVar = bVar.f6285b;
                if (iVar != null) {
                    Drawable.ConstantState constantState = iVar.getConstantState();
                    if (resources != null) {
                        this.f6285b = (i) constantState.newDrawable(resources);
                    } else {
                        this.f6285b = (i) constantState.newDrawable();
                    }
                    i iVar2 = (i) this.f6285b.mutate();
                    this.f6285b = iVar2;
                    iVar2.setCallback(callback);
                    this.f6285b.setBounds(bVar.f6285b.getBounds());
                    this.f6285b.h(false);
                }
                ArrayList<Animator> arrayList = bVar.f6287d;
                if (arrayList != null) {
                    int size = arrayList.size();
                    this.f6287d = new ArrayList<>(size);
                    this.f6288e = new androidx.collection.a<>(size);
                    for (int i11 = 0; i11 < size; i11++) {
                        Animator animator = bVar.f6287d.get(i11);
                        Animator clone = animator.clone();
                        String str = bVar.f6288e.get(animator);
                        clone.setTarget(this.f6285b.d(str));
                        this.f6287d.add(clone);
                        this.f6288e.put(clone, str);
                    }
                    a();
                }
            }
        }

        public void a() {
            if (this.f6286c == null) {
                this.f6286c = new AnimatorSet();
            }
            this.f6286c.playTogether(this.f6287d);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f6284a;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }
    }

    c() {
        this(null, null, null);
    }

    public static c a(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        c cVar = new c(context);
        cVar.inflate(resources, xmlPullParser, attributeSet, theme);
        return cVar;
    }

    private void b(String str, Animator animator) {
        animator.setTarget(this.f6279b.f6285b.d(str));
        if (Build.VERSION.SDK_INT < 21) {
            c(animator);
        }
        b bVar = this.f6279b;
        if (bVar.f6287d == null) {
            bVar.f6287d = new ArrayList<>();
            this.f6279b.f6288e = new androidx.collection.a<>();
        }
        this.f6279b.f6287d.add(animator);
        this.f6279b.f6288e.put(animator, str);
    }

    private void c(Animator animator) {
        ArrayList<Animator> childAnimations;
        if ((animator instanceof AnimatorSet) && (childAnimations = ((AnimatorSet) animator).getChildAnimations()) != null) {
            for (int i11 = 0; i11 < childAnimations.size(); i11++) {
                c(childAnimations.get(i11));
            }
        }
        if (animator instanceof ObjectAnimator) {
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            String propertyName = objectAnimator.getPropertyName();
            if ("fillColor".equals(propertyName) || "strokeColor".equals(propertyName)) {
                if (this.f6281d == null) {
                    this.f6281d = new ArgbEvaluator();
                }
                objectAnimator.setEvaluator(this.f6281d);
            }
        }
    }

    @Override // androidx.vectordrawable.graphics.drawable.h, android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f6294a;
        if (drawable != null) {
            n3.a.a(drawable, theme);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        Drawable drawable = this.f6294a;
        if (drawable != null) {
            return n3.a.b(drawable);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.f6294a;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        this.f6279b.f6285b.draw(canvas);
        if (this.f6279b.f6286c.isStarted()) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        Drawable drawable = this.f6294a;
        if (drawable != null) {
            return n3.a.d(drawable);
        }
        return this.f6279b.f6285b.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        Drawable drawable = this.f6294a;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        return super.getChangingConfigurations() | this.f6279b.f6284a;
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        Drawable drawable = this.f6294a;
        if (drawable != null) {
            return n3.a.e(drawable);
        }
        return this.f6279b.f6285b.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        if (this.f6294a == null || Build.VERSION.SDK_INT < 24) {
            return null;
        }
        return new C0109c(this.f6294a.getConstantState());
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        Drawable drawable = this.f6294a;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return this.f6279b.f6285b.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        Drawable drawable = this.f6294a;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return this.f6279b.f6285b.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.f6294a;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return this.f6279b.f6285b.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        Drawable drawable = this.f6294a;
        if (drawable != null) {
            n3.a.g(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if ("animated-vector".equals(name)) {
                    TypedArray k11 = l3.i.k(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.a.f6271e);
                    int resourceId = k11.getResourceId(0, 0);
                    if (resourceId != 0) {
                        i b11 = i.b(resources, resourceId, theme);
                        b11.h(false);
                        b11.setCallback(this.f6282e);
                        i iVar = this.f6279b.f6285b;
                        if (iVar != null) {
                            iVar.setCallback(null);
                        }
                        this.f6279b.f6285b = b11;
                    }
                    k11.recycle();
                } else if ("target".equals(name)) {
                    TypedArray obtainAttributes = resources.obtainAttributes(attributeSet, androidx.vectordrawable.graphics.drawable.a.f6272f);
                    String string = obtainAttributes.getString(0);
                    int resourceId2 = obtainAttributes.getResourceId(1, 0);
                    if (resourceId2 != 0) {
                        Context context = this.f6280c;
                        if (context != null) {
                            b(string, e.i(context, resourceId2));
                        } else {
                            obtainAttributes.recycle();
                            throw new IllegalStateException("Context can't be null when inflating animators");
                        }
                    }
                    obtainAttributes.recycle();
                } else {
                    continue;
                }
            }
            eventType = xmlPullParser.next();
        }
        this.f6279b.a();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        Drawable drawable = this.f6294a;
        if (drawable != null) {
            return n3.a.h(drawable);
        }
        return this.f6279b.f6285b.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        Drawable drawable = this.f6294a;
        if (drawable != null) {
            return ((AnimatedVectorDrawable) drawable).isRunning();
        }
        return this.f6279b.f6286c.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        Drawable drawable = this.f6294a;
        if (drawable != null) {
            return drawable.isStateful();
        }
        return this.f6279b.f6285b.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        Drawable drawable = this.f6294a;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        Drawable drawable = this.f6294a;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.f6279b.f6285b.setBounds(rect);
        }
    }

    @Override // androidx.vectordrawable.graphics.drawable.h, android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i11) {
        Drawable drawable = this.f6294a;
        if (drawable != null) {
            return drawable.setLevel(i11);
        }
        return this.f6279b.f6285b.setLevel(i11);
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f6294a;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        return this.f6279b.f6285b.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i11) {
        Drawable drawable = this.f6294a;
        if (drawable != null) {
            drawable.setAlpha(i11);
        } else {
            this.f6279b.f6285b.setAlpha(i11);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z11) {
        Drawable drawable = this.f6294a;
        if (drawable != null) {
            n3.a.j(drawable, z11);
        } else {
            this.f6279b.f6285b.setAutoMirrored(z11);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f6294a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f6279b.f6285b.setColorFilter(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Drawable, n3.b
    public void setTint(int i11) {
        Drawable drawable = this.f6294a;
        if (drawable != null) {
            n3.a.n(drawable, i11);
        } else {
            this.f6279b.f6285b.setTint(i11);
        }
    }

    @Override // android.graphics.drawable.Drawable, n3.b
    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f6294a;
        if (drawable != null) {
            n3.a.o(drawable, colorStateList);
        } else {
            this.f6279b.f6285b.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable, n3.b
    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f6294a;
        if (drawable != null) {
            n3.a.p(drawable, mode);
        } else {
            this.f6279b.f6285b.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z11, boolean z12) {
        Drawable drawable = this.f6294a;
        if (drawable != null) {
            return drawable.setVisible(z11, z12);
        }
        this.f6279b.f6285b.setVisible(z11, z12);
        return super.setVisible(z11, z12);
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        Drawable drawable = this.f6294a;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
        } else if (this.f6279b.f6286c.isStarted()) {
        } else {
            this.f6279b.f6286c.start();
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        Drawable drawable = this.f6294a;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.f6279b.f6286c.end();
        }
    }

    private c(Context context) {
        this(context, null, null);
    }

    /* renamed from: androidx.vectordrawable.graphics.drawable.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    private static class C0109c extends Drawable.ConstantState {

        /* renamed from: a  reason: collision with root package name */
        private final Drawable.ConstantState f6289a;

        public C0109c(Drawable.ConstantState constantState) {
            this.f6289a = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            return this.f6289a.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f6289a.getChangingConfigurations();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            c cVar = new c();
            Drawable newDrawable = this.f6289a.newDrawable();
            cVar.f6294a = newDrawable;
            newDrawable.setCallback(cVar.f6282e);
            return cVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            c cVar = new c();
            Drawable newDrawable = this.f6289a.newDrawable(resources);
            cVar.f6294a = newDrawable;
            newDrawable.setCallback(cVar.f6282e);
            return cVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            c cVar = new c();
            Drawable newDrawable = this.f6289a.newDrawable(resources, theme);
            cVar.f6294a = newDrawable;
            newDrawable.setCallback(cVar.f6282e);
            return cVar;
        }
    }

    private c(Context context, b bVar, Resources resources) {
        this.f6281d = null;
        a aVar = new a();
        this.f6282e = aVar;
        this.f6280c = context;
        if (bVar != null) {
            this.f6279b = bVar;
        } else {
            this.f6279b = new b(context, bVar, aVar, resources);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        inflate(resources, xmlPullParser, attributeSet, null);
    }
}