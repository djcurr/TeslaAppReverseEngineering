package u3;

import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.text.style.URLSpan;
import android.text.util.Linkify;
import android.webkit.WebView;
import android.widget.TextView;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import v3.e;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    private static final Comparator<C1195b> f53094a = new a();

    /* loaded from: classes.dex */
    class a implements Comparator<C1195b> {
        a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(C1195b c1195b, C1195b c1195b2) {
            int i11;
            int i12;
            int i13 = c1195b.f53097c;
            int i14 = c1195b2.f53097c;
            if (i13 < i14) {
                return -1;
            }
            if (i13 <= i14 && (i11 = c1195b.f53098d) >= (i12 = c1195b2.f53098d)) {
                return i11 > i12 ? -1 : 0;
            }
            return 1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u3.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C1195b {

        /* renamed from: a  reason: collision with root package name */
        URLSpan f53095a;

        /* renamed from: b  reason: collision with root package name */
        String f53096b;

        /* renamed from: c  reason: collision with root package name */
        int f53097c;

        /* renamed from: d  reason: collision with root package name */
        int f53098d;

        C1195b() {
        }
    }

    private static void a(TextView textView) {
        if ((textView.getMovementMethod() instanceof LinkMovementMethod) || !textView.getLinksClickable()) {
            return;
        }
        textView.setMovementMethod(LinkMovementMethod.getInstance());
    }

    public static boolean b(Spannable spannable, int i11) {
        if (j()) {
            return Linkify.addLinks(spannable, i11);
        }
        if (i11 == 0) {
            return false;
        }
        URLSpan[] uRLSpanArr = (URLSpan[]) spannable.getSpans(0, spannable.length(), URLSpan.class);
        for (int length = uRLSpanArr.length - 1; length >= 0; length--) {
            spannable.removeSpan(uRLSpanArr[length]);
        }
        if ((i11 & 4) != 0) {
            Linkify.addLinks(spannable, 4);
        }
        ArrayList arrayList = new ArrayList();
        if ((i11 & 1) != 0) {
            f(arrayList, spannable, e.f54027g, new String[]{"http://", "https://", "rtsp://"}, Linkify.sUrlMatchFilter, null);
        }
        if ((i11 & 2) != 0) {
            f(arrayList, spannable, e.f54028h, new String[]{"mailto:"}, null, null);
        }
        if ((i11 & 8) != 0) {
            g(arrayList, spannable);
        }
        i(arrayList, spannable);
        if (arrayList.size() == 0) {
            return false;
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            C1195b c1195b = (C1195b) it2.next();
            if (c1195b.f53095a == null) {
                d(c1195b.f53096b, c1195b.f53097c, c1195b.f53098d, spannable);
            }
        }
        return true;
    }

    public static boolean c(TextView textView, int i11) {
        if (j()) {
            return Linkify.addLinks(textView, i11);
        }
        if (i11 == 0) {
            return false;
        }
        CharSequence text = textView.getText();
        if (text instanceof Spannable) {
            if (b((Spannable) text, i11)) {
                a(textView);
                return true;
            }
            return false;
        }
        SpannableString valueOf = SpannableString.valueOf(text);
        if (b(valueOf, i11)) {
            a(textView);
            textView.setText(valueOf);
            return true;
        }
        return false;
    }

    private static void d(String str, int i11, int i12, Spannable spannable) {
        spannable.setSpan(new URLSpan(str), i11, i12, 33);
    }

    private static String e(String str) {
        if (Build.VERSION.SDK_INT >= 28) {
            return WebView.findAddress(str);
        }
        return u3.a.c(str);
    }

    private static void f(ArrayList<C1195b> arrayList, Spannable spannable, Pattern pattern, String[] strArr, Linkify.MatchFilter matchFilter, Linkify.TransformFilter transformFilter) {
        Matcher matcher = pattern.matcher(spannable);
        while (matcher.find()) {
            int start = matcher.start();
            int end = matcher.end();
            if (matchFilter == null || matchFilter.acceptMatch(spannable, start, end)) {
                C1195b c1195b = new C1195b();
                c1195b.f53096b = h(matcher.group(0), strArr, matcher, transformFilter);
                c1195b.f53097c = start;
                c1195b.f53098d = end;
                arrayList.add(c1195b);
            }
        }
    }

    private static void g(ArrayList<C1195b> arrayList, Spannable spannable) {
        int indexOf;
        String obj = spannable.toString();
        int i11 = 0;
        while (true) {
            try {
                String e11 = e(obj);
                if (e11 != null && (indexOf = obj.indexOf(e11)) >= 0) {
                    C1195b c1195b = new C1195b();
                    int length = e11.length() + indexOf;
                    c1195b.f53097c = indexOf + i11;
                    i11 += length;
                    c1195b.f53098d = i11;
                    obj = obj.substring(length);
                    try {
                        String encode = URLEncoder.encode(e11, "UTF-8");
                        c1195b.f53096b = "geo:0,0?q=" + encode;
                        arrayList.add(c1195b);
                    } catch (UnsupportedEncodingException unused) {
                    }
                }
                return;
            } catch (UnsupportedOperationException unused2) {
                return;
            }
        }
    }

    private static String h(String str, String[] strArr, Matcher matcher, Linkify.TransformFilter transformFilter) {
        boolean z11;
        if (transformFilter != null) {
            str = transformFilter.transformUrl(matcher, str);
        }
        int i11 = 0;
        while (true) {
            z11 = true;
            if (i11 >= strArr.length) {
                z11 = false;
                break;
            }
            if (str.regionMatches(true, 0, strArr[i11], 0, strArr[i11].length())) {
                if (!str.regionMatches(false, 0, strArr[i11], 0, strArr[i11].length())) {
                    str = strArr[i11] + str.substring(strArr[i11].length());
                }
            } else {
                i11++;
            }
        }
        if (z11 || strArr.length <= 0) {
            return str;
        }
        return strArr[0] + str;
    }

    private static void i(ArrayList<C1195b> arrayList, Spannable spannable) {
        int i11;
        int i12 = 0;
        Object[] objArr = (URLSpan[]) spannable.getSpans(0, spannable.length(), URLSpan.class);
        for (int i13 = 0; i13 < objArr.length; i13++) {
            C1195b c1195b = new C1195b();
            c1195b.f53095a = objArr[i13];
            c1195b.f53097c = spannable.getSpanStart(objArr[i13]);
            c1195b.f53098d = spannable.getSpanEnd(objArr[i13]);
            arrayList.add(c1195b);
        }
        Collections.sort(arrayList, f53094a);
        int size = arrayList.size();
        while (i12 < size - 1) {
            C1195b c1195b2 = arrayList.get(i12);
            int i14 = i12 + 1;
            C1195b c1195b3 = arrayList.get(i14);
            int i15 = c1195b2.f53097c;
            int i16 = c1195b3.f53097c;
            if (i15 <= i16 && (i11 = c1195b2.f53098d) > i16) {
                int i17 = c1195b3.f53098d;
                int i18 = (i17 > i11 && i11 - i15 <= i17 - i16) ? i11 - i15 < i17 - i16 ? i12 : -1 : i14;
                if (i18 != -1) {
                    Object obj = arrayList.get(i18).f53095a;
                    if (obj != null) {
                        spannable.removeSpan(obj);
                    }
                    arrayList.remove(i18);
                    size--;
                }
            }
            i12 = i14;
        }
    }

    private static boolean j() {
        return Build.VERSION.SDK_INT >= 28;
    }
}