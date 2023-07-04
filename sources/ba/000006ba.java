package androidx.fragment.app;

import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class c0 {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f4804a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ArrayList f4805b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ArrayList f4806c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ ArrayList f4807d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ArrayList f4808e;

        a(c0 c0Var, int i11, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
            this.f4804a = i11;
            this.f4805b = arrayList;
            this.f4806c = arrayList2;
            this.f4807d = arrayList3;
            this.f4808e = arrayList4;
        }

        @Override // java.lang.Runnable
        public void run() {
            for (int i11 = 0; i11 < this.f4804a; i11++) {
                androidx.core.view.a0.N0((View) this.f4805b.get(i11), (String) this.f4806c.get(i11));
                androidx.core.view.a0.N0((View) this.f4807d.get(i11), (String) this.f4808e.get(i11));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static void d(List<View> list, View view) {
        int size = list.size();
        if (g(list, view, size)) {
            return;
        }
        if (androidx.core.view.a0.O(view) != null) {
            list.add(view);
        }
        for (int i11 = size; i11 < list.size(); i11++) {
            View view2 = list.get(i11);
            if (view2 instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view2;
                int childCount = viewGroup.getChildCount();
                for (int i12 = 0; i12 < childCount; i12++) {
                    View childAt = viewGroup.getChildAt(i12);
                    if (!g(list, childAt, size) && androidx.core.view.a0.O(childAt) != null) {
                        list.add(childAt);
                    }
                }
            }
        }
    }

    private static boolean g(List<View> list, View view, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            if (list.get(i12) == view) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static boolean i(List list) {
        return list == null || list.isEmpty();
    }

    public abstract void a(Object obj, View view);

    public abstract void b(Object obj, ArrayList<View> arrayList);

    public abstract void c(ViewGroup viewGroup, Object obj);

    public abstract boolean e(Object obj);

    public abstract Object f(Object obj);

    /* JADX INFO: Access modifiers changed from: protected */
    public void h(View view, Rect rect) {
        if (androidx.core.view.a0.Y(view)) {
            RectF rectF = new RectF();
            rectF.set(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, view.getWidth(), view.getHeight());
            view.getMatrix().mapRect(rectF);
            rectF.offset(view.getLeft(), view.getTop());
            ViewParent parent = view.getParent();
            while (parent instanceof View) {
                View view2 = (View) parent;
                rectF.offset(-view2.getScrollX(), -view2.getScrollY());
                view2.getMatrix().mapRect(rectF);
                rectF.offset(view2.getLeft(), view2.getTop());
                parent = view2.getParent();
            }
            int[] iArr = new int[2];
            view.getRootView().getLocationOnScreen(iArr);
            rectF.offset(iArr[0], iArr[1]);
            rect.set(Math.round(rectF.left), Math.round(rectF.top), Math.round(rectF.right), Math.round(rectF.bottom));
        }
    }

    public abstract Object j(Object obj, Object obj2, Object obj3);

    public abstract Object k(Object obj, Object obj2, Object obj3);

    /* JADX INFO: Access modifiers changed from: package-private */
    public ArrayList<String> l(ArrayList<View> arrayList) {
        ArrayList<String> arrayList2 = new ArrayList<>();
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            View view = arrayList.get(i11);
            arrayList2.add(androidx.core.view.a0.O(view));
            androidx.core.view.a0.N0(view, null);
        }
        return arrayList2;
    }

    public abstract void m(Object obj, View view, ArrayList<View> arrayList);

    public abstract void n(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3);

    public abstract void o(Object obj, Rect rect);

    public abstract void p(Object obj, View view);

    public void q(Fragment fragment, Object obj, r3.c cVar, Runnable runnable) {
        runnable.run();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void r(View view, ArrayList<View> arrayList, ArrayList<View> arrayList2, ArrayList<String> arrayList3, Map<String, String> map) {
        int size = arrayList2.size();
        ArrayList arrayList4 = new ArrayList();
        for (int i11 = 0; i11 < size; i11++) {
            View view2 = arrayList.get(i11);
            String O = androidx.core.view.a0.O(view2);
            arrayList4.add(O);
            if (O != null) {
                androidx.core.view.a0.N0(view2, null);
                String str = map.get(O);
                int i12 = 0;
                while (true) {
                    if (i12 >= size) {
                        break;
                    } else if (str.equals(arrayList3.get(i12))) {
                        androidx.core.view.a0.N0(arrayList2.get(i12), O);
                        break;
                    } else {
                        i12++;
                    }
                }
            }
        }
        androidx.core.view.x.a(view, new a(this, size, arrayList2, arrayList3, arrayList, arrayList4));
    }

    public abstract void s(Object obj, View view, ArrayList<View> arrayList);

    public abstract void t(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2);

    public abstract Object u(Object obj);
}