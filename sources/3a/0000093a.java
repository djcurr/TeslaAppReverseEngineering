package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Path;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.InflateException;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.StringTokenizer;

/* loaded from: classes.dex */
public abstract class y implements Cloneable {
    static final boolean DBG = false;
    private static final String LOG_TAG = "Transition";
    private static final int MATCH_FIRST = 1;
    public static final int MATCH_ID = 3;
    private static final String MATCH_ID_STR = "id";
    public static final int MATCH_INSTANCE = 1;
    private static final String MATCH_INSTANCE_STR = "instance";
    public static final int MATCH_ITEM_ID = 4;
    private static final String MATCH_ITEM_ID_STR = "itemId";
    private static final int MATCH_LAST = 4;
    public static final int MATCH_NAME = 2;
    private static final String MATCH_NAME_STR = "name";
    private ArrayList<e0> mEndValuesList;
    private f mEpicenterCallback;
    private androidx.collection.a<String, String> mNameOverrides;
    b0 mPropagation;
    private ArrayList<e0> mStartValuesList;
    private static final int[] DEFAULT_MATCH_ORDER = {2, 1, 3, 4};
    private static final p STRAIGHT_PATH_MOTION = new a();
    private static ThreadLocal<androidx.collection.a<Animator, d>> sRunningAnimators = new ThreadLocal<>();
    private String mName = getClass().getName();
    private long mStartDelay = -1;
    long mDuration = -1;
    private TimeInterpolator mInterpolator = null;
    ArrayList<Integer> mTargetIds = new ArrayList<>();
    ArrayList<View> mTargets = new ArrayList<>();
    private ArrayList<String> mTargetNames = null;
    private ArrayList<Class<?>> mTargetTypes = null;
    private ArrayList<Integer> mTargetIdExcludes = null;
    private ArrayList<View> mTargetExcludes = null;
    private ArrayList<Class<?>> mTargetTypeExcludes = null;
    private ArrayList<String> mTargetNameExcludes = null;
    private ArrayList<Integer> mTargetIdChildExcludes = null;
    private ArrayList<View> mTargetChildExcludes = null;
    private ArrayList<Class<?>> mTargetTypeChildExcludes = null;
    private f0 mStartValues = new f0();
    private f0 mEndValues = new f0();
    c0 mParent = null;
    private int[] mMatchOrder = DEFAULT_MATCH_ORDER;
    boolean mCanRemoveViews = false;
    ArrayList<Animator> mCurrentAnimators = new ArrayList<>();
    private int mNumInstances = 0;
    private boolean mPaused = false;
    private boolean mEnded = false;
    private ArrayList<g> mListeners = null;
    private ArrayList<Animator> mAnimators = new ArrayList<>();
    private p mPathMotion = STRAIGHT_PATH_MOTION;

    /* loaded from: classes.dex */
    class a extends p {
        a() {
        }

        @Override // androidx.transition.p
        public Path a(float f11, float f12, float f13, float f14) {
            Path path = new Path();
            path.moveTo(f11, f12);
            path.lineTo(f13, f14);
            return path;
        }
    }

    /* loaded from: classes.dex */
    public class b extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ androidx.collection.a f6257a;

