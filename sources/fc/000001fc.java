package androidx.appcompat.app;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import androidx.appcompat.widget.AppCompatAutoCompleteTextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.q;
import androidx.appcompat.widget.r;
import androidx.appcompat.widget.r0;
import androidx.appcompat.widget.t;
import androidx.appcompat.widget.v;
import androidx.appcompat.widget.z;
import androidx.core.view.a0;
import ch.qos.logback.core.joran.action.Action;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public class j {

    /* renamed from: b  reason: collision with root package name */
    private static final Class<?>[] f1232b = {Context.class, AttributeSet.class};

    /* renamed from: c  reason: collision with root package name */
    private static final int[] f1233c = {16843375};

    /* renamed from: d  reason: collision with root package name */
    private static final String[] f1234d = {"android.widget.", "android.view.", "android.webkit."};

    /* renamed from: e  reason: collision with root package name */
    private static final androidx.collection.g<String, Constructor<? extends View>> f1235e = new androidx.collection.g<>();

    /* renamed from: a  reason: collision with root package name */
    private final Object[] f1236a = new Object[2];

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        private final View f1237a;

        /* renamed from: b  reason: collision with root package name */
        private final String f1238b;

        /* renamed from: c  reason: collision with root package name */
        private Method f1239c;

        /* renamed from: d  reason: collision with root package name */
        private Context f1240d;

        public a(View view, String str) {
            this.f1237a = view;
            this.f1238b = str;
        }

        private void a(Context context) {
            int id2;
            String str;
            Method method;
            while (context != null) {
                try {
                    if (!context.isRestricted() && (method = context.getClass().getMethod(this.f1238b, View.class)) != null) {
                        this.f1239c = method;
                        this.f1240d = context;
                        return;
                    }
                } catch (NoSuchMethodException unused) {
                }
                context = context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : null;
            }
            if (this.f1237a.getId() == -1) {
                str = "";
            } else {
                str = " with id '" + this.f1237a.getContext().getResources().getResourceEntryName(id2) + "'";
            }
            throw new IllegalStateException("Could not find method " + this.f1238b + "(View) in a parent or ancestor Context for android:onClick attribute defined on view " + this.f1237a.getClass() + str);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (this.f1239c == null) {
                a(this.f1237a.getContext());
            }
            try {
                this.f1239c.invoke(this.f1240d, view);
            } catch (IllegalAccessException e11) {
                throw new IllegalStateException("Could not execute non-public method for android:onClick", e11);
            } catch (InvocationTargetException e12) {
                throw new IllegalStateException("Could not execute method for android:onClick", e12);
            }
        }
    }

    private void a(View view, AttributeSet attributeSet) {
        Context context = view.getContext();
        if (context instanceof ContextWrapper) {
            if (Build.VERSION.SDK_INT < 15 || a0.U(view)) {
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f1233c);
                String string = obtainStyledAttributes.getString(0);
                if (string != null) {
                    view.setOnClickListener(new a(view, string));
                }
                obtainStyledAttributes.recycle();
            }
        }
    }

    private View r(Context context, String str, String str2) {
        String str3;
        androidx.collection.g<String, Constructor<? extends View>> gVar = f1235e;
        Constructor<? extends View> constructor = gVar.get(str);
        if (constructor == null) {
            if (str2 != null) {
                try {
                    str3 = str2 + str;
                } catch (Exception unused) {
                    return null;
                }
            } else {
                str3 = str;
            }
            constructor = Class.forName(str3, false, context.getClassLoader()).asSubclass(View.class).getConstructor(f1232b);
            gVar.put(str, constructor);
        }
        constructor.setAccessible(true);
        return constructor.newInstance(this.f1236a);
    }

    private View s(Context context, String str, AttributeSet attributeSet) {
        if (str.equals("view")) {
            str = attributeSet.getAttributeValue(null, Action.CLASS_ATTRIBUTE);
        }
        try {
            Object[] objArr = this.f1236a;
            objArr[0] = context;
            objArr[1] = attributeSet;
            if (-1 != str.indexOf(46)) {
                return r(context, str, null);
            }
            int i11 = 0;
            while (true) {
                String[] strArr = f1234d;
                if (i11 >= strArr.length) {
                    return null;
                }
                View r11 = r(context, str, strArr[i11]);
                if (r11 != null) {
                    return r11;
                }
                i11++;
            }
        } catch (Exception unused) {
            return null;
        } finally {
            Object[] objArr2 = this.f1236a;
            objArr2[0] = null;
            objArr2[1] = null;
        }
    }

    private static Context t(Context context, AttributeSet attributeSet, boolean z11, boolean z12) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g.j.f27298x3, 0, 0);
        int resourceId = z11 ? obtainStyledAttributes.getResourceId(g.j.f27303y3, 0) : 0;
        if (z12 && resourceId == 0 && (resourceId = obtainStyledAttributes.getResourceId(g.j.f27308z3, 0)) != 0) {
            Log.i("AppCompatViewInflater", "app:theme is now deprecated. Please move to using android:theme instead.");
        }
        obtainStyledAttributes.recycle();
        return resourceId != 0 ? ((context instanceof l.d) && ((l.d) context).c() == resourceId) ? context : new l.d(context, resourceId) : context;
    }

    private void u(View view, String str) {
        if (view != null) {
            return;
        }
        throw new IllegalStateException(getClass().getName() + " asked to inflate view for <" + str + ">, but returned null");
    }

    protected AppCompatAutoCompleteTextView b(Context context, AttributeSet attributeSet) {
        return new AppCompatAutoCompleteTextView(context, attributeSet);
    }

    protected androidx.appcompat.widget.e c(Context context, AttributeSet attributeSet) {
        return new androidx.appcompat.widget.e(context, attributeSet);
    }

    protected androidx.appcompat.widget.f d(Context context, AttributeSet attributeSet) {
        return new androidx.appcompat.widget.f(context, attributeSet);
    }

    protected androidx.appcompat.widget.g e(Context context, AttributeSet attributeSet) {
        return new androidx.appcompat.widget.g(context, attributeSet);
    }

    protected androidx.appcompat.widget.j f(Context context, AttributeSet attributeSet) {
        return new androidx.appcompat.widget.j(context, attributeSet);
    }

    protected androidx.appcompat.widget.l g(Context context, AttributeSet attributeSet) {
        return new androidx.appcompat.widget.l(context, attributeSet);
    }

    protected AppCompatImageView h(Context context, AttributeSet attributeSet) {
        return new AppCompatImageView(context, attributeSet);
    }

    protected androidx.appcompat.widget.n i(Context context, AttributeSet attributeSet) {
        return new androidx.appcompat.widget.n(context, attributeSet);
    }

    protected q j(Context context, AttributeSet attributeSet) {
        return new q(context, attributeSet);
    }

    protected r k(Context context, AttributeSet attributeSet) {
        return new r(context, attributeSet);
    }

    protected t l(Context context, AttributeSet attributeSet) {
        return new t(context, attributeSet);
    }

    protected v m(Context context, AttributeSet attributeSet) {
        return new v(context, attributeSet);
    }

    protected AppCompatTextView n(Context context, AttributeSet attributeSet) {
        return new AppCompatTextView(context, attributeSet);
    }

    protected z o(Context context, AttributeSet attributeSet) {
        return new z(context, attributeSet);
    }

    protected View p(Context context, String str, AttributeSet attributeSet) {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final View q(View view, String str, Context context, AttributeSet attributeSet, boolean z11, boolean z12, boolean z13, boolean z14) {
        View k11;
        Context context2 = (!z11 || view == null) ? context : view.getContext();
        if (z12 || z13) {
            context2 = t(context2, attributeSet, z12, z13);
        }
        if (z14) {
            context2 = r0.b(context2);
        }
        str.hashCode();
        char c11 = 65535;
        switch (str.hashCode()) {
            case -1946472170:
                if (str.equals("RatingBar")) {
                    c11 = 0;
                    break;
                }
                break;
            case -1455429095:
                if (str.equals("CheckedTextView")) {
                    c11 = 1;
                    break;
                }
                break;
            case -1346021293:
                if (str.equals("MultiAutoCompleteTextView")) {
                    c11 = 2;
                    break;
                }
                break;
            case -938935918:
                if (str.equals("TextView")) {
                    c11 = 3;
                    break;
                }
                break;
            case -937446323:
                if (str.equals("ImageButton")) {
                    c11 = 4;
                    break;
                }
                break;
            case -658531749:
                if (str.equals("SeekBar")) {
                    c11 = 5;
                    break;
                }
                break;
            case -339785223:
                if (str.equals("Spinner")) {
                    c11 = 6;
                    break;
                }
                break;
            case 776382189:
                if (str.equals("RadioButton")) {
                    c11 = 7;
                    break;
                }
                break;
            case 799298502:
                if (str.equals("ToggleButton")) {
                    c11 = '\b';
                    break;
                }
                break;
            case 1125864064:
                if (str.equals("ImageView")) {
                    c11 = '\t';
                    break;
                }
                break;
            case 1413872058:
                if (str.equals("AutoCompleteTextView")) {
                    c11 = '\n';
                    break;
                }
                break;
            case 1601505219:
                if (str.equals("CheckBox")) {
                    c11 = 11;
                    break;
                }
                break;
            case 1666676343:
                if (str.equals("EditText")) {
                    c11 = '\f';
                    break;
                }
                break;
            case 2001146706:
                if (str.equals("Button")) {
                    c11 = '\r';
                    break;
                }
                break;
        }
        switch (c11) {
            case 0:
                k11 = k(context2, attributeSet);
                u(k11, str);
                break;
            case 1:
                k11 = e(context2, attributeSet);
                u(k11, str);
                break;
            case 2:
                k11 = i(context2, attributeSet);
                u(k11, str);
                break;
            case 3:
                k11 = n(context2, attributeSet);
                u(k11, str);
                break;
            case 4:
                k11 = g(context2, attributeSet);
                u(k11, str);
                break;
            case 5:
                k11 = l(context2, attributeSet);
                u(k11, str);
                break;
            case 6:
                k11 = m(context2, attributeSet);
                u(k11, str);
                break;
            case 7:
                k11 = j(context2, attributeSet);
                u(k11, str);
                break;
            case '\b':
                k11 = o(context2, attributeSet);
                u(k11, str);
                break;
            case '\t':
                k11 = h(context2, attributeSet);
                u(k11, str);
                break;
            case '\n':
                k11 = b(context2, attributeSet);
                u(k11, str);
                break;
            case 11:
                k11 = d(context2, attributeSet);
                u(k11, str);
                break;
            case '\f':
                k11 = f(context2, attributeSet);
                u(k11, str);
                break;
            case '\r':
                k11 = c(context2, attributeSet);
                u(k11, str);
                break;
            default:
                k11 = p(context2, str, attributeSet);
                break;
        }
        if (k11 == null && context != context2) {
            k11 = s(context2, str, attributeSet);
        }
        if (k11 != null) {
            a(k11, attributeSet);
        }
        return k11;
    }
}