package com.facebook.react.uimanager;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.SpannableString;
import android.text.style.URLSpan;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactNoCrashSoftException;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.bridge.WritableMap;
import java.util.HashMap;
import org.spongycastle.i18n.TextBundle;
import w3.c;

/* loaded from: classes3.dex */
public class s extends androidx.core.view.a {

    /* renamed from: d  reason: collision with root package name */
    private static int f12402d = 1056964608;

    /* renamed from: e  reason: collision with root package name */
    public static final HashMap<String, Integer> f12403e;

    /* renamed from: c  reason: collision with root package name */
    View f12406c;

    /* renamed from: b  reason: collision with root package name */
    private final HashMap<Integer, String> f12405b = new HashMap<>();

    /* renamed from: a  reason: collision with root package name */
    private Handler f12404a = new a(this);

    /* loaded from: classes3.dex */
    class a extends Handler {
        a(s sVar) {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            ((View) message.obj).sendAccessibilityEvent(4);
        }
    }

    /* loaded from: classes3.dex */
    class b extends com.facebook.react.uimanager.events.c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ WritableMap f12407a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(s sVar, int i11, int i12, WritableMap writableMap) {
            super(i11, i12);
            this.f12407a = writableMap;
        }

        @Override // com.facebook.react.uimanager.events.c
        protected WritableMap getEventData() {
            return this.f12407a;
        }

