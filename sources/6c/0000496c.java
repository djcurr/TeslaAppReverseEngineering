package com.reactnativecommunity.picker;

import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.n0;
import com.reactnativecommunity.picker.h;
import java.util.Map;

/* loaded from: classes2.dex */
public abstract class ReactPickerManager extends BaseViewManager<h, j> {
    private static final int BLUR_PICKER = 2;
    private static final ReadableArray EMPTY_ARRAY = Arguments.createArray();
    private static final int FOCUS_PICKER = 1;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static class a implements h.d, h.c {

        /* renamed from: a  reason: collision with root package name */
        private final h f20114a;

        /* renamed from: b  reason: collision with root package name */
        private final com.facebook.react.uimanager.events.d f20115b;

        public a(h hVar, com.facebook.react.uimanager.events.d dVar) {
            this.f20114a = hVar;
            this.f20115b = dVar;
        }

        @Override // com.reactnativecommunity.picker.h.d
        public void a(int i11) {
            this.f20115b.g(new c(this.f20114a.getId(), i11));
        }

        @Override // com.reactnativecommunity.picker.h.c
        public void b() {
            this.f20115b.g(new com.reactnativecommunity.picker.a(this.f20114a.getId()));
        }

        @Override // com.reactnativecommunity.picker.h.c
        public void c() {
            this.f20115b.g(new com.reactnativecommunity.picker.b(this.f20114a.getId()));
        }
    }

    /* loaded from: classes2.dex */
    private static class b extends BaseAdapter {

        /* renamed from: a  reason: collision with root package name */
        private final LayoutInflater f20116a;

        /* renamed from: b  reason: collision with root package name */
        private int f20117b = 1;

        /* renamed from: c  reason: collision with root package name */
        private Integer f20118c;

        /* renamed from: d  reason: collision with root package name */
        private ReadableArray f20119d;

        public b(Context context, ReadableArray readableArray) {
            this.f20119d = readableArray;
            this.f20116a = (LayoutInflater) wf.a.c(context.getSystemService("layout_inflater"));
        }

        private View b(int i11, View view, ViewGroup viewGroup, boolean z11) {
            Integer num;
            int i12;
            ReadableMap item = getItem(i11);
            ReadableMap map = item.hasKey("style") ? item.getMap("style") : null;
            if (view == null) {
                if (z11) {
                    i12 = f.simple_spinner_dropdown_item;
                } else {
                    i12 = f.simple_spinner_item;
                }
                view = this.f20116a.inflate(i12, viewGroup, false);
            }
            boolean z12 = item.hasKey("enabled") ? item.getBoolean("enabled") : true;
            view.setEnabled(z12);
            view.setClickable(!z12);
            TextView textView = (TextView) view;
            textView.setText(item.getString("label"));
            textView.setMaxLines(this.f20117b);
            if (map != null) {
                if (map.hasKey("backgroundColor") && !map.isNull("backgroundColor")) {
                    view.setBackgroundColor(map.getInt("backgroundColor"));
                } else {
                    view.setBackgroundColor(0);
                }
                if (map.hasKey("color") && !map.isNull("color")) {
                    textView.setTextColor(map.getInt("color"));
                }
                if (map.hasKey("fontSize") && !map.isNull("fontSize")) {
                    textView.setTextSize((float) map.getDouble("fontSize"));
                }
                if (map.hasKey("fontFamily") && !map.isNull("fontFamily")) {
                    textView.setTypeface(Typeface.create(map.getString("fontFamily"), 0));
                }
            }
            if (!z11 && (num = this.f20118c) != null) {
                textView.setTextColor(num.intValue());
            } else if (item.hasKey("color") && !item.isNull("color")) {
                textView.setTextColor(item.getInt("color"));
            }
            if (item.hasKey("fontFamily") && !item.isNull("fontFamily")) {
                textView.setTypeface(Typeface.create(item.getString("fontFamily"), 0));
            }
            if (jg.a.d().g(view.getContext())) {
                view.setLayoutDirection(1);
                view.setTextDirection(4);
            } else {
                view.setLayoutDirection(0);
                view.setTextDirection(3);
            }
            return view;
        }

        @Override // android.widget.Adapter
        /* renamed from: a */
        public ReadableMap getItem(int i11) {
            ReadableArray readableArray = this.f20119d;
            if (readableArray == null) {
                return null;
            }
            return readableArray.getMap(i11);
        }

        public void c(ReadableArray readableArray) {
            this.f20119d = readableArray;
            notifyDataSetChanged();
        }

