package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckedTextView;
import android.widget.CursorAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;
import android.widget.TextView;
import androidx.appcompat.widget.g0;
import androidx.core.view.a0;
import androidx.core.widget.NestedScrollView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public class AlertController {
    NestedScrollView A;
    private Drawable C;
    private ImageView D;
    private TextView E;
    private TextView F;
    private View G;
    ListAdapter H;
    private int J;
    private int K;
    int L;
    int M;
    int N;
    int O;
    private boolean P;
    Handler R;

    /* renamed from: a */
    private final Context f1063a;

    /* renamed from: b */
    final androidx.appcompat.app.h f1064b;

    /* renamed from: c */
    private final Window f1065c;

    /* renamed from: d */
    private final int f1066d;

    /* renamed from: e */
    private CharSequence f1067e;

    /* renamed from: f */
    private CharSequence f1068f;

    /* renamed from: g */
    ListView f1069g;

    /* renamed from: h */
    private View f1070h;

    /* renamed from: i */
    private int f1071i;

    /* renamed from: j */
    private int f1072j;

    /* renamed from: k */
    private int f1073k;

    /* renamed from: l */
    private int f1074l;

    /* renamed from: m */
    private int f1075m;

    /* renamed from: o */
    Button f1077o;

    /* renamed from: p */
    private CharSequence f1078p;

    /* renamed from: q */
    Message f1079q;

    /* renamed from: r */
    private Drawable f1080r;

    /* renamed from: s */
    Button f1081s;

    /* renamed from: t */
    private CharSequence f1082t;

    /* renamed from: u */
    Message f1083u;

    /* renamed from: v */
    private Drawable f1084v;

    /* renamed from: w */
    Button f1085w;

    /* renamed from: x */
    private CharSequence f1086x;

    /* renamed from: y */
    Message f1087y;

    /* renamed from: z */
    private Drawable f1088z;

    /* renamed from: n */
    private boolean f1076n = false;
    private int B = 0;
    int I = -1;
    private int Q = 0;
    private final View.OnClickListener S = new a();

    /* loaded from: classes.dex */
    public static class RecycleListView extends ListView {

        /* renamed from: a */
        private final int f1089a;

        /* renamed from: b */
        private final int f1090b;

        public RecycleListView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g.j.Q1);
            this.f1090b = obtainStyledAttributes.getDimensionPixelOffset(g.j.R1, -1);
            this.f1089a = obtainStyledAttributes.getDimensionPixelOffset(g.j.S1, -1);
        }

        public void a(boolean z11, boolean z12) {
            if (z12 && z11) {
                return;
            }
            setPadding(getPaddingLeft(), z11 ? getPaddingTop() : this.f1089a, getPaddingRight(), z12 ? getPaddingBottom() : this.f1090b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements View.OnClickListener {
        a() {
            AlertController.this = r1;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Message obtain;
            Message message;
            Message message2;
            Message message3;
            AlertController alertController = AlertController.this;
            if (view == alertController.f1077o && (message3 = alertController.f1079q) != null) {
                obtain = Message.obtain(message3);
            } else if (view == alertController.f1081s && (message2 = alertController.f1083u) != null) {
                obtain = Message.obtain(message2);
            } else {
                obtain = (view != alertController.f1085w || (message = alertController.f1087y) == null) ? null : Message.obtain(message);
            }
            if (obtain != null) {
                obtain.sendToTarget();
            }
            AlertController alertController2 = AlertController.this;
            alertController2.R.obtainMessage(1, alertController2.f1064b).sendToTarget();
        }
    }

    /* loaded from: classes.dex */
    public class b implements NestedScrollView.b {

        /* renamed from: a */
        final /* synthetic */ View f1092a;

        /* renamed from: b */
        final /* synthetic */ View f1093b;

        b(AlertController alertController, View view, View view2) {
            this.f1092a = view;
            this.f1093b = view2;
        }

        @Override // androidx.core.widget.NestedScrollView.b
        public void a(NestedScrollView nestedScrollView, int i11, int i12, int i13, int i14) {
            AlertController.f(nestedScrollView, this.f1092a, this.f1093b);
        }
    }

    /* loaded from: classes.dex */
    public class c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ View f1094a;

        /* renamed from: b */
        final /* synthetic */ View f1095b;

        c(View view, View view2) {
            AlertController.this = r1;
            this.f1094a = view;
            this.f1095b = view2;
        }

        @Override // java.lang.Runnable
        public void run() {
            AlertController.f(AlertController.this.A, this.f1094a, this.f1095b);
        }
    }

    /* loaded from: classes.dex */
    public class d implements AbsListView.OnScrollListener {

        /* renamed from: a */
        final /* synthetic */ View f1097a;

        /* renamed from: b */
        final /* synthetic */ View f1098b;

        d(AlertController alertController, View view, View view2) {
            this.f1097a = view;
            this.f1098b = view2;
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(AbsListView absListView, int i11, int i12, int i13) {
            AlertController.f(absListView, this.f1097a, this.f1098b);
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView absListView, int i11) {
        }
    }

    /* loaded from: classes.dex */
    public class e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ View f1099a;

        /* renamed from: b */
        final /* synthetic */ View f1100b;

        e(View view, View view2) {
            AlertController.this = r1;
            this.f1099a = view;
            this.f1100b = view2;
        }

        @Override // java.lang.Runnable
        public void run() {
            AlertController.f(AlertController.this.f1069g, this.f1099a, this.f1100b);
        }
    }

    /* loaded from: classes.dex */
    public static class f {
        public int A;
        public int B;
        public int C;
        public int D;
        public boolean[] F;
        public boolean G;
        public boolean H;
        public DialogInterface.OnMultiChoiceClickListener J;
        public Cursor K;
        public String L;
        public String M;
        public AdapterView.OnItemSelectedListener N;
        public e O;

        /* renamed from: a */
        public final Context f1102a;

        /* renamed from: b */
        public final LayoutInflater f1103b;

        /* renamed from: d */
        public Drawable f1105d;

        /* renamed from: f */
        public CharSequence f1107f;

        /* renamed from: g */
        public View f1108g;

        /* renamed from: h */
        public CharSequence f1109h;

        /* renamed from: i */
        public CharSequence f1110i;

        /* renamed from: j */
        public Drawable f1111j;

        /* renamed from: k */
        public DialogInterface.OnClickListener f1112k;

        /* renamed from: l */
        public CharSequence f1113l;

        /* renamed from: m */
        public Drawable f1114m;

        /* renamed from: n */
        public DialogInterface.OnClickListener f1115n;

        /* renamed from: o */
        public CharSequence f1116o;

        /* renamed from: p */
        public Drawable f1117p;

        /* renamed from: q */
        public DialogInterface.OnClickListener f1118q;

        /* renamed from: s */
        public DialogInterface.OnCancelListener f1120s;

        /* renamed from: t */
        public DialogInterface.OnDismissListener f1121t;

        /* renamed from: u */
        public DialogInterface.OnKeyListener f1122u;

        /* renamed from: v */
        public CharSequence[] f1123v;

        /* renamed from: w */
        public ListAdapter f1124w;

        /* renamed from: x */
        public DialogInterface.OnClickListener f1125x;

        /* renamed from: y */
        public int f1126y;

        /* renamed from: z */
        public View f1127z;

        /* renamed from: c */
        public int f1104c = 0;

        /* renamed from: e */
        public int f1106e = 0;
        public boolean E = false;
        public int I = -1;

        /* renamed from: r */
        public boolean f1119r = true;

        /* loaded from: classes.dex */
        public class a extends ArrayAdapter<CharSequence> {

            /* renamed from: a */
            final /* synthetic */ RecycleListView f1128a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Context context, int i11, int i12, CharSequence[] charSequenceArr, RecycleListView recycleListView) {
                super(context, i11, i12, charSequenceArr);
                f.this = r1;
                this.f1128a = recycleListView;
            }

            @Override // android.widget.ArrayAdapter, android.widget.Adapter
            public View getView(int i11, View view, ViewGroup viewGroup) {
                View view2 = super.getView(i11, view, viewGroup);
                boolean[] zArr = f.this.F;
                if (zArr != null && zArr[i11]) {
                    this.f1128a.setItemChecked(i11, true);
                }
                return view2;
            }
        }

        /* loaded from: classes.dex */
        public class b extends CursorAdapter {

            /* renamed from: a */
            private final int f1130a;

            /* renamed from: b */
            private final int f1131b;

            /* renamed from: c */
            final /* synthetic */ RecycleListView f1132c;

            /* renamed from: d */
            final /* synthetic */ AlertController f1133d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(Context context, Cursor cursor, boolean z11, RecycleListView recycleListView, AlertController alertController) {
                super(context, cursor, z11);
                f.this = r1;
                this.f1132c = recycleListView;
                this.f1133d = alertController;
                Cursor cursor2 = getCursor();
                this.f1130a = cursor2.getColumnIndexOrThrow(r1.L);
                this.f1131b = cursor2.getColumnIndexOrThrow(r1.M);
            }

            @Override // android.widget.CursorAdapter
            public void bindView(View view, Context context, Cursor cursor) {
                ((CheckedTextView) view.findViewById(16908308)).setText(cursor.getString(this.f1130a));
                this.f1132c.setItemChecked(cursor.getPosition(), cursor.getInt(this.f1131b) == 1);
            }

            @Override // android.widget.CursorAdapter
            public View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
                return f.this.f1103b.inflate(this.f1133d.M, viewGroup, false);
            }
        }

        /* loaded from: classes.dex */
        public class c implements AdapterView.OnItemClickListener {

            /* renamed from: a */
            final /* synthetic */ AlertController f1135a;

            c(AlertController alertController) {
                f.this = r1;
                this.f1135a = alertController;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i11, long j11) {
                f.this.f1125x.onClick(this.f1135a.f1064b, i11);
                if (f.this.H) {
                    return;
                }
                this.f1135a.f1064b.dismiss();
            }
        }

        /* loaded from: classes.dex */
        public class d implements AdapterView.OnItemClickListener {

            /* renamed from: a */
            final /* synthetic */ RecycleListView f1137a;

            /* renamed from: b */
            final /* synthetic */ AlertController f1138b;

            d(RecycleListView recycleListView, AlertController alertController) {
                f.this = r1;
                this.f1137a = recycleListView;
                this.f1138b = alertController;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i11, long j11) {
                boolean[] zArr = f.this.F;
                if (zArr != null) {
                    zArr[i11] = this.f1137a.isItemChecked(i11);
                }
                f.this.J.onClick(this.f1138b.f1064b, i11, this.f1137a.isItemChecked(i11));
            }
        }

        /* loaded from: classes.dex */
        public interface e {
            void a(ListView listView);
        }

        public f(Context context) {
            this.f1102a = context;
            this.f1103b = (LayoutInflater) context.getSystemService("layout_inflater");
        }

        private void b(AlertController alertController) {
            int i11;
            ListAdapter listAdapter;
            RecycleListView recycleListView = (RecycleListView) this.f1103b.inflate(alertController.L, (ViewGroup) null);
            if (this.G) {
                if (this.K == null) {
                    listAdapter = new a(this.f1102a, alertController.M, 16908308, this.f1123v, recycleListView);
                } else {
                    listAdapter = new b(this.f1102a, this.K, false, recycleListView, alertController);
                }
            } else {
                if (this.H) {
                    i11 = alertController.N;
                } else {
                    i11 = alertController.O;
                }
                int i12 = i11;
                if (this.K != null) {
                    listAdapter = new SimpleCursorAdapter(this.f1102a, i12, this.K, new String[]{this.L}, new int[]{16908308});
                } else {
                    listAdapter = this.f1124w;
                    if (listAdapter == null) {
                        listAdapter = new h(this.f1102a, i12, 16908308, this.f1123v);
                    }
                }
            }
            e eVar = this.O;
            if (eVar != null) {
                eVar.a(recycleListView);
            }
            alertController.H = listAdapter;
            alertController.I = this.I;
            if (this.f1125x != null) {
                recycleListView.setOnItemClickListener(new c(alertController));
            } else if (this.J != null) {
                recycleListView.setOnItemClickListener(new d(recycleListView, alertController));
            }
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.N;
            if (onItemSelectedListener != null) {
                recycleListView.setOnItemSelectedListener(onItemSelectedListener);
            }
            if (this.H) {
                recycleListView.setChoiceMode(1);
            } else if (this.G) {
                recycleListView.setChoiceMode(2);
            }
            alertController.f1069g = recycleListView;
        }

        public void a(AlertController alertController) {
            View view = this.f1108g;
            if (view != null) {
                alertController.l(view);
            } else {
                CharSequence charSequence = this.f1107f;
                if (charSequence != null) {
                    alertController.q(charSequence);
                }
                Drawable drawable = this.f1105d;
                if (drawable != null) {
                    alertController.n(drawable);
                }
                int i11 = this.f1104c;
                if (i11 != 0) {
                    alertController.m(i11);
                }
                int i12 = this.f1106e;
                if (i12 != 0) {
                    alertController.m(alertController.c(i12));
                }
            }
            CharSequence charSequence2 = this.f1109h;
            if (charSequence2 != null) {
                alertController.o(charSequence2);
            }
            CharSequence charSequence3 = this.f1110i;
            if (charSequence3 != null || this.f1111j != null) {
                alertController.k(-1, charSequence3, this.f1112k, null, this.f1111j);
            }
            CharSequence charSequence4 = this.f1113l;
            if (charSequence4 != null || this.f1114m != null) {
                alertController.k(-2, charSequence4, this.f1115n, null, this.f1114m);
            }
            CharSequence charSequence5 = this.f1116o;
            if (charSequence5 != null || this.f1117p != null) {
                alertController.k(-3, charSequence5, this.f1118q, null, this.f1117p);
            }
            if (this.f1123v != null || this.K != null || this.f1124w != null) {
                b(alertController);
            }
            View view2 = this.f1127z;
            if (view2 != null) {
                if (this.E) {
                    alertController.t(view2, this.A, this.B, this.C, this.D);
                    return;
                } else {
                    alertController.s(view2);
                    return;
                }
            }
            int i13 = this.f1126y;
            if (i13 != 0) {
                alertController.r(i13);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class g extends Handler {

        /* renamed from: a */
        private WeakReference<DialogInterface> f1140a;

        public g(DialogInterface dialogInterface) {
            this.f1140a = new WeakReference<>(dialogInterface);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i11 = message.what;
            if (i11 == -3 || i11 == -2 || i11 == -1) {
                ((DialogInterface.OnClickListener) message.obj).onClick(this.f1140a.get(), message.what);
            } else if (i11 != 1) {
            } else {
                ((DialogInterface) message.obj).dismiss();
            }
        }
    }

    /* loaded from: classes.dex */
    public static class h extends ArrayAdapter<CharSequence> {
        public h(Context context, int i11, int i12, CharSequence[] charSequenceArr) {
            super(context, i11, i12, charSequenceArr);
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public long getItemId(int i11) {
            return i11;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public boolean hasStableIds() {
            return true;
        }
    }

    public AlertController(Context context, androidx.appcompat.app.h hVar, Window window) {
        this.f1063a = context;
        this.f1064b = hVar;
        this.f1065c = window;
        this.R = new g(hVar);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, g.j.D, g.a.f27052n, 0);
        this.J = obtainStyledAttributes.getResourceId(g.j.E, 0);
        this.K = obtainStyledAttributes.getResourceId(g.j.G, 0);
        this.L = obtainStyledAttributes.getResourceId(g.j.I, 0);
        this.M = obtainStyledAttributes.getResourceId(g.j.J, 0);
        this.N = obtainStyledAttributes.getResourceId(g.j.L, 0);
        this.O = obtainStyledAttributes.getResourceId(g.j.H, 0);
        this.P = obtainStyledAttributes.getBoolean(g.j.K, true);
        this.f1066d = obtainStyledAttributes.getDimensionPixelSize(g.j.F, 0);
        obtainStyledAttributes.recycle();
        hVar.d(1);
    }

    static boolean a(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            while (childCount > 0) {
                childCount--;
                if (a(viewGroup.getChildAt(childCount))) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    private void b(Button button) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button.getLayoutParams();
        layoutParams.gravity = 1;
        layoutParams.weight = 0.5f;
        button.setLayoutParams(layoutParams);
    }

    static void f(View view, View view2, View view3) {
        if (view2 != null) {
            view2.setVisibility(view.canScrollVertically(-1) ? 0 : 4);
        }
        if (view3 != null) {
            view3.setVisibility(view.canScrollVertically(1) ? 0 : 4);
        }
    }

    private ViewGroup i(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }

    private int j() {
        int i11 = this.K;
        if (i11 == 0) {
            return this.J;
        }
        return this.Q == 1 ? i11 : this.J;
    }

    private void p(ViewGroup viewGroup, View view, int i11, int i12) {
        View findViewById = this.f1065c.findViewById(g.f.f27136v);
        View findViewById2 = this.f1065c.findViewById(g.f.f27135u);
        if (Build.VERSION.SDK_INT >= 23) {
            a0.L0(view, i11, i12);
            if (findViewById != null) {
                viewGroup.removeView(findViewById);
            }
            if (findViewById2 != null) {
                viewGroup.removeView(findViewById2);
                return;
            }
            return;
        }
        if (findViewById != null && (i11 & 1) == 0) {
            viewGroup.removeView(findViewById);
            findViewById = null;
        }
        if (findViewById2 != null && (i11 & 2) == 0) {
            viewGroup.removeView(findViewById2);
            findViewById2 = null;
        }
        if (findViewById == null && findViewById2 == null) {
            return;
        }
        if (this.f1068f != null) {
            this.A.setOnScrollChangeListener(new b(this, findViewById, findViewById2));
            this.A.post(new c(findViewById, findViewById2));
            return;
        }
        ListView listView = this.f1069g;
        if (listView != null) {
            listView.setOnScrollListener(new d(this, findViewById, findViewById2));
            this.f1069g.post(new e(findViewById, findViewById2));
            return;
        }
        if (findViewById != null) {
            viewGroup.removeView(findViewById);
        }
        if (findViewById2 != null) {
            viewGroup.removeView(findViewById2);
        }
    }

    private void u(ViewGroup viewGroup) {
        boolean z11;
        Button button = (Button) viewGroup.findViewById(16908313);
        this.f1077o = button;
        button.setOnClickListener(this.S);
        if (TextUtils.isEmpty(this.f1078p) && this.f1080r == null) {
            this.f1077o.setVisibility(8);
            z11 = false;
        } else {
            this.f1077o.setText(this.f1078p);
            Drawable drawable = this.f1080r;
            if (drawable != null) {
                int i11 = this.f1066d;
                drawable.setBounds(0, 0, i11, i11);
                this.f1077o.setCompoundDrawables(this.f1080r, null, null, null);
            }
            this.f1077o.setVisibility(0);
            z11 = true;
        }
        Button button2 = (Button) viewGroup.findViewById(16908314);
        this.f1081s = button2;
        button2.setOnClickListener(this.S);
        if (TextUtils.isEmpty(this.f1082t) && this.f1084v == null) {
            this.f1081s.setVisibility(8);
        } else {
            this.f1081s.setText(this.f1082t);
            Drawable drawable2 = this.f1084v;
            if (drawable2 != null) {
                int i12 = this.f1066d;
                drawable2.setBounds(0, 0, i12, i12);
                this.f1081s.setCompoundDrawables(this.f1084v, null, null, null);
            }
            this.f1081s.setVisibility(0);
            z11 |= true;
        }
        Button button3 = (Button) viewGroup.findViewById(16908315);
        this.f1085w = button3;
        button3.setOnClickListener(this.S);
        if (TextUtils.isEmpty(this.f1086x) && this.f1088z == null) {
            this.f1085w.setVisibility(8);
        } else {
            this.f1085w.setText(this.f1086x);
            Drawable drawable3 = this.f1088z;
            if (drawable3 != null) {
                int i13 = this.f1066d;
                drawable3.setBounds(0, 0, i13, i13);
                this.f1085w.setCompoundDrawables(this.f1088z, null, null, null);
            }
            this.f1085w.setVisibility(0);
            z11 |= true;
        }
        if (z(this.f1063a)) {
            if (z11) {
                b(this.f1077o);
            } else if (z11) {
                b(this.f1081s);
            } else if (z11) {
                b(this.f1085w);
            }
        }
        if (z11) {
            return;
        }
        viewGroup.setVisibility(8);
    }

    private void v(ViewGroup viewGroup) {
        NestedScrollView nestedScrollView = (NestedScrollView) this.f1065c.findViewById(g.f.f27137w);
        this.A = nestedScrollView;
        nestedScrollView.setFocusable(false);
        this.A.setNestedScrollingEnabled(false);
        TextView textView = (TextView) viewGroup.findViewById(16908299);
        this.F = textView;
        if (textView == null) {
            return;
        }
        CharSequence charSequence = this.f1068f;
        if (charSequence != null) {
            textView.setText(charSequence);
            return;
        }
        textView.setVisibility(8);
        this.A.removeView(this.F);
        if (this.f1069g != null) {
            ViewGroup viewGroup2 = (ViewGroup) this.A.getParent();
            int indexOfChild = viewGroup2.indexOfChild(this.A);
            viewGroup2.removeViewAt(indexOfChild);
            viewGroup2.addView(this.f1069g, indexOfChild, new ViewGroup.LayoutParams(-1, -1));
            return;
        }
        viewGroup.setVisibility(8);
    }

    private void w(ViewGroup viewGroup) {
        View view = this.f1070h;
        if (view == null) {
            view = this.f1071i != 0 ? LayoutInflater.from(this.f1063a).inflate(this.f1071i, viewGroup, false) : null;
        }
        boolean z11 = view != null;
        if (!z11 || !a(view)) {
            this.f1065c.setFlags(131072, 131072);
        }
        if (z11) {
            FrameLayout frameLayout = (FrameLayout) this.f1065c.findViewById(g.f.f27128n);
            frameLayout.addView(view, new ViewGroup.LayoutParams(-1, -1));
            if (this.f1076n) {
                frameLayout.setPadding(this.f1072j, this.f1073k, this.f1074l, this.f1075m);
            }
            if (this.f1069g != null) {
                ((LinearLayout.LayoutParams) ((g0.a) viewGroup.getLayoutParams())).weight = BitmapDescriptorFactory.HUE_RED;
                return;
            }
            return;
        }
        viewGroup.setVisibility(8);
    }

    private void x(ViewGroup viewGroup) {
        if (this.G != null) {
            viewGroup.addView(this.G, 0, new ViewGroup.LayoutParams(-1, -2));
            this.f1065c.findViewById(g.f.O).setVisibility(8);
            return;
        }
        this.D = (ImageView) this.f1065c.findViewById(16908294);
        if ((!TextUtils.isEmpty(this.f1067e)) && this.P) {
            TextView textView = (TextView) this.f1065c.findViewById(g.f.f27124j);
            this.E = textView;
            textView.setText(this.f1067e);
            int i11 = this.B;
            if (i11 != 0) {
                this.D.setImageResource(i11);
                return;
            }
            Drawable drawable = this.C;
            if (drawable != null) {
                this.D.setImageDrawable(drawable);
                return;
            }
            this.E.setPadding(this.D.getPaddingLeft(), this.D.getPaddingTop(), this.D.getPaddingRight(), this.D.getPaddingBottom());
            this.D.setVisibility(8);
            return;
        }
        this.f1065c.findViewById(g.f.O).setVisibility(8);
        this.D.setVisibility(8);
        viewGroup.setVisibility(8);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void y() {
        View findViewById;
        ListAdapter listAdapter;
        View findViewById2;
        View findViewById3 = this.f1065c.findViewById(g.f.f27134t);
        int i11 = g.f.P;
        View findViewById4 = findViewById3.findViewById(i11);
        int i12 = g.f.f27127m;
        View findViewById5 = findViewById3.findViewById(i12);
        int i13 = g.f.f27125k;
        View findViewById6 = findViewById3.findViewById(i13);
        ViewGroup viewGroup = (ViewGroup) findViewById3.findViewById(g.f.f27129o);
        w(viewGroup);
        View findViewById7 = viewGroup.findViewById(i11);
        View findViewById8 = viewGroup.findViewById(i12);
        View findViewById9 = viewGroup.findViewById(i13);
        ViewGroup i14 = i(findViewById7, findViewById4);
        ViewGroup i15 = i(findViewById8, findViewById5);
        ViewGroup i16 = i(findViewById9, findViewById6);
        v(i15);
        u(i16);
        x(i14);
        boolean z11 = viewGroup.getVisibility() != 8;
        boolean z12 = (i14 == null || i14.getVisibility() == 8) ? false : 1;
        boolean z13 = (i16 == null || i16.getVisibility() == 8) ? false : true;
        if (!z13 && i15 != null && (findViewById2 = i15.findViewById(g.f.K)) != null) {
            findViewById2.setVisibility(0);
        }
        if (z12) {
            NestedScrollView nestedScrollView = this.A;
            if (nestedScrollView != null) {
                nestedScrollView.setClipToPadding(true);
            }
            View view = null;
            if (this.f1068f != null || this.f1069g != null) {
                view = i14.findViewById(g.f.N);
            }
            if (view != null) {
                view.setVisibility(0);
            }
        } else if (i15 != null && (findViewById = i15.findViewById(g.f.L)) != null) {
            findViewById.setVisibility(0);
        }
        ListView listView = this.f1069g;
        if (listView instanceof RecycleListView) {
            ((RecycleListView) listView).a(z12, z13);
        }
        if (!z11) {
            View view2 = this.f1069g;
            if (view2 == null) {
                view2 = this.A;
            }
            if (view2 != null) {
                p(i15, view2, z12 | (z13 ? 2 : 0), 3);
            }
        }
        ListView listView2 = this.f1069g;
        if (listView2 == null || (listAdapter = this.H) == null) {
            return;
        }
        listView2.setAdapter(listAdapter);
        int i17 = this.I;
        if (i17 > -1) {
            listView2.setItemChecked(i17, true);
            listView2.setSelection(i17);
        }
    }

    private static boolean z(Context context) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(g.a.f27051m, typedValue, true);
        return typedValue.data != 0;
    }

    public int c(int i11) {
        TypedValue typedValue = new TypedValue();
        this.f1063a.getTheme().resolveAttribute(i11, typedValue, true);
        return typedValue.resourceId;
    }

    public ListView d() {
        return this.f1069g;
    }

    public void e() {
        this.f1064b.setContentView(j());
        y();
    }

    public boolean g(int i11, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.A;
        return nestedScrollView != null && nestedScrollView.q(keyEvent);
    }

    public boolean h(int i11, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.A;
        return nestedScrollView != null && nestedScrollView.q(keyEvent);
    }

    public void k(int i11, CharSequence charSequence, DialogInterface.OnClickListener onClickListener, Message message, Drawable drawable) {
        if (message == null && onClickListener != null) {
            message = this.R.obtainMessage(i11, onClickListener);
        }
        if (i11 == -3) {
            this.f1086x = charSequence;
            this.f1087y = message;
            this.f1088z = drawable;
        } else if (i11 == -2) {
            this.f1082t = charSequence;
            this.f1083u = message;
            this.f1084v = drawable;
        } else if (i11 == -1) {
            this.f1078p = charSequence;
            this.f1079q = message;
            this.f1080r = drawable;
        } else {
            throw new IllegalArgumentException("Button does not exist");
        }
    }

    public void l(View view) {
        this.G = view;
    }

    public void m(int i11) {
        this.C = null;
        this.B = i11;
        ImageView imageView = this.D;
        if (imageView != null) {
            if (i11 != 0) {
                imageView.setVisibility(0);
                this.D.setImageResource(this.B);
                return;
            }
            imageView.setVisibility(8);
        }
    }

    public void n(Drawable drawable) {
        this.C = drawable;
        this.B = 0;
        ImageView imageView = this.D;
        if (imageView != null) {
            if (drawable != null) {
                imageView.setVisibility(0);
                this.D.setImageDrawable(drawable);
                return;
            }
            imageView.setVisibility(8);
        }
    }

    public void o(CharSequence charSequence) {
        this.f1068f = charSequence;
        TextView textView = this.F;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public void q(CharSequence charSequence) {
        this.f1067e = charSequence;
        TextView textView = this.E;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public void r(int i11) {
        this.f1070h = null;
        this.f1071i = i11;
        this.f1076n = false;
    }

    public void s(View view) {
        this.f1070h = view;
        this.f1071i = 0;
        this.f1076n = false;
    }

    public void t(View view, int i11, int i12, int i13, int i14) {
        this.f1070h = view;
        this.f1071i = 0;
        this.f1076n = true;
        this.f1072j = i11;
        this.f1073k = i12;
        this.f1074l = i13;
        this.f1075m = i14;
    }
}