        @Override // com.facebook.react.uimanager.events.c
        public String getEventName() {
            return "topAccessibilityAction";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class c {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f12408a;

        static {
            int[] iArr = new int[d.values().length];
            f12408a = iArr;
            try {
                iArr[d.BUTTON.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f12408a[d.TOGGLEBUTTON.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f12408a[d.SEARCH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f12408a[d.IMAGE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f12408a[d.IMAGEBUTTON.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f12408a[d.KEYBOARDKEY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f12408a[d.TEXT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f12408a[d.ADJUSTABLE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f12408a[d.CHECKBOX.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f12408a[d.RADIO.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f12408a[d.SPINBUTTON.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f12408a[d.SWITCH.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f12408a[d.LIST.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f12408a[d.NONE.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f12408a[d.LINK.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f12408a[d.SUMMARY.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f12408a[d.HEADER.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f12408a[d.ALERT.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f12408a[d.COMBOBOX.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f12408a[d.MENU.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f12408a[d.MENUBAR.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f12408a[d.MENUITEM.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f12408a[d.PROGRESSBAR.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f12408a[d.RADIOGROUP.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f12408a[d.SCROLLBAR.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f12408a[d.TAB.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f12408a[d.TABLIST.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                f12408a[d.TIMER.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                f12408a[d.TOOLBAR.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
        }
    }

    /* loaded from: classes3.dex */
    public enum d {
        NONE,
        BUTTON,
        TOGGLEBUTTON,
        LINK,
        SEARCH,
        IMAGE,
        IMAGEBUTTON,
        KEYBOARDKEY,
        TEXT,
        ADJUSTABLE,
        SUMMARY,
        HEADER,
        ALERT,
        CHECKBOX,
        COMBOBOX,
        MENU,
        MENUBAR,
        MENUITEM,
        PROGRESSBAR,
        RADIO,
        RADIOGROUP,
        SCROLLBAR,
        SPINBUTTON,
        SWITCH,
        TAB,
        TABLIST,
        TIMER,
        LIST,
        TOOLBAR;

        public static d fromValue(String str) {
            d[] values;
            for (d dVar : values()) {
                if (dVar.name().equalsIgnoreCase(str)) {
                    return dVar;
                }
            }
            throw new IllegalArgumentException("Invalid accessibility role value: " + str);
        }

        public static String getValue(d dVar) {
            switch (c.f12408a[dVar.ordinal()]) {
                case 1:
                    return "android.widget.Button";
                case 2:
                    return "android.widget.ToggleButton";
                case 3:
                    return "android.widget.EditText";
                case 4:
                    return "android.widget.ImageView";
                case 5:
                    return "android.widget.ImageButon";
                case 6:
                    return "android.inputmethodservice.Keyboard$Key";
                case 7:
                    return "android.widget.TextView";
                case 8:
                    return "android.widget.SeekBar";
                case 9:
                    return "android.widget.CheckBox";
                case 10:
                    return "android.widget.RadioButton";
                case 11:
                    return "android.widget.SpinButton";
                case 12:
                    return "android.widget.Switch";
                case 13:
                    return "android.widget.AbsListView";
                case 14:
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                    return "android.view.View";
                default:
                    throw new IllegalArgumentException("Invalid accessibility role value: " + dVar);
            }
        }
    }

    static {
        HashMap<String, Integer> hashMap = new HashMap<>();
        f12403e = hashMap;
        hashMap.put("activate", Integer.valueOf(c.a.f55453g.b()));
        hashMap.put("longpress", Integer.valueOf(c.a.f55454h.b()));
        hashMap.put("increment", Integer.valueOf(c.a.f55457k.b()));
        hashMap.put("decrement", Integer.valueOf(c.a.f55458l.b()));
    }

    private void a(View view) {
        if (this.f12404a.hasMessages(1, view)) {
            this.f12404a.removeMessages(1, view);
        }
        this.f12404a.sendMessageDelayed(this.f12404a.obtainMessage(1, view), 200L);
    }

    public static void b(View view) {
        if (androidx.core.view.a0.T(view)) {
            return;
        }
        if (view.getTag(com.facebook.react.h.f11870d) == null && view.getTag(com.facebook.react.h.f11871e) == null && view.getTag(com.facebook.react.h.f11867a) == null && view.getTag(com.facebook.react.h.f11877k) == null) {
            return;
        }
        androidx.core.view.a0.w0(view, new s());
    }

    public static void c(w3.c cVar, d dVar, Context context) {
        if (dVar == null) {
            dVar = d.NONE;
        }
        cVar.c0(d.getValue(dVar));
        if (dVar.equals(d.LINK)) {
            cVar.B0(context.getString(com.facebook.react.i.f11885f));
            if (cVar.r() != null) {
                SpannableString spannableString = new SpannableString(cVar.r());
                spannableString.setSpan(new URLSpan(""), 0, spannableString.length(), 0);
                cVar.g0(spannableString);
            }
            if (cVar.y() != null) {
                SpannableString spannableString2 = new SpannableString(cVar.y());
                spannableString2.setSpan(new URLSpan(""), 0, spannableString2.length(), 0);
                cVar.J0(spannableString2);
            }
        } else if (dVar.equals(d.IMAGE)) {
            cVar.B0(context.getString(com.facebook.react.i.f11883d));
        } else if (dVar.equals(d.IMAGEBUTTON)) {
            cVar.B0(context.getString(com.facebook.react.i.f11884e));
            cVar.d0(true);
        } else if (dVar.equals(d.BUTTON)) {
            cVar.d0(true);
        } else if (dVar.equals(d.TOGGLEBUTTON)) {
            cVar.d0(true);
            cVar.a0(true);
        } else if (dVar.equals(d.SUMMARY)) {
            cVar.B0(context.getString(com.facebook.react.i.f11901v));
        } else if (dVar.equals(d.HEADER)) {
            cVar.f0(c.C1263c.a(0, 1, 0, 1, true));
        } else if (dVar.equals(d.ALERT)) {
            cVar.B0(context.getString(com.facebook.react.i.f11880a));
        } else if (dVar.equals(d.COMBOBOX)) {
            cVar.B0(context.getString(com.facebook.react.i.f11882c));
        } else if (dVar.equals(d.MENU)) {
            cVar.B0(context.getString(com.facebook.react.i.f11886g));
        } else if (dVar.equals(d.MENUBAR)) {
            cVar.B0(context.getString(com.facebook.react.i.f11887h));
        } else if (dVar.equals(d.MENUITEM)) {
            cVar.B0(context.getString(com.facebook.react.i.f11888i));
        } else if (dVar.equals(d.PROGRESSBAR)) {
            cVar.B0(context.getString(com.facebook.react.i.f11889j));
        } else if (dVar.equals(d.RADIOGROUP)) {
            cVar.B0(context.getString(com.facebook.react.i.f11890k));
        } else if (dVar.equals(d.SCROLLBAR)) {
            cVar.B0(context.getString(com.facebook.react.i.f11892m));
        } else if (dVar.equals(d.SPINBUTTON)) {
            cVar.B0(context.getString(com.facebook.react.i.f11893n));
        } else if (dVar.equals(d.TAB)) {
            cVar.B0(context.getString(com.facebook.react.i.f11891l));
        } else if (dVar.equals(d.TABLIST)) {
            cVar.B0(context.getString(com.facebook.react.i.f11902w));
        } else if (dVar.equals(d.TIMER)) {
            cVar.B0(context.getString(com.facebook.react.i.f11903x));
        } else if (dVar.equals(d.TOOLBAR)) {
            cVar.B0(context.getString(com.facebook.react.i.f11904y));
        }
    }

    private static void d(w3.c cVar, ReadableMap readableMap, Context context) {
        ReadableMapKeySetIterator keySetIterator = readableMap.keySetIterator();
        while (keySetIterator.hasNextKey()) {
            String nextKey = keySetIterator.nextKey();
            Dynamic dynamic = readableMap.getDynamic(nextKey);
            if (nextKey.equals("selected") && dynamic.getType() == ReadableType.Boolean) {
                cVar.E0(dynamic.asBoolean());
            } else if (nextKey.equals("disabled") && dynamic.getType() == ReadableType.Boolean) {
                cVar.k0(!dynamic.asBoolean());
            } else if (nextKey.equals("checked") && dynamic.getType() == ReadableType.Boolean) {
                boolean asBoolean = dynamic.asBoolean();
                cVar.a0(true);
                cVar.b0(asBoolean);
                if (cVar.p().equals(d.getValue(d.SWITCH))) {
                    cVar.J0(context.getString(asBoolean ? com.facebook.react.i.f11899t : com.facebook.react.i.f11898s));
                }
            }
        }
    }

    @Override // androidx.core.view.a
    public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(view, accessibilityEvent);
        ReadableMap readableMap = (ReadableMap) view.getTag(com.facebook.react.h.f11872f);
        if (readableMap != null && readableMap.hasKey("min") && readableMap.hasKey("now") && readableMap.hasKey("max")) {
            Dynamic dynamic = readableMap.getDynamic("min");
            Dynamic dynamic2 = readableMap.getDynamic("now");
            Dynamic dynamic3 = readableMap.getDynamic("max");
            if (dynamic != null) {
                ReadableType type = dynamic.getType();
                ReadableType readableType = ReadableType.Number;
                if (type == readableType && dynamic2 != null && dynamic2.getType() == readableType && dynamic3 != null && dynamic3.getType() == readableType) {
                    int asInt = dynamic.asInt();
                    int asInt2 = dynamic2.asInt();
                    int asInt3 = dynamic3.asInt();
                    if (asInt3 <= asInt || asInt2 < asInt || asInt3 < asInt2) {
                        return;
                    }
                    accessibilityEvent.setItemCount(asInt3 - asInt);
                    accessibilityEvent.setCurrentItemIndex(asInt2);
                }
            }
        }
    }

    @Override // androidx.core.view.a
    public void onInitializeAccessibilityNodeInfo(View view, w3.c cVar) {
        super.onInitializeAccessibilityNodeInfo(view, cVar);
        d dVar = (d) view.getTag(com.facebook.react.h.f11870d);
        if (dVar != null) {
            c(cVar, dVar, view.getContext());
        }
        Object tag = view.getTag(com.facebook.react.h.f11873g);
        if (tag != null) {
            View a11 = qg.a.a(view.getRootView(), (String) tag);
            this.f12406c = a11;
            if (a11 != null) {
                cVar.q0(a11);
            }
        }
        ReadableMap readableMap = (ReadableMap) view.getTag(com.facebook.react.h.f11871e);
        if (readableMap != null) {
            d(cVar, readableMap, view.getContext());
        }
        ReadableArray readableArray = (ReadableArray) view.getTag(com.facebook.react.h.f11867a);
        if (readableArray != null) {
            for (int i11 = 0; i11 < readableArray.size(); i11++) {
                ReadableMap map = readableArray.getMap(i11);
                if (map.hasKey("name")) {
                    int i12 = f12402d;
                    String string = map.hasKey("label") ? map.getString("label") : null;
                    HashMap<String, Integer> hashMap = f12403e;
                    if (hashMap.containsKey(map.getString("name"))) {
                        i12 = hashMap.get(map.getString("name")).intValue();
                    } else {
                        f12402d++;
                    }
                    this.f12405b.put(Integer.valueOf(i12), map.getString("name"));
                    cVar.b(new c.a(i12, string));
                } else {
                    throw new IllegalArgumentException("Unknown accessibility action.");
                }
            }
        }
        ReadableMap readableMap2 = (ReadableMap) view.getTag(com.facebook.react.h.f11872f);
        if (readableMap2 != null && readableMap2.hasKey("min") && readableMap2.hasKey("now") && readableMap2.hasKey("max")) {
            Dynamic dynamic = readableMap2.getDynamic("min");
            Dynamic dynamic2 = readableMap2.getDynamic("now");
            Dynamic dynamic3 = readableMap2.getDynamic("max");
            if (dynamic != null) {
                ReadableType type = dynamic.getType();
                ReadableType readableType = ReadableType.Number;
                if (type == readableType && dynamic2 != null && dynamic2.getType() == readableType && dynamic3 != null && dynamic3.getType() == readableType) {
                    int asInt = dynamic.asInt();
                    int asInt2 = dynamic2.asInt();
                    int asInt3 = dynamic3.asInt();
                    if (asInt3 > asInt && asInt2 >= asInt && asInt3 >= asInt2) {
                        cVar.A0(c.d.a(0, asInt, asInt3, asInt2));
                    }
                }
            }
        }
        String str = (String) view.getTag(com.facebook.react.h.f11877k);
        if (str != null) {
            cVar.M0(str);
        }
    }

    @Override // androidx.core.view.a
    public boolean performAccessibilityAction(View view, int i11, Bundle bundle) {
        if (this.f12405b.containsKey(Integer.valueOf(i11))) {
            WritableMap createMap = Arguments.createMap();
            createMap.putString("actionName", this.f12405b.get(Integer.valueOf(i11)));
            ReactContext reactContext = (ReactContext) view.getContext();
            if (reactContext.hasActiveReactInstance()) {
                int id2 = view.getId();
                int e11 = t0.e(reactContext);
                UIManager g11 = t0.g(reactContext, id2);
                if (g11 != null) {
                    ((com.facebook.react.uimanager.events.d) g11.getEventDispatcher()).g(new b(this, e11, id2, createMap));
                }
            } else {
                ReactSoftExceptionLogger.logSoftException("ReactAccessibilityDelegate", new ReactNoCrashSoftException("Cannot get RCTEventEmitter, no CatalystInstance"));
            }
            d dVar = (d) view.getTag(com.facebook.react.h.f11870d);
            ReadableMap readableMap = (ReadableMap) view.getTag(com.facebook.react.h.f11872f);
            if (dVar == d.ADJUSTABLE) {
                if (i11 == c.a.f55457k.b() || i11 == c.a.f55458l.b()) {
                    if (readableMap != null && !readableMap.hasKey(TextBundle.TEXT_ENTRY)) {
                        a(view);
                    }
                    return super.performAccessibilityAction(view, i11, bundle);
                }
                return true;
            }
            return true;
        }
        return super.performAccessibilityAction(view, i11, bundle);
    }
}