        b(androidx.collection.a aVar) {
            y.this = r1;
            this.f6257a = aVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f6257a.remove(animator);
            y.this.mCurrentAnimators.remove(animator);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            y.this.mCurrentAnimators.add(animator);
        }
    }

    /* loaded from: classes.dex */
    public class c extends AnimatorListenerAdapter {
        c() {
            y.this = r1;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            y.this.end();
            animator.removeListener(this);
        }
    }

    /* loaded from: classes.dex */
    public static class d {

        /* renamed from: a */
        View f6260a;

        /* renamed from: b */
        String f6261b;

        /* renamed from: c */
        e0 f6262c;

        /* renamed from: d */
        a1 f6263d;

        /* renamed from: e */
        y f6264e;

        d(View view, String str, y yVar, a1 a1Var, e0 e0Var) {
            this.f6260a = view;
            this.f6261b = str;
            this.f6262c = e0Var;
            this.f6263d = a1Var;
            this.f6264e = yVar;
        }
    }

    /* loaded from: classes.dex */
    public static class e {
        static <T> ArrayList<T> a(ArrayList<T> arrayList, T t11) {
            if (arrayList == null) {
                arrayList = new ArrayList<>();
            }
            if (!arrayList.contains(t11)) {
                arrayList.add(t11);
            }
            return arrayList;
        }

        static <T> ArrayList<T> b(ArrayList<T> arrayList, T t11) {
            if (arrayList != null) {
                arrayList.remove(t11);
                if (arrayList.isEmpty()) {
                    return null;
                }
                return arrayList;
            }
            return arrayList;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class f {
        public abstract Rect a(y yVar);
    }

    /* loaded from: classes.dex */
    public interface g {
        void onTransitionCancel(y yVar);

        void onTransitionEnd(y yVar);

        void onTransitionPause(y yVar);

        void onTransitionResume(y yVar);

        void onTransitionStart(y yVar);
    }

    public y() {
    }

    private void addUnmatched(androidx.collection.a<View, e0> aVar, androidx.collection.a<View, e0> aVar2) {
        for (int i11 = 0; i11 < aVar.size(); i11++) {
            e0 o11 = aVar.o(i11);
            if (isValidTarget(o11.f6130b)) {
                this.mStartValuesList.add(o11);
                this.mEndValuesList.add(null);
            }
        }
        for (int i12 = 0; i12 < aVar2.size(); i12++) {
            e0 o12 = aVar2.o(i12);
            if (isValidTarget(o12.f6130b)) {
                this.mEndValuesList.add(o12);
                this.mStartValuesList.add(null);
            }
        }
    }

    private static void addViewValues(f0 f0Var, View view, e0 e0Var) {
        f0Var.f6135a.put(view, e0Var);
        int id2 = view.getId();
        if (id2 >= 0) {
            if (f0Var.f6136b.indexOfKey(id2) >= 0) {
                f0Var.f6136b.put(id2, null);
            } else {
                f0Var.f6136b.put(id2, view);
            }
        }
        String O = androidx.core.view.a0.O(view);
        if (O != null) {
            if (f0Var.f6138d.containsKey(O)) {
                f0Var.f6138d.put(O, null);
            } else {
                f0Var.f6138d.put(O, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                if (f0Var.f6137c.h(itemIdAtPosition) >= 0) {
                    View f11 = f0Var.f6137c.f(itemIdAtPosition);
                    if (f11 != null) {
                        androidx.core.view.a0.F0(f11, false);
                        f0Var.f6137c.j(itemIdAtPosition, null);
                        return;
                    }
                    return;
                }
                androidx.core.view.a0.F0(view, true);
                f0Var.f6137c.j(itemIdAtPosition, view);
            }
        }
    }

    private static boolean alreadyContains(int[] iArr, int i11) {
        int i12 = iArr[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            if (iArr[i13] == i12) {
                return true;
            }
        }
        return false;
    }

    private void captureHierarchy(View view, boolean z11) {
        if (view == null) {
            return;
        }
        int id2 = view.getId();
        ArrayList<Integer> arrayList = this.mTargetIdExcludes;
        if (arrayList == null || !arrayList.contains(Integer.valueOf(id2))) {
            ArrayList<View> arrayList2 = this.mTargetExcludes;
            if (arrayList2 == null || !arrayList2.contains(view)) {
                ArrayList<Class<?>> arrayList3 = this.mTargetTypeExcludes;
                if (arrayList3 != null) {
                    int size = arrayList3.size();
                    for (int i11 = 0; i11 < size; i11++) {
                        if (this.mTargetTypeExcludes.get(i11).isInstance(view)) {
                            return;
                        }
                    }
                }
                if (view.getParent() instanceof ViewGroup) {
                    e0 e0Var = new e0(view);
                    if (z11) {
                        captureStartValues(e0Var);
                    } else {
                        captureEndValues(e0Var);
                    }
                    e0Var.f6131c.add(this);
                    capturePropagationValues(e0Var);
                    if (z11) {
                        addViewValues(this.mStartValues, view, e0Var);
                    } else {
                        addViewValues(this.mEndValues, view, e0Var);
                    }
                }
                if (view instanceof ViewGroup) {
                    ArrayList<Integer> arrayList4 = this.mTargetIdChildExcludes;
                    if (arrayList4 == null || !arrayList4.contains(Integer.valueOf(id2))) {
                        ArrayList<View> arrayList5 = this.mTargetChildExcludes;
                        if (arrayList5 == null || !arrayList5.contains(view)) {
                            ArrayList<Class<?>> arrayList6 = this.mTargetTypeChildExcludes;
                            if (arrayList6 != null) {
                                int size2 = arrayList6.size();
                                for (int i12 = 0; i12 < size2; i12++) {
                                    if (this.mTargetTypeChildExcludes.get(i12).isInstance(view)) {
                                        return;
                                    }
                                }
                            }
                            ViewGroup viewGroup = (ViewGroup) view;
                            for (int i13 = 0; i13 < viewGroup.getChildCount(); i13++) {
                                captureHierarchy(viewGroup.getChildAt(i13), z11);
                            }
                        }
                    }
                }
            }
        }
    }

    private ArrayList<Integer> excludeId(ArrayList<Integer> arrayList, int i11, boolean z11) {
        if (i11 > 0) {
            if (z11) {
                return e.a(arrayList, Integer.valueOf(i11));
            }
            return e.b(arrayList, Integer.valueOf(i11));
        }
        return arrayList;
    }

    private static <T> ArrayList<T> excludeObject(ArrayList<T> arrayList, T t11, boolean z11) {
        if (t11 != null) {
            if (z11) {
                return e.a(arrayList, t11);
            }
            return e.b(arrayList, t11);
        }
        return arrayList;
    }

    private ArrayList<Class<?>> excludeType(ArrayList<Class<?>> arrayList, Class<?> cls, boolean z11) {
        if (cls != null) {
            if (z11) {
                return e.a(arrayList, cls);
            }
            return e.b(arrayList, cls);
        }
        return arrayList;
    }

    private ArrayList<View> excludeView(ArrayList<View> arrayList, View view, boolean z11) {
        if (view != null) {
            if (z11) {
                return e.a(arrayList, view);
            }
            return e.b(arrayList, view);
        }
        return arrayList;
    }

    private static androidx.collection.a<Animator, d> getRunningAnimators() {
        androidx.collection.a<Animator, d> aVar = sRunningAnimators.get();
        if (aVar == null) {
            androidx.collection.a<Animator, d> aVar2 = new androidx.collection.a<>();
            sRunningAnimators.set(aVar2);
            return aVar2;
        }
        return aVar;
    }

    private static boolean isValidMatch(int i11) {
        return i11 >= 1 && i11 <= 4;
    }

    private static boolean isValueChanged(e0 e0Var, e0 e0Var2, String str) {
        Object obj = e0Var.f6129a.get(str);
        Object obj2 = e0Var2.f6129a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return true ^ obj.equals(obj2);
    }

    private void matchIds(androidx.collection.a<View, e0> aVar, androidx.collection.a<View, e0> aVar2, SparseArray<View> sparseArray, SparseArray<View> sparseArray2) {
        View view;
        int size = sparseArray.size();
        for (int i11 = 0; i11 < size; i11++) {
            View valueAt = sparseArray.valueAt(i11);
            if (valueAt != null && isValidTarget(valueAt) && (view = sparseArray2.get(sparseArray.keyAt(i11))) != null && isValidTarget(view)) {
                e0 e0Var = aVar.get(valueAt);
                e0 e0Var2 = aVar2.get(view);
                if (e0Var != null && e0Var2 != null) {
                    this.mStartValuesList.add(e0Var);
                    this.mEndValuesList.add(e0Var2);
                    aVar.remove(valueAt);
                    aVar2.remove(view);
                }
            }
        }
    }

    private void matchInstances(androidx.collection.a<View, e0> aVar, androidx.collection.a<View, e0> aVar2) {
        e0 remove;
        for (int size = aVar.size() - 1; size >= 0; size--) {
            View k11 = aVar.k(size);
            if (k11 != null && isValidTarget(k11) && (remove = aVar2.remove(k11)) != null && isValidTarget(remove.f6130b)) {
                this.mStartValuesList.add(aVar.m(size));
                this.mEndValuesList.add(remove);
            }
        }
    }

    private void matchItemIds(androidx.collection.a<View, e0> aVar, androidx.collection.a<View, e0> aVar2, androidx.collection.d<View> dVar, androidx.collection.d<View> dVar2) {
        View f11;
        int m11 = dVar.m();
        for (int i11 = 0; i11 < m11; i11++) {
            View n11 = dVar.n(i11);
            if (n11 != null && isValidTarget(n11) && (f11 = dVar2.f(dVar.i(i11))) != null && isValidTarget(f11)) {
                e0 e0Var = aVar.get(n11);
                e0 e0Var2 = aVar2.get(f11);
                if (e0Var != null && e0Var2 != null) {
                    this.mStartValuesList.add(e0Var);
                    this.mEndValuesList.add(e0Var2);
                    aVar.remove(n11);
                    aVar2.remove(f11);
                }
            }
        }
    }

    private void matchNames(androidx.collection.a<View, e0> aVar, androidx.collection.a<View, e0> aVar2, androidx.collection.a<String, View> aVar3, androidx.collection.a<String, View> aVar4) {
        View view;
        int size = aVar3.size();
        for (int i11 = 0; i11 < size; i11++) {
            View o11 = aVar3.o(i11);
            if (o11 != null && isValidTarget(o11) && (view = aVar4.get(aVar3.k(i11))) != null && isValidTarget(view)) {
                e0 e0Var = aVar.get(o11);
                e0 e0Var2 = aVar2.get(view);
                if (e0Var != null && e0Var2 != null) {
                    this.mStartValuesList.add(e0Var);
                    this.mEndValuesList.add(e0Var2);
                    aVar.remove(o11);
                    aVar2.remove(view);
                }
            }
        }
    }

    private void matchStartAndEnd(f0 f0Var, f0 f0Var2) {
        androidx.collection.a<View, e0> aVar = new androidx.collection.a<>(f0Var.f6135a);
        androidx.collection.a<View, e0> aVar2 = new androidx.collection.a<>(f0Var2.f6135a);
        int i11 = 0;
        while (true) {
            int[] iArr = this.mMatchOrder;
            if (i11 < iArr.length) {
                int i12 = iArr[i11];
                if (i12 == 1) {
                    matchInstances(aVar, aVar2);
                } else if (i12 == 2) {
                    matchNames(aVar, aVar2, f0Var.f6138d, f0Var2.f6138d);
                } else if (i12 == 3) {
                    matchIds(aVar, aVar2, f0Var.f6136b, f0Var2.f6136b);
                } else if (i12 == 4) {
                    matchItemIds(aVar, aVar2, f0Var.f6137c, f0Var2.f6137c);
                }
                i11++;
            } else {
                addUnmatched(aVar, aVar2);
                return;
            }
        }
    }

    private static int[] parseMatchOrder(String str) {
        StringTokenizer stringTokenizer = new StringTokenizer(str, ",");
        int[] iArr = new int[stringTokenizer.countTokens()];
        int i11 = 0;
        while (stringTokenizer.hasMoreTokens()) {
            String trim = stringTokenizer.nextToken().trim();
            if ("id".equalsIgnoreCase(trim)) {
                iArr[i11] = 3;
            } else if (MATCH_INSTANCE_STR.equalsIgnoreCase(trim)) {
                iArr[i11] = 1;
            } else if ("name".equalsIgnoreCase(trim)) {
                iArr[i11] = 2;
            } else if (MATCH_ITEM_ID_STR.equalsIgnoreCase(trim)) {
                iArr[i11] = 4;
            } else if (trim.isEmpty()) {
                int[] iArr2 = new int[iArr.length - 1];
                System.arraycopy(iArr, 0, iArr2, 0, i11);
                i11--;
                iArr = iArr2;
            } else {
                throw new InflateException("Unknown match type in matchOrder: '" + trim + "'");
            }
            i11++;
        }
        return iArr;
    }

    private void runAnimator(Animator animator, androidx.collection.a<Animator, d> aVar) {
        if (animator != null) {
            animator.addListener(new b(aVar));
            animate(animator);
        }
    }

    public y addListener(g gVar) {
        if (this.mListeners == null) {
            this.mListeners = new ArrayList<>();
        }
        this.mListeners.add(gVar);
        return this;
    }

    public y addTarget(View view) {
        this.mTargets.add(view);
        return this;
    }

    protected void animate(Animator animator) {
        if (animator == null) {
            end();
            return;
        }
        if (getDuration() >= 0) {
            animator.setDuration(getDuration());
        }
        if (getStartDelay() >= 0) {
            animator.setStartDelay(getStartDelay() + animator.getStartDelay());
        }
        if (getInterpolator() != null) {
            animator.setInterpolator(getInterpolator());
        }
        animator.addListener(new c());
        animator.start();
    }

    public void cancel() {
        for (int size = this.mCurrentAnimators.size() - 1; size >= 0; size--) {
            this.mCurrentAnimators.get(size).cancel();
        }
        ArrayList<g> arrayList = this.mListeners;
        if (arrayList == null || arrayList.size() <= 0) {
            return;
        }
        ArrayList arrayList2 = (ArrayList) this.mListeners.clone();
        int size2 = arrayList2.size();
        for (int i11 = 0; i11 < size2; i11++) {
            ((g) arrayList2.get(i11)).onTransitionCancel(this);
        }
    }

    public abstract void captureEndValues(e0 e0Var);

    public void capturePropagationValues(e0 e0Var) {
        String[] propagationProperties;
        if (this.mPropagation == null || e0Var.f6129a.isEmpty() || (propagationProperties = this.mPropagation.getPropagationProperties()) == null) {
            return;
        }
        boolean z11 = false;
        int i11 = 0;
        while (true) {
            if (i11 >= propagationProperties.length) {
                z11 = true;
                break;
            } else if (!e0Var.f6129a.containsKey(propagationProperties[i11])) {
                break;
            } else {
                i11++;
            }
        }
        if (z11) {
            return;
        }
        this.mPropagation.captureValues(e0Var);
    }

    public abstract void captureStartValues(e0 e0Var);

    public void captureValues(ViewGroup viewGroup, boolean z11) {
        ArrayList<String> arrayList;
        ArrayList<Class<?>> arrayList2;
        androidx.collection.a<String, String> aVar;
        clearValues(z11);
        if ((this.mTargetIds.size() <= 0 && this.mTargets.size() <= 0) || (((arrayList = this.mTargetNames) != null && !arrayList.isEmpty()) || ((arrayList2 = this.mTargetTypes) != null && !arrayList2.isEmpty()))) {
            captureHierarchy(viewGroup, z11);
        } else {
            for (int i11 = 0; i11 < this.mTargetIds.size(); i11++) {
                View findViewById = viewGroup.findViewById(this.mTargetIds.get(i11).intValue());
                if (findViewById != null) {
                    e0 e0Var = new e0(findViewById);
                    if (z11) {
                        captureStartValues(e0Var);
                    } else {
                        captureEndValues(e0Var);
                    }
                    e0Var.f6131c.add(this);
                    capturePropagationValues(e0Var);
                    if (z11) {
                        addViewValues(this.mStartValues, findViewById, e0Var);
                    } else {
                        addViewValues(this.mEndValues, findViewById, e0Var);
                    }
                }
            }
            for (int i12 = 0; i12 < this.mTargets.size(); i12++) {
                View view = this.mTargets.get(i12);
                e0 e0Var2 = new e0(view);
                if (z11) {
                    captureStartValues(e0Var2);
                } else {
                    captureEndValues(e0Var2);
                }
                e0Var2.f6131c.add(this);
                capturePropagationValues(e0Var2);
                if (z11) {
                    addViewValues(this.mStartValues, view, e0Var2);
                } else {
                    addViewValues(this.mEndValues, view, e0Var2);
                }
            }
        }
        if (z11 || (aVar = this.mNameOverrides) == null) {
            return;
        }
        int size = aVar.size();
        ArrayList arrayList3 = new ArrayList(size);
        for (int i13 = 0; i13 < size; i13++) {
            arrayList3.add(this.mStartValues.f6138d.remove(this.mNameOverrides.k(i13)));
        }
        for (int i14 = 0; i14 < size; i14++) {
            View view2 = (View) arrayList3.get(i14);
            if (view2 != null) {
                this.mStartValues.f6138d.put(this.mNameOverrides.o(i14), view2);
            }
        }
    }

    public void clearValues(boolean z11) {
        if (z11) {
            this.mStartValues.f6135a.clear();
            this.mStartValues.f6136b.clear();
            this.mStartValues.f6137c.b();
            return;
        }
        this.mEndValues.f6135a.clear();
        this.mEndValues.f6136b.clear();
        this.mEndValues.f6137c.b();
    }

    public Animator createAnimator(ViewGroup viewGroup, e0 e0Var, e0 e0Var2) {
        return null;
    }

    public void createAnimators(ViewGroup viewGroup, f0 f0Var, f0 f0Var2, ArrayList<e0> arrayList, ArrayList<e0> arrayList2) {
        Animator createAnimator;
        int i11;
        int i12;
        View view;
        Animator animator;
        e0 e0Var;
        Animator animator2;
        e0 e0Var2;
        androidx.collection.a<Animator, d> runningAnimators = getRunningAnimators();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        long j11 = Long.MAX_VALUE;
        int i13 = 0;
        while (i13 < size) {
            e0 e0Var3 = arrayList.get(i13);
            e0 e0Var4 = arrayList2.get(i13);
            if (e0Var3 != null && !e0Var3.f6131c.contains(this)) {
                e0Var3 = null;
            }
            if (e0Var4 != null && !e0Var4.f6131c.contains(this)) {
                e0Var4 = null;
            }
            if (e0Var3 != null || e0Var4 != null) {
                if ((e0Var3 == null || e0Var4 == null || isTransitionRequired(e0Var3, e0Var4)) && (createAnimator = createAnimator(viewGroup, e0Var3, e0Var4)) != null) {
                    if (e0Var4 != null) {
                        view = e0Var4.f6130b;
                        String[] transitionProperties = getTransitionProperties();
                        if (transitionProperties != null && transitionProperties.length > 0) {
                            e0Var2 = new e0(view);
                            i11 = size;
                            e0 e0Var5 = f0Var2.f6135a.get(view);
                            if (e0Var5 != null) {
                                int i14 = 0;
                                while (i14 < transitionProperties.length) {
                                    e0Var2.f6129a.put(transitionProperties[i14], e0Var5.f6129a.get(transitionProperties[i14]));
                                    i14++;
                                    i13 = i13;
                                    e0Var5 = e0Var5;
                                }
                            }
                            i12 = i13;
                            int size2 = runningAnimators.size();
                            int i15 = 0;
                            while (true) {
                                if (i15 >= size2) {
                                    animator2 = createAnimator;
                                    break;
                                }
                                d dVar = runningAnimators.get(runningAnimators.k(i15));
                                if (dVar.f6262c != null && dVar.f6260a == view && dVar.f6261b.equals(getName()) && dVar.f6262c.equals(e0Var2)) {
                                    animator2 = null;
                                    break;
                                }
                                i15++;
                            }
                        } else {
                            i11 = size;
                            i12 = i13;
                            animator2 = createAnimator;
                            e0Var2 = null;
                        }
                        animator = animator2;
                        e0Var = e0Var2;
                    } else {
                        i11 = size;
                        i12 = i13;
                        view = e0Var3.f6130b;
                        animator = createAnimator;
                        e0Var = null;
                    }
                    if (animator != null) {
                        b0 b0Var = this.mPropagation;
                        if (b0Var != null) {
                            long startDelay = b0Var.getStartDelay(viewGroup, this, e0Var3, e0Var4);
                            sparseIntArray.put(this.mAnimators.size(), (int) startDelay);
                            j11 = Math.min(startDelay, j11);
                        }
                        runningAnimators.put(animator, new d(view, getName(), this, p0.d(viewGroup), e0Var));
                        this.mAnimators.add(animator);
                        j11 = j11;
                    }
                    i13 = i12 + 1;
                    size = i11;
                }
            }
            i11 = size;
            i12 = i13;
            i13 = i12 + 1;
            size = i11;
        }
        if (sparseIntArray.size() != 0) {
            for (int i16 = 0; i16 < sparseIntArray.size(); i16++) {
                Animator animator3 = this.mAnimators.get(sparseIntArray.keyAt(i16));
                animator3.setStartDelay((sparseIntArray.valueAt(i16) - j11) + animator3.getStartDelay());
            }
        }
    }

    public void end() {
        int i11 = this.mNumInstances - 1;
        this.mNumInstances = i11;
        if (i11 == 0) {
            ArrayList<g> arrayList = this.mListeners;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.mListeners.clone();
                int size = arrayList2.size();
                for (int i12 = 0; i12 < size; i12++) {
                    ((g) arrayList2.get(i12)).onTransitionEnd(this);
                }
            }
            for (int i13 = 0; i13 < this.mStartValues.f6137c.m(); i13++) {
                View n11 = this.mStartValues.f6137c.n(i13);
                if (n11 != null) {
                    androidx.core.view.a0.F0(n11, false);
                }
            }
            for (int i14 = 0; i14 < this.mEndValues.f6137c.m(); i14++) {
                View n12 = this.mEndValues.f6137c.n(i14);
                if (n12 != null) {
                    androidx.core.view.a0.F0(n12, false);
                }
            }
            this.mEnded = true;
        }
    }

    public y excludeChildren(View view, boolean z11) {
        this.mTargetChildExcludes = excludeView(this.mTargetChildExcludes, view, z11);
        return this;
    }

    public y excludeTarget(View view, boolean z11) {
        this.mTargetExcludes = excludeView(this.mTargetExcludes, view, z11);
        return this;
    }

    public void forceToEnd(ViewGroup viewGroup) {
        androidx.collection.a<Animator, d> runningAnimators = getRunningAnimators();
        int size = runningAnimators.size();
        if (viewGroup == null || size == 0) {
            return;
        }
        a1 d11 = p0.d(viewGroup);
        androidx.collection.a aVar = new androidx.collection.a(runningAnimators);
        runningAnimators.clear();
        for (int i11 = size - 1; i11 >= 0; i11--) {
            d dVar = (d) aVar.o(i11);
            if (dVar.f6260a != null && d11 != null && d11.equals(dVar.f6263d)) {
                ((Animator) aVar.k(i11)).end();
            }
        }
    }

    public long getDuration() {
        return this.mDuration;
    }

    public Rect getEpicenter() {
        f fVar = this.mEpicenterCallback;
        if (fVar == null) {
            return null;
        }
        return fVar.a(this);
    }

    public f getEpicenterCallback() {
        return this.mEpicenterCallback;
    }

    public TimeInterpolator getInterpolator() {
        return this.mInterpolator;
    }

    public e0 getMatchedTransitionValues(View view, boolean z11) {
        c0 c0Var = this.mParent;
        if (c0Var != null) {
            return c0Var.getMatchedTransitionValues(view, z11);
        }
        ArrayList<e0> arrayList = z11 ? this.mStartValuesList : this.mEndValuesList;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i11 = -1;
        int i12 = 0;
        while (true) {
            if (i12 >= size) {
                break;
            }
            e0 e0Var = arrayList.get(i12);
            if (e0Var == null) {
                return null;
            }
            if (e0Var.f6130b == view) {
                i11 = i12;
                break;
            }
            i12++;
        }
        if (i11 >= 0) {
            return (z11 ? this.mEndValuesList : this.mStartValuesList).get(i11);
        }
        return null;
    }

    public String getName() {
        return this.mName;
    }

    public p getPathMotion() {
        return this.mPathMotion;
    }

    public b0 getPropagation() {
        return this.mPropagation;
    }

    public long getStartDelay() {
        return this.mStartDelay;
    }

    public List<Integer> getTargetIds() {
        return this.mTargetIds;
    }

    public List<String> getTargetNames() {
        return this.mTargetNames;
    }

    public List<Class<?>> getTargetTypes() {
        return this.mTargetTypes;
    }

    public List<View> getTargets() {
        return this.mTargets;
    }

    public String[] getTransitionProperties() {
        return null;
    }

    public e0 getTransitionValues(View view, boolean z11) {
        c0 c0Var = this.mParent;
        if (c0Var != null) {
            return c0Var.getTransitionValues(view, z11);
        }
        return (z11 ? this.mStartValues : this.mEndValues).f6135a.get(view);
    }

    public boolean isTransitionRequired(e0 e0Var, e0 e0Var2) {
        if (e0Var == null || e0Var2 == null) {
            return false;
        }
        String[] transitionProperties = getTransitionProperties();
        if (transitionProperties != null) {
            for (String str : transitionProperties) {
                if (!isValueChanged(e0Var, e0Var2, str)) {
                }
            }
            return false;
        }
        for (String str2 : e0Var.f6129a.keySet()) {
            if (isValueChanged(e0Var, e0Var2, str2)) {
            }
        }
        return false;
        return true;
    }

    public boolean isValidTarget(View view) {
        ArrayList<Class<?>> arrayList;
        ArrayList<String> arrayList2;
        int id2 = view.getId();
        ArrayList<Integer> arrayList3 = this.mTargetIdExcludes;
        if (arrayList3 == null || !arrayList3.contains(Integer.valueOf(id2))) {
            ArrayList<View> arrayList4 = this.mTargetExcludes;
            if (arrayList4 == null || !arrayList4.contains(view)) {
                ArrayList<Class<?>> arrayList5 = this.mTargetTypeExcludes;
                if (arrayList5 != null) {
                    int size = arrayList5.size();
                    for (int i11 = 0; i11 < size; i11++) {
                        if (this.mTargetTypeExcludes.get(i11).isInstance(view)) {
                            return false;
                        }
                    }
                }
                if (this.mTargetNameExcludes == null || androidx.core.view.a0.O(view) == null || !this.mTargetNameExcludes.contains(androidx.core.view.a0.O(view))) {
                    if ((this.mTargetIds.size() == 0 && this.mTargets.size() == 0 && (((arrayList = this.mTargetTypes) == null || arrayList.isEmpty()) && ((arrayList2 = this.mTargetNames) == null || arrayList2.isEmpty()))) || this.mTargetIds.contains(Integer.valueOf(id2)) || this.mTargets.contains(view)) {
                        return true;
                    }
                    ArrayList<String> arrayList6 = this.mTargetNames;
                    if (arrayList6 == null || !arrayList6.contains(androidx.core.view.a0.O(view))) {
                        if (this.mTargetTypes != null) {
                            for (int i12 = 0; i12 < this.mTargetTypes.size(); i12++) {
                                if (this.mTargetTypes.get(i12).isInstance(view)) {
                                    return true;
                                }
                            }
                        }
                        return false;
                    }
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public void pause(View view) {
        if (this.mEnded) {
            return;
        }
        for (int size = this.mCurrentAnimators.size() - 1; size >= 0; size--) {
            androidx.transition.a.b(this.mCurrentAnimators.get(size));
        }
        ArrayList<g> arrayList = this.mListeners;
        if (arrayList != null && arrayList.size() > 0) {
            ArrayList arrayList2 = (ArrayList) this.mListeners.clone();
            int size2 = arrayList2.size();
            for (int i11 = 0; i11 < size2; i11++) {
                ((g) arrayList2.get(i11)).onTransitionPause(this);
            }
        }
        this.mPaused = true;
    }

    public void playTransition(ViewGroup viewGroup) {
        d dVar;
        this.mStartValuesList = new ArrayList<>();
        this.mEndValuesList = new ArrayList<>();
        matchStartAndEnd(this.mStartValues, this.mEndValues);
        androidx.collection.a<Animator, d> runningAnimators = getRunningAnimators();
        int size = runningAnimators.size();
        a1 d11 = p0.d(viewGroup);
        for (int i11 = size - 1; i11 >= 0; i11--) {
            Animator k11 = runningAnimators.k(i11);
            if (k11 != null && (dVar = runningAnimators.get(k11)) != null && dVar.f6260a != null && d11.equals(dVar.f6263d)) {
                e0 e0Var = dVar.f6262c;
                View view = dVar.f6260a;
                e0 transitionValues = getTransitionValues(view, true);
                e0 matchedTransitionValues = getMatchedTransitionValues(view, true);
                if (transitionValues == null && matchedTransitionValues == null) {
                    matchedTransitionValues = this.mEndValues.f6135a.get(view);
                }
                if (!(transitionValues == null && matchedTransitionValues == null) && dVar.f6264e.isTransitionRequired(e0Var, matchedTransitionValues)) {
                    if (!k11.isRunning() && !k11.isStarted()) {
                        runningAnimators.remove(k11);
                    } else {
                        k11.cancel();
                    }
                }
            }
        }
        createAnimators(viewGroup, this.mStartValues, this.mEndValues, this.mStartValuesList, this.mEndValuesList);
        runAnimators();
    }

    public y removeListener(g gVar) {
        ArrayList<g> arrayList = this.mListeners;
        if (arrayList == null) {
            return this;
        }
        arrayList.remove(gVar);
        if (this.mListeners.size() == 0) {
            this.mListeners = null;
        }
        return this;
    }

    public y removeTarget(View view) {
        this.mTargets.remove(view);
        return this;
    }

    public void resume(View view) {
        if (this.mPaused) {
            if (!this.mEnded) {
                for (int size = this.mCurrentAnimators.size() - 1; size >= 0; size--) {
                    androidx.transition.a.c(this.mCurrentAnimators.get(size));
                }
                ArrayList<g> arrayList = this.mListeners;
                if (arrayList != null && arrayList.size() > 0) {
                    ArrayList arrayList2 = (ArrayList) this.mListeners.clone();
                    int size2 = arrayList2.size();
                    for (int i11 = 0; i11 < size2; i11++) {
                        ((g) arrayList2.get(i11)).onTransitionResume(this);
                    }
                }
            }
            this.mPaused = false;
        }
    }

    public void runAnimators() {
        start();
        androidx.collection.a<Animator, d> runningAnimators = getRunningAnimators();
        Iterator<Animator> it2 = this.mAnimators.iterator();
        while (it2.hasNext()) {
            Animator next = it2.next();
            if (runningAnimators.containsKey(next)) {
                start();
                runAnimator(next, runningAnimators);
            }
        }
        this.mAnimators.clear();
        end();
    }

    public void setCanRemoveViews(boolean z11) {
        this.mCanRemoveViews = z11;
    }

    public y setDuration(long j11) {
        this.mDuration = j11;
        return this;
    }

    public void setEpicenterCallback(f fVar) {
        this.mEpicenterCallback = fVar;
    }

    public y setInterpolator(TimeInterpolator timeInterpolator) {
        this.mInterpolator = timeInterpolator;
        return this;
    }

    public void setMatchOrder(int... iArr) {
        if (iArr != null && iArr.length != 0) {
            for (int i11 = 0; i11 < iArr.length; i11++) {
                if (isValidMatch(iArr[i11])) {
                    if (alreadyContains(iArr, i11)) {
                        throw new IllegalArgumentException("matches contains a duplicate value");
                    }
                } else {
                    throw new IllegalArgumentException("matches contains invalid value");
                }
            }
            this.mMatchOrder = (int[]) iArr.clone();
            return;
        }
        this.mMatchOrder = DEFAULT_MATCH_ORDER;
    }

    public void setPathMotion(p pVar) {
        if (pVar == null) {
            this.mPathMotion = STRAIGHT_PATH_MOTION;
        } else {
            this.mPathMotion = pVar;
        }
    }

    public void setPropagation(b0 b0Var) {
        this.mPropagation = b0Var;
    }

    public y setStartDelay(long j11) {
        this.mStartDelay = j11;
        return this;
    }

    public void start() {
        if (this.mNumInstances == 0) {
            ArrayList<g> arrayList = this.mListeners;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.mListeners.clone();
                int size = arrayList2.size();
                for (int i11 = 0; i11 < size; i11++) {
                    ((g) arrayList2.get(i11)).onTransitionStart(this);
                }
            }
            this.mEnded = false;
        }
        this.mNumInstances++;
    }

    public String toString() {
        return toString("");
    }

    public y addTarget(int i11) {
        if (i11 != 0) {
            this.mTargetIds.add(Integer.valueOf(i11));
        }
        return this;
    }

    @Override // 
    /* renamed from: clone */
    public y mo5clone() {
        try {
            y yVar = (y) super.clone();
            yVar.mAnimators = new ArrayList<>();
            yVar.mStartValues = new f0();
            yVar.mEndValues = new f0();
            yVar.mStartValuesList = null;
            yVar.mEndValuesList = null;
            return yVar;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    public y excludeChildren(int i11, boolean z11) {
        this.mTargetIdChildExcludes = excludeId(this.mTargetIdChildExcludes, i11, z11);
        return this;
    }

    public y excludeTarget(int i11, boolean z11) {
        this.mTargetIdExcludes = excludeId(this.mTargetIdExcludes, i11, z11);
        return this;
    }

    public y removeTarget(int i11) {
        if (i11 != 0) {
            this.mTargetIds.remove(Integer.valueOf(i11));
        }
        return this;
    }

    public String toString(String str) {
        String str2 = str + getClass().getSimpleName() + "@" + Integer.toHexString(hashCode()) + ": ";
        if (this.mDuration != -1) {
            str2 = str2 + "dur(" + this.mDuration + ") ";
        }
        if (this.mStartDelay != -1) {
            str2 = str2 + "dly(" + this.mStartDelay + ") ";
        }
        if (this.mInterpolator != null) {
            str2 = str2 + "interp(" + this.mInterpolator + ") ";
        }
        if (this.mTargetIds.size() > 0 || this.mTargets.size() > 0) {
            String str3 = str2 + "tgts(";
            if (this.mTargetIds.size() > 0) {
                for (int i11 = 0; i11 < this.mTargetIds.size(); i11++) {
                    if (i11 > 0) {
                        str3 = str3 + ", ";
                    }
                    str3 = str3 + this.mTargetIds.get(i11);
                }
            }
            if (this.mTargets.size() > 0) {
                for (int i12 = 0; i12 < this.mTargets.size(); i12++) {
                    if (i12 > 0) {
                        str3 = str3 + ", ";
                    }
                    str3 = str3 + this.mTargets.get(i12);
                }
            }
            return str3 + ")";
        }
        return str2;
    }

    public y addTarget(String str) {
        if (this.mTargetNames == null) {
            this.mTargetNames = new ArrayList<>();
        }
        this.mTargetNames.add(str);
        return this;
    }

    public y excludeChildren(Class<?> cls, boolean z11) {
        this.mTargetTypeChildExcludes = excludeType(this.mTargetTypeChildExcludes, cls, z11);
        return this;
    }

    public y excludeTarget(String str, boolean z11) {
        this.mTargetNameExcludes = excludeObject(this.mTargetNameExcludes, str, z11);
        return this;
    }

    public y removeTarget(String str) {
        ArrayList<String> arrayList = this.mTargetNames;
        if (arrayList != null) {
            arrayList.remove(str);
        }
        return this;
    }

    public y excludeTarget(Class<?> cls, boolean z11) {
        this.mTargetTypeExcludes = excludeType(this.mTargetTypeExcludes, cls, z11);
        return this;
    }

    public y removeTarget(Class<?> cls) {
        ArrayList<Class<?>> arrayList = this.mTargetTypes;
        if (arrayList != null) {
            arrayList.remove(cls);
        }
        return this;
    }

    public y addTarget(Class<?> cls) {
        if (this.mTargetTypes == null) {
            this.mTargetTypes = new ArrayList<>();
        }
        this.mTargetTypes.add(cls);
        return this;
    }

    public y(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, x.f6255a);
        XmlResourceParser xmlResourceParser = (XmlResourceParser) attributeSet;
        long g11 = l3.i.g(obtainStyledAttributes, xmlResourceParser, "duration", 1, -1);
        if (g11 >= 0) {
            setDuration(g11);
        }
        long g12 = l3.i.g(obtainStyledAttributes, xmlResourceParser, "startDelay", 2, -1);
        if (g12 > 0) {
            setStartDelay(g12);
        }
        int h11 = l3.i.h(obtainStyledAttributes, xmlResourceParser, "interpolator", 0, 0);
        if (h11 > 0) {
            setInterpolator(AnimationUtils.loadInterpolator(context, h11));
        }
        String i11 = l3.i.i(obtainStyledAttributes, xmlResourceParser, "matchOrder", 3);
        if (i11 != null) {
            setMatchOrder(parseMatchOrder(i11));
        }
        obtainStyledAttributes.recycle();
    }
}