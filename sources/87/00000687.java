package androidx.core.widget;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.icu.text.DecimalFormatSymbols;
import android.os.Build;
import android.text.Editable;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.PasswordTransformationMethod;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import t3.d;

/* loaded from: classes.dex */
public final class m {

    /* loaded from: classes.dex */
    private static class a implements ActionMode.Callback {

        /* renamed from: a  reason: collision with root package name */
        private final ActionMode.Callback f4653a;

        /* renamed from: b  reason: collision with root package name */
        private final TextView f4654b;

        /* renamed from: c  reason: collision with root package name */
        private Class<?> f4655c;

        /* renamed from: d  reason: collision with root package name */
        private Method f4656d;

        /* renamed from: e  reason: collision with root package name */
        private boolean f4657e;

        /* renamed from: f  reason: collision with root package name */
        private boolean f4658f = false;

        a(ActionMode.Callback callback, TextView textView) {
            this.f4653a = callback;
            this.f4654b = textView;
        }

        private Intent a() {
            return new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain");
        }

        private Intent b(ResolveInfo resolveInfo, TextView textView) {
            Intent putExtra = a().putExtra("android.intent.extra.PROCESS_TEXT_READONLY", !d(textView));
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            return putExtra.setClassName(activityInfo.packageName, activityInfo.name);
        }

        private List<ResolveInfo> c(Context context, PackageManager packageManager) {
            ArrayList arrayList = new ArrayList();
            if (context instanceof Activity) {
                for (ResolveInfo resolveInfo : packageManager.queryIntentActivities(a(), 0)) {
                    if (e(resolveInfo, context)) {
                        arrayList.add(resolveInfo);
                    }
                }
                return arrayList;
            }
            return arrayList;
        }

        private boolean d(TextView textView) {
            return (textView instanceof Editable) && textView.onCheckIsTextEditor() && textView.isEnabled();
        }

        private boolean e(ResolveInfo resolveInfo, Context context) {
            if (context.getPackageName().equals(resolveInfo.activityInfo.packageName)) {
                return true;
            }
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            if (activityInfo.exported) {
                String str = activityInfo.permission;
                return str == null || context.checkSelfPermission(str) == 0;
            }
            return false;
        }

        private void f(Menu menu) {
            Method declaredMethod;
            Context context = this.f4654b.getContext();
            PackageManager packageManager = context.getPackageManager();
            if (!this.f4658f) {
                this.f4658f = true;
                try {
                    Class<?> cls = Class.forName("com.android.internal.view.menu.MenuBuilder");
                    this.f4655c = cls;
                    this.f4656d = cls.getDeclaredMethod("removeItemAt", Integer.TYPE);
                    this.f4657e = true;
                } catch (ClassNotFoundException | NoSuchMethodException unused) {
                    this.f4655c = null;
                    this.f4656d = null;
                    this.f4657e = false;
                }
            }
            try {
                if (this.f4657e && this.f4655c.isInstance(menu)) {
                    declaredMethod = this.f4656d;
                } else {
                    declaredMethod = menu.getClass().getDeclaredMethod("removeItemAt", Integer.TYPE);
                }
                for (int size = menu.size() - 1; size >= 0; size--) {
                    MenuItem item = menu.getItem(size);
                    if (item.getIntent() != null && "android.intent.action.PROCESS_TEXT".equals(item.getIntent().getAction())) {
                        declaredMethod.invoke(menu, Integer.valueOf(size));
                    }
                }
                List<ResolveInfo> c11 = c(context, packageManager);
                for (int i11 = 0; i11 < c11.size(); i11++) {
                    ResolveInfo resolveInfo = c11.get(i11);
                    menu.add(0, 0, i11 + 100, resolveInfo.loadLabel(packageManager)).setIntent(b(resolveInfo, this.f4654b)).setShowAsAction(1);
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
            }
        }

        @Override // android.view.ActionMode.Callback
        public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
            return this.f4653a.onActionItemClicked(actionMode, menuItem);
        }

        @Override // android.view.ActionMode.Callback
        public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
            return this.f4653a.onCreateActionMode(actionMode, menu);
        }

        @Override // android.view.ActionMode.Callback
        public void onDestroyActionMode(ActionMode actionMode) {
            this.f4653a.onDestroyActionMode(actionMode);
        }

