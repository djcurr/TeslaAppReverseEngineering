package atd.q0;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import atd.d.o;
import atd.d.p;
import com.adyen.threeds2.R;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public final class f extends atd.q0.d<o, atd.p0.d> {

    /* renamed from: m  reason: collision with root package name */
    private final Set<p> f6932m;

    /* renamed from: n  reason: collision with root package name */
    private final ListView f6933n;

    /* renamed from: o  reason: collision with root package name */
    private final Button f6934o;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a extends e {
        a(List list) {
            super(f.this, list);
        }

        @Override // atd.q0.f.e
        h a(ViewGroup viewGroup) {
            return new g(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.a3ds2_view_single_select_item, viewGroup, false));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b extends e {
        b(List list) {
            super(f.this, list);
        }

        @Override // atd.q0.f.e
        h a(ViewGroup viewGroup) {
            return new d(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.a3ds2_view_multi_select_item, viewGroup, false));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static /* synthetic */ class c {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f6937a;

        static {
            int[] iArr = new int[atd.e.b.values().length];
            f6937a = iArr;
            try {
                iArr[atd.e.b.SINGLE_SELECT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f6937a[atd.e.b.MULTI_SELECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* loaded from: classes.dex */
    final class d extends h {
        d(View view) {
            super(view);
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z11) {
            p pVar = (p) compoundButton.getTag();
            if (z11) {
                f.this.a(pVar);
            } else {
                f.this.d(pVar);
            }
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            CompoundButton compoundButton = this.f6944c;
            compoundButton.setChecked(!compoundButton.isChecked());
        }
    }

    /* loaded from: classes.dex */
    private abstract class e extends BaseAdapter {

        /* renamed from: a  reason: collision with root package name */
        private final List<p> f6939a;

        e(f fVar, List<p> list) {
            this.f6939a = list;
        }

        @Override // android.widget.Adapter
        /* renamed from: a */
        public p getItem(int i11) {
            return this.f6939a.get(i11);
        }

        abstract h a(ViewGroup viewGroup);

        @Override // android.widget.Adapter
        public int getCount() {
            return this.f6939a.size();
        }

        @Override // android.widget.Adapter
        public long getItemId(int i11) {
            return i11;
        }

        @Override // android.widget.Adapter
        public View getView(int i11, View view, ViewGroup viewGroup) {
            h a11 = a(viewGroup);
            a11.a(getItem(i11));
            return a11.f6942a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: atd.q0.f$f  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0127f extends View.BaseSavedState {
        public static final Parcelable.Creator<C0127f> CREATOR = new a();

        /* renamed from: a  reason: collision with root package name */
        private Set<p> f6940a;

        /* renamed from: atd.q0.f$f$a */
        /* loaded from: classes.dex */
        static class a implements Parcelable.Creator<C0127f> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public C0127f createFromParcel(Parcel parcel) {
                return new C0127f(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public C0127f[] newArray(int i11) {
                return new C0127f[i11];
            }
        }

        C0127f(Parcelable parcelable) {
            super(parcelable);
            this.f6940a = new LinkedHashSet();
        }

        Set<p> a() {
            return this.f6940a;
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i11) {
            super.writeToParcel(parcel, i11);
            parcel.writeParcelableArray((p[]) this.f6940a.toArray(new p[0]), i11);
        }

        void a(Set<p> set) {
            this.f6940a = set;
        }

        C0127f(Parcel parcel) {
            super(parcel);
            this.f6940a = new LinkedHashSet();
            Parcelable[] readParcelableArray = parcel.readParcelableArray(p.class.getClassLoader());
            if (readParcelableArray != null) {
                for (Parcelable parcelable : readParcelableArray) {
                    this.f6940a.add((p) parcelable);
                }
            }
        }
    }

    /* loaded from: classes.dex */
    final class g extends h {
        g(View view) {
            super(view);
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z11) {
            if (z11) {
                p pVar = (p) compoundButton.getTag();
                f.this.b();
                f.this.a(pVar);
                f.this.c();
                f.this.b(pVar);
            }
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (this.f6944c.isChecked()) {
                return;
            }
            this.f6944c.setChecked(true);
        }
    }

    /* loaded from: classes.dex */
    private abstract class h implements View.OnClickListener, CompoundButton.OnCheckedChangeListener {

        /* renamed from: a  reason: collision with root package name */
        final View f6942a;

        /* renamed from: b  reason: collision with root package name */
        final TextView f6943b;

        /* renamed from: c  reason: collision with root package name */
        final CompoundButton f6944c;

        h(View view) {
            this.f6942a = view;
            view.setOnClickListener(this);
            this.f6943b = (TextView) view.findViewById(R.id.textView_value);
            CompoundButton compoundButton = (CompoundButton) view.findViewById(R.id.checkBox_selected);
            this.f6944c = compoundButton;
            compoundButton.setOnCheckedChangeListener(this);
        }

        void a(p pVar) {
            this.f6943b.setText(pVar.b());
            this.f6944c.setTag(pVar);
            this.f6944c.setChecked(f.this.c(pVar));
        }
    }

    public f(Context context) {
        this(context, null);
    }

    private void setState(C0127f c0127f) {
        b();
        for (p pVar : c0127f.a()) {
            a(pVar);
        }
        c();
        for (p pVar2 : this.f6932m) {
            b(pVar2);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // atd.q0.d
    /* renamed from: a */
    public void b(o oVar) {
        int i11 = c.f6937a[oVar.a().ordinal()];
        if (i11 == 1) {
            c(oVar);
        } else if (i11 == 2) {
            b2(oVar);
        } else {
            throw new RuntimeException(atd.s0.a.a(-840875951057472L) + oVar.a());
        }
        this.f6934o.setText(oVar.n());
        this.f6934o.setOnClickListener(this);
    }

    boolean c(p pVar) {
        return this.f6932m.contains(pVar);
    }

    void d(p pVar) {
        this.f6932m.remove(pVar);
    }

    @Override // atd.q0.d
    protected int getChallengeLayoutId() {
        return R.layout.a3ds2_view_challenge_select;
    }

    @Override // atd.q0.d, android.view.View.OnClickListener
    public void onClick(View view) {
        super.onClick(view);
        if (getChallengeListener() == 0 || !view.equals(this.f6934o)) {
            return;
        }
        this.f6934o.setEnabled(false);
        List<String> a11 = a(this.f6932m);
        if (a11.isEmpty()) {
            ((atd.p0.d) getChallengeListener()).b();
        } else {
            ((atd.p0.d) getChallengeListener()).a(a11, getWhitelistStatus());
        }
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        setState((C0127f) parcelable);
        super.onRestoreInstanceState(parcelable);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        C0127f c0127f = new C0127f(super.onSaveInstanceState());
        c0127f.a(this.f6932m);
        return c0127f;
    }

    public f(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    void b() {
        this.f6932m.clear();
    }

    void c() {
        for (int i11 = 0; i11 < this.f6933n.getChildCount(); i11++) {
            CompoundButton compoundButton = (CompoundButton) ((ViewGroup) this.f6933n.getChildAt(i11)).findViewById(R.id.checkBox_selected);
            if (compoundButton.isChecked()) {
                compoundButton.setChecked(false);
            }
        }
    }

    public f(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f6932m = new LinkedHashSet();
        setId(R.id.selectChallengeView);
        this.f6933n = (ListView) findViewById(R.id.listView_selectInfoItems);
        this.f6934o = (Button) findViewById(R.id.button_next);
    }

    void b(p pVar) {
        for (int i11 = 0; i11 < this.f6933n.getChildCount(); i11++) {
            CompoundButton compoundButton = (CompoundButton) ((ViewGroup) this.f6933n.getChildAt(i11)).findViewById(R.id.checkBox_selected);
            if (compoundButton.getTag().equals(pVar)) {
                compoundButton.setChecked(true);
            }
        }
    }

    private void c(o oVar) {
        List<p> o11 = oVar.o();
        b();
        a(o11.get(0));
        this.f6933n.setAdapter((ListAdapter) new a(o11));
    }

    void a(p pVar) {
        this.f6932m.add(pVar);
    }

    private List<String> a(Set<p> set) {
        ArrayList arrayList = new ArrayList();
        for (p pVar : set) {
            arrayList.add(pVar.a());
        }
        return arrayList;
    }

    /* renamed from: b  reason: avoid collision after fix types in other method */
    private void b2(o oVar) {
        List<p> o11 = oVar.o();
        b();
        this.f6933n.setAdapter((ListAdapter) new b(o11));
    }
}