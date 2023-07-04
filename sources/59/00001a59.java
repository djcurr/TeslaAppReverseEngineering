package com.facebook.react.views.text;

import android.content.Context;
import android.graphics.Rect;
import android.text.Layout;
import android.text.TextPaint;
import android.util.DisplayMetrics;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import org.spongycastle.i18n.TextBundle;

/* loaded from: classes3.dex */
public class e {
    public static WritableArray a(CharSequence charSequence, Layout layout, TextPaint textPaint, Context context) {
        Rect rect;
        Rect rect2;
        Rect rect3;
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        WritableArray createArray = Arguments.createArray();
        TextPaint textPaint2 = new TextPaint(textPaint);
        textPaint2.setTextSize(textPaint2.getTextSize() * 100.0f);
        textPaint2.getTextBounds("T", 0, 1, new Rect());
        double height = (rect.height() / 100.0f) / displayMetrics.density;
        textPaint2.getTextBounds("x", 0, 1, new Rect());
        double height2 = (rect2.height() / 100.0f) / displayMetrics.density;
        for (int i11 = 0; i11 < layout.getLineCount(); i11++) {
            layout.getLineBounds(i11, new Rect());
            WritableMap createMap = Arguments.createMap();
            createMap.putDouble("x", layout.getLineLeft(i11) / displayMetrics.density);
            createMap.putDouble("y", rect3.top / displayMetrics.density);
            createMap.putDouble(Snapshot.WIDTH, layout.getLineWidth(i11) / displayMetrics.density);
            createMap.putDouble(Snapshot.HEIGHT, rect3.height() / displayMetrics.density);
            createMap.putDouble("descender", layout.getLineDescent(i11) / displayMetrics.density);
            createMap.putDouble("ascender", (-layout.getLineAscent(i11)) / displayMetrics.density);
            createMap.putDouble("baseline", layout.getLineBaseline(i11) / displayMetrics.density);
            createMap.putDouble("capHeight", height);
            createMap.putDouble("xHeight", height2);
            createMap.putString(TextBundle.TEXT_ENTRY, charSequence.subSequence(layout.getLineStart(i11), layout.getLineEnd(i11)).toString());
            createArray.pushMap(createMap);
        }
        return createArray;
    }
}