        @Override // android.view.ActionMode.Callback
        public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
            f(menu);
            return this.f4653a.onPrepareActionMode(actionMode, menu);
        }
    }

    public static Drawable[] a(TextView textView) {
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 18) {
            return textView.getCompoundDrawablesRelative();
        }
        if (i11 >= 17) {
            boolean z11 = textView.getLayoutDirection() == 1;
            Drawable[] compoundDrawables = textView.getCompoundDrawables();
            if (z11) {
                Drawable drawable = compoundDrawables[2];
                Drawable drawable2 = compoundDrawables[0];
                compoundDrawables[0] = drawable;
                compoundDrawables[2] = drawable2;
            }
            return compoundDrawables;
        }
        return textView.getCompoundDrawables();
    }

    public static int b(TextView textView) {
        return textView.getPaddingTop() - textView.getPaint().getFontMetricsInt().top;
    }

    public static int c(TextView textView) {
        return textView.getPaddingBottom() + textView.getPaint().getFontMetricsInt().bottom;
    }

    private static int d(TextDirectionHeuristic textDirectionHeuristic) {
        if (textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_RTL || textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_LTR) {
            return 1;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.ANYRTL_LTR) {
            return 2;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.LTR) {
            return 3;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.RTL) {
            return 4;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.LOCALE) {
            return 5;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_LTR) {
            return 6;
        }
        return textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_RTL ? 7 : 1;
    }

    private static TextDirectionHeuristic e(TextView textView) {
        if (textView.getTransformationMethod() instanceof PasswordTransformationMethod) {
            return TextDirectionHeuristics.LTR;
        }
        if (Build.VERSION.SDK_INT >= 28 && (textView.getInputType() & 15) == 3) {
            byte directionality = Character.getDirectionality(DecimalFormatSymbols.getInstance(textView.getTextLocale()).getDigitStrings()[0].codePointAt(0));
            if (directionality != 1 && directionality != 2) {
                return TextDirectionHeuristics.LTR;
            }
            return TextDirectionHeuristics.RTL;
        }
        boolean z11 = textView.getLayoutDirection() == 1;
        switch (textView.getTextDirection()) {
            case 2:
                return TextDirectionHeuristics.ANYRTL_LTR;
            case 3:
                return TextDirectionHeuristics.LTR;
            case 4:
                return TextDirectionHeuristics.RTL;
            case 5:
                return TextDirectionHeuristics.LOCALE;
            case 6:
                return TextDirectionHeuristics.FIRSTSTRONG_LTR;
            case 7:
                return TextDirectionHeuristics.FIRSTSTRONG_RTL;
            default:
                if (z11) {
                    return TextDirectionHeuristics.FIRSTSTRONG_RTL;
                }
                return TextDirectionHeuristics.FIRSTSTRONG_LTR;
        }
    }

    public static d.a f(TextView textView) {
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 28) {
            return new d.a(textView.getTextMetricsParams());
        }
        d.a.C1143a c1143a = new d.a.C1143a(new TextPaint(textView.getPaint()));
        if (i11 >= 23) {
            c1143a.b(textView.getBreakStrategy());
            c1143a.c(textView.getHyphenationFrequency());
        }
        if (i11 >= 18) {
            c1143a.d(e(textView));
        }
        return c1143a.a();
    }

    public static void g(TextView textView, ColorStateList colorStateList) {
        v3.h.f(textView);
        if (Build.VERSION.SDK_INT >= 24) {
            textView.setCompoundDrawableTintList(colorStateList);
        } else if (textView instanceof p) {
            ((p) textView).setSupportCompoundDrawablesTintList(colorStateList);
        }
    }

    public static void h(TextView textView, PorterDuff.Mode mode) {
        v3.h.f(textView);
        if (Build.VERSION.SDK_INT >= 24) {
            textView.setCompoundDrawableTintMode(mode);
        } else if (textView instanceof p) {
            ((p) textView).setSupportCompoundDrawablesTintMode(mode);
        }
    }

    public static void i(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 18) {
            textView.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        } else if (i11 >= 17) {
            boolean z11 = textView.getLayoutDirection() == 1;
            Drawable drawable5 = z11 ? drawable3 : drawable;
            if (!z11) {
                drawable = drawable3;
            }
            textView.setCompoundDrawables(drawable5, drawable2, drawable, drawable4);
        } else {
            textView.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        }
    }

    public static void j(TextView textView, int i11) {
        int i12;
        v3.h.d(i11);
        int i13 = Build.VERSION.SDK_INT;
        if (i13 >= 28) {
            textView.setFirstBaselineToTopHeight(i11);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        if (i13 >= 16 && !textView.getIncludeFontPadding()) {
            i12 = fontMetricsInt.ascent;
        } else {
            i12 = fontMetricsInt.top;
        }
        if (i11 > Math.abs(i12)) {
            textView.setPadding(textView.getPaddingLeft(), i11 + i12, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    public static void k(TextView textView, int i11) {
        int i12;
        v3.h.d(i11);
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        if (Build.VERSION.SDK_INT >= 16 && !textView.getIncludeFontPadding()) {
            i12 = fontMetricsInt.descent;
        } else {
            i12 = fontMetricsInt.bottom;
        }
        if (i11 > Math.abs(i12)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i11 - i12);
        }
    }

    public static void l(TextView textView, int i11) {
        v3.h.d(i11);
        int fontMetricsInt = textView.getPaint().getFontMetricsInt(null);
        if (i11 != fontMetricsInt) {
            textView.setLineSpacing(i11 - fontMetricsInt, 1.0f);
        }
    }

    public static void m(TextView textView, t3.d dVar) {
        if (Build.VERSION.SDK_INT >= 29) {
            textView.setText(dVar.b());
        } else if (f(textView).a(dVar.a())) {
            textView.setText(dVar);
        } else {
            throw new IllegalArgumentException("Given text can not be applied to TextView.");
        }
    }

    public static void n(TextView textView, int i11) {
        if (Build.VERSION.SDK_INT >= 23) {
            textView.setTextAppearance(i11);
        } else {
            textView.setTextAppearance(textView.getContext(), i11);
        }
    }

    public static void o(TextView textView, d.a aVar) {
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 18) {
            textView.setTextDirection(d(aVar.d()));
        }
        if (i11 < 23) {
            float textScaleX = aVar.e().getTextScaleX();
            textView.getPaint().set(aVar.e());
            if (textScaleX == textView.getTextScaleX()) {
                textView.setTextScaleX((textScaleX / 2.0f) + 1.0f);
            }
            textView.setTextScaleX(textScaleX);
            return;
        }
        textView.getPaint().set(aVar.e());
        textView.setBreakStrategy(aVar.b());
        textView.setHyphenationFrequency(aVar.c());
    }

    public static ActionMode.Callback p(TextView textView, ActionMode.Callback callback) {
        int i11 = Build.VERSION.SDK_INT;
        return (i11 < 26 || i11 > 27 || (callback instanceof a) || callback == null) ? callback : new a(callback, textView);
    }
}