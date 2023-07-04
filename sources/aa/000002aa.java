package androidx.appcompat.widget;

import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
class o0 extends z3.c implements View.OnClickListener {
    private int A;
    private int B;
    private int C;

    /* renamed from: l  reason: collision with root package name */
    private final SearchView f1887l;

    /* renamed from: m  reason: collision with root package name */
    private final SearchableInfo f1888m;

    /* renamed from: n  reason: collision with root package name */
    private final Context f1889n;

    /* renamed from: o  reason: collision with root package name */
    private final WeakHashMap<String, Drawable.ConstantState> f1890o;

    /* renamed from: p  reason: collision with root package name */
    private final int f1891p;

    /* renamed from: q  reason: collision with root package name */
    private boolean f1892q;

    /* renamed from: t  reason: collision with root package name */
    private int f1893t;

    /* renamed from: w  reason: collision with root package name */
    private ColorStateList f1894w;

    /* renamed from: x  reason: collision with root package name */
    private int f1895x;

    /* renamed from: y  reason: collision with root package name */
    private int f1896y;

    /* renamed from: z  reason: collision with root package name */
    private int f1897z;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final TextView f1898a;

        /* renamed from: b  reason: collision with root package name */
        public final TextView f1899b;

        /* renamed from: c  reason: collision with root package name */
        public final ImageView f1900c;

        /* renamed from: d  reason: collision with root package name */
        public final ImageView f1901d;

        /* renamed from: e  reason: collision with root package name */
        public final ImageView f1902e;

