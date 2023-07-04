package com.facebook.react.uimanager.layoutanimation;

import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.UiThreadUtil;

/* loaded from: classes3.dex */
public class e {
    private static Handler sCompletionHandler;
    private Runnable mCompletionRunnable;
    private boolean mShouldAnimateLayout;
    private final com.facebook.react.uimanager.layoutanimation.a mLayoutCreateAnimation = new h();
    private final com.facebook.react.uimanager.layoutanimation.a mLayoutUpdateAnimation = new k();
    private final com.facebook.react.uimanager.layoutanimation.a mLayoutDeleteAnimation = new i();
    private final SparseArray<j> mLayoutHandlers = new SparseArray<>(0);
    private long mMaxAnimationDuration = -1;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Callback f12343a;

        a(e eVar, Callback callback) {
            this.f12343a = callback;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f12343a.invoke(Boolean.TRUE);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class b implements Animation.AnimationListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f12344a;

        b(int i11) {
            this.f12344a = i11;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            e.this.mLayoutHandlers.remove(this.f12344a);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            e.this.mLayoutHandlers.put(this.f12344a, (j) animation);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class c implements Animation.AnimationListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f12346a;

        c(e eVar, f fVar) {
            this.f12346a = fVar;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            this.f12346a.a();
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    private void disableUserInteractions(View view) {
        view.setClickable(false);
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i11 = 0; i11 < viewGroup.getChildCount(); i11++) {
                disableUserInteractions(viewGroup.getChildAt(i11));
            }
        }
    }

    private void scheduleCompletionCallback(long j11) {
        if (sCompletionHandler == null) {
            sCompletionHandler = new Handler(Looper.getMainLooper());
        }
        Runnable runnable = this.mCompletionRunnable;
        if (runnable != null) {
            sCompletionHandler.removeCallbacks(runnable);
            sCompletionHandler.postDelayed(this.mCompletionRunnable, j11);
        }
    }

    public void applyLayoutUpdate(View view, int i11, int i12, int i13, int i14) {
        com.facebook.react.uimanager.layoutanimation.a aVar;
        UiThreadUtil.assertOnUiThread();
        int id2 = view.getId();
        j jVar = this.mLayoutHandlers.get(id2);
        if (jVar != null) {
            jVar.a(i11, i12, i13, i14);
            return;
        }
        if (view.getWidth() != 0 && view.getHeight() != 0) {
            aVar = this.mLayoutUpdateAnimation;
        } else {
            aVar = this.mLayoutCreateAnimation;
        }
        Animation a11 = aVar.a(view, i11, i12, i13, i14);
        if (a11 instanceof j) {
            a11.setAnimationListener(new b(id2));
        } else {
            view.layout(i11, i12, i13 + i11, i14 + i12);
        }
        if (a11 != null) {
            long duration = a11.getDuration();
            if (duration > this.mMaxAnimationDuration) {
                this.mMaxAnimationDuration = duration;
                scheduleCompletionCallback(duration);
            }
            view.startAnimation(a11);
        }
    }

    public void deleteView(View view, f fVar) {
        UiThreadUtil.assertOnUiThread();
        Animation a11 = this.mLayoutDeleteAnimation.a(view, view.getLeft(), view.getTop(), view.getWidth(), view.getHeight());
        if (a11 != null) {
            disableUserInteractions(view);
            a11.setAnimationListener(new c(this, fVar));
            long duration = a11.getDuration();
            if (duration > this.mMaxAnimationDuration) {
                scheduleCompletionCallback(duration);
                this.mMaxAnimationDuration = duration;
            }
            view.startAnimation(a11);
            return;
        }
        fVar.a();
    }

    public void initializeFromConfig(ReadableMap readableMap, Callback callback) {
        if (readableMap == null) {
            reset();
            return;
        }
        this.mShouldAnimateLayout = false;
        int i11 = readableMap.hasKey("duration") ? readableMap.getInt("duration") : 0;
        g gVar = g.CREATE;
        if (readableMap.hasKey(g.toString(gVar))) {
            this.mLayoutCreateAnimation.d(readableMap.getMap(g.toString(gVar)), i11);
            this.mShouldAnimateLayout = true;
        }
        g gVar2 = g.UPDATE;
        if (readableMap.hasKey(g.toString(gVar2))) {
            this.mLayoutUpdateAnimation.d(readableMap.getMap(g.toString(gVar2)), i11);
            this.mShouldAnimateLayout = true;
        }
        g gVar3 = g.DELETE;
        if (readableMap.hasKey(g.toString(gVar3))) {
            this.mLayoutDeleteAnimation.d(readableMap.getMap(g.toString(gVar3)), i11);
            this.mShouldAnimateLayout = true;
        }
        if (!this.mShouldAnimateLayout || callback == null) {
            return;
        }
        this.mCompletionRunnable = new a(this, callback);
    }

    public void reset() {
        this.mLayoutCreateAnimation.f();
        this.mLayoutUpdateAnimation.f();
        this.mLayoutDeleteAnimation.f();
        this.mCompletionRunnable = null;
        this.mShouldAnimateLayout = false;
        this.mMaxAnimationDuration = -1L;
    }

    public boolean shouldAnimateLayout(View view) {
        if (view == null) {
            return false;
        }
        return (this.mShouldAnimateLayout && view.getParent() != null) || this.mLayoutHandlers.get(view.getId()) != null;
    }
}