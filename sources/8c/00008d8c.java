package o2;

import android.text.Layout;
import android.text.Spanned;
import android.text.TextPaint;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.text.BreakIterator;
import java.util.Comparator;
import java.util.PriorityQueue;
import kotlin.jvm.internal.s;

/* loaded from: classes.dex */
public final class f {
    public static /* synthetic */ int a(vz.p pVar, vz.p pVar2) {
        return d(pVar, pVar2);
    }

    public static final float c(CharSequence text, TextPaint paint) {
        s.g(text, "text");
        s.g(paint, "paint");
        BreakIterator lineInstance = BreakIterator.getLineInstance(paint.getTextLocale());
        int i11 = 0;
        lineInstance.setText(new b(text, 0, text.length()));
        PriorityQueue<vz.p> priorityQueue = new PriorityQueue(10, new Comparator() { // from class: o2.e
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return f.a((vz.p) obj, (vz.p) obj2);
            }
        });
        int next = lineInstance.next();
        while (true) {
            int i12 = i11;
            i11 = next;
            if (i11 == -1) {
                break;
            }
            if (priorityQueue.size() < 10) {
                priorityQueue.add(new vz.p(Integer.valueOf(i12), Integer.valueOf(i11)));
            } else {
                vz.p pVar = (vz.p) priorityQueue.peek();
                if (pVar != null && ((Number) pVar.d()).intValue() - ((Number) pVar.c()).intValue() < i11 - i12) {
                    priorityQueue.poll();
                    priorityQueue.add(new vz.p(Integer.valueOf(i12), Integer.valueOf(i11)));
                }
            }
            next = lineInstance.next();
        }
        float f11 = BitmapDescriptorFactory.HUE_RED;
        for (vz.p pVar2 : priorityQueue) {
            f11 = Math.max(f11, Layout.getDesiredWidth(text, ((Number) pVar2.a()).intValue(), ((Number) pVar2.b()).intValue(), paint));
        }
        return f11;
    }

    public static final int d(vz.p pVar, vz.p pVar2) {
        return (((Number) pVar.d()).intValue() - ((Number) pVar.c()).intValue()) - (((Number) pVar2.d()).intValue() - ((Number) pVar2.c()).intValue());
    }

    public static final boolean e(float f11, CharSequence charSequence, TextPaint textPaint) {
        if (!(f11 == BitmapDescriptorFactory.HUE_RED) && (charSequence instanceof Spanned)) {
            if (!(textPaint.getLetterSpacing() == BitmapDescriptorFactory.HUE_RED)) {
                return true;
            }
            Spanned spanned = (Spanned) charSequence;
            if (g.a(spanned, q2.d.class) || g.a(spanned, q2.c.class)) {
                return true;
            }
        }
        return false;
    }
}