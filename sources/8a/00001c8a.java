package com.google.android.exoplayer2.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckedTextView;
import android.widget.LinearLayout;
import fj.u;
import fj.v;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import xj.f;
import xj.i;
import yj.l;

/* loaded from: classes3.dex */
public class TrackSelectionView extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    private final int f14465a;

    /* renamed from: b  reason: collision with root package name */
    private final LayoutInflater f14466b;

    /* renamed from: c  reason: collision with root package name */
    private final CheckedTextView f14467c;

    /* renamed from: d  reason: collision with root package name */
    private final CheckedTextView f14468d;

    /* renamed from: e  reason: collision with root package name */
    private final b f14469e;

    /* renamed from: f  reason: collision with root package name */
    private final SparseArray<f.C1306f> f14470f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f14471g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f14472h;

    /* renamed from: i  reason: collision with root package name */
    private l f14473i;

    /* renamed from: j  reason: collision with root package name */
    private CheckedTextView[][] f14474j;

    /* renamed from: k  reason: collision with root package name */
    private i.a f14475k;

    /* renamed from: l  reason: collision with root package name */
    private int f14476l;

    /* renamed from: m  reason: collision with root package name */
    private v f14477m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f14478n;

    /* renamed from: o  reason: collision with root package name */
    private Comparator<c> f14479o;

    /* renamed from: p  reason: collision with root package name */
    private d f14480p;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public class b implements View.OnClickListener {
        private b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            TrackSelectionView.this.d(view);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        public final int f14482a;

        /* renamed from: b  reason: collision with root package name */
        public final int f14483b;

        /* renamed from: c  reason: collision with root package name */
        public final ci.i f14484c;

        public c(int i11, int i12, ci.i iVar) {
            this.f14482a = i11;
            this.f14483b = i12;
            this.f14484c = iVar;
        }
    }

    /* loaded from: classes3.dex */
    public interface d {
        void a(boolean z11, List<f.C1306f> list);
    }

    public TrackSelectionView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private static int[] b(int[] iArr, int i11) {
        int[] copyOf = Arrays.copyOf(iArr, iArr.length + 1);
        copyOf[copyOf.length - 1] = i11;
        return copyOf;
    }

    private static int[] c(int[] iArr, int i11) {
        int[] iArr2 = new int[iArr.length - 1];
        int i12 = 0;
        for (int i13 : iArr) {
            if (i13 != i11) {
                iArr2[i12] = i13;
                i12++;
            }
        }
        return iArr2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(View view) {
        if (view == this.f14467c) {
            f();
        } else if (view == this.f14468d) {
            e();
        } else {
            g(view);
        }
        j();
        d dVar = this.f14480p;
        if (dVar != null) {
            dVar.a(getIsDisabled(), getOverrides());
        }
    }

    private void e() {
        this.f14478n = false;
        this.f14470f.clear();
    }

    private void f() {
        this.f14478n = true;
        this.f14470f.clear();
    }

    private void g(View view) {
        this.f14478n = false;
        c cVar = (c) ak.a.e(view.getTag());
        int i11 = cVar.f14482a;
        int i12 = cVar.f14483b;
        f.C1306f c1306f = this.f14470f.get(i11);
        ak.a.e(this.f14475k);
        if (c1306f == null) {
            if (!this.f14472h && this.f14470f.size() > 0) {
                this.f14470f.clear();
            }
            this.f14470f.put(i11, new f.C1306f(i11, i12));
            return;
        }
        int i13 = c1306f.f57539c;
        int[] iArr = c1306f.f57538b;
        boolean isChecked = ((CheckedTextView) view).isChecked();
        boolean h11 = h(i11);
        boolean z11 = h11 || i();
        if (isChecked && z11) {
            if (i13 == 1) {
                this.f14470f.remove(i11);
            } else {
                this.f14470f.put(i11, new f.C1306f(i11, c(iArr, i12)));
            }
        } else if (isChecked) {
        } else {
            if (h11) {
                this.f14470f.put(i11, new f.C1306f(i11, b(iArr, i12)));
            } else {
                this.f14470f.put(i11, new f.C1306f(i11, i12));
            }
        }
    }

    private boolean h(int i11) {
        return this.f14471g && this.f14477m.a(i11).f26350a > 1 && this.f14475k.a(this.f14476l, i11, false) != 0;
    }

    private boolean i() {
        return this.f14472h && this.f14477m.f26354a > 1;
    }

    private void j() {
        this.f14467c.setChecked(this.f14478n);
        this.f14468d.setChecked(!this.f14478n && this.f14470f.size() == 0);
        for (int i11 = 0; i11 < this.f14474j.length; i11++) {
            f.C1306f c1306f = this.f14470f.get(i11);
            int i12 = 0;
            while (true) {
                CheckedTextView[][] checkedTextViewArr = this.f14474j;
                if (i12 < checkedTextViewArr[i11].length) {
                    if (c1306f != null) {
                        this.f14474j[i11][i12].setChecked(c1306f.a(((c) ak.a.e(checkedTextViewArr[i11][i12].getTag())).f14483b));
                    } else {
                        checkedTextViewArr[i11][i12].setChecked(false);
                    }
                    i12++;
                }
            }
        }
    }

    private void k() {
        for (int childCount = getChildCount() - 1; childCount >= 3; childCount--) {
            removeViewAt(childCount);
        }
        if (this.f14475k == null) {
            this.f14467c.setEnabled(false);
            this.f14468d.setEnabled(false);
            return;
        }
        this.f14467c.setEnabled(true);
        this.f14468d.setEnabled(true);
        v e11 = this.f14475k.e(this.f14476l);
        this.f14477m = e11;
        this.f14474j = new CheckedTextView[e11.f26354a];
        boolean i11 = i();
        int i12 = 0;
        while (true) {
            v vVar = this.f14477m;
            if (i12 < vVar.f26354a) {
                u a11 = vVar.a(i12);
                boolean h11 = h(i12);
                CheckedTextView[][] checkedTextViewArr = this.f14474j;
                int i13 = a11.f26350a;
                checkedTextViewArr[i12] = new CheckedTextView[i13];
                c[] cVarArr = new c[i13];
                for (int i14 = 0; i14 < a11.f26350a; i14++) {
                    cVarArr[i14] = new c(i12, i14, a11.a(i14));
                }
                Comparator<c> comparator = this.f14479o;
                if (comparator != null) {
                    Arrays.sort(cVarArr, comparator);
                }
                for (int i15 = 0; i15 < i13; i15++) {
                    if (i15 == 0) {
                        addView(this.f14466b.inflate(yj.i.exo_list_divider, (ViewGroup) this, false));
                    }
                    CheckedTextView checkedTextView = (CheckedTextView) this.f14466b.inflate((h11 || i11) ? 17367056 : 17367055, (ViewGroup) this, false);
                    checkedTextView.setBackgroundResource(this.f14465a);
                    checkedTextView.setText(this.f14473i.a(cVarArr[i15].f14484c));
                    checkedTextView.setTag(cVarArr[i15]);
                    if (this.f14475k.f(this.f14476l, i12, i15) == 4) {
                        checkedTextView.setFocusable(true);
                        checkedTextView.setOnClickListener(this.f14469e);
                    } else {
                        checkedTextView.setFocusable(false);
                        checkedTextView.setEnabled(false);
                    }
                    this.f14474j[i12][i15] = checkedTextView;
                    addView(checkedTextView);
                }
                i12++;
            } else {
                j();
                return;
            }
        }
    }

    public boolean getIsDisabled() {
        return this.f14478n;
    }

    public List<f.C1306f> getOverrides() {
        ArrayList arrayList = new ArrayList(this.f14470f.size());
        for (int i11 = 0; i11 < this.f14470f.size(); i11++) {
            arrayList.add(this.f14470f.valueAt(i11));
        }
        return arrayList;
    }

    public void setAllowAdaptiveSelections(boolean z11) {
        if (this.f14471g != z11) {
            this.f14471g = z11;
            k();
        }
    }

    public void setAllowMultipleOverrides(boolean z11) {
        if (this.f14472h != z11) {
            this.f14472h = z11;
            if (!z11 && this.f14470f.size() > 1) {
                for (int size = this.f14470f.size() - 1; size > 0; size--) {
                    this.f14470f.remove(size);
                }
            }
            k();
        }
    }

    public void setShowDisableOption(boolean z11) {
        this.f14467c.setVisibility(z11 ? 0 : 8);
    }

    public void setTrackNameProvider(l lVar) {
        this.f14473i = (l) ak.a.e(lVar);
        k();
    }

    public TrackSelectionView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        setOrientation(1);
        this.f14470f = new SparseArray<>();
        setSaveFromParentEnabled(false);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{16843534});
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        this.f14465a = resourceId;
        obtainStyledAttributes.recycle();
        LayoutInflater from = LayoutInflater.from(context);
        this.f14466b = from;
        b bVar = new b();
        this.f14469e = bVar;
        this.f14473i = new yj.c(getResources());
        this.f14477m = v.f26353d;
        CheckedTextView checkedTextView = (CheckedTextView) from.inflate(17367055, (ViewGroup) this, false);
        this.f14467c = checkedTextView;
        checkedTextView.setBackgroundResource(resourceId);
        checkedTextView.setText(yj.j.exo_track_selection_none);
        checkedTextView.setEnabled(false);
        checkedTextView.setFocusable(true);
        checkedTextView.setOnClickListener(bVar);
        checkedTextView.setVisibility(8);
        addView(checkedTextView);
        addView(from.inflate(yj.i.exo_list_divider, (ViewGroup) this, false));
        CheckedTextView checkedTextView2 = (CheckedTextView) from.inflate(17367055, (ViewGroup) this, false);
        this.f14468d = checkedTextView2;
        checkedTextView2.setBackgroundResource(resourceId);
        checkedTextView2.setText(yj.j.exo_track_selection_auto);
        checkedTextView2.setEnabled(false);
        checkedTextView2.setFocusable(true);
        checkedTextView2.setOnClickListener(bVar);
        addView(checkedTextView2);
    }
}