        public void d(int i11) {
            this.f20117b = i11;
            notifyDataSetChanged();
        }

        public void e(Integer num) {
            this.f20118c = num;
            notifyDataSetChanged();
        }

        @Override // android.widget.Adapter
        public int getCount() {
            ReadableArray readableArray = this.f20119d;
            if (readableArray == null) {
                return 0;
            }
            return readableArray.size();
        }

        @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
        public View getDropDownView(int i11, View view, ViewGroup viewGroup) {
            return b(i11, view, viewGroup, true);
        }

        @Override // android.widget.Adapter
        public long getItemId(int i11) {
            return i11;
        }

        @Override // android.widget.Adapter
        public View getView(int i11, View view, ViewGroup viewGroup) {
            return b(i11, view, viewGroup, false);
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Map<String, Integer> getCommandsMap() {
        return yf.c.e("focus", 1, "blur", 2);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomBubblingEventTypeConstants() {
        return yf.c.a().b("topSelect", yf.c.d("phasedRegistrationNames", yf.c.e("bubbled", "onSelect", "captured", "onSelectCapture"))).b("topFocus", yf.c.d("phasedRegistrationNames", yf.c.e("bubbled", "onFocus", "captured", "onFocusCapture"))).b("topBlur", yf.c.d("phasedRegistrationNames", yf.c.e("bubbled", "onBlur", "captured", "onBlurCapture"))).a();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Class<? extends j> getShadowNodeClass() {
        return j.class;
    }

    @ng.a(customType = "Color", name = "color")
    public void setColor(h hVar, Integer num) {
        hVar.setPrimaryColor(num);
        b bVar = (b) hVar.getAdapter();
        if (bVar != null) {
            bVar.e(num);
        }
    }

    @ng.a(name = "dropdownIconColor")
    public void setDropdownIconColor(h hVar, int i11) {
        hVar.setDropdownIconColor(i11);
    }

    @ng.a(name = "dropdownIconRippleColor")
    public void setDropdownIconRippleColor(h hVar, int i11) {
        hVar.setDropdownIconRippleColor(i11);
    }

    @ng.a(defaultBoolean = true, name = "enabled")
    public void setEnabled(h hVar, boolean z11) {
        hVar.setEnabled(z11);
    }

    @ng.a(name = "items")
    public void setItems(h hVar, ReadableArray readableArray) {
        b bVar = (b) hVar.getAdapter();
        if (bVar == null) {
            b bVar2 = new b(hVar.getContext(), readableArray);
            bVar2.e(hVar.getPrimaryColor());
            hVar.setAdapter((SpinnerAdapter) bVar2);
            return;
        }
        bVar.c(readableArray);
    }

    @ng.a(defaultInt = 1, name = "numberOfLines")
    public void setNumberOfLines(h hVar, int i11) {
        b bVar = (b) hVar.getAdapter();
        if (bVar == null) {
            b bVar2 = new b(hVar.getContext(), EMPTY_ARRAY);
            bVar2.e(hVar.getPrimaryColor());
            bVar2.d(i11);
            hVar.setAdapter((SpinnerAdapter) bVar2);
            return;
        }
        bVar.d(i11);
    }

    @ng.a(name = "prompt")
    public void setPrompt(h hVar, String str) {
        hVar.setPrompt(str);
    }

    @ng.a(name = "selected")
    public void setSelected(h hVar, int i11) {
        hVar.setStagedSelection(i11);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void updateExtraData(h hVar, Object obj) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public void addEventEmitters(n0 n0Var, h hVar) {
        a aVar = new a(hVar, ((UIManagerModule) n0Var.getNativeModule(UIManagerModule.class)).getEventDispatcher());
        hVar.setOnSelectListener(aVar);
        hVar.setOnFocusListener(aVar);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public j createShadowNodeInstance() {
        return new j();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onAfterUpdateTransaction(h hVar) {
        super.onAfterUpdateTransaction((ReactPickerManager) hVar);
        hVar.d();
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.b
    @ng.a(name = "backgroundColor")
    public void setBackgroundColor(h hVar, int i11) {
        hVar.setBackgroundColor(i11);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(h hVar, int i11, ReadableArray readableArray) {
        if (i11 == 1) {
            hVar.performClick();
        } else if (i11 != 2) {
        } else {
            hVar.clearFocus();
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(h hVar, String str, ReadableArray readableArray) {
        str.hashCode();
        if (str.equals("blur")) {
            hVar.clearFocus();
        } else if (str.equals("focus")) {
            hVar.performClick();
        }
    }
}