        public a(View view) {
            this.f1898a = (TextView) view.findViewById(16908308);
            this.f1899b = (TextView) view.findViewById(16908309);
            this.f1900c = (ImageView) view.findViewById(16908295);
            this.f1901d = (ImageView) view.findViewById(16908296);
            this.f1902e = (ImageView) view.findViewById(g.f.f27131q);
        }
    }

    public o0(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap<String, Drawable.ConstantState> weakHashMap) {
        super(context, searchView.getSuggestionRowLayout(), null, true);
        this.f1892q = false;
        this.f1893t = 1;
        this.f1895x = -1;
        this.f1896y = -1;
        this.f1897z = -1;
        this.A = -1;
        this.B = -1;
        this.C = -1;
        this.f1887l = searchView;
        this.f1888m = searchableInfo;
        this.f1891p = searchView.getSuggestionCommitIconResId();
        this.f1889n = context;
        this.f1890o = weakHashMap;
    }

    private void A(String str, Drawable drawable) {
        if (drawable != null) {
            this.f1890o.put(str, drawable.getConstantState());
        }
    }

    private void B(Cursor cursor) {
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    private Drawable k(String str) {
        Drawable.ConstantState constantState = this.f1890o.get(str);
        if (constantState == null) {
            return null;
        }
        return constantState.newDrawable();
    }

    private CharSequence l(CharSequence charSequence) {
        if (this.f1894w == null) {
            TypedValue typedValue = new TypedValue();
            this.f1889n.getTheme().resolveAttribute(g.a.L, typedValue, true);
            this.f1894w = this.f1889n.getResources().getColorStateList(typedValue.resourceId);
        }
        SpannableString spannableString = new SpannableString(charSequence);
        spannableString.setSpan(new TextAppearanceSpan(null, 0, 0, this.f1894w, null), 0, charSequence.length(), 33);
        return spannableString;
    }

    private Drawable m(ComponentName componentName) {
        PackageManager packageManager = this.f1889n.getPackageManager();
        try {
            ActivityInfo activityInfo = packageManager.getActivityInfo(componentName, 128);
            int iconResource = activityInfo.getIconResource();
            if (iconResource == 0) {
                return null;
            }
            Drawable drawable = packageManager.getDrawable(componentName.getPackageName(), iconResource, activityInfo.applicationInfo);
            if (drawable == null) {
                Log.w("SuggestionsAdapter", "Invalid icon resource " + iconResource + " for " + componentName.flattenToShortString());
                return null;
            }
            return drawable;
        } catch (PackageManager.NameNotFoundException e11) {
            Log.w("SuggestionsAdapter", e11.toString());
            return null;
        }
    }

    private Drawable n(ComponentName componentName) {
        String flattenToShortString = componentName.flattenToShortString();
        if (this.f1890o.containsKey(flattenToShortString)) {
            Drawable.ConstantState constantState = this.f1890o.get(flattenToShortString);
            if (constantState == null) {
                return null;
            }
            return constantState.newDrawable(this.f1889n.getResources());
        }
        Drawable m11 = m(componentName);
        this.f1890o.put(flattenToShortString, m11 != null ? m11.getConstantState() : null);
        return m11;
    }

    public static String o(Cursor cursor, String str) {
        return w(cursor, cursor.getColumnIndex(str));
    }

    private Drawable p() {
        Drawable n11 = n(this.f1888m.getSearchActivity());
        return n11 != null ? n11 : this.f1889n.getPackageManager().getDefaultActivityIcon();
    }

    private Drawable q(Uri uri) {
        try {
            if ("android.resource".equals(uri.getScheme())) {
                try {
                    return r(uri);
                } catch (Resources.NotFoundException unused) {
                    throw new FileNotFoundException("Resource does not exist: " + uri);
                }
            }
            InputStream openInputStream = this.f1889n.getContentResolver().openInputStream(uri);
            if (openInputStream != null) {
                Drawable createFromStream = Drawable.createFromStream(openInputStream, null);
                try {
                    openInputStream.close();
                } catch (IOException e11) {
                    Log.e("SuggestionsAdapter", "Error closing icon stream for " + uri, e11);
                }
                return createFromStream;
            }
            throw new FileNotFoundException("Failed to open " + uri);
        } catch (FileNotFoundException e12) {
            Log.w("SuggestionsAdapter", "Icon not found: " + uri + ", " + e12.getMessage());
            return null;
        }
        Log.w("SuggestionsAdapter", "Icon not found: " + uri + ", " + e12.getMessage());
        return null;
    }

    private Drawable s(String str) {
        if (str == null || str.isEmpty() || "0".equals(str)) {
            return null;
        }
        try {
            int parseInt = Integer.parseInt(str);
            String str2 = "android.resource://" + this.f1889n.getPackageName() + "/" + parseInt;
            Drawable k11 = k(str2);
            if (k11 != null) {
                return k11;
            }
            Drawable drawable = androidx.core.content.b.getDrawable(this.f1889n, parseInt);
            A(str2, drawable);
            return drawable;
        } catch (Resources.NotFoundException unused) {
            Log.w("SuggestionsAdapter", "Icon resource not found: " + str);
            return null;
        } catch (NumberFormatException unused2) {
            Drawable k12 = k(str);
            if (k12 != null) {
                return k12;
            }
            Drawable q11 = q(Uri.parse(str));
            A(str, q11);
            return q11;
        }
    }

    private Drawable t(Cursor cursor) {
        int i11 = this.A;
        if (i11 == -1) {
            return null;
        }
        Drawable s11 = s(cursor.getString(i11));
        return s11 != null ? s11 : p();
    }

    private Drawable u(Cursor cursor) {
        int i11 = this.B;
        if (i11 == -1) {
            return null;
        }
        return s(cursor.getString(i11));
    }

    private static String w(Cursor cursor, int i11) {
        if (i11 == -1) {
            return null;
        }
        try {
            return cursor.getString(i11);
        } catch (Exception e11) {
            Log.e("SuggestionsAdapter", "unexpected error retrieving valid column from cursor, did the remote process die?", e11);
            return null;
        }
    }

    private void y(ImageView imageView, Drawable drawable, int i11) {
        imageView.setImageDrawable(drawable);
        if (drawable == null) {
            imageView.setVisibility(i11);
            return;
        }
        imageView.setVisibility(0);
        drawable.setVisible(false, false);
        drawable.setVisible(true, false);
    }

    private void z(TextView textView, CharSequence charSequence) {
        textView.setText(charSequence);
        if (TextUtils.isEmpty(charSequence)) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
        }
    }

    @Override // z3.a, z3.b.a
    public void a(Cursor cursor) {
        if (this.f1892q) {
            Log.w("SuggestionsAdapter", "Tried to change cursor after adapter was closed.");
            if (cursor != null) {
                cursor.close();
                return;
            }
            return;
        }
        try {
            super.a(cursor);
            if (cursor != null) {
                this.f1895x = cursor.getColumnIndex("suggest_text_1");
                this.f1896y = cursor.getColumnIndex("suggest_text_2");
                this.f1897z = cursor.getColumnIndex("suggest_text_2_url");
                this.A = cursor.getColumnIndex("suggest_icon_1");
                this.B = cursor.getColumnIndex("suggest_icon_2");
                this.C = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception e11) {
            Log.e("SuggestionsAdapter", "error changing cursor and caching columns", e11);
        }
    }

    @Override // z3.a, z3.b.a
    public CharSequence b(Cursor cursor) {
        String o11;
        String o12;
        if (cursor == null) {
            return null;
        }
        String o13 = o(cursor, "suggest_intent_query");
        if (o13 != null) {
            return o13;
        }
        if (!this.f1888m.shouldRewriteQueryFromData() || (o12 = o(cursor, "suggest_intent_data")) == null) {
            if (!this.f1888m.shouldRewriteQueryFromText() || (o11 = o(cursor, "suggest_text_1")) == null) {
                return null;
            }
            return o11;
        }
        return o12;
    }

    @Override // z3.b.a
    public Cursor c(CharSequence charSequence) {
        String charSequence2 = charSequence == null ? "" : charSequence.toString();
        if (this.f1887l.getVisibility() == 0 && this.f1887l.getWindowVisibility() == 0) {
            try {
                Cursor v11 = v(this.f1888m, charSequence2, 50);
                if (v11 != null) {
                    v11.getCount();
                    return v11;
                }
            } catch (RuntimeException e11) {
                Log.w("SuggestionsAdapter", "Search suggestions query threw an exception.", e11);
            }
        }
        return null;
    }

    @Override // z3.a
    public void e(View view, Context context, Cursor cursor) {
        CharSequence w11;
        a aVar = (a) view.getTag();
        int i11 = this.C;
        int i12 = i11 != -1 ? cursor.getInt(i11) : 0;
        if (aVar.f1898a != null) {
            z(aVar.f1898a, w(cursor, this.f1895x));
        }
        if (aVar.f1899b != null) {
            String w12 = w(cursor, this.f1897z);
            if (w12 != null) {
                w11 = l(w12);
            } else {
                w11 = w(cursor, this.f1896y);
            }
            if (TextUtils.isEmpty(w11)) {
                TextView textView = aVar.f1898a;
                if (textView != null) {
                    textView.setSingleLine(false);
                    aVar.f1898a.setMaxLines(2);
                }
            } else {
                TextView textView2 = aVar.f1898a;
                if (textView2 != null) {
                    textView2.setSingleLine(true);
                    aVar.f1898a.setMaxLines(1);
                }
            }
            z(aVar.f1899b, w11);
        }
        ImageView imageView = aVar.f1900c;
        if (imageView != null) {
            y(imageView, t(cursor), 4);
        }
        ImageView imageView2 = aVar.f1901d;
        if (imageView2 != null) {
            y(imageView2, u(cursor), 8);
        }
        int i13 = this.f1893t;
        if (i13 != 2 && (i13 != 1 || (i12 & 1) == 0)) {
            aVar.f1902e.setVisibility(8);
            return;
        }
        aVar.f1902e.setVisibility(0);
        aVar.f1902e.setTag(aVar.f1898a.getText());
        aVar.f1902e.setOnClickListener(this);
    }

    @Override // z3.a, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i11, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i11, view, viewGroup);
        } catch (RuntimeException e11) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e11);
            View g11 = g(this.f1889n, d(), viewGroup);
            if (g11 != null) {
                ((a) g11.getTag()).f1898a.setText(e11.toString());
            }
            return g11;
        }
    }

    @Override // z3.a, android.widget.Adapter
    public View getView(int i11, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i11, view, viewGroup);
        } catch (RuntimeException e11) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e11);
            View h11 = h(this.f1889n, d(), viewGroup);
            if (h11 != null) {
                ((a) h11.getTag()).f1898a.setText(e11.toString());
            }
            return h11;
        }
    }

    @Override // z3.c, z3.a
    public View h(Context context, Cursor cursor, ViewGroup viewGroup) {
        View h11 = super.h(context, cursor, viewGroup);
        h11.setTag(new a(h11));
        ((ImageView) h11.findViewById(g.f.f27131q)).setImageResource(this.f1891p);
        return h11;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return false;
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        B(d());
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        B(d());
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.f1887l.U((CharSequence) tag);
        }
    }

    Drawable r(Uri uri) {
        int parseInt;
        String authority = uri.getAuthority();
        if (!TextUtils.isEmpty(authority)) {
            try {
                Resources resourcesForApplication = this.f1889n.getPackageManager().getResourcesForApplication(authority);
                List<String> pathSegments = uri.getPathSegments();
                if (pathSegments != null) {
                    int size = pathSegments.size();
                    if (size == 1) {
                        try {
                            parseInt = Integer.parseInt(pathSegments.get(0));
                        } catch (NumberFormatException unused) {
                            throw new FileNotFoundException("Single path segment is not a resource ID: " + uri);
                        }
                    } else if (size == 2) {
                        parseInt = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
                    } else {
                        throw new FileNotFoundException("More than two path segments: " + uri);
                    }
                    if (parseInt != 0) {
                        return resourcesForApplication.getDrawable(parseInt);
                    }
                    throw new FileNotFoundException("No resource found for: " + uri);
                }
                throw new FileNotFoundException("No path: " + uri);
            } catch (PackageManager.NameNotFoundException unused2) {
                throw new FileNotFoundException("No package found for authority: " + uri);
            }
        }
        throw new FileNotFoundException("No authority: " + uri);
    }

    Cursor v(SearchableInfo searchableInfo, String str, int i11) {
        String suggestAuthority;
        String[] strArr = null;
        if (searchableInfo == null || (suggestAuthority = searchableInfo.getSuggestAuthority()) == null) {
            return null;
        }
        Uri.Builder fragment = new Uri.Builder().scheme("content").authority(suggestAuthority).query("").fragment("");
        String suggestPath = searchableInfo.getSuggestPath();
        if (suggestPath != null) {
            fragment.appendEncodedPath(suggestPath);
        }
        fragment.appendPath("search_suggest_query");
        String suggestSelection = searchableInfo.getSuggestSelection();
        if (suggestSelection != null) {
            strArr = new String[]{str};
        } else {
            fragment.appendPath(str);
        }
        String[] strArr2 = strArr;
        if (i11 > 0) {
            fragment.appendQueryParameter("limit", String.valueOf(i11));
        }
        return this.f1889n.getContentResolver().query(fragment.build(), null, suggestSelection, strArr2, null);
    }

    public void x(int i11) {
        this.f1893t = i11;
    }
}